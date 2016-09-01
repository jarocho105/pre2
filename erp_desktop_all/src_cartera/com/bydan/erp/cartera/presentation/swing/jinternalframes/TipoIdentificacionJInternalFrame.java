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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.cartera.util.TipoIdentificacionConstantesFunciones;

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
public class TipoIdentificacionJInternalFrame extends TipoIdentificacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoIdentificacion;
	
	protected JMenuBar jmenuBarTipoIdentificacion;
	
	protected JMenu jmenuTipoIdentificacion;
	protected JMenu jmenuDatosTipoIdentificacion;
	protected JMenu jmenuArchivoTipoIdentificacion;
	protected JMenu jmenuAccionesTipoIdentificacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoIdentificacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoIdentificacion;	
	protected GridBagConstraints gridBagConstraintsTipoIdentificacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoIdentificacionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoIdentificacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoIdentificacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoIdentificacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoIdentificacionSessionBean tipoidentificacionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoIdentificacion> tipoidentificacions;		
	public List<TipoIdentificacion> tipoidentificacionsEliminados;	
	public List<TipoIdentificacion> tipoidentificacionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoIdentificacion;		
	protected JButton jButtonAbrirOrderByTipoIdentificacion;
	
	
	//protected JPanel jPanelOrderByTipoIdentificacion;
	//public JScrollPane jScrollPanelOrderByTipoIdentificacion;	
	//protected JButton jButtonCerrarOrderByTipoIdentificacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoIdentificacionLogic tipoidentificacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoIdentificacion;
	public JScrollPane jScrollPanelDatosEdicionTipoIdentificacion;
	public JScrollPane jScrollPanelDatosGeneralTipoIdentificacion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoIdentificacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoIdentificacion;
	//public JScrollPane jScrollPanelImportacionTipoIdentificacion;
	
	
	
	protected JPanel jPanelAccionesTipoIdentificacion;
	
    protected JPanel jPanelPaginacionTipoIdentificacion;
    protected JPanel jPanelParametrosReportesTipoIdentificacion;
	protected JPanel jPanelParametrosReportesAccionesTipoIdentificacion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoIdentificacion;
	protected JPanel jPanelParametrosAuxiliar2TipoIdentificacion;
	protected JPanel jPanelParametrosAuxiliar3TipoIdentificacion;
	protected JPanel jPanelParametrosAuxiliar4TipoIdentificacion;
	//protected JPanel jPanelParametrosAuxiliar5TipoIdentificacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoIdentificacion;
	//protected JPanel jPanelImportacionTipoIdentificacion;
	
	
	public JTable jTableDatosTipoIdentificacion;
	
	
	
	//public JTable jTableDatosTipoIdentificacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoIdentificacion;
	protected JButton jButtonDuplicarTipoIdentificacion;
	protected JButton jButtonCopiarTipoIdentificacion;
	protected JButton jButtonVerFormTipoIdentificacion;
	protected JButton jButtonNuevoRelacionesTipoIdentificacion;
	protected JButton jButtonModificarTipoIdentificacion;
	
    protected JButton jButtonGuardarCambiosTablaTipoIdentificacion;
	protected JButton jButtonCerrarTipoIdentificacion;
	
	
	protected JButton jButtonRecargarInformacionTipoIdentificacion;
	protected JButton jButtonProcesarInformacionTipoIdentificacion;
	
	
	protected JButton jButtonAnterioresTipoIdentificacion;
	protected JButton jButtonSiguientesTipoIdentificacion;
	protected JButton jButtonNuevoGuardarCambiosTipoIdentificacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoIdentificacion;
	//protected JButton jButtonCerrarReporteDinamicoTipoIdentificacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoIdentificacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoIdentificacion;
	//protected JButton jButtonGenerarImportacionTipoIdentificacion;
	//protected JButton jButtonCerrarImportacionTipoIdentificacion;
	//protected JFileChooser jFileChooserImportacionTipoIdentificacion;
	//protected File fileImportacionTipoIdentificacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoIdentificacion;
	protected JButton jButtonDuplicarToolBarTipoIdentificacion;
	protected JButton jButtonNuevoRelacionesToolBarTipoIdentificacion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoIdentificacion;
	protected JButton jButtonCopiarToolBarTipoIdentificacion;
	protected JButton jButtonVerFormToolBarTipoIdentificacion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoIdentificacion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoIdentificacion;
	protected JButton jButtonCerrarToolBarTipoIdentificacion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoIdentificacion;
	protected JButton jButtonProcesarInformacionToolBarTipoIdentificacion;
	protected JButton jButtonAnterioresToolBarTipoIdentificacion;
	protected JButton jButtonSiguientesToolBarTipoIdentificacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoIdentificacion;
	protected JButton jButtonAbrirOrderByToolBarTipoIdentificacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoIdentificacion;
	protected JMenuItem jMenuItemDuplicarTipoIdentificacion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoIdentificacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoIdentificacion;
	protected JMenuItem jMenuItemCopiarTipoIdentificacion;
	protected JMenuItem jMenuItemVerFormTipoIdentificacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoIdentificacion;
	protected JMenuItem jMenuItemCerrarTipoIdentificacion;
	protected JMenuItem jMenuItemDetalleCerrarTipoIdentificacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoIdentificacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoIdentificacion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoIdentificacion;
	protected JMenuItem jMenuItemProcesarInformacionTipoIdentificacion;
	protected JMenuItem jMenuItemAnterioresTipoIdentificacion;
	protected JMenuItem jMenuItemSiguientesTipoIdentificacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoIdentificacion;
	protected JMenuItem jMenuItemAbrirOrderByTipoIdentificacion;
	protected JMenuItem jMenuItemMostrarOcultarTipoIdentificacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoIdentificacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoIdentificacion;
	protected JCheckBox jCheckBoxSeleccionadosTipoIdentificacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoIdentificacion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoIdentificacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoIdentificacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoIdentificacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoIdentificacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoIdentificacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoIdentificacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoIdentificacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoIdentificacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoIdentificacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoIdentificacion;
	protected JTextField jTextFieldValorCampoGeneralTipoIdentificacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoIdentificacion;
	//public JList<Reporte> jListColumnasSelectReporteTipoIdentificacion;
	//public JScrollPane jScrollColumnasSelectReporteTipoIdentificacion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoIdentificacion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoIdentificacion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoIdentificacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoIdentificacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoIdentificacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoIdentificacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoIdentificacion;
	
		
	//public JLabel jLabelArchivoImportacionTipoIdentificacion;	
	//public JLabel jLabelPathArchivoImportacionTipoIdentificacion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoIdentificacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoIdentificacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoIdentificacion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoIdentificacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoIdentificacion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoIdentificacion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoIdentificacion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoIdentificacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoIdentificacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoIdentificacion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	public TipoIdentificacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoIdentificacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIdentificacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIdentificacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIdentificacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIdentificacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIdentificacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoIdentificacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoIdentificacion)	{
		this.jButtonRecargarInformacionTipoIdentificacion = jButtonRecargarInformacionTipoIdentificacion;
	}
	
	public JButton getjButtonProcesarInformacionTipoIdentificacion() {
		return this.jButtonProcesarInformacionTipoIdentificacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoIdentificacion)	{
		this.jButtonProcesarInformacionTipoIdentificacion = jButtonProcesarInformacionTipoIdentificacion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoIdentificacion() {
		return this.jButtonRecargarInformacionTipoIdentificacion;
	}
	
	
	public List<TipoIdentificacion> gettipoidentificacions() {
		return this.tipoidentificacions;
	}

	public void settipoidentificacions(List<TipoIdentificacion> tipoidentificacions) {
		this.tipoidentificacions = tipoidentificacions;
	}
	
	public List<TipoIdentificacion> gettipoidentificacionsAux() {
		return this.tipoidentificacionsAux;
	}

	public void settipoidentificacionsAux(List<TipoIdentificacion> tipoidentificacionsAux) {
		this.tipoidentificacionsAux = tipoidentificacionsAux;
	}
	
	public List<TipoIdentificacion> gettipoidentificacionsEliminados() {
		return this.tipoidentificacionsEliminados;
	}

	public void setTipoIdentificacionsEliminados(List<TipoIdentificacion> tipoidentificacionsEliminados) {
		this.tipoidentificacionsEliminados = tipoidentificacionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoIdentificacion() {
		return jComboBoxTiposSeleccionarTipoIdentificacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoIdentificacion(
			JComboBox jComboBoxTiposSeleccionarTipoIdentificacion) {
		this.jComboBoxTiposSeleccionarTipoIdentificacion = jComboBoxTiposSeleccionarTipoIdentificacion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoIdentificacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoIdentificacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoIdentificacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoIdentificacion() {
		return jTextFieldValorCampoGeneralTipoIdentificacion;
	}

	public void setjTextFieldValorCampoGeneralTipoIdentificacion(
			JTextField jTextFieldValorCampoGeneralTipoIdentificacion) {
		this.jTextFieldValorCampoGeneralTipoIdentificacion = jTextFieldValorCampoGeneralTipoIdentificacion;
	}

	public void setBorderResaltarValorCampoGeneralTipoIdentificacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIdentificacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoIdentificacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoIdentificacion() {
		return this.jCheckBoxSeleccionarTodosTipoIdentificacion;
	}

	public void setjCheckBoxSeleccionarTodosTipoIdentificacion(
			JCheckBox jCheckBoxSeleccionarTodosTipoIdentificacion) {
		this.jCheckBoxSeleccionarTodosTipoIdentificacion = jCheckBoxSeleccionarTodosTipoIdentificacion;
	}

	public void setBorderResaltarSeleccionarTodosTipoIdentificacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIdentificacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoIdentificacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoIdentificacion() {
		return this.jCheckBoxSeleccionadosTipoIdentificacion;
	}

	public void setjCheckBoxSeleccionadosTipoIdentificacion(
			JCheckBox jCheckBoxSeleccionadosTipoIdentificacion) {
		this.jCheckBoxSeleccionadosTipoIdentificacion = jCheckBoxSeleccionadosTipoIdentificacion;
	}
	
	public void setBorderResaltarSeleccionadosTipoIdentificacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIdentificacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoIdentificacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoIdentificacion() {
		return this.jComboBoxTiposArchivosReportesTipoIdentificacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoIdentificacion(
			JComboBox jComboBoxTiposArchivosReportesTipoIdentificacion) {
		this.jComboBoxTiposArchivosReportesTipoIdentificacion = jComboBoxTiposArchivosReportesTipoIdentificacion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoIdentificacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIdentificacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoIdentificacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoIdentificacion() {
		return this.jComboBoxTiposReportesTipoIdentificacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoIdentificacion(
			JComboBox jComboBoxTiposReportesTipoIdentificacion) {
		this.jComboBoxTiposReportesTipoIdentificacion = jComboBoxTiposReportesTipoIdentificacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoIdentificacion() {
	//	return jComboBoxTiposReportesDinamicoTipoIdentificacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoIdentificacion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoIdentificacion) {
	//	this.jComboBoxTiposReportesDinamicoTipoIdentificacion = jComboBoxTiposReportesDinamicoTipoIdentificacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoIdentificacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoIdentificacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoIdentificacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoIdentificacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoIdentificacion = jComboBoxTiposArchivosReportesDinamicoTipoIdentificacion;
	//}
	
	public void setBorderResaltarTiposReportesTipoIdentificacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIdentificacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoIdentificacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoIdentificacion() {
		return this.jComboBoxTiposGraficosReportesTipoIdentificacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoIdentificacion(
			JComboBox jComboBoxTiposGraficosReportesTipoIdentificacion) {
		this.jComboBoxTiposGraficosReportesTipoIdentificacion = jComboBoxTiposGraficosReportesTipoIdentificacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoIdentificacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIdentificacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoIdentificacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoIdentificacion() {
		return this.jComboBoxTiposPaginacionTipoIdentificacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoIdentificacion(
			JComboBox jComboBoxTiposPaginacionTipoIdentificacion) {
		this.jComboBoxTiposPaginacionTipoIdentificacion = jComboBoxTiposPaginacionTipoIdentificacion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoIdentificacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIdentificacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoIdentificacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoIdentificacion() {
		return this.jComboBoxTiposRelacionesTipoIdentificacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoIdentificacion() {
		return this.jComboBoxTiposAccionesTipoIdentificacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoIdentificacion(
			JComboBox jComboBoxTiposRelacionesTipoIdentificacion) {
		this.jComboBoxTiposRelacionesTipoIdentificacion = jComboBoxTiposRelacionesTipoIdentificacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoIdentificacion(
			JComboBox jComboBoxTiposAccionesTipoIdentificacion) {
		this.jComboBoxTiposAccionesTipoIdentificacion = jComboBoxTiposAccionesTipoIdentificacion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoIdentificacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIdentificacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoIdentificacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoIdentificacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoIdentificacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoIdentificacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoIdentificacion() {
	//	return jCheckBoxConGraficoDinamicoTipoIdentificacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoIdentificacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoIdentificacion) {
	//	this.jCheckBoxConGraficoDinamicoTipoIdentificacion = jCheckBoxConGraficoDinamicoTipoIdentificacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoIdentificacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoIdentificacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoIdentificacion .setBorder(borderResaltar);		
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
		this.tipoidentificacionSessionBean=new TipoIdentificacionSessionBean();
		
		this.tipoidentificacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoidentificacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoidentificacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoIdentificacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Identificacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoIdentificacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoIdentificacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoIdentificacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoIdentificacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoIdentificacion,this.jTtoolBarTipoIdentificacion,
							"nuevo","nuevo","Nuevo"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoIdentificacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoIdentificacion,this.jTtoolBarTipoIdentificacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoIdentificacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoIdentificacion,this.jTtoolBarTipoIdentificacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoIdentificacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoIdentificacion,this.jTtoolBarTipoIdentificacion,
							"duplicar","duplicar","Duplicar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoIdentificacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoIdentificacion,this.jTtoolBarTipoIdentificacion,
							"copiar","copiar","Copiar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoIdentificacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoIdentificacion,this.jTtoolBarTipoIdentificacion,
							"ver_form","ver_form","Ver"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoIdentificacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoIdentificacion,this.jTtoolBarTipoIdentificacion,
							"recargar","recargar","Recargar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoIdentificacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoIdentificacion,this.jTtoolBarTipoIdentificacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoIdentificacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoIdentificacion,this.jTtoolBarTipoIdentificacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoIdentificacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoIdentificacion,this.jTtoolBarTipoIdentificacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoIdentificacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoIdentificacion,this.jTtoolBarTipoIdentificacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoIdentificacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoIdentificacion,this.jTtoolBarTipoIdentificacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoIdentificacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoIdentificacion,this.jTtoolBarTipoIdentificacion,
							"cerrar","cerrar","Salir"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoIdentificacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoIdentificacion;
			
				this.jButtonProcesarInformacionToolBarTipoIdentificacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoIdentificacion;
				
		//protected JButton jButtonModificarToolBarTipoIdentificacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoIdentificacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoIdentificacion=new JMenuMe("General");
		this.jmenuArchivoTipoIdentificacion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoIdentificacion=new JMenuMe("Acciones");
		this.jmenuDatosTipoIdentificacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoIdentificacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoIdentificacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoIdentificacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoIdentificacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoIdentificacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoIdentificacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoIdentificacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoIdentificacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoIdentificacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoIdentificacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoIdentificacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoIdentificacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoIdentificacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoIdentificacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoIdentificacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoIdentificacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoIdentificacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoIdentificacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoIdentificacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoIdentificacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoIdentificacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoIdentificacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoIdentificacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoIdentificacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoIdentificacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoIdentificacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoIdentificacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoIdentificacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoIdentificacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoIdentificacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoIdentificacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoIdentificacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoIdentificacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoIdentificacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoIdentificacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoIdentificacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoIdentificacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoIdentificacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoIdentificacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoIdentificacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoIdentificacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoIdentificacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoIdentificacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoIdentificacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoIdentificacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoIdentificacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoIdentificacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoIdentificacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoIdentificacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoIdentificacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoIdentificacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoIdentificacion.add(this.jMenuItemCerrarTipoIdentificacion);
			
			this.jmenuAccionesTipoIdentificacion.add(this.jMenuItemNuevoTipoIdentificacion);
			this.jmenuAccionesTipoIdentificacion.add(this.jMenuItemNuevoGuardarCambiosTipoIdentificacion);
			this.jmenuAccionesTipoIdentificacion.add(this.jMenuItemNuevoRelacionesTipoIdentificacion);
			this.jmenuAccionesTipoIdentificacion.add(this.jMenuItemGuardarCambiosTablaTipoIdentificacion);		
			this.jmenuAccionesTipoIdentificacion.add(this.jMenuItemDuplicarTipoIdentificacion);		
			this.jmenuAccionesTipoIdentificacion.add(this.jMenuItemCopiarTipoIdentificacion);		
			this.jmenuAccionesTipoIdentificacion.add(this.jMenuItemVerFormTipoIdentificacion);		
			
			this.jmenuDatosTipoIdentificacion.add(this.jMenuItemRecargarInformacionTipoIdentificacion);				
			this.jmenuDatosTipoIdentificacion.add(this.jMenuItemAnterioresTipoIdentificacion);				
			this.jmenuDatosTipoIdentificacion.add(this.jMenuItemSiguientesTipoIdentificacion);				
			this.jmenuDatosTipoIdentificacion.add(this.jMenuItemAbrirOrderByTipoIdentificacion);				
			this.jmenuDatosTipoIdentificacion.add(this.jMenuItemMostrarOcultarTipoIdentificacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoIdentificacion.add(this.jMenuItemGuardarCambiosTipoIdentificacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoIdentificacion.add(this.jmenuArchivoTipoIdentificacion);		
			this.jmenuBarTipoIdentificacion.add(this.jmenuAccionesTipoIdentificacion);		
			this.jmenuBarTipoIdentificacion.add(this.jmenuDatosTipoIdentificacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoIdentificacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoIdentificacion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleTipoIdentificacion = new TipoIdentificacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Identificacion DATOS");
			this.jInternalFrameDetalleFormTipoIdentificacion = new TipoIdentificacionDetalleFormJInternalFrame(jDesktopPane,this.tipoidentificacionSessionBean.getConGuardarRelaciones(),this.tipoidentificacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoIdentificacion = null;//new TipoIdentificacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoIdentificacion= new GridBagLayout();
		
		
		this.jTableDatosTipoIdentificacion = new JTableMe();      
		
		String sToolTipTipoIdentificacion="";
		sToolTipTipoIdentificacion=TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoIdentificacion+="(Cartera.TipoIdentificacion)";
		}
		
		if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoIdentificacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoIdentificacion.setToolTipText(sToolTipTipoIdentificacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoIdentificacion);
		this.jTableDatosTipoIdentificacion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoIdentificacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoIdentificacion.setRowSelectionAllowed(true);
		this.jTableDatosTipoIdentificacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoIdentificacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoIdentificacion = new JButtonMe();
		this.jButtonDuplicarTipoIdentificacion = new JButtonMe();
		this.jButtonCopiarTipoIdentificacion = new JButtonMe();
		this.jButtonVerFormTipoIdentificacion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoIdentificacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoIdentificacion = new JButtonMe();
		this.jButtonCerrarTipoIdentificacion = new JButtonMe();
		
		this.jScrollPanelDatosTipoIdentificacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoIdentificacion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoIdentificacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Identificacion";
		
		if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Identificaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoIdentificacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoIdentificacion.setToolTipText("Acciones");
        this.jPanelAccionesTipoIdentificacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoIdentificacion=new ReporteDinamicoJInternalFrame(TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoIdentificacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoIdentificacion=new ImportacionJInternalFrame(TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoIdentificacion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoIdentificacion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoIdentificacion.setText("Orden");
		this.jButtonAbrirOrderByTipoIdentificacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoIdentificacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoIdentificacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoIdentificacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIdentificacion,false,this);
			
			//this.cargarOrderByTipoIdentificacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoIdentificacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIdentificacion,true,this);
			
			//this.cargarOrderByTipoIdentificacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoIdentificacion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoIdentificacion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoIdentificacion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoIdentificacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoIdentificacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoIdentificacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoIdentificacion.setText("Nuevo");
		this.jButtonDuplicarTipoIdentificacion.setText("Duplicar");
		this.jButtonCopiarTipoIdentificacion.setText("Copiar");
		this.jButtonVerFormTipoIdentificacion.setText("Ver");
		this.jButtonNuevoRelacionesTipoIdentificacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoIdentificacion.setText("Guardar");
		this.jButtonCerrarTipoIdentificacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoIdentificacion,"nuevo_button","Nuevo",this.tipoidentificacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoIdentificacion,"duplicar_button","Duplicar",this.tipoidentificacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoIdentificacion,"copiar_button","Copiar",this.tipoidentificacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoIdentificacion,"ver_form","Ver",this.tipoidentificacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoIdentificacion,"nuevorelaciones_button","Nuevo Rel",this.tipoidentificacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoIdentificacion,"guardarcambiostabla_button","Guardar",this.tipoidentificacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoIdentificacion,"cerrar_button","Salir",this.tipoidentificacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoIdentificacion.setToolTipText("Nuevo"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoIdentificacion.setToolTipText("Duplicar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoIdentificacion.setToolTipText("Copiar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoIdentificacion.setToolTipText("Ver"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoIdentificacion.setToolTipText("Nuevo Rel"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoIdentificacion.setToolTipText("Guardar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoIdentificacion.setToolTipText("Salir"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoIdentificacion";
		inputMap = this.jButtonNuevoTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoIdentificacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoIdentificacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoIdentificacion";
		inputMap = this.jButtonDuplicarTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoIdentificacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoIdentificacion"));
		
		//COPIAR
		sMapKey = "CopiarTipoIdentificacion";
		inputMap = this.jButtonCopiarTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoIdentificacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoIdentificacion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoIdentificacion";
		inputMap = this.jButtonVerFormTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoIdentificacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoIdentificacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoIdentificacion";
		inputMap = this.jButtonNuevoRelacionesTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoIdentificacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoIdentificacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoIdentificacion";
		inputMap = this.jButtonModificarTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoIdentificacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoIdentificacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoIdentificacion";
		inputMap = this.jButtonCerrarTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoIdentificacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoIdentificacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoIdentificacion";
		inputMap = this.jButtonGuardarCambiosTablaTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoIdentificacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoIdentificacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoIdentificacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoIdentificacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoIdentificacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoIdentificacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoIdentificacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoIdentificacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoIdentificacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoIdentificacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoIdentificacion.setName("jPanelParametrosReportesTipoIdentificacion"); 
		
		this.jPanelParametrosReportesAccionesTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoIdentificacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoIdentificacion.setName("jPanelParametrosReportesAccionesTipoIdentificacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoIdentificacion = new JButtonMe();
		this.jButtonRecargarInformacionTipoIdentificacion.setText("Recargar");
		this.jButtonRecargarInformacionTipoIdentificacion.setToolTipText("Recargar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoIdentificacion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoIdentificacion = new JButtonMe();
		this.jButtonProcesarInformacionTipoIdentificacion.setText("Procesar");
		this.jButtonProcesarInformacionTipoIdentificacion.setToolTipText("Procesar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoIdentificacion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoIdentificacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoIdentificacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoIdentificacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoIdentificacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoIdentificacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoIdentificacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoIdentificacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoIdentificacion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoIdentificacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoIdentificacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoIdentificacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoIdentificacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoIdentificacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoIdentificacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoIdentificacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoIdentificacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoIdentificacion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoIdentificacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoIdentificacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoIdentificacion.setText("Accion");
		this.jComboBoxTiposAccionesTipoIdentificacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoIdentificacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoIdentificacion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoIdentificacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoIdentificacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoIdentificacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoIdentificacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoIdentificacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoIdentificacion = new JLabelMe();
		
		this.jLabelAccionesTipoIdentificacion.setText("Acciones");		
		this.jLabelAccionesTipoIdentificacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIdentificacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIdentificacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoIdentificacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoIdentificacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoIdentificacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoIdentificacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoIdentificacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoIdentificacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoIdentificacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoIdentificacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoIdentificacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoIdentificacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoIdentificacion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoIdentificacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoIdentificacion = new JButtonMe();
		//this.jButtonAnterioresTipoIdentificacion.setText("<<");
        this.jButtonAnterioresTipoIdentificacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoIdentificacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoIdentificacion = new JButtonMe();
		//this.jButtonSiguientesTipoIdentificacion.setText(">>");
        this.jButtonSiguientesTipoIdentificacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoIdentificacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoIdentificacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoIdentificacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoIdentificacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoIdentificacion,"nuevoguardarcambios_button","Nue",this.tipoidentificacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoIdentificacion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoIdentificacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoIdentificacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoIdentificacion";
		inputMap = this.jButtonRecargarInformacionTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoIdentificacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoIdentificacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoIdentificacion";
		inputMap = this.jButtonSiguientesTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoIdentificacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoIdentificacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoIdentificacion";
		inputMap = this.jButtonAnterioresTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoIdentificacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoIdentificacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoIdentificacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoIdentificacion.setMinimumSize(new Dimension(this.getWidth(),TipoIdentificacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoIdentificacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoIdentificacion.setMaximumSize(new Dimension(this.getWidth(),TipoIdentificacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoIdentificacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoIdentificacion.setPreferredSize(new Dimension(this.getWidth(),TipoIdentificacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoIdentificacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoIdentificacion = new GridBagLayout();

			this.jPanelPaginacionTipoIdentificacion.setLayout(gridaBagLayoutPaginacionTipoIdentificacion);						
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIdentificacion.gridy = 0;
			this.gridBagConstraintsTipoIdentificacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoIdentificacion.add(this.jButtonAnterioresTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
					
						
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoIdentificacion.gridy = 0;
			
			this.jPanelPaginacionTipoIdentificacion.add(this.jButtonNuevoGuardarCambiosTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
						
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoIdentificacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoIdentificacion.gridy = 0;
			this.jPanelPaginacionTipoIdentificacion.add(this.jButtonSiguientesTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIdentificacion.gridy = 1;
			this.gridBagConstraintsTipoIdentificacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIdentificacion.add(this.jButtonNuevoTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
				this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoIdentificacion.gridy = 1;
				this.gridBagConstraintsTipoIdentificacion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoIdentificacion.add(this.jButtonNuevoRelacionesTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
			}
			
			
			if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
				this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoIdentificacion.gridy = 1;
				this.gridBagConstraintsTipoIdentificacion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoIdentificacion.add(this.jButtonGuardarCambiosTablaTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
			}
			
			
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIdentificacion.gridy = 1;
			this.gridBagConstraintsTipoIdentificacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIdentificacion.add(this.jButtonDuplicarTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIdentificacion.gridy = 1;
			this.gridBagConstraintsTipoIdentificacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIdentificacion.add(this.jButtonCopiarTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIdentificacion.gridy = 1;
			this.gridBagConstraintsTipoIdentificacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoIdentificacion.add(this.jButtonVerFormTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIdentificacion.gridy = 1;
			this.gridBagConstraintsTipoIdentificacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoIdentificacion.add(this.jButtonCerrarTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		
		
		
		this.jButtonRecargarInformacionTipoIdentificacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoIdentificacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoIdentificacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoIdentificacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoIdentificacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoIdentificacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoIdentificacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoIdentificacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoIdentificacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoIdentificacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoIdentificacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoIdentificacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoIdentificacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoIdentificacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoIdentificacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoIdentificacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoIdentificacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoIdentificacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoIdentificacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIdentificacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIdentificacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoIdentificacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoIdentificacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoIdentificacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoIdentificacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoIdentificacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoIdentificacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoIdentificacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoIdentificacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoIdentificacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoIdentificacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoIdentificacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoIdentificacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoIdentificacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoIdentificacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoIdentificacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoIdentificacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoIdentificacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoIdentificacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoIdentificacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoIdentificacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoIdentificacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoIdentificacion.setLayout(gridaBagParametrosReportesTipoIdentificacion);
			this.jPanelParametrosReportesAccionesTipoIdentificacion.setLayout(gridaBagParametrosReportesAccionesTipoIdentificacion);
			
			
			this.jPanelParametrosAuxiliar1TipoIdentificacion.setLayout(gridaBagParametrosAuxiliar1TipoIdentificacion);
			this.jPanelParametrosAuxiliar2TipoIdentificacion.setLayout(gridaBagParametrosAuxiliar2TipoIdentificacion);
			this.jPanelParametrosAuxiliar3TipoIdentificacion.setLayout(gridaBagParametrosAuxiliar3TipoIdentificacion);
			this.jPanelParametrosAuxiliar4TipoIdentificacion.setLayout(gridaBagParametrosAuxiliar4TipoIdentificacion);
			//this.jPanelParametrosAuxiliar5TipoIdentificacion.setLayout(gridaBagParametrosAuxiliar2TipoIdentificacion);			
			
			
			
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoIdentificacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIdentificacion.add(this.jButtonRecargarInformacionTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIdentificacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoIdentificacion.add(this.jComboBoxTiposPaginacionTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIdentificacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoIdentificacion.add(this.jCheckBoxConAltoMaximoTablaTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIdentificacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoIdentificacion.add(this.jComboBoxTiposArchivosReportesTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIdentificacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIdentificacion.add(this.jPanelParametrosAuxiliar1TipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIdentificacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoIdentificacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoIdentificacion.add(this.jComboBoxTiposReportesTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIdentificacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIdentificacion.add(this.jPanelParametrosAuxiliar4TipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIdentificacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIdentificacion.add(this.jComboBoxTiposReportesTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIdentificacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoIdentificacion.add(this.jCheckBoxGenerarReporteTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIdentificacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIdentificacion.add(this.jPanelParametrosAuxiliar2TipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoIdentificacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoIdentificacion.add(this.jLabelAccionesTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
				this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoIdentificacion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoIdentificacion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoIdentificacion.add(this.jButtonAbrirOrderByTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIdentificacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIdentificacion.add(this.jComboBoxTiposSeleccionarTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);			
			
			
			/*
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoIdentificacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoIdentificacion.add(this.jCheckBoxSeleccionarTodosTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIdentificacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoIdentificacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoIdentificacion.add(this.jCheckBoxSeleccionarTodosTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);															
				
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIdentificacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoIdentificacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoIdentificacion.add(this.jCheckBoxSeleccionadosTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIdentificacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoIdentificacion.add(this.jPanelParametrosAuxiliar3TipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIdentificacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIdentificacion.add(this.jComboBoxTiposRelacionesTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
				
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIdentificacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIdentificacion.add(this.jComboBoxTiposAccionesTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
	
				
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoIdentificacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoIdentificacion.add(this.jTextFieldValorCampoGeneralTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoIdentificacion = new GridBagLayout();

			this.jScrollPanelDatosTipoIdentificacion.setLayout(gridaBagLayoutDatosTipoIdentificacion);
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIdentificacion.gridy = 0;
			this.gridBagConstraintsTipoIdentificacion.gridx = 0;
			
			this.jScrollPanelDatosTipoIdentificacion.add(this.jTableDatosTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoIdentificacion.setViewportView(this.jTableDatosTipoIdentificacion);
		this.jTableDatosTipoIdentificacion.setFillsViewportHeight(true);
		this.jTableDatosTipoIdentificacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoIdentificacion= new GridBagLayout();
		this.jPanelAccionesTipoIdentificacion.setLayout(gridaBagLayoutAccionesTipoIdentificacion);
		
		
		/*	
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = 0;
		this.gridBagConstraintsTipoIdentificacion.gridx = 0;
			
		this.jPanelAccionesTipoIdentificacion.add(this.jButtonNuevoTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoIdentificacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoIdentificacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();						
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoIdentificacion.gridx = 0;		
			//this.gridBagConstraintsTipoIdentificacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoIdentificacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoIdentificacion.gridx = 0;		
		//this.gridBagConstraintsTipoIdentificacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoIdentificacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoIdentificacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIdentificacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);								
		
		
		/*
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIdentificacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		*/		
		
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoIdentificacion.gridx =0;
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoIdentificacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
				
		
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIdentificacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoIdentificacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoIdentificacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoIdentificacion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoIdentificacion.setLayout(gridaBagLayoutBusquedasParametrosTipoIdentificacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoIdentificacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoIdentificacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIdentificacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIdentificacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIdentificacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
			
			
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIdentificacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		
			
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoIdentificacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoIdentificacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoIdentificacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoIdentificacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoIdentificacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoIdentificacion.setName("jPanelReporteDinamicoTipoIdentificacion"); 
		
		this.jPanelReporteDinamicoTipoIdentificacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoIdentificacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoIdentificacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoIdentificacion.setLayout(gridaBagLayoutReporteDinamicoTipoIdentificacion);
		
		
		this.jInternalFrameReporteDinamicoTipoIdentificacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoIdentificacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoIdentificacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoIdentificacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoIdentificacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoIdentificacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoIdentificacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoIdentificacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoIdentificacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoIdentificacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoIdentificacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoIdentificacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoIdentificacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoIdentificacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Identificaciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoIdentificacion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoIdentificacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoIdentificacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoIdentificacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoIdentificacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoIdentificacion.add(this.jLabelColumnasSelectReporteTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoIdentificacion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoIdentificacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoIdentificacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoIdentificacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoIdentificacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoIdentificacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoIdentificacion=new JScrollPane(this.jListColumnasSelectReporteTipoIdentificacion);
			
			this.jScrollColumnasSelectReporteTipoIdentificacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoIdentificacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoIdentificacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoIdentificacion.add(this.jListColumnasSelectReporteTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		this.jPanelReporteDinamicoTipoIdentificacion.add(this.jScrollColumnasSelectReporteTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoIdentificacion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoIdentificacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoIdentificacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoIdentificacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoIdentificacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoIdentificacion.add(this.jLabelRelacionesSelectReporteTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoIdentificacion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoIdentificacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoIdentificacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoIdentificacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoIdentificacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoIdentificacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoIdentificacion=new JScrollPane(this.jListRelacionesSelectReporteTipoIdentificacion);
			
			this.jScrollRelacionesSelectReporteTipoIdentificacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoIdentificacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoIdentificacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoIdentificacion.add(this.jListRelacionesSelectReporteTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		this.jPanelReporteDinamicoTipoIdentificacion.add(this.jScrollRelacionesSelectReporteTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoIdentificacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoIdentificacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoIdentificacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoIdentificacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoIdentificacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoIdentificacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoIdentificacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoIdentificacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoIdentificacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoIdentificacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoIdentificacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoIdentificacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoIdentificacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoIdentificacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoIdentificacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoIdentificacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoIdentificacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoIdentificacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoIdentificacion.add(this.jLabelGenerarExcelReporteDinamicoTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoIdentificacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoIdentificacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoIdentificacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoIdentificacion.setToolTipText("Generar EXCEL"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoIdentificacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoIdentificacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoIdentificacion.add(this.jButtonGenerarExcelReporteDinamicoTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIdentificacion.add(this.jComboBoxTiposReportesDinamicoTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoIdentificacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoIdentificacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoIdentificacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoIdentificacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoIdentificacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoIdentificacion.add(this.jLabelTiposArchivoReporteDinamicoTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIdentificacion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoIdentificacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoIdentificacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoIdentificacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoIdentificacion.setToolTipText("Generar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIdentificacion.add(this.jButtonGenerarReporteDinamicoTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoIdentificacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoIdentificacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoIdentificacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoIdentificacion.setToolTipText("Cancelar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoIdentificacion.add(this.jButtonCerrarReporteDinamicoTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoIdentificacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoIdentificacion= new JScrollPane(jPanelReporteDinamicoTipoIdentificacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoIdentificacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoIdentificacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoIdentificacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Identificaciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoIdentificacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoIdentificacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoIdentificacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoIdentificacion);
		this.jInternalFrameReporteDinamicoTipoIdentificacion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoIdentificacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoIdentificacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoIdentificacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoIdentificacion.setName("jPanelImportacionTipoIdentificacion"); 
		
		this.jPanelImportacionTipoIdentificacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoIdentificacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoIdentificacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoIdentificacion.setLayout(gridaBagLayoutImportacionTipoIdentificacion);
		
		
		this.jInternalFrameImportacionTipoIdentificacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoIdentificacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoIdentificacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoIdentificacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoIdentificacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoIdentificacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoIdentificacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoIdentificacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoIdentificacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoIdentificacion.setResizable(true);
	    this.jInternalFrameImportacionTipoIdentificacion.setClosable(true);
	    this.jInternalFrameImportacionTipoIdentificacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoIdentificacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoIdentificacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoIdentificacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoIdentificacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoIdentificacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoIdentificacion.setResizable(true);
	    this.jInternalFrameImportacionTipoIdentificacion.setClosable(true);
	    this.jInternalFrameImportacionTipoIdentificacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoIdentificacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoIdentificacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoIdentificacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Identificaciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoIdentificacion = new JLabelMe();

		this.jLabelArchivoImportacionTipoIdentificacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoIdentificacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoIdentificacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoIdentificacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoIdentificacion.add(this.jLabelArchivoImportacionTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoIdentificacion = new JFileChooser();		
		this.jFileChooserImportacionTipoIdentificacion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoIdentificacion = new JButtonMe();
		this.jButtonAbrirImportacionTipoIdentificacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoIdentificacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoIdentificacion.setToolTipText("Generar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIdentificacion.add(this.jButtonAbrirImportacionTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoIdentificacion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoIdentificacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoIdentificacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoIdentificacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoIdentificacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoIdentificacion.add(this.jLabelPathArchivoImportacionTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoIdentificacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoIdentificacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoIdentificacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoIdentificacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIdentificacion.add(this.jTextFieldPathArchivoImportacionTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoIdentificacion = new JButtonMe();
		this.jButtonGenerarImportacionTipoIdentificacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoIdentificacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoIdentificacion.setToolTipText("Generar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIdentificacion.add(this.jButtonGenerarImportacionTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoIdentificacion = new JButtonMe();
		this.jButtonCerrarImportacionTipoIdentificacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoIdentificacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoIdentificacion.setToolTipText("Cancelar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoIdentificacion.add(this.jButtonCerrarImportacionTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoIdentificacion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoIdentificacion= new JScrollPane(jPanelImportacionTipoIdentificacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoIdentificacion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoIdentificacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoIdentificacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoIdentificacion);
		this.jInternalFrameImportacionTipoIdentificacion.getContentPane().add(this.jScrollPanelImportacionTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoIdentificacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoIdentificacion = new JButtonMe();
			this.jButtonAbrirOrderByTipoIdentificacion.setText("Orden");
			this.jButtonAbrirOrderByTipoIdentificacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoIdentificacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoIdentificacion";
			inputMap = this.jButtonAbrirOrderByTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoIdentificacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoIdentificacion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoIdentificacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoIdentificacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoIdentificacion.setName("jPanelOrderByTipoIdentificacion"); 
			
			this.jPanelOrderByTipoIdentificacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoIdentificacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoIdentificacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoIdentificacion.setLayout(gridaBagLayoutOrderByTipoIdentificacion);
			
			
			this.jTableDatosTipoIdentificacionOrderBy = new JTableMe();        
			this.jTableDatosTipoIdentificacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoIdentificacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoIdentificacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoIdentificacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoIdentificacionOrderBy.setViewportView(this.jTableDatosTipoIdentificacionOrderBy);
			this.jTableDatosTipoIdentificacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoIdentificacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoIdentificacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoIdentificacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoIdentificacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoIdentificacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoIdentificacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoIdentificacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoIdentificacion.setTitle("Orden");
			this.jInternalFrameOrderByTipoIdentificacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoIdentificacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoIdentificacion.setResizable(true);
			this.jInternalFrameOrderByTipoIdentificacion.setClosable(true);
			this.jInternalFrameOrderByTipoIdentificacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoIdentificacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoIdentificacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoIdentificacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Identificaciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoIdentificacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoIdentificacion.ipady =150;
				
			this.jPanelOrderByTipoIdentificacion.add(jScrollPanelDatosTipoIdentificacionOrderBy, this.gridBagConstraintsTipoIdentificacion);//this.jTableDatosTipoIdentificacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoIdentificacion = new JButtonMe();
			this.jButtonCerrarOrderByTipoIdentificacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoIdentificacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoIdentificacion.setToolTipText("Cancelar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIdentificacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoIdentificacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoIdentificacion.add(this.jButtonCerrarOrderByTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoIdentificacion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoIdentificacion= new JScrollPane(jPanelOrderByTipoIdentificacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoIdentificacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoIdentificacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoIdentificacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoIdentificacion);
			
			this.jInternalFrameOrderByTipoIdentificacion.getContentPane().add(this.jScrollPanelOrderByTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);			
		
		} else {
			this.jButtonAbrirOrderByTipoIdentificacion = new JButtonMe();
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
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=700;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoidentificacionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoIdentificacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoIdentificacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoIdentificacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoIdentificacion.getRowHeight();//TipoIdentificacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoIdentificacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoIdentificacion.isSelected()) {
					iHeightTable=TipoIdentificacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoIdentificacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoIdentificacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoIdentificacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoIdentificacion.isSelected()) {
					iHeightTable=TipoIdentificacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoIdentificacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoIdentificacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoIdentificacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoIdentificacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoIdentificacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoIdentificacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoIdentificacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoIdentificacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoIdentificacion!=null && this.jInternalFrameOrderByTipoIdentificacion.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoIdentificacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoIdentificacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoIdentificacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoIdentificacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoIdentificacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoIdentificacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoIdentificacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoIdentificacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoIdentificacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoIdentificacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoidentificacionLogic.getTipoIdentificacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoidentificacions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoIdentificacion> TraerTipoIdentificacionBeans(List<TipoIdentificacion> tipoidentificacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoIdentificacion tipoidentificacion:tipoidentificacions) {
					
				if(!(TipoIdentificacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoIdentificacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoidentificacion.setsDetalleGeneralEntityReporte(TipoIdentificacionConstantesFunciones.getTipoIdentificacionDescripcion(tipoidentificacion));
										
						
					
					

					if(tipoidentificacion.getConyuges()!=null && Funciones.existeClass(classes,Conyuge.class)) {
						try{tipoidentificacion.setconyugesDescripcionReporte(new JRBeanCollectionDataSource(ConyugeJInternalFrame.TraerConyugeBeans(tipoidentificacion.getConyuges(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoidentificacion.getCobradors()!=null && Funciones.existeClass(classes,Cobrador.class)) {
						try{tipoidentificacion.setcobradorsDescripcionReporte(new JRBeanCollectionDataSource(CobradorJInternalFrame.TraerCobradorBeans(tipoidentificacion.getCobradors(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoidentificacion.getRepresentanteLegals()!=null && Funciones.existeClass(classes,RepresentanteLegal.class)) {
						try{tipoidentificacion.setrepresentantelegalsDescripcionReporte(new JRBeanCollectionDataSource(RepresentanteLegalJInternalFrame.TraerRepresentanteLegalBeans(tipoidentificacion.getRepresentanteLegals(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoidentificacion.getSubClientes()!=null && Funciones.existeClass(classes,SubCliente.class)) {
						try{tipoidentificacion.setsubclientesDescripcionReporte(new JRBeanCollectionDataSource(SubClienteJInternalFrame.TraerSubClienteBeans(tipoidentificacion.getSubClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoidentificacion.getAccionistas()!=null && Funciones.existeClass(classes,Accionista.class)) {
						try{tipoidentificacion.setaccionistasDescripcionReporte(new JRBeanCollectionDataSource(AccionistaJInternalFrame.TraerAccionistaBeans(tipoidentificacion.getAccionistas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoidentificacion.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{tipoidentificacion.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(tipoidentificacion.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoidentificacion.getParametroCarteraDefectos()!=null && Funciones.existeClass(classes,ParametroCarteraDefecto.class)) {
						try{tipoidentificacion.setparametrocarteradefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroCarteraDefectoJInternalFrame.TraerParametroCarteraDefectoBeans(tipoidentificacion.getParametroCarteraDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoidentificacion.setsDetalleGeneralEntityReporte(tipoidentificacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoidentificacionbeans.add(tipoidentificacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoidentificacions;
    }
	//PARA REPORTES FIN
}
