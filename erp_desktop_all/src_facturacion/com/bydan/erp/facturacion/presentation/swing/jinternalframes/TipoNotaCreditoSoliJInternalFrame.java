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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;

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
import com.bydan.erp.facturacion.util.TipoNotaCreditoSoliConstantesFunciones;

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
public class TipoNotaCreditoSoliJInternalFrame extends TipoNotaCreditoSoliBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoNotaCreditoSoli;
	
	protected JMenuBar jmenuBarTipoNotaCreditoSoli;
	
	protected JMenu jmenuTipoNotaCreditoSoli;
	protected JMenu jmenuDatosTipoNotaCreditoSoli;
	protected JMenu jmenuArchivoTipoNotaCreditoSoli;
	protected JMenu jmenuAccionesTipoNotaCreditoSoli;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoNotaCreditoSoli;	
	protected GridBagConstraints gridBagConstraintsTipoNotaCreditoSoli;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoNotaCreditoSoliDetalleFormJInternalFrame jInternalFrameDetalleFormTipoNotaCreditoSoli;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoNotaCreditoSoli;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoNotaCreditoSoli;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoNotaCreditoSoliSessionBean tiponotacreditosoliSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoNotaCreditoSoli> tiponotacreditosolis;		
	public List<TipoNotaCreditoSoli> tiponotacreditosolisEliminados;	
	public List<TipoNotaCreditoSoli> tiponotacreditosolisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoNotaCreditoSoli;		
	protected JButton jButtonAbrirOrderByTipoNotaCreditoSoli;
	
	
	//protected JPanel jPanelOrderByTipoNotaCreditoSoli;
	//public JScrollPane jScrollPanelOrderByTipoNotaCreditoSoli;	
	//protected JButton jButtonCerrarOrderByTipoNotaCreditoSoli;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoNotaCreditoSoliLogic tiponotacreditosoliLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoNotaCreditoSoli;
	public JScrollPane jScrollPanelDatosEdicionTipoNotaCreditoSoli;
	public JScrollPane jScrollPanelDatosGeneralTipoNotaCreditoSoli;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoNotaCreditoSoliOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoNotaCreditoSoli;
	//public JScrollPane jScrollPanelImportacionTipoNotaCreditoSoli;
	
	
	
	protected JPanel jPanelAccionesTipoNotaCreditoSoli;
	
    protected JPanel jPanelPaginacionTipoNotaCreditoSoli;
    protected JPanel jPanelParametrosReportesTipoNotaCreditoSoli;
	protected JPanel jPanelParametrosReportesAccionesTipoNotaCreditoSoli;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoNotaCreditoSoli;
	protected JPanel jPanelParametrosAuxiliar2TipoNotaCreditoSoli;
	protected JPanel jPanelParametrosAuxiliar3TipoNotaCreditoSoli;
	protected JPanel jPanelParametrosAuxiliar4TipoNotaCreditoSoli;
	//protected JPanel jPanelParametrosAuxiliar5TipoNotaCreditoSoli;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoNotaCreditoSoli;
	//protected JPanel jPanelImportacionTipoNotaCreditoSoli;
	
	
	public JTable jTableDatosTipoNotaCreditoSoli;
	
	
	
	//public JTable jTableDatosTipoNotaCreditoSoliOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoNotaCreditoSoli;
	protected JButton jButtonDuplicarTipoNotaCreditoSoli;
	protected JButton jButtonCopiarTipoNotaCreditoSoli;
	protected JButton jButtonVerFormTipoNotaCreditoSoli;
	protected JButton jButtonNuevoRelacionesTipoNotaCreditoSoli;
	protected JButton jButtonModificarTipoNotaCreditoSoli;
	
    protected JButton jButtonGuardarCambiosTablaTipoNotaCreditoSoli;
	protected JButton jButtonCerrarTipoNotaCreditoSoli;
	
	
	protected JButton jButtonRecargarInformacionTipoNotaCreditoSoli;
	protected JButton jButtonProcesarInformacionTipoNotaCreditoSoli;
	
	
	protected JButton jButtonAnterioresTipoNotaCreditoSoli;
	protected JButton jButtonSiguientesTipoNotaCreditoSoli;
	protected JButton jButtonNuevoGuardarCambiosTipoNotaCreditoSoli;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoNotaCreditoSoli;
	//protected JButton jButtonCerrarReporteDinamicoTipoNotaCreditoSoli;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoNotaCreditoSoli;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoNotaCreditoSoli;
	//protected JButton jButtonGenerarImportacionTipoNotaCreditoSoli;
	//protected JButton jButtonCerrarImportacionTipoNotaCreditoSoli;
	//protected JFileChooser jFileChooserImportacionTipoNotaCreditoSoli;
	//protected File fileImportacionTipoNotaCreditoSoli;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoNotaCreditoSoli;
	protected JButton jButtonDuplicarToolBarTipoNotaCreditoSoli;
	protected JButton jButtonNuevoRelacionesToolBarTipoNotaCreditoSoli;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoNotaCreditoSoli;
	protected JButton jButtonCopiarToolBarTipoNotaCreditoSoli;
	protected JButton jButtonVerFormToolBarTipoNotaCreditoSoli;
	public JButton jButtonGuardarCambiosTablaToolBarTipoNotaCreditoSoli;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoNotaCreditoSoli;
	protected JButton jButtonCerrarToolBarTipoNotaCreditoSoli;
	
	protected JButton jButtonRecargarInformacionToolBarTipoNotaCreditoSoli;
	protected JButton jButtonProcesarInformacionToolBarTipoNotaCreditoSoli;
	protected JButton jButtonAnterioresToolBarTipoNotaCreditoSoli;
	protected JButton jButtonSiguientesToolBarTipoNotaCreditoSoli;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoNotaCreditoSoli;
	protected JButton jButtonAbrirOrderByToolBarTipoNotaCreditoSoli;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemDuplicarTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemNuevoRelacionesTipoNotaCreditoSoli;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemCopiarTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemVerFormTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemCerrarTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemDetalleCerrarTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoNotaCreditoSoli;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemProcesarInformacionTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemAnterioresTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemSiguientesTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemAbrirOrderByTipoNotaCreditoSoli;
	protected JMenuItem jMenuItemMostrarOcultarTipoNotaCreditoSoli;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoNotaCreditoSoli;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoNotaCreditoSoli;
	protected JCheckBox jCheckBoxSeleccionadosTipoNotaCreditoSoli;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoNotaCreditoSoli;
	protected JCheckBox jCheckBoxConGraficoReporteTipoNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoNotaCreditoSoli;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoNotaCreditoSoli;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoNotaCreditoSoli;
	protected JTextField jTextFieldValorCampoGeneralTipoNotaCreditoSoli;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoNotaCreditoSoli;
	//public JList<Reporte> jListColumnasSelectReporteTipoNotaCreditoSoli;
	//public JScrollPane jScrollColumnasSelectReporteTipoNotaCreditoSoli;
	
	//public JLabel jLabelRelacionesSelectReporteTipoNotaCreditoSoli;
	//public JList<Reporte> jListRelacionesSelectReporteTipoNotaCreditoSoli;
	//public JScrollPane jScrollRelacionesSelectReporteTipoNotaCreditoSoli;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoNotaCreditoSoli;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoNotaCreditoSoli;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoNotaCreditoSoli;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoNotaCreditoSoli;
	
		
	//public JLabel jLabelArchivoImportacionTipoNotaCreditoSoli;	
	//public JLabel jLabelPathArchivoImportacionTipoNotaCreditoSoli;
	//protected JTextField jTextFieldPathArchivoImportacionTipoNotaCreditoSoli;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoNotaCreditoSoli;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoNotaCreditoSoli;
	
	//public JLabel jLabelColumnaCategoriaValorTipoNotaCreditoSoli;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoNotaCreditoSoli;
	
	//public JLabel jLabelColumnasValoresGraficoTipoNotaCreditoSoli;
	//public JList<Reporte> jListColumnasValoresGraficoTipoNotaCreditoSoli;
	//public JScrollPane jScrollColumnasValoresGraficoTipoNotaCreditoSoli;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoNotaCreditoSoli;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoNotaCreditoSoli;	
	
	
	
	
	
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
	public TipoNotaCreditoSoliJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNotaCreditoSoliJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNotaCreditoSoliJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNotaCreditoSoliJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoNotaCreditoSoli)	{
		this.jButtonRecargarInformacionTipoNotaCreditoSoli = jButtonRecargarInformacionTipoNotaCreditoSoli;
	}
	
	public JButton getjButtonProcesarInformacionTipoNotaCreditoSoli() {
		return this.jButtonProcesarInformacionTipoNotaCreditoSoli;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoNotaCreditoSoli)	{
		this.jButtonProcesarInformacionTipoNotaCreditoSoli = jButtonProcesarInformacionTipoNotaCreditoSoli;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoNotaCreditoSoli() {
		return this.jButtonRecargarInformacionTipoNotaCreditoSoli;
	}
	
	
	public List<TipoNotaCreditoSoli> gettiponotacreditosolis() {
		return this.tiponotacreditosolis;
	}

	public void settiponotacreditosolis(List<TipoNotaCreditoSoli> tiponotacreditosolis) {
		this.tiponotacreditosolis = tiponotacreditosolis;
	}
	
	public List<TipoNotaCreditoSoli> gettiponotacreditosolisAux() {
		return this.tiponotacreditosolisAux;
	}

	public void settiponotacreditosolisAux(List<TipoNotaCreditoSoli> tiponotacreditosolisAux) {
		this.tiponotacreditosolisAux = tiponotacreditosolisAux;
	}
	
	public List<TipoNotaCreditoSoli> gettiponotacreditosolisEliminados() {
		return this.tiponotacreditosolisEliminados;
	}

	public void setTipoNotaCreditoSolisEliminados(List<TipoNotaCreditoSoli> tiponotacreditosolisEliminados) {
		this.tiponotacreditosolisEliminados = tiponotacreditosolisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoNotaCreditoSoli() {
		return jComboBoxTiposSeleccionarTipoNotaCreditoSoli;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoNotaCreditoSoli(
			JComboBox jComboBoxTiposSeleccionarTipoNotaCreditoSoli) {
		this.jComboBoxTiposSeleccionarTipoNotaCreditoSoli = jComboBoxTiposSeleccionarTipoNotaCreditoSoli;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoNotaCreditoSoli() {
		return jTextFieldValorCampoGeneralTipoNotaCreditoSoli;
	}

	public void setjTextFieldValorCampoGeneralTipoNotaCreditoSoli(
			JTextField jTextFieldValorCampoGeneralTipoNotaCreditoSoli) {
		this.jTextFieldValorCampoGeneralTipoNotaCreditoSoli = jTextFieldValorCampoGeneralTipoNotaCreditoSoli;
	}

	public void setBorderResaltarValorCampoGeneralTipoNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoNotaCreditoSoli .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoNotaCreditoSoli() {
		return this.jCheckBoxSeleccionarTodosTipoNotaCreditoSoli;
	}

	public void setjCheckBoxSeleccionarTodosTipoNotaCreditoSoli(
			JCheckBox jCheckBoxSeleccionarTodosTipoNotaCreditoSoli) {
		this.jCheckBoxSeleccionarTodosTipoNotaCreditoSoli = jCheckBoxSeleccionarTodosTipoNotaCreditoSoli;
	}

	public void setBorderResaltarSeleccionarTodosTipoNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoNotaCreditoSoli() {
		return this.jCheckBoxSeleccionadosTipoNotaCreditoSoli;
	}

	public void setjCheckBoxSeleccionadosTipoNotaCreditoSoli(
			JCheckBox jCheckBoxSeleccionadosTipoNotaCreditoSoli) {
		this.jCheckBoxSeleccionadosTipoNotaCreditoSoli = jCheckBoxSeleccionadosTipoNotaCreditoSoli;
	}
	
	public void setBorderResaltarSeleccionadosTipoNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoNotaCreditoSoli() {
		return this.jComboBoxTiposArchivosReportesTipoNotaCreditoSoli;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoNotaCreditoSoli(
			JComboBox jComboBoxTiposArchivosReportesTipoNotaCreditoSoli) {
		this.jComboBoxTiposArchivosReportesTipoNotaCreditoSoli = jComboBoxTiposArchivosReportesTipoNotaCreditoSoli;
	}

	public void setBorderResaltarTiposArchivosReportesTipoNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoNotaCreditoSoli() {
		return this.jComboBoxTiposReportesTipoNotaCreditoSoli;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoNotaCreditoSoli(
			JComboBox jComboBoxTiposReportesTipoNotaCreditoSoli) {
		this.jComboBoxTiposReportesTipoNotaCreditoSoli = jComboBoxTiposReportesTipoNotaCreditoSoli;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoNotaCreditoSoli() {
	//	return jComboBoxTiposReportesDinamicoTipoNotaCreditoSoli;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoNotaCreditoSoli(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoNotaCreditoSoli) {
	//	this.jComboBoxTiposReportesDinamicoTipoNotaCreditoSoli = jComboBoxTiposReportesDinamicoTipoNotaCreditoSoli;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoNotaCreditoSoli() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoNotaCreditoSoli;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoNotaCreditoSoli(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoNotaCreditoSoli) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoNotaCreditoSoli = jComboBoxTiposArchivosReportesDinamicoTipoNotaCreditoSoli;
	//}
	
	public void setBorderResaltarTiposReportesTipoNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoNotaCreditoSoli() {
		return this.jComboBoxTiposGraficosReportesTipoNotaCreditoSoli;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoNotaCreditoSoli(
			JComboBox jComboBoxTiposGraficosReportesTipoNotaCreditoSoli) {
		this.jComboBoxTiposGraficosReportesTipoNotaCreditoSoli = jComboBoxTiposGraficosReportesTipoNotaCreditoSoli;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoNotaCreditoSoli() {
		return this.jComboBoxTiposPaginacionTipoNotaCreditoSoli;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoNotaCreditoSoli(
			JComboBox jComboBoxTiposPaginacionTipoNotaCreditoSoli) {
		this.jComboBoxTiposPaginacionTipoNotaCreditoSoli = jComboBoxTiposPaginacionTipoNotaCreditoSoli;
	}
	
	public void setBorderResaltarTiposPaginacionTipoNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoNotaCreditoSoli() {
		return this.jComboBoxTiposRelacionesTipoNotaCreditoSoli;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoNotaCreditoSoli() {
		return this.jComboBoxTiposAccionesTipoNotaCreditoSoli;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoNotaCreditoSoli(
			JComboBox jComboBoxTiposRelacionesTipoNotaCreditoSoli) {
		this.jComboBoxTiposRelacionesTipoNotaCreditoSoli = jComboBoxTiposRelacionesTipoNotaCreditoSoli;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoNotaCreditoSoli(
			JComboBox jComboBoxTiposAccionesTipoNotaCreditoSoli) {
		this.jComboBoxTiposAccionesTipoNotaCreditoSoli = jComboBoxTiposAccionesTipoNotaCreditoSoli;
	}
	
	public void setBorderResaltarTiposRelacionesTipoNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoNotaCreditoSoli() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoNotaCreditoSoli.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoNotaCreditoSoli .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoNotaCreditoSoli() {
	//	return jCheckBoxConGraficoDinamicoTipoNotaCreditoSoli;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoNotaCreditoSoli(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoNotaCreditoSoli) {
	//	this.jCheckBoxConGraficoDinamicoTipoNotaCreditoSoli = jCheckBoxConGraficoDinamicoTipoNotaCreditoSoli;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoNotaCreditoSoli() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoNotaCreditoSoli.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoNotaCreditoSoli .setBorder(borderResaltar);		
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
		this.tiponotacreditosoliSessionBean=new TipoNotaCreditoSoliSessionBean();
		
		this.tiponotacreditosoliSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiponotacreditosoliSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoNotaCreditoSoliJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Solicitud Nota Credito MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoNotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoNotaCreditoSoli= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoNotaCreditoSoli,this.jTtoolBarTipoNotaCreditoSoli,
							"nuevo","nuevo","Nuevo"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoNotaCreditoSoli,this.jTtoolBarTipoNotaCreditoSoli,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoNotaCreditoSoli,this.jTtoolBarTipoNotaCreditoSoli,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoNotaCreditoSoli,this.jTtoolBarTipoNotaCreditoSoli,
							"duplicar","duplicar","Duplicar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoNotaCreditoSoli,this.jTtoolBarTipoNotaCreditoSoli,
							"copiar","copiar","Copiar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoNotaCreditoSoli,this.jTtoolBarTipoNotaCreditoSoli,
							"ver_form","ver_form","Ver"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoNotaCreditoSoli,this.jTtoolBarTipoNotaCreditoSoli,
							"recargar","recargar","Recargar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoNotaCreditoSoli,this.jTtoolBarTipoNotaCreditoSoli,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoNotaCreditoSoli,this.jTtoolBarTipoNotaCreditoSoli,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoNotaCreditoSoli,this.jTtoolBarTipoNotaCreditoSoli,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoNotaCreditoSoli,this.jTtoolBarTipoNotaCreditoSoli,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoNotaCreditoSoli,this.jTtoolBarTipoNotaCreditoSoli,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoNotaCreditoSoli,this.jTtoolBarTipoNotaCreditoSoli,
							"cerrar","cerrar","Salir"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoNotaCreditoSoli=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoNotaCreditoSoli;
			
				this.jButtonProcesarInformacionToolBarTipoNotaCreditoSoli=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoNotaCreditoSoli;
				
		//protected JButton jButtonModificarToolBarTipoNotaCreditoSoli;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoNotaCreditoSoli=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoNotaCreditoSoli=new JMenuMe("General");
		this.jmenuArchivoTipoNotaCreditoSoli=new JMenuMe("Archivo");
		this.jmenuAccionesTipoNotaCreditoSoli=new JMenuMe("Acciones");
		this.jmenuDatosTipoNotaCreditoSoli=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoNotaCreditoSoli= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoNotaCreditoSoli.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoNotaCreditoSoli,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoNotaCreditoSoli= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoNotaCreditoSoli.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoNotaCreditoSoli,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoNotaCreditoSoli= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoNotaCreditoSoli.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoNotaCreditoSoli,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoNotaCreditoSoli= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoNotaCreditoSoli.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoNotaCreditoSoli,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoNotaCreditoSoli= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoNotaCreditoSoli.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoNotaCreditoSoli,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoNotaCreditoSoli= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoNotaCreditoSoli.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoNotaCreditoSoli,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoNotaCreditoSoli= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoNotaCreditoSoli.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoNotaCreditoSoli,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoNotaCreditoSoli= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoNotaCreditoSoli.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoNotaCreditoSoli,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoNotaCreditoSoli= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoNotaCreditoSoli.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoNotaCreditoSoli,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoNotaCreditoSoli= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoNotaCreditoSoli.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoNotaCreditoSoli,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoNotaCreditoSoli= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoNotaCreditoSoli.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoNotaCreditoSoli,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoNotaCreditoSoli= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoNotaCreditoSoli.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoNotaCreditoSoli,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoNotaCreditoSoli= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoNotaCreditoSoli.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoNotaCreditoSoli,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoNotaCreditoSoli= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoNotaCreditoSoli.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoNotaCreditoSoli,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoNotaCreditoSoli= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoNotaCreditoSoli.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoNotaCreditoSoli,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoNotaCreditoSoli= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoNotaCreditoSoli.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoNotaCreditoSoli,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoNotaCreditoSoli= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoNotaCreditoSoli.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoNotaCreditoSoli,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoNotaCreditoSoli.add(this.jMenuItemCerrarTipoNotaCreditoSoli);
			
			this.jmenuAccionesTipoNotaCreditoSoli.add(this.jMenuItemNuevoTipoNotaCreditoSoli);
			this.jmenuAccionesTipoNotaCreditoSoli.add(this.jMenuItemNuevoGuardarCambiosTipoNotaCreditoSoli);
			this.jmenuAccionesTipoNotaCreditoSoli.add(this.jMenuItemNuevoRelacionesTipoNotaCreditoSoli);
			this.jmenuAccionesTipoNotaCreditoSoli.add(this.jMenuItemGuardarCambiosTablaTipoNotaCreditoSoli);		
			this.jmenuAccionesTipoNotaCreditoSoli.add(this.jMenuItemDuplicarTipoNotaCreditoSoli);		
			this.jmenuAccionesTipoNotaCreditoSoli.add(this.jMenuItemCopiarTipoNotaCreditoSoli);		
			this.jmenuAccionesTipoNotaCreditoSoli.add(this.jMenuItemVerFormTipoNotaCreditoSoli);		
			
			this.jmenuDatosTipoNotaCreditoSoli.add(this.jMenuItemRecargarInformacionTipoNotaCreditoSoli);				
			this.jmenuDatosTipoNotaCreditoSoli.add(this.jMenuItemAnterioresTipoNotaCreditoSoli);				
			this.jmenuDatosTipoNotaCreditoSoli.add(this.jMenuItemSiguientesTipoNotaCreditoSoli);				
			this.jmenuDatosTipoNotaCreditoSoli.add(this.jMenuItemAbrirOrderByTipoNotaCreditoSoli);				
			this.jmenuDatosTipoNotaCreditoSoli.add(this.jMenuItemMostrarOcultarTipoNotaCreditoSoli);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoNotaCreditoSoli.add(this.jMenuItemGuardarCambiosTipoNotaCreditoSoli);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoNotaCreditoSoli.add(this.jmenuArchivoTipoNotaCreditoSoli);		
			this.jmenuBarTipoNotaCreditoSoli.add(this.jmenuAccionesTipoNotaCreditoSoli);		
			this.jmenuBarTipoNotaCreditoSoli.add(this.jmenuDatosTipoNotaCreditoSoli);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoNotaCreditoSoli);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoNotaCreditoSoli() {
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
			//this.jInternalFrameDetalleTipoNotaCreditoSoli = new TipoNotaCreditoSoliDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Solicitud Nota Credito DATOS");
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli = new TipoNotaCreditoSoliDetalleFormJInternalFrame(jDesktopPane,this.tiponotacreditosoliSessionBean.getConGuardarRelaciones(),this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoNotaCreditoSoli = null;//new TipoNotaCreditoSoliDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoNotaCreditoSoli= new GridBagLayout();
		
		
		this.jTableDatosTipoNotaCreditoSoli = new JTableMe();      
		
		String sToolTipTipoNotaCreditoSoli="";
		sToolTipTipoNotaCreditoSoli=TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoNotaCreditoSoli+="(Facturacion.TipoNotaCreditoSoli)";
		}
		
		if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoNotaCreditoSoli+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoNotaCreditoSoli.setToolTipText(sToolTipTipoNotaCreditoSoli);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoNotaCreditoSoli);
		this.jTableDatosTipoNotaCreditoSoli.setAutoCreateRowSorter(true);
		this.jTableDatosTipoNotaCreditoSoli.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoNotaCreditoSoli.setRowSelectionAllowed(true);
		this.jTableDatosTipoNotaCreditoSoli.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoNotaCreditoSoli = new JButtonMe();
		this.jButtonDuplicarTipoNotaCreditoSoli = new JButtonMe();
		this.jButtonCopiarTipoNotaCreditoSoli = new JButtonMe();
		this.jButtonVerFormTipoNotaCreditoSoli = new JButtonMe();
		this.jButtonNuevoRelacionesTipoNotaCreditoSoli = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli = new JButtonMe();
		this.jButtonCerrarTipoNotaCreditoSoli = new JButtonMe();
		
		this.jScrollPanelDatosTipoNotaCreditoSoli = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoNotaCreditoSoli = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Solicitud Nota Credito";
		
		if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Solicitud Nota Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoNotaCreditoSoli.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoNotaCreditoSoli.setToolTipText("Acciones");
        this.jPanelAccionesTipoNotaCreditoSoli.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli=new ReporteDinamicoJInternalFrame(TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoNotaCreditoSoli();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoNotaCreditoSoli=new ImportacionJInternalFrame(TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoNotaCreditoSoli();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoNotaCreditoSoli = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoNotaCreditoSoli.setText("Orden");
		this.jButtonAbrirOrderByTipoNotaCreditoSoli.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoNotaCreditoSoli,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoNotaCreditoSoli=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoNotaCreditoSoli,false,this);
			
			//this.cargarOrderByTipoNotaCreditoSoli(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoNotaCreditoSoli=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoNotaCreditoSoli,true,this);
			
			//this.cargarOrderByTipoNotaCreditoSoli(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoNotaCreditoSoli.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoNotaCreditoSoli.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoNotaCreditoSoli.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoNotaCreditoSoli.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoNotaCreditoSoli.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoNotaCreditoSoli.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoNotaCreditoSoli.setText("Nuevo");
		this.jButtonDuplicarTipoNotaCreditoSoli.setText("Duplicar");
		this.jButtonCopiarTipoNotaCreditoSoli.setText("Copiar");
		this.jButtonVerFormTipoNotaCreditoSoli.setText("Ver");
		this.jButtonNuevoRelacionesTipoNotaCreditoSoli.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli.setText("Guardar");
		this.jButtonCerrarTipoNotaCreditoSoli.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoNotaCreditoSoli,"nuevo_button","Nuevo",this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoNotaCreditoSoli,"duplicar_button","Duplicar",this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoNotaCreditoSoli,"copiar_button","Copiar",this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoNotaCreditoSoli,"ver_form","Ver",this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoNotaCreditoSoli,"nuevorelaciones_button","Nuevo Rel",this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli,"guardarcambiostabla_button","Guardar",this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoNotaCreditoSoli,"cerrar_button","Salir",this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoNotaCreditoSoli.setToolTipText("Nuevo"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoNotaCreditoSoli.setToolTipText("Duplicar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoNotaCreditoSoli.setToolTipText("Copiar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoNotaCreditoSoli.setToolTipText("Ver"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoNotaCreditoSoli.setToolTipText("Nuevo Rel"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli.setToolTipText("Guardar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoNotaCreditoSoli.setToolTipText("Salir"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoNotaCreditoSoli";
		inputMap = this.jButtonNuevoTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoNotaCreditoSoli.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoNotaCreditoSoli"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoNotaCreditoSoli";
		inputMap = this.jButtonDuplicarTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoNotaCreditoSoli.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoNotaCreditoSoli"));
		
		//COPIAR
		sMapKey = "CopiarTipoNotaCreditoSoli";
		inputMap = this.jButtonCopiarTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoNotaCreditoSoli.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoNotaCreditoSoli"));
		
		//VEr FORM
		sMapKey = "VerFormTipoNotaCreditoSoli";
		inputMap = this.jButtonVerFormTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoNotaCreditoSoli.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoNotaCreditoSoli"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoNotaCreditoSoli";
		inputMap = this.jButtonNuevoRelacionesTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoNotaCreditoSoli"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoNotaCreditoSoli";
		inputMap = this.jButtonModificarTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoNotaCreditoSoli"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoNotaCreditoSoli";
		inputMap = this.jButtonCerrarTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoNotaCreditoSoli"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoNotaCreditoSoli";
		inputMap = this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoNotaCreditoSoli"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoNotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoNotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoNotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoNotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoNotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoNotaCreditoSoli.setName("jPanelParametrosReportesTipoNotaCreditoSoli"); 
		
		this.jPanelParametrosReportesAccionesTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoNotaCreditoSoli.setName("jPanelParametrosReportesAccionesTipoNotaCreditoSoli"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoNotaCreditoSoli = new JButtonMe();
		this.jButtonRecargarInformacionTipoNotaCreditoSoli.setText("Recargar");
		this.jButtonRecargarInformacionTipoNotaCreditoSoli.setToolTipText("Recargar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoNotaCreditoSoli,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoNotaCreditoSoli = new JButtonMe();
		this.jButtonProcesarInformacionTipoNotaCreditoSoli.setText("Procesar");
		this.jButtonProcesarInformacionTipoNotaCreditoSoli.setToolTipText("Procesar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoNotaCreditoSoli.setVisible(false);
			
		this.jButtonProcesarInformacionTipoNotaCreditoSoli.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoNotaCreditoSoli.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoNotaCreditoSoli.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoNotaCreditoSoli.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoNotaCreditoSoli.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoNotaCreditoSoli.setText("TIPO");       
		this.jComboBoxTiposReportesTipoNotaCreditoSoli.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoNotaCreditoSoli.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoNotaCreditoSoli.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoNotaCreditoSoli.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoNotaCreditoSoli.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoNotaCreditoSoli.setText("Accion");
		this.jComboBoxTiposRelacionesTipoNotaCreditoSoli.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setText("Accion");
		this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoNotaCreditoSoli.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoNotaCreditoSoli.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoNotaCreditoSoli=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoNotaCreditoSoli.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoNotaCreditoSoli.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoNotaCreditoSoli.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoNotaCreditoSoli = new JLabelMe();
		
		this.jLabelAccionesTipoNotaCreditoSoli.setText("Acciones");		
		this.jLabelAccionesTipoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoNotaCreditoSoli = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoNotaCreditoSoli.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoNotaCreditoSoli.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoNotaCreditoSoli = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoNotaCreditoSoli.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoNotaCreditoSoli.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoNotaCreditoSoli = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoNotaCreditoSoli.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoNotaCreditoSoli.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoNotaCreditoSoli = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoNotaCreditoSoli.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoNotaCreditoSoli.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoNotaCreditoSoli = new JButtonMe();
		//this.jButtonAnterioresTipoNotaCreditoSoli.setText("<<");
        this.jButtonAnterioresTipoNotaCreditoSoli.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoNotaCreditoSoli,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoNotaCreditoSoli = new JButtonMe();
		//this.jButtonSiguientesTipoNotaCreditoSoli.setText(">>");
        this.jButtonSiguientesTipoNotaCreditoSoli.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoNotaCreditoSoli,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoNotaCreditoSoli = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoNotaCreditoSoli.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoNotaCreditoSoli.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoNotaCreditoSoli,"nuevoguardarcambios_button","Nue",this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoNotaCreditoSoli";
		inputMap = this.jButtonNuevoGuardarCambiosTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoNotaCreditoSoli"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoNotaCreditoSoli";
		inputMap = this.jButtonRecargarInformacionTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoNotaCreditoSoli"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoNotaCreditoSoli";
		inputMap = this.jButtonSiguientesTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoNotaCreditoSoli"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoNotaCreditoSoli";
		inputMap = this.jButtonAnterioresTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoNotaCreditoSoli"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoNotaCreditoSoli();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoNotaCreditoSoli.setMinimumSize(new Dimension(this.getWidth(),TipoNotaCreditoSoliBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoNotaCreditoSoliBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoNotaCreditoSoli.setMaximumSize(new Dimension(this.getWidth(),TipoNotaCreditoSoliBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoNotaCreditoSoliBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoNotaCreditoSoli.setPreferredSize(new Dimension(this.getWidth(),TipoNotaCreditoSoliBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoNotaCreditoSoliBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoNotaCreditoSoli = new GridBagLayout();

			this.jPanelPaginacionTipoNotaCreditoSoli.setLayout(gridaBagLayoutPaginacionTipoNotaCreditoSoli);						
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoNotaCreditoSoli.add(this.jButtonAnterioresTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
					
						
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;
			
			this.jPanelPaginacionTipoNotaCreditoSoli.add(this.jButtonNuevoGuardarCambiosTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
						
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;
			this.jPanelPaginacionTipoNotaCreditoSoli.add(this.jButtonSiguientesTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 1;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoNotaCreditoSoli.add(this.jButtonNuevoTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
				this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 1;
				this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoNotaCreditoSoli.add(this.jButtonNuevoRelacionesTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
			}
			
			
			if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
				this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 1;
				this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoNotaCreditoSoli.add(this.jButtonGuardarCambiosTablaTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
			}
			
			
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 1;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoNotaCreditoSoli.add(this.jButtonDuplicarTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 1;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoNotaCreditoSoli.add(this.jButtonCopiarTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 1;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoNotaCreditoSoli.add(this.jButtonVerFormTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 1;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoNotaCreditoSoli.add(this.jButtonCerrarTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		
		
		
		this.jButtonRecargarInformacionTipoNotaCreditoSoli.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoNotaCreditoSoli.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoNotaCreditoSoli.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoNotaCreditoSoli.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoNotaCreditoSoli.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoNotaCreditoSoli.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoNotaCreditoSoli.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoNotaCreditoSoli.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoNotaCreditoSoli.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoNotaCreditoSoli.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoNotaCreditoSoli.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoNotaCreditoSoli.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoNotaCreditoSoli.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoNotaCreditoSoli.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoNotaCreditoSoli.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoNotaCreditoSoli.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoNotaCreditoSoli.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoNotaCreditoSoli.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoNotaCreditoSoli.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoNotaCreditoSoli.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoNotaCreditoSoli.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoNotaCreditoSoli.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoNotaCreditoSoli.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoNotaCreditoSoli.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoNotaCreditoSoli.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoNotaCreditoSoli.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoNotaCreditoSoli.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoNotaCreditoSoli.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoNotaCreditoSoli.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoNotaCreditoSoli.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoNotaCreditoSoli = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoNotaCreditoSoli = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoNotaCreditoSoli = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoNotaCreditoSoli = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoNotaCreditoSoli = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoNotaCreditoSoli = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoNotaCreditoSoli.setLayout(gridaBagParametrosReportesTipoNotaCreditoSoli);
			this.jPanelParametrosReportesAccionesTipoNotaCreditoSoli.setLayout(gridaBagParametrosReportesAccionesTipoNotaCreditoSoli);
			
			
			this.jPanelParametrosAuxiliar1TipoNotaCreditoSoli.setLayout(gridaBagParametrosAuxiliar1TipoNotaCreditoSoli);
			this.jPanelParametrosAuxiliar2TipoNotaCreditoSoli.setLayout(gridaBagParametrosAuxiliar2TipoNotaCreditoSoli);
			this.jPanelParametrosAuxiliar3TipoNotaCreditoSoli.setLayout(gridaBagParametrosAuxiliar3TipoNotaCreditoSoli);
			this.jPanelParametrosAuxiliar4TipoNotaCreditoSoli.setLayout(gridaBagParametrosAuxiliar4TipoNotaCreditoSoli);
			//this.jPanelParametrosAuxiliar5TipoNotaCreditoSoli.setLayout(gridaBagParametrosAuxiliar2TipoNotaCreditoSoli);			
			
			
			
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNotaCreditoSoli.add(this.jButtonRecargarInformacionTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoNotaCreditoSoli.add(this.jComboBoxTiposPaginacionTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoNotaCreditoSoli.add(this.jCheckBoxConAltoMaximoTablaTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoNotaCreditoSoli.add(this.jComboBoxTiposArchivosReportesTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNotaCreditoSoli.add(this.jPanelParametrosAuxiliar1TipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoNotaCreditoSoli.add(this.jComboBoxTiposReportesTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNotaCreditoSoli.add(this.jPanelParametrosAuxiliar4TipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNotaCreditoSoli.add(this.jComboBoxTiposReportesTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoNotaCreditoSoli.add(this.jCheckBoxGenerarReporteTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNotaCreditoSoli.add(this.jPanelParametrosAuxiliar2TipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoNotaCreditoSoli.add(this.jLabelAccionesTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
				this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoNotaCreditoSoli.add(this.jButtonAbrirOrderByTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNotaCreditoSoli.add(this.jComboBoxTiposSeleccionarTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);			
			
			
			/*
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoNotaCreditoSoli.add(this.jCheckBoxSeleccionarTodosTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoNotaCreditoSoli.add(this.jCheckBoxSeleccionarTodosTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);															
				
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoNotaCreditoSoli.add(this.jCheckBoxSeleccionadosTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoNotaCreditoSoli.add(this.jPanelParametrosAuxiliar3TipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNotaCreditoSoli.add(this.jComboBoxTiposRelacionesTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
				
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNotaCreditoSoli.add(this.jComboBoxTiposAccionesTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
	
				
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoNotaCreditoSoli.add(this.jTextFieldValorCampoGeneralTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoNotaCreditoSoli = new GridBagLayout();

			this.jScrollPanelDatosTipoNotaCreditoSoli.setLayout(gridaBagLayoutDatosTipoNotaCreditoSoli);
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
			
			this.jScrollPanelDatosTipoNotaCreditoSoli.add(this.jTableDatosTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoNotaCreditoSoli.setViewportView(this.jTableDatosTipoNotaCreditoSoli);
		this.jTableDatosTipoNotaCreditoSoli.setFillsViewportHeight(true);
		this.jTableDatosTipoNotaCreditoSoli.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoNotaCreditoSoli= new GridBagLayout();
		this.jPanelAccionesTipoNotaCreditoSoli.setLayout(gridaBagLayoutAccionesTipoNotaCreditoSoli);
		
		
		/*	
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
			
		this.jPanelAccionesTipoNotaCreditoSoli.add(this.jButtonNuevoTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoNotaCreditoSoli = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoNotaCreditoSoli);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();						
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;		
			//this.gridBagConstraintsTipoNotaCreditoSoli.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoNotaCreditoSoli.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;		
		//this.gridBagConstraintsTipoNotaCreditoSoli.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoNotaCreditoSoli.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoNotaCreditoSoli);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);								
		
		
		/*
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		*/		
		
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx =0;
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoNotaCreditoSoli.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
				
		
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoNotaCreditoSoliJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoNotaCreditoSoli= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoNotaCreditoSoli = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoNotaCreditoSoli.setLayout(gridaBagLayoutBusquedasParametrosTipoNotaCreditoSoli);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoNotaCreditoSoli=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoNotaCreditoSoli.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoNotaCreditoSoli.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoNotaCreditoSoli.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
			
			
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		
			
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoNotaCreditoSoli;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoNotaCreditoSoli() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoNotaCreditoSoli = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoNotaCreditoSoli.setName("jPanelReporteDinamicoTipoNotaCreditoSoli"); 
		
		this.jPanelReporteDinamicoTipoNotaCreditoSoli.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoNotaCreditoSoli.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoNotaCreditoSoli.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoNotaCreditoSoli.setLayout(gridaBagLayoutReporteDinamicoTipoNotaCreditoSoli);
		
		
		this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoNotaCreditoSoli = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoNotaCreditoSoli= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoNotaCreditoSoli.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoNotaCreditoSoli.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoNotaCreditoSoli.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Solicitud Nota Creditos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoNotaCreditoSoli = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoNotaCreditoSoli.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoNotaCreditoSoli.add(this.jLabelColumnasSelectReporteTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoNotaCreditoSoli = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoNotaCreditoSoli.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoNotaCreditoSoli.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoNotaCreditoSoli.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoNotaCreditoSoli.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoNotaCreditoSoli.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoNotaCreditoSoli=new JScrollPane(this.jListColumnasSelectReporteTipoNotaCreditoSoli);
			
			this.jScrollColumnasSelectReporteTipoNotaCreditoSoli.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoNotaCreditoSoli.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoNotaCreditoSoli.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoNotaCreditoSoli.add(this.jListColumnasSelectReporteTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		this.jPanelReporteDinamicoTipoNotaCreditoSoli.add(this.jScrollColumnasSelectReporteTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoNotaCreditoSoli = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoNotaCreditoSoli.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoNotaCreditoSoli.add(this.jLabelRelacionesSelectReporteTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoNotaCreditoSoli = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoNotaCreditoSoli.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoNotaCreditoSoli.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoNotaCreditoSoli.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoNotaCreditoSoli.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoNotaCreditoSoli.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoNotaCreditoSoli=new JScrollPane(this.jListRelacionesSelectReporteTipoNotaCreditoSoli);
			
			this.jScrollRelacionesSelectReporteTipoNotaCreditoSoli.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoNotaCreditoSoli.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoNotaCreditoSoli.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoNotaCreditoSoli.add(this.jListRelacionesSelectReporteTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		this.jPanelReporteDinamicoTipoNotaCreditoSoli.add(this.jScrollRelacionesSelectReporteTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoNotaCreditoSoli = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoNotaCreditoSoli = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoNotaCreditoSoli = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoNotaCreditoSoli = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoNotaCreditoSoli.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoNotaCreditoSoli.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoNotaCreditoSoli.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoNotaCreditoSoli.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoNotaCreditoSoli = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoNotaCreditoSoli.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoNotaCreditoSoli.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoNotaCreditoSoli.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoNotaCreditoSoli.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoNotaCreditoSoli = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoNotaCreditoSoli.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoNotaCreditoSoli.add(this.jLabelGenerarExcelReporteDinamicoTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoNotaCreditoSoli = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoNotaCreditoSoli.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoNotaCreditoSoli,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoNotaCreditoSoli.setToolTipText("Generar EXCEL"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoNotaCreditoSoli.add(this.jButtonGenerarExcelReporteDinamicoTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoNotaCreditoSoli.add(this.jComboBoxTiposReportesDinamicoTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoNotaCreditoSoli = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoNotaCreditoSoli.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoNotaCreditoSoli.add(this.jLabelTiposArchivoReporteDinamicoTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoNotaCreditoSoli.add(this.jComboBoxTiposArchivosReportesDinamicoTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoNotaCreditoSoli = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoNotaCreditoSoli.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoNotaCreditoSoli,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoNotaCreditoSoli.setToolTipText("Generar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoNotaCreditoSoli.add(this.jButtonGenerarReporteDinamicoTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoNotaCreditoSoli = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoNotaCreditoSoli.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoNotaCreditoSoli,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoNotaCreditoSoli.setToolTipText("Cancelar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoNotaCreditoSoli.add(this.jButtonCerrarReporteDinamicoTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoNotaCreditoSoli = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoNotaCreditoSoli= new JScrollPane(jPanelReporteDinamicoTipoNotaCreditoSoli,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoNotaCreditoSoli.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoNotaCreditoSoli.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoNotaCreditoSoli.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Solicitud Nota Creditos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoNotaCreditoSoli);
		this.jInternalFrameReporteDinamicoTipoNotaCreditoSoli.getContentPane().add(this.jScrollPanelReporteDinamicoTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoNotaCreditoSoli() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoNotaCreditoSoli = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoNotaCreditoSoli.setName("jPanelImportacionTipoNotaCreditoSoli"); 
		
		this.jPanelImportacionTipoNotaCreditoSoli.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoNotaCreditoSoli.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoNotaCreditoSoli.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoNotaCreditoSoli.setLayout(gridaBagLayoutImportacionTipoNotaCreditoSoli);
		
		
		this.jInternalFrameImportacionTipoNotaCreditoSoli= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoNotaCreditoSoli= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoNotaCreditoSoli = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoNotaCreditoSoli= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoNotaCreditoSoli.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoNotaCreditoSoli.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoNotaCreditoSoli.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoNotaCreditoSoli.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoNotaCreditoSoli.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoNotaCreditoSoli.setResizable(true);
	    this.jInternalFrameImportacionTipoNotaCreditoSoli.setClosable(true);
	    this.jInternalFrameImportacionTipoNotaCreditoSoli.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoNotaCreditoSoli.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoNotaCreditoSoli.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoNotaCreditoSoli.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoNotaCreditoSoli.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoNotaCreditoSoli.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoNotaCreditoSoli.setResizable(true);
	    this.jInternalFrameImportacionTipoNotaCreditoSoli.setClosable(true);
	    this.jInternalFrameImportacionTipoNotaCreditoSoli.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoNotaCreditoSoli.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoNotaCreditoSoli.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoNotaCreditoSoli.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Solicitud Nota Creditos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoNotaCreditoSoli = new JLabelMe();

		this.jLabelArchivoImportacionTipoNotaCreditoSoli.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoNotaCreditoSoli.add(this.jLabelArchivoImportacionTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoNotaCreditoSoli = new JFileChooser();		
		this.jFileChooserImportacionTipoNotaCreditoSoli.setToolTipText("ESCOGER ARCHIVO"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoNotaCreditoSoli = new JButtonMe();
		this.jButtonAbrirImportacionTipoNotaCreditoSoli.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoNotaCreditoSoli,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoNotaCreditoSoli.setToolTipText("Generar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoNotaCreditoSoli.add(this.jButtonAbrirImportacionTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoNotaCreditoSoli = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoNotaCreditoSoli.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoNotaCreditoSoli.add(this.jLabelPathArchivoImportacionTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoNotaCreditoSoli=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoNotaCreditoSoli.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoNotaCreditoSoli.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoNotaCreditoSoli.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoNotaCreditoSoli.add(this.jTextFieldPathArchivoImportacionTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoNotaCreditoSoli = new JButtonMe();
		this.jButtonGenerarImportacionTipoNotaCreditoSoli.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoNotaCreditoSoli,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoNotaCreditoSoli.setToolTipText("Generar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoNotaCreditoSoli.add(this.jButtonGenerarImportacionTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoNotaCreditoSoli = new JButtonMe();
		this.jButtonCerrarImportacionTipoNotaCreditoSoli.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoNotaCreditoSoli,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoNotaCreditoSoli.setToolTipText("Cancelar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoNotaCreditoSoli.add(this.jButtonCerrarImportacionTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoNotaCreditoSoli = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoNotaCreditoSoli= new JScrollPane(jPanelImportacionTipoNotaCreditoSoli,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsTipoNotaCreditoSoli.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoNotaCreditoSoli.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoNotaCreditoSoli.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoNotaCreditoSoli.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoNotaCreditoSoli);
		this.jInternalFrameImportacionTipoNotaCreditoSoli.getContentPane().add(this.jScrollPanelImportacionTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoNotaCreditoSoli(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoNotaCreditoSoli = new JButtonMe();
			this.jButtonAbrirOrderByTipoNotaCreditoSoli.setText("Orden");
			this.jButtonAbrirOrderByTipoNotaCreditoSoli.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoNotaCreditoSoli,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoNotaCreditoSoli";
			inputMap = this.jButtonAbrirOrderByTipoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoNotaCreditoSoli"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoNotaCreditoSoli = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoNotaCreditoSoli.setName("jPanelOrderByTipoNotaCreditoSoli"); 
			
			this.jPanelOrderByTipoNotaCreditoSoli.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoNotaCreditoSoli.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoNotaCreditoSoli.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoNotaCreditoSoli.setLayout(gridaBagLayoutOrderByTipoNotaCreditoSoli);
			
			
			this.jTableDatosTipoNotaCreditoSoliOrderBy = new JTableMe();        
			this.jTableDatosTipoNotaCreditoSoliOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoNotaCreditoSoliOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoNotaCreditoSoliOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoNotaCreditoSoliOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoNotaCreditoSoliOrderBy.setViewportView(this.jTableDatosTipoNotaCreditoSoliOrderBy);
			this.jTableDatosTipoNotaCreditoSoliOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoNotaCreditoSoliOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoNotaCreditoSoli= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoNotaCreditoSoli= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoNotaCreditoSoli = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoNotaCreditoSoli= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoNotaCreditoSoli.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoNotaCreditoSoli.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoNotaCreditoSoli.setTitle("Orden");
			this.jInternalFrameOrderByTipoNotaCreditoSoli.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoNotaCreditoSoli.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoNotaCreditoSoli.setResizable(true);
			this.jInternalFrameOrderByTipoNotaCreditoSoli.setClosable(true);
			this.jInternalFrameOrderByTipoNotaCreditoSoli.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoNotaCreditoSoli.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoNotaCreditoSoli.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoNotaCreditoSoli.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Solicitud Nota Creditos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoNotaCreditoSoli.ipady =150;
				
			this.jPanelOrderByTipoNotaCreditoSoli.add(jScrollPanelDatosTipoNotaCreditoSoliOrderBy, this.gridBagConstraintsTipoNotaCreditoSoli);//this.jTableDatosTipoNotaCreditoSoliTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoNotaCreditoSoli = new JButtonMe();
			this.jButtonCerrarOrderByTipoNotaCreditoSoli.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoNotaCreditoSoli,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoNotaCreditoSoli.setToolTipText("Cancelar"+" "+TipoNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoNotaCreditoSoli.add(this.jButtonCerrarOrderByTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoNotaCreditoSoli = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoNotaCreditoSoli= new JScrollPane(jPanelOrderByTipoNotaCreditoSoli,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsTipoNotaCreditoSoli.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoNotaCreditoSoli.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoNotaCreditoSoli.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoNotaCreditoSoli.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoNotaCreditoSoli);
			
			this.jInternalFrameOrderByTipoNotaCreditoSoli.getContentPane().add(this.jScrollPanelOrderByTipoNotaCreditoSoli, this.gridBagConstraintsTipoNotaCreditoSoli);			
		
		} else {
			this.jButtonAbrirOrderByTipoNotaCreditoSoli = new JButtonMe();
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
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tiponotacreditosoliSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoNotaCreditoSoli.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoNotaCreditoSoli.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoNotaCreditoSoli.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoNotaCreditoSoli.getRowHeight();//TipoNotaCreditoSoliConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoNotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoNotaCreditoSoli.isSelected()) {
					iHeightTable=TipoNotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoNotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoNotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoNotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoNotaCreditoSoli.isSelected()) {
					iHeightTable=TipoNotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoNotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoNotaCreditoSoliConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoNotaCreditoSoli.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoNotaCreditoSoli.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoNotaCreditoSoli.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoNotaCreditoSoli.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoNotaCreditoSoli.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoNotaCreditoSoli.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoNotaCreditoSoli!=null && this.jInternalFrameOrderByTipoNotaCreditoSoli.getjTableDatosOrderBy()!=null) {
			//if(!this.tiponotacreditosoliSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoNotaCreditoSoli.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoNotaCreditoSoli.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoNotaCreditoSoli.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoNotaCreditoSoli.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoNotaCreditoSoli.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoNotaCreditoSoli.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoNotaCreditoSoli.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoNotaCreditoSoli.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoNotaCreditoSoli.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoNotaCreditoSoli.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiponotacreditosoliLogic.getTipoNotaCreditoSolis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiponotacreditosolis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoNotaCreditoSoli> TraerTipoNotaCreditoSoliBeans(List<TipoNotaCreditoSoli> tiponotacreditosolis,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoNotaCreditoSoli tiponotacreditosoli:tiponotacreditosolis) {
					
				if(!(TipoNotaCreditoSoliConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoNotaCreditoSoliConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiponotacreditosoli.setsDetalleGeneralEntityReporte(TipoNotaCreditoSoliConstantesFunciones.getTipoNotaCreditoSoliDescripcion(tiponotacreditosoli));
										
						
					
					

					if(tiponotacreditosoli.getNotaCreditoSolis()!=null && Funciones.existeClass(classes,NotaCreditoSoli.class)) {
						try{tiponotacreditosoli.setnotacreditosolisDescripcionReporte(new JRBeanCollectionDataSource(NotaCreditoSoliJInternalFrame.TraerNotaCreditoSoliBeans(tiponotacreditosoli.getNotaCreditoSolis(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tiponotacreditosoli.setsDetalleGeneralEntityReporte(tiponotacreditosoli.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiponotacreditosolibeans.add(tiponotacreditosolibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiponotacreditosolis;
    }
	//PARA REPORTES FIN
}
