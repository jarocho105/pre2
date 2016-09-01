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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.TipoProrrateoImporConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class TipoProrrateoImporJInternalFrame extends TipoProrrateoImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoProrrateoImpor;
	
	protected JMenuBar jmenuBarTipoProrrateoImpor;
	
	protected JMenu jmenuTipoProrrateoImpor;
	protected JMenu jmenuDatosTipoProrrateoImpor;
	protected JMenu jmenuArchivoTipoProrrateoImpor;
	protected JMenu jmenuAccionesTipoProrrateoImpor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoProrrateoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProrrateoImpor;	
	protected GridBagConstraints gridBagConstraintsTipoProrrateoImpor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoProrrateoImporDetalleFormJInternalFrame jInternalFrameDetalleFormTipoProrrateoImpor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoProrrateoImpor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoProrrateoImpor;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoProrrateoImporSessionBean tipoprorrateoimporSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoProrrateoImpor> tipoprorrateoimpors;		
	public List<TipoProrrateoImpor> tipoprorrateoimporsEliminados;	
	public List<TipoProrrateoImpor> tipoprorrateoimporsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoProrrateoImpor;		
	protected JButton jButtonAbrirOrderByTipoProrrateoImpor;
	
	
	//protected JPanel jPanelOrderByTipoProrrateoImpor;
	//public JScrollPane jScrollPanelOrderByTipoProrrateoImpor;	
	//protected JButton jButtonCerrarOrderByTipoProrrateoImpor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoProrrateoImporLogic tipoprorrateoimporLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoProrrateoImpor;
	public JScrollPane jScrollPanelDatosEdicionTipoProrrateoImpor;
	public JScrollPane jScrollPanelDatosGeneralTipoProrrateoImpor;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoProrrateoImporOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoProrrateoImpor;
	//public JScrollPane jScrollPanelImportacionTipoProrrateoImpor;
	
	
	
	protected JPanel jPanelAccionesTipoProrrateoImpor;
	
    protected JPanel jPanelPaginacionTipoProrrateoImpor;
    protected JPanel jPanelParametrosReportesTipoProrrateoImpor;
	protected JPanel jPanelParametrosReportesAccionesTipoProrrateoImpor;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoProrrateoImpor;
	protected JPanel jPanelParametrosAuxiliar2TipoProrrateoImpor;
	protected JPanel jPanelParametrosAuxiliar3TipoProrrateoImpor;
	protected JPanel jPanelParametrosAuxiliar4TipoProrrateoImpor;
	//protected JPanel jPanelParametrosAuxiliar5TipoProrrateoImpor;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoProrrateoImpor;
	//protected JPanel jPanelImportacionTipoProrrateoImpor;
	
	
	public JTable jTableDatosTipoProrrateoImpor;
	
	
	
	//public JTable jTableDatosTipoProrrateoImporOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoProrrateoImpor;
	protected JButton jButtonDuplicarTipoProrrateoImpor;
	protected JButton jButtonCopiarTipoProrrateoImpor;
	protected JButton jButtonVerFormTipoProrrateoImpor;
	protected JButton jButtonNuevoRelacionesTipoProrrateoImpor;
	protected JButton jButtonModificarTipoProrrateoImpor;
	
    protected JButton jButtonGuardarCambiosTablaTipoProrrateoImpor;
	protected JButton jButtonCerrarTipoProrrateoImpor;
	
	
	protected JButton jButtonRecargarInformacionTipoProrrateoImpor;
	protected JButton jButtonProcesarInformacionTipoProrrateoImpor;
	
	
	protected JButton jButtonAnterioresTipoProrrateoImpor;
	protected JButton jButtonSiguientesTipoProrrateoImpor;
	protected JButton jButtonNuevoGuardarCambiosTipoProrrateoImpor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoProrrateoImpor;
	//protected JButton jButtonCerrarReporteDinamicoTipoProrrateoImpor;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoProrrateoImpor;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoProrrateoImpor;
	//protected JButton jButtonGenerarImportacionTipoProrrateoImpor;
	//protected JButton jButtonCerrarImportacionTipoProrrateoImpor;
	//protected JFileChooser jFileChooserImportacionTipoProrrateoImpor;
	//protected File fileImportacionTipoProrrateoImpor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProrrateoImpor;
	protected JButton jButtonDuplicarToolBarTipoProrrateoImpor;
	protected JButton jButtonNuevoRelacionesToolBarTipoProrrateoImpor;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoProrrateoImpor;
	protected JButton jButtonCopiarToolBarTipoProrrateoImpor;
	protected JButton jButtonVerFormToolBarTipoProrrateoImpor;
	public JButton jButtonGuardarCambiosTablaToolBarTipoProrrateoImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProrrateoImpor;
	protected JButton jButtonCerrarToolBarTipoProrrateoImpor;
	
	protected JButton jButtonRecargarInformacionToolBarTipoProrrateoImpor;
	protected JButton jButtonProcesarInformacionToolBarTipoProrrateoImpor;
	protected JButton jButtonAnterioresToolBarTipoProrrateoImpor;
	protected JButton jButtonSiguientesToolBarTipoProrrateoImpor;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoProrrateoImpor;
	protected JButton jButtonAbrirOrderByToolBarTipoProrrateoImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProrrateoImpor;
	protected JMenuItem jMenuItemDuplicarTipoProrrateoImpor;
	protected JMenuItem jMenuItemNuevoRelacionesTipoProrrateoImpor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoProrrateoImpor;
	protected JMenuItem jMenuItemCopiarTipoProrrateoImpor;
	protected JMenuItem jMenuItemVerFormTipoProrrateoImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProrrateoImpor;
	protected JMenuItem jMenuItemCerrarTipoProrrateoImpor;
	protected JMenuItem jMenuItemDetalleCerrarTipoProrrateoImpor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoProrrateoImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProrrateoImpor;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoProrrateoImpor;
	protected JMenuItem jMenuItemProcesarInformacionTipoProrrateoImpor;
	protected JMenuItem jMenuItemAnterioresTipoProrrateoImpor;
	protected JMenuItem jMenuItemSiguientesTipoProrrateoImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProrrateoImpor;
	protected JMenuItem jMenuItemAbrirOrderByTipoProrrateoImpor;
	protected JMenuItem jMenuItemMostrarOcultarTipoProrrateoImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProrrateoImpor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoProrrateoImpor;
	protected JCheckBox jCheckBoxSeleccionadosTipoProrrateoImpor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoProrrateoImpor;
	protected JCheckBox jCheckBoxConGraficoReporteTipoProrrateoImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoProrrateoImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoProrrateoImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProrrateoImpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoProrrateoImpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoProrrateoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoProrrateoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProrrateoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProrrateoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoProrrateoImpor;
	protected JTextField jTextFieldValorCampoGeneralTipoProrrateoImpor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoProrrateoImpor;
	//public JList<Reporte> jListColumnasSelectReporteTipoProrrateoImpor;
	//public JScrollPane jScrollColumnasSelectReporteTipoProrrateoImpor;
	
	//public JLabel jLabelRelacionesSelectReporteTipoProrrateoImpor;
	//public JList<Reporte> jListRelacionesSelectReporteTipoProrrateoImpor;
	//public JScrollPane jScrollRelacionesSelectReporteTipoProrrateoImpor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoProrrateoImpor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoProrrateoImpor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoProrrateoImpor;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoProrrateoImpor;
	
		
	//public JLabel jLabelArchivoImportacionTipoProrrateoImpor;	
	//public JLabel jLabelPathArchivoImportacionTipoProrrateoImpor;
	//protected JTextField jTextFieldPathArchivoImportacionTipoProrrateoImpor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoProrrateoImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoProrrateoImpor;
	
	//public JLabel jLabelColumnaCategoriaValorTipoProrrateoImpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoProrrateoImpor;
	
	//public JLabel jLabelColumnasValoresGraficoTipoProrrateoImpor;
	//public JList<Reporte> jListColumnasValoresGraficoTipoProrrateoImpor;
	//public JScrollPane jScrollColumnasValoresGraficoTipoProrrateoImpor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoProrrateoImpor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoProrrateoImpor;	
	
	
	
	
	
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
	public TipoProrrateoImporJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoProrrateoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProrrateoImporJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProrrateoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProrrateoImporJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProrrateoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProrrateoImporJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProrrateoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoProrrateoImpor)	{
		this.jButtonRecargarInformacionTipoProrrateoImpor = jButtonRecargarInformacionTipoProrrateoImpor;
	}
	
	public JButton getjButtonProcesarInformacionTipoProrrateoImpor() {
		return this.jButtonProcesarInformacionTipoProrrateoImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProrrateoImpor)	{
		this.jButtonProcesarInformacionTipoProrrateoImpor = jButtonProcesarInformacionTipoProrrateoImpor;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoProrrateoImpor() {
		return this.jButtonRecargarInformacionTipoProrrateoImpor;
	}
	
	
	public List<TipoProrrateoImpor> gettipoprorrateoimpors() {
		return this.tipoprorrateoimpors;
	}

	public void settipoprorrateoimpors(List<TipoProrrateoImpor> tipoprorrateoimpors) {
		this.tipoprorrateoimpors = tipoprorrateoimpors;
	}
	
	public List<TipoProrrateoImpor> gettipoprorrateoimporsAux() {
		return this.tipoprorrateoimporsAux;
	}

	public void settipoprorrateoimporsAux(List<TipoProrrateoImpor> tipoprorrateoimporsAux) {
		this.tipoprorrateoimporsAux = tipoprorrateoimporsAux;
	}
	
	public List<TipoProrrateoImpor> gettipoprorrateoimporsEliminados() {
		return this.tipoprorrateoimporsEliminados;
	}

	public void setTipoProrrateoImporsEliminados(List<TipoProrrateoImpor> tipoprorrateoimporsEliminados) {
		this.tipoprorrateoimporsEliminados = tipoprorrateoimporsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoProrrateoImpor() {
		return jComboBoxTiposSeleccionarTipoProrrateoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoProrrateoImpor(
			JComboBox jComboBoxTiposSeleccionarTipoProrrateoImpor) {
		this.jComboBoxTiposSeleccionarTipoProrrateoImpor = jComboBoxTiposSeleccionarTipoProrrateoImpor;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoProrrateoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoProrrateoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoProrrateoImpor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoProrrateoImpor() {
		return jTextFieldValorCampoGeneralTipoProrrateoImpor;
	}

	public void setjTextFieldValorCampoGeneralTipoProrrateoImpor(
			JTextField jTextFieldValorCampoGeneralTipoProrrateoImpor) {
		this.jTextFieldValorCampoGeneralTipoProrrateoImpor = jTextFieldValorCampoGeneralTipoProrrateoImpor;
	}

	public void setBorderResaltarValorCampoGeneralTipoProrrateoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProrrateoImpor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoProrrateoImpor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoProrrateoImpor() {
		return this.jCheckBoxSeleccionarTodosTipoProrrateoImpor;
	}

	public void setjCheckBoxSeleccionarTodosTipoProrrateoImpor(
			JCheckBox jCheckBoxSeleccionarTodosTipoProrrateoImpor) {
		this.jCheckBoxSeleccionarTodosTipoProrrateoImpor = jCheckBoxSeleccionarTodosTipoProrrateoImpor;
	}

	public void setBorderResaltarSeleccionarTodosTipoProrrateoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProrrateoImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoProrrateoImpor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoProrrateoImpor() {
		return this.jCheckBoxSeleccionadosTipoProrrateoImpor;
	}

	public void setjCheckBoxSeleccionadosTipoProrrateoImpor(
			JCheckBox jCheckBoxSeleccionadosTipoProrrateoImpor) {
		this.jCheckBoxSeleccionadosTipoProrrateoImpor = jCheckBoxSeleccionadosTipoProrrateoImpor;
	}
	
	public void setBorderResaltarSeleccionadosTipoProrrateoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProrrateoImpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoProrrateoImpor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoProrrateoImpor() {
		return this.jComboBoxTiposArchivosReportesTipoProrrateoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoProrrateoImpor(
			JComboBox jComboBoxTiposArchivosReportesTipoProrrateoImpor) {
		this.jComboBoxTiposArchivosReportesTipoProrrateoImpor = jComboBoxTiposArchivosReportesTipoProrrateoImpor;
	}

	public void setBorderResaltarTiposArchivosReportesTipoProrrateoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProrrateoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoProrrateoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoProrrateoImpor() {
		return this.jComboBoxTiposReportesTipoProrrateoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoProrrateoImpor(
			JComboBox jComboBoxTiposReportesTipoProrrateoImpor) {
		this.jComboBoxTiposReportesTipoProrrateoImpor = jComboBoxTiposReportesTipoProrrateoImpor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoProrrateoImpor() {
	//	return jComboBoxTiposReportesDinamicoTipoProrrateoImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoProrrateoImpor(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoProrrateoImpor) {
	//	this.jComboBoxTiposReportesDinamicoTipoProrrateoImpor = jComboBoxTiposReportesDinamicoTipoProrrateoImpor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoProrrateoImpor() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoProrrateoImpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoProrrateoImpor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProrrateoImpor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoProrrateoImpor = jComboBoxTiposArchivosReportesDinamicoTipoProrrateoImpor;
	//}
	
	public void setBorderResaltarTiposReportesTipoProrrateoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProrrateoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoProrrateoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoProrrateoImpor() {
		return this.jComboBoxTiposGraficosReportesTipoProrrateoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoProrrateoImpor(
			JComboBox jComboBoxTiposGraficosReportesTipoProrrateoImpor) {
		this.jComboBoxTiposGraficosReportesTipoProrrateoImpor = jComboBoxTiposGraficosReportesTipoProrrateoImpor;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoProrrateoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProrrateoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoProrrateoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoProrrateoImpor() {
		return this.jComboBoxTiposPaginacionTipoProrrateoImpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoProrrateoImpor(
			JComboBox jComboBoxTiposPaginacionTipoProrrateoImpor) {
		this.jComboBoxTiposPaginacionTipoProrrateoImpor = jComboBoxTiposPaginacionTipoProrrateoImpor;
	}
	
	public void setBorderResaltarTiposPaginacionTipoProrrateoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProrrateoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoProrrateoImpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoProrrateoImpor() {
		return this.jComboBoxTiposRelacionesTipoProrrateoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProrrateoImpor() {
		return this.jComboBoxTiposAccionesTipoProrrateoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProrrateoImpor(
			JComboBox jComboBoxTiposRelacionesTipoProrrateoImpor) {
		this.jComboBoxTiposRelacionesTipoProrrateoImpor = jComboBoxTiposRelacionesTipoProrrateoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProrrateoImpor(
			JComboBox jComboBoxTiposAccionesTipoProrrateoImpor) {
		this.jComboBoxTiposAccionesTipoProrrateoImpor = jComboBoxTiposAccionesTipoProrrateoImpor;
	}
	
	public void setBorderResaltarTiposRelacionesTipoProrrateoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProrrateoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoProrrateoImpor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoProrrateoImpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProrrateoImpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoProrrateoImpor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoProrrateoImpor() {
	//	return jCheckBoxConGraficoDinamicoTipoProrrateoImpor;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoProrrateoImpor(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoProrrateoImpor) {
	//	this.jCheckBoxConGraficoDinamicoTipoProrrateoImpor = jCheckBoxConGraficoDinamicoTipoProrrateoImpor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoProrrateoImpor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoProrrateoImpor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoProrrateoImpor .setBorder(borderResaltar);		
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
		this.tipoprorrateoimporSessionBean=new TipoProrrateoImporSessionBean();
		
		this.tipoprorrateoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprorrateoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoProrrateoImporJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoProrrateoImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProrrateoImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProrrateoImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProrrateoImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Prorrateo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoProrrateoImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoProrrateoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoProrrateoImpor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoProrrateoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoProrrateoImpor,this.jTtoolBarTipoProrrateoImpor,
							"nuevo","nuevo","Nuevo"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProrrateoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoProrrateoImpor,this.jTtoolBarTipoProrrateoImpor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProrrateoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoProrrateoImpor,this.jTtoolBarTipoProrrateoImpor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoProrrateoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoProrrateoImpor,this.jTtoolBarTipoProrrateoImpor,
							"duplicar","duplicar","Duplicar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoProrrateoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoProrrateoImpor,this.jTtoolBarTipoProrrateoImpor,
							"copiar","copiar","Copiar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoProrrateoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoProrrateoImpor,this.jTtoolBarTipoProrrateoImpor,
							"ver_form","ver_form","Ver"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoProrrateoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProrrateoImpor,this.jTtoolBarTipoProrrateoImpor,
							"recargar","recargar","Recargar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoProrrateoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProrrateoImpor,this.jTtoolBarTipoProrrateoImpor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoProrrateoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProrrateoImpor,this.jTtoolBarTipoProrrateoImpor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoProrrateoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoProrrateoImpor,this.jTtoolBarTipoProrrateoImpor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoProrrateoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoProrrateoImpor,this.jTtoolBarTipoProrrateoImpor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoProrrateoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoProrrateoImpor,this.jTtoolBarTipoProrrateoImpor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoProrrateoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoProrrateoImpor,this.jTtoolBarTipoProrrateoImpor,
							"cerrar","cerrar","Salir"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoProrrateoImpor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoProrrateoImpor;
			
				this.jButtonProcesarInformacionToolBarTipoProrrateoImpor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoProrrateoImpor;
				
		//protected JButton jButtonModificarToolBarTipoProrrateoImpor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoProrrateoImpor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoProrrateoImpor=new JMenuMe("General");
		this.jmenuArchivoTipoProrrateoImpor=new JMenuMe("Archivo");
		this.jmenuAccionesTipoProrrateoImpor=new JMenuMe("Acciones");
		this.jmenuDatosTipoProrrateoImpor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProrrateoImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProrrateoImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProrrateoImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoProrrateoImpor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoProrrateoImpor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoProrrateoImpor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoProrrateoImpor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoProrrateoImpor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoProrrateoImpor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoProrrateoImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProrrateoImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProrrateoImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoProrrateoImpor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoProrrateoImpor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoProrrateoImpor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoProrrateoImpor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoProrrateoImpor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoProrrateoImpor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoProrrateoImpor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoProrrateoImpor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoProrrateoImpor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProrrateoImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProrrateoImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProrrateoImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoProrrateoImpor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoProrrateoImpor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoProrrateoImpor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoProrrateoImpor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoProrrateoImpor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoProrrateoImpor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoProrrateoImpor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoProrrateoImpor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoProrrateoImpor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoProrrateoImpor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoProrrateoImpor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoProrrateoImpor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoProrrateoImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoProrrateoImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoProrrateoImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProrrateoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProrrateoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProrrateoImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoProrrateoImpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoProrrateoImpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoProrrateoImpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProrrateoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProrrateoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProrrateoImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoProrrateoImpor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoProrrateoImpor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoProrrateoImpor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoProrrateoImpor.add(this.jMenuItemCerrarTipoProrrateoImpor);
			
			this.jmenuAccionesTipoProrrateoImpor.add(this.jMenuItemNuevoTipoProrrateoImpor);
			this.jmenuAccionesTipoProrrateoImpor.add(this.jMenuItemNuevoGuardarCambiosTipoProrrateoImpor);
			this.jmenuAccionesTipoProrrateoImpor.add(this.jMenuItemNuevoRelacionesTipoProrrateoImpor);
			this.jmenuAccionesTipoProrrateoImpor.add(this.jMenuItemGuardarCambiosTablaTipoProrrateoImpor);		
			this.jmenuAccionesTipoProrrateoImpor.add(this.jMenuItemDuplicarTipoProrrateoImpor);		
			this.jmenuAccionesTipoProrrateoImpor.add(this.jMenuItemCopiarTipoProrrateoImpor);		
			this.jmenuAccionesTipoProrrateoImpor.add(this.jMenuItemVerFormTipoProrrateoImpor);		
			
			this.jmenuDatosTipoProrrateoImpor.add(this.jMenuItemRecargarInformacionTipoProrrateoImpor);				
			this.jmenuDatosTipoProrrateoImpor.add(this.jMenuItemAnterioresTipoProrrateoImpor);				
			this.jmenuDatosTipoProrrateoImpor.add(this.jMenuItemSiguientesTipoProrrateoImpor);				
			this.jmenuDatosTipoProrrateoImpor.add(this.jMenuItemAbrirOrderByTipoProrrateoImpor);				
			this.jmenuDatosTipoProrrateoImpor.add(this.jMenuItemMostrarOcultarTipoProrrateoImpor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoProrrateoImpor.add(this.jMenuItemGuardarCambiosTipoProrrateoImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoProrrateoImpor.add(this.jmenuArchivoTipoProrrateoImpor);		
			this.jmenuBarTipoProrrateoImpor.add(this.jmenuAccionesTipoProrrateoImpor);		
			this.jmenuBarTipoProrrateoImpor.add(this.jmenuDatosTipoProrrateoImpor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoProrrateoImpor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoProrrateoImpor() {
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
			//this.jInternalFrameDetalleTipoProrrateoImpor = new TipoProrrateoImporDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Prorrateo DATOS");
			this.jInternalFrameDetalleFormTipoProrrateoImpor = new TipoProrrateoImporDetalleFormJInternalFrame(jDesktopPane,this.tipoprorrateoimporSessionBean.getConGuardarRelaciones(),this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoProrrateoImpor = null;//new TipoProrrateoImporDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProrrateoImpor= new GridBagLayout();
		
		
		this.jTableDatosTipoProrrateoImpor = new JTableMe();      
		
		String sToolTipTipoProrrateoImpor="";
		sToolTipTipoProrrateoImpor=TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProrrateoImpor+="(Importaciones.TipoProrrateoImpor)";
		}
		
		if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProrrateoImpor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoProrrateoImpor.setToolTipText(sToolTipTipoProrrateoImpor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoProrrateoImpor);
		this.jTableDatosTipoProrrateoImpor.setAutoCreateRowSorter(true);
		this.jTableDatosTipoProrrateoImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoProrrateoImpor.setRowSelectionAllowed(true);
		this.jTableDatosTipoProrrateoImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoProrrateoImpor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoProrrateoImpor = new JButtonMe();
		this.jButtonDuplicarTipoProrrateoImpor = new JButtonMe();
		this.jButtonCopiarTipoProrrateoImpor = new JButtonMe();
		this.jButtonVerFormTipoProrrateoImpor = new JButtonMe();
		this.jButtonNuevoRelacionesTipoProrrateoImpor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoProrrateoImpor = new JButtonMe();
		this.jButtonCerrarTipoProrrateoImpor = new JButtonMe();
		
		this.jScrollPanelDatosTipoProrrateoImpor = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoProrrateoImpor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoProrrateoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Prorrateo";
		
		if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prorrateos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProrrateoImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProrrateoImpor.setToolTipText("Acciones");
        this.jPanelAccionesTipoProrrateoImpor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoProrrateoImpor=new ReporteDinamicoJInternalFrame(TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoProrrateoImpor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoProrrateoImpor=new ImportacionJInternalFrame(TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoProrrateoImpor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoProrrateoImpor = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoProrrateoImpor.setText("Orden");
		this.jButtonAbrirOrderByTipoProrrateoImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProrrateoImpor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoProrrateoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProrrateoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProrrateoImpor,false,this);
			
			//this.cargarOrderByTipoProrrateoImpor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProrrateoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProrrateoImpor,true,this);
			
			//this.cargarOrderByTipoProrrateoImpor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoProrrateoImpor.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoProrrateoImpor.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoProrrateoImpor.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoProrrateoImpor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProrrateoImpor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProrrateoImpor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoProrrateoImpor.setText("Nuevo");
		this.jButtonDuplicarTipoProrrateoImpor.setText("Duplicar");
		this.jButtonCopiarTipoProrrateoImpor.setText("Copiar");
		this.jButtonVerFormTipoProrrateoImpor.setText("Ver");
		this.jButtonNuevoRelacionesTipoProrrateoImpor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoProrrateoImpor.setText("Guardar");
		this.jButtonCerrarTipoProrrateoImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProrrateoImpor,"nuevo_button","Nuevo",this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoProrrateoImpor,"duplicar_button","Duplicar",this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoProrrateoImpor,"copiar_button","Copiar",this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoProrrateoImpor,"ver_form","Ver",this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoProrrateoImpor,"nuevorelaciones_button","Nuevo Rel",this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProrrateoImpor,"guardarcambiostabla_button","Guardar",this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProrrateoImpor,"cerrar_button","Salir",this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoProrrateoImpor.setToolTipText("Nuevo"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoProrrateoImpor.setToolTipText("Duplicar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoProrrateoImpor.setToolTipText("Copiar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoProrrateoImpor.setToolTipText("Ver"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoProrrateoImpor.setToolTipText("Nuevo Rel"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoProrrateoImpor.setToolTipText("Guardar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProrrateoImpor.setToolTipText("Salir"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProrrateoImpor";
		inputMap = this.jButtonNuevoTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProrrateoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProrrateoImpor"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoProrrateoImpor";
		inputMap = this.jButtonDuplicarTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoProrrateoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoProrrateoImpor"));
		
		//COPIAR
		sMapKey = "CopiarTipoProrrateoImpor";
		inputMap = this.jButtonCopiarTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoProrrateoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoProrrateoImpor"));
		
		//VEr FORM
		sMapKey = "VerFormTipoProrrateoImpor";
		inputMap = this.jButtonVerFormTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoProrrateoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoProrrateoImpor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoProrrateoImpor";
		inputMap = this.jButtonNuevoRelacionesTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoProrrateoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoProrrateoImpor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoProrrateoImpor";
		inputMap = this.jButtonModificarTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoProrrateoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoProrrateoImpor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoProrrateoImpor";
		inputMap = this.jButtonCerrarTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProrrateoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProrrateoImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProrrateoImpor";
		inputMap = this.jButtonGuardarCambiosTablaTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProrrateoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProrrateoImpor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoProrrateoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoProrrateoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoProrrateoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoProrrateoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoProrrateoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoProrrateoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoProrrateoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoProrrateoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoProrrateoImpor.setName("jPanelParametrosReportesTipoProrrateoImpor"); 
		
		this.jPanelParametrosReportesAccionesTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoProrrateoImpor.setName("jPanelParametrosReportesAccionesTipoProrrateoImpor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoProrrateoImpor = new JButtonMe();
		this.jButtonRecargarInformacionTipoProrrateoImpor.setText("Recargar");
		this.jButtonRecargarInformacionTipoProrrateoImpor.setToolTipText("Recargar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoProrrateoImpor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoProrrateoImpor = new JButtonMe();
		this.jButtonProcesarInformacionTipoProrrateoImpor.setText("Procesar");
		this.jButtonProcesarInformacionTipoProrrateoImpor.setToolTipText("Procesar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoProrrateoImpor.setVisible(false);
			
		this.jButtonProcesarInformacionTipoProrrateoImpor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProrrateoImpor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProrrateoImpor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoProrrateoImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProrrateoImpor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoProrrateoImpor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoProrrateoImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProrrateoImpor.setText("TIPO");       
		this.jComboBoxTiposReportesTipoProrrateoImpor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoProrrateoImpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProrrateoImpor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoProrrateoImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoProrrateoImpor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoProrrateoImpor.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoProrrateoImpor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoProrrateoImpor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoProrrateoImpor.setText("Accion");
		this.jComboBoxTiposRelacionesTipoProrrateoImpor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoProrrateoImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProrrateoImpor.setText("Accion");
		this.jComboBoxTiposAccionesTipoProrrateoImpor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoProrrateoImpor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoProrrateoImpor.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoProrrateoImpor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoProrrateoImpor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoProrrateoImpor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProrrateoImpor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProrrateoImpor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoProrrateoImpor = new JLabelMe();
		
		this.jLabelAccionesTipoProrrateoImpor.setText("Acciones");		
		this.jLabelAccionesTipoProrrateoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProrrateoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProrrateoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoProrrateoImpor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoProrrateoImpor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoProrrateoImpor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoProrrateoImpor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoProrrateoImpor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoProrrateoImpor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoProrrateoImpor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoProrrateoImpor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoProrrateoImpor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoProrrateoImpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoProrrateoImpor.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoProrrateoImpor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoProrrateoImpor = new JButtonMe();
		//this.jButtonAnterioresTipoProrrateoImpor.setText("<<");
        this.jButtonAnterioresTipoProrrateoImpor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoProrrateoImpor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoProrrateoImpor = new JButtonMe();
		//this.jButtonSiguientesTipoProrrateoImpor.setText(">>");
        this.jButtonSiguientesTipoProrrateoImpor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoProrrateoImpor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoProrrateoImpor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoProrrateoImpor.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoProrrateoImpor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoProrrateoImpor,"nuevoguardarcambios_button","Nue",this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoProrrateoImpor";
		inputMap = this.jButtonNuevoGuardarCambiosTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoProrrateoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoProrrateoImpor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoProrrateoImpor";
		inputMap = this.jButtonRecargarInformacionTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoProrrateoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoProrrateoImpor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoProrrateoImpor";
		inputMap = this.jButtonSiguientesTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoProrrateoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoProrrateoImpor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoProrrateoImpor";
		inputMap = this.jButtonAnterioresTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoProrrateoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoProrrateoImpor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoProrrateoImpor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoProrrateoImpor.setMinimumSize(new Dimension(this.getWidth(),TipoProrrateoImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProrrateoImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProrrateoImpor.setMaximumSize(new Dimension(this.getWidth(),TipoProrrateoImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProrrateoImporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProrrateoImpor.setPreferredSize(new Dimension(this.getWidth(),TipoProrrateoImporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProrrateoImporBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoProrrateoImpor = new GridBagLayout();

			this.jPanelPaginacionTipoProrrateoImpor.setLayout(gridaBagLayoutPaginacionTipoProrrateoImpor);						
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoProrrateoImpor.add(this.jButtonAnterioresTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
					
						
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;
			
			this.jPanelPaginacionTipoProrrateoImpor.add(this.jButtonNuevoGuardarCambiosTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
						
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;
			this.jPanelPaginacionTipoProrrateoImpor.add(this.jButtonSiguientesTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = 1;
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProrrateoImpor.add(this.jButtonNuevoTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
						
			
			
			if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
				this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProrrateoImpor.gridy = 1;
				this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoProrrateoImpor.add(this.jButtonGuardarCambiosTablaTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
			}
			
			
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = 1;
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProrrateoImpor.add(this.jButtonDuplicarTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = 1;
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProrrateoImpor.add(this.jButtonCopiarTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = 1;
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProrrateoImpor.add(this.jButtonVerFormTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = 1;
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoProrrateoImpor.add(this.jButtonCerrarTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		
		
		
		this.jButtonRecargarInformacionTipoProrrateoImpor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProrrateoImpor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProrrateoImpor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoProrrateoImpor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProrrateoImpor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProrrateoImpor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoProrrateoImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProrrateoImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProrrateoImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoProrrateoImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProrrateoImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProrrateoImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoProrrateoImpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProrrateoImpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProrrateoImpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoProrrateoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProrrateoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProrrateoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoProrrateoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProrrateoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProrrateoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoProrrateoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProrrateoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProrrateoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoProrrateoImpor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProrrateoImpor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProrrateoImpor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoProrrateoImpor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProrrateoImpor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProrrateoImpor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoProrrateoImpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProrrateoImpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProrrateoImpor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoProrrateoImpor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProrrateoImpor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProrrateoImpor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoProrrateoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoProrrateoImpor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoProrrateoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoProrrateoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoProrrateoImpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoProrrateoImpor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoProrrateoImpor.setLayout(gridaBagParametrosReportesTipoProrrateoImpor);
			this.jPanelParametrosReportesAccionesTipoProrrateoImpor.setLayout(gridaBagParametrosReportesAccionesTipoProrrateoImpor);
			
			
			this.jPanelParametrosAuxiliar1TipoProrrateoImpor.setLayout(gridaBagParametrosAuxiliar1TipoProrrateoImpor);
			this.jPanelParametrosAuxiliar2TipoProrrateoImpor.setLayout(gridaBagParametrosAuxiliar2TipoProrrateoImpor);
			this.jPanelParametrosAuxiliar3TipoProrrateoImpor.setLayout(gridaBagParametrosAuxiliar3TipoProrrateoImpor);
			this.jPanelParametrosAuxiliar4TipoProrrateoImpor.setLayout(gridaBagParametrosAuxiliar4TipoProrrateoImpor);
			//this.jPanelParametrosAuxiliar5TipoProrrateoImpor.setLayout(gridaBagParametrosAuxiliar2TipoProrrateoImpor);			
			
			
			
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProrrateoImpor.add(this.jButtonRecargarInformacionTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProrrateoImpor.add(this.jComboBoxTiposPaginacionTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProrrateoImpor.add(this.jCheckBoxConAltoMaximoTablaTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProrrateoImpor.add(this.jComboBoxTiposArchivosReportesTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProrrateoImpor.add(this.jPanelParametrosAuxiliar1TipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProrrateoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProrrateoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoProrrateoImpor.add(this.jComboBoxTiposReportesTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProrrateoImpor.add(this.jPanelParametrosAuxiliar4TipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProrrateoImpor.add(this.jComboBoxTiposReportesTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProrrateoImpor.add(this.jCheckBoxGenerarReporteTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProrrateoImpor.add(this.jPanelParametrosAuxiliar2TipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProrrateoImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProrrateoImpor.add(this.jLabelAccionesTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
				this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoProrrateoImpor.add(this.jButtonAbrirOrderByTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProrrateoImpor.add(this.jComboBoxTiposSeleccionarTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);			
			
			
			/*
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProrrateoImpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProrrateoImpor.add(this.jCheckBoxSeleccionarTodosTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProrrateoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProrrateoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProrrateoImpor.add(this.jCheckBoxSeleccionarTodosTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);															
				
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProrrateoImpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProrrateoImpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProrrateoImpor.add(this.jCheckBoxSeleccionadosTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProrrateoImpor.add(this.jPanelParametrosAuxiliar3TipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProrrateoImpor.add(this.jComboBoxTiposRelacionesTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
				
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProrrateoImpor.add(this.jComboBoxTiposAccionesTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoProrrateoImpor = new GridBagLayout();

			this.jScrollPanelDatosTipoProrrateoImpor.setLayout(gridaBagLayoutDatosTipoProrrateoImpor);
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;
			this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
			
			this.jScrollPanelDatosTipoProrrateoImpor.add(this.jTableDatosTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoProrrateoImpor.setViewportView(this.jTableDatosTipoProrrateoImpor);
		this.jTableDatosTipoProrrateoImpor.setFillsViewportHeight(true);
		this.jTableDatosTipoProrrateoImpor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoProrrateoImpor= new GridBagLayout();
		this.jPanelAccionesTipoProrrateoImpor.setLayout(gridaBagLayoutAccionesTipoProrrateoImpor);
		
		
		/*	
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;
		this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
			
		this.jPanelAccionesTipoProrrateoImpor.add(this.jButtonNuevoTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProrrateoImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProrrateoImpor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();						
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;		
			//this.gridBagConstraintsTipoProrrateoImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProrrateoImpor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;		
		//this.gridBagConstraintsTipoProrrateoImpor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoProrrateoImpor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoProrrateoImpor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);								
		
		
		/*
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		*/		
		
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProrrateoImpor.gridx =0;
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProrrateoImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
				
		
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoProrrateoImporJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoProrrateoImpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProrrateoImpor = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoProrrateoImpor.setLayout(gridaBagLayoutBusquedasParametrosTipoProrrateoImpor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoProrrateoImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProrrateoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProrrateoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProrrateoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
			
			
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		
			
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoProrrateoImpor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoProrrateoImpor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoProrrateoImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoProrrateoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoProrrateoImpor.setName("jPanelReporteDinamicoTipoProrrateoImpor"); 
		
		this.jPanelReporteDinamicoTipoProrrateoImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProrrateoImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProrrateoImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoProrrateoImpor.setLayout(gridaBagLayoutReporteDinamicoTipoProrrateoImpor);
		
		
		this.jInternalFrameReporteDinamicoTipoProrrateoImpor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoProrrateoImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProrrateoImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoProrrateoImpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProrrateoImpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProrrateoImpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prorrateos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoProrrateoImpor = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoProrrateoImpor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoProrrateoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProrrateoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProrrateoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProrrateoImpor.add(this.jLabelColumnasSelectReporteTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoProrrateoImpor = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoProrrateoImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoProrrateoImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoProrrateoImpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProrrateoImpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProrrateoImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoProrrateoImpor=new JScrollPane(this.jListColumnasSelectReporteTipoProrrateoImpor);
			
			this.jScrollColumnasSelectReporteTipoProrrateoImpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProrrateoImpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProrrateoImpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProrrateoImpor.add(this.jListColumnasSelectReporteTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		this.jPanelReporteDinamicoTipoProrrateoImpor.add(this.jScrollColumnasSelectReporteTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoProrrateoImpor = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoProrrateoImpor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoProrrateoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProrrateoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProrrateoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoProrrateoImpor = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoProrrateoImpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoProrrateoImpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoProrrateoImpor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProrrateoImpor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProrrateoImpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoProrrateoImpor=new JScrollPane(this.jListRelacionesSelectReporteTipoProrrateoImpor);
			
			this.jScrollRelacionesSelectReporteTipoProrrateoImpor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProrrateoImpor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProrrateoImpor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoProrrateoImpor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoProrrateoImpor = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoProrrateoImpor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoProrrateoImpor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoProrrateoImpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoProrrateoImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProrrateoImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProrrateoImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoProrrateoImpor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProrrateoImpor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProrrateoImpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProrrateoImpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProrrateoImpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoProrrateoImpor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoProrrateoImpor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoProrrateoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProrrateoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProrrateoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProrrateoImpor.add(this.jLabelGenerarExcelReporteDinamicoTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoProrrateoImpor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoProrrateoImpor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoProrrateoImpor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoProrrateoImpor.setToolTipText("Generar EXCEL"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		//this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoProrrateoImpor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoProrrateoImpor.add(this.jButtonGenerarExcelReporteDinamicoTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProrrateoImpor.add(this.jComboBoxTiposReportesDinamicoTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoProrrateoImpor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoProrrateoImpor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoProrrateoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProrrateoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProrrateoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProrrateoImpor.add(this.jLabelTiposArchivoReporteDinamicoTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProrrateoImpor.add(this.jComboBoxTiposArchivosReportesDinamicoTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoProrrateoImpor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoProrrateoImpor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoProrrateoImpor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoProrrateoImpor.setToolTipText("Generar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProrrateoImpor.add(this.jButtonGenerarReporteDinamicoTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoProrrateoImpor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoProrrateoImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoProrrateoImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoProrrateoImpor.setToolTipText("Cancelar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProrrateoImpor.add(this.jButtonCerrarReporteDinamicoTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoProrrateoImpor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoProrrateoImpor= new JScrollPane(jPanelReporteDinamicoTipoProrrateoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoProrrateoImpor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProrrateoImpor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProrrateoImpor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prorrateos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoProrrateoImpor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoProrrateoImpor);
		this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getContentPane().add(this.jScrollPanelReporteDinamicoTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoProrrateoImpor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoProrrateoImpor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoProrrateoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoProrrateoImpor.setName("jPanelImportacionTipoProrrateoImpor"); 
		
		this.jPanelImportacionTipoProrrateoImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProrrateoImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProrrateoImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoProrrateoImpor.setLayout(gridaBagLayoutImportacionTipoProrrateoImpor);
		
		
		this.jInternalFrameImportacionTipoProrrateoImpor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoProrrateoImpor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoProrrateoImpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProrrateoImpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoProrrateoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProrrateoImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProrrateoImpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoProrrateoImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProrrateoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProrrateoImpor.setResizable(true);
	    this.jInternalFrameImportacionTipoProrrateoImpor.setClosable(true);
	    this.jInternalFrameImportacionTipoProrrateoImpor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoProrrateoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProrrateoImpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProrrateoImpor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoProrrateoImpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProrrateoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProrrateoImpor.setResizable(true);
	    this.jInternalFrameImportacionTipoProrrateoImpor.setClosable(true);
	    this.jInternalFrameImportacionTipoProrrateoImpor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoProrrateoImpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProrrateoImpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProrrateoImpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prorrateos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoProrrateoImpor = new JLabelMe();

		this.jLabelArchivoImportacionTipoProrrateoImpor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoProrrateoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProrrateoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProrrateoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProrrateoImpor.add(this.jLabelArchivoImportacionTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoProrrateoImpor = new JFileChooser();		
		this.jFileChooserImportacionTipoProrrateoImpor.setToolTipText("ESCOGER ARCHIVO"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoProrrateoImpor = new JButtonMe();
		this.jButtonAbrirImportacionTipoProrrateoImpor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoProrrateoImpor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoProrrateoImpor.setToolTipText("Generar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProrrateoImpor.add(this.jButtonAbrirImportacionTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoProrrateoImpor = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoProrrateoImpor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoProrrateoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProrrateoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProrrateoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProrrateoImpor.add(this.jLabelPathArchivoImportacionTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoProrrateoImpor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoProrrateoImpor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProrrateoImpor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProrrateoImpor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProrrateoImpor.add(this.jTextFieldPathArchivoImportacionTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoProrrateoImpor = new JButtonMe();
		this.jButtonGenerarImportacionTipoProrrateoImpor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoProrrateoImpor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoProrrateoImpor.setToolTipText("Generar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProrrateoImpor.add(this.jButtonGenerarImportacionTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoProrrateoImpor = new JButtonMe();
		this.jButtonCerrarImportacionTipoProrrateoImpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoProrrateoImpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoProrrateoImpor.setToolTipText("Cancelar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProrrateoImpor.add(this.jButtonCerrarImportacionTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoProrrateoImpor = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoProrrateoImpor= new JScrollPane(jPanelImportacionTipoProrrateoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoProrrateoImpor.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoProrrateoImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoProrrateoImpor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoProrrateoImpor);
		this.jInternalFrameImportacionTipoProrrateoImpor.getContentPane().add(this.jScrollPanelImportacionTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoProrrateoImpor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoProrrateoImpor = new JButtonMe();
			this.jButtonAbrirOrderByTipoProrrateoImpor.setText("Orden");
			this.jButtonAbrirOrderByTipoProrrateoImpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProrrateoImpor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoProrrateoImpor";
			inputMap = this.jButtonAbrirOrderByTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoProrrateoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoProrrateoImpor"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoProrrateoImpor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoProrrateoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoProrrateoImpor.setName("jPanelOrderByTipoProrrateoImpor"); 
			
			this.jPanelOrderByTipoProrrateoImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProrrateoImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProrrateoImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoProrrateoImpor.setLayout(gridaBagLayoutOrderByTipoProrrateoImpor);
			
			
			this.jTableDatosTipoProrrateoImporOrderBy = new JTableMe();        
			this.jTableDatosTipoProrrateoImporOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoProrrateoImporOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoProrrateoImporOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoProrrateoImporOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoProrrateoImporOrderBy.setViewportView(this.jTableDatosTipoProrrateoImporOrderBy);
			this.jTableDatosTipoProrrateoImporOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoProrrateoImporOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoProrrateoImpor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoProrrateoImpor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoProrrateoImpor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoProrrateoImpor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoProrrateoImpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoProrrateoImpor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoProrrateoImpor.setTitle("Orden");
			this.jInternalFrameOrderByTipoProrrateoImpor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoProrrateoImpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoProrrateoImpor.setResizable(true);
			this.jInternalFrameOrderByTipoProrrateoImpor.setClosable(true);
			this.jInternalFrameOrderByTipoProrrateoImpor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoProrrateoImpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProrrateoImpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProrrateoImpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prorrateos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoProrrateoImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoProrrateoImpor.ipady =150;
				
			this.jPanelOrderByTipoProrrateoImpor.add(jScrollPanelDatosTipoProrrateoImporOrderBy, this.gridBagConstraintsTipoProrrateoImpor);//this.jTableDatosTipoProrrateoImporTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoProrrateoImpor = new JButtonMe();
			this.jButtonCerrarOrderByTipoProrrateoImpor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoProrrateoImpor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoProrrateoImpor.setToolTipText("Cancelar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoProrrateoImpor.add(this.jButtonCerrarOrderByTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoProrrateoImpor = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoProrrateoImpor= new JScrollPane(jPanelOrderByTipoProrrateoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoProrrateoImpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoProrrateoImpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoProrrateoImpor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoProrrateoImpor);
			
			this.jInternalFrameOrderByTipoProrrateoImpor.getContentPane().add(this.jScrollPanelOrderByTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);			
		
		} else {
			this.jButtonAbrirOrderByTipoProrrateoImpor = new JButtonMe();
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
			&& this.tipoprorrateoimporSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoProrrateoImpor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoProrrateoImpor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoProrrateoImpor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoProrrateoImpor.getRowHeight();//TipoProrrateoImporConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoProrrateoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProrrateoImpor.isSelected()) {
					iHeightTable=TipoProrrateoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProrrateoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProrrateoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoProrrateoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProrrateoImpor.isSelected()) {
					iHeightTable=TipoProrrateoImporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProrrateoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProrrateoImporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoProrrateoImpor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProrrateoImpor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProrrateoImpor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoProrrateoImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProrrateoImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProrrateoImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoProrrateoImpor!=null && this.jInternalFrameOrderByTipoProrrateoImpor.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoProrrateoImpor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoProrrateoImpor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoProrrateoImpor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoProrrateoImpor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoProrrateoImpor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoProrrateoImpor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoProrrateoImpor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoProrrateoImpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProrrateoImpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProrrateoImpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoprorrateoimporLogic.getTipoProrrateoImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprorrateoimpors.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoProrrateoImpor> TraerTipoProrrateoImporBeans(List<TipoProrrateoImpor> tipoprorrateoimpors,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoProrrateoImpor tipoprorrateoimpor:tipoprorrateoimpors) {
					
				if(!(TipoProrrateoImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoProrrateoImporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoprorrateoimpor.setsDetalleGeneralEntityReporte(TipoProrrateoImporConstantesFunciones.getTipoProrrateoImporDescripcion(tipoprorrateoimpor));
										
						
					
						
					
				} else  {
							
					//tipoprorrateoimpor.setsDetalleGeneralEntityReporte(tipoprorrateoimpor.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoprorrateoimporbeans.add(tipoprorrateoimporbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoprorrateoimpors;
    }
	//PARA REPORTES FIN
}
