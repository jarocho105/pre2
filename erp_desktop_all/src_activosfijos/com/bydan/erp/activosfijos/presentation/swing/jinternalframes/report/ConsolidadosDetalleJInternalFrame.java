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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.report.*;
import com.bydan.erp.activosfijos.util.report.ConsolidadosDetalleConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.report.*;
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
public class ConsolidadosDetalleJInternalFrame extends ConsolidadosDetalleBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarConsolidadosDetalle;
	
	protected JMenuBar jmenuBarConsolidadosDetalle;
	
	protected JMenu jmenuConsolidadosDetalle;
	protected JMenu jmenuDatosConsolidadosDetalle;
	protected JMenu jmenuArchivoConsolidadosDetalle;
	protected JMenu jmenuAccionesConsolidadosDetalle;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosConsolidadosDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConsolidadosDetalle;	
	protected GridBagConstraints gridBagConstraintsConsolidadosDetalle;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ConsolidadosDetalleDetalleFormJInternalFrame jInternalFrameDetalleFormConsolidadosDetalle;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoConsolidadosDetalle;	
	protected ImportacionJInternalFrame jInternalFrameImportacionConsolidadosDetalle;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ConsolidadosDetalleSessionBean consolidadosdetalleSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ConsolidadosDetalle> consolidadosdetalles;		
	public List<ConsolidadosDetalle> consolidadosdetallesEliminados;	
	public List<ConsolidadosDetalle> consolidadosdetallesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByConsolidadosDetalle;		
	protected JButton jButtonAbrirOrderByConsolidadosDetalle;
	
	
	//protected JPanel jPanelOrderByConsolidadosDetalle;
	//public JScrollPane jScrollPanelOrderByConsolidadosDetalle;	
	//protected JButton jButtonCerrarOrderByConsolidadosDetalle;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ConsolidadosDetalleLogic consolidadosdetalleLogic;
	
	
	
	public JScrollPane jScrollPanelDatosConsolidadosDetalle;
	public JScrollPane jScrollPanelDatosEdicionConsolidadosDetalle;
	public JScrollPane jScrollPanelDatosGeneralConsolidadosDetalle;
    
	
	
	//public JScrollPane jScrollPanelDatosConsolidadosDetalleOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoConsolidadosDetalle;
	//public JScrollPane jScrollPanelImportacionConsolidadosDetalle;
	
	
	
	protected JPanel jPanelAccionesConsolidadosDetalle;
	
    protected JPanel jPanelPaginacionConsolidadosDetalle;
    protected JPanel jPanelParametrosReportesConsolidadosDetalle;
	protected JPanel jPanelParametrosReportesAccionesConsolidadosDetalle;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ConsolidadosDetalle;
	protected JPanel jPanelParametrosAuxiliar2ConsolidadosDetalle;
	protected JPanel jPanelParametrosAuxiliar3ConsolidadosDetalle;
	protected JPanel jPanelParametrosAuxiliar4ConsolidadosDetalle;
	//protected JPanel jPanelParametrosAuxiliar5ConsolidadosDetalle;
	
	
	
	//protected JPanel jPanelReporteDinamicoConsolidadosDetalle;
	//protected JPanel jPanelImportacionConsolidadosDetalle;
	
	
	public JTable jTableDatosConsolidadosDetalle;
	
	
	
	//public JTable jTableDatosConsolidadosDetalleOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoConsolidadosDetalle;
	protected JButton jButtonDuplicarConsolidadosDetalle;
	protected JButton jButtonCopiarConsolidadosDetalle;
	protected JButton jButtonVerFormConsolidadosDetalle;
	protected JButton jButtonNuevoRelacionesConsolidadosDetalle;
	protected JButton jButtonModificarConsolidadosDetalle;
	
    protected JButton jButtonGuardarCambiosTablaConsolidadosDetalle;
	protected JButton jButtonCerrarConsolidadosDetalle;
	
	
	protected JButton jButtonRecargarInformacionConsolidadosDetalle;
	protected JButton jButtonProcesarInformacionConsolidadosDetalle;
	
	
	protected JButton jButtonAnterioresConsolidadosDetalle;
	protected JButton jButtonSiguientesConsolidadosDetalle;
	protected JButton jButtonNuevoGuardarCambiosConsolidadosDetalle;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoConsolidadosDetalle;
	//protected JButton jButtonCerrarReporteDinamicoConsolidadosDetalle;
	//protected JButton jButtonGenerarExcelReporteDinamicoConsolidadosDetalle;	
	
	
	
	//protected JButton jButtonAbrirImportacionConsolidadosDetalle;
	//protected JButton jButtonGenerarImportacionConsolidadosDetalle;
	//protected JButton jButtonCerrarImportacionConsolidadosDetalle;
	//protected JFileChooser jFileChooserImportacionConsolidadosDetalle;
	//protected File fileImportacionConsolidadosDetalle;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConsolidadosDetalle;
	protected JButton jButtonDuplicarToolBarConsolidadosDetalle;
	protected JButton jButtonNuevoRelacionesToolBarConsolidadosDetalle;
	
	
	public JButton jButtonGuardarCambiosToolBarConsolidadosDetalle;
	protected JButton jButtonCopiarToolBarConsolidadosDetalle;
	protected JButton jButtonVerFormToolBarConsolidadosDetalle;
	public JButton jButtonGuardarCambiosTablaToolBarConsolidadosDetalle;
	protected JButton jButtonMostrarOcultarTablaToolBarConsolidadosDetalle;
	protected JButton jButtonCerrarToolBarConsolidadosDetalle;
	
	protected JButton jButtonRecargarInformacionToolBarConsolidadosDetalle;
	protected JButton jButtonProcesarInformacionToolBarConsolidadosDetalle;
	protected JButton jButtonAnterioresToolBarConsolidadosDetalle;
	protected JButton jButtonSiguientesToolBarConsolidadosDetalle;
	protected JButton jButtonNuevoGuardarCambiosToolBarConsolidadosDetalle;
	protected JButton jButtonAbrirOrderByToolBarConsolidadosDetalle;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConsolidadosDetalle;
	protected JMenuItem jMenuItemDuplicarConsolidadosDetalle;
	protected JMenuItem jMenuItemNuevoRelacionesConsolidadosDetalle;
	
	
	protected JMenuItem jMenuItemGuardarCambiosConsolidadosDetalle;
	protected JMenuItem jMenuItemCopiarConsolidadosDetalle;
	protected JMenuItem jMenuItemVerFormConsolidadosDetalle;
	protected JMenuItem jMenuItemGuardarCambiosTablaConsolidadosDetalle;
	protected JMenuItem jMenuItemCerrarConsolidadosDetalle;
	protected JMenuItem jMenuItemDetalleCerrarConsolidadosDetalle;
	protected JMenuItem jMenuItemDetalleAbrirOrderByConsolidadosDetalle;
	protected JMenuItem jMenuItemDetalleMostarOcultarConsolidadosDetalle;
	
	protected JMenuItem jMenuItemRecargarInformacionConsolidadosDetalle;
	protected JMenuItem jMenuItemProcesarInformacionConsolidadosDetalle;
	protected JMenuItem jMenuItemAnterioresConsolidadosDetalle;
	protected JMenuItem jMenuItemSiguientesConsolidadosDetalle;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConsolidadosDetalle;
	protected JMenuItem jMenuItemAbrirOrderByConsolidadosDetalle;
	protected JMenuItem jMenuItemMostrarOcultarConsolidadosDetalle;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConsolidadosDetalle;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosConsolidadosDetalle;
	protected JCheckBox jCheckBoxSeleccionadosConsolidadosDetalle;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaConsolidadosDetalle;
	protected JCheckBox jCheckBoxConGraficoReporteConsolidadosDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesConsolidadosDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesConsolidadosDetalle;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoConsolidadosDetalle;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoConsolidadosDetalle;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesConsolidadosDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionConsolidadosDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConsolidadosDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConsolidadosDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarConsolidadosDetalle;
	protected JTextField jTextFieldValorCampoGeneralConsolidadosDetalle;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteConsolidadosDetalle;
	//public JList<Reporte> jListColumnasSelectReporteConsolidadosDetalle;
	//public JScrollPane jScrollColumnasSelectReporteConsolidadosDetalle;
	
	//public JLabel jLabelRelacionesSelectReporteConsolidadosDetalle;
	//public JList<Reporte> jListRelacionesSelectReporteConsolidadosDetalle;
	//public JScrollPane jScrollRelacionesSelectReporteConsolidadosDetalle;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoConsolidadosDetalle;
	//protected JCheckBox jCheckBoxConGraficoDinamicoConsolidadosDetalle;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoConsolidadosDetalle;
	//public JLabel jLabelTiposArchivoReporteDinamicoConsolidadosDetalle;
	
		
	//public JLabel jLabelArchivoImportacionConsolidadosDetalle;	
	//public JLabel jLabelPathArchivoImportacionConsolidadosDetalle;
	//protected JTextField jTextFieldPathArchivoImportacionConsolidadosDetalle;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoConsolidadosDetalle;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoConsolidadosDetalle;
	
	//public JLabel jLabelColumnaCategoriaValorConsolidadosDetalle;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorConsolidadosDetalle;
	
	//public JLabel jLabelColumnasValoresGraficoConsolidadosDetalle;
	//public JList<Reporte> jListColumnasValoresGraficoConsolidadosDetalle;
	//public JScrollPane jScrollColumnasValoresGraficoConsolidadosDetalle;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoConsolidadosDetalle;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoConsolidadosDetalle;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasConsolidadosDetalle;
	public JPanel jPanelBusquedaConsolidadosDetalleConsolidadosDetalle;
	public JButton jButtonBusquedaConsolidadosDetalleConsolidadosDetalle;
	
	public JPanel jPanelIdIdBusquedaConsolidadosDetalleConsolidadosDetalle;
	public JLabel jLabelidBusquedaConsolidadosDetalleConsolidadosDetalle;
	public JTextFieldMe jLabelidConsolidadosDetalleBusquedaConsolidadosDetalle;
	public JButton jButtonidBusquedaConsolidadosDetalleConsolidadosDetalleBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=748;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ConsolidadosDetalleJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ConsolidadosDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsolidadosDetalleJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConsolidadosDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsolidadosDetalleJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConsolidadosDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsolidadosDetalleJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConsolidadosDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionConsolidadosDetalle)	{
		this.jButtonRecargarInformacionConsolidadosDetalle = jButtonRecargarInformacionConsolidadosDetalle;
	}
	
	public JButton getjButtonProcesarInformacionConsolidadosDetalle() {
		return this.jButtonProcesarInformacionConsolidadosDetalle;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConsolidadosDetalle)	{
		this.jButtonProcesarInformacionConsolidadosDetalle = jButtonProcesarInformacionConsolidadosDetalle;
	}
	
	
	public JButton getjButtonRecargarInformacionConsolidadosDetalle() {
		return this.jButtonRecargarInformacionConsolidadosDetalle;
	}
	
	
	public List<ConsolidadosDetalle> getconsolidadosdetalles() {
		return this.consolidadosdetalles;
	}

	public void setconsolidadosdetalles(List<ConsolidadosDetalle> consolidadosdetalles) {
		this.consolidadosdetalles = consolidadosdetalles;
	}
	
	public List<ConsolidadosDetalle> getconsolidadosdetallesAux() {
		return this.consolidadosdetallesAux;
	}

	public void setconsolidadosdetallesAux(List<ConsolidadosDetalle> consolidadosdetallesAux) {
		this.consolidadosdetallesAux = consolidadosdetallesAux;
	}
	
	public List<ConsolidadosDetalle> getconsolidadosdetallesEliminados() {
		return this.consolidadosdetallesEliminados;
	}

	public void setConsolidadosDetallesEliminados(List<ConsolidadosDetalle> consolidadosdetallesEliminados) {
		this.consolidadosdetallesEliminados = consolidadosdetallesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarConsolidadosDetalle() {
		return jComboBoxTiposSeleccionarConsolidadosDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarConsolidadosDetalle(
			JComboBox jComboBoxTiposSeleccionarConsolidadosDetalle) {
		this.jComboBoxTiposSeleccionarConsolidadosDetalle = jComboBoxTiposSeleccionarConsolidadosDetalle;
	}
	
	public void setBorderResaltarTiposSeleccionarConsolidadosDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarConsolidadosDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarConsolidadosDetalle .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralConsolidadosDetalle() {
		return jTextFieldValorCampoGeneralConsolidadosDetalle;
	}

	public void setjTextFieldValorCampoGeneralConsolidadosDetalle(
			JTextField jTextFieldValorCampoGeneralConsolidadosDetalle) {
		this.jTextFieldValorCampoGeneralConsolidadosDetalle = jTextFieldValorCampoGeneralConsolidadosDetalle;
	}

	public void setBorderResaltarValorCampoGeneralConsolidadosDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosDetalle.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralConsolidadosDetalle .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosConsolidadosDetalle() {
		return this.jCheckBoxSeleccionarTodosConsolidadosDetalle;
	}

	public void setjCheckBoxSeleccionarTodosConsolidadosDetalle(
			JCheckBox jCheckBoxSeleccionarTodosConsolidadosDetalle) {
		this.jCheckBoxSeleccionarTodosConsolidadosDetalle = jCheckBoxSeleccionarTodosConsolidadosDetalle;
	}

	public void setBorderResaltarSeleccionarTodosConsolidadosDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosDetalle.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosConsolidadosDetalle .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosConsolidadosDetalle() {
		return this.jCheckBoxSeleccionadosConsolidadosDetalle;
	}

	public void setjCheckBoxSeleccionadosConsolidadosDetalle(
			JCheckBox jCheckBoxSeleccionadosConsolidadosDetalle) {
		this.jCheckBoxSeleccionadosConsolidadosDetalle = jCheckBoxSeleccionadosConsolidadosDetalle;
	}
	
	public void setBorderResaltarSeleccionadosConsolidadosDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosDetalle.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosConsolidadosDetalle .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesConsolidadosDetalle() {
		return this.jComboBoxTiposArchivosReportesConsolidadosDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesConsolidadosDetalle(
			JComboBox jComboBoxTiposArchivosReportesConsolidadosDetalle) {
		this.jComboBoxTiposArchivosReportesConsolidadosDetalle = jComboBoxTiposArchivosReportesConsolidadosDetalle;
	}

	public void setBorderResaltarTiposArchivosReportesConsolidadosDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesConsolidadosDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesConsolidadosDetalle() {
		return this.jComboBoxTiposReportesConsolidadosDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesConsolidadosDetalle(
			JComboBox jComboBoxTiposReportesConsolidadosDetalle) {
		this.jComboBoxTiposReportesConsolidadosDetalle = jComboBoxTiposReportesConsolidadosDetalle;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoConsolidadosDetalle() {
	//	return jComboBoxTiposReportesDinamicoConsolidadosDetalle;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoConsolidadosDetalle(
	//		JComboBox jComboBoxTiposReportesDinamicoConsolidadosDetalle) {
	//	this.jComboBoxTiposReportesDinamicoConsolidadosDetalle = jComboBoxTiposReportesDinamicoConsolidadosDetalle;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoConsolidadosDetalle() {
	//	return jComboBoxTiposArchivosReportesDinamicoConsolidadosDetalle;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoConsolidadosDetalle(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoConsolidadosDetalle) {
	//	this.jComboBoxTiposArchivosReportesDinamicoConsolidadosDetalle = jComboBoxTiposArchivosReportesDinamicoConsolidadosDetalle;
	//}
	
	public void setBorderResaltarTiposReportesConsolidadosDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesConsolidadosDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesConsolidadosDetalle() {
		return this.jComboBoxTiposGraficosReportesConsolidadosDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesConsolidadosDetalle(
			JComboBox jComboBoxTiposGraficosReportesConsolidadosDetalle) {
		this.jComboBoxTiposGraficosReportesConsolidadosDetalle = jComboBoxTiposGraficosReportesConsolidadosDetalle;
	}
	
	public void setBorderResaltarTiposGraficosReportesConsolidadosDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesConsolidadosDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionConsolidadosDetalle() {
		return this.jComboBoxTiposPaginacionConsolidadosDetalle;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionConsolidadosDetalle(
			JComboBox jComboBoxTiposPaginacionConsolidadosDetalle) {
		this.jComboBoxTiposPaginacionConsolidadosDetalle = jComboBoxTiposPaginacionConsolidadosDetalle;
	}
	
	public void setBorderResaltarTiposPaginacionConsolidadosDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionConsolidadosDetalle .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesConsolidadosDetalle() {
		return this.jComboBoxTiposRelacionesConsolidadosDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConsolidadosDetalle() {
		return this.jComboBoxTiposAccionesConsolidadosDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConsolidadosDetalle(
			JComboBox jComboBoxTiposRelacionesConsolidadosDetalle) {
		this.jComboBoxTiposRelacionesConsolidadosDetalle = jComboBoxTiposRelacionesConsolidadosDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConsolidadosDetalle(
			JComboBox jComboBoxTiposAccionesConsolidadosDetalle) {
		this.jComboBoxTiposAccionesConsolidadosDetalle = jComboBoxTiposAccionesConsolidadosDetalle;
	}
	
	public void setBorderResaltarTiposRelacionesConsolidadosDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesConsolidadosDetalle .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesConsolidadosDetalle() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosDetalle.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesConsolidadosDetalle .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoConsolidadosDetalle() {
	//	return jCheckBoxConGraficoDinamicoConsolidadosDetalle;
	//}

	//public void setjCheckBoxConGraficoDinamicoConsolidadosDetalle(
	//		JCheckBox jCheckBoxConGraficoDinamicoConsolidadosDetalle) {
	//	this.jCheckBoxConGraficoDinamicoConsolidadosDetalle = jCheckBoxConGraficoDinamicoConsolidadosDetalle;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoConsolidadosDetalle() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarConsolidadosDetalle.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoConsolidadosDetalle .setBorder(borderResaltar);		
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
		this.consolidadosdetalleSessionBean=new ConsolidadosDetalleSessionBean();
		
		this.consolidadosdetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consolidadosdetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.consolidadosdetalleSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ConsolidadosDetalleJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ConsolidadosDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConsolidadosDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConsolidadosDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConsolidadosDetalleJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Consolidados Detalle MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
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
		
		ConsolidadosDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ConsolidadosDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarConsolidadosDetalle= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarConsolidadosDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarConsolidadosDetalle,this.jTtoolBarConsolidadosDetalle,
							"nuevo","nuevo","Nuevo"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarConsolidadosDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarConsolidadosDetalle,this.jTtoolBarConsolidadosDetalle,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarConsolidadosDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarConsolidadosDetalle,this.jTtoolBarConsolidadosDetalle,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarConsolidadosDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarConsolidadosDetalle,this.jTtoolBarConsolidadosDetalle,
							"duplicar","duplicar","Duplicar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarConsolidadosDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarConsolidadosDetalle,this.jTtoolBarConsolidadosDetalle,
							"copiar","copiar","Copiar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarConsolidadosDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarConsolidadosDetalle,this.jTtoolBarConsolidadosDetalle,
							"ver_form","ver_form","Ver"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarConsolidadosDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsolidadosDetalle,this.jTtoolBarConsolidadosDetalle,
							"recargar","recargar","Buscar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarConsolidadosDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsolidadosDetalle,this.jTtoolBarConsolidadosDetalle,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarConsolidadosDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsolidadosDetalle,this.jTtoolBarConsolidadosDetalle,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarConsolidadosDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarConsolidadosDetalle,this.jTtoolBarConsolidadosDetalle,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarConsolidadosDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarConsolidadosDetalle,this.jTtoolBarConsolidadosDetalle,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarConsolidadosDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarConsolidadosDetalle,this.jTtoolBarConsolidadosDetalle,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarConsolidadosDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarConsolidadosDetalle,this.jTtoolBarConsolidadosDetalle,
							"cerrar","cerrar","Salir"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarConsolidadosDetalle=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarConsolidadosDetalle;
			
				this.jButtonProcesarInformacionToolBarConsolidadosDetalle=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarConsolidadosDetalle;
				
		//protected JButton jButtonModificarToolBarConsolidadosDetalle;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarConsolidadosDetalle=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuConsolidadosDetalle=new JMenuMe("General");
		this.jmenuArchivoConsolidadosDetalle=new JMenuMe("Archivo");
		this.jmenuAccionesConsolidadosDetalle=new JMenuMe("Acciones");
		this.jmenuDatosConsolidadosDetalle=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConsolidadosDetalle= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConsolidadosDetalle.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConsolidadosDetalle,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarConsolidadosDetalle= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarConsolidadosDetalle.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarConsolidadosDetalle,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesConsolidadosDetalle= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesConsolidadosDetalle.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesConsolidadosDetalle,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosConsolidadosDetalle= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConsolidadosDetalle.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConsolidadosDetalle,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarConsolidadosDetalle= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarConsolidadosDetalle.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarConsolidadosDetalle,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormConsolidadosDetalle= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormConsolidadosDetalle.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormConsolidadosDetalle,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaConsolidadosDetalle= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaConsolidadosDetalle.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaConsolidadosDetalle,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConsolidadosDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConsolidadosDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConsolidadosDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionConsolidadosDetalle= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionConsolidadosDetalle.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionConsolidadosDetalle,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionConsolidadosDetalle= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionConsolidadosDetalle.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionConsolidadosDetalle,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresConsolidadosDetalle= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresConsolidadosDetalle.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresConsolidadosDetalle,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesConsolidadosDetalle= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesConsolidadosDetalle.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesConsolidadosDetalle,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByConsolidadosDetalle= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByConsolidadosDetalle.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByConsolidadosDetalle,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConsolidadosDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConsolidadosDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConsolidadosDetalle,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByConsolidadosDetalle= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByConsolidadosDetalle.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByConsolidadosDetalle,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConsolidadosDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConsolidadosDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConsolidadosDetalle,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosConsolidadosDetalle= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosConsolidadosDetalle.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosConsolidadosDetalle,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoConsolidadosDetalle.add(this.jMenuItemCerrarConsolidadosDetalle);
			
			this.jmenuAccionesConsolidadosDetalle.add(this.jMenuItemNuevoConsolidadosDetalle);
			this.jmenuAccionesConsolidadosDetalle.add(this.jMenuItemNuevoGuardarCambiosConsolidadosDetalle);
			this.jmenuAccionesConsolidadosDetalle.add(this.jMenuItemNuevoRelacionesConsolidadosDetalle);
			this.jmenuAccionesConsolidadosDetalle.add(this.jMenuItemGuardarCambiosTablaConsolidadosDetalle);		
			this.jmenuAccionesConsolidadosDetalle.add(this.jMenuItemDuplicarConsolidadosDetalle);		
			this.jmenuAccionesConsolidadosDetalle.add(this.jMenuItemCopiarConsolidadosDetalle);		
			this.jmenuAccionesConsolidadosDetalle.add(this.jMenuItemVerFormConsolidadosDetalle);		
			
			this.jmenuDatosConsolidadosDetalle.add(this.jMenuItemRecargarInformacionConsolidadosDetalle);				
			this.jmenuDatosConsolidadosDetalle.add(this.jMenuItemAnterioresConsolidadosDetalle);				
			this.jmenuDatosConsolidadosDetalle.add(this.jMenuItemSiguientesConsolidadosDetalle);				
			this.jmenuDatosConsolidadosDetalle.add(this.jMenuItemAbrirOrderByConsolidadosDetalle);				
			this.jmenuDatosConsolidadosDetalle.add(this.jMenuItemMostrarOcultarConsolidadosDetalle);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesConsolidadosDetalle.add(this.jMenuItemGuardarCambiosConsolidadosDetalle);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarConsolidadosDetalle.add(this.jmenuArchivoConsolidadosDetalle);		
			this.jmenuBarConsolidadosDetalle.add(this.jmenuAccionesConsolidadosDetalle);		
			this.jmenuBarConsolidadosDetalle.add(this.jmenuDatosConsolidadosDetalle);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarConsolidadosDetalle);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasConsolidadosDetalle() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaConsolidadosDetalleConsolidadosDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaConsolidadosDetalleConsolidadosDetalle.setToolTipText("Buscar Por  ");
		this.jButtonBusquedaConsolidadosDetalleConsolidadosDetalle= new JButtonMe();
		this.jButtonBusquedaConsolidadosDetalleConsolidadosDetalle.setText("Buscar");
		this.jButtonBusquedaConsolidadosDetalleConsolidadosDetalle.setToolTipText("Buscar Por  ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaConsolidadosDetalleConsolidadosDetalle,"buscar_button","Buscar Por  ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaConsolidadosDetalleConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaConsolidadosDetalleConsolidadosDetalle = new JLabelMe();
		jLabelidBusquedaConsolidadosDetalleConsolidadosDetalle.setText("Id :");
		jLabelidBusquedaConsolidadosDetalleConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaConsolidadosDetalleConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaConsolidadosDetalleConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaConsolidadosDetalleConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidConsolidadosDetalleBusquedaConsolidadosDetalle= new JTextFieldMe();
		jLabelidConsolidadosDetalleBusquedaConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsolidadosDetalleBusquedaConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsolidadosDetalleBusquedaConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidConsolidadosDetalleBusquedaConsolidadosDetalle.setVisible(false);




		this.jTabbedPaneBusquedasConsolidadosDetalle=new JTabbedPane();


		this.jTabbedPaneBusquedasConsolidadosDetalle.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasConsolidadosDetalle.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasConsolidadosDetalle.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasConsolidadosDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleConsolidadosDetalle = new ConsolidadosDetalleDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Consolidados Detalle DATOS");
			this.jInternalFrameDetalleFormConsolidadosDetalle = new ConsolidadosDetalleDetalleFormJInternalFrame(jDesktopPane,this.consolidadosdetalleSessionBean.getConGuardarRelaciones(),this.consolidadosdetalleSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormConsolidadosDetalle = null;//new ConsolidadosDetalleDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConsolidadosDetalle= new GridBagLayout();
		
		
		this.jTableDatosConsolidadosDetalle = new JTableMe();      
		
		String sToolTipConsolidadosDetalle="";
		sToolTipConsolidadosDetalle=ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConsolidadosDetalle+="(ActivosFijos.ConsolidadosDetalle)";
		}
		
		if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
			sToolTipConsolidadosDetalle+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosConsolidadosDetalle.setToolTipText(sToolTipConsolidadosDetalle);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosConsolidadosDetalle);
		this.jTableDatosConsolidadosDetalle.setAutoCreateRowSorter(true);
		this.jTableDatosConsolidadosDetalle.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosConsolidadosDetalle.setRowSelectionAllowed(true);
		this.jTableDatosConsolidadosDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoConsolidadosDetalle = new JButtonMe();
		this.jButtonDuplicarConsolidadosDetalle = new JButtonMe();
		this.jButtonCopiarConsolidadosDetalle = new JButtonMe();
		this.jButtonVerFormConsolidadosDetalle = new JButtonMe();
		this.jButtonNuevoRelacionesConsolidadosDetalle = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaConsolidadosDetalle = new JButtonMe();
		this.jButtonCerrarConsolidadosDetalle = new JButtonMe();
		
		this.jScrollPanelDatosConsolidadosDetalle = new JScrollPane();   
        this.jScrollPanelDatosGeneralConsolidadosDetalle = new JScrollPane();
		
				
		
		
		this.jPanelAccionesConsolidadosDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Consolidados Detalle";
		
		if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consolidados Detalles" + this.sPath));
		} else {
			this.jScrollPanelDatosConsolidadosDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConsolidadosDetalle.setToolTipText("Acciones");
        this.jPanelAccionesConsolidadosDetalle.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoConsolidadosDetalle=new ReporteDinamicoJInternalFrame(ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoConsolidadosDetalle();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionConsolidadosDetalle=new ImportacionJInternalFrame(ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionConsolidadosDetalle();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByConsolidadosDetalle = new JButtonMe();
		
		this.jButtonAbrirOrderByConsolidadosDetalle.setText("Orden");
		this.jButtonAbrirOrderByConsolidadosDetalle.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConsolidadosDetalle,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByConsolidadosDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConsolidadosDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsolidadosDetalle,false,this);
			
			//this.cargarOrderByConsolidadosDetalle(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConsolidadosDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsolidadosDetalle,true,this);
			
			//this.cargarOrderByConsolidadosDetalle(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosConsolidadosDetalle.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosConsolidadosDetalle.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosConsolidadosDetalle.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosConsolidadosDetalle.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosConsolidadosDetalle.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosConsolidadosDetalle.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoConsolidadosDetalle.setText("Nuevo");
		this.jButtonDuplicarConsolidadosDetalle.setText("Duplicar");
		this.jButtonCopiarConsolidadosDetalle.setText("Copiar");
		this.jButtonVerFormConsolidadosDetalle.setText("Ver");
		this.jButtonNuevoRelacionesConsolidadosDetalle.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaConsolidadosDetalle.setText("Guardar");
		this.jButtonCerrarConsolidadosDetalle.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConsolidadosDetalle,"nuevo_button","Nuevo",this.consolidadosdetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarConsolidadosDetalle,"duplicar_button","Duplicar",this.consolidadosdetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarConsolidadosDetalle,"copiar_button","Copiar",this.consolidadosdetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormConsolidadosDetalle,"ver_form","Ver",this.consolidadosdetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesConsolidadosDetalle,"nuevorelaciones_button","Nuevo Rel",this.consolidadosdetalleSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConsolidadosDetalle,"guardarcambiostabla_button","Guardar",this.consolidadosdetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConsolidadosDetalle,"cerrar_button","Salir",this.consolidadosdetalleSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoConsolidadosDetalle.setToolTipText("Nuevo"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarConsolidadosDetalle.setToolTipText("Duplicar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarConsolidadosDetalle.setToolTipText("Copiar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormConsolidadosDetalle.setToolTipText("Ver"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesConsolidadosDetalle.setToolTipText("Nuevo Rel"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaConsolidadosDetalle.setToolTipText("Guardar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConsolidadosDetalle.setToolTipText("Salir"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConsolidadosDetalle";
		inputMap = this.jButtonNuevoConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConsolidadosDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConsolidadosDetalle"));
		
		//DUPLICAR
		sMapKey = "DuplicarConsolidadosDetalle";
		inputMap = this.jButtonDuplicarConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarConsolidadosDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarConsolidadosDetalle"));
		
		//COPIAR
		sMapKey = "CopiarConsolidadosDetalle";
		inputMap = this.jButtonCopiarConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarConsolidadosDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarConsolidadosDetalle"));
		
		//VEr FORM
		sMapKey = "VerFormConsolidadosDetalle";
		inputMap = this.jButtonVerFormConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormConsolidadosDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormConsolidadosDetalle"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesConsolidadosDetalle";
		inputMap = this.jButtonNuevoRelacionesConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesConsolidadosDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesConsolidadosDetalle"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarConsolidadosDetalle";
		inputMap = this.jButtonModificarConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarConsolidadosDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarConsolidadosDetalle"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarConsolidadosDetalle";
		inputMap = this.jButtonCerrarConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConsolidadosDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConsolidadosDetalle"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConsolidadosDetalle";
		inputMap = this.jButtonGuardarCambiosTablaConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConsolidadosDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConsolidadosDetalle"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesConsolidadosDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesConsolidadosDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionConsolidadosDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ConsolidadosDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ConsolidadosDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ConsolidadosDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ConsolidadosDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ConsolidadosDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesConsolidadosDetalle.setName("jPanelParametrosReportesConsolidadosDetalle"); 
		
		this.jPanelParametrosReportesAccionesConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesConsolidadosDetalle.setName("jPanelParametrosReportesAccionesConsolidadosDetalle"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionConsolidadosDetalle = new JButtonMe();
		this.jButtonRecargarInformacionConsolidadosDetalle.setText("Buscar");
		this.jButtonRecargarInformacionConsolidadosDetalle.setToolTipText("Buscar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionConsolidadosDetalle,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionConsolidadosDetalle.setVisible(false);
		
		
		this.jButtonProcesarInformacionConsolidadosDetalle = new JButtonMe();
		this.jButtonProcesarInformacionConsolidadosDetalle.setText("Procesar");
		this.jButtonProcesarInformacionConsolidadosDetalle.setToolTipText("Procesar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionConsolidadosDetalle.setVisible(false);
			
		this.jButtonProcesarInformacionConsolidadosDetalle.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConsolidadosDetalle.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConsolidadosDetalle.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesConsolidadosDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsolidadosDetalle.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesConsolidadosDetalle.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesConsolidadosDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsolidadosDetalle.setText("TIPO");       
		this.jComboBoxTiposReportesConsolidadosDetalle.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesConsolidadosDetalle = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsolidadosDetalle.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesConsolidadosDetalle.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionConsolidadosDetalle = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionConsolidadosDetalle.setText("Paginacion");
		this.jComboBoxTiposPaginacionConsolidadosDetalle.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesConsolidadosDetalle = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesConsolidadosDetalle.setText("Accion");
		this.jComboBoxTiposRelacionesConsolidadosDetalle.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesConsolidadosDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConsolidadosDetalle.setText("Accion");
		this.jComboBoxTiposAccionesConsolidadosDetalle.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarConsolidadosDetalle = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarConsolidadosDetalle.setText("Accion");
		this.jComboBoxTiposSeleccionarConsolidadosDetalle.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralConsolidadosDetalle=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralConsolidadosDetalle.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConsolidadosDetalle.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConsolidadosDetalle.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesConsolidadosDetalle = new JLabelMe();
		
		this.jLabelAccionesConsolidadosDetalle.setText("Acciones");		
		this.jLabelAccionesConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosConsolidadosDetalle = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosConsolidadosDetalle.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosConsolidadosDetalle.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosConsolidadosDetalle = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosConsolidadosDetalle.setText("Seleccionados");
		this.jCheckBoxSeleccionadosConsolidadosDetalle.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaConsolidadosDetalle = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaConsolidadosDetalle.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaConsolidadosDetalle.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteConsolidadosDetalle = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteConsolidadosDetalle.setText("Graf.");
		this.jCheckBoxConGraficoReporteConsolidadosDetalle.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresConsolidadosDetalle = new JButtonMe();
		//this.jButtonAnterioresConsolidadosDetalle.setText("<<");
        this.jButtonAnterioresConsolidadosDetalle.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresConsolidadosDetalle,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesConsolidadosDetalle = new JButtonMe();
		//this.jButtonSiguientesConsolidadosDetalle.setText(">>");
        this.jButtonSiguientesConsolidadosDetalle.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesConsolidadosDetalle,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosConsolidadosDetalle = new JButtonMe();
		this.jButtonNuevoGuardarCambiosConsolidadosDetalle.setText("Nue");
        this.jButtonNuevoGuardarCambiosConsolidadosDetalle.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosConsolidadosDetalle,"nuevoguardarcambios_button","Nue",this.consolidadosdetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosConsolidadosDetalle";
		inputMap = this.jButtonNuevoGuardarCambiosConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosConsolidadosDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosConsolidadosDetalle"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionConsolidadosDetalle";
		inputMap = this.jButtonRecargarInformacionConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionConsolidadosDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionConsolidadosDetalle"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesConsolidadosDetalle";
		inputMap = this.jButtonSiguientesConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesConsolidadosDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesConsolidadosDetalle"));
		
		//ANTERIORES		
		sMapKey = "AnterioresConsolidadosDetalle";
		inputMap = this.jButtonAnterioresConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresConsolidadosDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresConsolidadosDetalle"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasConsolidadosDetalle();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesConsolidadosDetalle.setMinimumSize(new Dimension(this.getWidth(),ConsolidadosDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsolidadosDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConsolidadosDetalle.setMaximumSize(new Dimension(this.getWidth(),ConsolidadosDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsolidadosDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConsolidadosDetalle.setPreferredSize(new Dimension(this.getWidth(),ConsolidadosDetalleBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsolidadosDetalleBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionConsolidadosDetalle = new GridBagLayout();

			this.jPanelPaginacionConsolidadosDetalle.setLayout(gridaBagLayoutPaginacionConsolidadosDetalle);						
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
			this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionConsolidadosDetalle.add(this.jButtonAnterioresConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
					
						
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
			
			this.jPanelPaginacionConsolidadosDetalle.add(this.jButtonNuevoGuardarCambiosConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
						
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
			this.jPanelPaginacionConsolidadosDetalle.add(this.jButtonSiguientesConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy = 1;
			this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsolidadosDetalle.add(this.jButtonNuevoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
						
			
			
			if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
				this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConsolidadosDetalle.gridy = 1;
				this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionConsolidadosDetalle.add(this.jButtonGuardarCambiosTablaConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
			}
			
			
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy = 1;
			this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsolidadosDetalle.add(this.jButtonDuplicarConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy = 1;
			this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsolidadosDetalle.add(this.jButtonCopiarConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy = 1;
			this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsolidadosDetalle.add(this.jButtonVerFormConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy = 1;
			this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionConsolidadosDetalle.add(this.jButtonCerrarConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		
		
		
		this.jButtonRecargarInformacionConsolidadosDetalle.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConsolidadosDetalle.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConsolidadosDetalle.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesConsolidadosDetalle.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConsolidadosDetalle.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConsolidadosDetalle.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesConsolidadosDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConsolidadosDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConsolidadosDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesConsolidadosDetalle.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConsolidadosDetalle.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConsolidadosDetalle.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionConsolidadosDetalle.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConsolidadosDetalle.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConsolidadosDetalle.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesConsolidadosDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConsolidadosDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConsolidadosDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesConsolidadosDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsolidadosDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsolidadosDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarConsolidadosDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConsolidadosDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConsolidadosDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaConsolidadosDetalle.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConsolidadosDetalle.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConsolidadosDetalle.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteConsolidadosDetalle.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConsolidadosDetalle.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConsolidadosDetalle.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosConsolidadosDetalle.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConsolidadosDetalle.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConsolidadosDetalle.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosConsolidadosDetalle.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConsolidadosDetalle.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConsolidadosDetalle.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesConsolidadosDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesConsolidadosDetalle = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ConsolidadosDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ConsolidadosDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ConsolidadosDetalle = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ConsolidadosDetalle = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesConsolidadosDetalle.setLayout(gridaBagParametrosReportesConsolidadosDetalle);
			this.jPanelParametrosReportesAccionesConsolidadosDetalle.setLayout(gridaBagParametrosReportesAccionesConsolidadosDetalle);
			
			
			this.jPanelParametrosAuxiliar1ConsolidadosDetalle.setLayout(gridaBagParametrosAuxiliar1ConsolidadosDetalle);
			this.jPanelParametrosAuxiliar2ConsolidadosDetalle.setLayout(gridaBagParametrosAuxiliar2ConsolidadosDetalle);
			this.jPanelParametrosAuxiliar3ConsolidadosDetalle.setLayout(gridaBagParametrosAuxiliar3ConsolidadosDetalle);
			this.jPanelParametrosAuxiliar4ConsolidadosDetalle.setLayout(gridaBagParametrosAuxiliar4ConsolidadosDetalle);
			//this.jPanelParametrosAuxiliar5ConsolidadosDetalle.setLayout(gridaBagParametrosAuxiliar2ConsolidadosDetalle);			
			
			
			
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsolidadosDetalle.add(this.jButtonRecargarInformacionConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConsolidadosDetalle.add(this.jComboBoxTiposPaginacionConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConsolidadosDetalle.add(this.jCheckBoxConAltoMaximoTablaConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosDetalle.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConsolidadosDetalle.add(this.jComboBoxTiposArchivosReportesConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsolidadosDetalle.add(this.jPanelParametrosAuxiliar1ConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ConsolidadosDetalle.add(this.jComboBoxTiposReportesConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);																		
			
			
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ConsolidadosDetalle.add(this.jComboBoxTiposGraficosReportesConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsolidadosDetalle.add(this.jPanelParametrosAuxiliar4ConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosDetalle.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsolidadosDetalle.add(this.jComboBoxTiposReportesConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosDetalle.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsolidadosDetalle.add(this.jCheckBoxGenerarReporteConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsolidadosDetalle.add(this.jPanelParametrosAuxiliar2ConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsolidadosDetalle.add(this.jLabelAccionesConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
				this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsConsolidadosDetalle.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesConsolidadosDetalle.add(this.jButtonAbrirOrderByConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsolidadosDetalle.add(this.jComboBoxTiposSeleccionarConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);			
			
			
			/*
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsolidadosDetalle.add(this.jCheckBoxSeleccionarTodosConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosDetalle.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsolidadosDetalle.add(this.jCheckBoxConGraficoReporteConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConsolidadosDetalle.add(this.jCheckBoxSeleccionarTodosConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);															
				
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConsolidadosDetalle.add(this.jCheckBoxSeleccionadosConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);															
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosDetalle.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConsolidadosDetalle.add(this.jCheckBoxConGraficoReporteConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosDetalle.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsolidadosDetalle.add(this.jPanelParametrosAuxiliar3ConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosDetalle.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsolidadosDetalle.add(this.jComboBoxTiposAccionesConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosConsolidadosDetalle = new GridBagLayout();

			this.jScrollPanelDatosConsolidadosDetalle.setLayout(gridaBagLayoutDatosConsolidadosDetalle);
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
			this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
			
			this.jScrollPanelDatosConsolidadosDetalle.add(this.jTableDatosConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosConsolidadosDetalle.setViewportView(this.jTableDatosConsolidadosDetalle);
		this.jTableDatosConsolidadosDetalle.setFillsViewportHeight(true);
		this.jTableDatosConsolidadosDetalle.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesConsolidadosDetalle= new GridBagLayout();
		this.jPanelAccionesConsolidadosDetalle.setLayout(gridaBagLayoutAccionesConsolidadosDetalle);
		
		
		/*	
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
		this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
			
		this.jPanelAccionesConsolidadosDetalle.add(this.jButtonNuevoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaConsolidadosDetalleConsolidadosDetalle= new GridBagLayout();
		gridaBagLayoutBusquedaConsolidadosDetalleConsolidadosDetalle.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaConsolidadosDetalleConsolidadosDetalle.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaConsolidadosDetalleConsolidadosDetalle.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaConsolidadosDetalleConsolidadosDetalle.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaConsolidadosDetalleConsolidadosDetalle.setLayout(gridaBagLayoutBusquedaConsolidadosDetalleConsolidadosDetalle);

		gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsolidadosDetalle.gridy = 0;
		gridBagConstraintsConsolidadosDetalle.gridx = 0;
		jPanelBusquedaConsolidadosDetalleConsolidadosDetalle.add(jLabelidBusquedaConsolidadosDetalleConsolidadosDetalle, gridBagConstraintsConsolidadosDetalle);

		gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsolidadosDetalle.gridy = 0;
		gridBagConstraintsConsolidadosDetalle.gridx = 1;
		jPanelBusquedaConsolidadosDetalleConsolidadosDetalle.add(jLabelidConsolidadosDetalleBusquedaConsolidadosDetalle, gridBagConstraintsConsolidadosDetalle);

		gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsolidadosDetalle.gridy = 1;
		gridBagConstraintsConsolidadosDetalle.gridx =1;
		jPanelBusquedaConsolidadosDetalleConsolidadosDetalle.add(jButtonBusquedaConsolidadosDetalleConsolidadosDetalle, gridBagConstraintsConsolidadosDetalle);

		jTabbedPaneBusquedasConsolidadosDetalle.addTab("1.-Por  ", jPanelBusquedaConsolidadosDetalleConsolidadosDetalle);
		jTabbedPaneBusquedasConsolidadosDetalle.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConsolidadosDetalle = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConsolidadosDetalle);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();						
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsolidadosDetalle.gridx = 0;		
			//this.gridBagConstraintsConsolidadosDetalle.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConsolidadosDetalle.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyPrincipal++;
		this.gridBagConstraintsConsolidadosDetalle.gridx = 0;		
		//this.gridBagConstraintsConsolidadosDetalle.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsConsolidadosDetalle.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsConsolidadosDetalle);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsolidadosDetalle.gridx = 0;		
			this.gridBagConstraintsConsolidadosDetalle.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsConsolidadosDetalle.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);								
		
		
		/*
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		*/		
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConsolidadosDetalle.gridx =0;
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConsolidadosDetalle.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
				
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ConsolidadosDetalleJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosConsolidadosDetalle= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConsolidadosDetalle = new GridBagLayout();
			this.jPanelBusquedasParametrosConsolidadosDetalle.setLayout(gridaBagLayoutBusquedasParametrosConsolidadosDetalle);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralConsolidadosDetalle=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConsolidadosDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsolidadosDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsolidadosDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
			
			
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		
			
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosDetalle.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralConsolidadosDetalle;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoConsolidadosDetalle() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoConsolidadosDetalle = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoConsolidadosDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoConsolidadosDetalle.setName("jPanelReporteDinamicoConsolidadosDetalle"); 
		
		this.jPanelReporteDinamicoConsolidadosDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConsolidadosDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConsolidadosDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoConsolidadosDetalle.setLayout(gridaBagLayoutReporteDinamicoConsolidadosDetalle);
		
		
		this.jInternalFrameReporteDinamicoConsolidadosDetalle= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoConsolidadosDetalle = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConsolidadosDetalle= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoConsolidadosDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoConsolidadosDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoConsolidadosDetalle.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoConsolidadosDetalle.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoConsolidadosDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoConsolidadosDetalle.setResizable(true);
	    this.jInternalFrameReporteDinamicoConsolidadosDetalle.setClosable(true);
	    this.jInternalFrameReporteDinamicoConsolidadosDetalle.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoConsolidadosDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConsolidadosDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConsolidadosDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consolidados Detalles"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteConsolidadosDetalle = new JLabelMe();

		this.jLabelColumnasSelectReporteConsolidadosDetalle.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jLabelColumnasSelectReporteConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteConsolidadosDetalle = new JList<Reporte>();
		this.jListColumnasSelectReporteConsolidadosDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteConsolidadosDetalle.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteConsolidadosDetalle.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConsolidadosDetalle.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConsolidadosDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteConsolidadosDetalle=new JScrollPane(this.jListColumnasSelectReporteConsolidadosDetalle);
			
			this.jScrollColumnasSelectReporteConsolidadosDetalle.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConsolidadosDetalle.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConsolidadosDetalle.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jListColumnasSelectReporteConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jScrollColumnasSelectReporteConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteConsolidadosDetalle = new JLabelMe();

		this.jLabelRelacionesSelectReporteConsolidadosDetalle.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteConsolidadosDetalle = new JList<Reporte>();
		this.jListRelacionesSelectReporteConsolidadosDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteConsolidadosDetalle.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteConsolidadosDetalle.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConsolidadosDetalle.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConsolidadosDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteConsolidadosDetalle=new JScrollPane(this.jListRelacionesSelectReporteConsolidadosDetalle);
			
			this.jScrollRelacionesSelectReporteConsolidadosDetalle.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConsolidadosDetalle.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConsolidadosDetalle.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoConsolidadosDetalle = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoConsolidadosDetalle = new JComboBoxMe();
		this.jListColumnasValoresGraficoConsolidadosDetalle = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoConsolidadosDetalle = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoConsolidadosDetalle.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoConsolidadosDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConsolidadosDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConsolidadosDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoConsolidadosDetalle = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoConsolidadosDetalle.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoConsolidadosDetalle.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConsolidadosDetalle.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConsolidadosDetalle.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoConsolidadosDetalle = new JLabelMe();

		this.jLabelConGraficoDinamicoConsolidadosDetalle.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jLabelConGraficoDinamicoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoConsolidadosDetalle = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoConsolidadosDetalle.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoConsolidadosDetalle.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoConsolidadosDetalle.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConsolidadosDetalle.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConsolidadosDetalle.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jCheckBoxConGraficoDinamicoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoConsolidadosDetalle = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoConsolidadosDetalle.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jLabelColumnaCategoriaGraficoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoConsolidadosDetalle = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConsolidadosDetalle.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoConsolidadosDetalle.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoConsolidadosDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConsolidadosDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConsolidadosDetalle.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jComboBoxColumnaCategoriaGraficoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorConsolidadosDetalle = new JLabelMe();

		this.jLabelColumnaCategoriaValorConsolidadosDetalle.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jLabelColumnaCategoriaValorConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorConsolidadosDetalle = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorConsolidadosDetalle.setText("Accion");
        this.jComboBoxColumnaCategoriaValorConsolidadosDetalle.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorConsolidadosDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConsolidadosDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConsolidadosDetalle.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jComboBoxColumnaCategoriaValorConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoConsolidadosDetalle = new JLabelMe();

		this.jLabelColumnasValoresGraficoConsolidadosDetalle.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jLabelColumnasValoresGraficoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoConsolidadosDetalle = new JList<Reporte>();
		this.jListColumnasValoresGraficoConsolidadosDetalle.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoConsolidadosDetalle.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoConsolidadosDetalle.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConsolidadosDetalle.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConsolidadosDetalle.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoConsolidadosDetalle=new JScrollPane(this.jListColumnasValoresGraficoConsolidadosDetalle);
			
			this.jScrollColumnasValoresGraficoConsolidadosDetalle.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConsolidadosDetalle.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConsolidadosDetalle.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jListColumnasSelectReporteConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jScrollColumnasValoresGraficoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoConsolidadosDetalle = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoConsolidadosDetalle.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jLabelTiposGraficosReportesDinamicoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoConsolidadosDetalle = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConsolidadosDetalle.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoConsolidadosDetalle.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoConsolidadosDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConsolidadosDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConsolidadosDetalle.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jComboBoxTiposGraficosReportesDinamicoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoConsolidadosDetalle = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoConsolidadosDetalle.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jLabelGenerarExcelReporteDinamicoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoConsolidadosDetalle = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoConsolidadosDetalle.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoConsolidadosDetalle,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoConsolidadosDetalle.setToolTipText("Generar EXCEL"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jButtonGenerarExcelReporteDinamicoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jComboBoxTiposReportesDinamicoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoConsolidadosDetalle = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoConsolidadosDetalle.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jLabelTiposArchivoReporteDinamicoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jComboBoxTiposArchivosReportesDinamicoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoConsolidadosDetalle = new JButtonMe();
		this.jButtonGenerarReporteDinamicoConsolidadosDetalle.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoConsolidadosDetalle,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoConsolidadosDetalle.setToolTipText("Generar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jButtonGenerarReporteDinamicoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoConsolidadosDetalle = new JButtonMe();
		this.jButtonCerrarReporteDinamicoConsolidadosDetalle.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoConsolidadosDetalle,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoConsolidadosDetalle.setToolTipText("Cancelar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsolidadosDetalle.add(this.jButtonCerrarReporteDinamicoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalConsolidadosDetalle = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoConsolidadosDetalle= new JScrollPane(jPanelReporteDinamicoConsolidadosDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoConsolidadosDetalle.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConsolidadosDetalle.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConsolidadosDetalle.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consolidados Detalles"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsConsolidadosDetalle.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoConsolidadosDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoConsolidadosDetalle.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalConsolidadosDetalle);
		this.jInternalFrameReporteDinamicoConsolidadosDetalle.getContentPane().add(this.jScrollPanelReporteDinamicoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionConsolidadosDetalle() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionConsolidadosDetalle = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionConsolidadosDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionConsolidadosDetalle.setName("jPanelImportacionConsolidadosDetalle"); 
		
		this.jPanelImportacionConsolidadosDetalle.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConsolidadosDetalle.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConsolidadosDetalle.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionConsolidadosDetalle.setLayout(gridaBagLayoutImportacionConsolidadosDetalle);
		
		
		this.jInternalFrameImportacionConsolidadosDetalle= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionConsolidadosDetalle= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionConsolidadosDetalle = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConsolidadosDetalle= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionConsolidadosDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConsolidadosDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConsolidadosDetalle.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionConsolidadosDetalle.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConsolidadosDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConsolidadosDetalle.setResizable(true);
	    this.jInternalFrameImportacionConsolidadosDetalle.setClosable(true);
	    this.jInternalFrameImportacionConsolidadosDetalle.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionConsolidadosDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConsolidadosDetalle.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConsolidadosDetalle.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionConsolidadosDetalle.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConsolidadosDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConsolidadosDetalle.setResizable(true);
	    this.jInternalFrameImportacionConsolidadosDetalle.setClosable(true);
	    this.jInternalFrameImportacionConsolidadosDetalle.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionConsolidadosDetalle.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConsolidadosDetalle.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConsolidadosDetalle.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consolidados Detalles"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionConsolidadosDetalle = new JLabelMe();

		this.jLabelArchivoImportacionConsolidadosDetalle.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYImportacion;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConsolidadosDetalle.add(this.jLabelArchivoImportacionConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionConsolidadosDetalle = new JFileChooser();		
		this.jFileChooserImportacionConsolidadosDetalle.setToolTipText("ESCOGER ARCHIVO"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionConsolidadosDetalle = new JButtonMe();
		this.jButtonAbrirImportacionConsolidadosDetalle.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionConsolidadosDetalle,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionConsolidadosDetalle.setToolTipText("Generar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsolidadosDetalle.add(this.jButtonAbrirImportacionConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionConsolidadosDetalle = new JLabelMe();

		this.jLabelPathArchivoImportacionConsolidadosDetalle.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYImportacion;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConsolidadosDetalle.add(this.jLabelPathArchivoImportacionConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionConsolidadosDetalle=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionConsolidadosDetalle.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConsolidadosDetalle.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConsolidadosDetalle.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsolidadosDetalle.add(this.jTextFieldPathArchivoImportacionConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionConsolidadosDetalle = new JButtonMe();
		this.jButtonGenerarImportacionConsolidadosDetalle.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionConsolidadosDetalle,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionConsolidadosDetalle.setToolTipText("Generar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsolidadosDetalle.add(this.jButtonGenerarImportacionConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionConsolidadosDetalle = new JButtonMe();
		this.jButtonCerrarImportacionConsolidadosDetalle.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionConsolidadosDetalle,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionConsolidadosDetalle.setToolTipText("Cancelar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYImportacion;
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsolidadosDetalle.add(this.jButtonCerrarImportacionConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalConsolidadosDetalle = new GridBagLayout();
		
		this.jScrollPanelImportacionConsolidadosDetalle= new JScrollPane(jPanelImportacionConsolidadosDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy =iPosYImportacion;
		this.gridBagConstraintsConsolidadosDetalle.gridx =iPosXImportacion;
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionConsolidadosDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionConsolidadosDetalle.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalConsolidadosDetalle);
		this.jInternalFrameImportacionConsolidadosDetalle.getContentPane().add(this.jScrollPanelImportacionConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByConsolidadosDetalle(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByConsolidadosDetalle = new JButtonMe();
			this.jButtonAbrirOrderByConsolidadosDetalle.setText("Orden");
			this.jButtonAbrirOrderByConsolidadosDetalle.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConsolidadosDetalle,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByConsolidadosDetalle";
			inputMap = this.jButtonAbrirOrderByConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByConsolidadosDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByConsolidadosDetalle"));
		
		
			GridBagLayout gridaBagLayoutOrderByConsolidadosDetalle = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByConsolidadosDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByConsolidadosDetalle.setName("jPanelOrderByConsolidadosDetalle"); 
			
			this.jPanelOrderByConsolidadosDetalle.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConsolidadosDetalle.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConsolidadosDetalle.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByConsolidadosDetalle.setLayout(gridaBagLayoutOrderByConsolidadosDetalle);
			
			
			this.jTableDatosConsolidadosDetalleOrderBy = new JTableMe();        
			this.jTableDatosConsolidadosDetalleOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosConsolidadosDetalleOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosConsolidadosDetalleOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosConsolidadosDetalleOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosConsolidadosDetalleOrderBy.setViewportView(this.jTableDatosConsolidadosDetalleOrderBy);
			this.jTableDatosConsolidadosDetalleOrderBy.setFillsViewportHeight(true);
			this.jTableDatosConsolidadosDetalleOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByConsolidadosDetalle= new OrderByJInternalFrame();
			this.jInternalFrameOrderByConsolidadosDetalle= new OrderByJInternalFrame();
			this.jScrollPanelOrderByConsolidadosDetalle = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteConsolidadosDetalle= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByConsolidadosDetalle.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByConsolidadosDetalle.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByConsolidadosDetalle.setTitle("Orden");
			this.jInternalFrameOrderByConsolidadosDetalle.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByConsolidadosDetalle.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByConsolidadosDetalle.setResizable(true);
			this.jInternalFrameOrderByConsolidadosDetalle.setClosable(true);
			this.jInternalFrameOrderByConsolidadosDetalle.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByConsolidadosDetalle.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConsolidadosDetalle.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConsolidadosDetalle.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consolidados Detalles"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.gridy =iPosYOrderBy++;
			this.gridBagConstraintsConsolidadosDetalle.gridx =iPosXOrderBy;
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsConsolidadosDetalle.ipady =150;
				
			this.jPanelOrderByConsolidadosDetalle.add(jScrollPanelDatosConsolidadosDetalleOrderBy, this.gridBagConstraintsConsolidadosDetalle);//this.jTableDatosConsolidadosDetalleTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByConsolidadosDetalle = new JButtonMe();
			this.jButtonCerrarOrderByConsolidadosDetalle.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByConsolidadosDetalle,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByConsolidadosDetalle.setToolTipText("Cancelar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.gridy = iPosYOrderBy++;
			this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXOrderBy;
									
			this.jPanelOrderByConsolidadosDetalle.add(this.jButtonCerrarOrderByConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalConsolidadosDetalle = new GridBagLayout();
			
			this.jScrollPanelOrderByConsolidadosDetalle= new JScrollPane(jPanelOrderByConsolidadosDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.gridy =iPosYOrderBy;
			this.gridBagConstraintsConsolidadosDetalle.gridx =iPosXOrderBy;
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByConsolidadosDetalle.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByConsolidadosDetalle.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalConsolidadosDetalle);
			
			this.jInternalFrameOrderByConsolidadosDetalle.getContentPane().add(this.jScrollPanelOrderByConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);			
		
		} else {
			this.jButtonAbrirOrderByConsolidadosDetalle = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.consolidadosdetalleSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosConsolidadosDetalle.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosConsolidadosDetalle.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosConsolidadosDetalle.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosConsolidadosDetalle.getRowHeight();//ConsolidadosDetalleConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ConsolidadosDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConsolidadosDetalle.isSelected()) {
					iHeightTable=ConsolidadosDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConsolidadosDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConsolidadosDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ConsolidadosDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConsolidadosDetalle.isSelected()) {
					iHeightTable=ConsolidadosDetalleConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConsolidadosDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConsolidadosDetalleConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosConsolidadosDetalle.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConsolidadosDetalle.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConsolidadosDetalle.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosConsolidadosDetalle.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConsolidadosDetalle.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConsolidadosDetalle.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByConsolidadosDetalle!=null && this.jInternalFrameOrderByConsolidadosDetalle.getjTableDatosOrderBy()!=null) {
			//if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByConsolidadosDetalle.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByConsolidadosDetalle.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByConsolidadosDetalle.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByConsolidadosDetalle.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByConsolidadosDetalle.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByConsolidadosDetalle.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByConsolidadosDetalle.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosConsolidadosDetalle.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConsolidadosDetalle.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConsolidadosDetalle.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=consolidadosdetalleLogic.getConsolidadosDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consolidadosdetalles.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ConsolidadosDetalle> TraerConsolidadosDetalleBeans(List<ConsolidadosDetalle> consolidadosdetalles,ArrayList<Classe> classes)throws Exception {
		try {
			for(ConsolidadosDetalle consolidadosdetalle:consolidadosdetalles) {
					
				if(!(ConsolidadosDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ConsolidadosDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					consolidadosdetalle.setsDetalleGeneralEntityReporte(ConsolidadosDetalleConstantesFunciones.getConsolidadosDetalleDescripcion(consolidadosdetalle));
										
						
					
						
					
				} else  {
							
					//consolidadosdetalle.setsDetalleGeneralEntityReporte(consolidadosdetalle.getsDetalleGeneralEntityReporte());
										
				}
				
				//consolidadosdetallebeans.add(consolidadosdetallebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return consolidadosdetalles;
    }
	//PARA REPORTES FIN
}
