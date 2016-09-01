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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.ListadosCentrosCostosConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class ListadosCentrosCostosJInternalFrame extends ListadosCentrosCostosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarListadosCentrosCostos;
	
	protected JMenuBar jmenuBarListadosCentrosCostos;
	
	protected JMenu jmenuListadosCentrosCostos;
	protected JMenu jmenuDatosListadosCentrosCostos;
	protected JMenu jmenuArchivoListadosCentrosCostos;
	protected JMenu jmenuAccionesListadosCentrosCostos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosListadosCentrosCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutListadosCentrosCostos;	
	protected GridBagConstraints gridBagConstraintsListadosCentrosCostos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ListadosCentrosCostosDetalleFormJInternalFrame jInternalFrameDetalleFormListadosCentrosCostos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoListadosCentrosCostos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionListadosCentrosCostos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ListadosCentrosCostosSessionBean listadoscentroscostosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ListadosCentrosCostos> listadoscentroscostoss;		
	public List<ListadosCentrosCostos> listadoscentroscostossEliminados;	
	public List<ListadosCentrosCostos> listadoscentroscostossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByListadosCentrosCostos;		
	protected JButton jButtonAbrirOrderByListadosCentrosCostos;
	
	
	//protected JPanel jPanelOrderByListadosCentrosCostos;
	//public JScrollPane jScrollPanelOrderByListadosCentrosCostos;	
	//protected JButton jButtonCerrarOrderByListadosCentrosCostos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ListadosCentrosCostosLogic listadoscentroscostosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosListadosCentrosCostos;
	public JScrollPane jScrollPanelDatosEdicionListadosCentrosCostos;
	public JScrollPane jScrollPanelDatosGeneralListadosCentrosCostos;
    
	
	
	//public JScrollPane jScrollPanelDatosListadosCentrosCostosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoListadosCentrosCostos;
	//public JScrollPane jScrollPanelImportacionListadosCentrosCostos;
	
	
	
	protected JPanel jPanelAccionesListadosCentrosCostos;
	
    protected JPanel jPanelPaginacionListadosCentrosCostos;
    protected JPanel jPanelParametrosReportesListadosCentrosCostos;
	protected JPanel jPanelParametrosReportesAccionesListadosCentrosCostos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ListadosCentrosCostos;
	protected JPanel jPanelParametrosAuxiliar2ListadosCentrosCostos;
	protected JPanel jPanelParametrosAuxiliar3ListadosCentrosCostos;
	protected JPanel jPanelParametrosAuxiliar4ListadosCentrosCostos;
	//protected JPanel jPanelParametrosAuxiliar5ListadosCentrosCostos;
	
	
	
	//protected JPanel jPanelReporteDinamicoListadosCentrosCostos;
	//protected JPanel jPanelImportacionListadosCentrosCostos;
	
	
	public JTable jTableDatosListadosCentrosCostos;
	
	
	
	//public JTable jTableDatosListadosCentrosCostosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoListadosCentrosCostos;
	protected JButton jButtonDuplicarListadosCentrosCostos;
	protected JButton jButtonCopiarListadosCentrosCostos;
	protected JButton jButtonVerFormListadosCentrosCostos;
	protected JButton jButtonNuevoRelacionesListadosCentrosCostos;
	protected JButton jButtonModificarListadosCentrosCostos;
	
    protected JButton jButtonGuardarCambiosTablaListadosCentrosCostos;
	protected JButton jButtonCerrarListadosCentrosCostos;
	
	
	protected JButton jButtonRecargarInformacionListadosCentrosCostos;
	protected JButton jButtonProcesarInformacionListadosCentrosCostos;
	
	
	protected JButton jButtonAnterioresListadosCentrosCostos;
	protected JButton jButtonSiguientesListadosCentrosCostos;
	protected JButton jButtonNuevoGuardarCambiosListadosCentrosCostos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoListadosCentrosCostos;
	//protected JButton jButtonCerrarReporteDinamicoListadosCentrosCostos;
	//protected JButton jButtonGenerarExcelReporteDinamicoListadosCentrosCostos;	
	
	
	
	//protected JButton jButtonAbrirImportacionListadosCentrosCostos;
	//protected JButton jButtonGenerarImportacionListadosCentrosCostos;
	//protected JButton jButtonCerrarImportacionListadosCentrosCostos;
	//protected JFileChooser jFileChooserImportacionListadosCentrosCostos;
	//protected File fileImportacionListadosCentrosCostos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarListadosCentrosCostos;
	protected JButton jButtonDuplicarToolBarListadosCentrosCostos;
	protected JButton jButtonNuevoRelacionesToolBarListadosCentrosCostos;
	
	
	public JButton jButtonGuardarCambiosToolBarListadosCentrosCostos;
	protected JButton jButtonCopiarToolBarListadosCentrosCostos;
	protected JButton jButtonVerFormToolBarListadosCentrosCostos;
	public JButton jButtonGuardarCambiosTablaToolBarListadosCentrosCostos;
	protected JButton jButtonMostrarOcultarTablaToolBarListadosCentrosCostos;
	protected JButton jButtonCerrarToolBarListadosCentrosCostos;
	
	protected JButton jButtonRecargarInformacionToolBarListadosCentrosCostos;
	protected JButton jButtonProcesarInformacionToolBarListadosCentrosCostos;
	protected JButton jButtonAnterioresToolBarListadosCentrosCostos;
	protected JButton jButtonSiguientesToolBarListadosCentrosCostos;
	protected JButton jButtonNuevoGuardarCambiosToolBarListadosCentrosCostos;
	protected JButton jButtonAbrirOrderByToolBarListadosCentrosCostos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoListadosCentrosCostos;
	protected JMenuItem jMenuItemDuplicarListadosCentrosCostos;
	protected JMenuItem jMenuItemNuevoRelacionesListadosCentrosCostos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosListadosCentrosCostos;
	protected JMenuItem jMenuItemCopiarListadosCentrosCostos;
	protected JMenuItem jMenuItemVerFormListadosCentrosCostos;
	protected JMenuItem jMenuItemGuardarCambiosTablaListadosCentrosCostos;
	protected JMenuItem jMenuItemCerrarListadosCentrosCostos;
	protected JMenuItem jMenuItemDetalleCerrarListadosCentrosCostos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByListadosCentrosCostos;
	protected JMenuItem jMenuItemDetalleMostarOcultarListadosCentrosCostos;
	
	protected JMenuItem jMenuItemRecargarInformacionListadosCentrosCostos;
	protected JMenuItem jMenuItemProcesarInformacionListadosCentrosCostos;
	protected JMenuItem jMenuItemAnterioresListadosCentrosCostos;
	protected JMenuItem jMenuItemSiguientesListadosCentrosCostos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosListadosCentrosCostos;
	protected JMenuItem jMenuItemAbrirOrderByListadosCentrosCostos;
	protected JMenuItem jMenuItemMostrarOcultarListadosCentrosCostos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesListadosCentrosCostos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosListadosCentrosCostos;
	protected JCheckBox jCheckBoxSeleccionadosListadosCentrosCostos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaListadosCentrosCostos;
	protected JCheckBox jCheckBoxConGraficoReporteListadosCentrosCostos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesListadosCentrosCostos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesListadosCentrosCostos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoListadosCentrosCostos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoListadosCentrosCostos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesListadosCentrosCostos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionListadosCentrosCostos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesListadosCentrosCostos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesListadosCentrosCostos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarListadosCentrosCostos;
	protected JTextField jTextFieldValorCampoGeneralListadosCentrosCostos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteListadosCentrosCostos;
	//public JList<Reporte> jListColumnasSelectReporteListadosCentrosCostos;
	//public JScrollPane jScrollColumnasSelectReporteListadosCentrosCostos;
	
	//public JLabel jLabelRelacionesSelectReporteListadosCentrosCostos;
	//public JList<Reporte> jListRelacionesSelectReporteListadosCentrosCostos;
	//public JScrollPane jScrollRelacionesSelectReporteListadosCentrosCostos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoListadosCentrosCostos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoListadosCentrosCostos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoListadosCentrosCostos;
	//public JLabel jLabelTiposArchivoReporteDinamicoListadosCentrosCostos;
	
		
	//public JLabel jLabelArchivoImportacionListadosCentrosCostos;	
	//public JLabel jLabelPathArchivoImportacionListadosCentrosCostos;
	//protected JTextField jTextFieldPathArchivoImportacionListadosCentrosCostos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoListadosCentrosCostos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoListadosCentrosCostos;
	
	//public JLabel jLabelColumnaCategoriaValorListadosCentrosCostos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorListadosCentrosCostos;
	
	//public JLabel jLabelColumnasValoresGraficoListadosCentrosCostos;
	//public JList<Reporte> jListColumnasValoresGraficoListadosCentrosCostos;
	//public JScrollPane jScrollColumnasValoresGraficoListadosCentrosCostos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoListadosCentrosCostos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoListadosCentrosCostos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasListadosCentrosCostos;
	public JPanel jPanelBusquedaListadosCentrosCostosListadosCentrosCostos;
	public JButton jButtonBusquedaListadosCentrosCostosListadosCentrosCostos;
	
	public JPanel jPanelIdIdBusquedaListadosCentrosCostosListadosCentrosCostos;
	public JLabel jLabelidBusquedaListadosCentrosCostosListadosCentrosCostos;
	public JTextFieldMe jLabelidListadosCentrosCostosBusquedaListadosCentrosCostos;
	public JButton jButtonidBusquedaListadosCentrosCostosListadosCentrosCostosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ListadosCentrosCostosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ListadosCentrosCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosCentrosCostosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosCentrosCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosCentrosCostosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosCentrosCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosCentrosCostosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ListadosCentrosCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionListadosCentrosCostos)	{
		this.jButtonRecargarInformacionListadosCentrosCostos = jButtonRecargarInformacionListadosCentrosCostos;
	}
	
	public JButton getjButtonProcesarInformacionListadosCentrosCostos() {
		return this.jButtonProcesarInformacionListadosCentrosCostos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionListadosCentrosCostos)	{
		this.jButtonProcesarInformacionListadosCentrosCostos = jButtonProcesarInformacionListadosCentrosCostos;
	}
	
	
	public JButton getjButtonRecargarInformacionListadosCentrosCostos() {
		return this.jButtonRecargarInformacionListadosCentrosCostos;
	}
	
	
	public List<ListadosCentrosCostos> getlistadoscentroscostoss() {
		return this.listadoscentroscostoss;
	}

	public void setlistadoscentroscostoss(List<ListadosCentrosCostos> listadoscentroscostoss) {
		this.listadoscentroscostoss = listadoscentroscostoss;
	}
	
	public List<ListadosCentrosCostos> getlistadoscentroscostossAux() {
		return this.listadoscentroscostossAux;
	}

	public void setlistadoscentroscostossAux(List<ListadosCentrosCostos> listadoscentroscostossAux) {
		this.listadoscentroscostossAux = listadoscentroscostossAux;
	}
	
	public List<ListadosCentrosCostos> getlistadoscentroscostossEliminados() {
		return this.listadoscentroscostossEliminados;
	}

	public void setListadosCentrosCostossEliminados(List<ListadosCentrosCostos> listadoscentroscostossEliminados) {
		this.listadoscentroscostossEliminados = listadoscentroscostossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarListadosCentrosCostos() {
		return jComboBoxTiposSeleccionarListadosCentrosCostos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarListadosCentrosCostos(
			JComboBox jComboBoxTiposSeleccionarListadosCentrosCostos) {
		this.jComboBoxTiposSeleccionarListadosCentrosCostos = jComboBoxTiposSeleccionarListadosCentrosCostos;
	}
	
	public void setBorderResaltarTiposSeleccionarListadosCentrosCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarListadosCentrosCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarListadosCentrosCostos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralListadosCentrosCostos() {
		return jTextFieldValorCampoGeneralListadosCentrosCostos;
	}

	public void setjTextFieldValorCampoGeneralListadosCentrosCostos(
			JTextField jTextFieldValorCampoGeneralListadosCentrosCostos) {
		this.jTextFieldValorCampoGeneralListadosCentrosCostos = jTextFieldValorCampoGeneralListadosCentrosCostos;
	}

	public void setBorderResaltarValorCampoGeneralListadosCentrosCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosCostos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralListadosCentrosCostos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosListadosCentrosCostos() {
		return this.jCheckBoxSeleccionarTodosListadosCentrosCostos;
	}

	public void setjCheckBoxSeleccionarTodosListadosCentrosCostos(
			JCheckBox jCheckBoxSeleccionarTodosListadosCentrosCostos) {
		this.jCheckBoxSeleccionarTodosListadosCentrosCostos = jCheckBoxSeleccionarTodosListadosCentrosCostos;
	}

	public void setBorderResaltarSeleccionarTodosListadosCentrosCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosCostos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosListadosCentrosCostos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosListadosCentrosCostos() {
		return this.jCheckBoxSeleccionadosListadosCentrosCostos;
	}

	public void setjCheckBoxSeleccionadosListadosCentrosCostos(
			JCheckBox jCheckBoxSeleccionadosListadosCentrosCostos) {
		this.jCheckBoxSeleccionadosListadosCentrosCostos = jCheckBoxSeleccionadosListadosCentrosCostos;
	}
	
	public void setBorderResaltarSeleccionadosListadosCentrosCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosCostos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosListadosCentrosCostos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesListadosCentrosCostos() {
		return this.jComboBoxTiposArchivosReportesListadosCentrosCostos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesListadosCentrosCostos(
			JComboBox jComboBoxTiposArchivosReportesListadosCentrosCostos) {
		this.jComboBoxTiposArchivosReportesListadosCentrosCostos = jComboBoxTiposArchivosReportesListadosCentrosCostos;
	}

	public void setBorderResaltarTiposArchivosReportesListadosCentrosCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesListadosCentrosCostos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesListadosCentrosCostos() {
		return this.jComboBoxTiposReportesListadosCentrosCostos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesListadosCentrosCostos(
			JComboBox jComboBoxTiposReportesListadosCentrosCostos) {
		this.jComboBoxTiposReportesListadosCentrosCostos = jComboBoxTiposReportesListadosCentrosCostos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoListadosCentrosCostos() {
	//	return jComboBoxTiposReportesDinamicoListadosCentrosCostos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoListadosCentrosCostos(
	//		JComboBox jComboBoxTiposReportesDinamicoListadosCentrosCostos) {
	//	this.jComboBoxTiposReportesDinamicoListadosCentrosCostos = jComboBoxTiposReportesDinamicoListadosCentrosCostos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoListadosCentrosCostos() {
	//	return jComboBoxTiposArchivosReportesDinamicoListadosCentrosCostos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoListadosCentrosCostos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoListadosCentrosCostos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoListadosCentrosCostos = jComboBoxTiposArchivosReportesDinamicoListadosCentrosCostos;
	//}
	
	public void setBorderResaltarTiposReportesListadosCentrosCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesListadosCentrosCostos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesListadosCentrosCostos() {
		return this.jComboBoxTiposGraficosReportesListadosCentrosCostos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesListadosCentrosCostos(
			JComboBox jComboBoxTiposGraficosReportesListadosCentrosCostos) {
		this.jComboBoxTiposGraficosReportesListadosCentrosCostos = jComboBoxTiposGraficosReportesListadosCentrosCostos;
	}
	
	public void setBorderResaltarTiposGraficosReportesListadosCentrosCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesListadosCentrosCostos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionListadosCentrosCostos() {
		return this.jComboBoxTiposPaginacionListadosCentrosCostos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionListadosCentrosCostos(
			JComboBox jComboBoxTiposPaginacionListadosCentrosCostos) {
		this.jComboBoxTiposPaginacionListadosCentrosCostos = jComboBoxTiposPaginacionListadosCentrosCostos;
	}
	
	public void setBorderResaltarTiposPaginacionListadosCentrosCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionListadosCentrosCostos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesListadosCentrosCostos() {
		return this.jComboBoxTiposRelacionesListadosCentrosCostos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesListadosCentrosCostos() {
		return this.jComboBoxTiposAccionesListadosCentrosCostos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesListadosCentrosCostos(
			JComboBox jComboBoxTiposRelacionesListadosCentrosCostos) {
		this.jComboBoxTiposRelacionesListadosCentrosCostos = jComboBoxTiposRelacionesListadosCentrosCostos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesListadosCentrosCostos(
			JComboBox jComboBoxTiposAccionesListadosCentrosCostos) {
		this.jComboBoxTiposAccionesListadosCentrosCostos = jComboBoxTiposAccionesListadosCentrosCostos;
	}
	
	public void setBorderResaltarTiposRelacionesListadosCentrosCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesListadosCentrosCostos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesListadosCentrosCostos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosCostos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesListadosCentrosCostos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoListadosCentrosCostos() {
	//	return jCheckBoxConGraficoDinamicoListadosCentrosCostos;
	//}

	//public void setjCheckBoxConGraficoDinamicoListadosCentrosCostos(
	//		JCheckBox jCheckBoxConGraficoDinamicoListadosCentrosCostos) {
	//	this.jCheckBoxConGraficoDinamicoListadosCentrosCostos = jCheckBoxConGraficoDinamicoListadosCentrosCostos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoListadosCentrosCostos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarListadosCentrosCostos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoListadosCentrosCostos .setBorder(borderResaltar);		
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
		this.listadoscentroscostosSessionBean=new ListadosCentrosCostosSessionBean();
		
		this.listadoscentroscostosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadoscentroscostosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.listadoscentroscostosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ListadosCentrosCostosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ListadosCentrosCostosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ListadosCentrosCostosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ListadosCentrosCostosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ListadosCentrosCostosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Listados Centros Costos MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
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
		
		ListadosCentrosCostosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ListadosCentrosCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarListadosCentrosCostos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarListadosCentrosCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarListadosCentrosCostos,this.jTtoolBarListadosCentrosCostos,
							"nuevo","nuevo","Nuevo"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarListadosCentrosCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarListadosCentrosCostos,this.jTtoolBarListadosCentrosCostos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarListadosCentrosCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarListadosCentrosCostos,this.jTtoolBarListadosCentrosCostos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarListadosCentrosCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarListadosCentrosCostos,this.jTtoolBarListadosCentrosCostos,
							"duplicar","duplicar","Duplicar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarListadosCentrosCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarListadosCentrosCostos,this.jTtoolBarListadosCentrosCostos,
							"copiar","copiar","Copiar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarListadosCentrosCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarListadosCentrosCostos,this.jTtoolBarListadosCentrosCostos,
							"ver_form","ver_form","Ver"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarListadosCentrosCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadosCentrosCostos,this.jTtoolBarListadosCentrosCostos,
							"recargar","recargar","Buscar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarListadosCentrosCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadosCentrosCostos,this.jTtoolBarListadosCentrosCostos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarListadosCentrosCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadosCentrosCostos,this.jTtoolBarListadosCentrosCostos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarListadosCentrosCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarListadosCentrosCostos,this.jTtoolBarListadosCentrosCostos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarListadosCentrosCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarListadosCentrosCostos,this.jTtoolBarListadosCentrosCostos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarListadosCentrosCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarListadosCentrosCostos,this.jTtoolBarListadosCentrosCostos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarListadosCentrosCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarListadosCentrosCostos,this.jTtoolBarListadosCentrosCostos,
							"cerrar","cerrar","Salir"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarListadosCentrosCostos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarListadosCentrosCostos;
			
				this.jButtonProcesarInformacionToolBarListadosCentrosCostos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarListadosCentrosCostos;
				
		//protected JButton jButtonModificarToolBarListadosCentrosCostos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarListadosCentrosCostos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuListadosCentrosCostos=new JMenuMe("General");
		this.jmenuArchivoListadosCentrosCostos=new JMenuMe("Archivo");
		this.jmenuAccionesListadosCentrosCostos=new JMenuMe("Acciones");
		this.jmenuDatosListadosCentrosCostos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoListadosCentrosCostos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoListadosCentrosCostos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoListadosCentrosCostos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarListadosCentrosCostos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarListadosCentrosCostos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarListadosCentrosCostos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesListadosCentrosCostos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesListadosCentrosCostos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesListadosCentrosCostos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosListadosCentrosCostos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosListadosCentrosCostos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosListadosCentrosCostos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarListadosCentrosCostos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarListadosCentrosCostos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarListadosCentrosCostos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormListadosCentrosCostos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormListadosCentrosCostos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormListadosCentrosCostos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaListadosCentrosCostos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaListadosCentrosCostos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaListadosCentrosCostos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarListadosCentrosCostos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarListadosCentrosCostos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarListadosCentrosCostos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionListadosCentrosCostos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionListadosCentrosCostos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionListadosCentrosCostos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionListadosCentrosCostos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionListadosCentrosCostos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionListadosCentrosCostos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresListadosCentrosCostos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresListadosCentrosCostos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresListadosCentrosCostos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesListadosCentrosCostos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesListadosCentrosCostos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesListadosCentrosCostos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByListadosCentrosCostos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByListadosCentrosCostos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByListadosCentrosCostos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarListadosCentrosCostos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarListadosCentrosCostos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarListadosCentrosCostos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByListadosCentrosCostos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByListadosCentrosCostos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByListadosCentrosCostos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarListadosCentrosCostos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarListadosCentrosCostos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarListadosCentrosCostos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosListadosCentrosCostos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosListadosCentrosCostos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosListadosCentrosCostos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoListadosCentrosCostos.add(this.jMenuItemCerrarListadosCentrosCostos);
			
			this.jmenuAccionesListadosCentrosCostos.add(this.jMenuItemNuevoListadosCentrosCostos);
			this.jmenuAccionesListadosCentrosCostos.add(this.jMenuItemNuevoGuardarCambiosListadosCentrosCostos);
			this.jmenuAccionesListadosCentrosCostos.add(this.jMenuItemNuevoRelacionesListadosCentrosCostos);
			this.jmenuAccionesListadosCentrosCostos.add(this.jMenuItemGuardarCambiosTablaListadosCentrosCostos);		
			this.jmenuAccionesListadosCentrosCostos.add(this.jMenuItemDuplicarListadosCentrosCostos);		
			this.jmenuAccionesListadosCentrosCostos.add(this.jMenuItemCopiarListadosCentrosCostos);		
			this.jmenuAccionesListadosCentrosCostos.add(this.jMenuItemVerFormListadosCentrosCostos);		
			
			this.jmenuDatosListadosCentrosCostos.add(this.jMenuItemRecargarInformacionListadosCentrosCostos);				
			this.jmenuDatosListadosCentrosCostos.add(this.jMenuItemAnterioresListadosCentrosCostos);				
			this.jmenuDatosListadosCentrosCostos.add(this.jMenuItemSiguientesListadosCentrosCostos);				
			this.jmenuDatosListadosCentrosCostos.add(this.jMenuItemAbrirOrderByListadosCentrosCostos);				
			this.jmenuDatosListadosCentrosCostos.add(this.jMenuItemMostrarOcultarListadosCentrosCostos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesListadosCentrosCostos.add(this.jMenuItemGuardarCambiosListadosCentrosCostos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarListadosCentrosCostos.add(this.jmenuArchivoListadosCentrosCostos);		
			this.jmenuBarListadosCentrosCostos.add(this.jmenuAccionesListadosCentrosCostos);		
			this.jmenuBarListadosCentrosCostos.add(this.jmenuDatosListadosCentrosCostos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarListadosCentrosCostos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasListadosCentrosCostos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaListadosCentrosCostosListadosCentrosCostos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaListadosCentrosCostosListadosCentrosCostos.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaListadosCentrosCostosListadosCentrosCostos= new JButtonMe();
		this.jButtonBusquedaListadosCentrosCostosListadosCentrosCostos.setText("Buscar");
		this.jButtonBusquedaListadosCentrosCostosListadosCentrosCostos.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaListadosCentrosCostosListadosCentrosCostos,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaListadosCentrosCostosListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaListadosCentrosCostosListadosCentrosCostos = new JLabelMe();
		jLabelidBusquedaListadosCentrosCostosListadosCentrosCostos.setText("Id :");
		jLabelidBusquedaListadosCentrosCostosListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-48),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaListadosCentrosCostosListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-48),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaListadosCentrosCostosListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-48),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaListadosCentrosCostosListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidListadosCentrosCostosBusquedaListadosCentrosCostos= new JTextFieldMe();
		jLabelidListadosCentrosCostosBusquedaListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadosCentrosCostosBusquedaListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadosCentrosCostosBusquedaListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidListadosCentrosCostosBusquedaListadosCentrosCostos.setVisible(false);




		this.jTabbedPaneBusquedasListadosCentrosCostos=new JTabbedPane();


		this.jTabbedPaneBusquedasListadosCentrosCostos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasListadosCentrosCostos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasListadosCentrosCostos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasListadosCentrosCostos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleListadosCentrosCostos = new ListadosCentrosCostosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Listados Centros Costos DATOS");
			this.jInternalFrameDetalleFormListadosCentrosCostos = new ListadosCentrosCostosDetalleFormJInternalFrame(jDesktopPane,this.listadoscentroscostosSessionBean.getConGuardarRelaciones(),this.listadoscentroscostosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormListadosCentrosCostos = null;//new ListadosCentrosCostosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutListadosCentrosCostos= new GridBagLayout();
		
		
		this.jTableDatosListadosCentrosCostos = new JTableMe();      
		
		String sToolTipListadosCentrosCostos="";
		sToolTipListadosCentrosCostos=ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipListadosCentrosCostos+="(Contabilidad.ListadosCentrosCostos)";
		}
		
		if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
			sToolTipListadosCentrosCostos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosListadosCentrosCostos.setToolTipText(sToolTipListadosCentrosCostos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosListadosCentrosCostos);
		this.jTableDatosListadosCentrosCostos.setAutoCreateRowSorter(true);
		this.jTableDatosListadosCentrosCostos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosListadosCentrosCostos.setRowSelectionAllowed(true);
		this.jTableDatosListadosCentrosCostos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosListadosCentrosCostos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoListadosCentrosCostos = new JButtonMe();
		this.jButtonDuplicarListadosCentrosCostos = new JButtonMe();
		this.jButtonCopiarListadosCentrosCostos = new JButtonMe();
		this.jButtonVerFormListadosCentrosCostos = new JButtonMe();
		this.jButtonNuevoRelacionesListadosCentrosCostos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaListadosCentrosCostos = new JButtonMe();
		this.jButtonCerrarListadosCentrosCostos = new JButtonMe();
		
		this.jScrollPanelDatosListadosCentrosCostos = new JScrollPane();   
        this.jScrollPanelDatosGeneralListadosCentrosCostos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesListadosCentrosCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Listados Centros Costos";
		
		if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Centros Costoses" + this.sPath));
		} else {
			this.jScrollPanelDatosListadosCentrosCostos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesListadosCentrosCostos.setToolTipText("Acciones");
        this.jPanelAccionesListadosCentrosCostos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoListadosCentrosCostos=new ReporteDinamicoJInternalFrame(ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoListadosCentrosCostos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionListadosCentrosCostos=new ImportacionJInternalFrame(ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionListadosCentrosCostos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByListadosCentrosCostos = new JButtonMe();
		
		this.jButtonAbrirOrderByListadosCentrosCostos.setText("Orden");
		this.jButtonAbrirOrderByListadosCentrosCostos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByListadosCentrosCostos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByListadosCentrosCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByListadosCentrosCostos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosCentrosCostos,false,this);
			
			//this.cargarOrderByListadosCentrosCostos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByListadosCentrosCostos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosCentrosCostos,true,this);
			
			//this.cargarOrderByListadosCentrosCostos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosListadosCentrosCostos.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosListadosCentrosCostos.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosListadosCentrosCostos.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosListadosCentrosCostos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosListadosCentrosCostos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosListadosCentrosCostos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoListadosCentrosCostos.setText("Nuevo");
		this.jButtonDuplicarListadosCentrosCostos.setText("Duplicar");
		this.jButtonCopiarListadosCentrosCostos.setText("Copiar");
		this.jButtonVerFormListadosCentrosCostos.setText("Ver");
		this.jButtonNuevoRelacionesListadosCentrosCostos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaListadosCentrosCostos.setText("Guardar");
		this.jButtonCerrarListadosCentrosCostos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoListadosCentrosCostos,"nuevo_button","Nuevo",this.listadoscentroscostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarListadosCentrosCostos,"duplicar_button","Duplicar",this.listadoscentroscostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarListadosCentrosCostos,"copiar_button","Copiar",this.listadoscentroscostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormListadosCentrosCostos,"ver_form","Ver",this.listadoscentroscostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesListadosCentrosCostos,"nuevorelaciones_button","Nuevo Rel",this.listadoscentroscostosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaListadosCentrosCostos,"guardarcambiostabla_button","Guardar",this.listadoscentroscostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarListadosCentrosCostos,"cerrar_button","Salir",this.listadoscentroscostosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoListadosCentrosCostos.setToolTipText("Nuevo"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarListadosCentrosCostos.setToolTipText("Duplicar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarListadosCentrosCostos.setToolTipText("Copiar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormListadosCentrosCostos.setToolTipText("Ver"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesListadosCentrosCostos.setToolTipText("Nuevo Rel"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaListadosCentrosCostos.setToolTipText("Guardar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarListadosCentrosCostos.setToolTipText("Salir"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoListadosCentrosCostos";
		inputMap = this.jButtonNuevoListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoListadosCentrosCostos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoListadosCentrosCostos"));
		
		//DUPLICAR
		sMapKey = "DuplicarListadosCentrosCostos";
		inputMap = this.jButtonDuplicarListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarListadosCentrosCostos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarListadosCentrosCostos"));
		
		//COPIAR
		sMapKey = "CopiarListadosCentrosCostos";
		inputMap = this.jButtonCopiarListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarListadosCentrosCostos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarListadosCentrosCostos"));
		
		//VEr FORM
		sMapKey = "VerFormListadosCentrosCostos";
		inputMap = this.jButtonVerFormListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormListadosCentrosCostos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormListadosCentrosCostos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesListadosCentrosCostos";
		inputMap = this.jButtonNuevoRelacionesListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesListadosCentrosCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesListadosCentrosCostos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarListadosCentrosCostos";
		inputMap = this.jButtonModificarListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarListadosCentrosCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarListadosCentrosCostos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarListadosCentrosCostos";
		inputMap = this.jButtonCerrarListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarListadosCentrosCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarListadosCentrosCostos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaListadosCentrosCostos";
		inputMap = this.jButtonGuardarCambiosTablaListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaListadosCentrosCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaListadosCentrosCostos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesListadosCentrosCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesListadosCentrosCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionListadosCentrosCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ListadosCentrosCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ListadosCentrosCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ListadosCentrosCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ListadosCentrosCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ListadosCentrosCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesListadosCentrosCostos.setName("jPanelParametrosReportesListadosCentrosCostos"); 
		
		this.jPanelParametrosReportesAccionesListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesListadosCentrosCostos.setName("jPanelParametrosReportesAccionesListadosCentrosCostos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionListadosCentrosCostos = new JButtonMe();
		this.jButtonRecargarInformacionListadosCentrosCostos.setText("Buscar");
		this.jButtonRecargarInformacionListadosCentrosCostos.setToolTipText("Buscar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionListadosCentrosCostos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionListadosCentrosCostos.setVisible(false);
		
		
		this.jButtonProcesarInformacionListadosCentrosCostos = new JButtonMe();
		this.jButtonProcesarInformacionListadosCentrosCostos.setText("Procesar");
		this.jButtonProcesarInformacionListadosCentrosCostos.setToolTipText("Procesar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionListadosCentrosCostos.setVisible(false);
			
		this.jButtonProcesarInformacionListadosCentrosCostos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionListadosCentrosCostos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionListadosCentrosCostos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesListadosCentrosCostos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadosCentrosCostos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesListadosCentrosCostos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesListadosCentrosCostos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadosCentrosCostos.setText("TIPO");       
		this.jComboBoxTiposReportesListadosCentrosCostos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesListadosCentrosCostos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadosCentrosCostos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesListadosCentrosCostos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionListadosCentrosCostos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionListadosCentrosCostos.setText("Paginacion");
		this.jComboBoxTiposPaginacionListadosCentrosCostos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesListadosCentrosCostos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesListadosCentrosCostos.setText("Accion");
		this.jComboBoxTiposRelacionesListadosCentrosCostos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesListadosCentrosCostos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesListadosCentrosCostos.setText("Accion");
		this.jComboBoxTiposAccionesListadosCentrosCostos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarListadosCentrosCostos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarListadosCentrosCostos.setText("Accion");
		this.jComboBoxTiposSeleccionarListadosCentrosCostos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralListadosCentrosCostos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralListadosCentrosCostos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralListadosCentrosCostos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralListadosCentrosCostos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesListadosCentrosCostos = new JLabelMe();
		
		this.jLabelAccionesListadosCentrosCostos.setText("Acciones");		
		this.jLabelAccionesListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosListadosCentrosCostos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosListadosCentrosCostos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosListadosCentrosCostos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosListadosCentrosCostos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosListadosCentrosCostos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosListadosCentrosCostos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaListadosCentrosCostos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaListadosCentrosCostos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaListadosCentrosCostos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteListadosCentrosCostos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteListadosCentrosCostos.setText("Graf.");
		this.jCheckBoxConGraficoReporteListadosCentrosCostos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresListadosCentrosCostos = new JButtonMe();
		//this.jButtonAnterioresListadosCentrosCostos.setText("<<");
        this.jButtonAnterioresListadosCentrosCostos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresListadosCentrosCostos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesListadosCentrosCostos = new JButtonMe();
		//this.jButtonSiguientesListadosCentrosCostos.setText(">>");
        this.jButtonSiguientesListadosCentrosCostos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesListadosCentrosCostos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosListadosCentrosCostos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosListadosCentrosCostos.setText("Nue");
        this.jButtonNuevoGuardarCambiosListadosCentrosCostos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosListadosCentrosCostos,"nuevoguardarcambios_button","Nue",this.listadoscentroscostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosListadosCentrosCostos";
		inputMap = this.jButtonNuevoGuardarCambiosListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosListadosCentrosCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosListadosCentrosCostos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionListadosCentrosCostos";
		inputMap = this.jButtonRecargarInformacionListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionListadosCentrosCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionListadosCentrosCostos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesListadosCentrosCostos";
		inputMap = this.jButtonSiguientesListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesListadosCentrosCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesListadosCentrosCostos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresListadosCentrosCostos";
		inputMap = this.jButtonAnterioresListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresListadosCentrosCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresListadosCentrosCostos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasListadosCentrosCostos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesListadosCentrosCostos.setMinimumSize(new Dimension(this.getWidth(),ListadosCentrosCostosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadosCentrosCostosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesListadosCentrosCostos.setMaximumSize(new Dimension(this.getWidth(),ListadosCentrosCostosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadosCentrosCostosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesListadosCentrosCostos.setPreferredSize(new Dimension(this.getWidth(),ListadosCentrosCostosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadosCentrosCostosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionListadosCentrosCostos = new GridBagLayout();

			this.jPanelPaginacionListadosCentrosCostos.setLayout(gridaBagLayoutPaginacionListadosCentrosCostos);						
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
			this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionListadosCentrosCostos.add(this.jButtonAnterioresListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
					
						
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
			
			this.jPanelPaginacionListadosCentrosCostos.add(this.jButtonNuevoGuardarCambiosListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
						
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
			this.jPanelPaginacionListadosCentrosCostos.add(this.jButtonSiguientesListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy = 1;
			this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosCentrosCostos.add(this.jButtonNuevoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
						
			
			
			if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
				this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsListadosCentrosCostos.gridy = 1;
				this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionListadosCentrosCostos.add(this.jButtonGuardarCambiosTablaListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
			}
			
			
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy = 1;
			this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosCentrosCostos.add(this.jButtonDuplicarListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy = 1;
			this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosCentrosCostos.add(this.jButtonCopiarListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy = 1;
			this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosCentrosCostos.add(this.jButtonVerFormListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy = 1;
			this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionListadosCentrosCostos.add(this.jButtonCerrarListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		
		
		
		this.jButtonRecargarInformacionListadosCentrosCostos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionListadosCentrosCostos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionListadosCentrosCostos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesListadosCentrosCostos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesListadosCentrosCostos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesListadosCentrosCostos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesListadosCentrosCostos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesListadosCentrosCostos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesListadosCentrosCostos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesListadosCentrosCostos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesListadosCentrosCostos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesListadosCentrosCostos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionListadosCentrosCostos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionListadosCentrosCostos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionListadosCentrosCostos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesListadosCentrosCostos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesListadosCentrosCostos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesListadosCentrosCostos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesListadosCentrosCostos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosCentrosCostos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosCentrosCostos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarListadosCentrosCostos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarListadosCentrosCostos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarListadosCentrosCostos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaListadosCentrosCostos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaListadosCentrosCostos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaListadosCentrosCostos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteListadosCentrosCostos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteListadosCentrosCostos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteListadosCentrosCostos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosListadosCentrosCostos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosListadosCentrosCostos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosListadosCentrosCostos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosListadosCentrosCostos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosListadosCentrosCostos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosListadosCentrosCostos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesListadosCentrosCostos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesListadosCentrosCostos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ListadosCentrosCostos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ListadosCentrosCostos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ListadosCentrosCostos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ListadosCentrosCostos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesListadosCentrosCostos.setLayout(gridaBagParametrosReportesListadosCentrosCostos);
			this.jPanelParametrosReportesAccionesListadosCentrosCostos.setLayout(gridaBagParametrosReportesAccionesListadosCentrosCostos);
			
			
			this.jPanelParametrosAuxiliar1ListadosCentrosCostos.setLayout(gridaBagParametrosAuxiliar1ListadosCentrosCostos);
			this.jPanelParametrosAuxiliar2ListadosCentrosCostos.setLayout(gridaBagParametrosAuxiliar2ListadosCentrosCostos);
			this.jPanelParametrosAuxiliar3ListadosCentrosCostos.setLayout(gridaBagParametrosAuxiliar3ListadosCentrosCostos);
			this.jPanelParametrosAuxiliar4ListadosCentrosCostos.setLayout(gridaBagParametrosAuxiliar4ListadosCentrosCostos);
			//this.jPanelParametrosAuxiliar5ListadosCentrosCostos.setLayout(gridaBagParametrosAuxiliar2ListadosCentrosCostos);			
			
			
			
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosCentrosCostos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadosCentrosCostos.add(this.jButtonRecargarInformacionListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosCostos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadosCentrosCostos.add(this.jComboBoxTiposPaginacionListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosCostos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadosCentrosCostos.add(this.jCheckBoxConAltoMaximoTablaListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosCostos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadosCentrosCostos.add(this.jComboBoxTiposArchivosReportesListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosCostos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosCentrosCostos.add(this.jPanelParametrosAuxiliar1ListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosCentrosCostos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ListadosCentrosCostos.add(this.jComboBoxTiposReportesListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);																		
			
			
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosCentrosCostos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ListadosCentrosCostos.add(this.jComboBoxTiposGraficosReportesListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosCostos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosCentrosCostos.add(this.jPanelParametrosAuxiliar4ListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosCostos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosCentrosCostos.add(this.jComboBoxTiposReportesListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosCostos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosCentrosCostos.add(this.jCheckBoxGenerarReporteListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosCostos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosCentrosCostos.add(this.jPanelParametrosAuxiliar2ListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosCentrosCostos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosCentrosCostos.add(this.jLabelAccionesListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
				this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsListadosCentrosCostos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesListadosCentrosCostos.add(this.jButtonAbrirOrderByListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosCostos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadosCentrosCostos.add(this.jComboBoxTiposSeleccionarListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);			
			
			
			/*
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosCentrosCostos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosCentrosCostos.add(this.jCheckBoxSeleccionarTodosListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosCentrosCostos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosCentrosCostos.add(this.jCheckBoxConGraficoReporteListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosCentrosCostos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadosCentrosCostos.add(this.jCheckBoxSeleccionarTodosListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);															
				
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosCentrosCostos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadosCentrosCostos.add(this.jCheckBoxSeleccionadosListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);															
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosCentrosCostos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadosCentrosCostos.add(this.jCheckBoxConGraficoReporteListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosCostos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosCentrosCostos.add(this.jPanelParametrosAuxiliar3ListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosCostos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadosCentrosCostos.add(this.jComboBoxTiposAccionesListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosListadosCentrosCostos = new GridBagLayout();

			this.jScrollPanelDatosListadosCentrosCostos.setLayout(gridaBagLayoutDatosListadosCentrosCostos);
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
			this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
			
			this.jScrollPanelDatosListadosCentrosCostos.add(this.jTableDatosListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosListadosCentrosCostos.setViewportView(this.jTableDatosListadosCentrosCostos);
		this.jTableDatosListadosCentrosCostos.setFillsViewportHeight(true);
		this.jTableDatosListadosCentrosCostos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesListadosCentrosCostos= new GridBagLayout();
		this.jPanelAccionesListadosCentrosCostos.setLayout(gridaBagLayoutAccionesListadosCentrosCostos);
		
		
		/*	
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = 0;
		this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
			
		this.jPanelAccionesListadosCentrosCostos.add(this.jButtonNuevoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaListadosCentrosCostosListadosCentrosCostos= new GridBagLayout();
		gridaBagLayoutBusquedaListadosCentrosCostosListadosCentrosCostos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaListadosCentrosCostosListadosCentrosCostos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaListadosCentrosCostosListadosCentrosCostos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaListadosCentrosCostosListadosCentrosCostos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaListadosCentrosCostosListadosCentrosCostos.setLayout(gridaBagLayoutBusquedaListadosCentrosCostosListadosCentrosCostos);

		gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosCentrosCostos.gridy = 0;
		gridBagConstraintsListadosCentrosCostos.gridx = 0;
		jPanelBusquedaListadosCentrosCostosListadosCentrosCostos.add(jLabelidBusquedaListadosCentrosCostosListadosCentrosCostos, gridBagConstraintsListadosCentrosCostos);

		gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosCentrosCostos.gridy = 0;
		gridBagConstraintsListadosCentrosCostos.gridx = 1;
		jPanelBusquedaListadosCentrosCostosListadosCentrosCostos.add(jLabelidListadosCentrosCostosBusquedaListadosCentrosCostos, gridBagConstraintsListadosCentrosCostos);

		gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosCentrosCostos.gridy = 1;
		gridBagConstraintsListadosCentrosCostos.gridx =1;
		jPanelBusquedaListadosCentrosCostosListadosCentrosCostos.add(jButtonBusquedaListadosCentrosCostosListadosCentrosCostos, gridBagConstraintsListadosCentrosCostos);

		jTabbedPaneBusquedasListadosCentrosCostos.addTab("1.-Por Id ", jPanelBusquedaListadosCentrosCostosListadosCentrosCostos);
		jTabbedPaneBusquedasListadosCentrosCostos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutListadosCentrosCostos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutListadosCentrosCostos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();						
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadosCentrosCostos.gridx = 0;		
			//this.gridBagConstraintsListadosCentrosCostos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsListadosCentrosCostos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsListadosCentrosCostos.gridx = 0;		
		//this.gridBagConstraintsListadosCentrosCostos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsListadosCentrosCostos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsListadosCentrosCostos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadosCentrosCostos.gridx = 0;		
			this.gridBagConstraintsListadosCentrosCostos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsListadosCentrosCostos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);								
		
		
		/*
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		*/		
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsListadosCentrosCostos.gridx =0;
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsListadosCentrosCostos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
				
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ListadosCentrosCostosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosListadosCentrosCostos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosListadosCentrosCostos = new GridBagLayout();
			this.jPanelBusquedasParametrosListadosCentrosCostos.setLayout(gridaBagLayoutBusquedasParametrosListadosCentrosCostos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralListadosCentrosCostos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralListadosCentrosCostos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosCentrosCostos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosCentrosCostos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
			
			
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		
			
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosCostos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralListadosCentrosCostos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoListadosCentrosCostos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoListadosCentrosCostos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoListadosCentrosCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoListadosCentrosCostos.setName("jPanelReporteDinamicoListadosCentrosCostos"); 
		
		this.jPanelReporteDinamicoListadosCentrosCostos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoListadosCentrosCostos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoListadosCentrosCostos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoListadosCentrosCostos.setLayout(gridaBagLayoutReporteDinamicoListadosCentrosCostos);
		
		
		this.jInternalFrameReporteDinamicoListadosCentrosCostos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoListadosCentrosCostos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteListadosCentrosCostos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoListadosCentrosCostos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoListadosCentrosCostos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoListadosCentrosCostos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoListadosCentrosCostos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoListadosCentrosCostos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoListadosCentrosCostos.setResizable(true);
	    this.jInternalFrameReporteDinamicoListadosCentrosCostos.setClosable(true);
	    this.jInternalFrameReporteDinamicoListadosCentrosCostos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoListadosCentrosCostos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoListadosCentrosCostos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoListadosCentrosCostos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Centros Costoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteListadosCentrosCostos = new JLabelMe();

		this.jLabelColumnasSelectReporteListadosCentrosCostos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jLabelColumnasSelectReporteListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteListadosCentrosCostos = new JList<Reporte>();
		this.jListColumnasSelectReporteListadosCentrosCostos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteListadosCentrosCostos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteListadosCentrosCostos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteListadosCentrosCostos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteListadosCentrosCostos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteListadosCentrosCostos=new JScrollPane(this.jListColumnasSelectReporteListadosCentrosCostos);
			
			this.jScrollColumnasSelectReporteListadosCentrosCostos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteListadosCentrosCostos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteListadosCentrosCostos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jListColumnasSelectReporteListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jScrollColumnasSelectReporteListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteListadosCentrosCostos = new JLabelMe();

		this.jLabelRelacionesSelectReporteListadosCentrosCostos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteListadosCentrosCostos = new JList<Reporte>();
		this.jListRelacionesSelectReporteListadosCentrosCostos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteListadosCentrosCostos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteListadosCentrosCostos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteListadosCentrosCostos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteListadosCentrosCostos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteListadosCentrosCostos=new JScrollPane(this.jListRelacionesSelectReporteListadosCentrosCostos);
			
			this.jScrollRelacionesSelectReporteListadosCentrosCostos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteListadosCentrosCostos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteListadosCentrosCostos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoListadosCentrosCostos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoListadosCentrosCostos = new JComboBoxMe();
		this.jListColumnasValoresGraficoListadosCentrosCostos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoListadosCentrosCostos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoListadosCentrosCostos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoListadosCentrosCostos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoListadosCentrosCostos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoListadosCentrosCostos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoListadosCentrosCostos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoListadosCentrosCostos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoListadosCentrosCostos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoListadosCentrosCostos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoListadosCentrosCostos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoListadosCentrosCostos = new JLabelMe();

		this.jLabelConGraficoDinamicoListadosCentrosCostos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jLabelConGraficoDinamicoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoListadosCentrosCostos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoListadosCentrosCostos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoListadosCentrosCostos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoListadosCentrosCostos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoListadosCentrosCostos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoListadosCentrosCostos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jCheckBoxConGraficoDinamicoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoListadosCentrosCostos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoListadosCentrosCostos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jLabelColumnaCategoriaGraficoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoListadosCentrosCostos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoListadosCentrosCostos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoListadosCentrosCostos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoListadosCentrosCostos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoListadosCentrosCostos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoListadosCentrosCostos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jComboBoxColumnaCategoriaGraficoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorListadosCentrosCostos = new JLabelMe();

		this.jLabelColumnaCategoriaValorListadosCentrosCostos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jLabelColumnaCategoriaValorListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorListadosCentrosCostos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorListadosCentrosCostos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorListadosCentrosCostos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorListadosCentrosCostos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorListadosCentrosCostos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorListadosCentrosCostos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jComboBoxColumnaCategoriaValorListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoListadosCentrosCostos = new JLabelMe();

		this.jLabelColumnasValoresGraficoListadosCentrosCostos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jLabelColumnasValoresGraficoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoListadosCentrosCostos = new JList<Reporte>();
		this.jListColumnasValoresGraficoListadosCentrosCostos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoListadosCentrosCostos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoListadosCentrosCostos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoListadosCentrosCostos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoListadosCentrosCostos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoListadosCentrosCostos=new JScrollPane(this.jListColumnasValoresGraficoListadosCentrosCostos);
			
			this.jScrollColumnasValoresGraficoListadosCentrosCostos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoListadosCentrosCostos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoListadosCentrosCostos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jListColumnasSelectReporteListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jScrollColumnasValoresGraficoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoListadosCentrosCostos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoListadosCentrosCostos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jLabelTiposGraficosReportesDinamicoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoListadosCentrosCostos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoListadosCentrosCostos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoListadosCentrosCostos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoListadosCentrosCostos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoListadosCentrosCostos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoListadosCentrosCostos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jComboBoxTiposGraficosReportesDinamicoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoListadosCentrosCostos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoListadosCentrosCostos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jLabelGenerarExcelReporteDinamicoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoListadosCentrosCostos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoListadosCentrosCostos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoListadosCentrosCostos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoListadosCentrosCostos.setToolTipText("Generar EXCEL"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		//this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jButtonGenerarExcelReporteDinamicoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jComboBoxTiposReportesDinamicoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoListadosCentrosCostos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoListadosCentrosCostos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jLabelTiposArchivoReporteDinamicoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jComboBoxTiposArchivosReportesDinamicoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoListadosCentrosCostos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoListadosCentrosCostos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoListadosCentrosCostos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoListadosCentrosCostos.setToolTipText("Generar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jButtonGenerarReporteDinamicoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoListadosCentrosCostos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoListadosCentrosCostos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoListadosCentrosCostos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoListadosCentrosCostos.setToolTipText("Cancelar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosCentrosCostos.add(this.jButtonCerrarReporteDinamicoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalListadosCentrosCostos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoListadosCentrosCostos= new JScrollPane(jPanelReporteDinamicoListadosCentrosCostos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoListadosCentrosCostos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoListadosCentrosCostos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoListadosCentrosCostos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Centros Costoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsListadosCentrosCostos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoListadosCentrosCostos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoListadosCentrosCostos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalListadosCentrosCostos);
		this.jInternalFrameReporteDinamicoListadosCentrosCostos.getContentPane().add(this.jScrollPanelReporteDinamicoListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionListadosCentrosCostos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionListadosCentrosCostos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionListadosCentrosCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionListadosCentrosCostos.setName("jPanelImportacionListadosCentrosCostos"); 
		
		this.jPanelImportacionListadosCentrosCostos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionListadosCentrosCostos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionListadosCentrosCostos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionListadosCentrosCostos.setLayout(gridaBagLayoutImportacionListadosCentrosCostos);
		
		
		this.jInternalFrameImportacionListadosCentrosCostos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionListadosCentrosCostos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionListadosCentrosCostos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteListadosCentrosCostos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionListadosCentrosCostos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionListadosCentrosCostos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionListadosCentrosCostos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionListadosCentrosCostos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionListadosCentrosCostos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionListadosCentrosCostos.setResizable(true);
	    this.jInternalFrameImportacionListadosCentrosCostos.setClosable(true);
	    this.jInternalFrameImportacionListadosCentrosCostos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionListadosCentrosCostos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionListadosCentrosCostos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionListadosCentrosCostos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionListadosCentrosCostos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionListadosCentrosCostos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionListadosCentrosCostos.setResizable(true);
	    this.jInternalFrameImportacionListadosCentrosCostos.setClosable(true);
	    this.jInternalFrameImportacionListadosCentrosCostos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionListadosCentrosCostos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionListadosCentrosCostos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionListadosCentrosCostos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Centros Costoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionListadosCentrosCostos = new JLabelMe();

		this.jLabelArchivoImportacionListadosCentrosCostos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYImportacion;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionListadosCentrosCostos.add(this.jLabelArchivoImportacionListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionListadosCentrosCostos = new JFileChooser();		
		this.jFileChooserImportacionListadosCentrosCostos.setToolTipText("ESCOGER ARCHIVO"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionListadosCentrosCostos = new JButtonMe();
		this.jButtonAbrirImportacionListadosCentrosCostos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionListadosCentrosCostos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionListadosCentrosCostos.setToolTipText("Generar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosCentrosCostos.add(this.jButtonAbrirImportacionListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionListadosCentrosCostos = new JLabelMe();

		this.jLabelPathArchivoImportacionListadosCentrosCostos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionListadosCentrosCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionListadosCentrosCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionListadosCentrosCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYImportacion;		
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionListadosCentrosCostos.add(this.jLabelPathArchivoImportacionListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionListadosCentrosCostos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionListadosCentrosCostos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionListadosCentrosCostos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionListadosCentrosCostos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosCentrosCostos.add(this.jTextFieldPathArchivoImportacionListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionListadosCentrosCostos = new JButtonMe();
		this.jButtonGenerarImportacionListadosCentrosCostos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionListadosCentrosCostos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionListadosCentrosCostos.setToolTipText("Generar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosCentrosCostos.add(this.jButtonGenerarImportacionListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionListadosCentrosCostos = new JButtonMe();
		this.jButtonCerrarImportacionListadosCentrosCostos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionListadosCentrosCostos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionListadosCentrosCostos.setToolTipText("Cancelar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosCentrosCostos.add(this.jButtonCerrarImportacionListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalListadosCentrosCostos = new GridBagLayout();
		
		this.jScrollPanelImportacionListadosCentrosCostos= new JScrollPane(jPanelImportacionListadosCentrosCostos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosCostos.gridy =iPosYImportacion;
		this.gridBagConstraintsListadosCentrosCostos.gridx =iPosXImportacion;
		this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionListadosCentrosCostos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionListadosCentrosCostos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalListadosCentrosCostos);
		this.jInternalFrameImportacionListadosCentrosCostos.getContentPane().add(this.jScrollPanelImportacionListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByListadosCentrosCostos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByListadosCentrosCostos = new JButtonMe();
			this.jButtonAbrirOrderByListadosCentrosCostos.setText("Orden");
			this.jButtonAbrirOrderByListadosCentrosCostos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByListadosCentrosCostos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByListadosCentrosCostos";
			inputMap = this.jButtonAbrirOrderByListadosCentrosCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByListadosCentrosCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByListadosCentrosCostos"));
		
		
			GridBagLayout gridaBagLayoutOrderByListadosCentrosCostos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByListadosCentrosCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByListadosCentrosCostos.setName("jPanelOrderByListadosCentrosCostos"); 
			
			this.jPanelOrderByListadosCentrosCostos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByListadosCentrosCostos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByListadosCentrosCostos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByListadosCentrosCostos.setLayout(gridaBagLayoutOrderByListadosCentrosCostos);
			
			
			this.jTableDatosListadosCentrosCostosOrderBy = new JTableMe();        
			this.jTableDatosListadosCentrosCostosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosListadosCentrosCostosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosListadosCentrosCostosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosListadosCentrosCostosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosListadosCentrosCostosOrderBy.setViewportView(this.jTableDatosListadosCentrosCostosOrderBy);
			this.jTableDatosListadosCentrosCostosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosListadosCentrosCostosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByListadosCentrosCostos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByListadosCentrosCostos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByListadosCentrosCostos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteListadosCentrosCostos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByListadosCentrosCostos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByListadosCentrosCostos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByListadosCentrosCostos.setTitle("Orden");
			this.jInternalFrameOrderByListadosCentrosCostos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByListadosCentrosCostos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByListadosCentrosCostos.setResizable(true);
			this.jInternalFrameOrderByListadosCentrosCostos.setClosable(true);
			this.jInternalFrameOrderByListadosCentrosCostos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByListadosCentrosCostos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByListadosCentrosCostos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByListadosCentrosCostos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByListadosCentrosCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Centros Costoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsListadosCentrosCostos.gridx =iPosXOrderBy;
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsListadosCentrosCostos.ipady =150;
				
			this.jPanelOrderByListadosCentrosCostos.add(jScrollPanelDatosListadosCentrosCostosOrderBy, this.gridBagConstraintsListadosCentrosCostos);//this.jTableDatosListadosCentrosCostosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByListadosCentrosCostos = new JButtonMe();
			this.jButtonCerrarOrderByListadosCentrosCostos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByListadosCentrosCostos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByListadosCentrosCostos.setToolTipText("Cancelar"+" "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByListadosCentrosCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosCostos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsListadosCentrosCostos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByListadosCentrosCostos.add(this.jButtonCerrarOrderByListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalListadosCentrosCostos = new GridBagLayout();
			
			this.jScrollPanelOrderByListadosCentrosCostos= new JScrollPane(jPanelOrderByListadosCentrosCostos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsListadosCentrosCostos = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosCostos.gridy =iPosYOrderBy;
			this.gridBagConstraintsListadosCentrosCostos.gridx =iPosXOrderBy;
			this.gridBagConstraintsListadosCentrosCostos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByListadosCentrosCostos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByListadosCentrosCostos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalListadosCentrosCostos);
			
			this.jInternalFrameOrderByListadosCentrosCostos.getContentPane().add(this.jScrollPanelOrderByListadosCentrosCostos, this.gridBagConstraintsListadosCentrosCostos);			
		
		} else {
			this.jButtonAbrirOrderByListadosCentrosCostos = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.listadoscentroscostosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosListadosCentrosCostos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosListadosCentrosCostos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosListadosCentrosCostos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosListadosCentrosCostos.getRowHeight();//ListadosCentrosCostosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ListadosCentrosCostosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaListadosCentrosCostos.isSelected()) {
					iHeightTable=ListadosCentrosCostosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ListadosCentrosCostosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ListadosCentrosCostosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ListadosCentrosCostosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaListadosCentrosCostos.isSelected()) {
					iHeightTable=ListadosCentrosCostosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ListadosCentrosCostosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ListadosCentrosCostosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosListadosCentrosCostos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosListadosCentrosCostos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosListadosCentrosCostos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosListadosCentrosCostos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosListadosCentrosCostos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosListadosCentrosCostos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByListadosCentrosCostos!=null && this.jInternalFrameOrderByListadosCentrosCostos.getjTableDatosOrderBy()!=null) {
			//if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByListadosCentrosCostos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByListadosCentrosCostos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByListadosCentrosCostos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByListadosCentrosCostos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByListadosCentrosCostos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByListadosCentrosCostos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByListadosCentrosCostos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosListadosCentrosCostos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosListadosCentrosCostos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosListadosCentrosCostos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=listadoscentroscostosLogic.getListadosCentrosCostoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadoscentroscostoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ListadosCentrosCostos> TraerListadosCentrosCostosBeans(List<ListadosCentrosCostos> listadoscentroscostoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ListadosCentrosCostos listadoscentroscostos:listadoscentroscostoss) {
					
				if(!(ListadosCentrosCostosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ListadosCentrosCostosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					listadoscentroscostos.setsDetalleGeneralEntityReporte(ListadosCentrosCostosConstantesFunciones.getListadosCentrosCostosDescripcion(listadoscentroscostos));
										
						
					
						
					
				} else  {
							
					//listadoscentroscostos.setsDetalleGeneralEntityReporte(listadoscentroscostos.getsDetalleGeneralEntityReporte());
										
				}
				
				//listadoscentroscostosbeans.add(listadoscentroscostosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return listadoscentroscostoss;
    }
	//PARA REPORTES FIN
}
