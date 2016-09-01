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
import com.bydan.erp.tesoreria.util.TipoBancoRetencionConstantesFunciones;

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
public class TipoBancoRetencionJInternalFrame extends TipoBancoRetencionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoBancoRetencion;
	
	protected JMenuBar jmenuBarTipoBancoRetencion;
	
	protected JMenu jmenuTipoBancoRetencion;
	protected JMenu jmenuDatosTipoBancoRetencion;
	protected JMenu jmenuArchivoTipoBancoRetencion;
	protected JMenu jmenuAccionesTipoBancoRetencion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoBancoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoBancoRetencion;	
	protected GridBagConstraints gridBagConstraintsTipoBancoRetencion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoBancoRetencionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoBancoRetencion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoBancoRetencion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoBancoRetencion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoBancoRetencionSessionBean tipobancoretencionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoBancoRetencion> tipobancoretencions;		
	public List<TipoBancoRetencion> tipobancoretencionsEliminados;	
	public List<TipoBancoRetencion> tipobancoretencionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoBancoRetencion;		
	protected JButton jButtonAbrirOrderByTipoBancoRetencion;
	
	
	//protected JPanel jPanelOrderByTipoBancoRetencion;
	//public JScrollPane jScrollPanelOrderByTipoBancoRetencion;	
	//protected JButton jButtonCerrarOrderByTipoBancoRetencion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoBancoRetencionLogic tipobancoretencionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoBancoRetencion;
	public JScrollPane jScrollPanelDatosEdicionTipoBancoRetencion;
	public JScrollPane jScrollPanelDatosGeneralTipoBancoRetencion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoBancoRetencionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoBancoRetencion;
	//public JScrollPane jScrollPanelImportacionTipoBancoRetencion;
	
	
	
	protected JPanel jPanelAccionesTipoBancoRetencion;
	
    protected JPanel jPanelPaginacionTipoBancoRetencion;
    protected JPanel jPanelParametrosReportesTipoBancoRetencion;
	protected JPanel jPanelParametrosReportesAccionesTipoBancoRetencion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoBancoRetencion;
	protected JPanel jPanelParametrosAuxiliar2TipoBancoRetencion;
	protected JPanel jPanelParametrosAuxiliar3TipoBancoRetencion;
	protected JPanel jPanelParametrosAuxiliar4TipoBancoRetencion;
	//protected JPanel jPanelParametrosAuxiliar5TipoBancoRetencion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoBancoRetencion;
	//protected JPanel jPanelImportacionTipoBancoRetencion;
	
	
	public JTable jTableDatosTipoBancoRetencion;
	
	
	
	//public JTable jTableDatosTipoBancoRetencionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoBancoRetencion;
	protected JButton jButtonDuplicarTipoBancoRetencion;
	protected JButton jButtonCopiarTipoBancoRetencion;
	protected JButton jButtonVerFormTipoBancoRetencion;
	protected JButton jButtonNuevoRelacionesTipoBancoRetencion;
	protected JButton jButtonModificarTipoBancoRetencion;
	
    protected JButton jButtonGuardarCambiosTablaTipoBancoRetencion;
	protected JButton jButtonCerrarTipoBancoRetencion;
	
	
	protected JButton jButtonRecargarInformacionTipoBancoRetencion;
	protected JButton jButtonProcesarInformacionTipoBancoRetencion;
	
	
	protected JButton jButtonAnterioresTipoBancoRetencion;
	protected JButton jButtonSiguientesTipoBancoRetencion;
	protected JButton jButtonNuevoGuardarCambiosTipoBancoRetencion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoBancoRetencion;
	//protected JButton jButtonCerrarReporteDinamicoTipoBancoRetencion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoBancoRetencion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoBancoRetencion;
	//protected JButton jButtonGenerarImportacionTipoBancoRetencion;
	//protected JButton jButtonCerrarImportacionTipoBancoRetencion;
	//protected JFileChooser jFileChooserImportacionTipoBancoRetencion;
	//protected File fileImportacionTipoBancoRetencion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoBancoRetencion;
	protected JButton jButtonDuplicarToolBarTipoBancoRetencion;
	protected JButton jButtonNuevoRelacionesToolBarTipoBancoRetencion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoBancoRetencion;
	protected JButton jButtonCopiarToolBarTipoBancoRetencion;
	protected JButton jButtonVerFormToolBarTipoBancoRetencion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoBancoRetencion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoBancoRetencion;
	protected JButton jButtonCerrarToolBarTipoBancoRetencion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoBancoRetencion;
	protected JButton jButtonProcesarInformacionToolBarTipoBancoRetencion;
	protected JButton jButtonAnterioresToolBarTipoBancoRetencion;
	protected JButton jButtonSiguientesToolBarTipoBancoRetencion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoBancoRetencion;
	protected JButton jButtonAbrirOrderByToolBarTipoBancoRetencion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoBancoRetencion;
	protected JMenuItem jMenuItemDuplicarTipoBancoRetencion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoBancoRetencion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoBancoRetencion;
	protected JMenuItem jMenuItemCopiarTipoBancoRetencion;
	protected JMenuItem jMenuItemVerFormTipoBancoRetencion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoBancoRetencion;
	protected JMenuItem jMenuItemCerrarTipoBancoRetencion;
	protected JMenuItem jMenuItemDetalleCerrarTipoBancoRetencion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoBancoRetencion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoBancoRetencion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoBancoRetencion;
	protected JMenuItem jMenuItemProcesarInformacionTipoBancoRetencion;
	protected JMenuItem jMenuItemAnterioresTipoBancoRetencion;
	protected JMenuItem jMenuItemSiguientesTipoBancoRetencion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoBancoRetencion;
	protected JMenuItem jMenuItemAbrirOrderByTipoBancoRetencion;
	protected JMenuItem jMenuItemMostrarOcultarTipoBancoRetencion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoBancoRetencion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoBancoRetencion;
	protected JCheckBox jCheckBoxSeleccionadosTipoBancoRetencion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoBancoRetencion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoBancoRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoBancoRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoBancoRetencion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoBancoRetencion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoBancoRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoBancoRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoBancoRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoBancoRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoBancoRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoBancoRetencion;
	protected JTextField jTextFieldValorCampoGeneralTipoBancoRetencion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoBancoRetencion;
	//public JList<Reporte> jListColumnasSelectReporteTipoBancoRetencion;
	//public JScrollPane jScrollColumnasSelectReporteTipoBancoRetencion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoBancoRetencion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoBancoRetencion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoBancoRetencion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoBancoRetencion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoBancoRetencion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoBancoRetencion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoBancoRetencion;
	
		
	//public JLabel jLabelArchivoImportacionTipoBancoRetencion;	
	//public JLabel jLabelPathArchivoImportacionTipoBancoRetencion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoBancoRetencion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoBancoRetencion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoBancoRetencion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoBancoRetencion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoBancoRetencion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoBancoRetencion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoBancoRetencion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoBancoRetencion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoBancoRetencion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoBancoRetencion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoBancoRetencion;
	public JPanel jPanelBusquedaPorCodigoTipoBancoRetencion;
	public JButton jButtonBusquedaPorCodigoTipoBancoRetencion;
	public JPanel jPanelBusquedaPorNombreTipoBancoRetencion;
	public JButton jButtonBusquedaPorNombreTipoBancoRetencion;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoBancoRetencion;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoBancoRetencion;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoBancoRetencion;
	public JButton jButtoncodigoBusquedaPorCodigoTipoBancoRetencionBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoBancoRetencion;
	public JLabel jLabelnombreBusquedaPorNombreTipoBancoRetencion;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoBancoRetencion;
	public JButton jButtonnombreBusquedaPorNombreTipoBancoRetencionBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoBancoRetencionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoBancoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoRetencionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBancoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoRetencionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBancoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoRetencionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoBancoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoBancoRetencion)	{
		this.jButtonRecargarInformacionTipoBancoRetencion = jButtonRecargarInformacionTipoBancoRetencion;
	}
	
	public JButton getjButtonProcesarInformacionTipoBancoRetencion() {
		return this.jButtonProcesarInformacionTipoBancoRetencion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoBancoRetencion)	{
		this.jButtonProcesarInformacionTipoBancoRetencion = jButtonProcesarInformacionTipoBancoRetencion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoBancoRetencion() {
		return this.jButtonRecargarInformacionTipoBancoRetencion;
	}
	
	
	public List<TipoBancoRetencion> gettipobancoretencions() {
		return this.tipobancoretencions;
	}

	public void settipobancoretencions(List<TipoBancoRetencion> tipobancoretencions) {
		this.tipobancoretencions = tipobancoretencions;
	}
	
	public List<TipoBancoRetencion> gettipobancoretencionsAux() {
		return this.tipobancoretencionsAux;
	}

	public void settipobancoretencionsAux(List<TipoBancoRetencion> tipobancoretencionsAux) {
		this.tipobancoretencionsAux = tipobancoretencionsAux;
	}
	
	public List<TipoBancoRetencion> gettipobancoretencionsEliminados() {
		return this.tipobancoretencionsEliminados;
	}

	public void setTipoBancoRetencionsEliminados(List<TipoBancoRetencion> tipobancoretencionsEliminados) {
		this.tipobancoretencionsEliminados = tipobancoretencionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoBancoRetencion() {
		return jComboBoxTiposSeleccionarTipoBancoRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoBancoRetencion(
			JComboBox jComboBoxTiposSeleccionarTipoBancoRetencion) {
		this.jComboBoxTiposSeleccionarTipoBancoRetencion = jComboBoxTiposSeleccionarTipoBancoRetencion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoBancoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoBancoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoBancoRetencion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoBancoRetencion() {
		return jTextFieldValorCampoGeneralTipoBancoRetencion;
	}

	public void setjTextFieldValorCampoGeneralTipoBancoRetencion(
			JTextField jTextFieldValorCampoGeneralTipoBancoRetencion) {
		this.jTextFieldValorCampoGeneralTipoBancoRetencion = jTextFieldValorCampoGeneralTipoBancoRetencion;
	}

	public void setBorderResaltarValorCampoGeneralTipoBancoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoRetencion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoBancoRetencion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoBancoRetencion() {
		return this.jCheckBoxSeleccionarTodosTipoBancoRetencion;
	}

	public void setjCheckBoxSeleccionarTodosTipoBancoRetencion(
			JCheckBox jCheckBoxSeleccionarTodosTipoBancoRetencion) {
		this.jCheckBoxSeleccionarTodosTipoBancoRetencion = jCheckBoxSeleccionarTodosTipoBancoRetencion;
	}

	public void setBorderResaltarSeleccionarTodosTipoBancoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoRetencion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoBancoRetencion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoBancoRetencion() {
		return this.jCheckBoxSeleccionadosTipoBancoRetencion;
	}

	public void setjCheckBoxSeleccionadosTipoBancoRetencion(
			JCheckBox jCheckBoxSeleccionadosTipoBancoRetencion) {
		this.jCheckBoxSeleccionadosTipoBancoRetencion = jCheckBoxSeleccionadosTipoBancoRetencion;
	}
	
	public void setBorderResaltarSeleccionadosTipoBancoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoRetencion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoBancoRetencion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoBancoRetencion() {
		return this.jComboBoxTiposArchivosReportesTipoBancoRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoBancoRetencion(
			JComboBox jComboBoxTiposArchivosReportesTipoBancoRetencion) {
		this.jComboBoxTiposArchivosReportesTipoBancoRetencion = jComboBoxTiposArchivosReportesTipoBancoRetencion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoBancoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoBancoRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoBancoRetencion() {
		return this.jComboBoxTiposReportesTipoBancoRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoBancoRetencion(
			JComboBox jComboBoxTiposReportesTipoBancoRetencion) {
		this.jComboBoxTiposReportesTipoBancoRetencion = jComboBoxTiposReportesTipoBancoRetencion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoBancoRetencion() {
	//	return jComboBoxTiposReportesDinamicoTipoBancoRetencion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoBancoRetencion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoBancoRetencion) {
	//	this.jComboBoxTiposReportesDinamicoTipoBancoRetencion = jComboBoxTiposReportesDinamicoTipoBancoRetencion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoBancoRetencion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoBancoRetencion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoBancoRetencion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoBancoRetencion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoBancoRetencion = jComboBoxTiposArchivosReportesDinamicoTipoBancoRetencion;
	//}
	
	public void setBorderResaltarTiposReportesTipoBancoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoBancoRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoBancoRetencion() {
		return this.jComboBoxTiposGraficosReportesTipoBancoRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoBancoRetencion(
			JComboBox jComboBoxTiposGraficosReportesTipoBancoRetencion) {
		this.jComboBoxTiposGraficosReportesTipoBancoRetencion = jComboBoxTiposGraficosReportesTipoBancoRetencion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoBancoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoBancoRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoBancoRetencion() {
		return this.jComboBoxTiposPaginacionTipoBancoRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoBancoRetencion(
			JComboBox jComboBoxTiposPaginacionTipoBancoRetencion) {
		this.jComboBoxTiposPaginacionTipoBancoRetencion = jComboBoxTiposPaginacionTipoBancoRetencion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoBancoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoBancoRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoBancoRetencion() {
		return this.jComboBoxTiposRelacionesTipoBancoRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoBancoRetencion() {
		return this.jComboBoxTiposAccionesTipoBancoRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoBancoRetencion(
			JComboBox jComboBoxTiposRelacionesTipoBancoRetencion) {
		this.jComboBoxTiposRelacionesTipoBancoRetencion = jComboBoxTiposRelacionesTipoBancoRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoBancoRetencion(
			JComboBox jComboBoxTiposAccionesTipoBancoRetencion) {
		this.jComboBoxTiposAccionesTipoBancoRetencion = jComboBoxTiposAccionesTipoBancoRetencion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoBancoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoBancoRetencion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoBancoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoBancoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoBancoRetencion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoBancoRetencion() {
	//	return jCheckBoxConGraficoDinamicoTipoBancoRetencion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoBancoRetencion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoBancoRetencion) {
	//	this.jCheckBoxConGraficoDinamicoTipoBancoRetencion = jCheckBoxConGraficoDinamicoTipoBancoRetencion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoBancoRetencion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoBancoRetencion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoBancoRetencion .setBorder(borderResaltar);		
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
		this.tipobancoretencionSessionBean=new TipoBancoRetencionSessionBean();
		
		this.tipobancoretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipobancoretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipobancoretencionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoBancoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoBancoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoBancoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoBancoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoBancoRetencionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Banco Retencion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoBancoRetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoBancoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoBancoRetencion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoBancoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoBancoRetencion,this.jTtoolBarTipoBancoRetencion,
							"nuevo","nuevo","Nuevo"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoBancoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoBancoRetencion,this.jTtoolBarTipoBancoRetencion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoBancoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoBancoRetencion,this.jTtoolBarTipoBancoRetencion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoBancoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoBancoRetencion,this.jTtoolBarTipoBancoRetencion,
							"duplicar","duplicar","Duplicar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoBancoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoBancoRetencion,this.jTtoolBarTipoBancoRetencion,
							"copiar","copiar","Copiar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoBancoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoBancoRetencion,this.jTtoolBarTipoBancoRetencion,
							"ver_form","ver_form","Ver"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoBancoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoBancoRetencion,this.jTtoolBarTipoBancoRetencion,
							"recargar","recargar","Recargar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoBancoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoBancoRetencion,this.jTtoolBarTipoBancoRetencion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoBancoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoBancoRetencion,this.jTtoolBarTipoBancoRetencion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoBancoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoBancoRetencion,this.jTtoolBarTipoBancoRetencion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoBancoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoBancoRetencion,this.jTtoolBarTipoBancoRetencion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoBancoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoBancoRetencion,this.jTtoolBarTipoBancoRetencion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoBancoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoBancoRetencion,this.jTtoolBarTipoBancoRetencion,
							"cerrar","cerrar","Salir"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoBancoRetencion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoBancoRetencion;
			
				this.jButtonProcesarInformacionToolBarTipoBancoRetencion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoBancoRetencion;
				
		//protected JButton jButtonModificarToolBarTipoBancoRetencion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoBancoRetencion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoBancoRetencion=new JMenuMe("General");
		this.jmenuArchivoTipoBancoRetencion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoBancoRetencion=new JMenuMe("Acciones");
		this.jmenuDatosTipoBancoRetencion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoBancoRetencion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoBancoRetencion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoBancoRetencion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoBancoRetencion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoBancoRetencion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoBancoRetencion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoBancoRetencion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoBancoRetencion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoBancoRetencion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoBancoRetencion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoBancoRetencion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoBancoRetencion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoBancoRetencion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoBancoRetencion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoBancoRetencion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoBancoRetencion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoBancoRetencion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoBancoRetencion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoBancoRetencion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoBancoRetencion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoBancoRetencion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoBancoRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoBancoRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoBancoRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoBancoRetencion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoBancoRetencion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoBancoRetencion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoBancoRetencion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoBancoRetencion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoBancoRetencion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoBancoRetencion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoBancoRetencion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoBancoRetencion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoBancoRetencion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoBancoRetencion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoBancoRetencion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoBancoRetencion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoBancoRetencion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoBancoRetencion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoBancoRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoBancoRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoBancoRetencion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoBancoRetencion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoBancoRetencion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoBancoRetencion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoBancoRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoBancoRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoBancoRetencion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoBancoRetencion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoBancoRetencion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoBancoRetencion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoBancoRetencion.add(this.jMenuItemCerrarTipoBancoRetencion);
			
			this.jmenuAccionesTipoBancoRetencion.add(this.jMenuItemNuevoTipoBancoRetencion);
			this.jmenuAccionesTipoBancoRetencion.add(this.jMenuItemNuevoGuardarCambiosTipoBancoRetencion);
			this.jmenuAccionesTipoBancoRetencion.add(this.jMenuItemNuevoRelacionesTipoBancoRetencion);
			this.jmenuAccionesTipoBancoRetencion.add(this.jMenuItemGuardarCambiosTablaTipoBancoRetencion);		
			this.jmenuAccionesTipoBancoRetencion.add(this.jMenuItemDuplicarTipoBancoRetencion);		
			this.jmenuAccionesTipoBancoRetencion.add(this.jMenuItemCopiarTipoBancoRetencion);		
			this.jmenuAccionesTipoBancoRetencion.add(this.jMenuItemVerFormTipoBancoRetencion);		
			
			this.jmenuDatosTipoBancoRetencion.add(this.jMenuItemRecargarInformacionTipoBancoRetencion);				
			this.jmenuDatosTipoBancoRetencion.add(this.jMenuItemAnterioresTipoBancoRetencion);				
			this.jmenuDatosTipoBancoRetencion.add(this.jMenuItemSiguientesTipoBancoRetencion);				
			this.jmenuDatosTipoBancoRetencion.add(this.jMenuItemAbrirOrderByTipoBancoRetencion);				
			this.jmenuDatosTipoBancoRetencion.add(this.jMenuItemMostrarOcultarTipoBancoRetencion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoBancoRetencion.add(this.jMenuItemGuardarCambiosTipoBancoRetencion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoBancoRetencion.add(this.jmenuArchivoTipoBancoRetencion);		
			this.jmenuBarTipoBancoRetencion.add(this.jmenuAccionesTipoBancoRetencion);		
			this.jmenuBarTipoBancoRetencion.add(this.jmenuDatosTipoBancoRetencion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoBancoRetencion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoBancoRetencion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoBancoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoBancoRetencion.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoBancoRetencion= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoBancoRetencion.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoBancoRetencion.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoBancoRetencion,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoBancoRetencion = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoBancoRetencion.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoBancoRetencion.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoBancoRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoBancoRetencion= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoBancoRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoBancoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoBancoRetencion.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoBancoRetencion= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoBancoRetencion.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoBancoRetencion.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoBancoRetencion,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoBancoRetencion = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoBancoRetencion.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoBancoRetencion.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoBancoRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoBancoRetencion= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoBancoRetencion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoBancoRetencion=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoBancoRetencion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoBancoRetencion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoBancoRetencion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoBancoRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoBancoRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoBancoRetencion = new TipoBancoRetencionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Banco Retencion DATOS");
			this.jInternalFrameDetalleFormTipoBancoRetencion = new TipoBancoRetencionDetalleFormJInternalFrame(jDesktopPane,this.tipobancoretencionSessionBean.getConGuardarRelaciones(),this.tipobancoretencionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoBancoRetencion = null;//new TipoBancoRetencionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoBancoRetencion= new GridBagLayout();
		
		
		this.jTableDatosTipoBancoRetencion = new JTableMe();      
		
		String sToolTipTipoBancoRetencion="";
		sToolTipTipoBancoRetencion=TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoBancoRetencion+="(Tesoreria.TipoBancoRetencion)";
		}
		
		if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoBancoRetencion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoBancoRetencion.setToolTipText(sToolTipTipoBancoRetencion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoBancoRetencion);
		this.jTableDatosTipoBancoRetencion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoBancoRetencion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoBancoRetencion.setRowSelectionAllowed(true);
		this.jTableDatosTipoBancoRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoBancoRetencion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoBancoRetencion = new JButtonMe();
		this.jButtonDuplicarTipoBancoRetencion = new JButtonMe();
		this.jButtonCopiarTipoBancoRetencion = new JButtonMe();
		this.jButtonVerFormTipoBancoRetencion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoBancoRetencion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoBancoRetencion = new JButtonMe();
		this.jButtonCerrarTipoBancoRetencion = new JButtonMe();
		
		this.jScrollPanelDatosTipoBancoRetencion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoBancoRetencion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoBancoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Banco Retencion";
		
		if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Retenciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoBancoRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoBancoRetencion.setToolTipText("Acciones");
        this.jPanelAccionesTipoBancoRetencion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoBancoRetencion=new ReporteDinamicoJInternalFrame(TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoBancoRetencion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoBancoRetencion=new ImportacionJInternalFrame(TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoBancoRetencion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoBancoRetencion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoBancoRetencion.setText("Orden");
		this.jButtonAbrirOrderByTipoBancoRetencion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoBancoRetencion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoBancoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoBancoRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBancoRetencion,false,this);
			
			//this.cargarOrderByTipoBancoRetencion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoBancoRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBancoRetencion,true,this);
			
			//this.cargarOrderByTipoBancoRetencion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoBancoRetencion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoBancoRetencion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoBancoRetencion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoBancoRetencion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoBancoRetencion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoBancoRetencion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoBancoRetencion.setText("Nuevo");
		this.jButtonDuplicarTipoBancoRetencion.setText("Duplicar");
		this.jButtonCopiarTipoBancoRetencion.setText("Copiar");
		this.jButtonVerFormTipoBancoRetencion.setText("Ver");
		this.jButtonNuevoRelacionesTipoBancoRetencion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoBancoRetencion.setText("Guardar");
		this.jButtonCerrarTipoBancoRetencion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoBancoRetencion,"nuevo_button","Nuevo",this.tipobancoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoBancoRetencion,"duplicar_button","Duplicar",this.tipobancoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoBancoRetencion,"copiar_button","Copiar",this.tipobancoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoBancoRetencion,"ver_form","Ver",this.tipobancoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoBancoRetencion,"nuevorelaciones_button","Nuevo Rel",this.tipobancoretencionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoBancoRetencion,"guardarcambiostabla_button","Guardar",this.tipobancoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoBancoRetencion,"cerrar_button","Salir",this.tipobancoretencionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoBancoRetencion.setToolTipText("Nuevo"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoBancoRetencion.setToolTipText("Duplicar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoBancoRetencion.setToolTipText("Copiar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoBancoRetencion.setToolTipText("Ver"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoBancoRetencion.setToolTipText("Nuevo Rel"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoBancoRetencion.setToolTipText("Guardar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoBancoRetencion.setToolTipText("Salir"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoBancoRetencion";
		inputMap = this.jButtonNuevoTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoBancoRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoBancoRetencion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoBancoRetencion";
		inputMap = this.jButtonDuplicarTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoBancoRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoBancoRetencion"));
		
		//COPIAR
		sMapKey = "CopiarTipoBancoRetencion";
		inputMap = this.jButtonCopiarTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoBancoRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoBancoRetencion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoBancoRetencion";
		inputMap = this.jButtonVerFormTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoBancoRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoBancoRetencion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoBancoRetencion";
		inputMap = this.jButtonNuevoRelacionesTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoBancoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoBancoRetencion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoBancoRetencion";
		inputMap = this.jButtonModificarTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoBancoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoBancoRetencion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoBancoRetencion";
		inputMap = this.jButtonCerrarTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoBancoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoBancoRetencion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoBancoRetencion";
		inputMap = this.jButtonGuardarCambiosTablaTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoBancoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoBancoRetencion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoBancoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoBancoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoBancoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoBancoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoBancoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoBancoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoBancoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoBancoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoBancoRetencion.setName("jPanelParametrosReportesTipoBancoRetencion"); 
		
		this.jPanelParametrosReportesAccionesTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoBancoRetencion.setName("jPanelParametrosReportesAccionesTipoBancoRetencion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoBancoRetencion = new JButtonMe();
		this.jButtonRecargarInformacionTipoBancoRetencion.setText("Recargar");
		this.jButtonRecargarInformacionTipoBancoRetencion.setToolTipText("Recargar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoBancoRetencion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoBancoRetencion = new JButtonMe();
		this.jButtonProcesarInformacionTipoBancoRetencion.setText("Procesar");
		this.jButtonProcesarInformacionTipoBancoRetencion.setToolTipText("Procesar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoBancoRetencion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoBancoRetencion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoBancoRetencion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoBancoRetencion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoBancoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoBancoRetencion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoBancoRetencion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoBancoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoBancoRetencion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoBancoRetencion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoBancoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoBancoRetencion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoBancoRetencion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoBancoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoBancoRetencion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoBancoRetencion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoBancoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoBancoRetencion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoBancoRetencion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoBancoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoBancoRetencion.setText("Accion");
		this.jComboBoxTiposAccionesTipoBancoRetencion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoBancoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoBancoRetencion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoBancoRetencion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoBancoRetencion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoBancoRetencion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoBancoRetencion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoBancoRetencion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoBancoRetencion = new JLabelMe();
		
		this.jLabelAccionesTipoBancoRetencion.setText("Acciones");		
		this.jLabelAccionesTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoBancoRetencion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoBancoRetencion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoBancoRetencion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoBancoRetencion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoBancoRetencion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoBancoRetencion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoBancoRetencion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoBancoRetencion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoBancoRetencion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoBancoRetencion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoBancoRetencion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoBancoRetencion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoBancoRetencion = new JButtonMe();
		//this.jButtonAnterioresTipoBancoRetencion.setText("<<");
        this.jButtonAnterioresTipoBancoRetencion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoBancoRetencion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoBancoRetencion = new JButtonMe();
		//this.jButtonSiguientesTipoBancoRetencion.setText(">>");
        this.jButtonSiguientesTipoBancoRetencion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoBancoRetencion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoBancoRetencion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoBancoRetencion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoBancoRetencion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoBancoRetencion,"nuevoguardarcambios_button","Nue",this.tipobancoretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoBancoRetencion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoBancoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoBancoRetencion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoBancoRetencion";
		inputMap = this.jButtonRecargarInformacionTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoBancoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoBancoRetencion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoBancoRetencion";
		inputMap = this.jButtonSiguientesTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoBancoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoBancoRetencion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoBancoRetencion";
		inputMap = this.jButtonAnterioresTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoBancoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoBancoRetencion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoBancoRetencion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoBancoRetencion.setMinimumSize(new Dimension(this.getWidth(),TipoBancoRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoBancoRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoBancoRetencion.setMaximumSize(new Dimension(this.getWidth(),TipoBancoRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoBancoRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoBancoRetencion.setPreferredSize(new Dimension(this.getWidth(),TipoBancoRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoBancoRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoBancoRetencion = new GridBagLayout();

			this.jPanelPaginacionTipoBancoRetencion.setLayout(gridaBagLayoutPaginacionTipoBancoRetencion);						
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
			this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoBancoRetencion.add(this.jButtonAnterioresTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
					
						
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
			
			this.jPanelPaginacionTipoBancoRetencion.add(this.jButtonNuevoGuardarCambiosTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
						
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
			this.jPanelPaginacionTipoBancoRetencion.add(this.jButtonSiguientesTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoRetencion.gridy = 1;
			this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBancoRetencion.add(this.jButtonNuevoTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
						
			
			
			if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
				this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoBancoRetencion.gridy = 1;
				this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoBancoRetencion.add(this.jButtonGuardarCambiosTablaTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
			}
			
			
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoRetencion.gridy = 1;
			this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBancoRetencion.add(this.jButtonDuplicarTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoRetencion.gridy = 1;
			this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBancoRetencion.add(this.jButtonCopiarTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoRetencion.gridy = 1;
			this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoBancoRetencion.add(this.jButtonVerFormTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoRetencion.gridy = 1;
			this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoBancoRetencion.add(this.jButtonCerrarTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		
		
		
		this.jButtonRecargarInformacionTipoBancoRetencion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoBancoRetencion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoBancoRetencion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoBancoRetencion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoBancoRetencion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoBancoRetencion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoBancoRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoBancoRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoBancoRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoBancoRetencion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoBancoRetencion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoBancoRetencion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoBancoRetencion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoBancoRetencion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoBancoRetencion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoBancoRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoBancoRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoBancoRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoBancoRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBancoRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBancoRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoBancoRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoBancoRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoBancoRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoBancoRetencion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoBancoRetencion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoBancoRetencion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoBancoRetencion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoBancoRetencion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoBancoRetencion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoBancoRetencion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoBancoRetencion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoBancoRetencion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoBancoRetencion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoBancoRetencion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoBancoRetencion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoBancoRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoBancoRetencion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoBancoRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoBancoRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoBancoRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoBancoRetencion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoBancoRetencion.setLayout(gridaBagParametrosReportesTipoBancoRetencion);
			this.jPanelParametrosReportesAccionesTipoBancoRetencion.setLayout(gridaBagParametrosReportesAccionesTipoBancoRetencion);
			
			
			this.jPanelParametrosAuxiliar1TipoBancoRetencion.setLayout(gridaBagParametrosAuxiliar1TipoBancoRetencion);
			this.jPanelParametrosAuxiliar2TipoBancoRetencion.setLayout(gridaBagParametrosAuxiliar2TipoBancoRetencion);
			this.jPanelParametrosAuxiliar3TipoBancoRetencion.setLayout(gridaBagParametrosAuxiliar3TipoBancoRetencion);
			this.jPanelParametrosAuxiliar4TipoBancoRetencion.setLayout(gridaBagParametrosAuxiliar4TipoBancoRetencion);
			//this.jPanelParametrosAuxiliar5TipoBancoRetencion.setLayout(gridaBagParametrosAuxiliar2TipoBancoRetencion);			
			
			
			
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBancoRetencion.add(this.jButtonRecargarInformacionTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoBancoRetencion.add(this.jComboBoxTiposPaginacionTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoBancoRetencion.add(this.jCheckBoxConAltoMaximoTablaTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoBancoRetencion.add(this.jComboBoxTiposArchivosReportesTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBancoRetencion.add(this.jPanelParametrosAuxiliar1TipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoBancoRetencion.add(this.jComboBoxTiposReportesTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBancoRetencion.add(this.jPanelParametrosAuxiliar4TipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoRetencion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBancoRetencion.add(this.jComboBoxTiposReportesTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoRetencion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoBancoRetencion.add(this.jCheckBoxGenerarReporteTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBancoRetencion.add(this.jPanelParametrosAuxiliar2TipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoBancoRetencion.add(this.jLabelAccionesTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
				this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoBancoRetencion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoBancoRetencion.add(this.jButtonAbrirOrderByTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBancoRetencion.add(this.jComboBoxTiposSeleccionarTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);			
			
			
			/*
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoBancoRetencion.add(this.jCheckBoxSeleccionarTodosTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoBancoRetencion.add(this.jCheckBoxSeleccionarTodosTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);															
				
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoBancoRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoBancoRetencion.add(this.jCheckBoxSeleccionadosTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoBancoRetencion.add(this.jPanelParametrosAuxiliar3TipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBancoRetencion.add(this.jComboBoxTiposAccionesTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
	
				
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoBancoRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoBancoRetencion.add(this.jTextFieldValorCampoGeneralTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoBancoRetencion = new GridBagLayout();

			this.jScrollPanelDatosTipoBancoRetencion.setLayout(gridaBagLayoutDatosTipoBancoRetencion);
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
			this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
			
			this.jScrollPanelDatosTipoBancoRetencion.add(this.jTableDatosTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoBancoRetencion.setViewportView(this.jTableDatosTipoBancoRetencion);
		this.jTableDatosTipoBancoRetencion.setFillsViewportHeight(true);
		this.jTableDatosTipoBancoRetencion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoBancoRetencion= new GridBagLayout();
		this.jPanelAccionesTipoBancoRetencion.setLayout(gridaBagLayoutAccionesTipoBancoRetencion);
		
		
		/*	
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = 0;
		this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
			
		this.jPanelAccionesTipoBancoRetencion.add(this.jButtonNuevoTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoBancoRetencion= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoBancoRetencion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoBancoRetencion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoBancoRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoBancoRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoBancoRetencion.setLayout(gridaBagLayoutBusquedaPorCodigoTipoBancoRetencion);

		gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoBancoRetencion.gridy = 0;
		gridBagConstraintsTipoBancoRetencion.gridx = 0;
		jPanelBusquedaPorCodigoTipoBancoRetencion.add(jLabelcodigoBusquedaPorCodigoTipoBancoRetencion, gridBagConstraintsTipoBancoRetencion);

		gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoBancoRetencion.gridy = 0;
		gridBagConstraintsTipoBancoRetencion.gridx = 1;
		jPanelBusquedaPorCodigoTipoBancoRetencion.add(jTextFieldcodigoBusquedaPorCodigoTipoBancoRetencion, gridBagConstraintsTipoBancoRetencion);

		gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoBancoRetencion.gridy = 1;
		gridBagConstraintsTipoBancoRetencion.gridx =1;
		jPanelBusquedaPorCodigoTipoBancoRetencion.add(jButtonBusquedaPorCodigoTipoBancoRetencion, gridBagConstraintsTipoBancoRetencion);

		jTabbedPaneBusquedasTipoBancoRetencion.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoBancoRetencion);
		jTabbedPaneBusquedasTipoBancoRetencion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoBancoRetencion= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoBancoRetencion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoBancoRetencion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoBancoRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoBancoRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoBancoRetencion.setLayout(gridaBagLayoutBusquedaPorNombreTipoBancoRetencion);

		gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoBancoRetencion.gridy = 0;
		gridBagConstraintsTipoBancoRetencion.gridx = 0;
		jPanelBusquedaPorNombreTipoBancoRetencion.add(jLabelnombreBusquedaPorNombreTipoBancoRetencion, gridBagConstraintsTipoBancoRetencion);

		gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoBancoRetencion.gridy = 0;
		gridBagConstraintsTipoBancoRetencion.gridx = 1;
		jPanelBusquedaPorNombreTipoBancoRetencion.add(jTextAreanombreBusquedaPorNombreTipoBancoRetencion, gridBagConstraintsTipoBancoRetencion);

		gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoBancoRetencion.gridy = 1;
		gridBagConstraintsTipoBancoRetencion.gridx =1;
		jPanelBusquedaPorNombreTipoBancoRetencion.add(jButtonBusquedaPorNombreTipoBancoRetencion, gridBagConstraintsTipoBancoRetencion);

		jTabbedPaneBusquedasTipoBancoRetencion.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoBancoRetencion);
		jTabbedPaneBusquedasTipoBancoRetencion.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoBancoRetencion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoBancoRetencion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();						
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoBancoRetencion.gridx = 0;		
			//this.gridBagConstraintsTipoBancoRetencion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoBancoRetencion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoBancoRetencion.gridx = 0;		
		//this.gridBagConstraintsTipoBancoRetencion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoBancoRetencion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoBancoRetencion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoBancoRetencion.gridx = 0;		
			this.gridBagConstraintsTipoBancoRetencion.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoRetencion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoBancoRetencion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);								
		
		
		/*
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		*/		
		
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoBancoRetencion.gridx =0;
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoBancoRetencion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
				
		
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoBancoRetencionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoBancoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoBancoRetencion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoBancoRetencion.setLayout(gridaBagLayoutBusquedasParametrosTipoBancoRetencion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoBancoRetencion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoBancoRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBancoRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBancoRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
			
			
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		
			
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoBancoRetencion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoBancoRetencion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoBancoRetencion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoBancoRetencion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoBancoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoBancoRetencion.setName("jPanelReporteDinamicoTipoBancoRetencion"); 
		
		this.jPanelReporteDinamicoTipoBancoRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoBancoRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoBancoRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoBancoRetencion.setLayout(gridaBagLayoutReporteDinamicoTipoBancoRetencion);
		
		
		this.jInternalFrameReporteDinamicoTipoBancoRetencion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoBancoRetencion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoBancoRetencion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoBancoRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoBancoRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoBancoRetencion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoBancoRetencion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoBancoRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoBancoRetencion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoBancoRetencion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoBancoRetencion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoBancoRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoBancoRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoBancoRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Retenciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoBancoRetencion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoBancoRetencion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoBancoRetencion.add(this.jLabelColumnasSelectReporteTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoBancoRetencion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoBancoRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoBancoRetencion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoBancoRetencion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoBancoRetencion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoBancoRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoBancoRetencion=new JScrollPane(this.jListColumnasSelectReporteTipoBancoRetencion);
			
			this.jScrollColumnasSelectReporteTipoBancoRetencion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoBancoRetencion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoBancoRetencion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoBancoRetencion.add(this.jListColumnasSelectReporteTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		this.jPanelReporteDinamicoTipoBancoRetencion.add(this.jScrollColumnasSelectReporteTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoBancoRetencion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoBancoRetencion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoBancoRetencion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoBancoRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoBancoRetencion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoBancoRetencion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoBancoRetencion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoBancoRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoBancoRetencion=new JScrollPane(this.jListRelacionesSelectReporteTipoBancoRetencion);
			
			this.jScrollRelacionesSelectReporteTipoBancoRetencion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoBancoRetencion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoBancoRetencion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoBancoRetencion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoBancoRetencion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoBancoRetencion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoBancoRetencion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoBancoRetencion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoBancoRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoBancoRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoBancoRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoBancoRetencion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoBancoRetencion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoBancoRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoBancoRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoBancoRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoBancoRetencion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoBancoRetencion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoBancoRetencion.add(this.jLabelGenerarExcelReporteDinamicoTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoBancoRetencion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoBancoRetencion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoBancoRetencion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoBancoRetencion.setToolTipText("Generar EXCEL"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoBancoRetencion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoBancoRetencion.add(this.jButtonGenerarExcelReporteDinamicoTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBancoRetencion.add(this.jComboBoxTiposReportesDinamicoTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoBancoRetencion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoBancoRetencion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoBancoRetencion.add(this.jLabelTiposArchivoReporteDinamicoTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBancoRetencion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoBancoRetencion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoBancoRetencion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoBancoRetencion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoBancoRetencion.setToolTipText("Generar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBancoRetencion.add(this.jButtonGenerarReporteDinamicoTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoBancoRetencion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoBancoRetencion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoBancoRetencion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoBancoRetencion.setToolTipText("Cancelar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoBancoRetencion.add(this.jButtonCerrarReporteDinamicoTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoBancoRetencion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoBancoRetencion= new JScrollPane(jPanelReporteDinamicoTipoBancoRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoBancoRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoBancoRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoBancoRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Retenciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoBancoRetencion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoBancoRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoBancoRetencion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoBancoRetencion);
		this.jInternalFrameReporteDinamicoTipoBancoRetencion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoBancoRetencion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoBancoRetencion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoBancoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoBancoRetencion.setName("jPanelImportacionTipoBancoRetencion"); 
		
		this.jPanelImportacionTipoBancoRetencion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoBancoRetencion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoBancoRetencion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoBancoRetencion.setLayout(gridaBagLayoutImportacionTipoBancoRetencion);
		
		
		this.jInternalFrameImportacionTipoBancoRetencion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoBancoRetencion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoBancoRetencion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoBancoRetencion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoBancoRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoBancoRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoBancoRetencion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoBancoRetencion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoBancoRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoBancoRetencion.setResizable(true);
	    this.jInternalFrameImportacionTipoBancoRetencion.setClosable(true);
	    this.jInternalFrameImportacionTipoBancoRetencion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoBancoRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoBancoRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoBancoRetencion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoBancoRetencion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoBancoRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoBancoRetencion.setResizable(true);
	    this.jInternalFrameImportacionTipoBancoRetencion.setClosable(true);
	    this.jInternalFrameImportacionTipoBancoRetencion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoBancoRetencion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoBancoRetencion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoBancoRetencion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Retenciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoBancoRetencion = new JLabelMe();

		this.jLabelArchivoImportacionTipoBancoRetencion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoBancoRetencion.add(this.jLabelArchivoImportacionTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoBancoRetencion = new JFileChooser();		
		this.jFileChooserImportacionTipoBancoRetencion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoBancoRetencion = new JButtonMe();
		this.jButtonAbrirImportacionTipoBancoRetencion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoBancoRetencion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoBancoRetencion.setToolTipText("Generar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBancoRetencion.add(this.jButtonAbrirImportacionTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoBancoRetencion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoBancoRetencion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoBancoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoBancoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoBancoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoBancoRetencion.add(this.jLabelPathArchivoImportacionTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoBancoRetencion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoBancoRetencion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoBancoRetencion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoBancoRetencion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBancoRetencion.add(this.jTextFieldPathArchivoImportacionTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoBancoRetencion = new JButtonMe();
		this.jButtonGenerarImportacionTipoBancoRetencion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoBancoRetencion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoBancoRetencion.setToolTipText("Generar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBancoRetencion.add(this.jButtonGenerarImportacionTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoBancoRetencion = new JButtonMe();
		this.jButtonCerrarImportacionTipoBancoRetencion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoBancoRetencion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoBancoRetencion.setToolTipText("Cancelar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBancoRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoBancoRetencion.add(this.jButtonCerrarImportacionTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoBancoRetencion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoBancoRetencion= new JScrollPane(jPanelImportacionTipoBancoRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoBancoRetencion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoBancoRetencion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoBancoRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoBancoRetencion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoBancoRetencion);
		this.jInternalFrameImportacionTipoBancoRetencion.getContentPane().add(this.jScrollPanelImportacionTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoBancoRetencion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoBancoRetencion = new JButtonMe();
			this.jButtonAbrirOrderByTipoBancoRetencion.setText("Orden");
			this.jButtonAbrirOrderByTipoBancoRetencion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoBancoRetencion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoBancoRetencion";
			inputMap = this.jButtonAbrirOrderByTipoBancoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoBancoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoBancoRetencion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoBancoRetencion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoBancoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoBancoRetencion.setName("jPanelOrderByTipoBancoRetencion"); 
			
			this.jPanelOrderByTipoBancoRetencion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoBancoRetencion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoBancoRetencion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoBancoRetencion.setLayout(gridaBagLayoutOrderByTipoBancoRetencion);
			
			
			this.jTableDatosTipoBancoRetencionOrderBy = new JTableMe();        
			this.jTableDatosTipoBancoRetencionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoBancoRetencionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoBancoRetencionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoBancoRetencionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoBancoRetencionOrderBy.setViewportView(this.jTableDatosTipoBancoRetencionOrderBy);
			this.jTableDatosTipoBancoRetencionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoBancoRetencionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoBancoRetencion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoBancoRetencion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoBancoRetencion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoBancoRetencion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoBancoRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoBancoRetencion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoBancoRetencion.setTitle("Orden");
			this.jInternalFrameOrderByTipoBancoRetencion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoBancoRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoBancoRetencion.setResizable(true);
			this.jInternalFrameOrderByTipoBancoRetencion.setClosable(true);
			this.jInternalFrameOrderByTipoBancoRetencion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoBancoRetencion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoBancoRetencion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoBancoRetencion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoBancoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Banco Retenciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoBancoRetencion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoBancoRetencion.ipady =150;
				
			this.jPanelOrderByTipoBancoRetencion.add(jScrollPanelDatosTipoBancoRetencionOrderBy, this.gridBagConstraintsTipoBancoRetencion);//this.jTableDatosTipoBancoRetencionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoBancoRetencion = new JButtonMe();
			this.jButtonCerrarOrderByTipoBancoRetencion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoBancoRetencion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoBancoRetencion.setToolTipText("Cancelar"+" "+TipoBancoRetencionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoBancoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBancoRetencion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoBancoRetencion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoBancoRetencion.add(this.jButtonCerrarOrderByTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoBancoRetencion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoBancoRetencion= new JScrollPane(jPanelOrderByTipoBancoRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoBancoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoBancoRetencion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoBancoRetencion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoBancoRetencion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoBancoRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoBancoRetencion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoBancoRetencion);
			
			this.jInternalFrameOrderByTipoBancoRetencion.getContentPane().add(this.jScrollPanelOrderByTipoBancoRetencion, this.gridBagConstraintsTipoBancoRetencion);			
		
		} else {
			this.jButtonAbrirOrderByTipoBancoRetencion = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipobancoretencionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoBancoRetencion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoBancoRetencion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoBancoRetencion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoBancoRetencion.getRowHeight();//TipoBancoRetencionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoBancoRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoBancoRetencion.isSelected()) {
					iHeightTable=TipoBancoRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoBancoRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoBancoRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoBancoRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoBancoRetencion.isSelected()) {
					iHeightTable=TipoBancoRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoBancoRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoBancoRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoBancoRetencion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoBancoRetencion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoBancoRetencion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoBancoRetencion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoBancoRetencion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoBancoRetencion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoBancoRetencion!=null && this.jInternalFrameOrderByTipoBancoRetencion.getjTableDatosOrderBy()!=null) {
			//if(!this.tipobancoretencionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoBancoRetencion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoBancoRetencion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoBancoRetencion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoBancoRetencion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoBancoRetencion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoBancoRetencion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoBancoRetencion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoBancoRetencion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoBancoRetencion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoBancoRetencion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipobancoretencionLogic.getTipoBancoRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipobancoretencions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoBancoRetencion> TraerTipoBancoRetencionBeans(List<TipoBancoRetencion> tipobancoretencions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoBancoRetencion tipobancoretencion:tipobancoretencions) {
					
				if(!(TipoBancoRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoBancoRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipobancoretencion.setsDetalleGeneralEntityReporte(TipoBancoRetencionConstantesFunciones.getTipoBancoRetencionDescripcion(tipobancoretencion));
										
						
					
						
					
				} else  {
							
					//tipobancoretencion.setsDetalleGeneralEntityReporte(tipobancoretencion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipobancoretencionbeans.add(tipobancoretencionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipobancoretencions;
    }
	//PARA REPORTES FIN
}
