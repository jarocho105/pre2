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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.facturacion.util.TipoDevolucionConstantesFunciones;

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
public class TipoDevolucionJInternalFrame extends TipoDevolucionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoDevolucion;
	
	protected JMenuBar jmenuBarTipoDevolucion;
	
	protected JMenu jmenuTipoDevolucion;
	protected JMenu jmenuDatosTipoDevolucion;
	protected JMenu jmenuArchivoTipoDevolucion;
	protected JMenu jmenuAccionesTipoDevolucion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoDevolucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDevolucion;	
	protected GridBagConstraints gridBagConstraintsTipoDevolucion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoDevolucionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoDevolucion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoDevolucion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoDevolucion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoDevolucionSessionBean tipodevolucionSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoDevolucion> tipodevolucions;		
	public List<TipoDevolucion> tipodevolucionsEliminados;	
	public List<TipoDevolucion> tipodevolucionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoDevolucion;		
	protected JButton jButtonAbrirOrderByTipoDevolucion;
	
	
	//protected JPanel jPanelOrderByTipoDevolucion;
	//public JScrollPane jScrollPanelOrderByTipoDevolucion;	
	//protected JButton jButtonCerrarOrderByTipoDevolucion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoDevolucionLogic tipodevolucionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoDevolucion;
	public JScrollPane jScrollPanelDatosEdicionTipoDevolucion;
	public JScrollPane jScrollPanelDatosGeneralTipoDevolucion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoDevolucionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoDevolucion;
	//public JScrollPane jScrollPanelImportacionTipoDevolucion;
	
	
	
	protected JPanel jPanelAccionesTipoDevolucion;
	
    protected JPanel jPanelPaginacionTipoDevolucion;
    protected JPanel jPanelParametrosReportesTipoDevolucion;
	protected JPanel jPanelParametrosReportesAccionesTipoDevolucion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoDevolucion;
	protected JPanel jPanelParametrosAuxiliar2TipoDevolucion;
	protected JPanel jPanelParametrosAuxiliar3TipoDevolucion;
	protected JPanel jPanelParametrosAuxiliar4TipoDevolucion;
	//protected JPanel jPanelParametrosAuxiliar5TipoDevolucion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoDevolucion;
	//protected JPanel jPanelImportacionTipoDevolucion;
	
	
	public JTable jTableDatosTipoDevolucion;
	
	
	
	//public JTable jTableDatosTipoDevolucionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoDevolucion;
	protected JButton jButtonDuplicarTipoDevolucion;
	protected JButton jButtonCopiarTipoDevolucion;
	protected JButton jButtonVerFormTipoDevolucion;
	protected JButton jButtonNuevoRelacionesTipoDevolucion;
	protected JButton jButtonModificarTipoDevolucion;
	
    protected JButton jButtonGuardarCambiosTablaTipoDevolucion;
	protected JButton jButtonCerrarTipoDevolucion;
	
	
	protected JButton jButtonRecargarInformacionTipoDevolucion;
	protected JButton jButtonProcesarInformacionTipoDevolucion;
	
	
	protected JButton jButtonAnterioresTipoDevolucion;
	protected JButton jButtonSiguientesTipoDevolucion;
	protected JButton jButtonNuevoGuardarCambiosTipoDevolucion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoDevolucion;
	//protected JButton jButtonCerrarReporteDinamicoTipoDevolucion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoDevolucion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoDevolucion;
	//protected JButton jButtonGenerarImportacionTipoDevolucion;
	//protected JButton jButtonCerrarImportacionTipoDevolucion;
	//protected JFileChooser jFileChooserImportacionTipoDevolucion;
	//protected File fileImportacionTipoDevolucion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDevolucion;
	protected JButton jButtonDuplicarToolBarTipoDevolucion;
	protected JButton jButtonNuevoRelacionesToolBarTipoDevolucion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoDevolucion;
	protected JButton jButtonCopiarToolBarTipoDevolucion;
	protected JButton jButtonVerFormToolBarTipoDevolucion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoDevolucion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDevolucion;
	protected JButton jButtonCerrarToolBarTipoDevolucion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoDevolucion;
	protected JButton jButtonProcesarInformacionToolBarTipoDevolucion;
	protected JButton jButtonAnterioresToolBarTipoDevolucion;
	protected JButton jButtonSiguientesToolBarTipoDevolucion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoDevolucion;
	protected JButton jButtonAbrirOrderByToolBarTipoDevolucion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDevolucion;
	protected JMenuItem jMenuItemDuplicarTipoDevolucion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoDevolucion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoDevolucion;
	protected JMenuItem jMenuItemCopiarTipoDevolucion;
	protected JMenuItem jMenuItemVerFormTipoDevolucion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDevolucion;
	protected JMenuItem jMenuItemCerrarTipoDevolucion;
	protected JMenuItem jMenuItemDetalleCerrarTipoDevolucion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoDevolucion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDevolucion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoDevolucion;
	protected JMenuItem jMenuItemProcesarInformacionTipoDevolucion;
	protected JMenuItem jMenuItemAnterioresTipoDevolucion;
	protected JMenuItem jMenuItemSiguientesTipoDevolucion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDevolucion;
	protected JMenuItem jMenuItemAbrirOrderByTipoDevolucion;
	protected JMenuItem jMenuItemMostrarOcultarTipoDevolucion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDevolucion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoDevolucion;
	protected JCheckBox jCheckBoxSeleccionadosTipoDevolucion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoDevolucion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoDevolucion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoDevolucion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoDevolucion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDevolucion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoDevolucion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoDevolucion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoDevolucion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDevolucion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDevolucion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoDevolucion;
	protected JTextField jTextFieldValorCampoGeneralTipoDevolucion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoDevolucion;
	//public JList<Reporte> jListColumnasSelectReporteTipoDevolucion;
	//public JScrollPane jScrollColumnasSelectReporteTipoDevolucion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoDevolucion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoDevolucion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoDevolucion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoDevolucion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoDevolucion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoDevolucion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoDevolucion;
	
		
	//public JLabel jLabelArchivoImportacionTipoDevolucion;	
	//public JLabel jLabelPathArchivoImportacionTipoDevolucion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoDevolucion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoDevolucion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoDevolucion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoDevolucion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoDevolucion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoDevolucion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoDevolucion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoDevolucion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoDevolucion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoDevolucion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoDevolucion;
	public JPanel jPanelBusquedaPorNombreTipoDevolucion;
	public JButton jButtonBusquedaPorNombreTipoDevolucion;
	public JPanel jPanelFK_IdPaisTipoDevolucion;
	public JButton jButtonFK_IdPaisTipoDevolucion;
	
	public JPanel jPanelnombreBusquedaPorNombreTipoDevolucion;
	public JLabel jLabelnombreBusquedaPorNombreTipoDevolucion;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoDevolucion;
	public JButton jButtonnombreBusquedaPorNombreTipoDevolucionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisTipoDevolucion;
	public JLabel jLabelid_paisFK_IdPaisTipoDevolucion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisTipoDevolucion;
	public JButton jButtonid_paisFK_IdPaisTipoDevolucion= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoDevolucionUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoDevolucionBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoDevolucionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoDevolucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDevolucionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDevolucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDevolucionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDevolucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDevolucionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDevolucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoDevolucion)	{
		this.jButtonRecargarInformacionTipoDevolucion = jButtonRecargarInformacionTipoDevolucion;
	}
	
	public JButton getjButtonProcesarInformacionTipoDevolucion() {
		return this.jButtonProcesarInformacionTipoDevolucion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDevolucion)	{
		this.jButtonProcesarInformacionTipoDevolucion = jButtonProcesarInformacionTipoDevolucion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoDevolucion() {
		return this.jButtonRecargarInformacionTipoDevolucion;
	}
	
	
	public List<TipoDevolucion> gettipodevolucions() {
		return this.tipodevolucions;
	}

	public void settipodevolucions(List<TipoDevolucion> tipodevolucions) {
		this.tipodevolucions = tipodevolucions;
	}
	
	public List<TipoDevolucion> gettipodevolucionsAux() {
		return this.tipodevolucionsAux;
	}

	public void settipodevolucionsAux(List<TipoDevolucion> tipodevolucionsAux) {
		this.tipodevolucionsAux = tipodevolucionsAux;
	}
	
	public List<TipoDevolucion> gettipodevolucionsEliminados() {
		return this.tipodevolucionsEliminados;
	}

	public void setTipoDevolucionsEliminados(List<TipoDevolucion> tipodevolucionsEliminados) {
		this.tipodevolucionsEliminados = tipodevolucionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoDevolucion() {
		return jComboBoxTiposSeleccionarTipoDevolucion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoDevolucion(
			JComboBox jComboBoxTiposSeleccionarTipoDevolucion) {
		this.jComboBoxTiposSeleccionarTipoDevolucion = jComboBoxTiposSeleccionarTipoDevolucion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoDevolucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoDevolucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoDevolucion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoDevolucion() {
		return jTextFieldValorCampoGeneralTipoDevolucion;
	}

	public void setjTextFieldValorCampoGeneralTipoDevolucion(
			JTextField jTextFieldValorCampoGeneralTipoDevolucion) {
		this.jTextFieldValorCampoGeneralTipoDevolucion = jTextFieldValorCampoGeneralTipoDevolucion;
	}

	public void setBorderResaltarValorCampoGeneralTipoDevolucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoDevolucion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoDevolucion() {
		return this.jCheckBoxSeleccionarTodosTipoDevolucion;
	}

	public void setjCheckBoxSeleccionarTodosTipoDevolucion(
			JCheckBox jCheckBoxSeleccionarTodosTipoDevolucion) {
		this.jCheckBoxSeleccionarTodosTipoDevolucion = jCheckBoxSeleccionarTodosTipoDevolucion;
	}

	public void setBorderResaltarSeleccionarTodosTipoDevolucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoDevolucion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoDevolucion() {
		return this.jCheckBoxSeleccionadosTipoDevolucion;
	}

	public void setjCheckBoxSeleccionadosTipoDevolucion(
			JCheckBox jCheckBoxSeleccionadosTipoDevolucion) {
		this.jCheckBoxSeleccionadosTipoDevolucion = jCheckBoxSeleccionadosTipoDevolucion;
	}
	
	public void setBorderResaltarSeleccionadosTipoDevolucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoDevolucion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoDevolucion() {
		return this.jComboBoxTiposArchivosReportesTipoDevolucion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoDevolucion(
			JComboBox jComboBoxTiposArchivosReportesTipoDevolucion) {
		this.jComboBoxTiposArchivosReportesTipoDevolucion = jComboBoxTiposArchivosReportesTipoDevolucion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoDevolucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoDevolucion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoDevolucion() {
		return this.jComboBoxTiposReportesTipoDevolucion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoDevolucion(
			JComboBox jComboBoxTiposReportesTipoDevolucion) {
		this.jComboBoxTiposReportesTipoDevolucion = jComboBoxTiposReportesTipoDevolucion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoDevolucion() {
	//	return jComboBoxTiposReportesDinamicoTipoDevolucion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoDevolucion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoDevolucion) {
	//	this.jComboBoxTiposReportesDinamicoTipoDevolucion = jComboBoxTiposReportesDinamicoTipoDevolucion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoDevolucion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoDevolucion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoDevolucion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDevolucion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoDevolucion = jComboBoxTiposArchivosReportesDinamicoTipoDevolucion;
	//}
	
	public void setBorderResaltarTiposReportesTipoDevolucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoDevolucion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoDevolucion() {
		return this.jComboBoxTiposGraficosReportesTipoDevolucion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoDevolucion(
			JComboBox jComboBoxTiposGraficosReportesTipoDevolucion) {
		this.jComboBoxTiposGraficosReportesTipoDevolucion = jComboBoxTiposGraficosReportesTipoDevolucion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoDevolucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoDevolucion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoDevolucion() {
		return this.jComboBoxTiposPaginacionTipoDevolucion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoDevolucion(
			JComboBox jComboBoxTiposPaginacionTipoDevolucion) {
		this.jComboBoxTiposPaginacionTipoDevolucion = jComboBoxTiposPaginacionTipoDevolucion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoDevolucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoDevolucion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoDevolucion() {
		return this.jComboBoxTiposRelacionesTipoDevolucion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDevolucion() {
		return this.jComboBoxTiposAccionesTipoDevolucion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDevolucion(
			JComboBox jComboBoxTiposRelacionesTipoDevolucion) {
		this.jComboBoxTiposRelacionesTipoDevolucion = jComboBoxTiposRelacionesTipoDevolucion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDevolucion(
			JComboBox jComboBoxTiposAccionesTipoDevolucion) {
		this.jComboBoxTiposAccionesTipoDevolucion = jComboBoxTiposAccionesTipoDevolucion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoDevolucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoDevolucion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoDevolucion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDevolucion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoDevolucion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoDevolucion() {
	//	return jCheckBoxConGraficoDinamicoTipoDevolucion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoDevolucion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoDevolucion) {
	//	this.jCheckBoxConGraficoDinamicoTipoDevolucion = jCheckBoxConGraficoDinamicoTipoDevolucion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoDevolucion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoDevolucion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoDevolucion .setBorder(borderResaltar);		
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
		this.tipodevolucionSessionBean=new TipoDevolucionSessionBean();
		
		this.tipodevolucionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodevolucionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodevolucionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoDevolucionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoDevolucionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDevolucionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDevolucionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDevolucionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Devolucion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoDevolucionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoDevolucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoDevolucion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoDevolucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoDevolucion,this.jTtoolBarTipoDevolucion,
							"nuevo","nuevo","Nuevo"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDevolucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoDevolucion,this.jTtoolBarTipoDevolucion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDevolucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoDevolucion,this.jTtoolBarTipoDevolucion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoDevolucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoDevolucion,this.jTtoolBarTipoDevolucion,
							"duplicar","duplicar","Duplicar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoDevolucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoDevolucion,this.jTtoolBarTipoDevolucion,
							"copiar","copiar","Copiar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoDevolucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoDevolucion,this.jTtoolBarTipoDevolucion,
							"ver_form","ver_form","Ver"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoDevolucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDevolucion,this.jTtoolBarTipoDevolucion,
							"recargar","recargar","Recargar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoDevolucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDevolucion,this.jTtoolBarTipoDevolucion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoDevolucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDevolucion,this.jTtoolBarTipoDevolucion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoDevolucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoDevolucion,this.jTtoolBarTipoDevolucion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoDevolucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoDevolucion,this.jTtoolBarTipoDevolucion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoDevolucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoDevolucion,this.jTtoolBarTipoDevolucion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoDevolucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoDevolucion,this.jTtoolBarTipoDevolucion,
							"cerrar","cerrar","Salir"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoDevolucion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoDevolucion;
			
				this.jButtonProcesarInformacionToolBarTipoDevolucion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoDevolucion;
				
		//protected JButton jButtonModificarToolBarTipoDevolucion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoDevolucion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoDevolucion=new JMenuMe("General");
		this.jmenuArchivoTipoDevolucion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoDevolucion=new JMenuMe("Acciones");
		this.jmenuDatosTipoDevolucion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDevolucion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDevolucion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDevolucion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoDevolucion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoDevolucion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoDevolucion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoDevolucion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoDevolucion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoDevolucion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoDevolucion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDevolucion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDevolucion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoDevolucion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoDevolucion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoDevolucion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoDevolucion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoDevolucion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoDevolucion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoDevolucion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoDevolucion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoDevolucion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDevolucion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDevolucion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDevolucion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoDevolucion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoDevolucion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoDevolucion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoDevolucion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoDevolucion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoDevolucion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoDevolucion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoDevolucion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoDevolucion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoDevolucion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoDevolucion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoDevolucion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoDevolucion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoDevolucion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoDevolucion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDevolucion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDevolucion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDevolucion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoDevolucion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoDevolucion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoDevolucion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDevolucion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDevolucion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDevolucion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoDevolucion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoDevolucion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoDevolucion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoDevolucion.add(this.jMenuItemCerrarTipoDevolucion);
			
			this.jmenuAccionesTipoDevolucion.add(this.jMenuItemNuevoTipoDevolucion);
			this.jmenuAccionesTipoDevolucion.add(this.jMenuItemNuevoGuardarCambiosTipoDevolucion);
			this.jmenuAccionesTipoDevolucion.add(this.jMenuItemNuevoRelacionesTipoDevolucion);
			this.jmenuAccionesTipoDevolucion.add(this.jMenuItemGuardarCambiosTablaTipoDevolucion);		
			this.jmenuAccionesTipoDevolucion.add(this.jMenuItemDuplicarTipoDevolucion);		
			this.jmenuAccionesTipoDevolucion.add(this.jMenuItemCopiarTipoDevolucion);		
			this.jmenuAccionesTipoDevolucion.add(this.jMenuItemVerFormTipoDevolucion);		
			
			this.jmenuDatosTipoDevolucion.add(this.jMenuItemRecargarInformacionTipoDevolucion);				
			this.jmenuDatosTipoDevolucion.add(this.jMenuItemAnterioresTipoDevolucion);				
			this.jmenuDatosTipoDevolucion.add(this.jMenuItemSiguientesTipoDevolucion);				
			this.jmenuDatosTipoDevolucion.add(this.jMenuItemAbrirOrderByTipoDevolucion);				
			this.jmenuDatosTipoDevolucion.add(this.jMenuItemMostrarOcultarTipoDevolucion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoDevolucion.add(this.jMenuItemGuardarCambiosTipoDevolucion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoDevolucion.add(this.jmenuArchivoTipoDevolucion);		
			this.jmenuBarTipoDevolucion.add(this.jmenuAccionesTipoDevolucion);		
			this.jmenuBarTipoDevolucion.add(this.jmenuDatosTipoDevolucion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoDevolucion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoDevolucion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTipoDevolucion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoDevolucion.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoDevolucion= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoDevolucion.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoDevolucion.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoDevolucion,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoDevolucion = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoDevolucion.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoDevolucion.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoDevolucion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoDevolucion= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoDevolucion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisTipoDevolucion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisTipoDevolucion.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisTipoDevolucion= new JButtonMe();
		this.jButtonFK_IdPaisTipoDevolucion.setText("Buscar");
		this.jButtonFK_IdPaisTipoDevolucion.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisTipoDevolucion,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisTipoDevolucion = new JLabelMe();
		jLabelid_paisFK_IdPaisTipoDevolucion.setText("Pais :");
		jLabelid_paisFK_IdPaisTipoDevolucion.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisTipoDevolucion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisTipoDevolucion= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisTipoDevolucion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoDevolucion=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoDevolucion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDevolucion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDevolucion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoDevolucion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoDevolucion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoDevolucion = new TipoDevolucionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Devolucion DATOS");
			this.jInternalFrameDetalleFormTipoDevolucion = new TipoDevolucionDetalleFormJInternalFrame(jDesktopPane,this.tipodevolucionSessionBean.getConGuardarRelaciones(),this.tipodevolucionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoDevolucion = null;//new TipoDevolucionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDevolucion= new GridBagLayout();
		
		
		this.jTableDatosTipoDevolucion = new JTableMe();      
		
		String sToolTipTipoDevolucion="";
		sToolTipTipoDevolucion=TipoDevolucionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDevolucion+="(Facturacion.TipoDevolucion)";
		}
		
		if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDevolucion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoDevolucion.setToolTipText(sToolTipTipoDevolucion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoDevolucion);
		this.jTableDatosTipoDevolucion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoDevolucion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoDevolucion.setRowSelectionAllowed(true);
		this.jTableDatosTipoDevolucion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoDevolucion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoDevolucion = new JButtonMe();
		this.jButtonDuplicarTipoDevolucion = new JButtonMe();
		this.jButtonCopiarTipoDevolucion = new JButtonMe();
		this.jButtonVerFormTipoDevolucion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoDevolucion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoDevolucion = new JButtonMe();
		this.jButtonCerrarTipoDevolucion = new JButtonMe();
		
		this.jScrollPanelDatosTipoDevolucion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoDevolucion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoDevolucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Devolucion";
		
		if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Devolucions" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDevolucion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDevolucion.setToolTipText("Acciones");
        this.jPanelAccionesTipoDevolucion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDevolucion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDevolucion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoDevolucion=new ReporteDinamicoJInternalFrame(TipoDevolucionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoDevolucion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoDevolucion=new ImportacionJInternalFrame(TipoDevolucionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoDevolucion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoDevolucion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoDevolucion.setText("Orden");
		this.jButtonAbrirOrderByTipoDevolucion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDevolucion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoDevolucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDevolucion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDevolucion,false,this);
			
			//this.cargarOrderByTipoDevolucion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDevolucion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDevolucion,true,this);
			
			//this.cargarOrderByTipoDevolucion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoDevolucion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDevolucion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoDevolucion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoDevolucion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDevolucion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDevolucion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoDevolucion.setText("Nuevo");
		this.jButtonDuplicarTipoDevolucion.setText("Duplicar");
		this.jButtonCopiarTipoDevolucion.setText("Copiar");
		this.jButtonVerFormTipoDevolucion.setText("Ver");
		this.jButtonNuevoRelacionesTipoDevolucion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoDevolucion.setText("Guardar");
		this.jButtonCerrarTipoDevolucion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDevolucion,"nuevo_button","Nuevo",this.tipodevolucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoDevolucion,"duplicar_button","Duplicar",this.tipodevolucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoDevolucion,"copiar_button","Copiar",this.tipodevolucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoDevolucion,"ver_form","Ver",this.tipodevolucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoDevolucion,"nuevorelaciones_button","Nuevo Rel",this.tipodevolucionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDevolucion,"guardarcambiostabla_button","Guardar",this.tipodevolucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDevolucion,"cerrar_button","Salir",this.tipodevolucionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoDevolucion.setToolTipText("Nuevo"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoDevolucion.setToolTipText("Duplicar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoDevolucion.setToolTipText("Copiar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoDevolucion.setToolTipText("Ver"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoDevolucion.setToolTipText("Nuevo Rel"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoDevolucion.setToolTipText("Guardar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDevolucion.setToolTipText("Salir"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDevolucion";
		inputMap = this.jButtonNuevoTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDevolucion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDevolucion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoDevolucion";
		inputMap = this.jButtonDuplicarTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoDevolucion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoDevolucion"));
		
		//COPIAR
		sMapKey = "CopiarTipoDevolucion";
		inputMap = this.jButtonCopiarTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoDevolucion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoDevolucion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoDevolucion";
		inputMap = this.jButtonVerFormTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoDevolucion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoDevolucion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoDevolucion";
		inputMap = this.jButtonNuevoRelacionesTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoDevolucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoDevolucion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoDevolucion";
		inputMap = this.jButtonModificarTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoDevolucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoDevolucion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoDevolucion";
		inputMap = this.jButtonCerrarTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDevolucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDevolucion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDevolucion";
		inputMap = this.jButtonGuardarCambiosTablaTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDevolucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDevolucion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoDevolucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoDevolucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoDevolucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoDevolucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoDevolucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoDevolucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoDevolucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoDevolucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoDevolucion.setName("jPanelParametrosReportesTipoDevolucion"); 
		
		this.jPanelParametrosReportesAccionesTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoDevolucion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoDevolucion.setName("jPanelParametrosReportesAccionesTipoDevolucion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoDevolucion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoDevolucion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoDevolucion = new JButtonMe();
		this.jButtonRecargarInformacionTipoDevolucion.setText("Recargar");
		this.jButtonRecargarInformacionTipoDevolucion.setToolTipText("Recargar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoDevolucion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoDevolucion = new JButtonMe();
		this.jButtonProcesarInformacionTipoDevolucion.setText("Procesar");
		this.jButtonProcesarInformacionTipoDevolucion.setToolTipText("Procesar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoDevolucion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoDevolucion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDevolucion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDevolucion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoDevolucion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDevolucion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoDevolucion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoDevolucion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDevolucion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoDevolucion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoDevolucion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDevolucion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoDevolucion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoDevolucion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoDevolucion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoDevolucion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoDevolucion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoDevolucion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoDevolucion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoDevolucion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDevolucion.setText("Accion");
		this.jComboBoxTiposAccionesTipoDevolucion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoDevolucion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoDevolucion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoDevolucion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoDevolucion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoDevolucion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDevolucion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDevolucion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoDevolucion = new JLabelMe();
		
		this.jLabelAccionesTipoDevolucion.setText("Acciones");		
		this.jLabelAccionesTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoDevolucion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoDevolucion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoDevolucion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoDevolucion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoDevolucion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoDevolucion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoDevolucion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoDevolucion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoDevolucion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoDevolucion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoDevolucion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoDevolucion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoDevolucion = new JButtonMe();
		//this.jButtonAnterioresTipoDevolucion.setText("<<");
        this.jButtonAnterioresTipoDevolucion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoDevolucion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoDevolucion = new JButtonMe();
		//this.jButtonSiguientesTipoDevolucion.setText(">>");
        this.jButtonSiguientesTipoDevolucion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoDevolucion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoDevolucion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoDevolucion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoDevolucion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoDevolucion,"nuevoguardarcambios_button","Nue",this.tipodevolucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoDevolucion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoDevolucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoDevolucion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoDevolucion";
		inputMap = this.jButtonRecargarInformacionTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoDevolucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoDevolucion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoDevolucion";
		inputMap = this.jButtonSiguientesTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoDevolucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoDevolucion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoDevolucion";
		inputMap = this.jButtonAnterioresTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoDevolucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoDevolucion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoDevolucion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoDevolucion.setMinimumSize(new Dimension(this.getWidth(),TipoDevolucionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDevolucionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDevolucion.setMaximumSize(new Dimension(this.getWidth(),TipoDevolucionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDevolucionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDevolucion.setPreferredSize(new Dimension(this.getWidth(),TipoDevolucionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDevolucionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoDevolucion = new GridBagLayout();

			this.jPanelPaginacionTipoDevolucion.setLayout(gridaBagLayoutPaginacionTipoDevolucion);						
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucion.gridy = 0;
			this.gridBagConstraintsTipoDevolucion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoDevolucion.add(this.jButtonAnterioresTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
					
						
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDevolucion.gridy = 0;
			
			this.jPanelPaginacionTipoDevolucion.add(this.jButtonNuevoGuardarCambiosTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
						
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoDevolucion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDevolucion.gridy = 0;
			this.jPanelPaginacionTipoDevolucion.add(this.jButtonSiguientesTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucion.gridy = 1;
			this.gridBagConstraintsTipoDevolucion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDevolucion.add(this.jButtonNuevoTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
						
			
			
			if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
				this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDevolucion.gridy = 1;
				this.gridBagConstraintsTipoDevolucion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoDevolucion.add(this.jButtonGuardarCambiosTablaTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
			}
			
			
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucion.gridy = 1;
			this.gridBagConstraintsTipoDevolucion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDevolucion.add(this.jButtonDuplicarTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucion.gridy = 1;
			this.gridBagConstraintsTipoDevolucion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDevolucion.add(this.jButtonCopiarTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucion.gridy = 1;
			this.gridBagConstraintsTipoDevolucion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDevolucion.add(this.jButtonVerFormTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucion.gridy = 1;
			this.gridBagConstraintsTipoDevolucion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoDevolucion.add(this.jButtonCerrarTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		
		
		
		this.jButtonRecargarInformacionTipoDevolucion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDevolucion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDevolucion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoDevolucion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDevolucion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDevolucion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoDevolucion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDevolucion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDevolucion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoDevolucion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDevolucion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDevolucion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoDevolucion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDevolucion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDevolucion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoDevolucion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDevolucion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDevolucion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoDevolucion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDevolucion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDevolucion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoDevolucion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDevolucion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDevolucion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoDevolucion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDevolucion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDevolucion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoDevolucion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDevolucion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDevolucion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoDevolucion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDevolucion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDevolucion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoDevolucion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDevolucion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDevolucion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoDevolucion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoDevolucion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoDevolucion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoDevolucion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoDevolucion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoDevolucion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoDevolucion.setLayout(gridaBagParametrosReportesTipoDevolucion);
			this.jPanelParametrosReportesAccionesTipoDevolucion.setLayout(gridaBagParametrosReportesAccionesTipoDevolucion);
			
			
			this.jPanelParametrosAuxiliar1TipoDevolucion.setLayout(gridaBagParametrosAuxiliar1TipoDevolucion);
			this.jPanelParametrosAuxiliar2TipoDevolucion.setLayout(gridaBagParametrosAuxiliar2TipoDevolucion);
			this.jPanelParametrosAuxiliar3TipoDevolucion.setLayout(gridaBagParametrosAuxiliar3TipoDevolucion);
			this.jPanelParametrosAuxiliar4TipoDevolucion.setLayout(gridaBagParametrosAuxiliar4TipoDevolucion);
			//this.jPanelParametrosAuxiliar5TipoDevolucion.setLayout(gridaBagParametrosAuxiliar2TipoDevolucion);			
			
			
			
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDevolucion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDevolucion.add(this.jButtonRecargarInformacionTipoDevolucion, this.gridBagConstraintsTipoDevolucion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDevolucion.add(this.jComboBoxTiposPaginacionTipoDevolucion, this.gridBagConstraintsTipoDevolucion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDevolucion.add(this.jCheckBoxConAltoMaximoTablaTipoDevolucion, this.gridBagConstraintsTipoDevolucion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDevolucion.add(this.jComboBoxTiposArchivosReportesTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDevolucion.add(this.jPanelParametrosAuxiliar1TipoDevolucion, this.gridBagConstraintsTipoDevolucion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDevolucion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoDevolucion.add(this.jComboBoxTiposReportesTipoDevolucion, this.gridBagConstraintsTipoDevolucion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDevolucion.add(this.jPanelParametrosAuxiliar4TipoDevolucion, this.gridBagConstraintsTipoDevolucion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDevolucion.add(this.jComboBoxTiposReportesTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDevolucion.add(this.jCheckBoxGenerarReporteTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDevolucion.add(this.jPanelParametrosAuxiliar2TipoDevolucion, this.gridBagConstraintsTipoDevolucion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDevolucion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDevolucion.add(this.jLabelAccionesTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
				this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoDevolucion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoDevolucion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoDevolucion.add(this.jButtonAbrirOrderByTipoDevolucion, this.gridBagConstraintsTipoDevolucion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDevolucion.add(this.jComboBoxTiposSeleccionarTipoDevolucion, this.gridBagConstraintsTipoDevolucion);			
			
			
			/*
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDevolucion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDevolucion.add(this.jCheckBoxSeleccionarTodosTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDevolucion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDevolucion.add(this.jCheckBoxSeleccionarTodosTipoDevolucion, this.gridBagConstraintsTipoDevolucion);															
				
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDevolucion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDevolucion.add(this.jCheckBoxSeleccionadosTipoDevolucion, this.gridBagConstraintsTipoDevolucion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDevolucion.add(this.jPanelParametrosAuxiliar3TipoDevolucion, this.gridBagConstraintsTipoDevolucion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDevolucion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDevolucion.add(this.jComboBoxTiposAccionesTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoDevolucion = new GridBagLayout();

			this.jScrollPanelDatosTipoDevolucion.setLayout(gridaBagLayoutDatosTipoDevolucion);
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucion.gridy = 0;
			this.gridBagConstraintsTipoDevolucion.gridx = 0;
			
			this.jScrollPanelDatosTipoDevolucion.add(this.jTableDatosTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoDevolucion.setViewportView(this.jTableDatosTipoDevolucion);
		this.jTableDatosTipoDevolucion.setFillsViewportHeight(true);
		this.jTableDatosTipoDevolucion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoDevolucion= new GridBagLayout();
		this.jPanelAccionesTipoDevolucion.setLayout(gridaBagLayoutAccionesTipoDevolucion);
		
		
		/*	
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucion.gridy = 0;
		this.gridBagConstraintsTipoDevolucion.gridx = 0;
			
		this.jPanelAccionesTipoDevolucion.add(this.jButtonNuevoTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoDevolucion= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoDevolucion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoDevolucion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoDevolucion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoDevolucion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoDevolucion.setLayout(gridaBagLayoutBusquedaPorNombreTipoDevolucion);

		gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDevolucion.gridy = 0;
		gridBagConstraintsTipoDevolucion.gridx = 0;
		jPanelBusquedaPorNombreTipoDevolucion.add(jLabelnombreBusquedaPorNombreTipoDevolucion, gridBagConstraintsTipoDevolucion);

		gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDevolucion.gridy = 0;
		gridBagConstraintsTipoDevolucion.gridx = 1;
		jPanelBusquedaPorNombreTipoDevolucion.add(jTextAreanombreBusquedaPorNombreTipoDevolucion, gridBagConstraintsTipoDevolucion);

		gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDevolucion.gridy = 1;
		gridBagConstraintsTipoDevolucion.gridx =1;
		jPanelBusquedaPorNombreTipoDevolucion.add(jButtonBusquedaPorNombreTipoDevolucion, gridBagConstraintsTipoDevolucion);

		jTabbedPaneBusquedasTipoDevolucion.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTipoDevolucion);
		jTabbedPaneBusquedasTipoDevolucion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPaisTipoDevolucion= new GridBagLayout();
		gridaBagLayoutFK_IdPaisTipoDevolucion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoDevolucion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoDevolucion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisTipoDevolucion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisTipoDevolucion.setLayout(gridaBagLayoutFK_IdPaisTipoDevolucion);

		gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDevolucion.gridy = 0;
		gridBagConstraintsTipoDevolucion.gridx = 0;
		jPanelFK_IdPaisTipoDevolucion.add(jLabelid_paisFK_IdPaisTipoDevolucion, gridBagConstraintsTipoDevolucion);

		gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDevolucion.gridy = 0;
		gridBagConstraintsTipoDevolucion.gridx = 1;
		jPanelFK_IdPaisTipoDevolucion.add(jComboBoxid_paisFK_IdPaisTipoDevolucion, gridBagConstraintsTipoDevolucion);

		gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDevolucion.gridy = 1;
		gridBagConstraintsTipoDevolucion.gridx =1;
		jPanelFK_IdPaisTipoDevolucion.add(jButtonFK_IdPaisTipoDevolucion, gridBagConstraintsTipoDevolucion);

		jTabbedPaneBusquedasTipoDevolucion.addTab("2.-Por Pais ", jPanelFK_IdPaisTipoDevolucion);
		jTabbedPaneBusquedasTipoDevolucion.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDevolucion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDevolucion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();						
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDevolucion.gridx = 0;		
			//this.gridBagConstraintsTipoDevolucion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDevolucion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoDevolucion, this.gridBagConstraintsTipoDevolucion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoDevolucion.gridx = 0;		
		//this.gridBagConstraintsTipoDevolucion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoDevolucion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoDevolucion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoDevolucion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDevolucion.gridx = 0;		
			this.gridBagConstraintsTipoDevolucion.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoDevolucion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoDevolucion, this.gridBagConstraintsTipoDevolucion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoDevolucion, this.gridBagConstraintsTipoDevolucion);								
		
		
		/*
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		*/		
		
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDevolucion.gridx =0;
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDevolucion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
				
		
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoDevolucionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoDevolucion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDevolucion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoDevolucion.setLayout(gridaBagLayoutBusquedasParametrosTipoDevolucion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoDevolucion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDevolucion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDevolucion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDevolucion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
			
			
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		
			
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoDevolucion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoDevolucion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoDevolucion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoDevolucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoDevolucion.setName("jPanelReporteDinamicoTipoDevolucion"); 
		
		this.jPanelReporteDinamicoTipoDevolucion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDevolucion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDevolucion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoDevolucion.setLayout(gridaBagLayoutReporteDinamicoTipoDevolucion);
		
		
		this.jInternalFrameReporteDinamicoTipoDevolucion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoDevolucion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDevolucion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoDevolucion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoDevolucion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoDevolucion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoDevolucion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoDevolucion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoDevolucion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoDevolucion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoDevolucion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoDevolucion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDevolucion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDevolucion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Devolucions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoDevolucion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoDevolucion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDevolucion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDevolucion.add(this.jLabelColumnasSelectReporteTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoDevolucion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoDevolucion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoDevolucion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoDevolucion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDevolucion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDevolucion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoDevolucion=new JScrollPane(this.jListColumnasSelectReporteTipoDevolucion);
			
			this.jScrollColumnasSelectReporteTipoDevolucion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDevolucion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDevolucion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDevolucion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDevolucion.add(this.jListColumnasSelectReporteTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		this.jPanelReporteDinamicoTipoDevolucion.add(this.jScrollColumnasSelectReporteTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoDevolucion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoDevolucion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoDevolucion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoDevolucion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoDevolucion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoDevolucion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDevolucion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDevolucion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoDevolucion=new JScrollPane(this.jListRelacionesSelectReporteTipoDevolucion);
			
			this.jScrollRelacionesSelectReporteTipoDevolucion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDevolucion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDevolucion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoDevolucion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoDevolucion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoDevolucion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoDevolucion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoDevolucion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoDevolucion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDevolucion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDevolucion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoDevolucion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDevolucion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDevolucion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDevolucion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDevolucion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoDevolucion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoDevolucion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDevolucion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDevolucion.add(this.jLabelGenerarExcelReporteDinamicoTipoDevolucion, this.gridBagConstraintsTipoDevolucion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoDevolucion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoDevolucion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoDevolucion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoDevolucion.setToolTipText("Generar EXCEL"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		//this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoDevolucion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoDevolucion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoDevolucion.add(this.jButtonGenerarExcelReporteDinamicoTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDevolucion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDevolucion.add(this.jComboBoxTiposReportesDinamicoTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoDevolucion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoDevolucion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDevolucion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDevolucion.add(this.jLabelTiposArchivoReporteDinamicoTipoDevolucion, this.gridBagConstraintsTipoDevolucion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDevolucion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDevolucion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoDevolucion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoDevolucion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoDevolucion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoDevolucion.setToolTipText("Generar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDevolucion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDevolucion.add(this.jButtonGenerarReporteDinamicoTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoDevolucion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoDevolucion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoDevolucion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoDevolucion.setToolTipText("Cancelar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDevolucion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDevolucion.add(this.jButtonCerrarReporteDinamicoTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoDevolucion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoDevolucion= new JScrollPane(jPanelReporteDinamicoTipoDevolucion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoDevolucion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDevolucion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDevolucion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Devolucions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoDevolucion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoDevolucion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoDevolucion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoDevolucion);
		this.jInternalFrameReporteDinamicoTipoDevolucion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoDevolucion, this.gridBagConstraintsTipoDevolucion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoDevolucion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoDevolucion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoDevolucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoDevolucion.setName("jPanelImportacionTipoDevolucion"); 
		
		this.jPanelImportacionTipoDevolucion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDevolucion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDevolucion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoDevolucion.setLayout(gridaBagLayoutImportacionTipoDevolucion);
		
		
		this.jInternalFrameImportacionTipoDevolucion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoDevolucion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoDevolucion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDevolucion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoDevolucion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDevolucion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDevolucion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoDevolucion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDevolucion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDevolucion.setResizable(true);
	    this.jInternalFrameImportacionTipoDevolucion.setClosable(true);
	    this.jInternalFrameImportacionTipoDevolucion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoDevolucion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDevolucion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDevolucion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoDevolucion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDevolucion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDevolucion.setResizable(true);
	    this.jInternalFrameImportacionTipoDevolucion.setClosable(true);
	    this.jInternalFrameImportacionTipoDevolucion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoDevolucion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDevolucion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDevolucion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Devolucions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoDevolucion = new JLabelMe();

		this.jLabelArchivoImportacionTipoDevolucion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDevolucion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDevolucion.add(this.jLabelArchivoImportacionTipoDevolucion, this.gridBagConstraintsTipoDevolucion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoDevolucion = new JFileChooser();		
		this.jFileChooserImportacionTipoDevolucion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoDevolucion = new JButtonMe();
		this.jButtonAbrirImportacionTipoDevolucion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoDevolucion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoDevolucion.setToolTipText("Generar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDevolucion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDevolucion.add(this.jButtonAbrirImportacionTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoDevolucion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoDevolucion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoDevolucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDevolucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDevolucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDevolucion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDevolucion.add(this.jLabelPathArchivoImportacionTipoDevolucion, this.gridBagConstraintsTipoDevolucion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoDevolucion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoDevolucion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDevolucion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDevolucion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDevolucion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDevolucion.add(this.jTextFieldPathArchivoImportacionTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoDevolucion = new JButtonMe();
		this.jButtonGenerarImportacionTipoDevolucion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoDevolucion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoDevolucion.setToolTipText("Generar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDevolucion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDevolucion.add(this.jButtonGenerarImportacionTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoDevolucion = new JButtonMe();
		this.jButtonCerrarImportacionTipoDevolucion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoDevolucion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoDevolucion.setToolTipText("Cancelar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDevolucion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDevolucion.add(this.jButtonCerrarImportacionTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoDevolucion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoDevolucion= new JScrollPane(jPanelImportacionTipoDevolucion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoDevolucion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoDevolucion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoDevolucion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoDevolucion);
		this.jInternalFrameImportacionTipoDevolucion.getContentPane().add(this.jScrollPanelImportacionTipoDevolucion, this.gridBagConstraintsTipoDevolucion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoDevolucion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoDevolucion = new JButtonMe();
			this.jButtonAbrirOrderByTipoDevolucion.setText("Orden");
			this.jButtonAbrirOrderByTipoDevolucion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDevolucion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoDevolucion";
			inputMap = this.jButtonAbrirOrderByTipoDevolucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoDevolucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoDevolucion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoDevolucion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoDevolucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoDevolucion.setName("jPanelOrderByTipoDevolucion"); 
			
			this.jPanelOrderByTipoDevolucion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDevolucion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDevolucion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoDevolucion.setLayout(gridaBagLayoutOrderByTipoDevolucion);
			
			
			this.jTableDatosTipoDevolucionOrderBy = new JTableMe();        
			this.jTableDatosTipoDevolucionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoDevolucionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoDevolucionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoDevolucionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoDevolucionOrderBy.setViewportView(this.jTableDatosTipoDevolucionOrderBy);
			this.jTableDatosTipoDevolucionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoDevolucionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoDevolucion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoDevolucion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoDevolucion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoDevolucion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoDevolucion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoDevolucion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoDevolucion.setTitle("Orden");
			this.jInternalFrameOrderByTipoDevolucion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoDevolucion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoDevolucion.setResizable(true);
			this.jInternalFrameOrderByTipoDevolucion.setClosable(true);
			this.jInternalFrameOrderByTipoDevolucion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoDevolucion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDevolucion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDevolucion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoDevolucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Devolucions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoDevolucion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoDevolucion.ipady =150;
				
			this.jPanelOrderByTipoDevolucion.add(jScrollPanelDatosTipoDevolucionOrderBy, this.gridBagConstraintsTipoDevolucion);//this.jTableDatosTipoDevolucionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoDevolucion = new JButtonMe();
			this.jButtonCerrarOrderByTipoDevolucion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoDevolucion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoDevolucion.setToolTipText("Cancelar"+" "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoDevolucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoDevolucion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoDevolucion.add(this.jButtonCerrarOrderByTipoDevolucion, this.gridBagConstraintsTipoDevolucion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoDevolucion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoDevolucion= new JScrollPane(jPanelOrderByTipoDevolucion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoDevolucion = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoDevolucion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDevolucion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoDevolucion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoDevolucion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoDevolucion);
			
			this.jInternalFrameOrderByTipoDevolucion.getContentPane().add(this.jScrollPanelOrderByTipoDevolucion, this.gridBagConstraintsTipoDevolucion);			
		
		} else {
			this.jButtonAbrirOrderByTipoDevolucion = new JButtonMe();
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
			&& this.tipodevolucionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoDevolucion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoDevolucion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoDevolucion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoDevolucion.getRowHeight();//TipoDevolucionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoDevolucionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDevolucion.isSelected()) {
					iHeightTable=TipoDevolucionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDevolucionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDevolucionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoDevolucionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDevolucion.isSelected()) {
					iHeightTable=TipoDevolucionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDevolucionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDevolucionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoDevolucion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDevolucion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDevolucion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoDevolucion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDevolucion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDevolucion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoDevolucion!=null && this.jInternalFrameOrderByTipoDevolucion.getjTableDatosOrderBy()!=null) {
			//if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoDevolucion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoDevolucion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoDevolucion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoDevolucion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoDevolucion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoDevolucion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoDevolucion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoDevolucion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDevolucion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDevolucion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipodevolucionLogic.getTipoDevolucions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodevolucions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoDevolucion> TraerTipoDevolucionBeans(List<TipoDevolucion> tipodevolucions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoDevolucion tipodevolucion:tipodevolucions) {
					
				if(!(TipoDevolucionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoDevolucionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipodevolucion.setsDetalleGeneralEntityReporte(TipoDevolucionConstantesFunciones.getTipoDevolucionDescripcion(tipodevolucion));
										
						
					
						
					
				} else  {
							
					//tipodevolucion.setsDetalleGeneralEntityReporte(tipodevolucion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipodevolucionbeans.add(tipodevolucionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipodevolucions;
    }
	//PARA REPORTES FIN
}
