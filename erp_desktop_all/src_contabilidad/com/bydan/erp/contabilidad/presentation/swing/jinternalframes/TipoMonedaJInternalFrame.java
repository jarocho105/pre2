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



import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.contabilidad.util.TipoMonedaConstantesFunciones;

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
public class TipoMonedaJInternalFrame extends TipoMonedaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoMoneda;
	
	protected JMenuBar jmenuBarTipoMoneda;
	
	protected JMenu jmenuTipoMoneda;
	protected JMenu jmenuDatosTipoMoneda;
	protected JMenu jmenuArchivoTipoMoneda;
	protected JMenu jmenuAccionesTipoMoneda;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMoneda;	
	protected GridBagConstraints gridBagConstraintsTipoMoneda;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoMonedaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoMoneda;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoMoneda;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoMoneda;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoMonedaSessionBean tipomonedaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoMoneda> tipomonedas;		
	public List<TipoMoneda> tipomonedasEliminados;	
	public List<TipoMoneda> tipomonedasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoMoneda;		
	protected JButton jButtonAbrirOrderByTipoMoneda;
	
	
	//protected JPanel jPanelOrderByTipoMoneda;
	//public JScrollPane jScrollPanelOrderByTipoMoneda;	
	//protected JButton jButtonCerrarOrderByTipoMoneda;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoMonedaLogic tipomonedaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoMoneda;
	public JScrollPane jScrollPanelDatosEdicionTipoMoneda;
	public JScrollPane jScrollPanelDatosGeneralTipoMoneda;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoMonedaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoMoneda;
	//public JScrollPane jScrollPanelImportacionTipoMoneda;
	
	
	
	protected JPanel jPanelAccionesTipoMoneda;
	
    protected JPanel jPanelPaginacionTipoMoneda;
    protected JPanel jPanelParametrosReportesTipoMoneda;
	protected JPanel jPanelParametrosReportesAccionesTipoMoneda;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoMoneda;
	protected JPanel jPanelParametrosAuxiliar2TipoMoneda;
	protected JPanel jPanelParametrosAuxiliar3TipoMoneda;
	protected JPanel jPanelParametrosAuxiliar4TipoMoneda;
	//protected JPanel jPanelParametrosAuxiliar5TipoMoneda;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoMoneda;
	//protected JPanel jPanelImportacionTipoMoneda;
	
	
	public JTable jTableDatosTipoMoneda;
	
	
	
	//public JTable jTableDatosTipoMonedaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoMoneda;
	protected JButton jButtonDuplicarTipoMoneda;
	protected JButton jButtonCopiarTipoMoneda;
	protected JButton jButtonVerFormTipoMoneda;
	protected JButton jButtonNuevoRelacionesTipoMoneda;
	protected JButton jButtonModificarTipoMoneda;
	
    protected JButton jButtonGuardarCambiosTablaTipoMoneda;
	protected JButton jButtonCerrarTipoMoneda;
	
	
	protected JButton jButtonRecargarInformacionTipoMoneda;
	protected JButton jButtonProcesarInformacionTipoMoneda;
	
	
	protected JButton jButtonAnterioresTipoMoneda;
	protected JButton jButtonSiguientesTipoMoneda;
	protected JButton jButtonNuevoGuardarCambiosTipoMoneda;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoMoneda;
	//protected JButton jButtonCerrarReporteDinamicoTipoMoneda;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoMoneda;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoMoneda;
	//protected JButton jButtonGenerarImportacionTipoMoneda;
	//protected JButton jButtonCerrarImportacionTipoMoneda;
	//protected JFileChooser jFileChooserImportacionTipoMoneda;
	//protected File fileImportacionTipoMoneda;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMoneda;
	protected JButton jButtonDuplicarToolBarTipoMoneda;
	protected JButton jButtonNuevoRelacionesToolBarTipoMoneda;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoMoneda;
	protected JButton jButtonCopiarToolBarTipoMoneda;
	protected JButton jButtonVerFormToolBarTipoMoneda;
	public JButton jButtonGuardarCambiosTablaToolBarTipoMoneda;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMoneda;
	protected JButton jButtonCerrarToolBarTipoMoneda;
	
	protected JButton jButtonRecargarInformacionToolBarTipoMoneda;
	protected JButton jButtonProcesarInformacionToolBarTipoMoneda;
	protected JButton jButtonAnterioresToolBarTipoMoneda;
	protected JButton jButtonSiguientesToolBarTipoMoneda;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoMoneda;
	protected JButton jButtonAbrirOrderByToolBarTipoMoneda;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMoneda;
	protected JMenuItem jMenuItemDuplicarTipoMoneda;
	protected JMenuItem jMenuItemNuevoRelacionesTipoMoneda;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoMoneda;
	protected JMenuItem jMenuItemCopiarTipoMoneda;
	protected JMenuItem jMenuItemVerFormTipoMoneda;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMoneda;
	protected JMenuItem jMenuItemCerrarTipoMoneda;
	protected JMenuItem jMenuItemDetalleCerrarTipoMoneda;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoMoneda;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMoneda;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoMoneda;
	protected JMenuItem jMenuItemProcesarInformacionTipoMoneda;
	protected JMenuItem jMenuItemAnterioresTipoMoneda;
	protected JMenuItem jMenuItemSiguientesTipoMoneda;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMoneda;
	protected JMenuItem jMenuItemAbrirOrderByTipoMoneda;
	protected JMenuItem jMenuItemMostrarOcultarTipoMoneda;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMoneda;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoMoneda;
	protected JCheckBox jCheckBoxSeleccionadosTipoMoneda;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoMoneda;
	protected JCheckBox jCheckBoxConGraficoReporteTipoMoneda;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoMoneda;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoMoneda;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMoneda;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoMoneda;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoMoneda;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoMoneda;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMoneda;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMoneda;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoMoneda;
	protected JTextField jTextFieldValorCampoGeneralTipoMoneda;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoMoneda;
	//public JList<Reporte> jListColumnasSelectReporteTipoMoneda;
	//public JScrollPane jScrollColumnasSelectReporteTipoMoneda;
	
	//public JLabel jLabelRelacionesSelectReporteTipoMoneda;
	//public JList<Reporte> jListRelacionesSelectReporteTipoMoneda;
	//public JScrollPane jScrollRelacionesSelectReporteTipoMoneda;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoMoneda;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoMoneda;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoMoneda;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoMoneda;
	
		
	//public JLabel jLabelArchivoImportacionTipoMoneda;	
	//public JLabel jLabelPathArchivoImportacionTipoMoneda;
	//protected JTextField jTextFieldPathArchivoImportacionTipoMoneda;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoMoneda;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoMoneda;
	
	//public JLabel jLabelColumnaCategoriaValorTipoMoneda;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoMoneda;
	
	//public JLabel jLabelColumnasValoresGraficoTipoMoneda;
	//public JList<Reporte> jListColumnasValoresGraficoTipoMoneda;
	//public JScrollPane jScrollColumnasValoresGraficoTipoMoneda;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoMoneda;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoMoneda;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoMoneda;
	public JPanel jPanelBusquedaPorNombreTipoMoneda;
	public JButton jButtonBusquedaPorNombreTipoMoneda;
	public JPanel jPanelBusquedaPorSiglaTipoMoneda;
	public JButton jButtonBusquedaPorSiglaTipoMoneda;
	public JPanel jPanelBusquedaPorSimboloTipoMoneda;
	public JButton jButtonBusquedaPorSimboloTipoMoneda;
	
	public JPanel jPanelnombreBusquedaPorNombreTipoMoneda;
	public JLabel jLabelnombreBusquedaPorNombreTipoMoneda;
	public JTextField jTextFieldnombreBusquedaPorNombreTipoMoneda;
	public JButton jButtonnombreBusquedaPorNombreTipoMonedaBusqueda= new JButtonMe();

	
	public JPanel jPanelsiglaBusquedaPorSiglaTipoMoneda;
	public JLabel jLabelsiglaBusquedaPorSiglaTipoMoneda;
	public JTextField jTextFieldsiglaBusquedaPorSiglaTipoMoneda;
	public JButton jButtonsiglaBusquedaPorSiglaTipoMonedaBusqueda= new JButtonMe();

	
	public JPanel jPanelsimboloBusquedaPorSimboloTipoMoneda;
	public JLabel jLabelsimboloBusquedaPorSimboloTipoMoneda;
	public JTextField jTextFieldsimboloBusquedaPorSimboloTipoMoneda;
	public JButton jButtonsimboloBusquedaPorSimboloTipoMonedaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoMonedaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoMoneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMonedaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMoneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMonedaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMoneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMonedaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMoneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoMoneda)	{
		this.jButtonRecargarInformacionTipoMoneda = jButtonRecargarInformacionTipoMoneda;
	}
	
	public JButton getjButtonProcesarInformacionTipoMoneda() {
		return this.jButtonProcesarInformacionTipoMoneda;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMoneda)	{
		this.jButtonProcesarInformacionTipoMoneda = jButtonProcesarInformacionTipoMoneda;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoMoneda() {
		return this.jButtonRecargarInformacionTipoMoneda;
	}
	
	
	public List<TipoMoneda> gettipomonedas() {
		return this.tipomonedas;
	}

	public void settipomonedas(List<TipoMoneda> tipomonedas) {
		this.tipomonedas = tipomonedas;
	}
	
	public List<TipoMoneda> gettipomonedasAux() {
		return this.tipomonedasAux;
	}

	public void settipomonedasAux(List<TipoMoneda> tipomonedasAux) {
		this.tipomonedasAux = tipomonedasAux;
	}
	
	public List<TipoMoneda> gettipomonedasEliminados() {
		return this.tipomonedasEliminados;
	}

	public void setTipoMonedasEliminados(List<TipoMoneda> tipomonedasEliminados) {
		this.tipomonedasEliminados = tipomonedasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoMoneda() {
		return jComboBoxTiposSeleccionarTipoMoneda;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoMoneda(
			JComboBox jComboBoxTiposSeleccionarTipoMoneda) {
		this.jComboBoxTiposSeleccionarTipoMoneda = jComboBoxTiposSeleccionarTipoMoneda;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoMoneda.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoMoneda .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoMoneda() {
		return jTextFieldValorCampoGeneralTipoMoneda;
	}

	public void setjTextFieldValorCampoGeneralTipoMoneda(
			JTextField jTextFieldValorCampoGeneralTipoMoneda) {
		this.jTextFieldValorCampoGeneralTipoMoneda = jTextFieldValorCampoGeneralTipoMoneda;
	}

	public void setBorderResaltarValorCampoGeneralTipoMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoneda.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoMoneda .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoMoneda() {
		return this.jCheckBoxSeleccionarTodosTipoMoneda;
	}

	public void setjCheckBoxSeleccionarTodosTipoMoneda(
			JCheckBox jCheckBoxSeleccionarTodosTipoMoneda) {
		this.jCheckBoxSeleccionarTodosTipoMoneda = jCheckBoxSeleccionarTodosTipoMoneda;
	}

	public void setBorderResaltarSeleccionarTodosTipoMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoneda.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoMoneda .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoMoneda() {
		return this.jCheckBoxSeleccionadosTipoMoneda;
	}

	public void setjCheckBoxSeleccionadosTipoMoneda(
			JCheckBox jCheckBoxSeleccionadosTipoMoneda) {
		this.jCheckBoxSeleccionadosTipoMoneda = jCheckBoxSeleccionadosTipoMoneda;
	}
	
	public void setBorderResaltarSeleccionadosTipoMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoneda.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoMoneda .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoMoneda() {
		return this.jComboBoxTiposArchivosReportesTipoMoneda;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoMoneda(
			JComboBox jComboBoxTiposArchivosReportesTipoMoneda) {
		this.jComboBoxTiposArchivosReportesTipoMoneda = jComboBoxTiposArchivosReportesTipoMoneda;
	}

	public void setBorderResaltarTiposArchivosReportesTipoMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoneda.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoMoneda .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoMoneda() {
		return this.jComboBoxTiposReportesTipoMoneda;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoMoneda(
			JComboBox jComboBoxTiposReportesTipoMoneda) {
		this.jComboBoxTiposReportesTipoMoneda = jComboBoxTiposReportesTipoMoneda;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoMoneda() {
	//	return jComboBoxTiposReportesDinamicoTipoMoneda;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoMoneda(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoMoneda) {
	//	this.jComboBoxTiposReportesDinamicoTipoMoneda = jComboBoxTiposReportesDinamicoTipoMoneda;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoMoneda() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoMoneda;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoMoneda(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoMoneda) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoMoneda = jComboBoxTiposArchivosReportesDinamicoTipoMoneda;
	//}
	
	public void setBorderResaltarTiposReportesTipoMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoneda.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoMoneda .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoMoneda() {
		return this.jComboBoxTiposGraficosReportesTipoMoneda;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoMoneda(
			JComboBox jComboBoxTiposGraficosReportesTipoMoneda) {
		this.jComboBoxTiposGraficosReportesTipoMoneda = jComboBoxTiposGraficosReportesTipoMoneda;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoneda.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoMoneda .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoMoneda() {
		return this.jComboBoxTiposPaginacionTipoMoneda;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoMoneda(
			JComboBox jComboBoxTiposPaginacionTipoMoneda) {
		this.jComboBoxTiposPaginacionTipoMoneda = jComboBoxTiposPaginacionTipoMoneda;
	}
	
	public void setBorderResaltarTiposPaginacionTipoMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoneda.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoMoneda .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoMoneda() {
		return this.jComboBoxTiposRelacionesTipoMoneda;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMoneda() {
		return this.jComboBoxTiposAccionesTipoMoneda;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMoneda(
			JComboBox jComboBoxTiposRelacionesTipoMoneda) {
		this.jComboBoxTiposRelacionesTipoMoneda = jComboBoxTiposRelacionesTipoMoneda;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMoneda(
			JComboBox jComboBoxTiposAccionesTipoMoneda) {
		this.jComboBoxTiposAccionesTipoMoneda = jComboBoxTiposAccionesTipoMoneda;
	}
	
	public void setBorderResaltarTiposRelacionesTipoMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoneda.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoMoneda .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoMoneda() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoMoneda.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoMoneda .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoMoneda() {
	//	return jCheckBoxConGraficoDinamicoTipoMoneda;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoMoneda(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoMoneda) {
	//	this.jCheckBoxConGraficoDinamicoTipoMoneda = jCheckBoxConGraficoDinamicoTipoMoneda;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoMoneda() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoMoneda.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoMoneda .setBorder(borderResaltar);		
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
		this.tipomonedaSessionBean=new TipoMonedaSessionBean();
		
		this.tipomonedaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomonedaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomonedaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoMonedaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoMonedaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMonedaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMonedaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMonedaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Moneda MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoMonedaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoMoneda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoMoneda= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoMoneda,this.jTtoolBarTipoMoneda,
							"nuevo","nuevo","Nuevo"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoMoneda,this.jTtoolBarTipoMoneda,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoMoneda,this.jTtoolBarTipoMoneda,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoMoneda,this.jTtoolBarTipoMoneda,
							"duplicar","duplicar","Duplicar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoMoneda,this.jTtoolBarTipoMoneda,
							"copiar","copiar","Copiar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoMoneda,this.jTtoolBarTipoMoneda,
							"ver_form","ver_form","Ver"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMoneda,this.jTtoolBarTipoMoneda,
							"recargar","recargar","Recargar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMoneda,this.jTtoolBarTipoMoneda,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoMoneda,this.jTtoolBarTipoMoneda,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoMoneda,this.jTtoolBarTipoMoneda,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoMoneda,this.jTtoolBarTipoMoneda,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoMoneda,this.jTtoolBarTipoMoneda,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoMoneda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoMoneda,this.jTtoolBarTipoMoneda,
							"cerrar","cerrar","Salir"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoMoneda=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoMoneda;
			
				this.jButtonProcesarInformacionToolBarTipoMoneda=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoMoneda;
				
		//protected JButton jButtonModificarToolBarTipoMoneda;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoMoneda=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoMoneda=new JMenuMe("General");
		this.jmenuArchivoTipoMoneda=new JMenuMe("Archivo");
		this.jmenuAccionesTipoMoneda=new JMenuMe("Acciones");
		this.jmenuDatosTipoMoneda=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMoneda= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMoneda.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMoneda,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoMoneda= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoMoneda.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoMoneda,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoMoneda= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoMoneda.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoMoneda,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoMoneda= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMoneda.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMoneda,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoMoneda= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoMoneda.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoMoneda,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoMoneda= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoMoneda.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoMoneda,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoMoneda= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoMoneda.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoMoneda,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMoneda= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMoneda.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMoneda,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoMoneda= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoMoneda.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoMoneda,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoMoneda= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoMoneda.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoMoneda,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoMoneda= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoMoneda.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoMoneda,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoMoneda= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoMoneda.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoMoneda,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoMoneda= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoMoneda.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoMoneda,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMoneda= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMoneda.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMoneda,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoMoneda= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoMoneda.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoMoneda,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMoneda= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMoneda.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMoneda,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoMoneda= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoMoneda.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoMoneda,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoMoneda.add(this.jMenuItemCerrarTipoMoneda);
			
			this.jmenuAccionesTipoMoneda.add(this.jMenuItemNuevoTipoMoneda);
			this.jmenuAccionesTipoMoneda.add(this.jMenuItemNuevoGuardarCambiosTipoMoneda);
			this.jmenuAccionesTipoMoneda.add(this.jMenuItemNuevoRelacionesTipoMoneda);
			this.jmenuAccionesTipoMoneda.add(this.jMenuItemGuardarCambiosTablaTipoMoneda);		
			this.jmenuAccionesTipoMoneda.add(this.jMenuItemDuplicarTipoMoneda);		
			this.jmenuAccionesTipoMoneda.add(this.jMenuItemCopiarTipoMoneda);		
			this.jmenuAccionesTipoMoneda.add(this.jMenuItemVerFormTipoMoneda);		
			
			this.jmenuDatosTipoMoneda.add(this.jMenuItemRecargarInformacionTipoMoneda);				
			this.jmenuDatosTipoMoneda.add(this.jMenuItemAnterioresTipoMoneda);				
			this.jmenuDatosTipoMoneda.add(this.jMenuItemSiguientesTipoMoneda);				
			this.jmenuDatosTipoMoneda.add(this.jMenuItemAbrirOrderByTipoMoneda);				
			this.jmenuDatosTipoMoneda.add(this.jMenuItemMostrarOcultarTipoMoneda);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoMoneda.add(this.jMenuItemGuardarCambiosTipoMoneda);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoMoneda.add(this.jmenuArchivoTipoMoneda);		
			this.jmenuBarTipoMoneda.add(this.jmenuAccionesTipoMoneda);		
			this.jmenuBarTipoMoneda.add(this.jmenuDatosTipoMoneda);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoMoneda);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoMoneda() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTipoMoneda=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoMoneda.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoMoneda= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoMoneda.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoMoneda.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoMoneda,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoMoneda = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoMoneda.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoMoneda.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoMoneda,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombreTipoMoneda= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombreTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombreTipoMoneda,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorSiglaTipoMoneda=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorSiglaTipoMoneda.setToolTipText("Buscar Por Sigla ");
		this.jButtonBusquedaPorSiglaTipoMoneda= new JButtonMe();
		this.jButtonBusquedaPorSiglaTipoMoneda.setText("Buscar");
		this.jButtonBusquedaPorSiglaTipoMoneda.setToolTipText("Buscar Por Sigla ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorSiglaTipoMoneda,"buscar_button","Buscar Por Sigla ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorSiglaTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelsiglaBusquedaPorSiglaTipoMoneda = new JLabelMe();
		jLabelsiglaBusquedaPorSiglaTipoMoneda.setText("Sigla :");
		jLabelsiglaBusquedaPorSiglaTipoMoneda.setToolTipText("Sigla");
		jLabelsiglaBusquedaPorSiglaTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglaBusquedaPorSiglaTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsiglaBusquedaPorSiglaTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelsiglaBusquedaPorSiglaTipoMoneda,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldsiglaBusquedaPorSiglaTipoMoneda= new JTextFieldMe();
		jTextFieldsiglaBusquedaPorSiglaTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglaBusquedaPorSiglaTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglaBusquedaPorSiglaTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglaBusquedaPorSiglaTipoMoneda,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorSimboloTipoMoneda=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorSimboloTipoMoneda.setToolTipText("Buscar Por Simbolo ");
		this.jButtonBusquedaPorSimboloTipoMoneda= new JButtonMe();
		this.jButtonBusquedaPorSimboloTipoMoneda.setText("Buscar");
		this.jButtonBusquedaPorSimboloTipoMoneda.setToolTipText("Buscar Por Simbolo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorSimboloTipoMoneda,"buscar_button","Buscar Por Simbolo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorSimboloTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelsimboloBusquedaPorSimboloTipoMoneda = new JLabelMe();
		jLabelsimboloBusquedaPorSimboloTipoMoneda.setText("Simbolo :");
		jLabelsimboloBusquedaPorSimboloTipoMoneda.setToolTipText("Simbolo");
		jLabelsimboloBusquedaPorSimboloTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsimboloBusquedaPorSimboloTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelsimboloBusquedaPorSimboloTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelsimboloBusquedaPorSimboloTipoMoneda,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldsimboloBusquedaPorSimboloTipoMoneda= new JTextFieldMe();
		jTextFieldsimboloBusquedaPorSimboloTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsimboloBusquedaPorSimboloTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsimboloBusquedaPorSimboloTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsimboloBusquedaPorSimboloTipoMoneda,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoMoneda=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoMoneda.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoMoneda.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoMoneda.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoMoneda.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoMoneda,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoMoneda = new TipoMonedaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Moneda DATOS");
			this.jInternalFrameDetalleFormTipoMoneda = new TipoMonedaDetalleFormJInternalFrame(jDesktopPane,this.tipomonedaSessionBean.getConGuardarRelaciones(),this.tipomonedaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoMoneda = null;//new TipoMonedaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMoneda= new GridBagLayout();
		
		
		this.jTableDatosTipoMoneda = new JTableMe();      
		
		String sToolTipTipoMoneda="";
		sToolTipTipoMoneda=TipoMonedaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMoneda+="(Contabilidad.TipoMoneda)";
		}
		
		if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMoneda+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoMoneda.setToolTipText(sToolTipTipoMoneda);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoMoneda);
		this.jTableDatosTipoMoneda.setAutoCreateRowSorter(true);
		this.jTableDatosTipoMoneda.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoMoneda.setRowSelectionAllowed(true);
		this.jTableDatosTipoMoneda.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoMoneda,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoMoneda = new JButtonMe();
		this.jButtonDuplicarTipoMoneda = new JButtonMe();
		this.jButtonCopiarTipoMoneda = new JButtonMe();
		this.jButtonVerFormTipoMoneda = new JButtonMe();
		this.jButtonNuevoRelacionesTipoMoneda = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoMoneda = new JButtonMe();
		this.jButtonCerrarTipoMoneda = new JButtonMe();
		
		this.jScrollPanelDatosTipoMoneda = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoMoneda = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Moneda";
		
		if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Monedas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMoneda.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMoneda.setToolTipText("Acciones");
        this.jPanelAccionesTipoMoneda.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoMoneda=new ReporteDinamicoJInternalFrame(TipoMonedaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoMoneda();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoMoneda=new ImportacionJInternalFrame(TipoMonedaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoMoneda();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoMoneda = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoMoneda.setText("Orden");
		this.jButtonAbrirOrderByTipoMoneda.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMoneda,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMoneda=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMoneda,false,this);
			
			//this.cargarOrderByTipoMoneda(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoMoneda=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMoneda,true,this);
			
			//this.cargarOrderByTipoMoneda(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoMoneda.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosTipoMoneda.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosTipoMoneda.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosTipoMoneda.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMoneda.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoMoneda.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoMoneda.setText("Nuevo");
		this.jButtonDuplicarTipoMoneda.setText("Duplicar");
		this.jButtonCopiarTipoMoneda.setText("Copiar");
		this.jButtonVerFormTipoMoneda.setText("Ver");
		this.jButtonNuevoRelacionesTipoMoneda.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoMoneda.setText("Guardar");
		this.jButtonCerrarTipoMoneda.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMoneda,"nuevo_button","Nuevo",this.tipomonedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoMoneda,"duplicar_button","Duplicar",this.tipomonedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoMoneda,"copiar_button","Copiar",this.tipomonedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoMoneda,"ver_form","Ver",this.tipomonedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoMoneda,"nuevorelaciones_button","Nuevo Rel",this.tipomonedaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMoneda,"guardarcambiostabla_button","Guardar",this.tipomonedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMoneda,"cerrar_button","Salir",this.tipomonedaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoMoneda.setToolTipText("Nuevo"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoMoneda.setToolTipText("Duplicar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoMoneda.setToolTipText("Copiar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoMoneda.setToolTipText("Ver"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoMoneda.setToolTipText("Nuevo Rel"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoMoneda.setToolTipText("Guardar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMoneda.setToolTipText("Salir"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMoneda";
		inputMap = this.jButtonNuevoTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMoneda.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMoneda"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoMoneda";
		inputMap = this.jButtonDuplicarTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoMoneda.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoMoneda"));
		
		//COPIAR
		sMapKey = "CopiarTipoMoneda";
		inputMap = this.jButtonCopiarTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoMoneda.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoMoneda"));
		
		//VEr FORM
		sMapKey = "VerFormTipoMoneda";
		inputMap = this.jButtonVerFormTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoMoneda.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoMoneda"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoMoneda";
		inputMap = this.jButtonNuevoRelacionesTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoMoneda"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoMoneda";
		inputMap = this.jButtonModificarTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoMoneda"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoMoneda";
		inputMap = this.jButtonCerrarTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMoneda"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMoneda";
		inputMap = this.jButtonGuardarCambiosTablaTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMoneda"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoMoneda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoMoneda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoMoneda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoMoneda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoMoneda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoMoneda.setName("jPanelParametrosReportesTipoMoneda"); 
		
		this.jPanelParametrosReportesAccionesTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoMoneda.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoMoneda.setName("jPanelParametrosReportesAccionesTipoMoneda"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoMoneda, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoMoneda = new JButtonMe();
		this.jButtonRecargarInformacionTipoMoneda.setText("Recargar");
		this.jButtonRecargarInformacionTipoMoneda.setToolTipText("Recargar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoMoneda,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoMoneda = new JButtonMe();
		this.jButtonProcesarInformacionTipoMoneda.setText("Procesar");
		this.jButtonProcesarInformacionTipoMoneda.setToolTipText("Procesar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoMoneda.setVisible(false);
			
		this.jButtonProcesarInformacionTipoMoneda.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMoneda.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoMoneda.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoMoneda = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMoneda.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoMoneda.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoMoneda = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMoneda.setText("TIPO");       
		this.jComboBoxTiposReportesTipoMoneda.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoMoneda = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoMoneda.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoMoneda.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoMoneda = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoMoneda.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoMoneda.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoMoneda = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoMoneda.setText("Accion");
		this.jComboBoxTiposRelacionesTipoMoneda.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoMoneda = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMoneda.setText("Accion");
		this.jComboBoxTiposAccionesTipoMoneda.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoMoneda = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoMoneda.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoMoneda.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoMoneda=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoMoneda.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMoneda.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoMoneda.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoMoneda = new JLabelMe();
		
		this.jLabelAccionesTipoMoneda.setText("Acciones");		
		this.jLabelAccionesTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoMoneda = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoMoneda.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoMoneda.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoMoneda = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoMoneda.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoMoneda.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoMoneda = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoMoneda.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoMoneda.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoMoneda = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoMoneda.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoMoneda.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoMoneda = new JButtonMe();
		//this.jButtonAnterioresTipoMoneda.setText("<<");
        this.jButtonAnterioresTipoMoneda.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoMoneda,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoMoneda = new JButtonMe();
		//this.jButtonSiguientesTipoMoneda.setText(">>");
        this.jButtonSiguientesTipoMoneda.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoMoneda,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoMoneda = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoMoneda.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoMoneda.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoMoneda,"nuevoguardarcambios_button","Nue",this.tipomonedaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoMoneda";
		inputMap = this.jButtonNuevoGuardarCambiosTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoMoneda"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoMoneda";
		inputMap = this.jButtonRecargarInformacionTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoMoneda"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoMoneda";
		inputMap = this.jButtonSiguientesTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoMoneda"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoMoneda";
		inputMap = this.jButtonAnterioresTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoMoneda"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoMoneda();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoMoneda.setMinimumSize(new Dimension(this.getWidth(),TipoMonedaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMonedaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMoneda.setMaximumSize(new Dimension(this.getWidth(),TipoMonedaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMonedaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoMoneda.setPreferredSize(new Dimension(this.getWidth(),TipoMonedaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoMonedaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoMoneda = new GridBagLayout();

			this.jPanelPaginacionTipoMoneda.setLayout(gridaBagLayoutPaginacionTipoMoneda);						
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoneda.gridy = 0;
			this.gridBagConstraintsTipoMoneda.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoMoneda.add(this.jButtonAnterioresTipoMoneda, this.gridBagConstraintsTipoMoneda);
					
						
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMoneda.gridy = 0;
			
			this.jPanelPaginacionTipoMoneda.add(this.jButtonNuevoGuardarCambiosTipoMoneda, this.gridBagConstraintsTipoMoneda);
						
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoMoneda.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoMoneda.gridy = 0;
			this.jPanelPaginacionTipoMoneda.add(this.jButtonSiguientesTipoMoneda, this.gridBagConstraintsTipoMoneda);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoneda.gridy = 1;
			this.gridBagConstraintsTipoMoneda.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMoneda.add(this.jButtonNuevoTipoMoneda, this.gridBagConstraintsTipoMoneda);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
				this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoMoneda.gridy = 1;
				this.gridBagConstraintsTipoMoneda.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoMoneda.add(this.jButtonNuevoRelacionesTipoMoneda, this.gridBagConstraintsTipoMoneda);
			}
			
			
			if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
				this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoMoneda.gridy = 1;
				this.gridBagConstraintsTipoMoneda.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoMoneda.add(this.jButtonGuardarCambiosTablaTipoMoneda, this.gridBagConstraintsTipoMoneda);
			}
			
			
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoneda.gridy = 1;
			this.gridBagConstraintsTipoMoneda.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMoneda.add(this.jButtonDuplicarTipoMoneda, this.gridBagConstraintsTipoMoneda);
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoneda.gridy = 1;
			this.gridBagConstraintsTipoMoneda.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMoneda.add(this.jButtonCopiarTipoMoneda, this.gridBagConstraintsTipoMoneda);
		
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoneda.gridy = 1;
			this.gridBagConstraintsTipoMoneda.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoMoneda.add(this.jButtonVerFormTipoMoneda, this.gridBagConstraintsTipoMoneda);
		
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoneda.gridy = 1;
			this.gridBagConstraintsTipoMoneda.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoMoneda.add(this.jButtonCerrarTipoMoneda, this.gridBagConstraintsTipoMoneda);
		
		
		
		this.jButtonRecargarInformacionTipoMoneda.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMoneda.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoMoneda.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoMoneda.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMoneda.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoMoneda.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoMoneda.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMoneda.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoMoneda.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoMoneda.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMoneda.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoMoneda.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoMoneda.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMoneda.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoMoneda.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoMoneda.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMoneda.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoMoneda.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoMoneda.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMoneda.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMoneda.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoMoneda.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMoneda.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoMoneda.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoMoneda.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMoneda.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoMoneda.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoMoneda.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMoneda.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoMoneda.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoMoneda.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMoneda.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoMoneda.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoMoneda.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMoneda.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoMoneda.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoMoneda = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoMoneda = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoMoneda = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoMoneda = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoMoneda = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoMoneda = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoMoneda.setLayout(gridaBagParametrosReportesTipoMoneda);
			this.jPanelParametrosReportesAccionesTipoMoneda.setLayout(gridaBagParametrosReportesAccionesTipoMoneda);
			
			
			this.jPanelParametrosAuxiliar1TipoMoneda.setLayout(gridaBagParametrosAuxiliar1TipoMoneda);
			this.jPanelParametrosAuxiliar2TipoMoneda.setLayout(gridaBagParametrosAuxiliar2TipoMoneda);
			this.jPanelParametrosAuxiliar3TipoMoneda.setLayout(gridaBagParametrosAuxiliar3TipoMoneda);
			this.jPanelParametrosAuxiliar4TipoMoneda.setLayout(gridaBagParametrosAuxiliar4TipoMoneda);
			//this.jPanelParametrosAuxiliar5TipoMoneda.setLayout(gridaBagParametrosAuxiliar2TipoMoneda);			
			
			
			
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoneda.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMoneda.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMoneda.add(this.jButtonRecargarInformacionTipoMoneda, this.gridBagConstraintsTipoMoneda);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoneda.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoneda.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMoneda.add(this.jComboBoxTiposPaginacionTipoMoneda, this.gridBagConstraintsTipoMoneda);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoneda.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoneda.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMoneda.add(this.jCheckBoxConAltoMaximoTablaTipoMoneda, this.gridBagConstraintsTipoMoneda);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoneda.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoneda.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoMoneda.add(this.jComboBoxTiposArchivosReportesTipoMoneda, this.gridBagConstraintsTipoMoneda);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoneda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoneda.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMoneda.add(this.jPanelParametrosAuxiliar1TipoMoneda, this.gridBagConstraintsTipoMoneda);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoneda.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMoneda.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoMoneda.add(this.jComboBoxTiposReportesTipoMoneda, this.gridBagConstraintsTipoMoneda);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoneda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoneda.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMoneda.add(this.jPanelParametrosAuxiliar4TipoMoneda, this.gridBagConstraintsTipoMoneda);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoneda.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoneda.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMoneda.add(this.jComboBoxTiposReportesTipoMoneda, this.gridBagConstraintsTipoMoneda);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoneda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoneda.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMoneda.add(this.jCheckBoxGenerarReporteTipoMoneda, this.gridBagConstraintsTipoMoneda);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoneda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoneda.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMoneda.add(this.jPanelParametrosAuxiliar2TipoMoneda, this.gridBagConstraintsTipoMoneda);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoneda.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMoneda.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMoneda.add(this.jLabelAccionesTipoMoneda, this.gridBagConstraintsTipoMoneda);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
				this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoMoneda.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoMoneda.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoMoneda.add(this.jButtonAbrirOrderByTipoMoneda, this.gridBagConstraintsTipoMoneda);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoMoneda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoneda.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMoneda.add(this.jComboBoxTiposSeleccionarTipoMoneda, this.gridBagConstraintsTipoMoneda);			
			
			
			/*
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoneda.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoMoneda.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoMoneda.add(this.jCheckBoxSeleccionarTodosTipoMoneda, this.gridBagConstraintsTipoMoneda);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoneda.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMoneda.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMoneda.add(this.jCheckBoxSeleccionarTodosTipoMoneda, this.gridBagConstraintsTipoMoneda);															
				
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoneda.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoMoneda.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoMoneda.add(this.jCheckBoxSeleccionadosTipoMoneda, this.gridBagConstraintsTipoMoneda);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoMoneda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoneda.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoMoneda.add(this.jPanelParametrosAuxiliar3TipoMoneda, this.gridBagConstraintsTipoMoneda);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoneda.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMoneda.add(this.jComboBoxTiposRelacionesTipoMoneda, this.gridBagConstraintsTipoMoneda);
				
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoneda.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMoneda.add(this.jComboBoxTiposAccionesTipoMoneda, this.gridBagConstraintsTipoMoneda);
	
				
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoMoneda.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoMoneda.add(this.jTextFieldValorCampoGeneralTipoMoneda, this.gridBagConstraintsTipoMoneda);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoMoneda = new GridBagLayout();

			this.jScrollPanelDatosTipoMoneda.setLayout(gridaBagLayoutDatosTipoMoneda);
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoneda.gridy = 0;
			this.gridBagConstraintsTipoMoneda.gridx = 0;
			
			this.jScrollPanelDatosTipoMoneda.add(this.jTableDatosTipoMoneda, this.gridBagConstraintsTipoMoneda);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoMoneda.setViewportView(this.jTableDatosTipoMoneda);
		this.jTableDatosTipoMoneda.setFillsViewportHeight(true);
		this.jTableDatosTipoMoneda.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoMoneda= new GridBagLayout();
		this.jPanelAccionesTipoMoneda.setLayout(gridaBagLayoutAccionesTipoMoneda);
		
		
		/*	
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoneda.gridy = 0;
		this.gridBagConstraintsTipoMoneda.gridx = 0;
			
		this.jPanelAccionesTipoMoneda.add(this.jButtonNuevoTipoMoneda, this.gridBagConstraintsTipoMoneda);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoMoneda= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoMoneda.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoMoneda.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoMoneda.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoMoneda.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoMoneda.setLayout(gridaBagLayoutBusquedaPorNombreTipoMoneda);

		gridBagConstraintsTipoMoneda = new GridBagConstraints();
		gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMoneda.gridy = 0;
		gridBagConstraintsTipoMoneda.gridx = 0;
		jPanelBusquedaPorNombreTipoMoneda.add(jLabelnombreBusquedaPorNombreTipoMoneda, gridBagConstraintsTipoMoneda);

		gridBagConstraintsTipoMoneda = new GridBagConstraints();
		gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMoneda.gridy = 0;
		gridBagConstraintsTipoMoneda.gridx = 1;
		jPanelBusquedaPorNombreTipoMoneda.add(jTextFieldnombreBusquedaPorNombreTipoMoneda, gridBagConstraintsTipoMoneda);

		gridBagConstraintsTipoMoneda = new GridBagConstraints();
		gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMoneda.gridy = 1;
		gridBagConstraintsTipoMoneda.gridx =1;
		jPanelBusquedaPorNombreTipoMoneda.add(jButtonBusquedaPorNombreTipoMoneda, gridBagConstraintsTipoMoneda);

		jTabbedPaneBusquedasTipoMoneda.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTipoMoneda);
		jTabbedPaneBusquedasTipoMoneda.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorSiglaTipoMoneda= new GridBagLayout();
		gridaBagLayoutBusquedaPorSiglaTipoMoneda.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorSiglaTipoMoneda.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorSiglaTipoMoneda.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorSiglaTipoMoneda.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorSiglaTipoMoneda.setLayout(gridaBagLayoutBusquedaPorSiglaTipoMoneda);

		gridBagConstraintsTipoMoneda = new GridBagConstraints();
		gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMoneda.gridy = 0;
		gridBagConstraintsTipoMoneda.gridx = 0;
		jPanelBusquedaPorSiglaTipoMoneda.add(jLabelsiglaBusquedaPorSiglaTipoMoneda, gridBagConstraintsTipoMoneda);

		gridBagConstraintsTipoMoneda = new GridBagConstraints();
		gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMoneda.gridy = 0;
		gridBagConstraintsTipoMoneda.gridx = 1;
		jPanelBusquedaPorSiglaTipoMoneda.add(jTextFieldsiglaBusquedaPorSiglaTipoMoneda, gridBagConstraintsTipoMoneda);

		gridBagConstraintsTipoMoneda = new GridBagConstraints();
		gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMoneda.gridy = 1;
		gridBagConstraintsTipoMoneda.gridx =1;
		jPanelBusquedaPorSiglaTipoMoneda.add(jButtonBusquedaPorSiglaTipoMoneda, gridBagConstraintsTipoMoneda);

		jTabbedPaneBusquedasTipoMoneda.addTab("2.-Por Sigla ", jPanelBusquedaPorSiglaTipoMoneda);
		jTabbedPaneBusquedasTipoMoneda.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorSimboloTipoMoneda= new GridBagLayout();
		gridaBagLayoutBusquedaPorSimboloTipoMoneda.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorSimboloTipoMoneda.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorSimboloTipoMoneda.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorSimboloTipoMoneda.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorSimboloTipoMoneda.setLayout(gridaBagLayoutBusquedaPorSimboloTipoMoneda);

		gridBagConstraintsTipoMoneda = new GridBagConstraints();
		gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMoneda.gridy = 0;
		gridBagConstraintsTipoMoneda.gridx = 0;
		jPanelBusquedaPorSimboloTipoMoneda.add(jLabelsimboloBusquedaPorSimboloTipoMoneda, gridBagConstraintsTipoMoneda);

		gridBagConstraintsTipoMoneda = new GridBagConstraints();
		gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMoneda.gridy = 0;
		gridBagConstraintsTipoMoneda.gridx = 1;
		jPanelBusquedaPorSimboloTipoMoneda.add(jTextFieldsimboloBusquedaPorSimboloTipoMoneda, gridBagConstraintsTipoMoneda);

		gridBagConstraintsTipoMoneda = new GridBagConstraints();
		gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoMoneda.gridy = 1;
		gridBagConstraintsTipoMoneda.gridx =1;
		jPanelBusquedaPorSimboloTipoMoneda.add(jButtonBusquedaPorSimboloTipoMoneda, gridBagConstraintsTipoMoneda);

		jTabbedPaneBusquedasTipoMoneda.addTab("3.-Por Simbolo ", jPanelBusquedaPorSimboloTipoMoneda);
		jTabbedPaneBusquedasTipoMoneda.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMoneda = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMoneda);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomonedaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();						
			this.gridBagConstraintsTipoMoneda.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMoneda.gridx = 0;		
			//this.gridBagConstraintsTipoMoneda.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMoneda.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoMoneda, this.gridBagConstraintsTipoMoneda);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoMoneda.gridx = 0;		
		//this.gridBagConstraintsTipoMoneda.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoMoneda.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoMoneda);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoMoneda.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMoneda.gridx = 0;		
			this.gridBagConstraintsTipoMoneda.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoneda.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoMoneda.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoMoneda, this.gridBagConstraintsTipoMoneda);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoneda.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoMoneda, this.gridBagConstraintsTipoMoneda);								
		
		
		/*
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoneda.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoMoneda, this.gridBagConstraintsTipoMoneda);
		*/		
		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMoneda.gridx =0;
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMoneda.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMoneda, this.gridBagConstraintsTipoMoneda);
				
		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoneda.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoMoneda, this.gridBagConstraintsTipoMoneda);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoMonedaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoMoneda= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMoneda = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoMoneda.setLayout(gridaBagLayoutBusquedasParametrosTipoMoneda);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoMoneda=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMoneda.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMoneda.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMoneda.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoneda.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMoneda, this.gridBagConstraintsTipoMoneda);
			
			
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoneda.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMoneda, this.gridBagConstraintsTipoMoneda);
		
			
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoneda.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMoneda, this.gridBagConstraintsTipoMoneda);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoMoneda;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoMoneda() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoMoneda = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoMoneda.setName("jPanelReporteDinamicoTipoMoneda"); 
		
		this.jPanelReporteDinamicoTipoMoneda.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMoneda.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoMoneda.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoMoneda.setLayout(gridaBagLayoutReporteDinamicoTipoMoneda);
		
		
		this.jInternalFrameReporteDinamicoTipoMoneda= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoMoneda = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMoneda= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoMoneda.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoMoneda.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoMoneda.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoMoneda.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoMoneda.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoMoneda.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoMoneda.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoMoneda.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoMoneda.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMoneda.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoMoneda.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Monedas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoMoneda = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoMoneda.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoneda.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMoneda.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoMoneda.add(this.jLabelColumnasSelectReporteTipoMoneda, this.gridBagConstraintsTipoMoneda);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoMoneda = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoMoneda.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoMoneda.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoMoneda.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMoneda.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoMoneda.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoMoneda=new JScrollPane(this.jListColumnasSelectReporteTipoMoneda);
			
			this.jScrollColumnasSelectReporteTipoMoneda.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMoneda.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoMoneda.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoneda.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMoneda.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoMoneda.add(this.jListColumnasSelectReporteTipoMoneda, this.gridBagConstraintsTipoMoneda);
		this.jPanelReporteDinamicoTipoMoneda.add(this.jScrollColumnasSelectReporteTipoMoneda, this.gridBagConstraintsTipoMoneda);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoMoneda = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoMoneda.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoneda.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMoneda.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoMoneda.add(this.jLabelRelacionesSelectReporteTipoMoneda, this.gridBagConstraintsTipoMoneda);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoMoneda = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoMoneda.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoMoneda.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoMoneda.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMoneda.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoMoneda.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoMoneda=new JScrollPane(this.jListRelacionesSelectReporteTipoMoneda);
			
			this.jScrollRelacionesSelectReporteTipoMoneda.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMoneda.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoMoneda.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoneda.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMoneda.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoMoneda.add(this.jListRelacionesSelectReporteTipoMoneda, this.gridBagConstraintsTipoMoneda);
		this.jPanelReporteDinamicoTipoMoneda.add(this.jScrollRelacionesSelectReporteTipoMoneda, this.gridBagConstraintsTipoMoneda);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoMoneda = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoMoneda = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoMoneda = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoMoneda = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoMoneda.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoMoneda.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMoneda.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoMoneda.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoMoneda = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMoneda.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoMoneda.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMoneda.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoMoneda.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoMoneda = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoMoneda.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoneda.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMoneda.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMoneda.add(this.jLabelGenerarExcelReporteDinamicoTipoMoneda, this.gridBagConstraintsTipoMoneda);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoMoneda = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoMoneda.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoMoneda,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoMoneda.setToolTipText("Generar EXCEL"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		//this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoMoneda.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoMoneda.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoMoneda.add(this.jButtonGenerarExcelReporteDinamicoTipoMoneda, this.gridBagConstraintsTipoMoneda);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoneda.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMoneda.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMoneda.add(this.jComboBoxTiposReportesDinamicoTipoMoneda, this.gridBagConstraintsTipoMoneda);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoMoneda = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoMoneda.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoneda.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoMoneda.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoMoneda.add(this.jLabelTiposArchivoReporteDinamicoTipoMoneda, this.gridBagConstraintsTipoMoneda);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoneda.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMoneda.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMoneda.add(this.jComboBoxTiposArchivosReportesDinamicoTipoMoneda, this.gridBagConstraintsTipoMoneda);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoMoneda = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoMoneda.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoMoneda,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoMoneda.setToolTipText("Generar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoneda.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMoneda.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMoneda.add(this.jButtonGenerarReporteDinamicoTipoMoneda, this.gridBagConstraintsTipoMoneda);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoMoneda = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoMoneda.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoMoneda,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoMoneda.setToolTipText("Cancelar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoneda.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoMoneda.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoMoneda.add(this.jButtonCerrarReporteDinamicoTipoMoneda, this.gridBagConstraintsTipoMoneda);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoMoneda = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoMoneda= new JScrollPane(jPanelReporteDinamicoTipoMoneda,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoMoneda.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMoneda.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoMoneda.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Monedas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoMoneda.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoMoneda.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoMoneda.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoMoneda);
		this.jInternalFrameReporteDinamicoTipoMoneda.getContentPane().add(this.jScrollPanelReporteDinamicoTipoMoneda, this.gridBagConstraintsTipoMoneda);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoMoneda() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoMoneda = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoMoneda.setName("jPanelImportacionTipoMoneda"); 
		
		this.jPanelImportacionTipoMoneda.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMoneda.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoMoneda.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoMoneda.setLayout(gridaBagLayoutImportacionTipoMoneda);
		
		
		this.jInternalFrameImportacionTipoMoneda= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoMoneda= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoMoneda = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoMoneda= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoMoneda.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMoneda.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMoneda.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoMoneda.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMoneda.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMoneda.setResizable(true);
	    this.jInternalFrameImportacionTipoMoneda.setClosable(true);
	    this.jInternalFrameImportacionTipoMoneda.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoMoneda.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoMoneda.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoMoneda.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoMoneda.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoMoneda.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoMoneda.setResizable(true);
	    this.jInternalFrameImportacionTipoMoneda.setClosable(true);
	    this.jInternalFrameImportacionTipoMoneda.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoMoneda.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMoneda.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoMoneda.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Monedas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoMoneda = new JLabelMe();

		this.jLabelArchivoImportacionTipoMoneda.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoneda.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMoneda.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMoneda.add(this.jLabelArchivoImportacionTipoMoneda, this.gridBagConstraintsTipoMoneda);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoMoneda = new JFileChooser();		
		this.jFileChooserImportacionTipoMoneda.setToolTipText("ESCOGER ARCHIVO"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoMoneda = new JButtonMe();
		this.jButtonAbrirImportacionTipoMoneda.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoMoneda,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoMoneda.setToolTipText("Generar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoneda.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMoneda.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMoneda.add(this.jButtonAbrirImportacionTipoMoneda, this.gridBagConstraintsTipoMoneda);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoMoneda = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoMoneda.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoMoneda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMoneda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoMoneda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoneda.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoMoneda.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoMoneda.add(this.jLabelPathArchivoImportacionTipoMoneda, this.gridBagConstraintsTipoMoneda);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoMoneda=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoMoneda.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMoneda.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoMoneda.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoneda.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMoneda.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMoneda.add(this.jTextFieldPathArchivoImportacionTipoMoneda, this.gridBagConstraintsTipoMoneda);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoMoneda = new JButtonMe();
		this.jButtonGenerarImportacionTipoMoneda.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoMoneda,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoMoneda.setToolTipText("Generar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoneda.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMoneda.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMoneda.add(this.jButtonGenerarImportacionTipoMoneda, this.gridBagConstraintsTipoMoneda);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoMoneda = new JButtonMe();
		this.jButtonCerrarImportacionTipoMoneda.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoMoneda,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoMoneda.setToolTipText("Cancelar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoneda.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoMoneda.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoMoneda.add(this.jButtonCerrarImportacionTipoMoneda, this.gridBagConstraintsTipoMoneda);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoMoneda = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoMoneda= new JScrollPane(jPanelImportacionTipoMoneda,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
		this.gridBagConstraintsTipoMoneda.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoMoneda.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoMoneda.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoMoneda.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoMoneda);
		this.jInternalFrameImportacionTipoMoneda.getContentPane().add(this.jScrollPanelImportacionTipoMoneda, this.gridBagConstraintsTipoMoneda);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoMoneda(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoMoneda = new JButtonMe();
			this.jButtonAbrirOrderByTipoMoneda.setText("Orden");
			this.jButtonAbrirOrderByTipoMoneda.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoMoneda,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoMoneda";
			inputMap = this.jButtonAbrirOrderByTipoMoneda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoMoneda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoMoneda"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoMoneda = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoMoneda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoMoneda.setName("jPanelOrderByTipoMoneda"); 
			
			this.jPanelOrderByTipoMoneda.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMoneda.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoMoneda.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoMoneda.setLayout(gridaBagLayoutOrderByTipoMoneda);
			
			
			this.jTableDatosTipoMonedaOrderBy = new JTableMe();        
			this.jTableDatosTipoMonedaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoMonedaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoMonedaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoMonedaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoMonedaOrderBy.setViewportView(this.jTableDatosTipoMonedaOrderBy);
			this.jTableDatosTipoMonedaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoMonedaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoMoneda= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoMoneda= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoMoneda = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoMoneda= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoMoneda.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoMoneda.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoMoneda.setTitle("Orden");
			this.jInternalFrameOrderByTipoMoneda.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoMoneda.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoMoneda.setResizable(true);
			this.jInternalFrameOrderByTipoMoneda.setClosable(true);
			this.jInternalFrameOrderByTipoMoneda.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoMoneda.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMoneda.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoMoneda.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Monedas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoMoneda.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoMoneda.ipady =150;
				
			this.jPanelOrderByTipoMoneda.add(jScrollPanelDatosTipoMonedaOrderBy, this.gridBagConstraintsTipoMoneda);//this.jTableDatosTipoMonedaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoMoneda = new JButtonMe();
			this.jButtonCerrarOrderByTipoMoneda.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoMoneda,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoMoneda.setToolTipText("Cancelar"+" "+TipoMonedaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoMoneda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoneda.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoMoneda.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoMoneda.add(this.jButtonCerrarOrderByTipoMoneda, this.gridBagConstraintsTipoMoneda);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoMoneda = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoMoneda= new JScrollPane(jPanelOrderByTipoMoneda,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoMoneda = new GridBagConstraints();
			this.gridBagConstraintsTipoMoneda.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoMoneda.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoMoneda.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoMoneda.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoMoneda.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoMoneda);
			
			this.jInternalFrameOrderByTipoMoneda.getContentPane().add(this.jScrollPanelOrderByTipoMoneda, this.gridBagConstraintsTipoMoneda);			
		
		} else {
			this.jButtonAbrirOrderByTipoMoneda = new JButtonMe();
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
		int iWidthTableCalculado=0;//1230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipomonedaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoMoneda.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoMoneda.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoMoneda.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoMoneda.getRowHeight();//TipoMonedaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoMonedaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMoneda.isSelected()) {
					iHeightTable=TipoMonedaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMonedaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMonedaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoMonedaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoMoneda.isSelected()) {
					iHeightTable=TipoMonedaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoMonedaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoMonedaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoMoneda.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMoneda.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoMoneda.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoMoneda.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMoneda.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoMoneda.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoMoneda!=null && this.jInternalFrameOrderByTipoMoneda.getjTableDatosOrderBy()!=null) {
			//if(!this.tipomonedaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoMoneda.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoMoneda.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoMoneda.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoMoneda.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoMoneda.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoMoneda.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoMoneda.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoMoneda.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMoneda.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoMoneda.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipomonedaLogic.getTipoMonedas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomonedas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoMoneda> TraerTipoMonedaBeans(List<TipoMoneda> tipomonedas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoMoneda tipomoneda:tipomonedas) {
					
				if(!(TipoMonedaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoMonedaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipomoneda.setsDetalleGeneralEntityReporte(TipoMonedaConstantesFunciones.getTipoMonedaDescripcion(tipomoneda));
										
					tipomoneda.setesta_activo_descripcion(TipoMonedaConstantesFunciones.getesta_activoDescripcion(tipomoneda));	
					
					

					if(tipomoneda.getParametroContabilidadDefectos()!=null && Funciones.existeClass(classes,ParametroContabilidadDefecto.class)) {
						try{tipomoneda.setparametrocontabilidaddefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroContabilidadDefectoJInternalFrame.TraerParametroContabilidadDefectoBeans(tipomoneda.getParametroContabilidadDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipomoneda.setsDetalleGeneralEntityReporte(tipomoneda.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipomonedabeans.add(tipomonedabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipomonedas;
    }
	//PARA REPORTES FIN
}
