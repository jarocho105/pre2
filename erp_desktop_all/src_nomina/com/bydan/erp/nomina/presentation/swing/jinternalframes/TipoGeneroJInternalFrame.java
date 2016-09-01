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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
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


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
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
import com.bydan.erp.nomina.util.TipoGeneroConstantesFunciones;

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
public class TipoGeneroJInternalFrame extends TipoGeneroBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoGenero;
	
	protected JMenuBar jmenuBarTipoGenero;
	
	protected JMenu jmenuTipoGenero;
	protected JMenu jmenuDatosTipoGenero;
	protected JMenu jmenuArchivoTipoGenero;
	protected JMenu jmenuAccionesTipoGenero;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoGenero = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGenero;	
	protected GridBagConstraints gridBagConstraintsTipoGenero;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoGeneroDetalleFormJInternalFrame jInternalFrameDetalleFormTipoGenero;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoGenero;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoGenero;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoGeneroSessionBean tipogeneroSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoGenero> tipogeneros;		
	public List<TipoGenero> tipogenerosEliminados;	
	public List<TipoGenero> tipogenerosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoGenero;		
	protected JButton jButtonAbrirOrderByTipoGenero;
	
	
	//protected JPanel jPanelOrderByTipoGenero;
	//public JScrollPane jScrollPanelOrderByTipoGenero;	
	//protected JButton jButtonCerrarOrderByTipoGenero;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoGeneroLogic tipogeneroLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoGenero;
	public JScrollPane jScrollPanelDatosEdicionTipoGenero;
	public JScrollPane jScrollPanelDatosGeneralTipoGenero;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoGeneroOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoGenero;
	//public JScrollPane jScrollPanelImportacionTipoGenero;
	
	
	
	protected JPanel jPanelAccionesTipoGenero;
	
    protected JPanel jPanelPaginacionTipoGenero;
    protected JPanel jPanelParametrosReportesTipoGenero;
	protected JPanel jPanelParametrosReportesAccionesTipoGenero;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoGenero;
	protected JPanel jPanelParametrosAuxiliar2TipoGenero;
	protected JPanel jPanelParametrosAuxiliar3TipoGenero;
	protected JPanel jPanelParametrosAuxiliar4TipoGenero;
	//protected JPanel jPanelParametrosAuxiliar5TipoGenero;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoGenero;
	//protected JPanel jPanelImportacionTipoGenero;
	
	
	public JTable jTableDatosTipoGenero;
	
	
	
	//public JTable jTableDatosTipoGeneroOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoGenero;
	protected JButton jButtonDuplicarTipoGenero;
	protected JButton jButtonCopiarTipoGenero;
	protected JButton jButtonVerFormTipoGenero;
	protected JButton jButtonNuevoRelacionesTipoGenero;
	protected JButton jButtonModificarTipoGenero;
	
    protected JButton jButtonGuardarCambiosTablaTipoGenero;
	protected JButton jButtonCerrarTipoGenero;
	
	
	protected JButton jButtonRecargarInformacionTipoGenero;
	protected JButton jButtonProcesarInformacionTipoGenero;
	
	
	protected JButton jButtonAnterioresTipoGenero;
	protected JButton jButtonSiguientesTipoGenero;
	protected JButton jButtonNuevoGuardarCambiosTipoGenero;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoGenero;
	//protected JButton jButtonCerrarReporteDinamicoTipoGenero;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoGenero;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoGenero;
	//protected JButton jButtonGenerarImportacionTipoGenero;
	//protected JButton jButtonCerrarImportacionTipoGenero;
	//protected JFileChooser jFileChooserImportacionTipoGenero;
	//protected File fileImportacionTipoGenero;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGenero;
	protected JButton jButtonDuplicarToolBarTipoGenero;
	protected JButton jButtonNuevoRelacionesToolBarTipoGenero;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoGenero;
	protected JButton jButtonCopiarToolBarTipoGenero;
	protected JButton jButtonVerFormToolBarTipoGenero;
	public JButton jButtonGuardarCambiosTablaToolBarTipoGenero;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGenero;
	protected JButton jButtonCerrarToolBarTipoGenero;
	
	protected JButton jButtonRecargarInformacionToolBarTipoGenero;
	protected JButton jButtonProcesarInformacionToolBarTipoGenero;
	protected JButton jButtonAnterioresToolBarTipoGenero;
	protected JButton jButtonSiguientesToolBarTipoGenero;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoGenero;
	protected JButton jButtonAbrirOrderByToolBarTipoGenero;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGenero;
	protected JMenuItem jMenuItemDuplicarTipoGenero;
	protected JMenuItem jMenuItemNuevoRelacionesTipoGenero;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoGenero;
	protected JMenuItem jMenuItemCopiarTipoGenero;
	protected JMenuItem jMenuItemVerFormTipoGenero;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGenero;
	protected JMenuItem jMenuItemCerrarTipoGenero;
	protected JMenuItem jMenuItemDetalleCerrarTipoGenero;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoGenero;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGenero;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoGenero;
	protected JMenuItem jMenuItemProcesarInformacionTipoGenero;
	protected JMenuItem jMenuItemAnterioresTipoGenero;
	protected JMenuItem jMenuItemSiguientesTipoGenero;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGenero;
	protected JMenuItem jMenuItemAbrirOrderByTipoGenero;
	protected JMenuItem jMenuItemMostrarOcultarTipoGenero;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGenero;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoGenero;
	protected JCheckBox jCheckBoxSeleccionadosTipoGenero;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoGenero;
	protected JCheckBox jCheckBoxConGraficoReporteTipoGenero;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoGenero;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoGenero;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGenero;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoGenero;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoGenero;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoGenero;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGenero;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGenero;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoGenero;
	protected JTextField jTextFieldValorCampoGeneralTipoGenero;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoGenero;
	//public JList<Reporte> jListColumnasSelectReporteTipoGenero;
	//public JScrollPane jScrollColumnasSelectReporteTipoGenero;
	
	//public JLabel jLabelRelacionesSelectReporteTipoGenero;
	//public JList<Reporte> jListRelacionesSelectReporteTipoGenero;
	//public JScrollPane jScrollRelacionesSelectReporteTipoGenero;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoGenero;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoGenero;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoGenero;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoGenero;
	
		
	//public JLabel jLabelArchivoImportacionTipoGenero;	
	//public JLabel jLabelPathArchivoImportacionTipoGenero;
	//protected JTextField jTextFieldPathArchivoImportacionTipoGenero;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoGenero;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoGenero;
	
	//public JLabel jLabelColumnaCategoriaValorTipoGenero;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoGenero;
	
	//public JLabel jLabelColumnasValoresGraficoTipoGenero;
	//public JList<Reporte> jListColumnasValoresGraficoTipoGenero;
	//public JScrollPane jScrollColumnasValoresGraficoTipoGenero;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoGenero;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoGenero;	
	
	
	
	
	
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
	public TipoGeneroJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoGenero No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGeneroJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGenero No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGeneroJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGenero No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGeneroJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGenero No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoGenero)	{
		this.jButtonRecargarInformacionTipoGenero = jButtonRecargarInformacionTipoGenero;
	}
	
	public JButton getjButtonProcesarInformacionTipoGenero() {
		return this.jButtonProcesarInformacionTipoGenero;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGenero)	{
		this.jButtonProcesarInformacionTipoGenero = jButtonProcesarInformacionTipoGenero;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoGenero() {
		return this.jButtonRecargarInformacionTipoGenero;
	}
	
	
	public List<TipoGenero> gettipogeneros() {
		return this.tipogeneros;
	}

	public void settipogeneros(List<TipoGenero> tipogeneros) {
		this.tipogeneros = tipogeneros;
	}
	
	public List<TipoGenero> gettipogenerosAux() {
		return this.tipogenerosAux;
	}

	public void settipogenerosAux(List<TipoGenero> tipogenerosAux) {
		this.tipogenerosAux = tipogenerosAux;
	}
	
	public List<TipoGenero> gettipogenerosEliminados() {
		return this.tipogenerosEliminados;
	}

	public void setTipoGenerosEliminados(List<TipoGenero> tipogenerosEliminados) {
		this.tipogenerosEliminados = tipogenerosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoGenero() {
		return jComboBoxTiposSeleccionarTipoGenero;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoGenero(
			JComboBox jComboBoxTiposSeleccionarTipoGenero) {
		this.jComboBoxTiposSeleccionarTipoGenero = jComboBoxTiposSeleccionarTipoGenero;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoGenero() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoGenero.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoGenero .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoGenero() {
		return jTextFieldValorCampoGeneralTipoGenero;
	}

	public void setjTextFieldValorCampoGeneralTipoGenero(
			JTextField jTextFieldValorCampoGeneralTipoGenero) {
		this.jTextFieldValorCampoGeneralTipoGenero = jTextFieldValorCampoGeneralTipoGenero;
	}

	public void setBorderResaltarValorCampoGeneralTipoGenero() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGenero.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoGenero .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoGenero() {
		return this.jCheckBoxSeleccionarTodosTipoGenero;
	}

	public void setjCheckBoxSeleccionarTodosTipoGenero(
			JCheckBox jCheckBoxSeleccionarTodosTipoGenero) {
		this.jCheckBoxSeleccionarTodosTipoGenero = jCheckBoxSeleccionarTodosTipoGenero;
	}

	public void setBorderResaltarSeleccionarTodosTipoGenero() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGenero.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoGenero .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoGenero() {
		return this.jCheckBoxSeleccionadosTipoGenero;
	}

	public void setjCheckBoxSeleccionadosTipoGenero(
			JCheckBox jCheckBoxSeleccionadosTipoGenero) {
		this.jCheckBoxSeleccionadosTipoGenero = jCheckBoxSeleccionadosTipoGenero;
	}
	
	public void setBorderResaltarSeleccionadosTipoGenero() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGenero.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoGenero .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoGenero() {
		return this.jComboBoxTiposArchivosReportesTipoGenero;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoGenero(
			JComboBox jComboBoxTiposArchivosReportesTipoGenero) {
		this.jComboBoxTiposArchivosReportesTipoGenero = jComboBoxTiposArchivosReportesTipoGenero;
	}

	public void setBorderResaltarTiposArchivosReportesTipoGenero() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGenero.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoGenero .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoGenero() {
		return this.jComboBoxTiposReportesTipoGenero;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoGenero(
			JComboBox jComboBoxTiposReportesTipoGenero) {
		this.jComboBoxTiposReportesTipoGenero = jComboBoxTiposReportesTipoGenero;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoGenero() {
	//	return jComboBoxTiposReportesDinamicoTipoGenero;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoGenero(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoGenero) {
	//	this.jComboBoxTiposReportesDinamicoTipoGenero = jComboBoxTiposReportesDinamicoTipoGenero;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoGenero() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoGenero;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoGenero(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGenero) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoGenero = jComboBoxTiposArchivosReportesDinamicoTipoGenero;
	//}
	
	public void setBorderResaltarTiposReportesTipoGenero() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGenero.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoGenero .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoGenero() {
		return this.jComboBoxTiposGraficosReportesTipoGenero;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoGenero(
			JComboBox jComboBoxTiposGraficosReportesTipoGenero) {
		this.jComboBoxTiposGraficosReportesTipoGenero = jComboBoxTiposGraficosReportesTipoGenero;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoGenero() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGenero.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoGenero .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoGenero() {
		return this.jComboBoxTiposPaginacionTipoGenero;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoGenero(
			JComboBox jComboBoxTiposPaginacionTipoGenero) {
		this.jComboBoxTiposPaginacionTipoGenero = jComboBoxTiposPaginacionTipoGenero;
	}
	
	public void setBorderResaltarTiposPaginacionTipoGenero() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGenero.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoGenero .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoGenero() {
		return this.jComboBoxTiposRelacionesTipoGenero;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGenero() {
		return this.jComboBoxTiposAccionesTipoGenero;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGenero(
			JComboBox jComboBoxTiposRelacionesTipoGenero) {
		this.jComboBoxTiposRelacionesTipoGenero = jComboBoxTiposRelacionesTipoGenero;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGenero(
			JComboBox jComboBoxTiposAccionesTipoGenero) {
		this.jComboBoxTiposAccionesTipoGenero = jComboBoxTiposAccionesTipoGenero;
	}
	
	public void setBorderResaltarTiposRelacionesTipoGenero() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGenero.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoGenero .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoGenero() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGenero.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoGenero .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoGenero() {
	//	return jCheckBoxConGraficoDinamicoTipoGenero;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoGenero(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoGenero) {
	//	this.jCheckBoxConGraficoDinamicoTipoGenero = jCheckBoxConGraficoDinamicoTipoGenero;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoGenero() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoGenero.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoGenero .setBorder(borderResaltar);		
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
		this.tipogeneroSessionBean=new TipoGeneroSessionBean();
		
		this.tipogeneroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogeneroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogeneroSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGeneroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGeneroJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Genero MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoGeneroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoGenero No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoGenero= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoGenero=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoGenero,this.jTtoolBarTipoGenero,
							"nuevo","nuevo","Nuevo"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGenero=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoGenero,this.jTtoolBarTipoGenero,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGenero=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoGenero,this.jTtoolBarTipoGenero,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoGenero=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoGenero,this.jTtoolBarTipoGenero,
							"duplicar","duplicar","Duplicar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoGenero=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoGenero,this.jTtoolBarTipoGenero,
							"copiar","copiar","Copiar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoGenero=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoGenero,this.jTtoolBarTipoGenero,
							"ver_form","ver_form","Ver"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoGenero=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGenero,this.jTtoolBarTipoGenero,
							"recargar","recargar","Recargar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoGenero=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGenero,this.jTtoolBarTipoGenero,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoGenero=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGenero,this.jTtoolBarTipoGenero,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoGenero=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoGenero,this.jTtoolBarTipoGenero,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoGenero=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoGenero,this.jTtoolBarTipoGenero,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoGenero=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoGenero,this.jTtoolBarTipoGenero,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoGenero=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoGenero,this.jTtoolBarTipoGenero,
							"cerrar","cerrar","Salir"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoGenero=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoGenero;
			
				this.jButtonProcesarInformacionToolBarTipoGenero=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoGenero;
				
		//protected JButton jButtonModificarToolBarTipoGenero;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoGenero=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoGenero=new JMenuMe("General");
		this.jmenuArchivoTipoGenero=new JMenuMe("Archivo");
		this.jmenuAccionesTipoGenero=new JMenuMe("Acciones");
		this.jmenuDatosTipoGenero=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGenero= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGenero.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGenero,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoGenero= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoGenero.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoGenero,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoGenero= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoGenero.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoGenero,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoGenero= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGenero.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGenero,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoGenero= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoGenero.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoGenero,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoGenero= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoGenero.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoGenero,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoGenero= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoGenero.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoGenero,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGenero= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGenero.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGenero,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoGenero= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoGenero.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoGenero,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoGenero= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoGenero.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoGenero,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoGenero= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoGenero.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoGenero,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoGenero= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoGenero.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoGenero,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoGenero= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoGenero.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoGenero,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGenero= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGenero.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGenero,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoGenero= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoGenero.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoGenero,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGenero= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGenero.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGenero,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoGenero= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoGenero.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoGenero,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoGenero.add(this.jMenuItemCerrarTipoGenero);
			
			this.jmenuAccionesTipoGenero.add(this.jMenuItemNuevoTipoGenero);
			this.jmenuAccionesTipoGenero.add(this.jMenuItemNuevoGuardarCambiosTipoGenero);
			this.jmenuAccionesTipoGenero.add(this.jMenuItemNuevoRelacionesTipoGenero);
			this.jmenuAccionesTipoGenero.add(this.jMenuItemGuardarCambiosTablaTipoGenero);		
			this.jmenuAccionesTipoGenero.add(this.jMenuItemDuplicarTipoGenero);		
			this.jmenuAccionesTipoGenero.add(this.jMenuItemCopiarTipoGenero);		
			this.jmenuAccionesTipoGenero.add(this.jMenuItemVerFormTipoGenero);		
			
			this.jmenuDatosTipoGenero.add(this.jMenuItemRecargarInformacionTipoGenero);				
			this.jmenuDatosTipoGenero.add(this.jMenuItemAnterioresTipoGenero);				
			this.jmenuDatosTipoGenero.add(this.jMenuItemSiguientesTipoGenero);				
			this.jmenuDatosTipoGenero.add(this.jMenuItemAbrirOrderByTipoGenero);				
			this.jmenuDatosTipoGenero.add(this.jMenuItemMostrarOcultarTipoGenero);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoGenero.add(this.jMenuItemGuardarCambiosTipoGenero);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoGenero.add(this.jmenuArchivoTipoGenero);		
			this.jmenuBarTipoGenero.add(this.jmenuAccionesTipoGenero);		
			this.jmenuBarTipoGenero.add(this.jmenuDatosTipoGenero);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoGenero);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoGenero() {
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
			//this.jInternalFrameDetalleTipoGenero = new TipoGeneroDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Genero DATOS");
			this.jInternalFrameDetalleFormTipoGenero = new TipoGeneroDetalleFormJInternalFrame(jDesktopPane,this.tipogeneroSessionBean.getConGuardarRelaciones(),this.tipogeneroSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoGenero = null;//new TipoGeneroDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGenero= new GridBagLayout();
		
		
		this.jTableDatosTipoGenero = new JTableMe();      
		
		String sToolTipTipoGenero="";
		sToolTipTipoGenero=TipoGeneroConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGenero+="(Nomina.TipoGenero)";
		}
		
		if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGenero+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoGenero.setToolTipText(sToolTipTipoGenero);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoGenero);
		this.jTableDatosTipoGenero.setAutoCreateRowSorter(true);
		this.jTableDatosTipoGenero.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoGenero.setRowSelectionAllowed(true);
		this.jTableDatosTipoGenero.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoGenero,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoGenero = new JButtonMe();
		this.jButtonDuplicarTipoGenero = new JButtonMe();
		this.jButtonCopiarTipoGenero = new JButtonMe();
		this.jButtonVerFormTipoGenero = new JButtonMe();
		this.jButtonNuevoRelacionesTipoGenero = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoGenero = new JButtonMe();
		this.jButtonCerrarTipoGenero = new JButtonMe();
		
		this.jScrollPanelDatosTipoGenero = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoGenero = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoGenero = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Genero";
		
		if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Generoes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGenero.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGenero.setToolTipText("Acciones");
        this.jPanelAccionesTipoGenero.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGenero, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGenero, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoGenero=new ReporteDinamicoJInternalFrame(TipoGeneroConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoGenero();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoGenero=new ImportacionJInternalFrame(TipoGeneroConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoGenero();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoGenero = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoGenero.setText("Orden");
		this.jButtonAbrirOrderByTipoGenero.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGenero,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoGenero.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGenero=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGenero,false,this);
			
			//this.cargarOrderByTipoGenero(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGenero=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGenero,true,this);
			
			//this.cargarOrderByTipoGenero(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoGenero.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoGenero.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoGenero.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoGenero.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGenero.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGenero.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoGenero.setText("Nuevo");
		this.jButtonDuplicarTipoGenero.setText("Duplicar");
		this.jButtonCopiarTipoGenero.setText("Copiar");
		this.jButtonVerFormTipoGenero.setText("Ver");
		this.jButtonNuevoRelacionesTipoGenero.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoGenero.setText("Guardar");
		this.jButtonCerrarTipoGenero.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGenero,"nuevo_button","Nuevo",this.tipogeneroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoGenero,"duplicar_button","Duplicar",this.tipogeneroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoGenero,"copiar_button","Copiar",this.tipogeneroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoGenero,"ver_form","Ver",this.tipogeneroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoGenero,"nuevorelaciones_button","Nuevo Rel",this.tipogeneroSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGenero,"guardarcambiostabla_button","Guardar",this.tipogeneroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGenero,"cerrar_button","Salir",this.tipogeneroSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoGenero.setToolTipText("Nuevo"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoGenero.setToolTipText("Duplicar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoGenero.setToolTipText("Copiar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoGenero.setToolTipText("Ver"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoGenero.setToolTipText("Nuevo Rel"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoGenero.setToolTipText("Guardar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGenero.setToolTipText("Salir"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGenero";
		inputMap = this.jButtonNuevoTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGenero.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGenero"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoGenero";
		inputMap = this.jButtonDuplicarTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoGenero.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoGenero"));
		
		//COPIAR
		sMapKey = "CopiarTipoGenero";
		inputMap = this.jButtonCopiarTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoGenero.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoGenero"));
		
		//VEr FORM
		sMapKey = "VerFormTipoGenero";
		inputMap = this.jButtonVerFormTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoGenero.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoGenero"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoGenero";
		inputMap = this.jButtonNuevoRelacionesTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoGenero.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoGenero"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoGenero";
		inputMap = this.jButtonModificarTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoGenero.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoGenero"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoGenero";
		inputMap = this.jButtonCerrarTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGenero.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGenero"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGenero";
		inputMap = this.jButtonGuardarCambiosTablaTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGenero.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGenero"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoGenero = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoGenero = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoGenero = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoGenero= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoGenero= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoGenero= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoGenero= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoGenero= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoGenero.setName("jPanelParametrosReportesTipoGenero"); 
		
		this.jPanelParametrosReportesAccionesTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoGenero.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoGenero.setName("jPanelParametrosReportesAccionesTipoGenero"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoGenero, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoGenero, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoGenero = new JButtonMe();
		this.jButtonRecargarInformacionTipoGenero.setText("Recargar");
		this.jButtonRecargarInformacionTipoGenero.setToolTipText("Recargar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoGenero,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoGenero = new JButtonMe();
		this.jButtonProcesarInformacionTipoGenero.setText("Procesar");
		this.jButtonProcesarInformacionTipoGenero.setToolTipText("Procesar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoGenero.setVisible(false);
			
		this.jButtonProcesarInformacionTipoGenero.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGenero.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGenero.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoGenero = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGenero.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoGenero.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoGenero = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGenero.setText("TIPO");       
		this.jComboBoxTiposReportesTipoGenero.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoGenero = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGenero.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoGenero.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoGenero = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoGenero.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoGenero.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoGenero = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoGenero.setText("Accion");
		this.jComboBoxTiposRelacionesTipoGenero.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoGenero = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGenero.setText("Accion");
		this.jComboBoxTiposAccionesTipoGenero.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoGenero = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoGenero.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoGenero.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoGenero=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoGenero.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGenero.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGenero.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoGenero = new JLabelMe();
		
		this.jLabelAccionesTipoGenero.setText("Acciones");		
		this.jLabelAccionesTipoGenero.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGenero.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGenero.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoGenero = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoGenero.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoGenero.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoGenero = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoGenero.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoGenero.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoGenero = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoGenero.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoGenero.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoGenero = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoGenero.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoGenero.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoGenero = new JButtonMe();
		//this.jButtonAnterioresTipoGenero.setText("<<");
        this.jButtonAnterioresTipoGenero.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoGenero,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoGenero = new JButtonMe();
		//this.jButtonSiguientesTipoGenero.setText(">>");
        this.jButtonSiguientesTipoGenero.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoGenero,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoGenero = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoGenero.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoGenero.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoGenero,"nuevoguardarcambios_button","Nue",this.tipogeneroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoGenero";
		inputMap = this.jButtonNuevoGuardarCambiosTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoGenero.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoGenero"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoGenero";
		inputMap = this.jButtonRecargarInformacionTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoGenero.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoGenero"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoGenero";
		inputMap = this.jButtonSiguientesTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoGenero.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoGenero"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoGenero";
		inputMap = this.jButtonAnterioresTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoGenero.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoGenero"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoGenero();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoGenero.setMinimumSize(new Dimension(this.getWidth(),TipoGeneroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGeneroBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGenero.setMaximumSize(new Dimension(this.getWidth(),TipoGeneroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGeneroBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGenero.setPreferredSize(new Dimension(this.getWidth(),TipoGeneroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGeneroBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoGenero = new GridBagLayout();

			this.jPanelPaginacionTipoGenero.setLayout(gridaBagLayoutPaginacionTipoGenero);						
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGenero.gridy = 0;
			this.gridBagConstraintsTipoGenero.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoGenero.add(this.jButtonAnterioresTipoGenero, this.gridBagConstraintsTipoGenero);
					
						
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGenero.gridy = 0;
			
			this.jPanelPaginacionTipoGenero.add(this.jButtonNuevoGuardarCambiosTipoGenero, this.gridBagConstraintsTipoGenero);
						
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoGenero.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGenero.gridy = 0;
			this.jPanelPaginacionTipoGenero.add(this.jButtonSiguientesTipoGenero, this.gridBagConstraintsTipoGenero);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGenero.gridy = 1;
			this.gridBagConstraintsTipoGenero.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGenero.add(this.jButtonNuevoTipoGenero, this.gridBagConstraintsTipoGenero);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoGenero = new GridBagConstraints();
				this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoGenero.gridy = 1;
				this.gridBagConstraintsTipoGenero.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoGenero.add(this.jButtonNuevoRelacionesTipoGenero, this.gridBagConstraintsTipoGenero);
			}
			
			
			if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoGenero = new GridBagConstraints();
				this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoGenero.gridy = 1;
				this.gridBagConstraintsTipoGenero.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoGenero.add(this.jButtonGuardarCambiosTablaTipoGenero, this.gridBagConstraintsTipoGenero);
			}
			
			
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGenero.gridy = 1;
			this.gridBagConstraintsTipoGenero.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGenero.add(this.jButtonDuplicarTipoGenero, this.gridBagConstraintsTipoGenero);
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGenero.gridy = 1;
			this.gridBagConstraintsTipoGenero.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGenero.add(this.jButtonCopiarTipoGenero, this.gridBagConstraintsTipoGenero);
		
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGenero.gridy = 1;
			this.gridBagConstraintsTipoGenero.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGenero.add(this.jButtonVerFormTipoGenero, this.gridBagConstraintsTipoGenero);
		
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGenero.gridy = 1;
			this.gridBagConstraintsTipoGenero.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoGenero.add(this.jButtonCerrarTipoGenero, this.gridBagConstraintsTipoGenero);
		
		
		
		this.jButtonRecargarInformacionTipoGenero.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGenero.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGenero.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoGenero.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGenero.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGenero.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoGenero.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGenero.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGenero.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoGenero.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGenero.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGenero.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoGenero.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGenero.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGenero.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoGenero.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGenero.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGenero.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoGenero.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGenero.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGenero.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoGenero.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGenero.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGenero.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoGenero.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGenero.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGenero.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoGenero.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGenero.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGenero.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoGenero.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGenero.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGenero.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoGenero.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGenero.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGenero.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoGenero = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoGenero = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoGenero = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoGenero = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoGenero = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoGenero = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoGenero.setLayout(gridaBagParametrosReportesTipoGenero);
			this.jPanelParametrosReportesAccionesTipoGenero.setLayout(gridaBagParametrosReportesAccionesTipoGenero);
			
			
			this.jPanelParametrosAuxiliar1TipoGenero.setLayout(gridaBagParametrosAuxiliar1TipoGenero);
			this.jPanelParametrosAuxiliar2TipoGenero.setLayout(gridaBagParametrosAuxiliar2TipoGenero);
			this.jPanelParametrosAuxiliar3TipoGenero.setLayout(gridaBagParametrosAuxiliar3TipoGenero);
			this.jPanelParametrosAuxiliar4TipoGenero.setLayout(gridaBagParametrosAuxiliar4TipoGenero);
			//this.jPanelParametrosAuxiliar5TipoGenero.setLayout(gridaBagParametrosAuxiliar2TipoGenero);			
			
			
			
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGenero.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGenero.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGenero.add(this.jButtonRecargarInformacionTipoGenero, this.gridBagConstraintsTipoGenero);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGenero.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGenero.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGenero.add(this.jComboBoxTiposPaginacionTipoGenero, this.gridBagConstraintsTipoGenero);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGenero.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGenero.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGenero.add(this.jCheckBoxConAltoMaximoTablaTipoGenero, this.gridBagConstraintsTipoGenero);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGenero.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGenero.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGenero.add(this.jComboBoxTiposArchivosReportesTipoGenero, this.gridBagConstraintsTipoGenero);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGenero.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGenero.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGenero.add(this.jPanelParametrosAuxiliar1TipoGenero, this.gridBagConstraintsTipoGenero);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGenero.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGenero.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoGenero.add(this.jComboBoxTiposReportesTipoGenero, this.gridBagConstraintsTipoGenero);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGenero.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGenero.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGenero.add(this.jPanelParametrosAuxiliar4TipoGenero, this.gridBagConstraintsTipoGenero);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGenero.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGenero.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGenero.add(this.jComboBoxTiposReportesTipoGenero, this.gridBagConstraintsTipoGenero);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGenero.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGenero.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGenero.add(this.jCheckBoxGenerarReporteTipoGenero, this.gridBagConstraintsTipoGenero);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGenero.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGenero.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGenero.add(this.jPanelParametrosAuxiliar2TipoGenero, this.gridBagConstraintsTipoGenero);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGenero.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGenero.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGenero.add(this.jLabelAccionesTipoGenero, this.gridBagConstraintsTipoGenero);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoGenero = new GridBagConstraints();
				this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoGenero.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoGenero.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoGenero.add(this.jButtonAbrirOrderByTipoGenero, this.gridBagConstraintsTipoGenero);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoGenero.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGenero.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGenero.add(this.jComboBoxTiposSeleccionarTipoGenero, this.gridBagConstraintsTipoGenero);			
			
			
			/*
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGenero.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGenero.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGenero.add(this.jCheckBoxSeleccionarTodosTipoGenero, this.gridBagConstraintsTipoGenero);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGenero.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGenero.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGenero.add(this.jCheckBoxSeleccionarTodosTipoGenero, this.gridBagConstraintsTipoGenero);															
				
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGenero.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGenero.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGenero.add(this.jCheckBoxSeleccionadosTipoGenero, this.gridBagConstraintsTipoGenero);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGenero.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGenero.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGenero.add(this.jPanelParametrosAuxiliar3TipoGenero, this.gridBagConstraintsTipoGenero);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGenero.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGenero.add(this.jComboBoxTiposRelacionesTipoGenero, this.gridBagConstraintsTipoGenero);
				
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGenero.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGenero.add(this.jComboBoxTiposAccionesTipoGenero, this.gridBagConstraintsTipoGenero);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoGenero = new GridBagLayout();

			this.jScrollPanelDatosTipoGenero.setLayout(gridaBagLayoutDatosTipoGenero);
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGenero.gridy = 0;
			this.gridBagConstraintsTipoGenero.gridx = 0;
			
			this.jScrollPanelDatosTipoGenero.add(this.jTableDatosTipoGenero, this.gridBagConstraintsTipoGenero);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoGenero.setViewportView(this.jTableDatosTipoGenero);
		this.jTableDatosTipoGenero.setFillsViewportHeight(true);
		this.jTableDatosTipoGenero.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoGenero= new GridBagLayout();
		this.jPanelAccionesTipoGenero.setLayout(gridaBagLayoutAccionesTipoGenero);
		
		
		/*	
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGenero.gridy = 0;
		this.gridBagConstraintsTipoGenero.gridx = 0;
			
		this.jPanelAccionesTipoGenero.add(this.jButtonNuevoTipoGenero, this.gridBagConstraintsTipoGenero);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGenero = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGenero);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogeneroSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();						
			this.gridBagConstraintsTipoGenero.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGenero.gridx = 0;		
			//this.gridBagConstraintsTipoGenero.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGenero.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoGenero, this.gridBagConstraintsTipoGenero);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoGenero.gridx = 0;		
		//this.gridBagConstraintsTipoGenero.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGenero.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoGenero.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoGenero);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGenero.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoGenero, this.gridBagConstraintsTipoGenero);								
		
		
		/*
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGenero.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoGenero, this.gridBagConstraintsTipoGenero);
		*/		
		
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGenero.gridx =0;
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGenero.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGenero, this.gridBagConstraintsTipoGenero);
				
		
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGenero.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoGenero, this.gridBagConstraintsTipoGenero);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoGeneroJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoGenero= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGenero = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoGenero.setLayout(gridaBagLayoutBusquedasParametrosTipoGenero);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoGenero=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGenero.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGenero.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGenero.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGenero.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGenero, this.gridBagConstraintsTipoGenero);
			
			
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGenero.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGenero, this.gridBagConstraintsTipoGenero);
		
			
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGenero.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGenero, this.gridBagConstraintsTipoGenero);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoGenero;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoGenero() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoGenero = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoGenero = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoGenero.setName("jPanelReporteDinamicoTipoGenero"); 
		
		this.jPanelReporteDinamicoTipoGenero.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGenero.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGenero.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoGenero.setLayout(gridaBagLayoutReporteDinamicoTipoGenero);
		
		
		this.jInternalFrameReporteDinamicoTipoGenero= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoGenero = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGenero= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoGenero.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoGenero.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoGenero.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoGenero.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoGenero.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoGenero.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoGenero.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoGenero.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoGenero.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGenero.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGenero.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Generoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoGenero = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoGenero.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoGenero.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGenero.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGenero.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGenero.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGenero.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoGenero.add(this.jLabelColumnasSelectReporteTipoGenero, this.gridBagConstraintsTipoGenero);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoGenero = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoGenero.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoGenero.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoGenero.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGenero.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGenero.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoGenero=new JScrollPane(this.jListColumnasSelectReporteTipoGenero);
			
			this.jScrollColumnasSelectReporteTipoGenero.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGenero.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGenero.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGenero.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGenero.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoGenero.add(this.jListColumnasSelectReporteTipoGenero, this.gridBagConstraintsTipoGenero);
		this.jPanelReporteDinamicoTipoGenero.add(this.jScrollColumnasSelectReporteTipoGenero, this.gridBagConstraintsTipoGenero);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoGenero = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoGenero.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoGenero.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGenero.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGenero.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGenero.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGenero.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoGenero.add(this.jLabelRelacionesSelectReporteTipoGenero, this.gridBagConstraintsTipoGenero);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoGenero = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoGenero.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoGenero.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoGenero.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGenero.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGenero.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoGenero=new JScrollPane(this.jListRelacionesSelectReporteTipoGenero);
			
			this.jScrollRelacionesSelectReporteTipoGenero.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGenero.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGenero.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGenero.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGenero.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoGenero.add(this.jListRelacionesSelectReporteTipoGenero, this.gridBagConstraintsTipoGenero);
		this.jPanelReporteDinamicoTipoGenero.add(this.jScrollRelacionesSelectReporteTipoGenero, this.gridBagConstraintsTipoGenero);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoGenero = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoGenero = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoGenero = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoGenero = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoGenero.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoGenero.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGenero.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGenero.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoGenero = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGenero.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGenero.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGenero.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGenero.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoGenero = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoGenero.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoGenero.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGenero.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGenero.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGenero.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGenero.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGenero.add(this.jLabelGenerarExcelReporteDinamicoTipoGenero, this.gridBagConstraintsTipoGenero);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoGenero = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoGenero.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoGenero,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoGenero.setToolTipText("Generar EXCEL"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		//this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoGenero.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoGenero.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoGenero.add(this.jButtonGenerarExcelReporteDinamicoTipoGenero, this.gridBagConstraintsTipoGenero);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGenero.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGenero.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGenero.add(this.jComboBoxTiposReportesDinamicoTipoGenero, this.gridBagConstraintsTipoGenero);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoGenero = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoGenero.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoGenero.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGenero.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGenero.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGenero.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGenero.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGenero.add(this.jLabelTiposArchivoReporteDinamicoTipoGenero, this.gridBagConstraintsTipoGenero);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGenero.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGenero.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGenero.add(this.jComboBoxTiposArchivosReportesDinamicoTipoGenero, this.gridBagConstraintsTipoGenero);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoGenero = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoGenero.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoGenero,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoGenero.setToolTipText("Generar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGenero.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGenero.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGenero.add(this.jButtonGenerarReporteDinamicoTipoGenero, this.gridBagConstraintsTipoGenero);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoGenero = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoGenero.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoGenero,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoGenero.setToolTipText("Cancelar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGenero.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGenero.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGenero.add(this.jButtonCerrarReporteDinamicoTipoGenero, this.gridBagConstraintsTipoGenero);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoGenero = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoGenero= new JScrollPane(jPanelReporteDinamicoTipoGenero,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoGenero.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGenero.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGenero.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Generoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoGenero.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoGenero.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoGenero.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoGenero);
		this.jInternalFrameReporteDinamicoTipoGenero.getContentPane().add(this.jScrollPanelReporteDinamicoTipoGenero, this.gridBagConstraintsTipoGenero);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoGenero() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoGenero = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoGenero = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoGenero.setName("jPanelImportacionTipoGenero"); 
		
		this.jPanelImportacionTipoGenero.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGenero.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGenero.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoGenero.setLayout(gridaBagLayoutImportacionTipoGenero);
		
		
		this.jInternalFrameImportacionTipoGenero= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoGenero= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoGenero = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGenero= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoGenero.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGenero.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGenero.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoGenero.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGenero.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGenero.setResizable(true);
	    this.jInternalFrameImportacionTipoGenero.setClosable(true);
	    this.jInternalFrameImportacionTipoGenero.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoGenero.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGenero.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGenero.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoGenero.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGenero.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGenero.setResizable(true);
	    this.jInternalFrameImportacionTipoGenero.setClosable(true);
	    this.jInternalFrameImportacionTipoGenero.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoGenero.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGenero.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGenero.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Generoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoGenero = new JLabelMe();

		this.jLabelArchivoImportacionTipoGenero.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoGenero.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGenero.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGenero.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGenero.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGenero.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGenero.add(this.jLabelArchivoImportacionTipoGenero, this.gridBagConstraintsTipoGenero);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoGenero = new JFileChooser();		
		this.jFileChooserImportacionTipoGenero.setToolTipText("ESCOGER ARCHIVO"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoGenero = new JButtonMe();
		this.jButtonAbrirImportacionTipoGenero.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoGenero,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoGenero.setToolTipText("Generar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGenero.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGenero.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGenero.add(this.jButtonAbrirImportacionTipoGenero, this.gridBagConstraintsTipoGenero);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoGenero = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoGenero.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoGenero.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGenero.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGenero.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGenero.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGenero.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGenero.add(this.jLabelPathArchivoImportacionTipoGenero, this.gridBagConstraintsTipoGenero);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoGenero=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoGenero.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGenero.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGenero.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGenero.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGenero.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGenero.add(this.jTextFieldPathArchivoImportacionTipoGenero, this.gridBagConstraintsTipoGenero);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoGenero = new JButtonMe();
		this.jButtonGenerarImportacionTipoGenero.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoGenero,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoGenero.setToolTipText("Generar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGenero.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGenero.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGenero.add(this.jButtonGenerarImportacionTipoGenero, this.gridBagConstraintsTipoGenero);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoGenero = new JButtonMe();
		this.jButtonCerrarImportacionTipoGenero.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoGenero,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoGenero.setToolTipText("Cancelar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGenero.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGenero.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGenero.add(this.jButtonCerrarImportacionTipoGenero, this.gridBagConstraintsTipoGenero);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoGenero = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoGenero= new JScrollPane(jPanelImportacionTipoGenero,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoGenero = new GridBagConstraints();
		this.gridBagConstraintsTipoGenero.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoGenero.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoGenero.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoGenero.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoGenero);
		this.jInternalFrameImportacionTipoGenero.getContentPane().add(this.jScrollPanelImportacionTipoGenero, this.gridBagConstraintsTipoGenero);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoGenero(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoGenero = new JButtonMe();
			this.jButtonAbrirOrderByTipoGenero.setText("Orden");
			this.jButtonAbrirOrderByTipoGenero.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGenero,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoGenero";
			inputMap = this.jButtonAbrirOrderByTipoGenero.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoGenero.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoGenero"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoGenero = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoGenero = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoGenero.setName("jPanelOrderByTipoGenero"); 
			
			this.jPanelOrderByTipoGenero.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGenero.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGenero.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoGenero.setLayout(gridaBagLayoutOrderByTipoGenero);
			
			
			this.jTableDatosTipoGeneroOrderBy = new JTableMe();        
			this.jTableDatosTipoGeneroOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoGeneroOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoGeneroOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoGeneroOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoGeneroOrderBy.setViewportView(this.jTableDatosTipoGeneroOrderBy);
			this.jTableDatosTipoGeneroOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoGeneroOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoGenero= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoGenero= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoGenero = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoGenero= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoGenero.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoGenero.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoGenero.setTitle("Orden");
			this.jInternalFrameOrderByTipoGenero.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoGenero.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoGenero.setResizable(true);
			this.jInternalFrameOrderByTipoGenero.setClosable(true);
			this.jInternalFrameOrderByTipoGenero.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoGenero.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGenero.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGenero.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Generoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoGenero.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoGenero.ipady =150;
				
			this.jPanelOrderByTipoGenero.add(jScrollPanelDatosTipoGeneroOrderBy, this.gridBagConstraintsTipoGenero);//this.jTableDatosTipoGeneroTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoGenero = new JButtonMe();
			this.jButtonCerrarOrderByTipoGenero.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoGenero,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoGenero.setToolTipText("Cancelar"+" "+TipoGeneroConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoGenero, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGenero.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoGenero.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoGenero.add(this.jButtonCerrarOrderByTipoGenero, this.gridBagConstraintsTipoGenero);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoGenero = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoGenero= new JScrollPane(jPanelOrderByTipoGenero,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoGenero = new GridBagConstraints();
			this.gridBagConstraintsTipoGenero.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoGenero.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGenero.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoGenero.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoGenero.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoGenero);
			
			this.jInternalFrameOrderByTipoGenero.getContentPane().add(this.jScrollPanelOrderByTipoGenero, this.gridBagConstraintsTipoGenero);			
		
		} else {
			this.jButtonAbrirOrderByTipoGenero = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=600;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipogeneroSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoGenero.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoGenero.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoGenero.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoGenero.getRowHeight();//TipoGeneroConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoGeneroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGenero.isSelected()) {
					iHeightTable=TipoGeneroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGeneroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGeneroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoGeneroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGenero.isSelected()) {
					iHeightTable=TipoGeneroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGeneroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGeneroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoGenero.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGenero.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGenero.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoGenero.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGenero.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGenero.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoGenero!=null && this.jInternalFrameOrderByTipoGenero.getjTableDatosOrderBy()!=null) {
			//if(!this.tipogeneroSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoGenero.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoGenero.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoGenero.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoGenero.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoGenero.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoGenero.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoGenero.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoGenero.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGenero.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGenero.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipogeneroLogic.getTipoGeneros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogeneros.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoGenero> TraerTipoGeneroBeans(List<TipoGenero> tipogeneros,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoGenero tipogenero:tipogeneros) {
					
				if(!(TipoGeneroConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoGeneroConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipogenero.setsDetalleGeneralEntityReporte(TipoGeneroConstantesFunciones.getTipoGeneroDescripcion(tipogenero));
										
						
					
					

					if(tipogenero.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{tipogenero.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(tipogenero.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipogenero.getCargaFamiliar_NMs()!=null && Funciones.existeClass(classes,CargaFamiliar_NM.class)) {
						try{tipogenero.setcargafamiliar_nmsDescripcionReporte(new JRBeanCollectionDataSource(CargaFamiliar_NMJInternalFrame.TraerCargaFamiliar_NMBeans(tipogenero.getCargaFamiliar_NMs(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipogenero.getSubClientes()!=null && Funciones.existeClass(classes,SubCliente.class)) {
						try{tipogenero.setsubclientesDescripcionReporte(new JRBeanCollectionDataSource(SubClienteJInternalFrame.TraerSubClienteBeans(tipogenero.getSubClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipogenero.getEmpleados()!=null && Funciones.existeClass(classes,Empleado.class)) {
						try{tipogenero.setempleadosDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoJInternalFrame.TraerEmpleadoBeans(tipogenero.getEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipogenero.getParametroCarteraDefectos()!=null && Funciones.existeClass(classes,ParametroCarteraDefecto.class)) {
						try{tipogenero.setparametrocarteradefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroCarteraDefectoJInternalFrame.TraerParametroCarteraDefectoBeans(tipogenero.getParametroCarteraDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipogenero.getCargaFamiliars()!=null && Funciones.existeClass(classes,CargaFamiliar.class)) {
						try{tipogenero.setcargafamiliarsDescripcionReporte(new JRBeanCollectionDataSource(CargaFamiliarJInternalFrame.TraerCargaFamiliarBeans(tipogenero.getCargaFamiliars(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipogenero.setsDetalleGeneralEntityReporte(tipogenero.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipogenerobeans.add(tipogenerobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipogeneros;
    }
	//PARA REPORTES FIN
}
