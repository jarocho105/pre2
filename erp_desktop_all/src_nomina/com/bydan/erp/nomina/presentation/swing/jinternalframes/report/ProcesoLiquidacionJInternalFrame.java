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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;





//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.ProcesoLiquidacionConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class ProcesoLiquidacionJInternalFrame extends ProcesoLiquidacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoLiquidacion;
	
	protected JMenuBar jmenuBarProcesoLiquidacion;
	
	protected JMenu jmenuProcesoLiquidacion;
	protected JMenu jmenuDatosProcesoLiquidacion;
	protected JMenu jmenuArchivoProcesoLiquidacion;
	protected JMenu jmenuAccionesProcesoLiquidacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoLiquidacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoLiquidacion;	
	protected GridBagConstraints gridBagConstraintsProcesoLiquidacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoLiquidacionDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoLiquidacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoLiquidacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoLiquidacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ProcesoLiquidacionSessionBean procesoliquidacionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoLiquidacion> procesoliquidacions;		
	public List<ProcesoLiquidacion> procesoliquidacionsEliminados;	
	public List<ProcesoLiquidacion> procesoliquidacionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoLiquidacion;		
	protected JButton jButtonAbrirOrderByProcesoLiquidacion;
	
	
	//protected JPanel jPanelOrderByProcesoLiquidacion;
	//public JScrollPane jScrollPanelOrderByProcesoLiquidacion;	
	//protected JButton jButtonCerrarOrderByProcesoLiquidacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoLiquidacionLogic procesoliquidacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoLiquidacion;
	public JScrollPane jScrollPanelDatosEdicionProcesoLiquidacion;
	public JScrollPane jScrollPanelDatosGeneralProcesoLiquidacion;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoLiquidacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoLiquidacion;
	//public JScrollPane jScrollPanelImportacionProcesoLiquidacion;
	
	
	
	protected JPanel jPanelAccionesProcesoLiquidacion;
	
    protected JPanel jPanelPaginacionProcesoLiquidacion;
    protected JPanel jPanelParametrosReportesProcesoLiquidacion;
	protected JPanel jPanelParametrosReportesAccionesProcesoLiquidacion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoLiquidacion;
	protected JPanel jPanelParametrosAuxiliar2ProcesoLiquidacion;
	protected JPanel jPanelParametrosAuxiliar3ProcesoLiquidacion;
	protected JPanel jPanelParametrosAuxiliar4ProcesoLiquidacion;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoLiquidacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoLiquidacion;
	//protected JPanel jPanelImportacionProcesoLiquidacion;
	
	
	public JTable jTableDatosProcesoLiquidacion;
	
	
	
	//public JTable jTableDatosProcesoLiquidacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoLiquidacion;
	protected JButton jButtonDuplicarProcesoLiquidacion;
	protected JButton jButtonCopiarProcesoLiquidacion;
	protected JButton jButtonVerFormProcesoLiquidacion;
	protected JButton jButtonNuevoRelacionesProcesoLiquidacion;
	protected JButton jButtonModificarProcesoLiquidacion;
	
    protected JButton jButtonGuardarCambiosTablaProcesoLiquidacion;
	protected JButton jButtonCerrarProcesoLiquidacion;
	
	
	protected JButton jButtonRecargarInformacionProcesoLiquidacion;
	protected JButton jButtonProcesarInformacionProcesoLiquidacion;
	
	
	protected JButton jButtonAnterioresProcesoLiquidacion;
	protected JButton jButtonSiguientesProcesoLiquidacion;
	protected JButton jButtonNuevoGuardarCambiosProcesoLiquidacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoLiquidacion;
	//protected JButton jButtonCerrarReporteDinamicoProcesoLiquidacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoLiquidacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoLiquidacion;
	//protected JButton jButtonGenerarImportacionProcesoLiquidacion;
	//protected JButton jButtonCerrarImportacionProcesoLiquidacion;
	//protected JFileChooser jFileChooserImportacionProcesoLiquidacion;
	//protected File fileImportacionProcesoLiquidacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoLiquidacion;
	protected JButton jButtonDuplicarToolBarProcesoLiquidacion;
	protected JButton jButtonNuevoRelacionesToolBarProcesoLiquidacion;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoLiquidacion;
	protected JButton jButtonCopiarToolBarProcesoLiquidacion;
	protected JButton jButtonVerFormToolBarProcesoLiquidacion;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoLiquidacion;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoLiquidacion;
	protected JButton jButtonCerrarToolBarProcesoLiquidacion;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoLiquidacion;
	protected JButton jButtonProcesarInformacionToolBarProcesoLiquidacion;
	protected JButton jButtonAnterioresToolBarProcesoLiquidacion;
	protected JButton jButtonSiguientesToolBarProcesoLiquidacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoLiquidacion;
	protected JButton jButtonAbrirOrderByToolBarProcesoLiquidacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoLiquidacion;
	protected JMenuItem jMenuItemDuplicarProcesoLiquidacion;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoLiquidacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoLiquidacion;
	protected JMenuItem jMenuItemCopiarProcesoLiquidacion;
	protected JMenuItem jMenuItemVerFormProcesoLiquidacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoLiquidacion;
	protected JMenuItem jMenuItemCerrarProcesoLiquidacion;
	protected JMenuItem jMenuItemDetalleCerrarProcesoLiquidacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoLiquidacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoLiquidacion;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoLiquidacion;
	protected JMenuItem jMenuItemProcesarInformacionProcesoLiquidacion;
	protected JMenuItem jMenuItemAnterioresProcesoLiquidacion;
	protected JMenuItem jMenuItemSiguientesProcesoLiquidacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoLiquidacion;
	protected JMenuItem jMenuItemAbrirOrderByProcesoLiquidacion;
	protected JMenuItem jMenuItemMostrarOcultarProcesoLiquidacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoLiquidacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoLiquidacion;
	protected JCheckBox jCheckBoxSeleccionadosProcesoLiquidacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoLiquidacion;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoLiquidacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoLiquidacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoLiquidacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoLiquidacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoLiquidacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoLiquidacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoLiquidacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoLiquidacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoLiquidacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoLiquidacion;
	protected JTextField jTextFieldValorCampoGeneralProcesoLiquidacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoLiquidacion;
	//public JList<Reporte> jListColumnasSelectReporteProcesoLiquidacion;
	//public JScrollPane jScrollColumnasSelectReporteProcesoLiquidacion;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoLiquidacion;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoLiquidacion;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoLiquidacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoLiquidacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoLiquidacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoLiquidacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoLiquidacion;
	
		
	//public JLabel jLabelArchivoImportacionProcesoLiquidacion;	
	//public JLabel jLabelPathArchivoImportacionProcesoLiquidacion;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoLiquidacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoLiquidacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoLiquidacion;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoLiquidacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoLiquidacion;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoLiquidacion;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoLiquidacion;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoLiquidacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoLiquidacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoLiquidacion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoLiquidacion;
	public JPanel jPanelBusquedaProcesoLiquidacionProcesoLiquidacion;
	public JButton jButtonBusquedaProcesoLiquidacionProcesoLiquidacion;
	
	public JPanel jPanelfechaBusquedaProcesoLiquidacionProcesoLiquidacion;
	public JLabel jLabelfechaBusquedaProcesoLiquidacionProcesoLiquidacion;
	//public JFormattedTextField jDateChooserfechaBusquedaProcesoLiquidacionProcesoLiquidacion;

	public JDateChooser jDateChooserfechaBusquedaProcesoLiquidacionProcesoLiquidacion;
	public JButton jButtonfechaBusquedaProcesoLiquidacionProcesoLiquidacionBusqueda= new JButtonMe();

	
	public JPanel jPaneles_reversarBusquedaProcesoLiquidacionProcesoLiquidacion;
	public JLabel jLabeles_reversarBusquedaProcesoLiquidacionProcesoLiquidacion;
	public JCheckBox jCheckBoxes_reversarBusquedaProcesoLiquidacionProcesoLiquidacion;
	public JButton jButtones_reversarBusquedaProcesoLiquidacionProcesoLiquidacionBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoLiquidacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoLiquidacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoLiquidacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoLiquidacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoLiquidacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoLiquidacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoLiquidacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoLiquidacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoLiquidacion)	{
		this.jButtonRecargarInformacionProcesoLiquidacion = jButtonRecargarInformacionProcesoLiquidacion;
	}
	
	public JButton getjButtonProcesarInformacionProcesoLiquidacion() {
		return this.jButtonProcesarInformacionProcesoLiquidacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoLiquidacion)	{
		this.jButtonProcesarInformacionProcesoLiquidacion = jButtonProcesarInformacionProcesoLiquidacion;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoLiquidacion() {
		return this.jButtonRecargarInformacionProcesoLiquidacion;
	}
	
	
	public List<ProcesoLiquidacion> getprocesoliquidacions() {
		return this.procesoliquidacions;
	}

	public void setprocesoliquidacions(List<ProcesoLiquidacion> procesoliquidacions) {
		this.procesoliquidacions = procesoliquidacions;
	}
	
	public List<ProcesoLiquidacion> getprocesoliquidacionsAux() {
		return this.procesoliquidacionsAux;
	}

	public void setprocesoliquidacionsAux(List<ProcesoLiquidacion> procesoliquidacionsAux) {
		this.procesoliquidacionsAux = procesoliquidacionsAux;
	}
	
	public List<ProcesoLiquidacion> getprocesoliquidacionsEliminados() {
		return this.procesoliquidacionsEliminados;
	}

	public void setProcesoLiquidacionsEliminados(List<ProcesoLiquidacion> procesoliquidacionsEliminados) {
		this.procesoliquidacionsEliminados = procesoliquidacionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoLiquidacion() {
		return jComboBoxTiposSeleccionarProcesoLiquidacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoLiquidacion(
			JComboBox jComboBoxTiposSeleccionarProcesoLiquidacion) {
		this.jComboBoxTiposSeleccionarProcesoLiquidacion = jComboBoxTiposSeleccionarProcesoLiquidacion;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoLiquidacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoLiquidacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoLiquidacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoLiquidacion() {
		return jTextFieldValorCampoGeneralProcesoLiquidacion;
	}

	public void setjTextFieldValorCampoGeneralProcesoLiquidacion(
			JTextField jTextFieldValorCampoGeneralProcesoLiquidacion) {
		this.jTextFieldValorCampoGeneralProcesoLiquidacion = jTextFieldValorCampoGeneralProcesoLiquidacion;
	}

	public void setBorderResaltarValorCampoGeneralProcesoLiquidacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoLiquidacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoLiquidacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoLiquidacion() {
		return this.jCheckBoxSeleccionarTodosProcesoLiquidacion;
	}

	public void setjCheckBoxSeleccionarTodosProcesoLiquidacion(
			JCheckBox jCheckBoxSeleccionarTodosProcesoLiquidacion) {
		this.jCheckBoxSeleccionarTodosProcesoLiquidacion = jCheckBoxSeleccionarTodosProcesoLiquidacion;
	}

	public void setBorderResaltarSeleccionarTodosProcesoLiquidacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoLiquidacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoLiquidacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoLiquidacion() {
		return this.jCheckBoxSeleccionadosProcesoLiquidacion;
	}

	public void setjCheckBoxSeleccionadosProcesoLiquidacion(
			JCheckBox jCheckBoxSeleccionadosProcesoLiquidacion) {
		this.jCheckBoxSeleccionadosProcesoLiquidacion = jCheckBoxSeleccionadosProcesoLiquidacion;
	}
	
	public void setBorderResaltarSeleccionadosProcesoLiquidacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoLiquidacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoLiquidacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoLiquidacion() {
		return this.jComboBoxTiposArchivosReportesProcesoLiquidacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoLiquidacion(
			JComboBox jComboBoxTiposArchivosReportesProcesoLiquidacion) {
		this.jComboBoxTiposArchivosReportesProcesoLiquidacion = jComboBoxTiposArchivosReportesProcesoLiquidacion;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoLiquidacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoLiquidacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoLiquidacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoLiquidacion() {
		return this.jComboBoxTiposReportesProcesoLiquidacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoLiquidacion(
			JComboBox jComboBoxTiposReportesProcesoLiquidacion) {
		this.jComboBoxTiposReportesProcesoLiquidacion = jComboBoxTiposReportesProcesoLiquidacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoLiquidacion() {
	//	return jComboBoxTiposReportesDinamicoProcesoLiquidacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoLiquidacion(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoLiquidacion) {
	//	this.jComboBoxTiposReportesDinamicoProcesoLiquidacion = jComboBoxTiposReportesDinamicoProcesoLiquidacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoLiquidacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoLiquidacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoLiquidacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoLiquidacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoLiquidacion = jComboBoxTiposArchivosReportesDinamicoProcesoLiquidacion;
	//}
	
	public void setBorderResaltarTiposReportesProcesoLiquidacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoLiquidacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoLiquidacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoLiquidacion() {
		return this.jComboBoxTiposGraficosReportesProcesoLiquidacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoLiquidacion(
			JComboBox jComboBoxTiposGraficosReportesProcesoLiquidacion) {
		this.jComboBoxTiposGraficosReportesProcesoLiquidacion = jComboBoxTiposGraficosReportesProcesoLiquidacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoLiquidacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoLiquidacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoLiquidacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoLiquidacion() {
		return this.jComboBoxTiposPaginacionProcesoLiquidacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoLiquidacion(
			JComboBox jComboBoxTiposPaginacionProcesoLiquidacion) {
		this.jComboBoxTiposPaginacionProcesoLiquidacion = jComboBoxTiposPaginacionProcesoLiquidacion;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoLiquidacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoLiquidacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoLiquidacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoLiquidacion() {
		return this.jComboBoxTiposRelacionesProcesoLiquidacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoLiquidacion() {
		return this.jComboBoxTiposAccionesProcesoLiquidacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoLiquidacion(
			JComboBox jComboBoxTiposRelacionesProcesoLiquidacion) {
		this.jComboBoxTiposRelacionesProcesoLiquidacion = jComboBoxTiposRelacionesProcesoLiquidacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoLiquidacion(
			JComboBox jComboBoxTiposAccionesProcesoLiquidacion) {
		this.jComboBoxTiposAccionesProcesoLiquidacion = jComboBoxTiposAccionesProcesoLiquidacion;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoLiquidacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoLiquidacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoLiquidacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoLiquidacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoLiquidacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoLiquidacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoLiquidacion() {
	//	return jCheckBoxConGraficoDinamicoProcesoLiquidacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoLiquidacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoLiquidacion) {
	//	this.jCheckBoxConGraficoDinamicoProcesoLiquidacion = jCheckBoxConGraficoDinamicoProcesoLiquidacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoLiquidacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoLiquidacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoLiquidacion .setBorder(borderResaltar);		
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
		this.procesoliquidacionSessionBean=new ProcesoLiquidacionSessionBean();
		
		this.procesoliquidacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoliquidacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesoliquidacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoLiquidacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoLiquidacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoLiquidacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoLiquidacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoLiquidacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Liquidacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoLiquidacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoLiquidacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoLiquidacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoLiquidacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoLiquidacion,this.jTtoolBarProcesoLiquidacion,
							"nuevo","nuevo","Nuevo"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoLiquidacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoLiquidacion,this.jTtoolBarProcesoLiquidacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoLiquidacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoLiquidacion,this.jTtoolBarProcesoLiquidacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoLiquidacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoLiquidacion,this.jTtoolBarProcesoLiquidacion,
							"duplicar","duplicar","Duplicar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoLiquidacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoLiquidacion,this.jTtoolBarProcesoLiquidacion,
							"copiar","copiar","Copiar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoLiquidacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoLiquidacion,this.jTtoolBarProcesoLiquidacion,
							"ver_form","ver_form","Ver"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoLiquidacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoLiquidacion,this.jTtoolBarProcesoLiquidacion,
							"recargar","recargar","Procesar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoLiquidacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoLiquidacion,this.jTtoolBarProcesoLiquidacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoLiquidacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoLiquidacion,this.jTtoolBarProcesoLiquidacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoLiquidacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoLiquidacion,this.jTtoolBarProcesoLiquidacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoLiquidacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoLiquidacion,this.jTtoolBarProcesoLiquidacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoLiquidacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoLiquidacion,this.jTtoolBarProcesoLiquidacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoLiquidacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoLiquidacion,this.jTtoolBarProcesoLiquidacion,
							"cerrar","cerrar","Salir"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoLiquidacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoLiquidacion;
			
				this.jButtonProcesarInformacionToolBarProcesoLiquidacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoLiquidacion;
				
		//protected JButton jButtonModificarToolBarProcesoLiquidacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoLiquidacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoLiquidacion=new JMenuMe("General");
		this.jmenuArchivoProcesoLiquidacion=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoLiquidacion=new JMenuMe("Acciones");
		this.jmenuDatosProcesoLiquidacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoLiquidacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoLiquidacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoLiquidacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoLiquidacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoLiquidacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoLiquidacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoLiquidacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoLiquidacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoLiquidacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoLiquidacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoLiquidacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoLiquidacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoLiquidacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoLiquidacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoLiquidacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoLiquidacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoLiquidacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoLiquidacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoLiquidacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoLiquidacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoLiquidacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoLiquidacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoLiquidacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoLiquidacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoLiquidacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoLiquidacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoLiquidacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoLiquidacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoLiquidacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoLiquidacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoLiquidacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoLiquidacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoLiquidacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoLiquidacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoLiquidacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoLiquidacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoLiquidacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoLiquidacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoLiquidacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoLiquidacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoLiquidacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoLiquidacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoLiquidacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoLiquidacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoLiquidacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoLiquidacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoLiquidacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoLiquidacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoLiquidacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoLiquidacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoLiquidacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoLiquidacion.add(this.jMenuItemCerrarProcesoLiquidacion);
			
			this.jmenuAccionesProcesoLiquidacion.add(this.jMenuItemNuevoProcesoLiquidacion);
			this.jmenuAccionesProcesoLiquidacion.add(this.jMenuItemNuevoGuardarCambiosProcesoLiquidacion);
			this.jmenuAccionesProcesoLiquidacion.add(this.jMenuItemNuevoRelacionesProcesoLiquidacion);
			this.jmenuAccionesProcesoLiquidacion.add(this.jMenuItemGuardarCambiosTablaProcesoLiquidacion);		
			this.jmenuAccionesProcesoLiquidacion.add(this.jMenuItemDuplicarProcesoLiquidacion);		
			this.jmenuAccionesProcesoLiquidacion.add(this.jMenuItemCopiarProcesoLiquidacion);		
			this.jmenuAccionesProcesoLiquidacion.add(this.jMenuItemVerFormProcesoLiquidacion);		
			
			this.jmenuDatosProcesoLiquidacion.add(this.jMenuItemRecargarInformacionProcesoLiquidacion);				
			this.jmenuDatosProcesoLiquidacion.add(this.jMenuItemAnterioresProcesoLiquidacion);				
			this.jmenuDatosProcesoLiquidacion.add(this.jMenuItemSiguientesProcesoLiquidacion);				
			this.jmenuDatosProcesoLiquidacion.add(this.jMenuItemAbrirOrderByProcesoLiquidacion);				
			this.jmenuDatosProcesoLiquidacion.add(this.jMenuItemMostrarOcultarProcesoLiquidacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoLiquidacion.add(this.jMenuItemGuardarCambiosProcesoLiquidacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoLiquidacion.add(this.jmenuArchivoProcesoLiquidacion);		
			this.jmenuBarProcesoLiquidacion.add(this.jmenuAccionesProcesoLiquidacion);		
			this.jmenuBarProcesoLiquidacion.add(this.jmenuDatosProcesoLiquidacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoLiquidacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoLiquidacion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoLiquidacionProcesoLiquidacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoLiquidacionProcesoLiquidacion.setToolTipText("Procesar Proceso Liquidacion");
		this.jButtonBusquedaProcesoLiquidacionProcesoLiquidacion= new JButtonMe();
		this.jButtonBusquedaProcesoLiquidacionProcesoLiquidacion.setText("Procesar");
		this.jButtonBusquedaProcesoLiquidacionProcesoLiquidacion.setToolTipText("Procesar Proceso Liquidacion");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoLiquidacionProcesoLiquidacion,"buscar_button","Procesar Proceso Liquidacion");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoLiquidacionProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfechaBusquedaProcesoLiquidacionProcesoLiquidacion = new JLabelMe();
		jLabelfechaBusquedaProcesoLiquidacionProcesoLiquidacion.setText("Fecha :");
		jLabelfechaBusquedaProcesoLiquidacionProcesoLiquidacion.setToolTipText("Fecha");
		jLabelfechaBusquedaProcesoLiquidacionProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfechaBusquedaProcesoLiquidacionProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfechaBusquedaProcesoLiquidacionProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfechaBusquedaProcesoLiquidacionProcesoLiquidacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfechaBusquedaProcesoLiquidacionProcesoLiquidacion= new JDateChooser();
		jDateChooserfechaBusquedaProcesoLiquidacionProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaBusquedaProcesoLiquidacionProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaBusquedaProcesoLiquidacionProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaBusquedaProcesoLiquidacionProcesoLiquidacion,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfechaBusquedaProcesoLiquidacionProcesoLiquidacion.setDate(new Date());
		jDateChooserfechaBusquedaProcesoLiquidacionProcesoLiquidacion.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfechaBusquedaProcesoLiquidacionProcesoLiquidacion.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabeles_reversarBusquedaProcesoLiquidacionProcesoLiquidacion = new JLabelMe();
		jLabeles_reversarBusquedaProcesoLiquidacionProcesoLiquidacion.setText("Es Reversar :");
		jLabeles_reversarBusquedaProcesoLiquidacionProcesoLiquidacion.setToolTipText("Es Reversar");
		jLabeles_reversarBusquedaProcesoLiquidacionProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeles_reversarBusquedaProcesoLiquidacionProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeles_reversarBusquedaProcesoLiquidacionProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabeles_reversarBusquedaProcesoLiquidacionProcesoLiquidacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jCheckBoxes_reversarBusquedaProcesoLiquidacionProcesoLiquidacion= new JCheckBoxMe();
		jCheckBoxes_reversarBusquedaProcesoLiquidacionProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_reversarBusquedaProcesoLiquidacionProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_reversarBusquedaProcesoLiquidacionProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_reversarBusquedaProcesoLiquidacionProcesoLiquidacion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoLiquidacion=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoLiquidacion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoLiquidacion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProcesoLiquidacion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Proceso Liquidacion"));
		this.jTabbedPaneBusquedasProcesoLiquidacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoLiquidacion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoLiquidacion = new ProcesoLiquidacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Liquidacion DATOS");
			this.jInternalFrameDetalleFormProcesoLiquidacion = new ProcesoLiquidacionDetalleFormJInternalFrame(jDesktopPane,this.procesoliquidacionSessionBean.getConGuardarRelaciones(),this.procesoliquidacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoLiquidacion = null;//new ProcesoLiquidacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoLiquidacion= new GridBagLayout();
		
		
		this.jTableDatosProcesoLiquidacion = new JTableMe();      
		
		String sToolTipProcesoLiquidacion="";
		sToolTipProcesoLiquidacion=ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoLiquidacion+="(Nomina.ProcesoLiquidacion)";
		}
		
		if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoLiquidacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoLiquidacion.setToolTipText(sToolTipProcesoLiquidacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoLiquidacion);
		this.jTableDatosProcesoLiquidacion.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoLiquidacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoLiquidacion.setRowSelectionAllowed(true);
		this.jTableDatosProcesoLiquidacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoLiquidacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoLiquidacion = new JButtonMe();
		this.jButtonDuplicarProcesoLiquidacion = new JButtonMe();
		this.jButtonCopiarProcesoLiquidacion = new JButtonMe();
		this.jButtonVerFormProcesoLiquidacion = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoLiquidacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoLiquidacion = new JButtonMe();
		this.jButtonCerrarProcesoLiquidacion = new JButtonMe();
		
		this.jScrollPanelDatosProcesoLiquidacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoLiquidacion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoLiquidacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Liquidacion";
		
		if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Liquidaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoLiquidacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoLiquidacion.setToolTipText("Acciones");
        this.jPanelAccionesProcesoLiquidacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoLiquidacion=new ReporteDinamicoJInternalFrame(ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoLiquidacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoLiquidacion=new ImportacionJInternalFrame(ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoLiquidacion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoLiquidacion = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoLiquidacion.setText("Orden");
		this.jButtonAbrirOrderByProcesoLiquidacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoLiquidacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoLiquidacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoLiquidacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoLiquidacion,false,this);
			
			//this.cargarOrderByProcesoLiquidacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoLiquidacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoLiquidacion,true,this);
			
			//this.cargarOrderByProcesoLiquidacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoLiquidacion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosProcesoLiquidacion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosProcesoLiquidacion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosProcesoLiquidacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoLiquidacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoLiquidacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoLiquidacion.setText("Nuevo");
		this.jButtonDuplicarProcesoLiquidacion.setText("Duplicar");
		this.jButtonCopiarProcesoLiquidacion.setText("Copiar");
		this.jButtonVerFormProcesoLiquidacion.setText("Ver");
		this.jButtonNuevoRelacionesProcesoLiquidacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoLiquidacion.setText("Guardar");
		this.jButtonCerrarProcesoLiquidacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoLiquidacion,"nuevo_button","Nuevo",this.procesoliquidacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoLiquidacion,"duplicar_button","Duplicar",this.procesoliquidacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoLiquidacion,"copiar_button","Copiar",this.procesoliquidacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoLiquidacion,"ver_form","Ver",this.procesoliquidacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoLiquidacion,"nuevorelaciones_button","Nuevo Rel",this.procesoliquidacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoLiquidacion,"guardarcambiostabla_button","Guardar",this.procesoliquidacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoLiquidacion,"cerrar_button","Salir",this.procesoliquidacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoLiquidacion.setToolTipText("Nuevo"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoLiquidacion.setToolTipText("Duplicar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoLiquidacion.setToolTipText("Copiar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoLiquidacion.setToolTipText("Ver"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoLiquidacion.setToolTipText("Nuevo Rel"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoLiquidacion.setToolTipText("Guardar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoLiquidacion.setToolTipText("Salir"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoLiquidacion";
		inputMap = this.jButtonNuevoProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoLiquidacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoLiquidacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoLiquidacion";
		inputMap = this.jButtonDuplicarProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoLiquidacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoLiquidacion"));
		
		//COPIAR
		sMapKey = "CopiarProcesoLiquidacion";
		inputMap = this.jButtonCopiarProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoLiquidacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoLiquidacion"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoLiquidacion";
		inputMap = this.jButtonVerFormProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoLiquidacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoLiquidacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoLiquidacion";
		inputMap = this.jButtonNuevoRelacionesProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoLiquidacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoLiquidacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoLiquidacion";
		inputMap = this.jButtonModificarProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoLiquidacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoLiquidacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoLiquidacion";
		inputMap = this.jButtonCerrarProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoLiquidacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoLiquidacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoLiquidacion";
		inputMap = this.jButtonGuardarCambiosTablaProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoLiquidacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoLiquidacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoLiquidacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoLiquidacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoLiquidacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoLiquidacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoLiquidacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoLiquidacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoLiquidacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoLiquidacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoLiquidacion.setName("jPanelParametrosReportesProcesoLiquidacion"); 
		
		this.jPanelParametrosReportesAccionesProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoLiquidacion.setName("jPanelParametrosReportesAccionesProcesoLiquidacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoLiquidacion = new JButtonMe();
		this.jButtonRecargarInformacionProcesoLiquidacion.setText("Procesar");
		this.jButtonRecargarInformacionProcesoLiquidacion.setToolTipText("Procesar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoLiquidacion,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesoLiquidacion.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoLiquidacion = new JButtonMe();
		this.jButtonProcesarInformacionProcesoLiquidacion.setText("Procesar");
		this.jButtonProcesarInformacionProcesoLiquidacion.setToolTipText("Procesar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoLiquidacion.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoLiquidacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoLiquidacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoLiquidacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoLiquidacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoLiquidacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoLiquidacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoLiquidacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoLiquidacion.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoLiquidacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoLiquidacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoLiquidacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoLiquidacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoLiquidacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoLiquidacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoLiquidacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoLiquidacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoLiquidacion.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoLiquidacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoLiquidacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoLiquidacion.setText("Accion");
		this.jComboBoxTiposAccionesProcesoLiquidacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoLiquidacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoLiquidacion.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoLiquidacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoLiquidacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoLiquidacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoLiquidacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoLiquidacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoLiquidacion = new JLabelMe();
		
		this.jLabelAccionesProcesoLiquidacion.setText("Acciones");		
		this.jLabelAccionesProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoLiquidacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoLiquidacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoLiquidacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoLiquidacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoLiquidacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoLiquidacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoLiquidacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoLiquidacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoLiquidacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoLiquidacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoLiquidacion.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoLiquidacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoLiquidacion = new JButtonMe();
		//this.jButtonAnterioresProcesoLiquidacion.setText("<<");
        this.jButtonAnterioresProcesoLiquidacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoLiquidacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoLiquidacion = new JButtonMe();
		//this.jButtonSiguientesProcesoLiquidacion.setText(">>");
        this.jButtonSiguientesProcesoLiquidacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoLiquidacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoLiquidacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoLiquidacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoLiquidacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoLiquidacion,"nuevoguardarcambios_button","Nue",this.procesoliquidacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoLiquidacion";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoLiquidacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoLiquidacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoLiquidacion";
		inputMap = this.jButtonRecargarInformacionProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoLiquidacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoLiquidacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoLiquidacion";
		inputMap = this.jButtonSiguientesProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoLiquidacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoLiquidacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoLiquidacion";
		inputMap = this.jButtonAnterioresProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoLiquidacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoLiquidacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoLiquidacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoLiquidacion.setMinimumSize(new Dimension(this.getWidth(),ProcesoLiquidacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoLiquidacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoLiquidacion.setMaximumSize(new Dimension(this.getWidth(),ProcesoLiquidacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoLiquidacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoLiquidacion.setPreferredSize(new Dimension(this.getWidth(),ProcesoLiquidacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoLiquidacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoLiquidacion = new GridBagLayout();

			this.jPanelPaginacionProcesoLiquidacion.setLayout(gridaBagLayoutPaginacionProcesoLiquidacion);						
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.gridy = 0;
			this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoLiquidacion.add(this.jButtonAnterioresProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
					
						
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoLiquidacion.gridy = 0;
			
			this.jPanelPaginacionProcesoLiquidacion.add(this.jButtonNuevoGuardarCambiosProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
						
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoLiquidacion.gridy = 0;
			this.jPanelPaginacionProcesoLiquidacion.add(this.jButtonSiguientesProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.gridy = 1;
			this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoLiquidacion.add(this.jButtonNuevoProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
						
			
			
			if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
				this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoLiquidacion.gridy = 1;
				this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoLiquidacion.add(this.jButtonGuardarCambiosTablaProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
			}
			
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.gridy = 1;
			this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoLiquidacion.add(this.jButtonProcesarInformacionProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.gridy = 1;
			this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoLiquidacion.add(this.jButtonDuplicarProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.gridy = 1;
			this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoLiquidacion.add(this.jButtonCopiarProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.gridy = 1;
			this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoLiquidacion.add(this.jButtonVerFormProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.gridy = 1;
			this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoLiquidacion.add(this.jButtonCerrarProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		
		
		
		this.jButtonRecargarInformacionProcesoLiquidacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoLiquidacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoLiquidacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoLiquidacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoLiquidacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoLiquidacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoLiquidacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoLiquidacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoLiquidacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoLiquidacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoLiquidacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoLiquidacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoLiquidacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoLiquidacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoLiquidacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoLiquidacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoLiquidacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoLiquidacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoLiquidacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoLiquidacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoLiquidacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoLiquidacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoLiquidacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoLiquidacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoLiquidacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoLiquidacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoLiquidacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoLiquidacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoLiquidacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoLiquidacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoLiquidacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoLiquidacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoLiquidacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoLiquidacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoLiquidacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoLiquidacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoLiquidacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoLiquidacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoLiquidacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoLiquidacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoLiquidacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoLiquidacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoLiquidacion.setLayout(gridaBagParametrosReportesProcesoLiquidacion);
			this.jPanelParametrosReportesAccionesProcesoLiquidacion.setLayout(gridaBagParametrosReportesAccionesProcesoLiquidacion);
			
			
			this.jPanelParametrosAuxiliar1ProcesoLiquidacion.setLayout(gridaBagParametrosAuxiliar1ProcesoLiquidacion);
			this.jPanelParametrosAuxiliar2ProcesoLiquidacion.setLayout(gridaBagParametrosAuxiliar2ProcesoLiquidacion);
			this.jPanelParametrosAuxiliar3ProcesoLiquidacion.setLayout(gridaBagParametrosAuxiliar3ProcesoLiquidacion);
			this.jPanelParametrosAuxiliar4ProcesoLiquidacion.setLayout(gridaBagParametrosAuxiliar4ProcesoLiquidacion);
			//this.jPanelParametrosAuxiliar5ProcesoLiquidacion.setLayout(gridaBagParametrosAuxiliar2ProcesoLiquidacion);			
			
			
			
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoLiquidacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoLiquidacion.add(this.jButtonRecargarInformacionProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoLiquidacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoLiquidacion.add(this.jComboBoxTiposPaginacionProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoLiquidacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoLiquidacion.add(this.jCheckBoxConAltoMaximoTablaProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoLiquidacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoLiquidacion.add(this.jComboBoxTiposArchivosReportesProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoLiquidacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoLiquidacion.add(this.jPanelParametrosAuxiliar1ProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoLiquidacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoLiquidacion.add(this.jComboBoxTiposReportesProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoLiquidacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoLiquidacion.add(this.jPanelParametrosAuxiliar4ProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoLiquidacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoLiquidacion.add(this.jComboBoxTiposReportesProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoLiquidacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoLiquidacion.add(this.jCheckBoxGenerarReporteProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoLiquidacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoLiquidacion.add(this.jPanelParametrosAuxiliar2ProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoLiquidacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoLiquidacion.add(this.jLabelAccionesProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoLiquidacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoLiquidacion.add(this.jComboBoxTiposSeleccionarProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);			
			
			
			/*
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoLiquidacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoLiquidacion.add(this.jCheckBoxSeleccionarTodosProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoLiquidacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoLiquidacion.add(this.jCheckBoxSeleccionarTodosProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);															
				
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoLiquidacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoLiquidacion.add(this.jCheckBoxSeleccionadosProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoLiquidacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoLiquidacion.add(this.jPanelParametrosAuxiliar3ProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoLiquidacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoLiquidacion.add(this.jComboBoxTiposAccionesProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoLiquidacion = new GridBagLayout();

			this.jScrollPanelDatosProcesoLiquidacion.setLayout(gridaBagLayoutDatosProcesoLiquidacion);
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.gridy = 0;
			this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
			
			this.jScrollPanelDatosProcesoLiquidacion.add(this.jTableDatosProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoLiquidacion.setViewportView(this.jTableDatosProcesoLiquidacion);
		this.jTableDatosProcesoLiquidacion.setFillsViewportHeight(true);
		this.jTableDatosProcesoLiquidacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoLiquidacion= new GridBagLayout();
		this.jPanelAccionesProcesoLiquidacion.setLayout(gridaBagLayoutAccionesProcesoLiquidacion);
		
		
		/*	
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = 0;
		this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
			
		this.jPanelAccionesProcesoLiquidacion.add(this.jButtonNuevoProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoLiquidacionProcesoLiquidacion= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoLiquidacionProcesoLiquidacion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoLiquidacionProcesoLiquidacion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoLiquidacionProcesoLiquidacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoLiquidacionProcesoLiquidacion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoLiquidacionProcesoLiquidacion.setLayout(gridaBagLayoutBusquedaProcesoLiquidacionProcesoLiquidacion);

		gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoLiquidacion.gridy = 0;
		gridBagConstraintsProcesoLiquidacion.gridx = 0;
		jPanelBusquedaProcesoLiquidacionProcesoLiquidacion.add(jLabelfechaBusquedaProcesoLiquidacionProcesoLiquidacion, gridBagConstraintsProcesoLiquidacion);

		gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoLiquidacion.gridy = 0;
		gridBagConstraintsProcesoLiquidacion.gridx = 1;
		jPanelBusquedaProcesoLiquidacionProcesoLiquidacion.add(jDateChooserfechaBusquedaProcesoLiquidacionProcesoLiquidacion, gridBagConstraintsProcesoLiquidacion);


		gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoLiquidacion.gridy = 1;
		gridBagConstraintsProcesoLiquidacion.gridx = 0;
		jPanelBusquedaProcesoLiquidacionProcesoLiquidacion.add(jLabeles_reversarBusquedaProcesoLiquidacionProcesoLiquidacion, gridBagConstraintsProcesoLiquidacion);

		gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoLiquidacion.gridy = 1;
		gridBagConstraintsProcesoLiquidacion.gridx = 1;
		jPanelBusquedaProcesoLiquidacionProcesoLiquidacion.add(jCheckBoxes_reversarBusquedaProcesoLiquidacionProcesoLiquidacion, gridBagConstraintsProcesoLiquidacion);

		gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoLiquidacion.gridy = 2;
		gridBagConstraintsProcesoLiquidacion.gridx =1;
		jPanelBusquedaProcesoLiquidacionProcesoLiquidacion.add(jButtonBusquedaProcesoLiquidacionProcesoLiquidacion, gridBagConstraintsProcesoLiquidacion);

		jTabbedPaneBusquedasProcesoLiquidacion.addTab("1.-Por Fecha Por Es Reversar ", jPanelBusquedaProcesoLiquidacionProcesoLiquidacion);
		jTabbedPaneBusquedasProcesoLiquidacion.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoLiquidacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoLiquidacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();						
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoLiquidacion.gridx = 0;		
			//this.gridBagConstraintsProcesoLiquidacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoLiquidacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoLiquidacion.gridx = 0;		
		//this.gridBagConstraintsProcesoLiquidacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoLiquidacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoLiquidacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoLiquidacion.gridx = 0;		
			this.gridBagConstraintsProcesoLiquidacion.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoLiquidacion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);								
		
		
		/*
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		*/		
		
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoLiquidacion.gridx =0;
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoLiquidacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
				
		
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoLiquidacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoLiquidacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoLiquidacion = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoLiquidacion.setLayout(gridaBagLayoutBusquedasParametrosProcesoLiquidacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoLiquidacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoLiquidacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoLiquidacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoLiquidacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
			
			
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoLiquidacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		
			
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoLiquidacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoLiquidacion.setVisible(false);
		this.jButtonAnterioresProcesoLiquidacion.setVisible(false);
		this.jButtonSiguientesProcesoLiquidacion.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoLiquidacion.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoLiquidacion.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoLiquidacion.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoLiquidacion.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoLiquidacion.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoLiquidacion.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoLiquidacion.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoLiquidacion.setVisible(false);
		this.jComboBoxTiposReportesProcesoLiquidacion.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoLiquidacion.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoLiquidacion.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoLiquidacion.setVisible(false);
		this.jComboBoxTiposAccionesProcesoLiquidacion.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoLiquidacion.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoLiquidacion.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoLiquidacion.setVisible(false);
		
		this.jPanelParametrosReportesProcesoLiquidacion.setVisible(false);
		
		
		this.jTtoolBarProcesoLiquidacion.setVisible(false);
			
		this.jMenuItemAnterioresProcesoLiquidacion.setVisible(false);
		this.jMenuItemSiguientesProcesoLiquidacion.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoLiquidacion.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoLiquidacion.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoLiquidacion.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoLiquidacion.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoLiquidacion.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoLiquidacion.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoLiquidacion.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoLiquidacion.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoLiquidacion.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoLiquidacion.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoLiquidacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoLiquidacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoLiquidacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoLiquidacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoLiquidacion.setName("jPanelReporteDinamicoProcesoLiquidacion"); 
		
		this.jPanelReporteDinamicoProcesoLiquidacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoLiquidacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoLiquidacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoLiquidacion.setLayout(gridaBagLayoutReporteDinamicoProcesoLiquidacion);
		
		
		this.jInternalFrameReporteDinamicoProcesoLiquidacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoLiquidacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoLiquidacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoLiquidacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoLiquidacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoLiquidacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoLiquidacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoLiquidacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoLiquidacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoLiquidacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoLiquidacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoLiquidacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoLiquidacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoLiquidacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Liquidaciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoLiquidacion = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoLiquidacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoLiquidacion.add(this.jLabelColumnasSelectReporteProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoLiquidacion = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoLiquidacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoLiquidacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoLiquidacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoLiquidacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoLiquidacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoLiquidacion=new JScrollPane(this.jListColumnasSelectReporteProcesoLiquidacion);
			
			this.jScrollColumnasSelectReporteProcesoLiquidacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoLiquidacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoLiquidacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoLiquidacion.add(this.jListColumnasSelectReporteProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		this.jPanelReporteDinamicoProcesoLiquidacion.add(this.jScrollColumnasSelectReporteProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoLiquidacion = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoLiquidacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoLiquidacion = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoLiquidacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoLiquidacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoLiquidacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoLiquidacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoLiquidacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoLiquidacion=new JScrollPane(this.jListRelacionesSelectReporteProcesoLiquidacion);
			
			this.jScrollRelacionesSelectReporteProcesoLiquidacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoLiquidacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoLiquidacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoLiquidacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoLiquidacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoLiquidacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoLiquidacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoLiquidacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoLiquidacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoLiquidacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoLiquidacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoLiquidacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoLiquidacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoLiquidacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoLiquidacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoLiquidacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoLiquidacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoLiquidacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoLiquidacion.add(this.jLabelGenerarExcelReporteDinamicoProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoLiquidacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoLiquidacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoLiquidacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoLiquidacion.setToolTipText("Generar EXCEL"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		//this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoLiquidacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoLiquidacion.add(this.jButtonGenerarExcelReporteDinamicoProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoLiquidacion.add(this.jComboBoxTiposReportesDinamicoProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoLiquidacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoLiquidacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoLiquidacion.add(this.jLabelTiposArchivoReporteDinamicoProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoLiquidacion.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoLiquidacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoLiquidacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoLiquidacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoLiquidacion.setToolTipText("Generar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoLiquidacion.add(this.jButtonGenerarReporteDinamicoProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoLiquidacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoLiquidacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoLiquidacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoLiquidacion.setToolTipText("Cancelar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoLiquidacion.add(this.jButtonCerrarReporteDinamicoProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoLiquidacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoLiquidacion= new JScrollPane(jPanelReporteDinamicoProcesoLiquidacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoLiquidacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoLiquidacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoLiquidacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Liquidaciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoLiquidacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoLiquidacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoLiquidacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoLiquidacion);
		this.jInternalFrameReporteDinamicoProcesoLiquidacion.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoLiquidacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoLiquidacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoLiquidacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoLiquidacion.setName("jPanelImportacionProcesoLiquidacion"); 
		
		this.jPanelImportacionProcesoLiquidacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoLiquidacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoLiquidacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoLiquidacion.setLayout(gridaBagLayoutImportacionProcesoLiquidacion);
		
		
		this.jInternalFrameImportacionProcesoLiquidacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoLiquidacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoLiquidacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoLiquidacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoLiquidacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoLiquidacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoLiquidacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoLiquidacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoLiquidacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoLiquidacion.setResizable(true);
	    this.jInternalFrameImportacionProcesoLiquidacion.setClosable(true);
	    this.jInternalFrameImportacionProcesoLiquidacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoLiquidacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoLiquidacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoLiquidacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoLiquidacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoLiquidacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoLiquidacion.setResizable(true);
	    this.jInternalFrameImportacionProcesoLiquidacion.setClosable(true);
	    this.jInternalFrameImportacionProcesoLiquidacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoLiquidacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoLiquidacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoLiquidacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Liquidaciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoLiquidacion = new JLabelMe();

		this.jLabelArchivoImportacionProcesoLiquidacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoLiquidacion.add(this.jLabelArchivoImportacionProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoLiquidacion = new JFileChooser();		
		this.jFileChooserImportacionProcesoLiquidacion.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoLiquidacion = new JButtonMe();
		this.jButtonAbrirImportacionProcesoLiquidacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoLiquidacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoLiquidacion.setToolTipText("Generar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoLiquidacion.add(this.jButtonAbrirImportacionProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoLiquidacion = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoLiquidacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoLiquidacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoLiquidacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoLiquidacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoLiquidacion.add(this.jLabelPathArchivoImportacionProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoLiquidacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoLiquidacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoLiquidacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoLiquidacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoLiquidacion.add(this.jTextFieldPathArchivoImportacionProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoLiquidacion = new JButtonMe();
		this.jButtonGenerarImportacionProcesoLiquidacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoLiquidacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoLiquidacion.setToolTipText("Generar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoLiquidacion.add(this.jButtonGenerarImportacionProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoLiquidacion = new JButtonMe();
		this.jButtonCerrarImportacionProcesoLiquidacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoLiquidacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoLiquidacion.setToolTipText("Cancelar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoLiquidacion.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoLiquidacion.add(this.jButtonCerrarImportacionProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoLiquidacion = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoLiquidacion= new JScrollPane(jPanelImportacionProcesoLiquidacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
		this.gridBagConstraintsProcesoLiquidacion.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoLiquidacion.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoLiquidacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoLiquidacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoLiquidacion);
		this.jInternalFrameImportacionProcesoLiquidacion.getContentPane().add(this.jScrollPanelImportacionProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoLiquidacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoLiquidacion = new JButtonMe();
			this.jButtonAbrirOrderByProcesoLiquidacion.setText("Orden");
			this.jButtonAbrirOrderByProcesoLiquidacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoLiquidacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoLiquidacion";
			inputMap = this.jButtonAbrirOrderByProcesoLiquidacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoLiquidacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoLiquidacion"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoLiquidacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoLiquidacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoLiquidacion.setName("jPanelOrderByProcesoLiquidacion"); 
			
			this.jPanelOrderByProcesoLiquidacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoLiquidacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoLiquidacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoLiquidacion.setLayout(gridaBagLayoutOrderByProcesoLiquidacion);
			
			
			this.jTableDatosProcesoLiquidacionOrderBy = new JTableMe();        
			this.jTableDatosProcesoLiquidacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoLiquidacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoLiquidacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoLiquidacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoLiquidacionOrderBy.setViewportView(this.jTableDatosProcesoLiquidacionOrderBy);
			this.jTableDatosProcesoLiquidacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoLiquidacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoLiquidacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoLiquidacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoLiquidacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoLiquidacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoLiquidacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoLiquidacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoLiquidacion.setTitle("Orden");
			this.jInternalFrameOrderByProcesoLiquidacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoLiquidacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoLiquidacion.setResizable(true);
			this.jInternalFrameOrderByProcesoLiquidacion.setClosable(true);
			this.jInternalFrameOrderByProcesoLiquidacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoLiquidacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoLiquidacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoLiquidacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoLiquidacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Liquidaciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoLiquidacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoLiquidacion.ipady =150;
				
			this.jPanelOrderByProcesoLiquidacion.add(jScrollPanelDatosProcesoLiquidacionOrderBy, this.gridBagConstraintsProcesoLiquidacion);//this.jTableDatosProcesoLiquidacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoLiquidacion = new JButtonMe();
			this.jButtonCerrarOrderByProcesoLiquidacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoLiquidacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoLiquidacion.setToolTipText("Cancelar"+" "+ProcesoLiquidacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoLiquidacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoLiquidacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoLiquidacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoLiquidacion.add(this.jButtonCerrarOrderByProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoLiquidacion = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoLiquidacion= new JScrollPane(jPanelOrderByProcesoLiquidacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoLiquidacion = new GridBagConstraints();
			this.gridBagConstraintsProcesoLiquidacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoLiquidacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoLiquidacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoLiquidacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoLiquidacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoLiquidacion);
			
			this.jInternalFrameOrderByProcesoLiquidacion.getContentPane().add(this.jScrollPanelOrderByProcesoLiquidacion, this.gridBagConstraintsProcesoLiquidacion);			
		
		} else {
			this.jButtonAbrirOrderByProcesoLiquidacion = new JButtonMe();
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
		//if(this.conMaximoRelaciones 
		//	&& this.procesoliquidacionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoLiquidacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoLiquidacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoLiquidacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoLiquidacion.getRowHeight();//ProcesoLiquidacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoLiquidacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoLiquidacion.isSelected()) {
					iHeightTable=ProcesoLiquidacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoLiquidacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoLiquidacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoLiquidacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoLiquidacion.isSelected()) {
					iHeightTable=ProcesoLiquidacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoLiquidacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoLiquidacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoLiquidacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoLiquidacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoLiquidacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoLiquidacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoLiquidacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoLiquidacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoLiquidacion!=null && this.jInternalFrameOrderByProcesoLiquidacion.getjTableDatosOrderBy()!=null) {
			//if(!this.procesoliquidacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoLiquidacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoLiquidacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoLiquidacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoLiquidacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoLiquidacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoLiquidacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoLiquidacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoLiquidacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoLiquidacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoLiquidacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesoliquidacionLogic.getProcesoLiquidacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoliquidacions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoLiquidacion> TraerProcesoLiquidacionBeans(List<ProcesoLiquidacion> procesoliquidacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoLiquidacion procesoliquidacion:procesoliquidacions) {
					
				if(!(ProcesoLiquidacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoLiquidacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesoliquidacion.setsDetalleGeneralEntityReporte(ProcesoLiquidacionConstantesFunciones.getProcesoLiquidacionDescripcion(procesoliquidacion));
										
					procesoliquidacion.setes_reversar_descripcion(ProcesoLiquidacionConstantesFunciones.getes_reversarDescripcion(procesoliquidacion));	
					
						
					
				} else  {
							
					//procesoliquidacion.setsDetalleGeneralEntityReporte(procesoliquidacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesoliquidacionbeans.add(procesoliquidacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesoliquidacions;
    }
	//PARA REPORTES FIN
}
