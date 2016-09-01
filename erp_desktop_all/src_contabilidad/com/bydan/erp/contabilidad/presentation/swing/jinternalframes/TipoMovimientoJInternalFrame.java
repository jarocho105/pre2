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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;

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
import com.bydan.erp.contabilidad.util.TipoMovimientoConstantesFunciones;

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
public class TipoMovimientoJInternalFrame extends TipoMovimientoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoMovimiento;
	
	protected JMenuBar jmenuBarTipoMovimiento;
	
	protected JMenu jmenuTipoMovimiento;
	protected JMenu jmenuDatosTipoMovimiento;
	protected JMenu jmenuArchivoTipoMovimiento;
	protected JMenu jmenuAccionesTipoMovimiento;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoMovimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMovimiento;	
	protected GridBagConstraints gridBagConstraintsTipoMovimiento;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoMovimientoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoMovimiento;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoMovimiento;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoMovimiento;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoMovimiento> tipomovimientos;		
	public List<TipoMovimiento> tipomovimientosEliminados;	
	public List<TipoMovimiento> tipomovimientosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoMovimiento;		
	protected JButton jButtonAbrirOrderByTipoMovimiento;
	
	
	//protected JPanel jPanelOrderByTipoMovimiento;
	//public JScrollPane jScrollPanelOrderByTipoMovimiento;	
	//protected JButton jButtonCerrarOrderByTipoMovimiento;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoMovimientoLogic tipomovimientoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoMovimiento;
	public JScrollPane jScrollPanelDatosEdicionTipoMovimiento;
	public JScrollPane jScrollPanelDatosGeneralTipoMovimiento;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoMovimientoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoMovimiento;
	//public JScrollPane jScrollPanelImportacionTipoMovimiento;
	
	
	
	protected JPanel jPanelAccionesTipoMovimiento;
	
    protected JPanel jPanelPaginacionTipoMovimiento;
    protected JPanel jPanelParametrosReportesTipoMovimiento;
	protected JPanel jPanelParametrosReportesAccionesTipoMovimiento;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoMovimiento;
	protected JPanel jPanelParametrosAuxiliar2TipoMovimiento;
	protected JPanel jPanelParametrosAuxiliar3TipoMovimiento;
	protected JPanel jPanelParametrosAuxiliar4TipoMovimiento;
	//protected JPanel jPanelParametrosAuxiliar5TipoMovimiento;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoMovimiento;
	//protected JPanel jPanelImportacionTipoMovimiento;
	
	
	public JTable jTableDatosTipoMovimiento;
	
	
	
	//public JTable jTableDatosTipoMovimientoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoMovimiento;
	protected JButton jButtonDuplicarTipoMovimiento;
	protected JButton jButtonCopiarTipoMovimiento;
	protected JButton jButtonVerFormTipoMovimiento;
	protected JButton jButtonNuevoRelacionesTipoMovimiento;
	protected JButton jButtonModificarTipoMovimiento;
	
    protected JButton jButtonGuardarCambiosTablaTipoMovimiento;
	protected JButton jButtonCerrarTipoMovimiento;
	
	
	protected JButton jButtonRecargarInformacionTipoMovimiento;
	protected JButton jButtonProcesarInformacionTipoMovimiento;
	
	
	protected JButton jButtonAnterioresTipoMovimiento;
	protected JButton jButtonSiguientesTipoMovimiento;
	protected JButton jButtonNuevoGuardarCambiosTipoMovimiento;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoMovimiento;
	//protected JButton jButtonCerrarReporteDinamicoTipoMovimiento;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoMovimiento;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoMovimiento;
	//protected JButton jButtonGenerarImportacionTipoMovimiento;
	//protected JButton jButtonCerrarImportacionTipoMovimiento;
	//protected JFileChooser jFileChooserImportacionTipoMovimiento;
	//protected File fileImportacionTipoMovimiento;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMovimiento;
	protected JButton jButtonDuplicarToolBarTipoMovimiento;
	protected JButton jButtonNuevoRelacionesToolBarTipoMovimiento;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoMovimiento;
	protected JButton jButtonCopiarToolBarTipoMovimiento;
	protected JButton jButtonVerFormToolBarTipoMovimiento;
	public JButton jButtonGuardarCambiosTablaToolBarTipoMovimiento;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMovimiento;
	protected JButton jButtonCerrarToolBarTipoMovimiento;
	
	protected JButton jButtonRecargarInformacionToolBarTipoMovimiento;
	protected JButton jButtonProcesarInformacionToolBarTipoMovimiento;
	protected JButton jButtonAnterioresToolBarTipoMovimiento;
	protected JButton jButtonSiguientesToolBarTipoMovimiento;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoMovimiento;
	protected JButton jButtonAbrirOrderByToolBarTipoMovimiento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMovimiento;
	protected JMenuItem jMenuItemDuplicarTipoMovimiento;
	protected JMenuItem jMenuItemNuevoRelacionesTipoMovimiento;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoMovimiento;
	protected JMenuItem jMenuItemCopiarTipoMovimiento;
	protected JMenuItem jMenuItemVerFormTipoMovimiento;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMovimiento;
	protected JMenuItem jMenuItemCerrarTipoMovimiento;
	protected JMenuItem jMenuItemDetalleCerrarTipoMovimiento;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoMovimiento;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMovimiento;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoMovimiento;
	protected JMenuItem jMenuItemProcesarInformacionTipoMovimiento;
	protected JMenuItem jMenuItemAnterioresTipoMovimiento;
	protected JMenuItem jMenuItemSiguientesTipoMovimiento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMovimiento;
	protected JMenuItem jMenuItemAbrirOrderByTipoMovimiento;
	protected JMenuItem jMenuItemMostrarOcultarTipoMovimiento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMovimiento;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoMovimiento;
	protected JCheckBox jCheckBoxSeleccionadosTipoMovimiento;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoMovimiento;
	protected JCheckBox jCheckBoxConGraficoReporteTipoMovimiento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoMovimiento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoMovimiento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMovimiento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoMovimiento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoMovimiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoMovimiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMovimiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMovimiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoMovimiento;
	protected JTextField jTextFieldValorCampoGeneralTipoMovimiento;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoMovimiento;
	//public JList<Reporte> jListColumnasSelectReporteTipoMovimiento;
	//public JScrollPane jScrollColumnasSelectReporteTipoMovimiento;
	
	//public JLabel jLabelRelacionesSelectReporteTipoMovimiento;
	//public JList<Reporte> jListRelacionesSelectReporteTipoMovimiento;
	//public JScrollPane jScrollRelacionesSelectReporteTipoMovimiento;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoMovimiento;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoMovimiento;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoMovimiento;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoMovimiento;
	
		
	//public JLabel jLabelArchivoImportacionTipoMovimiento;	
	//public JLabel jLabelPathArchivoImportacionTipoMovimiento;
	//protected JTextField jTextFieldPathArchivoImportacionTipoMovimiento;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoMovimiento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoMovimiento;
	
	//public JLabel jLabelColumnaCategoriaValorTipoMovimiento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoMovimiento;
	
	//public JLabel jLabelColumnasValoresGraficoTipoMovimiento;
	//public JList<Reporte> jListColumnasValoresGraficoTipoMovimiento;
	//public JScrollPane jScrollColumnasValoresGraficoTipoMovimiento;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoMovimiento;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoMovimiento;	
	
	
	
	
	
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
	public TipoMovimientoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoMovimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimientoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMovimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimientoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMovimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimientoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMovimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoMovimiento)	{
		this.jButtonRecargarInformacionTipoMovimiento = jButtonRecargarInformacionTipoMovimiento;
	}
	
	public JButton getjButtonProcesarInformacionTipoMovimiento() {
		return this.jButtonProcesarInformacionTipoMovimiento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMovimiento)	{
		this.jButtonProcesarInformacionTipoMovimiento = jButtonProcesarInformacionTipoMovimiento;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoMovimiento() {
		return this.jButtonRecargarInformacionTipoMovimiento;
	}
	
	
	public List<TipoMovimiento> gettipomovimientos() {
		return this.tipomovimientos;
	}

	public void settipomovimientos(List<TipoMovimiento> tipomovimientos) {
		this.tipomovimientos = tipomovimientos;
	}
	
	public List<TipoMovimiento> gettipomovimientosAux() {
		return this.tipomovimientosAux;
	}

	public void settipomovimientosAux(List<TipoMovimiento> tipomovimientosAux) {
		this.tipomovimientosAux = tipomovimientosAux;
	}
	
	public List<TipoMovimiento> gettipomovimientosEliminados() {
		return this.tipomovimientosEliminados;
	}

	public void setTipoMovimientosEliminados(List<TipoMovimiento> tipomovimientosEliminados) {
		this.tipomovimientosEliminados = tipomovimientosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoMovimiento() {
		return jComboBoxTiposSeleccionarTipoMovimiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoMovimiento(
			JComboBox jComboBoxTiposSeleccionarTipoMovimiento) {
		this.jComboBoxTiposSeleccionarTipoMovimiento = jComboBoxTiposSeleccionarTipoMovimiento;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoMovimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoMovimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoMovimiento .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoMovimiento() {
		return jTextFieldValorCampoGeneralTipoMovimiento;
	}

	public void setjTextFieldValorCampoGeneralTipoMovimiento(
			JTextField jTextFieldValorCampoGeneralTipoMovimiento) {
		this.jTextFieldValorCampoGeneralTipoMovimiento = jTextFieldValorCampoGeneralTipoMovimiento;
	}

	public void setBorderResaltarValorCampoGeneralTipoMovimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoMovimiento .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoMovimiento() {
		return this.jCheckBoxSeleccionarTodosTipoMovimiento;
	}

	public void setjCheckBoxSeleccionarTodosTipoMovimiento(
			JCheckBox jCheckBoxSeleccionarTodosTipoMovimiento) {
		this.jCheckBoxSeleccionarTodosTipoMovimiento = jCheckBoxSeleccionarTodosTipoMovimiento;
	}

	public void setBorderResaltarSeleccionarTodosTipoMovimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoMovimiento .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoMovimiento() {
		return this.jCheckBoxSeleccionadosTipoMovimiento;
	}

	public void setjCheckBoxSeleccionadosTipoMovimiento(
			JCheckBox jCheckBoxSeleccionadosTipoMovimiento) {
		this.jCheckBoxSeleccionadosTipoMovimiento = jCheckBoxSeleccionadosTipoMovimiento;
	}
	
	public void setBorderResaltarSeleccionadosTipoMovimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoMovimiento .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoMovimiento() {
		return this.jComboBoxTiposArchivosReportesTipoMovimiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoMovimiento(
			JComboBox jComboBoxTiposArchivosReportesTipoMovimiento) {
		this.jComboBoxTiposArchivosReportesTipoMovimiento = jComboBoxTiposArchivosReportesTipoMovimiento;
	}

	public void setBorderResaltarTiposArchivosReportesTipoMovimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoMovimiento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoMovimiento() {
		return this.jComboBoxTiposReportesTipoMovimiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoMovimiento(
			JComboBox jComboBoxTiposReportesTipoMovimiento) {
		this.jComboBoxTiposReportesTipoMovimiento = jComboBoxTiposReportesTipoMovimiento;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoMovimiento() {
	//	return jComboBoxTiposReportesDinamicoTipoMovimiento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoMovimiento(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoMovimiento) {
	//	this.jComboBoxTiposReportesDinamicoTipoMovimiento = jComboBoxTiposReportesDinamicoTipoMovimiento;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoMovimiento() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoMovimiento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoMovimiento(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMovimiento) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoMovimiento = jComboBoxTiposArchivosReportesDinamicoTipoMovimiento;
	//}
	
	public void setBorderResaltarTiposReportesTipoMovimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoMovimiento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoMovimiento() {
		return this.jComboBoxTiposGraficosReportesTipoMovimiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoMovimiento(
			JComboBox jComboBoxTiposGraficosReportesTipoMovimiento) {
		this.jComboBoxTiposGraficosReportesTipoMovimiento = jComboBoxTiposGraficosReportesTipoMovimiento;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoMovimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoMovimiento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoMovimiento() {
		return this.jComboBoxTiposPaginacionTipoMovimiento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoMovimiento(
			JComboBox jComboBoxTiposPaginacionTipoMovimiento) {
		this.jComboBoxTiposPaginacionTipoMovimiento = jComboBoxTiposPaginacionTipoMovimiento;
	}
	
	public void setBorderResaltarTiposPaginacionTipoMovimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoMovimiento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoMovimiento() {
		return this.jComboBoxTiposRelacionesTipoMovimiento;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMovimiento() {
		return this.jComboBoxTiposAccionesTipoMovimiento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMovimiento(
			JComboBox jComboBoxTiposRelacionesTipoMovimiento) {
		this.jComboBoxTiposRelacionesTipoMovimiento = jComboBoxTiposRelacionesTipoMovimiento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMovimiento(
			JComboBox jComboBoxTiposAccionesTipoMovimiento) {
		this.jComboBoxTiposAccionesTipoMovimiento = jComboBoxTiposAccionesTipoMovimiento;
	}
	
	public void setBorderResaltarTiposRelacionesTipoMovimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoMovimiento .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoMovimiento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMovimiento.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoMovimiento .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoMovimiento() {
	//	return jCheckBoxConGraficoDinamicoTipoMovimiento;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoMovimiento(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoMovimiento) {
	//	this.jCheckBoxConGraficoDinamicoTipoMovimiento = jCheckBoxConGraficoDinamicoTipoMovimiento;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoMovimiento() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoMovimiento.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoMovimiento .setBorder(borderResaltar);		
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
		this.tipomovimientoSessionBean=new TipoMovimientoSessionBean();
		
		this.tipomovimientoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomovimientoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomovimientoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoMovimientoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoMovimientoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMovimientoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMovimientoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMovimientoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Movimiento MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoMovimientoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoMovimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoMovimiento= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoMovimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoMovimiento,this.jTtoolBarTipoMovimiento,
							"nuevo","nuevo","Nuevo"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMovimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoMovimiento,this.jTtoolBarTipoMovimiento,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMovimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoMovimiento,this.jTtoolBarTipoMovimiento,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoMovimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoMovimiento,this.jTtoolBarTipoMovimiento,
							"duplicar","duplicar","Duplicar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoMovimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoMovimiento,this.jTtoolBarTipoMovimiento,
							"copiar","copiar","Copiar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoMovimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoMovimiento,this.jTtoolBarTipoMovimiento,
							"ver_form","ver_form","Ver"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoMovimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMovimiento,this.jTtoolBarTipoMovimiento,
							"recargar","recargar","Recargar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoMovimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMovimiento,this.jTtoolBarTipoMovimiento,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoMovimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMovimiento,this.jTtoolBarTipoMovimiento,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoMovimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoMovimiento,this.jTtoolBarTipoMovimiento,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoMovimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoMovimiento,this.jTtoolBarTipoMovimiento,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoMovimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoMovimiento,this.jTtoolBarTipoMovimiento,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoMovimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoMovimiento,this.jTtoolBarTipoMovimiento,
							"cerrar","cerrar","Salir"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoMovimiento=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoMovimiento;
			
				this.jButtonProcesarInformacionToolBarTipoMovimiento=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoMovimiento;
				
		//protected JButton jButtonModificarToolBarTipoMovimiento;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoMovimiento=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoMovimiento=new JMenuMe("General");
		this.jmenuArchivoTipoMovimiento=new JMenuMe("Archivo");
		this.jmenuAccionesTipoMovimiento=new JMenuMe("Acciones");
		this.jmenuDatosTipoMovimiento=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMovimiento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMovimiento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMovimiento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoMovimiento= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoMovimiento.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoMovimiento,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoMovimiento= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoMovimiento.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoMovimiento,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoMovimiento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMovimiento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMovimiento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoMovimiento= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoMovimiento.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoMovimiento,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoMovimiento= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoMovimiento.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoMovimiento,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoMovimiento= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoMovimiento.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoMovimiento,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMovimiento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMovimiento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMovimiento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoMovimiento= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoMovimiento.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoMovimiento,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoMovimiento= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoMovimiento.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoMovimiento,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoMovimiento= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoMovimiento.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoMovimiento,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoMovimiento= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoMovimiento.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoMovimiento,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoMovimiento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoMovimiento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoMovimiento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMovimiento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMovimiento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMovimiento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoMovimiento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoMovimiento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoMovimiento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMovimiento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMovimiento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMovimiento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoMovimiento= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoMovimiento.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoMovimiento,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoMovimiento.add(this.jMenuItemCerrarTipoMovimiento);
			
			this.jmenuAccionesTipoMovimiento.add(this.jMenuItemNuevoTipoMovimiento);
			this.jmenuAccionesTipoMovimiento.add(this.jMenuItemNuevoGuardarCambiosTipoMovimiento);
			this.jmenuAccionesTipoMovimiento.add(this.jMenuItemNuevoRelacionesTipoMovimiento);
			this.jmenuAccionesTipoMovimiento.add(this.jMenuItemGuardarCambiosTablaTipoMovimiento);		
			this.jmenuAccionesTipoMovimiento.add(this.jMenuItemDuplicarTipoMovimiento);		
			this.jmenuAccionesTipoMovimiento.add(this.jMenuItemCopiarTipoMovimiento);		
			this.jmenuAccionesTipoMovimiento.add(this.jMenuItemVerFormTipoMovimiento);		
			
			this.jmenuDatosTipoMovimiento.add(this.jMenuItemRecargarInformacionTipoMovimiento);				
			this.jmenuDatosTipoMovimiento.add(this.jMenuItemAnterioresTipoMovimiento);				
			this.jmenuDatosTipoMovimiento.add(this.jMenuItemSiguientesTipoMovimiento);				
			this.jmenuDatosTipoMovimiento.add(this.jMenuItemAbrirOrderByTipoMovimiento);				
			this.jmenuDatosTipoMovimiento.add(this.jMenuItemMostrarOcultarTipoMovimiento);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoMovimiento.add(this.jMenuItemGuardarCambiosTipoMovimiento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoMovimiento.add(this.jmenuArchivoTipoMovimiento);		
			this.jmenuBarTipoMovimiento.add(this.jmenuAccionesTipoMovimiento);		
			this.jmenuBarTipoMovimiento.add(this.jmenuDatosTipoMovimiento);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoMovimiento);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoMovimiento() {
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
			//this.jInternalFrameDetalleTipoMovimiento = new TipoMovimientoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Movimiento DATOS");
			this.jInternalFrameDetalleFormTipoMovimiento = new TipoMovimientoDetalleFormJInternalFrame(jDesktopPane,this.tipomovimientoSessionBean.getConGuardarRelaciones(),this.tipomovimientoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoMovimiento = null;//new TipoMovimientoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMovimiento= new GridBagLayout();
		
		
		this.jTableDatosTipoMovimiento = new JTableMe();      
		
		String sToolTipTipoMovimiento="";
		sToolTipTipoMovimiento=TipoMovimientoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMovimiento+="(Contabilidad.TipoMovimiento)";
		}
		
		if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMovimiento+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoMovimiento.setToolTipText(sToolTipTipoMovimiento);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoMovimiento);
		this.jTableDatosTipoMovimiento.setAutoCreateRowSorter(true);
		this.jTableDatosTipoMovimiento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoMovimiento.setRowSelectionAllowed(true);
		this.jTableDatosTipoMovimiento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoMovimiento,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoMovimiento = new JButtonMe();
		this.jButtonDuplicarTipoMovimiento = new JButtonMe();
		this.jButtonCopiarTipoMovimiento = new JButtonMe();
		this.jButtonVerFormTipoMovimiento = new JButtonMe();
		this.jButtonNuevoRelacionesTipoMovimiento = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoMovimiento = new JButtonMe();
		this.jButtonCerrarTipoMovimiento = new JButtonMe();
		
		this.jScrollPanelDatosTipoMovimiento = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoMovimiento = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoMovimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Movimiento";
		
		if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimientos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMovimiento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMovimiento.setToolTipText("Acciones");
        this.jPanelAccionesTipoMovimiento.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMovimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMovimiento, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoMovimiento=new ReporteDinamicoJInternalFrame(TipoMovimientoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoMovimiento();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoMovimiento=new ImportacionJInternalFrame(TipoMovimientoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoMovimiento();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoMovimiento = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoMovimiento.setText("Orden");
		this.jButtonAbrirOrderByTipoMovimiento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMovimiento,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoMovimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMovimiento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMovimiento,false,this);
			
			//this.cargarOrderByTipoMovimiento(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMovimiento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMovimiento,true,this);
			
			//this.cargarOrderByTipoMovimiento(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoMovimiento.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoMovimiento.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoMovimiento.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoMovimiento.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMovimiento.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMovimiento.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoMovimiento.setText("Nuevo");
		this.jButtonDuplicarTipoMovimiento.setText("Duplicar");
		this.jButtonCopiarTipoMovimiento.setText("Copiar");
		this.jButtonVerFormTipoMovimiento.setText("Ver");
		this.jButtonNuevoRelacionesTipoMovimiento.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoMovimiento.setText("Guardar");
		this.jButtonCerrarTipoMovimiento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMovimiento,"nuevo_button","Nuevo",this.tipomovimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoMovimiento,"duplicar_button","Duplicar",this.tipomovimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoMovimiento,"copiar_button","Copiar",this.tipomovimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoMovimiento,"ver_form","Ver",this.tipomovimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoMovimiento,"nuevorelaciones_button","Nuevo Rel",this.tipomovimientoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMovimiento,"guardarcambiostabla_button","Guardar",this.tipomovimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMovimiento,"cerrar_button","Salir",this.tipomovimientoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoMovimiento.setToolTipText("Nuevo"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoMovimiento.setToolTipText("Duplicar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoMovimiento.setToolTipText("Copiar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoMovimiento.setToolTipText("Ver"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoMovimiento.setToolTipText("Nuevo Rel"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoMovimiento.setToolTipText("Guardar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMovimiento.setToolTipText("Salir"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMovimiento";
		inputMap = this.jButtonNuevoTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMovimiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMovimiento"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoMovimiento";
		inputMap = this.jButtonDuplicarTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoMovimiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoMovimiento"));
		
		//COPIAR
		sMapKey = "CopiarTipoMovimiento";
		inputMap = this.jButtonCopiarTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoMovimiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoMovimiento"));
		
		//VEr FORM
		sMapKey = "VerFormTipoMovimiento";
		inputMap = this.jButtonVerFormTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoMovimiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoMovimiento"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoMovimiento";
		inputMap = this.jButtonNuevoRelacionesTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoMovimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoMovimiento"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoMovimiento";
		inputMap = this.jButtonModificarTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoMovimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoMovimiento"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoMovimiento";
		inputMap = this.jButtonCerrarTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMovimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMovimiento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMovimiento";
		inputMap = this.jButtonGuardarCambiosTablaTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMovimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMovimiento"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoMovimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoMovimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoMovimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoMovimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoMovimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoMovimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoMovimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoMovimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoMovimiento.setName("jPanelParametrosReportesTipoMovimiento"); 
		
		this.jPanelParametrosReportesAccionesTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoMovimiento.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoMovimiento.setName("jPanelParametrosReportesAccionesTipoMovimiento"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoMovimiento, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoMovimiento, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoMovimiento = new JButtonMe();
		this.jButtonRecargarInformacionTipoMovimiento.setText("Recargar");
		this.jButtonRecargarInformacionTipoMovimiento.setToolTipText("Recargar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoMovimiento,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoMovimiento = new JButtonMe();
		this.jButtonProcesarInformacionTipoMovimiento.setText("Procesar");
		this.jButtonProcesarInformacionTipoMovimiento.setToolTipText("Procesar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoMovimiento.setVisible(false);
			
		this.jButtonProcesarInformacionTipoMovimiento.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMovimiento.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMovimiento.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoMovimiento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMovimiento.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoMovimiento.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoMovimiento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMovimiento.setText("TIPO");       
		this.jComboBoxTiposReportesTipoMovimiento.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoMovimiento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMovimiento.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoMovimiento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoMovimiento = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoMovimiento.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoMovimiento.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoMovimiento = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoMovimiento.setText("Accion");
		this.jComboBoxTiposRelacionesTipoMovimiento.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoMovimiento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMovimiento.setText("Accion");
		this.jComboBoxTiposAccionesTipoMovimiento.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoMovimiento = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoMovimiento.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoMovimiento.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoMovimiento=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoMovimiento.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMovimiento.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMovimiento.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoMovimiento = new JLabelMe();
		
		this.jLabelAccionesTipoMovimiento.setText("Acciones");		
		this.jLabelAccionesTipoMovimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMovimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMovimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoMovimiento = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoMovimiento.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoMovimiento.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoMovimiento = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoMovimiento.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoMovimiento.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoMovimiento = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoMovimiento.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoMovimiento.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoMovimiento = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoMovimiento.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoMovimiento.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoMovimiento = new JButtonMe();
		//this.jButtonAnterioresTipoMovimiento.setText("<<");
        this.jButtonAnterioresTipoMovimiento.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoMovimiento,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoMovimiento = new JButtonMe();
		//this.jButtonSiguientesTipoMovimiento.setText(">>");
        this.jButtonSiguientesTipoMovimiento.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoMovimiento,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoMovimiento = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoMovimiento.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoMovimiento.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoMovimiento,"nuevoguardarcambios_button","Nue",this.tipomovimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoMovimiento";
		inputMap = this.jButtonNuevoGuardarCambiosTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoMovimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoMovimiento"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoMovimiento";
		inputMap = this.jButtonRecargarInformacionTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoMovimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoMovimiento"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoMovimiento";
		inputMap = this.jButtonSiguientesTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoMovimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoMovimiento"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoMovimiento";
		inputMap = this.jButtonAnterioresTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoMovimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoMovimiento"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoMovimiento();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoMovimiento.setMinimumSize(new Dimension(this.getWidth(),TipoMovimientoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMovimientoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMovimiento.setMaximumSize(new Dimension(this.getWidth(),TipoMovimientoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMovimientoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMovimiento.setPreferredSize(new Dimension(this.getWidth(),TipoMovimientoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMovimientoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoMovimiento = new GridBagLayout();

			this.jPanelPaginacionTipoMovimiento.setLayout(gridaBagLayoutPaginacionTipoMovimiento);						
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento.gridy = 0;
			this.gridBagConstraintsTipoMovimiento.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoMovimiento.add(this.jButtonAnterioresTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
					
						
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMovimiento.gridy = 0;
			
			this.jPanelPaginacionTipoMovimiento.add(this.jButtonNuevoGuardarCambiosTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
						
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoMovimiento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMovimiento.gridy = 0;
			this.jPanelPaginacionTipoMovimiento.add(this.jButtonSiguientesTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento.gridy = 1;
			this.gridBagConstraintsTipoMovimiento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMovimiento.add(this.jButtonNuevoTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
						
			
			
			if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
				this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoMovimiento.gridy = 1;
				this.gridBagConstraintsTipoMovimiento.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoMovimiento.add(this.jButtonGuardarCambiosTablaTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
			}
			
			
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento.gridy = 1;
			this.gridBagConstraintsTipoMovimiento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMovimiento.add(this.jButtonDuplicarTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento.gridy = 1;
			this.gridBagConstraintsTipoMovimiento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMovimiento.add(this.jButtonCopiarTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento.gridy = 1;
			this.gridBagConstraintsTipoMovimiento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMovimiento.add(this.jButtonVerFormTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento.gridy = 1;
			this.gridBagConstraintsTipoMovimiento.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoMovimiento.add(this.jButtonCerrarTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		
		
		
		this.jButtonRecargarInformacionTipoMovimiento.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMovimiento.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMovimiento.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoMovimiento.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMovimiento.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMovimiento.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoMovimiento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMovimiento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMovimiento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoMovimiento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMovimiento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMovimiento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoMovimiento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMovimiento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMovimiento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoMovimiento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMovimiento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMovimiento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoMovimiento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMovimiento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMovimiento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoMovimiento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMovimiento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMovimiento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoMovimiento.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMovimiento.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMovimiento.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoMovimiento.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMovimiento.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMovimiento.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoMovimiento.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMovimiento.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMovimiento.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoMovimiento.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMovimiento.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMovimiento.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoMovimiento = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoMovimiento = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoMovimiento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoMovimiento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoMovimiento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoMovimiento = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoMovimiento.setLayout(gridaBagParametrosReportesTipoMovimiento);
			this.jPanelParametrosReportesAccionesTipoMovimiento.setLayout(gridaBagParametrosReportesAccionesTipoMovimiento);
			
			
			this.jPanelParametrosAuxiliar1TipoMovimiento.setLayout(gridaBagParametrosAuxiliar1TipoMovimiento);
			this.jPanelParametrosAuxiliar2TipoMovimiento.setLayout(gridaBagParametrosAuxiliar2TipoMovimiento);
			this.jPanelParametrosAuxiliar3TipoMovimiento.setLayout(gridaBagParametrosAuxiliar3TipoMovimiento);
			this.jPanelParametrosAuxiliar4TipoMovimiento.setLayout(gridaBagParametrosAuxiliar4TipoMovimiento);
			//this.jPanelParametrosAuxiliar5TipoMovimiento.setLayout(gridaBagParametrosAuxiliar2TipoMovimiento);			
			
			
			
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimiento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMovimiento.add(this.jButtonRecargarInformacionTipoMovimiento, this.gridBagConstraintsTipoMovimiento);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMovimiento.add(this.jComboBoxTiposPaginacionTipoMovimiento, this.gridBagConstraintsTipoMovimiento);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMovimiento.add(this.jCheckBoxConAltoMaximoTablaTipoMovimiento, this.gridBagConstraintsTipoMovimiento);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMovimiento.add(this.jComboBoxTiposArchivosReportesTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMovimiento.add(this.jPanelParametrosAuxiliar1TipoMovimiento, this.gridBagConstraintsTipoMovimiento);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimiento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoMovimiento.add(this.jComboBoxTiposReportesTipoMovimiento, this.gridBagConstraintsTipoMovimiento);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMovimiento.add(this.jPanelParametrosAuxiliar4TipoMovimiento, this.gridBagConstraintsTipoMovimiento);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMovimiento.add(this.jComboBoxTiposReportesTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMovimiento.add(this.jCheckBoxGenerarReporteTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMovimiento.add(this.jPanelParametrosAuxiliar2TipoMovimiento, this.gridBagConstraintsTipoMovimiento);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimiento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMovimiento.add(this.jLabelAccionesTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
				this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoMovimiento.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoMovimiento.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoMovimiento.add(this.jButtonAbrirOrderByTipoMovimiento, this.gridBagConstraintsTipoMovimiento);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMovimiento.add(this.jComboBoxTiposSeleccionarTipoMovimiento, this.gridBagConstraintsTipoMovimiento);			
			
			
			/*
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimiento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMovimiento.add(this.jCheckBoxSeleccionarTodosTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimiento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMovimiento.add(this.jCheckBoxSeleccionarTodosTipoMovimiento, this.gridBagConstraintsTipoMovimiento);															
				
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMovimiento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMovimiento.add(this.jCheckBoxSeleccionadosTipoMovimiento, this.gridBagConstraintsTipoMovimiento);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMovimiento.add(this.jPanelParametrosAuxiliar3TipoMovimiento, this.gridBagConstraintsTipoMovimiento);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMovimiento.add(this.jComboBoxTiposRelacionesTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
				
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMovimiento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMovimiento.add(this.jComboBoxTiposAccionesTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoMovimiento = new GridBagLayout();

			this.jScrollPanelDatosTipoMovimiento.setLayout(gridaBagLayoutDatosTipoMovimiento);
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento.gridy = 0;
			this.gridBagConstraintsTipoMovimiento.gridx = 0;
			
			this.jScrollPanelDatosTipoMovimiento.add(this.jTableDatosTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoMovimiento.setViewportView(this.jTableDatosTipoMovimiento);
		this.jTableDatosTipoMovimiento.setFillsViewportHeight(true);
		this.jTableDatosTipoMovimiento.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoMovimiento= new GridBagLayout();
		this.jPanelAccionesTipoMovimiento.setLayout(gridaBagLayoutAccionesTipoMovimiento);
		
		
		/*	
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento.gridy = 0;
		this.gridBagConstraintsTipoMovimiento.gridx = 0;
			
		this.jPanelAccionesTipoMovimiento.add(this.jButtonNuevoTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMovimiento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMovimiento);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();						
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMovimiento.gridx = 0;		
			//this.gridBagConstraintsTipoMovimiento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMovimiento.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoMovimiento, this.gridBagConstraintsTipoMovimiento);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoMovimiento.gridx = 0;		
		//this.gridBagConstraintsTipoMovimiento.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoMovimiento.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoMovimiento);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoMovimiento, this.gridBagConstraintsTipoMovimiento);								
		
		
		/*
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		*/		
		
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMovimiento.gridx =0;
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMovimiento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
				
		
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoMovimientoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoMovimiento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMovimiento = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoMovimiento.setLayout(gridaBagLayoutBusquedasParametrosTipoMovimiento);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoMovimiento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMovimiento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMovimiento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMovimiento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
			
			
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		
			
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoMovimiento;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoMovimiento() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoMovimiento = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoMovimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoMovimiento.setName("jPanelReporteDinamicoTipoMovimiento"); 
		
		this.jPanelReporteDinamicoTipoMovimiento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMovimiento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMovimiento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoMovimiento.setLayout(gridaBagLayoutReporteDinamicoTipoMovimiento);
		
		
		this.jInternalFrameReporteDinamicoTipoMovimiento= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoMovimiento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMovimiento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoMovimiento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoMovimiento.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoMovimiento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoMovimiento.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoMovimiento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoMovimiento.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoMovimiento.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoMovimiento.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoMovimiento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMovimiento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMovimiento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimientos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoMovimiento = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoMovimiento.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoMovimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMovimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMovimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMovimiento.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoMovimiento.add(this.jLabelColumnasSelectReporteTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoMovimiento = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoMovimiento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoMovimiento.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoMovimiento.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMovimiento.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMovimiento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoMovimiento=new JScrollPane(this.jListColumnasSelectReporteTipoMovimiento);
			
			this.jScrollColumnasSelectReporteTipoMovimiento.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMovimiento.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMovimiento.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMovimiento.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoMovimiento.add(this.jListColumnasSelectReporteTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		this.jPanelReporteDinamicoTipoMovimiento.add(this.jScrollColumnasSelectReporteTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoMovimiento = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoMovimiento.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoMovimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMovimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMovimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoMovimiento = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoMovimiento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoMovimiento.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoMovimiento.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMovimiento.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMovimiento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoMovimiento=new JScrollPane(this.jListRelacionesSelectReporteTipoMovimiento);
			
			this.jScrollRelacionesSelectReporteTipoMovimiento.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMovimiento.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMovimiento.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoMovimiento = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoMovimiento = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoMovimiento = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoMovimiento = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoMovimiento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoMovimiento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMovimiento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMovimiento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoMovimiento = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMovimiento.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMovimiento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMovimiento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMovimiento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoMovimiento = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoMovimiento.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoMovimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMovimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMovimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMovimiento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMovimiento.add(this.jLabelGenerarExcelReporteDinamicoTipoMovimiento, this.gridBagConstraintsTipoMovimiento);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoMovimiento = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoMovimiento.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoMovimiento,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoMovimiento.setToolTipText("Generar EXCEL"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		//this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoMovimiento.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoMovimiento.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoMovimiento.add(this.jButtonGenerarExcelReporteDinamicoTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMovimiento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMovimiento.add(this.jComboBoxTiposReportesDinamicoTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoMovimiento = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoMovimiento.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoMovimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMovimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMovimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMovimiento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMovimiento.add(this.jLabelTiposArchivoReporteDinamicoTipoMovimiento, this.gridBagConstraintsTipoMovimiento);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMovimiento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMovimiento.add(this.jComboBoxTiposArchivosReportesDinamicoTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoMovimiento = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoMovimiento.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoMovimiento,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoMovimiento.setToolTipText("Generar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMovimiento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMovimiento.add(this.jButtonGenerarReporteDinamicoTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoMovimiento = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoMovimiento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoMovimiento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoMovimiento.setToolTipText("Cancelar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMovimiento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMovimiento.add(this.jButtonCerrarReporteDinamicoTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoMovimiento = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoMovimiento= new JScrollPane(jPanelReporteDinamicoTipoMovimiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoMovimiento.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMovimiento.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMovimiento.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimientos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoMovimiento.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoMovimiento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoMovimiento.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoMovimiento);
		this.jInternalFrameReporteDinamicoTipoMovimiento.getContentPane().add(this.jScrollPanelReporteDinamicoTipoMovimiento, this.gridBagConstraintsTipoMovimiento);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoMovimiento() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoMovimiento = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoMovimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoMovimiento.setName("jPanelImportacionTipoMovimiento"); 
		
		this.jPanelImportacionTipoMovimiento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMovimiento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMovimiento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoMovimiento.setLayout(gridaBagLayoutImportacionTipoMovimiento);
		
		
		this.jInternalFrameImportacionTipoMovimiento= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoMovimiento= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoMovimiento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMovimiento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoMovimiento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMovimiento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMovimiento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoMovimiento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMovimiento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMovimiento.setResizable(true);
	    this.jInternalFrameImportacionTipoMovimiento.setClosable(true);
	    this.jInternalFrameImportacionTipoMovimiento.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoMovimiento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMovimiento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMovimiento.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoMovimiento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMovimiento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMovimiento.setResizable(true);
	    this.jInternalFrameImportacionTipoMovimiento.setClosable(true);
	    this.jInternalFrameImportacionTipoMovimiento.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoMovimiento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMovimiento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMovimiento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimientos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoMovimiento = new JLabelMe();

		this.jLabelArchivoImportacionTipoMovimiento.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoMovimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMovimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMovimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMovimiento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMovimiento.add(this.jLabelArchivoImportacionTipoMovimiento, this.gridBagConstraintsTipoMovimiento);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoMovimiento = new JFileChooser();		
		this.jFileChooserImportacionTipoMovimiento.setToolTipText("ESCOGER ARCHIVO"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoMovimiento = new JButtonMe();
		this.jButtonAbrirImportacionTipoMovimiento.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoMovimiento,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoMovimiento.setToolTipText("Generar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMovimiento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMovimiento.add(this.jButtonAbrirImportacionTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoMovimiento = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoMovimiento.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoMovimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMovimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMovimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMovimiento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMovimiento.add(this.jLabelPathArchivoImportacionTipoMovimiento, this.gridBagConstraintsTipoMovimiento);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoMovimiento=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoMovimiento.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMovimiento.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMovimiento.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMovimiento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMovimiento.add(this.jTextFieldPathArchivoImportacionTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoMovimiento = new JButtonMe();
		this.jButtonGenerarImportacionTipoMovimiento.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoMovimiento,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoMovimiento.setToolTipText("Generar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMovimiento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMovimiento.add(this.jButtonGenerarImportacionTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoMovimiento = new JButtonMe();
		this.jButtonCerrarImportacionTipoMovimiento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoMovimiento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoMovimiento.setToolTipText("Cancelar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMovimiento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMovimiento.add(this.jButtonCerrarImportacionTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoMovimiento = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoMovimiento= new JScrollPane(jPanelImportacionTipoMovimiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoMovimiento.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoMovimiento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoMovimiento.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoMovimiento);
		this.jInternalFrameImportacionTipoMovimiento.getContentPane().add(this.jScrollPanelImportacionTipoMovimiento, this.gridBagConstraintsTipoMovimiento);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoMovimiento(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoMovimiento = new JButtonMe();
			this.jButtonAbrirOrderByTipoMovimiento.setText("Orden");
			this.jButtonAbrirOrderByTipoMovimiento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMovimiento,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoMovimiento";
			inputMap = this.jButtonAbrirOrderByTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoMovimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoMovimiento"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoMovimiento = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoMovimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoMovimiento.setName("jPanelOrderByTipoMovimiento"); 
			
			this.jPanelOrderByTipoMovimiento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMovimiento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMovimiento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoMovimiento.setLayout(gridaBagLayoutOrderByTipoMovimiento);
			
			
			this.jTableDatosTipoMovimientoOrderBy = new JTableMe();        
			this.jTableDatosTipoMovimientoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoMovimientoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoMovimientoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoMovimientoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoMovimientoOrderBy.setViewportView(this.jTableDatosTipoMovimientoOrderBy);
			this.jTableDatosTipoMovimientoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoMovimientoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoMovimiento= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoMovimiento= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoMovimiento = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoMovimiento= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoMovimiento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoMovimiento.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoMovimiento.setTitle("Orden");
			this.jInternalFrameOrderByTipoMovimiento.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoMovimiento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoMovimiento.setResizable(true);
			this.jInternalFrameOrderByTipoMovimiento.setClosable(true);
			this.jInternalFrameOrderByTipoMovimiento.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoMovimiento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMovimiento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMovimiento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimientos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoMovimiento.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoMovimiento.ipady =150;
				
			this.jPanelOrderByTipoMovimiento.add(jScrollPanelDatosTipoMovimientoOrderBy, this.gridBagConstraintsTipoMovimiento);//this.jTableDatosTipoMovimientoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoMovimiento = new JButtonMe();
			this.jButtonCerrarOrderByTipoMovimiento.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoMovimiento,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoMovimiento.setToolTipText("Cancelar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoMovimiento.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoMovimiento.add(this.jButtonCerrarOrderByTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoMovimiento = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoMovimiento= new JScrollPane(jPanelOrderByTipoMovimiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoMovimiento.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoMovimiento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoMovimiento.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoMovimiento);
			
			this.jInternalFrameOrderByTipoMovimiento.getContentPane().add(this.jScrollPanelOrderByTipoMovimiento, this.gridBagConstraintsTipoMovimiento);			
		
		} else {
			this.jButtonAbrirOrderByTipoMovimiento = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipomovimientoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoMovimiento.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoMovimiento.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoMovimiento.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoMovimiento.getRowHeight();//TipoMovimientoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoMovimientoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMovimiento.isSelected()) {
					iHeightTable=TipoMovimientoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMovimientoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMovimientoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoMovimientoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMovimiento.isSelected()) {
					iHeightTable=TipoMovimientoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMovimientoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMovimientoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoMovimiento.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMovimiento.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMovimiento.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoMovimiento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMovimiento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMovimiento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoMovimiento!=null && this.jInternalFrameOrderByTipoMovimiento.getjTableDatosOrderBy()!=null) {
			//if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoMovimiento.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoMovimiento.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoMovimiento.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoMovimiento.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoMovimiento.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoMovimiento.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoMovimiento.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoMovimiento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMovimiento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMovimiento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipomovimientoLogic.getTipoMovimientos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomovimientos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoMovimiento> TraerTipoMovimientoBeans(List<TipoMovimiento> tipomovimientos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoMovimiento tipomovimiento:tipomovimientos) {
					
				if(!(TipoMovimientoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoMovimientoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipomovimiento.setsDetalleGeneralEntityReporte(TipoMovimientoConstantesFunciones.getTipoMovimientoDescripcion(tipomovimiento));
										
						
					
						
					
				} else  {
							
					//tipomovimiento.setsDetalleGeneralEntityReporte(tipomovimiento.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipomovimientobeans.add(tipomovimientobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipomovimientos;
    }
	//PARA REPORTES FIN
}
