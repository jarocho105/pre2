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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoPrestamoConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoPrestamoJInternalFrame extends TipoPrestamoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoPrestamo;
	
	protected JMenuBar jmenuBarTipoPrestamo;
	
	protected JMenu jmenuTipoPrestamo;
	protected JMenu jmenuDatosTipoPrestamo;
	protected JMenu jmenuArchivoTipoPrestamo;
	protected JMenu jmenuAccionesTipoPrestamo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPrestamo;	
	protected GridBagConstraints gridBagConstraintsTipoPrestamo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoPrestamoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoPrestamo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoPrestamo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoPrestamo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public TipoPrestamoSessionBean tipoprestamoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoPrestamo> tipoprestamos;		
	public List<TipoPrestamo> tipoprestamosEliminados;	
	public List<TipoPrestamo> tipoprestamosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoPrestamo;		
	protected JButton jButtonAbrirOrderByTipoPrestamo;
	
	
	//protected JPanel jPanelOrderByTipoPrestamo;
	//public JScrollPane jScrollPanelOrderByTipoPrestamo;	
	//protected JButton jButtonCerrarOrderByTipoPrestamo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoPrestamoLogic tipoprestamoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoPrestamo;
	public JScrollPane jScrollPanelDatosEdicionTipoPrestamo;
	public JScrollPane jScrollPanelDatosGeneralTipoPrestamo;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoPrestamoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoPrestamo;
	//public JScrollPane jScrollPanelImportacionTipoPrestamo;
	
	
	
	protected JPanel jPanelAccionesTipoPrestamo;
	
    protected JPanel jPanelPaginacionTipoPrestamo;
    protected JPanel jPanelParametrosReportesTipoPrestamo;
	protected JPanel jPanelParametrosReportesAccionesTipoPrestamo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoPrestamo;
	protected JPanel jPanelParametrosAuxiliar2TipoPrestamo;
	protected JPanel jPanelParametrosAuxiliar3TipoPrestamo;
	protected JPanel jPanelParametrosAuxiliar4TipoPrestamo;
	//protected JPanel jPanelParametrosAuxiliar5TipoPrestamo;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoPrestamo;
	//protected JPanel jPanelImportacionTipoPrestamo;
	
	
	public JTable jTableDatosTipoPrestamo;
	
	
	
	//public JTable jTableDatosTipoPrestamoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoPrestamo;
	protected JButton jButtonDuplicarTipoPrestamo;
	protected JButton jButtonCopiarTipoPrestamo;
	protected JButton jButtonVerFormTipoPrestamo;
	protected JButton jButtonNuevoRelacionesTipoPrestamo;
	protected JButton jButtonModificarTipoPrestamo;
	
    protected JButton jButtonGuardarCambiosTablaTipoPrestamo;
	protected JButton jButtonCerrarTipoPrestamo;
	
	
	protected JButton jButtonRecargarInformacionTipoPrestamo;
	protected JButton jButtonProcesarInformacionTipoPrestamo;
	
	
	protected JButton jButtonAnterioresTipoPrestamo;
	protected JButton jButtonSiguientesTipoPrestamo;
	protected JButton jButtonNuevoGuardarCambiosTipoPrestamo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoPrestamo;
	//protected JButton jButtonCerrarReporteDinamicoTipoPrestamo;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoPrestamo;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoPrestamo;
	//protected JButton jButtonGenerarImportacionTipoPrestamo;
	//protected JButton jButtonCerrarImportacionTipoPrestamo;
	//protected JFileChooser jFileChooserImportacionTipoPrestamo;
	//protected File fileImportacionTipoPrestamo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPrestamo;
	protected JButton jButtonDuplicarToolBarTipoPrestamo;
	protected JButton jButtonNuevoRelacionesToolBarTipoPrestamo;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoPrestamo;
	protected JButton jButtonCopiarToolBarTipoPrestamo;
	protected JButton jButtonVerFormToolBarTipoPrestamo;
	public JButton jButtonGuardarCambiosTablaToolBarTipoPrestamo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPrestamo;
	protected JButton jButtonCerrarToolBarTipoPrestamo;
	
	protected JButton jButtonRecargarInformacionToolBarTipoPrestamo;
	protected JButton jButtonProcesarInformacionToolBarTipoPrestamo;
	protected JButton jButtonAnterioresToolBarTipoPrestamo;
	protected JButton jButtonSiguientesToolBarTipoPrestamo;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoPrestamo;
	protected JButton jButtonAbrirOrderByToolBarTipoPrestamo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPrestamo;
	protected JMenuItem jMenuItemDuplicarTipoPrestamo;
	protected JMenuItem jMenuItemNuevoRelacionesTipoPrestamo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoPrestamo;
	protected JMenuItem jMenuItemCopiarTipoPrestamo;
	protected JMenuItem jMenuItemVerFormTipoPrestamo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPrestamo;
	protected JMenuItem jMenuItemCerrarTipoPrestamo;
	protected JMenuItem jMenuItemDetalleCerrarTipoPrestamo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoPrestamo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPrestamo;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoPrestamo;
	protected JMenuItem jMenuItemProcesarInformacionTipoPrestamo;
	protected JMenuItem jMenuItemAnterioresTipoPrestamo;
	protected JMenuItem jMenuItemSiguientesTipoPrestamo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPrestamo;
	protected JMenuItem jMenuItemAbrirOrderByTipoPrestamo;
	protected JMenuItem jMenuItemMostrarOcultarTipoPrestamo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPrestamo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoPrestamo;
	protected JCheckBox jCheckBoxSeleccionadosTipoPrestamo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoPrestamo;
	protected JCheckBox jCheckBoxConGraficoReporteTipoPrestamo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoPrestamo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoPrestamo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPrestamo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoPrestamo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoPrestamo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoPrestamo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPrestamo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPrestamo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoPrestamo;
	protected JTextField jTextFieldValorCampoGeneralTipoPrestamo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoPrestamo;
	//public JList<Reporte> jListColumnasSelectReporteTipoPrestamo;
	//public JScrollPane jScrollColumnasSelectReporteTipoPrestamo;
	
	//public JLabel jLabelRelacionesSelectReporteTipoPrestamo;
	//public JList<Reporte> jListRelacionesSelectReporteTipoPrestamo;
	//public JScrollPane jScrollRelacionesSelectReporteTipoPrestamo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoPrestamo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoPrestamo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoPrestamo;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoPrestamo;
	
		
	//public JLabel jLabelArchivoImportacionTipoPrestamo;	
	//public JLabel jLabelPathArchivoImportacionTipoPrestamo;
	//protected JTextField jTextFieldPathArchivoImportacionTipoPrestamo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoPrestamo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoPrestamo;
	
	//public JLabel jLabelColumnaCategoriaValorTipoPrestamo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoPrestamo;
	
	//public JLabel jLabelColumnasValoresGraficoTipoPrestamo;
	//public JList<Reporte> jListColumnasValoresGraficoTipoPrestamo;
	//public JScrollPane jScrollColumnasValoresGraficoTipoPrestamo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoPrestamo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoPrestamo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoPrestamo;
	public JPanel jPanelFK_IdCuentaContableTipoPrestamo;
	public JButton jButtonFK_IdCuentaContableTipoPrestamo;
	public JPanel jPanelFK_IdTipoPrestamoTipoPrestamo;
	public JButton jButtonFK_IdTipoPrestamoTipoPrestamo;
	
	public JPanel jPanelid_cuenta_contableFK_IdCuentaContableTipoPrestamo;
	public JLabel jLabelid_cuenta_contableFK_IdCuentaContableTipoPrestamo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo;
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableTipoPrestamo= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableTipoPrestamoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableTipoPrestamoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFK_IdCuentaContableTipoPrestamoArbol= new JButtonMe();

	
	public JPanel jPanelid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo;
	public JLabel jLabelid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo;
	public JButton jButtonid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdTipoPrestamoTipoPrestamoUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdTipoPrestamoTipoPrestamoBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public TipoPrestamoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrestamoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrestamoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrestamoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoPrestamo)	{
		this.jButtonRecargarInformacionTipoPrestamo = jButtonRecargarInformacionTipoPrestamo;
	}
	
	public JButton getjButtonProcesarInformacionTipoPrestamo() {
		return this.jButtonProcesarInformacionTipoPrestamo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPrestamo)	{
		this.jButtonProcesarInformacionTipoPrestamo = jButtonProcesarInformacionTipoPrestamo;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoPrestamo() {
		return this.jButtonRecargarInformacionTipoPrestamo;
	}
	
	
	public List<TipoPrestamo> gettipoprestamos() {
		return this.tipoprestamos;
	}

	public void settipoprestamos(List<TipoPrestamo> tipoprestamos) {
		this.tipoprestamos = tipoprestamos;
	}
	
	public List<TipoPrestamo> gettipoprestamosAux() {
		return this.tipoprestamosAux;
	}

	public void settipoprestamosAux(List<TipoPrestamo> tipoprestamosAux) {
		this.tipoprestamosAux = tipoprestamosAux;
	}
	
	public List<TipoPrestamo> gettipoprestamosEliminados() {
		return this.tipoprestamosEliminados;
	}

	public void setTipoPrestamosEliminados(List<TipoPrestamo> tipoprestamosEliminados) {
		this.tipoprestamosEliminados = tipoprestamosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoPrestamo() {
		return jComboBoxTiposSeleccionarTipoPrestamo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoPrestamo(
			JComboBox jComboBoxTiposSeleccionarTipoPrestamo) {
		this.jComboBoxTiposSeleccionarTipoPrestamo = jComboBoxTiposSeleccionarTipoPrestamo;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoPrestamo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoPrestamo() {
		return jTextFieldValorCampoGeneralTipoPrestamo;
	}

	public void setjTextFieldValorCampoGeneralTipoPrestamo(
			JTextField jTextFieldValorCampoGeneralTipoPrestamo) {
		this.jTextFieldValorCampoGeneralTipoPrestamo = jTextFieldValorCampoGeneralTipoPrestamo;
	}

	public void setBorderResaltarValorCampoGeneralTipoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrestamo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoPrestamo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoPrestamo() {
		return this.jCheckBoxSeleccionarTodosTipoPrestamo;
	}

	public void setjCheckBoxSeleccionarTodosTipoPrestamo(
			JCheckBox jCheckBoxSeleccionarTodosTipoPrestamo) {
		this.jCheckBoxSeleccionarTodosTipoPrestamo = jCheckBoxSeleccionarTodosTipoPrestamo;
	}

	public void setBorderResaltarSeleccionarTodosTipoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrestamo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoPrestamo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoPrestamo() {
		return this.jCheckBoxSeleccionadosTipoPrestamo;
	}

	public void setjCheckBoxSeleccionadosTipoPrestamo(
			JCheckBox jCheckBoxSeleccionadosTipoPrestamo) {
		this.jCheckBoxSeleccionadosTipoPrestamo = jCheckBoxSeleccionadosTipoPrestamo;
	}
	
	public void setBorderResaltarSeleccionadosTipoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrestamo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoPrestamo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoPrestamo() {
		return this.jComboBoxTiposArchivosReportesTipoPrestamo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoPrestamo(
			JComboBox jComboBoxTiposArchivosReportesTipoPrestamo) {
		this.jComboBoxTiposArchivosReportesTipoPrestamo = jComboBoxTiposArchivosReportesTipoPrestamo;
	}

	public void setBorderResaltarTiposArchivosReportesTipoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoPrestamo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoPrestamo() {
		return this.jComboBoxTiposReportesTipoPrestamo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoPrestamo(
			JComboBox jComboBoxTiposReportesTipoPrestamo) {
		this.jComboBoxTiposReportesTipoPrestamo = jComboBoxTiposReportesTipoPrestamo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoPrestamo() {
	//	return jComboBoxTiposReportesDinamicoTipoPrestamo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoPrestamo(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoPrestamo) {
	//	this.jComboBoxTiposReportesDinamicoTipoPrestamo = jComboBoxTiposReportesDinamicoTipoPrestamo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoPrestamo() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoPrestamo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoPrestamo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPrestamo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoPrestamo = jComboBoxTiposArchivosReportesDinamicoTipoPrestamo;
	//}
	
	public void setBorderResaltarTiposReportesTipoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoPrestamo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoPrestamo() {
		return this.jComboBoxTiposGraficosReportesTipoPrestamo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoPrestamo(
			JComboBox jComboBoxTiposGraficosReportesTipoPrestamo) {
		this.jComboBoxTiposGraficosReportesTipoPrestamo = jComboBoxTiposGraficosReportesTipoPrestamo;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoPrestamo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoPrestamo() {
		return this.jComboBoxTiposPaginacionTipoPrestamo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoPrestamo(
			JComboBox jComboBoxTiposPaginacionTipoPrestamo) {
		this.jComboBoxTiposPaginacionTipoPrestamo = jComboBoxTiposPaginacionTipoPrestamo;
	}
	
	public void setBorderResaltarTiposPaginacionTipoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoPrestamo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoPrestamo() {
		return this.jComboBoxTiposRelacionesTipoPrestamo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPrestamo() {
		return this.jComboBoxTiposAccionesTipoPrestamo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPrestamo(
			JComboBox jComboBoxTiposRelacionesTipoPrestamo) {
		this.jComboBoxTiposRelacionesTipoPrestamo = jComboBoxTiposRelacionesTipoPrestamo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPrestamo(
			JComboBox jComboBoxTiposAccionesTipoPrestamo) {
		this.jComboBoxTiposAccionesTipoPrestamo = jComboBoxTiposAccionesTipoPrestamo;
	}
	
	public void setBorderResaltarTiposRelacionesTipoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoPrestamo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoPrestamo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrestamo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoPrestamo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoPrestamo() {
	//	return jCheckBoxConGraficoDinamicoTipoPrestamo;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoPrestamo(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoPrestamo) {
	//	this.jCheckBoxConGraficoDinamicoTipoPrestamo = jCheckBoxConGraficoDinamicoTipoPrestamo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoPrestamo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoPrestamo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoPrestamo .setBorder(borderResaltar);		
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
		this.tipoprestamoSessionBean=new TipoPrestamoSessionBean();
		
		this.tipoprestamoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprestamoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprestamoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPrestamoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Prestamo MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoPrestamoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoPrestamo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoPrestamo,this.jTtoolBarTipoPrestamo,
							"nuevo","nuevo","Nuevo"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoPrestamo,this.jTtoolBarTipoPrestamo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoPrestamo,this.jTtoolBarTipoPrestamo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoPrestamo,this.jTtoolBarTipoPrestamo,
							"duplicar","duplicar","Duplicar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoPrestamo,this.jTtoolBarTipoPrestamo,
							"copiar","copiar","Copiar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoPrestamo,this.jTtoolBarTipoPrestamo,
							"ver_form","ver_form","Ver"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPrestamo,this.jTtoolBarTipoPrestamo,
							"recargar","recargar","Recargar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPrestamo,this.jTtoolBarTipoPrestamo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPrestamo,this.jTtoolBarTipoPrestamo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoPrestamo,this.jTtoolBarTipoPrestamo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoPrestamo,this.jTtoolBarTipoPrestamo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoPrestamo,this.jTtoolBarTipoPrestamo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoPrestamo,this.jTtoolBarTipoPrestamo,
							"cerrar","cerrar","Salir"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoPrestamo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoPrestamo;
			
				this.jButtonProcesarInformacionToolBarTipoPrestamo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoPrestamo;
				
		//protected JButton jButtonModificarToolBarTipoPrestamo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoPrestamo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoPrestamo=new JMenuMe("General");
		this.jmenuArchivoTipoPrestamo=new JMenuMe("Archivo");
		this.jmenuAccionesTipoPrestamo=new JMenuMe("Acciones");
		this.jmenuDatosTipoPrestamo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPrestamo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPrestamo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPrestamo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoPrestamo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoPrestamo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoPrestamo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoPrestamo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoPrestamo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoPrestamo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoPrestamo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPrestamo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPrestamo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoPrestamo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoPrestamo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoPrestamo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoPrestamo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoPrestamo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoPrestamo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoPrestamo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoPrestamo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoPrestamo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPrestamo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPrestamo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPrestamo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoPrestamo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoPrestamo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoPrestamo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoPrestamo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoPrestamo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoPrestamo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoPrestamo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoPrestamo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoPrestamo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoPrestamo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoPrestamo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoPrestamo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoPrestamo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoPrestamo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoPrestamo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPrestamo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPrestamo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPrestamo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoPrestamo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoPrestamo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoPrestamo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPrestamo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPrestamo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPrestamo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoPrestamo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoPrestamo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoPrestamo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoPrestamo.add(this.jMenuItemCerrarTipoPrestamo);
			
			this.jmenuAccionesTipoPrestamo.add(this.jMenuItemNuevoTipoPrestamo);
			this.jmenuAccionesTipoPrestamo.add(this.jMenuItemNuevoGuardarCambiosTipoPrestamo);
			this.jmenuAccionesTipoPrestamo.add(this.jMenuItemNuevoRelacionesTipoPrestamo);
			this.jmenuAccionesTipoPrestamo.add(this.jMenuItemGuardarCambiosTablaTipoPrestamo);		
			this.jmenuAccionesTipoPrestamo.add(this.jMenuItemDuplicarTipoPrestamo);		
			this.jmenuAccionesTipoPrestamo.add(this.jMenuItemCopiarTipoPrestamo);		
			this.jmenuAccionesTipoPrestamo.add(this.jMenuItemVerFormTipoPrestamo);		
			
			this.jmenuDatosTipoPrestamo.add(this.jMenuItemRecargarInformacionTipoPrestamo);				
			this.jmenuDatosTipoPrestamo.add(this.jMenuItemAnterioresTipoPrestamo);				
			this.jmenuDatosTipoPrestamo.add(this.jMenuItemSiguientesTipoPrestamo);				
			this.jmenuDatosTipoPrestamo.add(this.jMenuItemAbrirOrderByTipoPrestamo);				
			this.jmenuDatosTipoPrestamo.add(this.jMenuItemMostrarOcultarTipoPrestamo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoPrestamo.add(this.jMenuItemGuardarCambiosTipoPrestamo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoPrestamo.add(this.jmenuArchivoTipoPrestamo);		
			this.jmenuBarTipoPrestamo.add(this.jmenuAccionesTipoPrestamo);		
			this.jmenuBarTipoPrestamo.add(this.jmenuDatosTipoPrestamo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoPrestamo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoPrestamo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCuentaContableTipoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableTipoPrestamo.setToolTipText("Buscar Por Cuenta Contable ");
		this.jButtonFK_IdCuentaContableTipoPrestamo= new JButtonMe();
		this.jButtonFK_IdCuentaContableTipoPrestamo.setText("Buscar");
		this.jButtonFK_IdCuentaContableTipoPrestamo.setToolTipText("Buscar Por Cuenta Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableTipoPrestamo,"buscar_button","Buscar Por Cuenta Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contableFK_IdCuentaContableTipoPrestamo = new JLabelMe();
		jLabelid_cuenta_contableFK_IdCuentaContableTipoPrestamo.setText("Cuenta Contable :");
		jLabelid_cuenta_contableFK_IdCuentaContableTipoPrestamo.setToolTipText("Cuenta Contable");
		jLabelid_cuenta_contableFK_IdCuentaContableTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contableFK_IdCuentaContableTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFK_IdCuentaContableTipoPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo= new JComboBoxMe();
		jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPrestamoTipoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrestamoTipoPrestamo.setToolTipText("Buscar Por Idrubro Emplea ");
		this.jButtonFK_IdTipoPrestamoTipoPrestamo= new JButtonMe();
		this.jButtonFK_IdTipoPrestamoTipoPrestamo.setText("Buscar");
		this.jButtonFK_IdTipoPrestamoTipoPrestamo.setToolTipText("Buscar Por Idrubro Emplea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrestamoTipoPrestamo,"buscar_button","Buscar Por Idrubro Emplea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrestamoTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo = new JLabelMe();
		jLabelid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.setText("Idrubro Emplea :");
		jLabelid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.setToolTipText("Idrubro Emplea");
		jLabelid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo= new JComboBoxMe();
		jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoPrestamo=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoPrestamo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoPrestamo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoPrestamo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoPrestamo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoPrestamo = new TipoPrestamoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Prestamo DATOS");
			this.jInternalFrameDetalleFormTipoPrestamo = new TipoPrestamoDetalleFormJInternalFrame(jDesktopPane,this.tipoprestamoSessionBean.getConGuardarRelaciones(),this.tipoprestamoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoPrestamo = null;//new TipoPrestamoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPrestamo= new GridBagLayout();
		
		
		this.jTableDatosTipoPrestamo = new JTableMe();      
		
		String sToolTipTipoPrestamo="";
		sToolTipTipoPrestamo=TipoPrestamoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPrestamo+="(Nomina.TipoPrestamo)";
		}
		
		if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPrestamo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoPrestamo.setToolTipText(sToolTipTipoPrestamo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoPrestamo);
		this.jTableDatosTipoPrestamo.setAutoCreateRowSorter(true);
		this.jTableDatosTipoPrestamo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoPrestamo.setRowSelectionAllowed(true);
		this.jTableDatosTipoPrestamo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoPrestamo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoPrestamo = new JButtonMe();
		this.jButtonDuplicarTipoPrestamo = new JButtonMe();
		this.jButtonCopiarTipoPrestamo = new JButtonMe();
		this.jButtonVerFormTipoPrestamo = new JButtonMe();
		this.jButtonNuevoRelacionesTipoPrestamo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoPrestamo = new JButtonMe();
		this.jButtonCerrarTipoPrestamo = new JButtonMe();
		
		this.jScrollPanelDatosTipoPrestamo = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoPrestamo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Prestamo";
		
		if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prestamos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPrestamo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPrestamo.setToolTipText("Acciones");
        this.jPanelAccionesTipoPrestamo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoPrestamo=new ReporteDinamicoJInternalFrame(TipoPrestamoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoPrestamo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoPrestamo=new ImportacionJInternalFrame(TipoPrestamoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoPrestamo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoPrestamo = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoPrestamo.setText("Orden");
		this.jButtonAbrirOrderByTipoPrestamo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPrestamo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPrestamo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrestamo,false,this);
			
			//this.cargarOrderByTipoPrestamo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPrestamo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrestamo,true,this);
			
			//this.cargarOrderByTipoPrestamo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoPrestamo.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosTipoPrestamo.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosTipoPrestamo.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosTipoPrestamo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPrestamo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPrestamo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoPrestamo.setText("Nuevo");
		this.jButtonDuplicarTipoPrestamo.setText("Duplicar");
		this.jButtonCopiarTipoPrestamo.setText("Copiar");
		this.jButtonVerFormTipoPrestamo.setText("Ver");
		this.jButtonNuevoRelacionesTipoPrestamo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoPrestamo.setText("Guardar");
		this.jButtonCerrarTipoPrestamo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPrestamo,"nuevo_button","Nuevo",this.tipoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoPrestamo,"duplicar_button","Duplicar",this.tipoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoPrestamo,"copiar_button","Copiar",this.tipoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoPrestamo,"ver_form","Ver",this.tipoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoPrestamo,"nuevorelaciones_button","Nuevo Rel",this.tipoprestamoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPrestamo,"guardarcambiostabla_button","Guardar",this.tipoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPrestamo,"cerrar_button","Salir",this.tipoprestamoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoPrestamo.setToolTipText("Nuevo"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoPrestamo.setToolTipText("Duplicar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoPrestamo.setToolTipText("Copiar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoPrestamo.setToolTipText("Ver"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoPrestamo.setToolTipText("Nuevo Rel"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoPrestamo.setToolTipText("Guardar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPrestamo.setToolTipText("Salir"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPrestamo";
		inputMap = this.jButtonNuevoTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPrestamo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPrestamo"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoPrestamo";
		inputMap = this.jButtonDuplicarTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoPrestamo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoPrestamo"));
		
		//COPIAR
		sMapKey = "CopiarTipoPrestamo";
		inputMap = this.jButtonCopiarTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoPrestamo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoPrestamo"));
		
		//VEr FORM
		sMapKey = "VerFormTipoPrestamo";
		inputMap = this.jButtonVerFormTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoPrestamo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoPrestamo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoPrestamo";
		inputMap = this.jButtonNuevoRelacionesTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoPrestamo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoPrestamo";
		inputMap = this.jButtonModificarTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoPrestamo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoPrestamo";
		inputMap = this.jButtonCerrarTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPrestamo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPrestamo";
		inputMap = this.jButtonGuardarCambiosTablaTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPrestamo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoPrestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoPrestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoPrestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoPrestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoPrestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoPrestamo.setName("jPanelParametrosReportesTipoPrestamo"); 
		
		this.jPanelParametrosReportesAccionesTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoPrestamo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoPrestamo.setName("jPanelParametrosReportesAccionesTipoPrestamo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoPrestamo = new JButtonMe();
		this.jButtonRecargarInformacionTipoPrestamo.setText("Recargar");
		this.jButtonRecargarInformacionTipoPrestamo.setToolTipText("Recargar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoPrestamo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoPrestamo = new JButtonMe();
		this.jButtonProcesarInformacionTipoPrestamo.setText("Procesar");
		this.jButtonProcesarInformacionTipoPrestamo.setToolTipText("Procesar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoPrestamo.setVisible(false);
			
		this.jButtonProcesarInformacionTipoPrestamo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPrestamo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPrestamo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPrestamo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoPrestamo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPrestamo.setText("TIPO");       
		this.jComboBoxTiposReportesTipoPrestamo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPrestamo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoPrestamo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoPrestamo.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoPrestamo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoPrestamo.setText("Accion");
		this.jComboBoxTiposRelacionesTipoPrestamo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPrestamo.setText("Accion");
		this.jComboBoxTiposAccionesTipoPrestamo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoPrestamo.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoPrestamo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoPrestamo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoPrestamo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPrestamo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPrestamo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoPrestamo = new JLabelMe();
		
		this.jLabelAccionesTipoPrestamo.setText("Acciones");		
		this.jLabelAccionesTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoPrestamo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoPrestamo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoPrestamo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoPrestamo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoPrestamo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoPrestamo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoPrestamo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoPrestamo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoPrestamo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoPrestamo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoPrestamo.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoPrestamo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoPrestamo = new JButtonMe();
		//this.jButtonAnterioresTipoPrestamo.setText("<<");
        this.jButtonAnterioresTipoPrestamo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoPrestamo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoPrestamo = new JButtonMe();
		//this.jButtonSiguientesTipoPrestamo.setText(">>");
        this.jButtonSiguientesTipoPrestamo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoPrestamo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoPrestamo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoPrestamo.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoPrestamo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoPrestamo,"nuevoguardarcambios_button","Nue",this.tipoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoPrestamo";
		inputMap = this.jButtonNuevoGuardarCambiosTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoPrestamo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoPrestamo";
		inputMap = this.jButtonRecargarInformacionTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoPrestamo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoPrestamo";
		inputMap = this.jButtonSiguientesTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoPrestamo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoPrestamo";
		inputMap = this.jButtonAnterioresTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoPrestamo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoPrestamo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoPrestamo.setMinimumSize(new Dimension(this.getWidth(),TipoPrestamoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPrestamoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPrestamo.setMaximumSize(new Dimension(this.getWidth(),TipoPrestamoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPrestamoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPrestamo.setPreferredSize(new Dimension(this.getWidth(),TipoPrestamoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPrestamoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoPrestamo = new GridBagLayout();

			this.jPanelPaginacionTipoPrestamo.setLayout(gridaBagLayoutPaginacionTipoPrestamo);						
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrestamo.gridy = 0;
			this.gridBagConstraintsTipoPrestamo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoPrestamo.add(this.jButtonAnterioresTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
					
						
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPrestamo.gridy = 0;
			
			this.jPanelPaginacionTipoPrestamo.add(this.jButtonNuevoGuardarCambiosTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
						
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoPrestamo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPrestamo.gridy = 0;
			this.jPanelPaginacionTipoPrestamo.add(this.jButtonSiguientesTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrestamo.gridy = 1;
			this.gridBagConstraintsTipoPrestamo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrestamo.add(this.jButtonNuevoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
				this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoPrestamo.gridy = 1;
				this.gridBagConstraintsTipoPrestamo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoPrestamo.add(this.jButtonNuevoRelacionesTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
			}
			
			
			if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
				this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoPrestamo.gridy = 1;
				this.gridBagConstraintsTipoPrestamo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoPrestamo.add(this.jButtonGuardarCambiosTablaTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
			}
			
			
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrestamo.gridy = 1;
			this.gridBagConstraintsTipoPrestamo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrestamo.add(this.jButtonDuplicarTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrestamo.gridy = 1;
			this.gridBagConstraintsTipoPrestamo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrestamo.add(this.jButtonCopiarTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrestamo.gridy = 1;
			this.gridBagConstraintsTipoPrestamo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrestamo.add(this.jButtonVerFormTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrestamo.gridy = 1;
			this.gridBagConstraintsTipoPrestamo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoPrestamo.add(this.jButtonCerrarTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		
		
		
		this.jButtonRecargarInformacionTipoPrestamo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPrestamo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPrestamo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoPrestamo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPrestamo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPrestamo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoPrestamo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPrestamo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPrestamo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoPrestamo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPrestamo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPrestamo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoPrestamo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPrestamo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPrestamo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoPrestamo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPrestamo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPrestamo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoPrestamo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrestamo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrestamo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoPrestamo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPrestamo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPrestamo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoPrestamo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPrestamo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPrestamo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoPrestamo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPrestamo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPrestamo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoPrestamo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPrestamo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPrestamo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoPrestamo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPrestamo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPrestamo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoPrestamo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoPrestamo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoPrestamo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoPrestamo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoPrestamo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoPrestamo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoPrestamo.setLayout(gridaBagParametrosReportesTipoPrestamo);
			this.jPanelParametrosReportesAccionesTipoPrestamo.setLayout(gridaBagParametrosReportesAccionesTipoPrestamo);
			
			
			this.jPanelParametrosAuxiliar1TipoPrestamo.setLayout(gridaBagParametrosAuxiliar1TipoPrestamo);
			this.jPanelParametrosAuxiliar2TipoPrestamo.setLayout(gridaBagParametrosAuxiliar2TipoPrestamo);
			this.jPanelParametrosAuxiliar3TipoPrestamo.setLayout(gridaBagParametrosAuxiliar3TipoPrestamo);
			this.jPanelParametrosAuxiliar4TipoPrestamo.setLayout(gridaBagParametrosAuxiliar4TipoPrestamo);
			//this.jPanelParametrosAuxiliar5TipoPrestamo.setLayout(gridaBagParametrosAuxiliar2TipoPrestamo);			
			
			
			
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrestamo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrestamo.add(this.jButtonRecargarInformacionTipoPrestamo, this.gridBagConstraintsTipoPrestamo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrestamo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPrestamo.add(this.jComboBoxTiposPaginacionTipoPrestamo, this.gridBagConstraintsTipoPrestamo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrestamo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPrestamo.add(this.jCheckBoxConAltoMaximoTablaTipoPrestamo, this.gridBagConstraintsTipoPrestamo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrestamo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPrestamo.add(this.jComboBoxTiposArchivosReportesTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrestamo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrestamo.add(this.jPanelParametrosAuxiliar1TipoPrestamo, this.gridBagConstraintsTipoPrestamo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrestamo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrestamo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoPrestamo.add(this.jComboBoxTiposReportesTipoPrestamo, this.gridBagConstraintsTipoPrestamo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrestamo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrestamo.add(this.jPanelParametrosAuxiliar4TipoPrestamo, this.gridBagConstraintsTipoPrestamo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrestamo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrestamo.add(this.jComboBoxTiposReportesTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrestamo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPrestamo.add(this.jCheckBoxGenerarReporteTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrestamo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrestamo.add(this.jPanelParametrosAuxiliar2TipoPrestamo, this.gridBagConstraintsTipoPrestamo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrestamo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPrestamo.add(this.jLabelAccionesTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
				this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoPrestamo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoPrestamo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoPrestamo.add(this.jButtonAbrirOrderByTipoPrestamo, this.gridBagConstraintsTipoPrestamo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrestamo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrestamo.add(this.jComboBoxTiposSeleccionarTipoPrestamo, this.gridBagConstraintsTipoPrestamo);			
			
			
			/*
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrestamo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPrestamo.add(this.jCheckBoxSeleccionarTodosTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrestamo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrestamo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPrestamo.add(this.jCheckBoxSeleccionarTodosTipoPrestamo, this.gridBagConstraintsTipoPrestamo);															
				
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrestamo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrestamo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPrestamo.add(this.jCheckBoxSeleccionadosTipoPrestamo, this.gridBagConstraintsTipoPrestamo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrestamo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrestamo.add(this.jPanelParametrosAuxiliar3TipoPrestamo, this.gridBagConstraintsTipoPrestamo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrestamo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrestamo.add(this.jComboBoxTiposRelacionesTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
				
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrestamo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrestamo.add(this.jComboBoxTiposAccionesTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
	
				
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrestamo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrestamo.add(this.jTextFieldValorCampoGeneralTipoPrestamo, this.gridBagConstraintsTipoPrestamo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoPrestamo = new GridBagLayout();

			this.jScrollPanelDatosTipoPrestamo.setLayout(gridaBagLayoutDatosTipoPrestamo);
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrestamo.gridy = 0;
			this.gridBagConstraintsTipoPrestamo.gridx = 0;
			
			this.jScrollPanelDatosTipoPrestamo.add(this.jTableDatosTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoPrestamo.setViewportView(this.jTableDatosTipoPrestamo);
		this.jTableDatosTipoPrestamo.setFillsViewportHeight(true);
		this.jTableDatosTipoPrestamo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoPrestamo= new GridBagLayout();
		this.jPanelAccionesTipoPrestamo.setLayout(gridaBagLayoutAccionesTipoPrestamo);
		
		
		/*	
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrestamo.gridy = 0;
		this.gridBagConstraintsTipoPrestamo.gridx = 0;
			
		this.jPanelAccionesTipoPrestamo.add(this.jButtonNuevoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCuentaContableTipoPrestamo= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableTipoPrestamo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableTipoPrestamo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableTipoPrestamo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableTipoPrestamo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableTipoPrestamo.setLayout(gridaBagLayoutFK_IdCuentaContableTipoPrestamo);

		gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrestamo.gridy = 0;
		gridBagConstraintsTipoPrestamo.gridx = 0;
		jPanelFK_IdCuentaContableTipoPrestamo.add(jLabelid_cuenta_contableFK_IdCuentaContableTipoPrestamo, gridBagConstraintsTipoPrestamo);

		gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrestamo.gridy = 0;
		gridBagConstraintsTipoPrestamo.gridx = 1;
		jPanelFK_IdCuentaContableTipoPrestamo.add(jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo, gridBagConstraintsTipoPrestamo);

		gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrestamo.gridy = 1;
		gridBagConstraintsTipoPrestamo.gridx =1;
		jPanelFK_IdCuentaContableTipoPrestamo.add(jButtonFK_IdCuentaContableTipoPrestamo, gridBagConstraintsTipoPrestamo);

		jTabbedPaneBusquedasTipoPrestamo.addTab("1.-Por Cuenta Contable ", jPanelFK_IdCuentaContableTipoPrestamo);
		jTabbedPaneBusquedasTipoPrestamo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoPrestamoTipoPrestamo= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPrestamoTipoPrestamo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPrestamoTipoPrestamo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPrestamoTipoPrestamo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPrestamoTipoPrestamo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPrestamoTipoPrestamo.setLayout(gridaBagLayoutFK_IdTipoPrestamoTipoPrestamo);

		gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrestamo.gridy = 0;
		gridBagConstraintsTipoPrestamo.gridx = 0;
		jPanelFK_IdTipoPrestamoTipoPrestamo.add(jLabelid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo, gridBagConstraintsTipoPrestamo);

		gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrestamo.gridy = 0;
		gridBagConstraintsTipoPrestamo.gridx = 1;
		jPanelFK_IdTipoPrestamoTipoPrestamo.add(jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo, gridBagConstraintsTipoPrestamo);

		gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrestamo.gridy = 1;
		gridBagConstraintsTipoPrestamo.gridx =1;
		jPanelFK_IdTipoPrestamoTipoPrestamo.add(jButtonFK_IdTipoPrestamoTipoPrestamo, gridBagConstraintsTipoPrestamo);

		jTabbedPaneBusquedasTipoPrestamo.addTab("2.-Por Idrubro Emplea ", jPanelFK_IdTipoPrestamoTipoPrestamo);
		jTabbedPaneBusquedasTipoPrestamo.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPrestamo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPrestamo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();						
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPrestamo.gridx = 0;		
			//this.gridBagConstraintsTipoPrestamo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPrestamo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoPrestamo, this.gridBagConstraintsTipoPrestamo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoPrestamo.gridx = 0;		
		//this.gridBagConstraintsTipoPrestamo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoPrestamo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoPrestamo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPrestamo.gridx = 0;		
			this.gridBagConstraintsTipoPrestamo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoPrestamo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoPrestamo, this.gridBagConstraintsTipoPrestamo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrestamo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoPrestamo, this.gridBagConstraintsTipoPrestamo);								
		
		
		/*
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrestamo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		*/		
		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPrestamo.gridx =0;
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPrestamo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
				
		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrestamo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoPrestamoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoPrestamo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPrestamo = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoPrestamo.setLayout(gridaBagLayoutBusquedasParametrosTipoPrestamo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoPrestamo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPrestamo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrestamo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrestamo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrestamo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
			
			
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrestamo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		
			
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrestamo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoPrestamo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoPrestamo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoPrestamo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoPrestamo.setName("jPanelReporteDinamicoTipoPrestamo"); 
		
		this.jPanelReporteDinamicoTipoPrestamo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPrestamo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPrestamo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoPrestamo.setLayout(gridaBagLayoutReporteDinamicoTipoPrestamo);
		
		
		this.jInternalFrameReporteDinamicoTipoPrestamo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoPrestamo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPrestamo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoPrestamo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoPrestamo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoPrestamo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoPrestamo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoPrestamo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoPrestamo.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoPrestamo.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoPrestamo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoPrestamo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPrestamo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPrestamo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prestamos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoPrestamo = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoPrestamo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPrestamo.add(this.jLabelColumnasSelectReporteTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoPrestamo = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoPrestamo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoPrestamo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoPrestamo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPrestamo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPrestamo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoPrestamo=new JScrollPane(this.jListColumnasSelectReporteTipoPrestamo);
			
			this.jScrollColumnasSelectReporteTipoPrestamo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPrestamo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPrestamo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoPrestamo.add(this.jListColumnasSelectReporteTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		this.jPanelReporteDinamicoTipoPrestamo.add(this.jScrollColumnasSelectReporteTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoPrestamo = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoPrestamo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPrestamo.add(this.jLabelRelacionesSelectReporteTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoPrestamo = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoPrestamo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoPrestamo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoPrestamo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPrestamo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPrestamo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoPrestamo=new JScrollPane(this.jListRelacionesSelectReporteTipoPrestamo);
			
			this.jScrollRelacionesSelectReporteTipoPrestamo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPrestamo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPrestamo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoPrestamo.add(this.jListRelacionesSelectReporteTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		this.jPanelReporteDinamicoTipoPrestamo.add(this.jScrollRelacionesSelectReporteTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoPrestamo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoPrestamo = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoPrestamo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoPrestamo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoPrestamo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoPrestamo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPrestamo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPrestamo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrestamo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrestamo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrestamo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrestamo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrestamo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoPrestamo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoPrestamo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPrestamo.add(this.jLabelGenerarExcelReporteDinamicoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoPrestamo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoPrestamo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoPrestamo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoPrestamo.setToolTipText("Generar EXCEL"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoPrestamo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoPrestamo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoPrestamo.add(this.jButtonGenerarExcelReporteDinamicoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrestamo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrestamo.add(this.jComboBoxTiposReportesDinamicoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoPrestamo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoPrestamo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrestamo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPrestamo.add(this.jLabelTiposArchivoReporteDinamicoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrestamo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrestamo.add(this.jComboBoxTiposArchivosReportesDinamicoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoPrestamo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoPrestamo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoPrestamo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoPrestamo.setToolTipText("Generar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrestamo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrestamo.add(this.jButtonGenerarReporteDinamicoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoPrestamo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoPrestamo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoPrestamo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoPrestamo.setToolTipText("Cancelar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrestamo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrestamo.add(this.jButtonCerrarReporteDinamicoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoPrestamo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoPrestamo= new JScrollPane(jPanelReporteDinamicoTipoPrestamo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoPrestamo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPrestamo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPrestamo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prestamos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrestamo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoPrestamo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoPrestamo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoPrestamo);
		this.jInternalFrameReporteDinamicoTipoPrestamo.getContentPane().add(this.jScrollPanelReporteDinamicoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoPrestamo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoPrestamo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoPrestamo.setName("jPanelImportacionTipoPrestamo"); 
		
		this.jPanelImportacionTipoPrestamo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPrestamo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPrestamo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoPrestamo.setLayout(gridaBagLayoutImportacionTipoPrestamo);
		
		
		this.jInternalFrameImportacionTipoPrestamo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoPrestamo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoPrestamo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPrestamo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoPrestamo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPrestamo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPrestamo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoPrestamo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPrestamo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPrestamo.setResizable(true);
	    this.jInternalFrameImportacionTipoPrestamo.setClosable(true);
	    this.jInternalFrameImportacionTipoPrestamo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoPrestamo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPrestamo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPrestamo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoPrestamo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPrestamo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPrestamo.setResizable(true);
	    this.jInternalFrameImportacionTipoPrestamo.setClosable(true);
	    this.jInternalFrameImportacionTipoPrestamo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoPrestamo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPrestamo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPrestamo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prestamos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoPrestamo = new JLabelMe();

		this.jLabelArchivoImportacionTipoPrestamo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrestamo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPrestamo.add(this.jLabelArchivoImportacionTipoPrestamo, this.gridBagConstraintsTipoPrestamo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoPrestamo = new JFileChooser();		
		this.jFileChooserImportacionTipoPrestamo.setToolTipText("ESCOGER ARCHIVO"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoPrestamo = new JButtonMe();
		this.jButtonAbrirImportacionTipoPrestamo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoPrestamo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoPrestamo.setToolTipText("Generar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrestamo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrestamo.add(this.jButtonAbrirImportacionTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoPrestamo = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoPrestamo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrestamo.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPrestamo.add(this.jLabelPathArchivoImportacionTipoPrestamo, this.gridBagConstraintsTipoPrestamo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoPrestamo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoPrestamo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPrestamo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPrestamo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrestamo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrestamo.add(this.jTextFieldPathArchivoImportacionTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoPrestamo = new JButtonMe();
		this.jButtonGenerarImportacionTipoPrestamo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoPrestamo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoPrestamo.setToolTipText("Generar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrestamo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrestamo.add(this.jButtonGenerarImportacionTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoPrestamo = new JButtonMe();
		this.jButtonCerrarImportacionTipoPrestamo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoPrestamo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoPrestamo.setToolTipText("Cancelar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrestamo.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrestamo.add(this.jButtonCerrarImportacionTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoPrestamo = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoPrestamo= new JScrollPane(jPanelImportacionTipoPrestamo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoPrestamo.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoPrestamo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoPrestamo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoPrestamo);
		this.jInternalFrameImportacionTipoPrestamo.getContentPane().add(this.jScrollPanelImportacionTipoPrestamo, this.gridBagConstraintsTipoPrestamo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoPrestamo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoPrestamo = new JButtonMe();
			this.jButtonAbrirOrderByTipoPrestamo.setText("Orden");
			this.jButtonAbrirOrderByTipoPrestamo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPrestamo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoPrestamo";
			inputMap = this.jButtonAbrirOrderByTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoPrestamo"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoPrestamo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoPrestamo.setName("jPanelOrderByTipoPrestamo"); 
			
			this.jPanelOrderByTipoPrestamo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPrestamo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPrestamo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoPrestamo.setLayout(gridaBagLayoutOrderByTipoPrestamo);
			
			
			this.jTableDatosTipoPrestamoOrderBy = new JTableMe();        
			this.jTableDatosTipoPrestamoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoPrestamoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoPrestamoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoPrestamoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoPrestamoOrderBy.setViewportView(this.jTableDatosTipoPrestamoOrderBy);
			this.jTableDatosTipoPrestamoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoPrestamoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoPrestamo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoPrestamo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoPrestamo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoPrestamo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoPrestamo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoPrestamo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoPrestamo.setTitle("Orden");
			this.jInternalFrameOrderByTipoPrestamo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoPrestamo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoPrestamo.setResizable(true);
			this.jInternalFrameOrderByTipoPrestamo.setClosable(true);
			this.jInternalFrameOrderByTipoPrestamo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoPrestamo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPrestamo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPrestamo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prestamos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoPrestamo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoPrestamo.ipady =150;
				
			this.jPanelOrderByTipoPrestamo.add(jScrollPanelDatosTipoPrestamoOrderBy, this.gridBagConstraintsTipoPrestamo);//this.jTableDatosTipoPrestamoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoPrestamo = new JButtonMe();
			this.jButtonCerrarOrderByTipoPrestamo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoPrestamo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoPrestamo.setToolTipText("Cancelar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrestamo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoPrestamo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoPrestamo.add(this.jButtonCerrarOrderByTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoPrestamo = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoPrestamo= new JScrollPane(jPanelOrderByTipoPrestamo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoPrestamo.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoPrestamo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoPrestamo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoPrestamo);
			
			this.jInternalFrameOrderByTipoPrestamo.getContentPane().add(this.jScrollPanelOrderByTipoPrestamo, this.gridBagConstraintsTipoPrestamo);			
		
		} else {
			this.jButtonAbrirOrderByTipoPrestamo = new JButtonMe();
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
		int iWidthTableCalculado=0;//1530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoprestamoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoPrestamo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoPrestamo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoPrestamo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoPrestamo.getRowHeight();//TipoPrestamoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoPrestamoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPrestamo.isSelected()) {
					iHeightTable=TipoPrestamoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPrestamoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPrestamoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoPrestamoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPrestamo.isSelected()) {
					iHeightTable=TipoPrestamoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPrestamoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPrestamoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoPrestamo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPrestamo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPrestamo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoPrestamo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPrestamo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPrestamo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoPrestamo!=null && this.jInternalFrameOrderByTipoPrestamo.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoPrestamo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoPrestamo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoPrestamo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoPrestamo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoPrestamo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoPrestamo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoPrestamo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoPrestamo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPrestamo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPrestamo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoprestamoLogic.getTipoPrestamos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprestamos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoPrestamo> TraerTipoPrestamoBeans(List<TipoPrestamo> tipoprestamos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoPrestamo tipoprestamo:tipoprestamos) {
					
				if(!(TipoPrestamoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoPrestamoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoprestamo.setsDetalleGeneralEntityReporte(TipoPrestamoConstantesFunciones.getTipoPrestamoDescripcion(tipoprestamo));
										
					tipoprestamo.setcon_pago_descripcion(TipoPrestamoConstantesFunciones.getcon_pagoDescripcion(tipoprestamo));	
					
					

					if(tipoprestamo.getPrestamos()!=null && Funciones.existeClass(classes,Prestamo.class)) {
						try{tipoprestamo.setprestamosDescripcionReporte(new JRBeanCollectionDataSource(PrestamoJInternalFrame.TraerPrestamoBeans(tipoprestamo.getPrestamos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoprestamo.setsDetalleGeneralEntityReporte(tipoprestamo.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoprestamobeans.add(tipoprestamobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoprestamos;
    }
	//PARA REPORTES FIN
}
