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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.facturacion.util.TipoLlamadaConstantesFunciones;

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
public class TipoLlamadaJInternalFrame extends TipoLlamadaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoLlamada;
	
	protected JMenuBar jmenuBarTipoLlamada;
	
	protected JMenu jmenuTipoLlamada;
	protected JMenu jmenuDatosTipoLlamada;
	protected JMenu jmenuArchivoTipoLlamada;
	protected JMenu jmenuAccionesTipoLlamada;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoLlamada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoLlamada;	
	protected GridBagConstraints gridBagConstraintsTipoLlamada;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoLlamadaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoLlamada;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoLlamada;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoLlamada;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoLlamadaSessionBean tipollamadaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoLlamada> tipollamadas;		
	public List<TipoLlamada> tipollamadasEliminados;	
	public List<TipoLlamada> tipollamadasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoLlamada;		
	protected JButton jButtonAbrirOrderByTipoLlamada;
	
	
	//protected JPanel jPanelOrderByTipoLlamada;
	//public JScrollPane jScrollPanelOrderByTipoLlamada;	
	//protected JButton jButtonCerrarOrderByTipoLlamada;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoLlamadaLogic tipollamadaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoLlamada;
	public JScrollPane jScrollPanelDatosEdicionTipoLlamada;
	public JScrollPane jScrollPanelDatosGeneralTipoLlamada;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoLlamadaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoLlamada;
	//public JScrollPane jScrollPanelImportacionTipoLlamada;
	
	
	
	protected JPanel jPanelAccionesTipoLlamada;
	
    protected JPanel jPanelPaginacionTipoLlamada;
    protected JPanel jPanelParametrosReportesTipoLlamada;
	protected JPanel jPanelParametrosReportesAccionesTipoLlamada;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoLlamada;
	protected JPanel jPanelParametrosAuxiliar2TipoLlamada;
	protected JPanel jPanelParametrosAuxiliar3TipoLlamada;
	protected JPanel jPanelParametrosAuxiliar4TipoLlamada;
	//protected JPanel jPanelParametrosAuxiliar5TipoLlamada;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoLlamada;
	//protected JPanel jPanelImportacionTipoLlamada;
	
	
	public JTable jTableDatosTipoLlamada;
	
	
	
	//public JTable jTableDatosTipoLlamadaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoLlamada;
	protected JButton jButtonDuplicarTipoLlamada;
	protected JButton jButtonCopiarTipoLlamada;
	protected JButton jButtonVerFormTipoLlamada;
	protected JButton jButtonNuevoRelacionesTipoLlamada;
	protected JButton jButtonModificarTipoLlamada;
	
    protected JButton jButtonGuardarCambiosTablaTipoLlamada;
	protected JButton jButtonCerrarTipoLlamada;
	
	
	protected JButton jButtonRecargarInformacionTipoLlamada;
	protected JButton jButtonProcesarInformacionTipoLlamada;
	
	
	protected JButton jButtonAnterioresTipoLlamada;
	protected JButton jButtonSiguientesTipoLlamada;
	protected JButton jButtonNuevoGuardarCambiosTipoLlamada;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoLlamada;
	//protected JButton jButtonCerrarReporteDinamicoTipoLlamada;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoLlamada;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoLlamada;
	//protected JButton jButtonGenerarImportacionTipoLlamada;
	//protected JButton jButtonCerrarImportacionTipoLlamada;
	//protected JFileChooser jFileChooserImportacionTipoLlamada;
	//protected File fileImportacionTipoLlamada;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoLlamada;
	protected JButton jButtonDuplicarToolBarTipoLlamada;
	protected JButton jButtonNuevoRelacionesToolBarTipoLlamada;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoLlamada;
	protected JButton jButtonCopiarToolBarTipoLlamada;
	protected JButton jButtonVerFormToolBarTipoLlamada;
	public JButton jButtonGuardarCambiosTablaToolBarTipoLlamada;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoLlamada;
	protected JButton jButtonCerrarToolBarTipoLlamada;
	
	protected JButton jButtonRecargarInformacionToolBarTipoLlamada;
	protected JButton jButtonProcesarInformacionToolBarTipoLlamada;
	protected JButton jButtonAnterioresToolBarTipoLlamada;
	protected JButton jButtonSiguientesToolBarTipoLlamada;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoLlamada;
	protected JButton jButtonAbrirOrderByToolBarTipoLlamada;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoLlamada;
	protected JMenuItem jMenuItemDuplicarTipoLlamada;
	protected JMenuItem jMenuItemNuevoRelacionesTipoLlamada;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoLlamada;
	protected JMenuItem jMenuItemCopiarTipoLlamada;
	protected JMenuItem jMenuItemVerFormTipoLlamada;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoLlamada;
	protected JMenuItem jMenuItemCerrarTipoLlamada;
	protected JMenuItem jMenuItemDetalleCerrarTipoLlamada;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoLlamada;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoLlamada;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoLlamada;
	protected JMenuItem jMenuItemProcesarInformacionTipoLlamada;
	protected JMenuItem jMenuItemAnterioresTipoLlamada;
	protected JMenuItem jMenuItemSiguientesTipoLlamada;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoLlamada;
	protected JMenuItem jMenuItemAbrirOrderByTipoLlamada;
	protected JMenuItem jMenuItemMostrarOcultarTipoLlamada;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoLlamada;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoLlamada;
	protected JCheckBox jCheckBoxSeleccionadosTipoLlamada;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoLlamada;
	protected JCheckBox jCheckBoxConGraficoReporteTipoLlamada;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoLlamada;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoLlamada;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoLlamada;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoLlamada;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoLlamada;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoLlamada;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoLlamada;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoLlamada;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoLlamada;
	protected JTextField jTextFieldValorCampoGeneralTipoLlamada;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoLlamada;
	//public JList<Reporte> jListColumnasSelectReporteTipoLlamada;
	//public JScrollPane jScrollColumnasSelectReporteTipoLlamada;
	
	//public JLabel jLabelRelacionesSelectReporteTipoLlamada;
	//public JList<Reporte> jListRelacionesSelectReporteTipoLlamada;
	//public JScrollPane jScrollRelacionesSelectReporteTipoLlamada;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoLlamada;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoLlamada;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoLlamada;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoLlamada;
	
		
	//public JLabel jLabelArchivoImportacionTipoLlamada;	
	//public JLabel jLabelPathArchivoImportacionTipoLlamada;
	//protected JTextField jTextFieldPathArchivoImportacionTipoLlamada;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoLlamada;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoLlamada;
	
	//public JLabel jLabelColumnaCategoriaValorTipoLlamada;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoLlamada;
	
	//public JLabel jLabelColumnasValoresGraficoTipoLlamada;
	//public JList<Reporte> jListColumnasValoresGraficoTipoLlamada;
	//public JScrollPane jScrollColumnasValoresGraficoTipoLlamada;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoLlamada;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoLlamada;	
	
	
	
	
	
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
	public TipoLlamadaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoLlamada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLlamadaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoLlamada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLlamadaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoLlamada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLlamadaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoLlamada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoLlamada)	{
		this.jButtonRecargarInformacionTipoLlamada = jButtonRecargarInformacionTipoLlamada;
	}
	
	public JButton getjButtonProcesarInformacionTipoLlamada() {
		return this.jButtonProcesarInformacionTipoLlamada;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoLlamada)	{
		this.jButtonProcesarInformacionTipoLlamada = jButtonProcesarInformacionTipoLlamada;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoLlamada() {
		return this.jButtonRecargarInformacionTipoLlamada;
	}
	
	
	public List<TipoLlamada> gettipollamadas() {
		return this.tipollamadas;
	}

	public void settipollamadas(List<TipoLlamada> tipollamadas) {
		this.tipollamadas = tipollamadas;
	}
	
	public List<TipoLlamada> gettipollamadasAux() {
		return this.tipollamadasAux;
	}

	public void settipollamadasAux(List<TipoLlamada> tipollamadasAux) {
		this.tipollamadasAux = tipollamadasAux;
	}
	
	public List<TipoLlamada> gettipollamadasEliminados() {
		return this.tipollamadasEliminados;
	}

	public void setTipoLlamadasEliminados(List<TipoLlamada> tipollamadasEliminados) {
		this.tipollamadasEliminados = tipollamadasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoLlamada() {
		return jComboBoxTiposSeleccionarTipoLlamada;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoLlamada(
			JComboBox jComboBoxTiposSeleccionarTipoLlamada) {
		this.jComboBoxTiposSeleccionarTipoLlamada = jComboBoxTiposSeleccionarTipoLlamada;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoLlamada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoLlamada.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoLlamada .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoLlamada() {
		return jTextFieldValorCampoGeneralTipoLlamada;
	}

	public void setjTextFieldValorCampoGeneralTipoLlamada(
			JTextField jTextFieldValorCampoGeneralTipoLlamada) {
		this.jTextFieldValorCampoGeneralTipoLlamada = jTextFieldValorCampoGeneralTipoLlamada;
	}

	public void setBorderResaltarValorCampoGeneralTipoLlamada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLlamada.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoLlamada .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoLlamada() {
		return this.jCheckBoxSeleccionarTodosTipoLlamada;
	}

	public void setjCheckBoxSeleccionarTodosTipoLlamada(
			JCheckBox jCheckBoxSeleccionarTodosTipoLlamada) {
		this.jCheckBoxSeleccionarTodosTipoLlamada = jCheckBoxSeleccionarTodosTipoLlamada;
	}

	public void setBorderResaltarSeleccionarTodosTipoLlamada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLlamada.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoLlamada .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoLlamada() {
		return this.jCheckBoxSeleccionadosTipoLlamada;
	}

	public void setjCheckBoxSeleccionadosTipoLlamada(
			JCheckBox jCheckBoxSeleccionadosTipoLlamada) {
		this.jCheckBoxSeleccionadosTipoLlamada = jCheckBoxSeleccionadosTipoLlamada;
	}
	
	public void setBorderResaltarSeleccionadosTipoLlamada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLlamada.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoLlamada .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoLlamada() {
		return this.jComboBoxTiposArchivosReportesTipoLlamada;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoLlamada(
			JComboBox jComboBoxTiposArchivosReportesTipoLlamada) {
		this.jComboBoxTiposArchivosReportesTipoLlamada = jComboBoxTiposArchivosReportesTipoLlamada;
	}

	public void setBorderResaltarTiposArchivosReportesTipoLlamada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLlamada.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoLlamada .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoLlamada() {
		return this.jComboBoxTiposReportesTipoLlamada;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoLlamada(
			JComboBox jComboBoxTiposReportesTipoLlamada) {
		this.jComboBoxTiposReportesTipoLlamada = jComboBoxTiposReportesTipoLlamada;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoLlamada() {
	//	return jComboBoxTiposReportesDinamicoTipoLlamada;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoLlamada(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoLlamada) {
	//	this.jComboBoxTiposReportesDinamicoTipoLlamada = jComboBoxTiposReportesDinamicoTipoLlamada;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoLlamada() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoLlamada;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoLlamada(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoLlamada) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoLlamada = jComboBoxTiposArchivosReportesDinamicoTipoLlamada;
	//}
	
	public void setBorderResaltarTiposReportesTipoLlamada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLlamada.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoLlamada .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoLlamada() {
		return this.jComboBoxTiposGraficosReportesTipoLlamada;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoLlamada(
			JComboBox jComboBoxTiposGraficosReportesTipoLlamada) {
		this.jComboBoxTiposGraficosReportesTipoLlamada = jComboBoxTiposGraficosReportesTipoLlamada;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoLlamada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLlamada.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoLlamada .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoLlamada() {
		return this.jComboBoxTiposPaginacionTipoLlamada;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoLlamada(
			JComboBox jComboBoxTiposPaginacionTipoLlamada) {
		this.jComboBoxTiposPaginacionTipoLlamada = jComboBoxTiposPaginacionTipoLlamada;
	}
	
	public void setBorderResaltarTiposPaginacionTipoLlamada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLlamada.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoLlamada .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoLlamada() {
		return this.jComboBoxTiposRelacionesTipoLlamada;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoLlamada() {
		return this.jComboBoxTiposAccionesTipoLlamada;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoLlamada(
			JComboBox jComboBoxTiposRelacionesTipoLlamada) {
		this.jComboBoxTiposRelacionesTipoLlamada = jComboBoxTiposRelacionesTipoLlamada;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoLlamada(
			JComboBox jComboBoxTiposAccionesTipoLlamada) {
		this.jComboBoxTiposAccionesTipoLlamada = jComboBoxTiposAccionesTipoLlamada;
	}
	
	public void setBorderResaltarTiposRelacionesTipoLlamada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLlamada.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoLlamada .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoLlamada() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoLlamada.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoLlamada .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoLlamada() {
	//	return jCheckBoxConGraficoDinamicoTipoLlamada;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoLlamada(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoLlamada) {
	//	this.jCheckBoxConGraficoDinamicoTipoLlamada = jCheckBoxConGraficoDinamicoTipoLlamada;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoLlamada() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoLlamada.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoLlamada .setBorder(borderResaltar);		
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
		this.tipollamadaSessionBean=new TipoLlamadaSessionBean();
		
		this.tipollamadaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipollamadaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipollamadaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoLlamadaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoLlamadaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoLlamadaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoLlamadaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoLlamadaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Llamada MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoLlamadaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoLlamada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoLlamada= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoLlamada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoLlamada,this.jTtoolBarTipoLlamada,
							"nuevo","nuevo","Nuevo"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoLlamada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoLlamada,this.jTtoolBarTipoLlamada,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoLlamada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoLlamada,this.jTtoolBarTipoLlamada,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoLlamada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoLlamada,this.jTtoolBarTipoLlamada,
							"duplicar","duplicar","Duplicar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoLlamada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoLlamada,this.jTtoolBarTipoLlamada,
							"copiar","copiar","Copiar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoLlamada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoLlamada,this.jTtoolBarTipoLlamada,
							"ver_form","ver_form","Ver"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoLlamada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoLlamada,this.jTtoolBarTipoLlamada,
							"recargar","recargar","Recargar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoLlamada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoLlamada,this.jTtoolBarTipoLlamada,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoLlamada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoLlamada,this.jTtoolBarTipoLlamada,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoLlamada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoLlamada,this.jTtoolBarTipoLlamada,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoLlamada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoLlamada,this.jTtoolBarTipoLlamada,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoLlamada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoLlamada,this.jTtoolBarTipoLlamada,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoLlamada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoLlamada,this.jTtoolBarTipoLlamada,
							"cerrar","cerrar","Salir"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoLlamada=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoLlamada;
			
				this.jButtonProcesarInformacionToolBarTipoLlamada=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoLlamada;
				
		//protected JButton jButtonModificarToolBarTipoLlamada;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoLlamada=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoLlamada=new JMenuMe("General");
		this.jmenuArchivoTipoLlamada=new JMenuMe("Archivo");
		this.jmenuAccionesTipoLlamada=new JMenuMe("Acciones");
		this.jmenuDatosTipoLlamada=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoLlamada= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoLlamada.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoLlamada,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoLlamada= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoLlamada.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoLlamada,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoLlamada= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoLlamada.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoLlamada,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoLlamada= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoLlamada.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoLlamada,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoLlamada= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoLlamada.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoLlamada,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoLlamada= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoLlamada.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoLlamada,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoLlamada= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoLlamada.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoLlamada,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoLlamada= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoLlamada.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoLlamada,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoLlamada= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoLlamada.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoLlamada,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoLlamada= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoLlamada.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoLlamada,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoLlamada= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoLlamada.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoLlamada,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoLlamada= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoLlamada.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoLlamada,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoLlamada= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoLlamada.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoLlamada,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoLlamada= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoLlamada.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoLlamada,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoLlamada= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoLlamada.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoLlamada,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoLlamada= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoLlamada.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoLlamada,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoLlamada= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoLlamada.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoLlamada,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoLlamada.add(this.jMenuItemCerrarTipoLlamada);
			
			this.jmenuAccionesTipoLlamada.add(this.jMenuItemNuevoTipoLlamada);
			this.jmenuAccionesTipoLlamada.add(this.jMenuItemNuevoGuardarCambiosTipoLlamada);
			this.jmenuAccionesTipoLlamada.add(this.jMenuItemNuevoRelacionesTipoLlamada);
			this.jmenuAccionesTipoLlamada.add(this.jMenuItemGuardarCambiosTablaTipoLlamada);		
			this.jmenuAccionesTipoLlamada.add(this.jMenuItemDuplicarTipoLlamada);		
			this.jmenuAccionesTipoLlamada.add(this.jMenuItemCopiarTipoLlamada);		
			this.jmenuAccionesTipoLlamada.add(this.jMenuItemVerFormTipoLlamada);		
			
			this.jmenuDatosTipoLlamada.add(this.jMenuItemRecargarInformacionTipoLlamada);				
			this.jmenuDatosTipoLlamada.add(this.jMenuItemAnterioresTipoLlamada);				
			this.jmenuDatosTipoLlamada.add(this.jMenuItemSiguientesTipoLlamada);				
			this.jmenuDatosTipoLlamada.add(this.jMenuItemAbrirOrderByTipoLlamada);				
			this.jmenuDatosTipoLlamada.add(this.jMenuItemMostrarOcultarTipoLlamada);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoLlamada.add(this.jMenuItemGuardarCambiosTipoLlamada);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoLlamada.add(this.jmenuArchivoTipoLlamada);		
			this.jmenuBarTipoLlamada.add(this.jmenuAccionesTipoLlamada);		
			this.jmenuBarTipoLlamada.add(this.jmenuDatosTipoLlamada);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoLlamada);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoLlamada() {
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
			//this.jInternalFrameDetalleTipoLlamada = new TipoLlamadaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Llamada DATOS");
			this.jInternalFrameDetalleFormTipoLlamada = new TipoLlamadaDetalleFormJInternalFrame(jDesktopPane,this.tipollamadaSessionBean.getConGuardarRelaciones(),this.tipollamadaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoLlamada = null;//new TipoLlamadaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoLlamada= new GridBagLayout();
		
		
		this.jTableDatosTipoLlamada = new JTableMe();      
		
		String sToolTipTipoLlamada="";
		sToolTipTipoLlamada=TipoLlamadaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoLlamada+="(Facturacion.TipoLlamada)";
		}
		
		if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoLlamada+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoLlamada.setToolTipText(sToolTipTipoLlamada);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoLlamada);
		this.jTableDatosTipoLlamada.setAutoCreateRowSorter(true);
		this.jTableDatosTipoLlamada.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoLlamada.setRowSelectionAllowed(true);
		this.jTableDatosTipoLlamada.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoLlamada,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoLlamada = new JButtonMe();
		this.jButtonDuplicarTipoLlamada = new JButtonMe();
		this.jButtonCopiarTipoLlamada = new JButtonMe();
		this.jButtonVerFormTipoLlamada = new JButtonMe();
		this.jButtonNuevoRelacionesTipoLlamada = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoLlamada = new JButtonMe();
		this.jButtonCerrarTipoLlamada = new JButtonMe();
		
		this.jScrollPanelDatosTipoLlamada = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoLlamada = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoLlamada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Llamada";
		
		if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Llamadas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoLlamada.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoLlamada.setToolTipText("Acciones");
        this.jPanelAccionesTipoLlamada.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoLlamada, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoLlamada, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoLlamada=new ReporteDinamicoJInternalFrame(TipoLlamadaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoLlamada();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoLlamada=new ImportacionJInternalFrame(TipoLlamadaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoLlamada();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoLlamada = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoLlamada.setText("Orden");
		this.jButtonAbrirOrderByTipoLlamada.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoLlamada,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoLlamada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoLlamada=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoLlamada,false,this);
			
			//this.cargarOrderByTipoLlamada(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoLlamada=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoLlamada,true,this);
			
			//this.cargarOrderByTipoLlamada(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoLlamada.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoLlamada.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoLlamada.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoLlamada.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoLlamada.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoLlamada.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoLlamada.setText("Nuevo");
		this.jButtonDuplicarTipoLlamada.setText("Duplicar");
		this.jButtonCopiarTipoLlamada.setText("Copiar");
		this.jButtonVerFormTipoLlamada.setText("Ver");
		this.jButtonNuevoRelacionesTipoLlamada.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoLlamada.setText("Guardar");
		this.jButtonCerrarTipoLlamada.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoLlamada,"nuevo_button","Nuevo",this.tipollamadaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoLlamada,"duplicar_button","Duplicar",this.tipollamadaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoLlamada,"copiar_button","Copiar",this.tipollamadaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoLlamada,"ver_form","Ver",this.tipollamadaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoLlamada,"nuevorelaciones_button","Nuevo Rel",this.tipollamadaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoLlamada,"guardarcambiostabla_button","Guardar",this.tipollamadaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoLlamada,"cerrar_button","Salir",this.tipollamadaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoLlamada.setToolTipText("Nuevo"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoLlamada.setToolTipText("Duplicar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoLlamada.setToolTipText("Copiar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoLlamada.setToolTipText("Ver"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoLlamada.setToolTipText("Nuevo Rel"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoLlamada.setToolTipText("Guardar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoLlamada.setToolTipText("Salir"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoLlamada";
		inputMap = this.jButtonNuevoTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoLlamada.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoLlamada"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoLlamada";
		inputMap = this.jButtonDuplicarTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoLlamada.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoLlamada"));
		
		//COPIAR
		sMapKey = "CopiarTipoLlamada";
		inputMap = this.jButtonCopiarTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoLlamada.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoLlamada"));
		
		//VEr FORM
		sMapKey = "VerFormTipoLlamada";
		inputMap = this.jButtonVerFormTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoLlamada.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoLlamada"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoLlamada";
		inputMap = this.jButtonNuevoRelacionesTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoLlamada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoLlamada"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoLlamada";
		inputMap = this.jButtonModificarTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoLlamada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoLlamada"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoLlamada";
		inputMap = this.jButtonCerrarTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoLlamada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoLlamada"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoLlamada";
		inputMap = this.jButtonGuardarCambiosTablaTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoLlamada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoLlamada"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoLlamada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoLlamada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoLlamada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoLlamada= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoLlamada= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoLlamada= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoLlamada= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoLlamada= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoLlamada.setName("jPanelParametrosReportesTipoLlamada"); 
		
		this.jPanelParametrosReportesAccionesTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoLlamada.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoLlamada.setName("jPanelParametrosReportesAccionesTipoLlamada"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoLlamada, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoLlamada, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoLlamada = new JButtonMe();
		this.jButtonRecargarInformacionTipoLlamada.setText("Recargar");
		this.jButtonRecargarInformacionTipoLlamada.setToolTipText("Recargar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoLlamada,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoLlamada = new JButtonMe();
		this.jButtonProcesarInformacionTipoLlamada.setText("Procesar");
		this.jButtonProcesarInformacionTipoLlamada.setToolTipText("Procesar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoLlamada.setVisible(false);
			
		this.jButtonProcesarInformacionTipoLlamada.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoLlamada.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoLlamada.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoLlamada = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoLlamada.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoLlamada.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoLlamada = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoLlamada.setText("TIPO");       
		this.jComboBoxTiposReportesTipoLlamada.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoLlamada = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoLlamada.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoLlamada.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoLlamada = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoLlamada.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoLlamada.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoLlamada = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoLlamada.setText("Accion");
		this.jComboBoxTiposRelacionesTipoLlamada.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoLlamada = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoLlamada.setText("Accion");
		this.jComboBoxTiposAccionesTipoLlamada.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoLlamada = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoLlamada.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoLlamada.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoLlamada=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoLlamada.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoLlamada.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoLlamada.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoLlamada = new JLabelMe();
		
		this.jLabelAccionesTipoLlamada.setText("Acciones");		
		this.jLabelAccionesTipoLlamada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoLlamada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoLlamada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoLlamada = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoLlamada.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoLlamada.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoLlamada = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoLlamada.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoLlamada.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoLlamada = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoLlamada.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoLlamada.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoLlamada = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoLlamada.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoLlamada.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoLlamada = new JButtonMe();
		//this.jButtonAnterioresTipoLlamada.setText("<<");
        this.jButtonAnterioresTipoLlamada.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoLlamada,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoLlamada = new JButtonMe();
		//this.jButtonSiguientesTipoLlamada.setText(">>");
        this.jButtonSiguientesTipoLlamada.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoLlamada,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoLlamada = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoLlamada.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoLlamada.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoLlamada,"nuevoguardarcambios_button","Nue",this.tipollamadaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoLlamada";
		inputMap = this.jButtonNuevoGuardarCambiosTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoLlamada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoLlamada"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoLlamada";
		inputMap = this.jButtonRecargarInformacionTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoLlamada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoLlamada"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoLlamada";
		inputMap = this.jButtonSiguientesTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoLlamada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoLlamada"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoLlamada";
		inputMap = this.jButtonAnterioresTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoLlamada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoLlamada"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoLlamada();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoLlamada.setMinimumSize(new Dimension(this.getWidth(),TipoLlamadaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoLlamadaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoLlamada.setMaximumSize(new Dimension(this.getWidth(),TipoLlamadaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoLlamadaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoLlamada.setPreferredSize(new Dimension(this.getWidth(),TipoLlamadaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoLlamadaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoLlamada = new GridBagLayout();

			this.jPanelPaginacionTipoLlamada.setLayout(gridaBagLayoutPaginacionTipoLlamada);						
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLlamada.gridy = 0;
			this.gridBagConstraintsTipoLlamada.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoLlamada.add(this.jButtonAnterioresTipoLlamada, this.gridBagConstraintsTipoLlamada);
					
						
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoLlamada.gridy = 0;
			
			this.jPanelPaginacionTipoLlamada.add(this.jButtonNuevoGuardarCambiosTipoLlamada, this.gridBagConstraintsTipoLlamada);
						
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoLlamada.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoLlamada.gridy = 0;
			this.jPanelPaginacionTipoLlamada.add(this.jButtonSiguientesTipoLlamada, this.gridBagConstraintsTipoLlamada);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLlamada.gridy = 1;
			this.gridBagConstraintsTipoLlamada.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoLlamada.add(this.jButtonNuevoTipoLlamada, this.gridBagConstraintsTipoLlamada);
						
			
			
			if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
				this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoLlamada.gridy = 1;
				this.gridBagConstraintsTipoLlamada.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoLlamada.add(this.jButtonGuardarCambiosTablaTipoLlamada, this.gridBagConstraintsTipoLlamada);
			}
			
			
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLlamada.gridy = 1;
			this.gridBagConstraintsTipoLlamada.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoLlamada.add(this.jButtonDuplicarTipoLlamada, this.gridBagConstraintsTipoLlamada);
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLlamada.gridy = 1;
			this.gridBagConstraintsTipoLlamada.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoLlamada.add(this.jButtonCopiarTipoLlamada, this.gridBagConstraintsTipoLlamada);
		
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLlamada.gridy = 1;
			this.gridBagConstraintsTipoLlamada.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoLlamada.add(this.jButtonVerFormTipoLlamada, this.gridBagConstraintsTipoLlamada);
		
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLlamada.gridy = 1;
			this.gridBagConstraintsTipoLlamada.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoLlamada.add(this.jButtonCerrarTipoLlamada, this.gridBagConstraintsTipoLlamada);
		
		
		
		this.jButtonRecargarInformacionTipoLlamada.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoLlamada.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoLlamada.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoLlamada.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoLlamada.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoLlamada.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoLlamada.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoLlamada.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoLlamada.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoLlamada.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoLlamada.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoLlamada.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoLlamada.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoLlamada.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoLlamada.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoLlamada.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoLlamada.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoLlamada.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoLlamada.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoLlamada.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoLlamada.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoLlamada.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoLlamada.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoLlamada.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoLlamada.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoLlamada.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoLlamada.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoLlamada.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoLlamada.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoLlamada.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoLlamada.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoLlamada.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoLlamada.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoLlamada.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoLlamada.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoLlamada.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoLlamada = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoLlamada = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoLlamada = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoLlamada = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoLlamada = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoLlamada = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoLlamada.setLayout(gridaBagParametrosReportesTipoLlamada);
			this.jPanelParametrosReportesAccionesTipoLlamada.setLayout(gridaBagParametrosReportesAccionesTipoLlamada);
			
			
			this.jPanelParametrosAuxiliar1TipoLlamada.setLayout(gridaBagParametrosAuxiliar1TipoLlamada);
			this.jPanelParametrosAuxiliar2TipoLlamada.setLayout(gridaBagParametrosAuxiliar2TipoLlamada);
			this.jPanelParametrosAuxiliar3TipoLlamada.setLayout(gridaBagParametrosAuxiliar3TipoLlamada);
			this.jPanelParametrosAuxiliar4TipoLlamada.setLayout(gridaBagParametrosAuxiliar4TipoLlamada);
			//this.jPanelParametrosAuxiliar5TipoLlamada.setLayout(gridaBagParametrosAuxiliar2TipoLlamada);			
			
			
			
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLlamada.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoLlamada.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLlamada.add(this.jButtonRecargarInformacionTipoLlamada, this.gridBagConstraintsTipoLlamada);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLlamada.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLlamada.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoLlamada.add(this.jComboBoxTiposPaginacionTipoLlamada, this.gridBagConstraintsTipoLlamada);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLlamada.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLlamada.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoLlamada.add(this.jCheckBoxConAltoMaximoTablaTipoLlamada, this.gridBagConstraintsTipoLlamada);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLlamada.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLlamada.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoLlamada.add(this.jComboBoxTiposArchivosReportesTipoLlamada, this.gridBagConstraintsTipoLlamada);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLlamada.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLlamada.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLlamada.add(this.jPanelParametrosAuxiliar1TipoLlamada, this.gridBagConstraintsTipoLlamada);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLlamada.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoLlamada.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoLlamada.add(this.jComboBoxTiposReportesTipoLlamada, this.gridBagConstraintsTipoLlamada);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLlamada.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLlamada.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLlamada.add(this.jPanelParametrosAuxiliar4TipoLlamada, this.gridBagConstraintsTipoLlamada);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLlamada.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLlamada.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLlamada.add(this.jComboBoxTiposReportesTipoLlamada, this.gridBagConstraintsTipoLlamada);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLlamada.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLlamada.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoLlamada.add(this.jCheckBoxGenerarReporteTipoLlamada, this.gridBagConstraintsTipoLlamada);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLlamada.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLlamada.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLlamada.add(this.jPanelParametrosAuxiliar2TipoLlamada, this.gridBagConstraintsTipoLlamada);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLlamada.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoLlamada.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoLlamada.add(this.jLabelAccionesTipoLlamada, this.gridBagConstraintsTipoLlamada);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
				this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoLlamada.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoLlamada.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoLlamada.add(this.jButtonAbrirOrderByTipoLlamada, this.gridBagConstraintsTipoLlamada);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoLlamada.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLlamada.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLlamada.add(this.jComboBoxTiposSeleccionarTipoLlamada, this.gridBagConstraintsTipoLlamada);			
			
			
			/*
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLlamada.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoLlamada.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoLlamada.add(this.jCheckBoxSeleccionarTodosTipoLlamada, this.gridBagConstraintsTipoLlamada);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLlamada.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoLlamada.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoLlamada.add(this.jCheckBoxSeleccionarTodosTipoLlamada, this.gridBagConstraintsTipoLlamada);															
				
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLlamada.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoLlamada.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoLlamada.add(this.jCheckBoxSeleccionadosTipoLlamada, this.gridBagConstraintsTipoLlamada);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoLlamada.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLlamada.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoLlamada.add(this.jPanelParametrosAuxiliar3TipoLlamada, this.gridBagConstraintsTipoLlamada);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLlamada.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLlamada.add(this.jComboBoxTiposRelacionesTipoLlamada, this.gridBagConstraintsTipoLlamada);
				
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoLlamada.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoLlamada.add(this.jComboBoxTiposAccionesTipoLlamada, this.gridBagConstraintsTipoLlamada);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoLlamada = new GridBagLayout();

			this.jScrollPanelDatosTipoLlamada.setLayout(gridaBagLayoutDatosTipoLlamada);
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLlamada.gridy = 0;
			this.gridBagConstraintsTipoLlamada.gridx = 0;
			
			this.jScrollPanelDatosTipoLlamada.add(this.jTableDatosTipoLlamada, this.gridBagConstraintsTipoLlamada);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoLlamada.setViewportView(this.jTableDatosTipoLlamada);
		this.jTableDatosTipoLlamada.setFillsViewportHeight(true);
		this.jTableDatosTipoLlamada.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoLlamada= new GridBagLayout();
		this.jPanelAccionesTipoLlamada.setLayout(gridaBagLayoutAccionesTipoLlamada);
		
		
		/*	
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLlamada.gridy = 0;
		this.gridBagConstraintsTipoLlamada.gridx = 0;
			
		this.jPanelAccionesTipoLlamada.add(this.jButtonNuevoTipoLlamada, this.gridBagConstraintsTipoLlamada);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoLlamada = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoLlamada);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipollamadaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();						
			this.gridBagConstraintsTipoLlamada.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoLlamada.gridx = 0;		
			//this.gridBagConstraintsTipoLlamada.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoLlamada.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoLlamada, this.gridBagConstraintsTipoLlamada);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoLlamada.gridx = 0;		
		//this.gridBagConstraintsTipoLlamada.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoLlamada.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoLlamada);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLlamada.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoLlamada, this.gridBagConstraintsTipoLlamada);								
		
		
		/*
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLlamada.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoLlamada, this.gridBagConstraintsTipoLlamada);
		*/		
		
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoLlamada.gridx =0;
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoLlamada.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoLlamada, this.gridBagConstraintsTipoLlamada);
				
		
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLlamada.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoLlamada, this.gridBagConstraintsTipoLlamada);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoLlamadaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoLlamada= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoLlamada = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoLlamada.setLayout(gridaBagLayoutBusquedasParametrosTipoLlamada);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoLlamada=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoLlamada.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoLlamada.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoLlamada.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLlamada.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoLlamada, this.gridBagConstraintsTipoLlamada);
			
			
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLlamada.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoLlamada, this.gridBagConstraintsTipoLlamada);
		
			
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoLlamada.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoLlamada, this.gridBagConstraintsTipoLlamada);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoLlamada;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoLlamada() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoLlamada = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoLlamada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoLlamada.setName("jPanelReporteDinamicoTipoLlamada"); 
		
		this.jPanelReporteDinamicoTipoLlamada.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoLlamada.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoLlamada.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoLlamada.setLayout(gridaBagLayoutReporteDinamicoTipoLlamada);
		
		
		this.jInternalFrameReporteDinamicoTipoLlamada= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoLlamada = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoLlamada= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoLlamada.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoLlamada.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoLlamada.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoLlamada.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoLlamada.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoLlamada.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoLlamada.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoLlamada.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoLlamada.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoLlamada.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoLlamada.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Llamadas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoLlamada = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoLlamada.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoLlamada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoLlamada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoLlamada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLlamada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLlamada.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoLlamada.add(this.jLabelColumnasSelectReporteTipoLlamada, this.gridBagConstraintsTipoLlamada);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoLlamada = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoLlamada.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoLlamada.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoLlamada.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoLlamada.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoLlamada.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoLlamada=new JScrollPane(this.jListColumnasSelectReporteTipoLlamada);
			
			this.jScrollColumnasSelectReporteTipoLlamada.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoLlamada.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoLlamada.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLlamada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLlamada.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoLlamada.add(this.jListColumnasSelectReporteTipoLlamada, this.gridBagConstraintsTipoLlamada);
		this.jPanelReporteDinamicoTipoLlamada.add(this.jScrollColumnasSelectReporteTipoLlamada, this.gridBagConstraintsTipoLlamada);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoLlamada = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoLlamada.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoLlamada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoLlamada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoLlamada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoLlamada = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoLlamada.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoLlamada.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoLlamada.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoLlamada.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoLlamada.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoLlamada=new JScrollPane(this.jListRelacionesSelectReporteTipoLlamada);
			
			this.jScrollRelacionesSelectReporteTipoLlamada.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoLlamada.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoLlamada.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoLlamada = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoLlamada = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoLlamada = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoLlamada = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoLlamada.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoLlamada.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoLlamada.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoLlamada.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoLlamada = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoLlamada.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoLlamada.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoLlamada.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoLlamada.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoLlamada = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoLlamada.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoLlamada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoLlamada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoLlamada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLlamada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLlamada.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoLlamada.add(this.jLabelGenerarExcelReporteDinamicoTipoLlamada, this.gridBagConstraintsTipoLlamada);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoLlamada = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoLlamada.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoLlamada,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoLlamada.setToolTipText("Generar EXCEL"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		//this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoLlamada.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoLlamada.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoLlamada.add(this.jButtonGenerarExcelReporteDinamicoTipoLlamada, this.gridBagConstraintsTipoLlamada);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLlamada.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoLlamada.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoLlamada.add(this.jComboBoxTiposReportesDinamicoTipoLlamada, this.gridBagConstraintsTipoLlamada);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoLlamada = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoLlamada.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoLlamada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoLlamada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoLlamada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLlamada.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoLlamada.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoLlamada.add(this.jLabelTiposArchivoReporteDinamicoTipoLlamada, this.gridBagConstraintsTipoLlamada);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLlamada.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoLlamada.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoLlamada.add(this.jComboBoxTiposArchivosReportesDinamicoTipoLlamada, this.gridBagConstraintsTipoLlamada);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoLlamada = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoLlamada.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoLlamada,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoLlamada.setToolTipText("Generar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLlamada.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoLlamada.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoLlamada.add(this.jButtonGenerarReporteDinamicoTipoLlamada, this.gridBagConstraintsTipoLlamada);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoLlamada = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoLlamada.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoLlamada,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoLlamada.setToolTipText("Cancelar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLlamada.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoLlamada.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoLlamada.add(this.jButtonCerrarReporteDinamicoTipoLlamada, this.gridBagConstraintsTipoLlamada);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoLlamada = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoLlamada= new JScrollPane(jPanelReporteDinamicoTipoLlamada,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoLlamada.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoLlamada.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoLlamada.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Llamadas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoLlamada.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoLlamada.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoLlamada.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoLlamada);
		this.jInternalFrameReporteDinamicoTipoLlamada.getContentPane().add(this.jScrollPanelReporteDinamicoTipoLlamada, this.gridBagConstraintsTipoLlamada);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoLlamada() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoLlamada = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoLlamada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoLlamada.setName("jPanelImportacionTipoLlamada"); 
		
		this.jPanelImportacionTipoLlamada.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoLlamada.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoLlamada.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoLlamada.setLayout(gridaBagLayoutImportacionTipoLlamada);
		
		
		this.jInternalFrameImportacionTipoLlamada= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoLlamada= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoLlamada = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoLlamada= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoLlamada.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoLlamada.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoLlamada.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoLlamada.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoLlamada.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoLlamada.setResizable(true);
	    this.jInternalFrameImportacionTipoLlamada.setClosable(true);
	    this.jInternalFrameImportacionTipoLlamada.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoLlamada.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoLlamada.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoLlamada.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoLlamada.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoLlamada.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoLlamada.setResizable(true);
	    this.jInternalFrameImportacionTipoLlamada.setClosable(true);
	    this.jInternalFrameImportacionTipoLlamada.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoLlamada.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoLlamada.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoLlamada.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Llamadas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoLlamada = new JLabelMe();

		this.jLabelArchivoImportacionTipoLlamada.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoLlamada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoLlamada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoLlamada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLlamada.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoLlamada.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoLlamada.add(this.jLabelArchivoImportacionTipoLlamada, this.gridBagConstraintsTipoLlamada);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoLlamada = new JFileChooser();		
		this.jFileChooserImportacionTipoLlamada.setToolTipText("ESCOGER ARCHIVO"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoLlamada = new JButtonMe();
		this.jButtonAbrirImportacionTipoLlamada.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoLlamada,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoLlamada.setToolTipText("Generar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLlamada.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoLlamada.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoLlamada.add(this.jButtonAbrirImportacionTipoLlamada, this.gridBagConstraintsTipoLlamada);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoLlamada = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoLlamada.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoLlamada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoLlamada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoLlamada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLlamada.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoLlamada.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoLlamada.add(this.jLabelPathArchivoImportacionTipoLlamada, this.gridBagConstraintsTipoLlamada);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoLlamada=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoLlamada.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoLlamada.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoLlamada.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLlamada.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoLlamada.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoLlamada.add(this.jTextFieldPathArchivoImportacionTipoLlamada, this.gridBagConstraintsTipoLlamada);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoLlamada = new JButtonMe();
		this.jButtonGenerarImportacionTipoLlamada.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoLlamada,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoLlamada.setToolTipText("Generar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLlamada.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoLlamada.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoLlamada.add(this.jButtonGenerarImportacionTipoLlamada, this.gridBagConstraintsTipoLlamada);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoLlamada = new JButtonMe();
		this.jButtonCerrarImportacionTipoLlamada.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoLlamada,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoLlamada.setToolTipText("Cancelar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLlamada.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoLlamada.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoLlamada.add(this.jButtonCerrarImportacionTipoLlamada, this.gridBagConstraintsTipoLlamada);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoLlamada = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoLlamada= new JScrollPane(jPanelImportacionTipoLlamada,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoLlamada.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoLlamada.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoLlamada.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoLlamada);
		this.jInternalFrameImportacionTipoLlamada.getContentPane().add(this.jScrollPanelImportacionTipoLlamada, this.gridBagConstraintsTipoLlamada);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoLlamada(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoLlamada = new JButtonMe();
			this.jButtonAbrirOrderByTipoLlamada.setText("Orden");
			this.jButtonAbrirOrderByTipoLlamada.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoLlamada,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoLlamada";
			inputMap = this.jButtonAbrirOrderByTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoLlamada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoLlamada"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoLlamada = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoLlamada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoLlamada.setName("jPanelOrderByTipoLlamada"); 
			
			this.jPanelOrderByTipoLlamada.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoLlamada.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoLlamada.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoLlamada.setLayout(gridaBagLayoutOrderByTipoLlamada);
			
			
			this.jTableDatosTipoLlamadaOrderBy = new JTableMe();        
			this.jTableDatosTipoLlamadaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoLlamadaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoLlamadaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoLlamadaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoLlamadaOrderBy.setViewportView(this.jTableDatosTipoLlamadaOrderBy);
			this.jTableDatosTipoLlamadaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoLlamadaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoLlamada= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoLlamada= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoLlamada = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoLlamada= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoLlamada.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoLlamada.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoLlamada.setTitle("Orden");
			this.jInternalFrameOrderByTipoLlamada.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoLlamada.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoLlamada.setResizable(true);
			this.jInternalFrameOrderByTipoLlamada.setClosable(true);
			this.jInternalFrameOrderByTipoLlamada.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoLlamada.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoLlamada.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoLlamada.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Llamadas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoLlamada.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoLlamada.ipady =150;
				
			this.jPanelOrderByTipoLlamada.add(jScrollPanelDatosTipoLlamadaOrderBy, this.gridBagConstraintsTipoLlamada);//this.jTableDatosTipoLlamadaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoLlamada = new JButtonMe();
			this.jButtonCerrarOrderByTipoLlamada.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoLlamada,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoLlamada.setToolTipText("Cancelar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLlamada.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoLlamada.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoLlamada.add(this.jButtonCerrarOrderByTipoLlamada, this.gridBagConstraintsTipoLlamada);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoLlamada = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoLlamada= new JScrollPane(jPanelOrderByTipoLlamada,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoLlamada.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoLlamada.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoLlamada.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoLlamada);
			
			this.jInternalFrameOrderByTipoLlamada.getContentPane().add(this.jScrollPanelOrderByTipoLlamada, this.gridBagConstraintsTipoLlamada);			
		
		} else {
			this.jButtonAbrirOrderByTipoLlamada = new JButtonMe();
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
			&& this.tipollamadaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoLlamada.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoLlamada.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoLlamada.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoLlamada.getRowHeight();//TipoLlamadaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoLlamadaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoLlamada.isSelected()) {
					iHeightTable=TipoLlamadaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoLlamadaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoLlamadaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoLlamadaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoLlamada.isSelected()) {
					iHeightTable=TipoLlamadaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoLlamadaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoLlamadaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoLlamada.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoLlamada.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoLlamada.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoLlamada.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoLlamada.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoLlamada.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoLlamada!=null && this.jInternalFrameOrderByTipoLlamada.getjTableDatosOrderBy()!=null) {
			//if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoLlamada.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoLlamada.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoLlamada.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoLlamada.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoLlamada.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoLlamada.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoLlamada.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoLlamada.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoLlamada.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoLlamada.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipollamadaLogic.getTipoLlamadas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipollamadas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoLlamada> TraerTipoLlamadaBeans(List<TipoLlamada> tipollamadas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoLlamada tipollamada:tipollamadas) {
					
				if(!(TipoLlamadaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoLlamadaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipollamada.setsDetalleGeneralEntityReporte(TipoLlamadaConstantesFunciones.getTipoLlamadaDescripcion(tipollamada));
										
						
					
						
					
				} else  {
							
					//tipollamada.setsDetalleGeneralEntityReporte(tipollamada.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipollamadabeans.add(tipollamadabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipollamadas;
    }
	//PARA REPORTES FIN
}
