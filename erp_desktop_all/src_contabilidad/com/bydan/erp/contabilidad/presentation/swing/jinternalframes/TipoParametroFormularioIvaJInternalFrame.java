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

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.contabilidad.util.TipoParametroFormularioIvaConstantesFunciones;

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
public class TipoParametroFormularioIvaJInternalFrame extends TipoParametroFormularioIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoParametroFormularioIva;
	
	protected JMenuBar jmenuBarTipoParametroFormularioIva;
	
	protected JMenu jmenuTipoParametroFormularioIva;
	protected JMenu jmenuDatosTipoParametroFormularioIva;
	protected JMenu jmenuArchivoTipoParametroFormularioIva;
	protected JMenu jmenuAccionesTipoParametroFormularioIva;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoParametroFormularioIva;	
	protected GridBagConstraints gridBagConstraintsTipoParametroFormularioIva;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoParametroFormularioIvaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoParametroFormularioIva;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoParametroFormularioIva;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoParametroFormularioIva;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoParametroFormularioIvaSessionBean tipoparametroformularioivaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoParametroFormularioIva> tipoparametroformularioivas;		
	public List<TipoParametroFormularioIva> tipoparametroformularioivasEliminados;	
	public List<TipoParametroFormularioIva> tipoparametroformularioivasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoParametroFormularioIva;		
	protected JButton jButtonAbrirOrderByTipoParametroFormularioIva;
	
	
	//protected JPanel jPanelOrderByTipoParametroFormularioIva;
	//public JScrollPane jScrollPanelOrderByTipoParametroFormularioIva;	
	//protected JButton jButtonCerrarOrderByTipoParametroFormularioIva;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoParametroFormularioIvaLogic tipoparametroformularioivaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoParametroFormularioIva;
	public JScrollPane jScrollPanelDatosEdicionTipoParametroFormularioIva;
	public JScrollPane jScrollPanelDatosGeneralTipoParametroFormularioIva;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoParametroFormularioIvaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoParametroFormularioIva;
	//public JScrollPane jScrollPanelImportacionTipoParametroFormularioIva;
	
	
	
	protected JPanel jPanelAccionesTipoParametroFormularioIva;
	
    protected JPanel jPanelPaginacionTipoParametroFormularioIva;
    protected JPanel jPanelParametrosReportesTipoParametroFormularioIva;
	protected JPanel jPanelParametrosReportesAccionesTipoParametroFormularioIva;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoParametroFormularioIva;
	protected JPanel jPanelParametrosAuxiliar2TipoParametroFormularioIva;
	protected JPanel jPanelParametrosAuxiliar3TipoParametroFormularioIva;
	protected JPanel jPanelParametrosAuxiliar4TipoParametroFormularioIva;
	//protected JPanel jPanelParametrosAuxiliar5TipoParametroFormularioIva;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoParametroFormularioIva;
	//protected JPanel jPanelImportacionTipoParametroFormularioIva;
	
	
	public JTable jTableDatosTipoParametroFormularioIva;
	
	
	
	//public JTable jTableDatosTipoParametroFormularioIvaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoParametroFormularioIva;
	protected JButton jButtonDuplicarTipoParametroFormularioIva;
	protected JButton jButtonCopiarTipoParametroFormularioIva;
	protected JButton jButtonVerFormTipoParametroFormularioIva;
	protected JButton jButtonNuevoRelacionesTipoParametroFormularioIva;
	protected JButton jButtonModificarTipoParametroFormularioIva;
	
    protected JButton jButtonGuardarCambiosTablaTipoParametroFormularioIva;
	protected JButton jButtonCerrarTipoParametroFormularioIva;
	
	
	protected JButton jButtonRecargarInformacionTipoParametroFormularioIva;
	protected JButton jButtonProcesarInformacionTipoParametroFormularioIva;
	
	
	protected JButton jButtonAnterioresTipoParametroFormularioIva;
	protected JButton jButtonSiguientesTipoParametroFormularioIva;
	protected JButton jButtonNuevoGuardarCambiosTipoParametroFormularioIva;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoParametroFormularioIva;
	//protected JButton jButtonCerrarReporteDinamicoTipoParametroFormularioIva;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoParametroFormularioIva;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoParametroFormularioIva;
	//protected JButton jButtonGenerarImportacionTipoParametroFormularioIva;
	//protected JButton jButtonCerrarImportacionTipoParametroFormularioIva;
	//protected JFileChooser jFileChooserImportacionTipoParametroFormularioIva;
	//protected File fileImportacionTipoParametroFormularioIva;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoParametroFormularioIva;
	protected JButton jButtonDuplicarToolBarTipoParametroFormularioIva;
	protected JButton jButtonNuevoRelacionesToolBarTipoParametroFormularioIva;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoParametroFormularioIva;
	protected JButton jButtonCopiarToolBarTipoParametroFormularioIva;
	protected JButton jButtonVerFormToolBarTipoParametroFormularioIva;
	public JButton jButtonGuardarCambiosTablaToolBarTipoParametroFormularioIva;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoParametroFormularioIva;
	protected JButton jButtonCerrarToolBarTipoParametroFormularioIva;
	
	protected JButton jButtonRecargarInformacionToolBarTipoParametroFormularioIva;
	protected JButton jButtonProcesarInformacionToolBarTipoParametroFormularioIva;
	protected JButton jButtonAnterioresToolBarTipoParametroFormularioIva;
	protected JButton jButtonSiguientesToolBarTipoParametroFormularioIva;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoParametroFormularioIva;
	protected JButton jButtonAbrirOrderByToolBarTipoParametroFormularioIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoParametroFormularioIva;
	protected JMenuItem jMenuItemDuplicarTipoParametroFormularioIva;
	protected JMenuItem jMenuItemNuevoRelacionesTipoParametroFormularioIva;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoParametroFormularioIva;
	protected JMenuItem jMenuItemCopiarTipoParametroFormularioIva;
	protected JMenuItem jMenuItemVerFormTipoParametroFormularioIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoParametroFormularioIva;
	protected JMenuItem jMenuItemCerrarTipoParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleCerrarTipoParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoParametroFormularioIva;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoParametroFormularioIva;
	protected JMenuItem jMenuItemProcesarInformacionTipoParametroFormularioIva;
	protected JMenuItem jMenuItemAnterioresTipoParametroFormularioIva;
	protected JMenuItem jMenuItemSiguientesTipoParametroFormularioIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoParametroFormularioIva;
	protected JMenuItem jMenuItemAbrirOrderByTipoParametroFormularioIva;
	protected JMenuItem jMenuItemMostrarOcultarTipoParametroFormularioIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoParametroFormularioIva;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoParametroFormularioIva;
	protected JCheckBox jCheckBoxSeleccionadosTipoParametroFormularioIva;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoParametroFormularioIva;
	protected JCheckBox jCheckBoxConGraficoReporteTipoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoParametroFormularioIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoParametroFormularioIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoParametroFormularioIva;
	protected JTextField jTextFieldValorCampoGeneralTipoParametroFormularioIva;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoParametroFormularioIva;
	//public JList<Reporte> jListColumnasSelectReporteTipoParametroFormularioIva;
	//public JScrollPane jScrollColumnasSelectReporteTipoParametroFormularioIva;
	
	//public JLabel jLabelRelacionesSelectReporteTipoParametroFormularioIva;
	//public JList<Reporte> jListRelacionesSelectReporteTipoParametroFormularioIva;
	//public JScrollPane jScrollRelacionesSelectReporteTipoParametroFormularioIva;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoParametroFormularioIva;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoParametroFormularioIva;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoParametroFormularioIva;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoParametroFormularioIva;
	
		
	//public JLabel jLabelArchivoImportacionTipoParametroFormularioIva;	
	//public JLabel jLabelPathArchivoImportacionTipoParametroFormularioIva;
	//protected JTextField jTextFieldPathArchivoImportacionTipoParametroFormularioIva;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoParametroFormularioIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoParametroFormularioIva;
	
	//public JLabel jLabelColumnaCategoriaValorTipoParametroFormularioIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoParametroFormularioIva;
	
	//public JLabel jLabelColumnasValoresGraficoTipoParametroFormularioIva;
	//public JList<Reporte> jListColumnasValoresGraficoTipoParametroFormularioIva;
	//public JScrollPane jScrollColumnasValoresGraficoTipoParametroFormularioIva;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoParametroFormularioIva;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoParametroFormularioIva;	
	
	
	
	
	
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
	public TipoParametroFormularioIvaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParametroFormularioIvaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParametroFormularioIvaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParametroFormularioIvaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoParametroFormularioIva)	{
		this.jButtonRecargarInformacionTipoParametroFormularioIva = jButtonRecargarInformacionTipoParametroFormularioIva;
	}
	
	public JButton getjButtonProcesarInformacionTipoParametroFormularioIva() {
		return this.jButtonProcesarInformacionTipoParametroFormularioIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoParametroFormularioIva)	{
		this.jButtonProcesarInformacionTipoParametroFormularioIva = jButtonProcesarInformacionTipoParametroFormularioIva;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoParametroFormularioIva() {
		return this.jButtonRecargarInformacionTipoParametroFormularioIva;
	}
	
	
	public List<TipoParametroFormularioIva> gettipoparametroformularioivas() {
		return this.tipoparametroformularioivas;
	}

	public void settipoparametroformularioivas(List<TipoParametroFormularioIva> tipoparametroformularioivas) {
		this.tipoparametroformularioivas = tipoparametroformularioivas;
	}
	
	public List<TipoParametroFormularioIva> gettipoparametroformularioivasAux() {
		return this.tipoparametroformularioivasAux;
	}

	public void settipoparametroformularioivasAux(List<TipoParametroFormularioIva> tipoparametroformularioivasAux) {
		this.tipoparametroformularioivasAux = tipoparametroformularioivasAux;
	}
	
	public List<TipoParametroFormularioIva> gettipoparametroformularioivasEliminados() {
		return this.tipoparametroformularioivasEliminados;
	}

	public void setTipoParametroFormularioIvasEliminados(List<TipoParametroFormularioIva> tipoparametroformularioivasEliminados) {
		this.tipoparametroformularioivasEliminados = tipoparametroformularioivasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoParametroFormularioIva() {
		return jComboBoxTiposSeleccionarTipoParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoParametroFormularioIva(
			JComboBox jComboBoxTiposSeleccionarTipoParametroFormularioIva) {
		this.jComboBoxTiposSeleccionarTipoParametroFormularioIva = jComboBoxTiposSeleccionarTipoParametroFormularioIva;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoParametroFormularioIva() {
		return jTextFieldValorCampoGeneralTipoParametroFormularioIva;
	}

	public void setjTextFieldValorCampoGeneralTipoParametroFormularioIva(
			JTextField jTextFieldValorCampoGeneralTipoParametroFormularioIva) {
		this.jTextFieldValorCampoGeneralTipoParametroFormularioIva = jTextFieldValorCampoGeneralTipoParametroFormularioIva;
	}

	public void setBorderResaltarValorCampoGeneralTipoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoParametroFormularioIva .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoParametroFormularioIva() {
		return this.jCheckBoxSeleccionarTodosTipoParametroFormularioIva;
	}

	public void setjCheckBoxSeleccionarTodosTipoParametroFormularioIva(
			JCheckBox jCheckBoxSeleccionarTodosTipoParametroFormularioIva) {
		this.jCheckBoxSeleccionarTodosTipoParametroFormularioIva = jCheckBoxSeleccionarTodosTipoParametroFormularioIva;
	}

	public void setBorderResaltarSeleccionarTodosTipoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoParametroFormularioIva() {
		return this.jCheckBoxSeleccionadosTipoParametroFormularioIva;
	}

	public void setjCheckBoxSeleccionadosTipoParametroFormularioIva(
			JCheckBox jCheckBoxSeleccionadosTipoParametroFormularioIva) {
		this.jCheckBoxSeleccionadosTipoParametroFormularioIva = jCheckBoxSeleccionadosTipoParametroFormularioIva;
	}
	
	public void setBorderResaltarSeleccionadosTipoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoParametroFormularioIva() {
		return this.jComboBoxTiposArchivosReportesTipoParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoParametroFormularioIva(
			JComboBox jComboBoxTiposArchivosReportesTipoParametroFormularioIva) {
		this.jComboBoxTiposArchivosReportesTipoParametroFormularioIva = jComboBoxTiposArchivosReportesTipoParametroFormularioIva;
	}

	public void setBorderResaltarTiposArchivosReportesTipoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoParametroFormularioIva() {
		return this.jComboBoxTiposReportesTipoParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoParametroFormularioIva(
			JComboBox jComboBoxTiposReportesTipoParametroFormularioIva) {
		this.jComboBoxTiposReportesTipoParametroFormularioIva = jComboBoxTiposReportesTipoParametroFormularioIva;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoParametroFormularioIva() {
	//	return jComboBoxTiposReportesDinamicoTipoParametroFormularioIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoParametroFormularioIva(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoParametroFormularioIva) {
	//	this.jComboBoxTiposReportesDinamicoTipoParametroFormularioIva = jComboBoxTiposReportesDinamicoTipoParametroFormularioIva;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoParametroFormularioIva() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoParametroFormularioIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoParametroFormularioIva(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoParametroFormularioIva) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoParametroFormularioIva = jComboBoxTiposArchivosReportesDinamicoTipoParametroFormularioIva;
	//}
	
	public void setBorderResaltarTiposReportesTipoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoParametroFormularioIva() {
		return this.jComboBoxTiposGraficosReportesTipoParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoParametroFormularioIva(
			JComboBox jComboBoxTiposGraficosReportesTipoParametroFormularioIva) {
		this.jComboBoxTiposGraficosReportesTipoParametroFormularioIva = jComboBoxTiposGraficosReportesTipoParametroFormularioIva;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoParametroFormularioIva() {
		return this.jComboBoxTiposPaginacionTipoParametroFormularioIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoParametroFormularioIva(
			JComboBox jComboBoxTiposPaginacionTipoParametroFormularioIva) {
		this.jComboBoxTiposPaginacionTipoParametroFormularioIva = jComboBoxTiposPaginacionTipoParametroFormularioIva;
	}
	
	public void setBorderResaltarTiposPaginacionTipoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoParametroFormularioIva() {
		return this.jComboBoxTiposRelacionesTipoParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoParametroFormularioIva() {
		return this.jComboBoxTiposAccionesTipoParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoParametroFormularioIva(
			JComboBox jComboBoxTiposRelacionesTipoParametroFormularioIva) {
		this.jComboBoxTiposRelacionesTipoParametroFormularioIva = jComboBoxTiposRelacionesTipoParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoParametroFormularioIva(
			JComboBox jComboBoxTiposAccionesTipoParametroFormularioIva) {
		this.jComboBoxTiposAccionesTipoParametroFormularioIva = jComboBoxTiposAccionesTipoParametroFormularioIva;
	}
	
	public void setBorderResaltarTiposRelacionesTipoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoParametroFormularioIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParametroFormularioIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoParametroFormularioIva .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoParametroFormularioIva() {
	//	return jCheckBoxConGraficoDinamicoTipoParametroFormularioIva;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoParametroFormularioIva(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoParametroFormularioIva) {
	//	this.jCheckBoxConGraficoDinamicoTipoParametroFormularioIva = jCheckBoxConGraficoDinamicoTipoParametroFormularioIva;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoParametroFormularioIva() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoParametroFormularioIva.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoParametroFormularioIva .setBorder(borderResaltar);		
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
		this.tipoparametroformularioivaSessionBean=new TipoParametroFormularioIvaSessionBean();
		
		this.tipoparametroformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparametroformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoParametroFormularioIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Parametro Formulario Iva  MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoParametroFormularioIva= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoParametroFormularioIva,this.jTtoolBarTipoParametroFormularioIva,
							"nuevo","nuevo","Nuevo"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoParametroFormularioIva,this.jTtoolBarTipoParametroFormularioIva,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoParametroFormularioIva,this.jTtoolBarTipoParametroFormularioIva,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoParametroFormularioIva,this.jTtoolBarTipoParametroFormularioIva,
							"duplicar","duplicar","Duplicar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoParametroFormularioIva,this.jTtoolBarTipoParametroFormularioIva,
							"copiar","copiar","Copiar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoParametroFormularioIva,this.jTtoolBarTipoParametroFormularioIva,
							"ver_form","ver_form","Ver"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParametroFormularioIva,this.jTtoolBarTipoParametroFormularioIva,
							"recargar","recargar","Recargar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParametroFormularioIva,this.jTtoolBarTipoParametroFormularioIva,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParametroFormularioIva,this.jTtoolBarTipoParametroFormularioIva,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoParametroFormularioIva,this.jTtoolBarTipoParametroFormularioIva,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoParametroFormularioIva,this.jTtoolBarTipoParametroFormularioIva,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoParametroFormularioIva,this.jTtoolBarTipoParametroFormularioIva,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoParametroFormularioIva,this.jTtoolBarTipoParametroFormularioIva,
							"cerrar","cerrar","Salir"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoParametroFormularioIva=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoParametroFormularioIva;
			
				this.jButtonProcesarInformacionToolBarTipoParametroFormularioIva=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoParametroFormularioIva;
				
		//protected JButton jButtonModificarToolBarTipoParametroFormularioIva;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoParametroFormularioIva=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoParametroFormularioIva=new JMenuMe("General");
		this.jmenuArchivoTipoParametroFormularioIva=new JMenuMe("Archivo");
		this.jmenuAccionesTipoParametroFormularioIva=new JMenuMe("Acciones");
		this.jmenuDatosTipoParametroFormularioIva=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoParametroFormularioIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoParametroFormularioIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoParametroFormularioIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoParametroFormularioIva= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoParametroFormularioIva.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoParametroFormularioIva,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoParametroFormularioIva= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoParametroFormularioIva.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoParametroFormularioIva,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoParametroFormularioIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoParametroFormularioIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoParametroFormularioIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoParametroFormularioIva= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoParametroFormularioIva.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoParametroFormularioIva,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoParametroFormularioIva= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoParametroFormularioIva.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoParametroFormularioIva,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoParametroFormularioIva= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoParametroFormularioIva.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoParametroFormularioIva,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoParametroFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoParametroFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoParametroFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoParametroFormularioIva= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoParametroFormularioIva.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoParametroFormularioIva,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoParametroFormularioIva= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoParametroFormularioIva.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoParametroFormularioIva,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoParametroFormularioIva= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoParametroFormularioIva.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoParametroFormularioIva,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoParametroFormularioIva= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoParametroFormularioIva.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoParametroFormularioIva,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoParametroFormularioIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoParametroFormularioIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoParametroFormularioIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoParametroFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoParametroFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoParametroFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoParametroFormularioIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoParametroFormularioIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoParametroFormularioIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoParametroFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoParametroFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoParametroFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoParametroFormularioIva= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoParametroFormularioIva.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoParametroFormularioIva,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoParametroFormularioIva.add(this.jMenuItemCerrarTipoParametroFormularioIva);
			
			this.jmenuAccionesTipoParametroFormularioIva.add(this.jMenuItemNuevoTipoParametroFormularioIva);
			this.jmenuAccionesTipoParametroFormularioIva.add(this.jMenuItemNuevoGuardarCambiosTipoParametroFormularioIva);
			this.jmenuAccionesTipoParametroFormularioIva.add(this.jMenuItemNuevoRelacionesTipoParametroFormularioIva);
			this.jmenuAccionesTipoParametroFormularioIva.add(this.jMenuItemGuardarCambiosTablaTipoParametroFormularioIva);		
			this.jmenuAccionesTipoParametroFormularioIva.add(this.jMenuItemDuplicarTipoParametroFormularioIva);		
			this.jmenuAccionesTipoParametroFormularioIva.add(this.jMenuItemCopiarTipoParametroFormularioIva);		
			this.jmenuAccionesTipoParametroFormularioIva.add(this.jMenuItemVerFormTipoParametroFormularioIva);		
			
			this.jmenuDatosTipoParametroFormularioIva.add(this.jMenuItemRecargarInformacionTipoParametroFormularioIva);				
			this.jmenuDatosTipoParametroFormularioIva.add(this.jMenuItemAnterioresTipoParametroFormularioIva);				
			this.jmenuDatosTipoParametroFormularioIva.add(this.jMenuItemSiguientesTipoParametroFormularioIva);				
			this.jmenuDatosTipoParametroFormularioIva.add(this.jMenuItemAbrirOrderByTipoParametroFormularioIva);				
			this.jmenuDatosTipoParametroFormularioIva.add(this.jMenuItemMostrarOcultarTipoParametroFormularioIva);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoParametroFormularioIva.add(this.jMenuItemGuardarCambiosTipoParametroFormularioIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoParametroFormularioIva.add(this.jmenuArchivoTipoParametroFormularioIva);		
			this.jmenuBarTipoParametroFormularioIva.add(this.jmenuAccionesTipoParametroFormularioIva);		
			this.jmenuBarTipoParametroFormularioIva.add(this.jmenuDatosTipoParametroFormularioIva);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoParametroFormularioIva);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoParametroFormularioIva() {
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
			//this.jInternalFrameDetalleTipoParametroFormularioIva = new TipoParametroFormularioIvaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Parametro Formulario Iva  DATOS");
			this.jInternalFrameDetalleFormTipoParametroFormularioIva = new TipoParametroFormularioIvaDetalleFormJInternalFrame(jDesktopPane,this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones(),this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoParametroFormularioIva = null;//new TipoParametroFormularioIvaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoParametroFormularioIva= new GridBagLayout();
		
		
		this.jTableDatosTipoParametroFormularioIva = new JTableMe();      
		
		String sToolTipTipoParametroFormularioIva="";
		sToolTipTipoParametroFormularioIva=TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoParametroFormularioIva+="(Contabilidad.TipoParametroFormularioIva)";
		}
		
		if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoParametroFormularioIva+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoParametroFormularioIva.setToolTipText(sToolTipTipoParametroFormularioIva);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoParametroFormularioIva);
		this.jTableDatosTipoParametroFormularioIva.setAutoCreateRowSorter(true);
		this.jTableDatosTipoParametroFormularioIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoParametroFormularioIva.setRowSelectionAllowed(true);
		this.jTableDatosTipoParametroFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoParametroFormularioIva = new JButtonMe();
		this.jButtonDuplicarTipoParametroFormularioIva = new JButtonMe();
		this.jButtonCopiarTipoParametroFormularioIva = new JButtonMe();
		this.jButtonVerFormTipoParametroFormularioIva = new JButtonMe();
		this.jButtonNuevoRelacionesTipoParametroFormularioIva = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoParametroFormularioIva = new JButtonMe();
		this.jButtonCerrarTipoParametroFormularioIva = new JButtonMe();
		
		this.jScrollPanelDatosTipoParametroFormularioIva = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoParametroFormularioIva = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Parametro Formulario Iva ";
		
		if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Parametro Formulario Iva s" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoParametroFormularioIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoParametroFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesTipoParametroFormularioIva.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoParametroFormularioIva=new ReporteDinamicoJInternalFrame(TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoParametroFormularioIva();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoParametroFormularioIva=new ImportacionJInternalFrame(TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoParametroFormularioIva();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoParametroFormularioIva = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoParametroFormularioIva.setText("Orden");
		this.jButtonAbrirOrderByTipoParametroFormularioIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoParametroFormularioIva,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoParametroFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParametroFormularioIva,false,this);
			
			//this.cargarOrderByTipoParametroFormularioIva(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoParametroFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParametroFormularioIva,true,this);
			
			//this.cargarOrderByTipoParametroFormularioIva(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoParametroFormularioIva.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoParametroFormularioIva.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoParametroFormularioIva.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoParametroFormularioIva.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoParametroFormularioIva.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoParametroFormularioIva.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoParametroFormularioIva.setText("Nuevo");
		this.jButtonDuplicarTipoParametroFormularioIva.setText("Duplicar");
		this.jButtonCopiarTipoParametroFormularioIva.setText("Copiar");
		this.jButtonVerFormTipoParametroFormularioIva.setText("Ver");
		this.jButtonNuevoRelacionesTipoParametroFormularioIva.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoParametroFormularioIva.setText("Guardar");
		this.jButtonCerrarTipoParametroFormularioIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoParametroFormularioIva,"nuevo_button","Nuevo",this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoParametroFormularioIva,"duplicar_button","Duplicar",this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoParametroFormularioIva,"copiar_button","Copiar",this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoParametroFormularioIva,"ver_form","Ver",this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoParametroFormularioIva,"nuevorelaciones_button","Nuevo Rel",this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoParametroFormularioIva,"guardarcambiostabla_button","Guardar",this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoParametroFormularioIva,"cerrar_button","Salir",this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoParametroFormularioIva.setToolTipText("Nuevo"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoParametroFormularioIva.setToolTipText("Duplicar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoParametroFormularioIva.setToolTipText("Copiar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoParametroFormularioIva.setToolTipText("Ver"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoParametroFormularioIva.setToolTipText("Nuevo Rel"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoParametroFormularioIva.setToolTipText("Guardar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoParametroFormularioIva.setToolTipText("Salir"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoParametroFormularioIva";
		inputMap = this.jButtonNuevoTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoParametroFormularioIva"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoParametroFormularioIva";
		inputMap = this.jButtonDuplicarTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoParametroFormularioIva"));
		
		//COPIAR
		sMapKey = "CopiarTipoParametroFormularioIva";
		inputMap = this.jButtonCopiarTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoParametroFormularioIva"));
		
		//VEr FORM
		sMapKey = "VerFormTipoParametroFormularioIva";
		inputMap = this.jButtonVerFormTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoParametroFormularioIva"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoParametroFormularioIva";
		inputMap = this.jButtonNuevoRelacionesTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoParametroFormularioIva"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoParametroFormularioIva";
		inputMap = this.jButtonModificarTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoParametroFormularioIva"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoParametroFormularioIva";
		inputMap = this.jButtonCerrarTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoParametroFormularioIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoParametroFormularioIva";
		inputMap = this.jButtonGuardarCambiosTablaTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoParametroFormularioIva"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoParametroFormularioIva.setName("jPanelParametrosReportesTipoParametroFormularioIva"); 
		
		this.jPanelParametrosReportesAccionesTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoParametroFormularioIva.setName("jPanelParametrosReportesAccionesTipoParametroFormularioIva"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoParametroFormularioIva = new JButtonMe();
		this.jButtonRecargarInformacionTipoParametroFormularioIva.setText("Recargar");
		this.jButtonRecargarInformacionTipoParametroFormularioIva.setToolTipText("Recargar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoParametroFormularioIva,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoParametroFormularioIva = new JButtonMe();
		this.jButtonProcesarInformacionTipoParametroFormularioIva.setText("Procesar");
		this.jButtonProcesarInformacionTipoParametroFormularioIva.setToolTipText("Procesar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoParametroFormularioIva.setVisible(false);
			
		this.jButtonProcesarInformacionTipoParametroFormularioIva.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoParametroFormularioIva.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoParametroFormularioIva.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParametroFormularioIva.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoParametroFormularioIva.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParametroFormularioIva.setText("TIPO");       
		this.jComboBoxTiposReportesTipoParametroFormularioIva.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParametroFormularioIva.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoParametroFormularioIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoParametroFormularioIva.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoParametroFormularioIva.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoParametroFormularioIva.setText("Accion");
		this.jComboBoxTiposRelacionesTipoParametroFormularioIva.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoParametroFormularioIva.setText("Accion");
		this.jComboBoxTiposAccionesTipoParametroFormularioIva.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoParametroFormularioIva.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoParametroFormularioIva.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoParametroFormularioIva=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoParametroFormularioIva.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoParametroFormularioIva.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoParametroFormularioIva.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoParametroFormularioIva = new JLabelMe();
		
		this.jLabelAccionesTipoParametroFormularioIva.setText("Acciones");		
		this.jLabelAccionesTipoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoParametroFormularioIva.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoParametroFormularioIva.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoParametroFormularioIva = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoParametroFormularioIva.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoParametroFormularioIva.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoParametroFormularioIva = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoParametroFormularioIva.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoParametroFormularioIva.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoParametroFormularioIva.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoParametroFormularioIva.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoParametroFormularioIva = new JButtonMe();
		//this.jButtonAnterioresTipoParametroFormularioIva.setText("<<");
        this.jButtonAnterioresTipoParametroFormularioIva.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoParametroFormularioIva,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoParametroFormularioIva = new JButtonMe();
		//this.jButtonSiguientesTipoParametroFormularioIva.setText(">>");
        this.jButtonSiguientesTipoParametroFormularioIva.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoParametroFormularioIva,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoParametroFormularioIva = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoParametroFormularioIva.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoParametroFormularioIva.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoParametroFormularioIva,"nuevoguardarcambios_button","Nue",this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoParametroFormularioIva";
		inputMap = this.jButtonNuevoGuardarCambiosTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoParametroFormularioIva"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoParametroFormularioIva";
		inputMap = this.jButtonRecargarInformacionTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoParametroFormularioIva"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoParametroFormularioIva";
		inputMap = this.jButtonSiguientesTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoParametroFormularioIva"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoParametroFormularioIva";
		inputMap = this.jButtonAnterioresTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoParametroFormularioIva"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoParametroFormularioIva();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoParametroFormularioIva.setMinimumSize(new Dimension(this.getWidth(),TipoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoParametroFormularioIva.setMaximumSize(new Dimension(this.getWidth(),TipoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoParametroFormularioIva.setPreferredSize(new Dimension(this.getWidth(),TipoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParametroFormularioIvaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoParametroFormularioIva = new GridBagLayout();

			this.jPanelPaginacionTipoParametroFormularioIva.setLayout(gridaBagLayoutPaginacionTipoParametroFormularioIva);						
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoParametroFormularioIva.add(this.jButtonAnterioresTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
					
						
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;
			
			this.jPanelPaginacionTipoParametroFormularioIva.add(this.jButtonNuevoGuardarCambiosTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
						
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;
			this.jPanelPaginacionTipoParametroFormularioIva.add(this.jButtonSiguientesTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParametroFormularioIva.add(this.jButtonNuevoTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoParametroFormularioIva.gridy = 1;
				this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoParametroFormularioIva.add(this.jButtonNuevoRelacionesTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
			}
			
			
			if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoParametroFormularioIva.gridy = 1;
				this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoParametroFormularioIva.add(this.jButtonGuardarCambiosTablaTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
			}
			
			
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParametroFormularioIva.add(this.jButtonDuplicarTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParametroFormularioIva.add(this.jButtonCopiarTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParametroFormularioIva.add(this.jButtonVerFormTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = 1;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoParametroFormularioIva.add(this.jButtonCerrarTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		
		
		
		this.jButtonRecargarInformacionTipoParametroFormularioIva.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoParametroFormularioIva.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoParametroFormularioIva.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoParametroFormularioIva.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoParametroFormularioIva.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoParametroFormularioIva.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoParametroFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoParametroFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoParametroFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoParametroFormularioIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoParametroFormularioIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoParametroFormularioIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoParametroFormularioIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoParametroFormularioIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoParametroFormularioIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoParametroFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoParametroFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoParametroFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoParametroFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParametroFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParametroFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoParametroFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoParametroFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoParametroFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoParametroFormularioIva.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoParametroFormularioIva.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoParametroFormularioIva.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoParametroFormularioIva.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoParametroFormularioIva.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoParametroFormularioIva.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoParametroFormularioIva.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoParametroFormularioIva.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoParametroFormularioIva.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoParametroFormularioIva.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoParametroFormularioIva.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoParametroFormularioIva.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoParametroFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoParametroFormularioIva = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoParametroFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoParametroFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoParametroFormularioIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoParametroFormularioIva = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoParametroFormularioIva.setLayout(gridaBagParametrosReportesTipoParametroFormularioIva);
			this.jPanelParametrosReportesAccionesTipoParametroFormularioIva.setLayout(gridaBagParametrosReportesAccionesTipoParametroFormularioIva);
			
			
			this.jPanelParametrosAuxiliar1TipoParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar1TipoParametroFormularioIva);
			this.jPanelParametrosAuxiliar2TipoParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar2TipoParametroFormularioIva);
			this.jPanelParametrosAuxiliar3TipoParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar3TipoParametroFormularioIva);
			this.jPanelParametrosAuxiliar4TipoParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar4TipoParametroFormularioIva);
			//this.jPanelParametrosAuxiliar5TipoParametroFormularioIva.setLayout(gridaBagParametrosAuxiliar2TipoParametroFormularioIva);			
			
			
			
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParametroFormularioIva.add(this.jButtonRecargarInformacionTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParametroFormularioIva.add(this.jComboBoxTiposPaginacionTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParametroFormularioIva.add(this.jCheckBoxConAltoMaximoTablaTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParametroFormularioIva.add(this.jComboBoxTiposArchivosReportesTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParametroFormularioIva.add(this.jPanelParametrosAuxiliar1TipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoParametroFormularioIva.add(this.jComboBoxTiposReportesTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParametroFormularioIva.add(this.jPanelParametrosAuxiliar4TipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParametroFormularioIva.add(this.jComboBoxTiposReportesTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParametroFormularioIva.add(this.jCheckBoxGenerarReporteTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParametroFormularioIva.add(this.jPanelParametrosAuxiliar2TipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParametroFormularioIva.add(this.jLabelAccionesTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoParametroFormularioIva.add(this.jButtonAbrirOrderByTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParametroFormularioIva.add(this.jComboBoxTiposSeleccionarTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);			
			
			
			/*
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParametroFormularioIva.add(this.jCheckBoxSeleccionarTodosTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoParametroFormularioIva.add(this.jCheckBoxSeleccionarTodosTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);															
				
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoParametroFormularioIva.add(this.jCheckBoxSeleccionadosTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParametroFormularioIva.add(this.jPanelParametrosAuxiliar3TipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParametroFormularioIva.add(this.jComboBoxTiposRelacionesTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
				
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParametroFormularioIva.add(this.jComboBoxTiposAccionesTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
	
				
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParametroFormularioIva.add(this.jTextFieldValorCampoGeneralTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoParametroFormularioIva = new GridBagLayout();

			this.jScrollPanelDatosTipoParametroFormularioIva.setLayout(gridaBagLayoutDatosTipoParametroFormularioIva);
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
			
			this.jScrollPanelDatosTipoParametroFormularioIva.add(this.jTableDatosTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoParametroFormularioIva.setViewportView(this.jTableDatosTipoParametroFormularioIva);
		this.jTableDatosTipoParametroFormularioIva.setFillsViewportHeight(true);
		this.jTableDatosTipoParametroFormularioIva.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoParametroFormularioIva= new GridBagLayout();
		this.jPanelAccionesTipoParametroFormularioIva.setLayout(gridaBagLayoutAccionesTipoParametroFormularioIva);
		
		
		/*	
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
			
		this.jPanelAccionesTipoParametroFormularioIva.add(this.jButtonNuevoTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoParametroFormularioIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoParametroFormularioIva);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();						
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;		
			//this.gridBagConstraintsTipoParametroFormularioIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoParametroFormularioIva.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;		
		//this.gridBagConstraintsTipoParametroFormularioIva.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroFormularioIva.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoParametroFormularioIva.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoParametroFormularioIva);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);								
		
		
		/*
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		*/		
		
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx =0;
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoParametroFormularioIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
				
		
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoParametroFormularioIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoParametroFormularioIva = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoParametroFormularioIva.setLayout(gridaBagLayoutBusquedasParametrosTipoParametroFormularioIva);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoParametroFormularioIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoParametroFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParametroFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParametroFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
			
			
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		
			
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoParametroFormularioIva;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoParametroFormularioIva() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoParametroFormularioIva = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoParametroFormularioIva.setName("jPanelReporteDinamicoTipoParametroFormularioIva"); 
		
		this.jPanelReporteDinamicoTipoParametroFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoParametroFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoParametroFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoParametroFormularioIva.setLayout(gridaBagLayoutReporteDinamicoTipoParametroFormularioIva);
		
		
		this.jInternalFrameReporteDinamicoTipoParametroFormularioIva= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoParametroFormularioIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoParametroFormularioIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoParametroFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoParametroFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoParametroFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Parametro Formulario Iva s"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoParametroFormularioIva = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoParametroFormularioIva.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoParametroFormularioIva.add(this.jLabelColumnasSelectReporteTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoParametroFormularioIva = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoParametroFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoParametroFormularioIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoParametroFormularioIva.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoParametroFormularioIva.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoParametroFormularioIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoParametroFormularioIva=new JScrollPane(this.jListColumnasSelectReporteTipoParametroFormularioIva);
			
			this.jScrollColumnasSelectReporteTipoParametroFormularioIva.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoParametroFormularioIva.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoParametroFormularioIva.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoParametroFormularioIva.add(this.jListColumnasSelectReporteTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		this.jPanelReporteDinamicoTipoParametroFormularioIva.add(this.jScrollColumnasSelectReporteTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoParametroFormularioIva = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoParametroFormularioIva.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoParametroFormularioIva.add(this.jLabelRelacionesSelectReporteTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoParametroFormularioIva = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoParametroFormularioIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoParametroFormularioIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoParametroFormularioIva.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoParametroFormularioIva.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoParametroFormularioIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoParametroFormularioIva=new JScrollPane(this.jListRelacionesSelectReporteTipoParametroFormularioIva);
			
			this.jScrollRelacionesSelectReporteTipoParametroFormularioIva.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoParametroFormularioIva.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoParametroFormularioIva.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoParametroFormularioIva.add(this.jListRelacionesSelectReporteTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		this.jPanelReporteDinamicoTipoParametroFormularioIva.add(this.jScrollRelacionesSelectReporteTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoParametroFormularioIva = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoParametroFormularioIva = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoParametroFormularioIva = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoParametroFormularioIva = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoParametroFormularioIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoParametroFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoParametroFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoParametroFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoParametroFormularioIva = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoParametroFormularioIva.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoParametroFormularioIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoParametroFormularioIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoParametroFormularioIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoParametroFormularioIva = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoParametroFormularioIva.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoParametroFormularioIva.add(this.jLabelGenerarExcelReporteDinamicoTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoParametroFormularioIva = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoParametroFormularioIva.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoParametroFormularioIva,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoParametroFormularioIva.setToolTipText("Generar EXCEL"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoParametroFormularioIva.add(this.jButtonGenerarExcelReporteDinamicoTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParametroFormularioIva.add(this.jComboBoxTiposReportesDinamicoTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoParametroFormularioIva = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoParametroFormularioIva.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoParametroFormularioIva.add(this.jLabelTiposArchivoReporteDinamicoTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParametroFormularioIva.add(this.jComboBoxTiposArchivosReportesDinamicoTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoParametroFormularioIva = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoParametroFormularioIva.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoParametroFormularioIva,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoParametroFormularioIva.setToolTipText("Generar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParametroFormularioIva.add(this.jButtonGenerarReporteDinamicoTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoParametroFormularioIva = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoParametroFormularioIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoParametroFormularioIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoParametroFormularioIva.setToolTipText("Cancelar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParametroFormularioIva.add(this.jButtonCerrarReporteDinamicoTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoParametroFormularioIva = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoParametroFormularioIva= new JScrollPane(jPanelReporteDinamicoTipoParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoParametroFormularioIva.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoParametroFormularioIva.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoParametroFormularioIva.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Parametro Formulario Iva s"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoParametroFormularioIva);
		this.jInternalFrameReporteDinamicoTipoParametroFormularioIva.getContentPane().add(this.jScrollPanelReporteDinamicoTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoParametroFormularioIva() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoParametroFormularioIva = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoParametroFormularioIva.setName("jPanelImportacionTipoParametroFormularioIva"); 
		
		this.jPanelImportacionTipoParametroFormularioIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoParametroFormularioIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoParametroFormularioIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoParametroFormularioIva.setLayout(gridaBagLayoutImportacionTipoParametroFormularioIva);
		
		
		this.jInternalFrameImportacionTipoParametroFormularioIva= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoParametroFormularioIva= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoParametroFormularioIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoParametroFormularioIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoParametroFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoParametroFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoParametroFormularioIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoParametroFormularioIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoParametroFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoParametroFormularioIva.setResizable(true);
	    this.jInternalFrameImportacionTipoParametroFormularioIva.setClosable(true);
	    this.jInternalFrameImportacionTipoParametroFormularioIva.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoParametroFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoParametroFormularioIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoParametroFormularioIva.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoParametroFormularioIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoParametroFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoParametroFormularioIva.setResizable(true);
	    this.jInternalFrameImportacionTipoParametroFormularioIva.setClosable(true);
	    this.jInternalFrameImportacionTipoParametroFormularioIva.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoParametroFormularioIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoParametroFormularioIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoParametroFormularioIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Parametro Formulario Iva s"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoParametroFormularioIva = new JLabelMe();

		this.jLabelArchivoImportacionTipoParametroFormularioIva.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoParametroFormularioIva.add(this.jLabelArchivoImportacionTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoParametroFormularioIva = new JFileChooser();		
		this.jFileChooserImportacionTipoParametroFormularioIva.setToolTipText("ESCOGER ARCHIVO"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoParametroFormularioIva = new JButtonMe();
		this.jButtonAbrirImportacionTipoParametroFormularioIva.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoParametroFormularioIva,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoParametroFormularioIva.setToolTipText("Generar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParametroFormularioIva.add(this.jButtonAbrirImportacionTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoParametroFormularioIva = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoParametroFormularioIva.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoParametroFormularioIva.add(this.jLabelPathArchivoImportacionTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoParametroFormularioIva=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoParametroFormularioIva.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoParametroFormularioIva.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoParametroFormularioIva.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParametroFormularioIva.add(this.jTextFieldPathArchivoImportacionTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoParametroFormularioIva = new JButtonMe();
		this.jButtonGenerarImportacionTipoParametroFormularioIva.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoParametroFormularioIva,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoParametroFormularioIva.setToolTipText("Generar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParametroFormularioIva.add(this.jButtonGenerarImportacionTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoParametroFormularioIva = new JButtonMe();
		this.jButtonCerrarImportacionTipoParametroFormularioIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoParametroFormularioIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoParametroFormularioIva.setToolTipText("Cancelar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParametroFormularioIva.add(this.jButtonCerrarImportacionTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoParametroFormularioIva = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoParametroFormularioIva= new JScrollPane(jPanelImportacionTipoParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsTipoParametroFormularioIva.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoParametroFormularioIva.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoParametroFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoParametroFormularioIva.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoParametroFormularioIva);
		this.jInternalFrameImportacionTipoParametroFormularioIva.getContentPane().add(this.jScrollPanelImportacionTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoParametroFormularioIva(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoParametroFormularioIva = new JButtonMe();
			this.jButtonAbrirOrderByTipoParametroFormularioIva.setText("Orden");
			this.jButtonAbrirOrderByTipoParametroFormularioIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoParametroFormularioIva,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoParametroFormularioIva";
			inputMap = this.jButtonAbrirOrderByTipoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoParametroFormularioIva"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoParametroFormularioIva = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoParametroFormularioIva.setName("jPanelOrderByTipoParametroFormularioIva"); 
			
			this.jPanelOrderByTipoParametroFormularioIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoParametroFormularioIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoParametroFormularioIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoParametroFormularioIva.setLayout(gridaBagLayoutOrderByTipoParametroFormularioIva);
			
			
			this.jTableDatosTipoParametroFormularioIvaOrderBy = new JTableMe();        
			this.jTableDatosTipoParametroFormularioIvaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoParametroFormularioIvaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoParametroFormularioIvaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoParametroFormularioIvaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoParametroFormularioIvaOrderBy.setViewportView(this.jTableDatosTipoParametroFormularioIvaOrderBy);
			this.jTableDatosTipoParametroFormularioIvaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoParametroFormularioIvaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoParametroFormularioIva= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoParametroFormularioIva= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoParametroFormularioIva = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoParametroFormularioIva= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoParametroFormularioIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoParametroFormularioIva.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoParametroFormularioIva.setTitle("Orden");
			this.jInternalFrameOrderByTipoParametroFormularioIva.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoParametroFormularioIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoParametroFormularioIva.setResizable(true);
			this.jInternalFrameOrderByTipoParametroFormularioIva.setClosable(true);
			this.jInternalFrameOrderByTipoParametroFormularioIva.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoParametroFormularioIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoParametroFormularioIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoParametroFormularioIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Parametro Formulario Iva s"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoParametroFormularioIva.ipady =150;
				
			this.jPanelOrderByTipoParametroFormularioIva.add(jScrollPanelDatosTipoParametroFormularioIvaOrderBy, this.gridBagConstraintsTipoParametroFormularioIva);//this.jTableDatosTipoParametroFormularioIvaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoParametroFormularioIva = new JButtonMe();
			this.jButtonCerrarOrderByTipoParametroFormularioIva.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoParametroFormularioIva,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoParametroFormularioIva.setToolTipText("Cancelar"+" "+TipoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParametroFormularioIva.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoParametroFormularioIva.add(this.jButtonCerrarOrderByTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoParametroFormularioIva = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoParametroFormularioIva= new JScrollPane(jPanelOrderByTipoParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsTipoParametroFormularioIva.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoParametroFormularioIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoParametroFormularioIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoParametroFormularioIva.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoParametroFormularioIva);
			
			this.jInternalFrameOrderByTipoParametroFormularioIva.getContentPane().add(this.jScrollPanelOrderByTipoParametroFormularioIva, this.gridBagConstraintsTipoParametroFormularioIva);			
		
		} else {
			this.jButtonAbrirOrderByTipoParametroFormularioIva = new JButtonMe();
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
			&& this.tipoparametroformularioivaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoParametroFormularioIva.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoParametroFormularioIva.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoParametroFormularioIva.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoParametroFormularioIva.getRowHeight();//TipoParametroFormularioIvaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoParametroFormularioIva.isSelected()) {
					iHeightTable=TipoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoParametroFormularioIva.isSelected()) {
					iHeightTable=TipoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoParametroFormularioIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoParametroFormularioIva.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoParametroFormularioIva.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoParametroFormularioIva.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoParametroFormularioIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoParametroFormularioIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoParametroFormularioIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoParametroFormularioIva!=null && this.jInternalFrameOrderByTipoParametroFormularioIva.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoParametroFormularioIva.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoParametroFormularioIva.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoParametroFormularioIva.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoParametroFormularioIva.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoParametroFormularioIva.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoParametroFormularioIva.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoParametroFormularioIva.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoParametroFormularioIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoParametroFormularioIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoParametroFormularioIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoparametroformularioivaLogic.getTipoParametroFormularioIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparametroformularioivas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoParametroFormularioIva> TraerTipoParametroFormularioIvaBeans(List<TipoParametroFormularioIva> tipoparametroformularioivas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoParametroFormularioIva tipoparametroformularioiva:tipoparametroformularioivas) {
					
				if(!(TipoParametroFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoParametroFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoparametroformularioiva.setsDetalleGeneralEntityReporte(TipoParametroFormularioIvaConstantesFunciones.getTipoParametroFormularioIvaDescripcion(tipoparametroformularioiva));
										
						
					
					

					if(tipoparametroformularioiva.getParametroFormularioIvas()!=null && Funciones.existeClass(classes,ParametroFormularioIva.class)) {
						try{tipoparametroformularioiva.setparametroformularioivasDescripcionReporte(new JRBeanCollectionDataSource(ParametroFormularioIvaJInternalFrame.TraerParametroFormularioIvaBeans(tipoparametroformularioiva.getParametroFormularioIvas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoparametroformularioiva.setsDetalleGeneralEntityReporte(tipoparametroformularioiva.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoparametroformularioivabeans.add(tipoparametroformularioivabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoparametroformularioivas;
    }
	//PARA REPORTES FIN
}
