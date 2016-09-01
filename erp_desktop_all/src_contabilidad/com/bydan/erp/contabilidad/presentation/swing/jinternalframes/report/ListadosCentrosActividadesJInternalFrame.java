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
import com.bydan.erp.contabilidad.util.report.ListadosCentrosActividadesConstantesFunciones;

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
public class ListadosCentrosActividadesJInternalFrame extends ListadosCentrosActividadesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarListadosCentrosActividades;
	
	protected JMenuBar jmenuBarListadosCentrosActividades;
	
	protected JMenu jmenuListadosCentrosActividades;
	protected JMenu jmenuDatosListadosCentrosActividades;
	protected JMenu jmenuArchivoListadosCentrosActividades;
	protected JMenu jmenuAccionesListadosCentrosActividades;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosListadosCentrosActividades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutListadosCentrosActividades;	
	protected GridBagConstraints gridBagConstraintsListadosCentrosActividades;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ListadosCentrosActividadesDetalleFormJInternalFrame jInternalFrameDetalleFormListadosCentrosActividades;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoListadosCentrosActividades;	
	protected ImportacionJInternalFrame jInternalFrameImportacionListadosCentrosActividades;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ListadosCentrosActividadesSessionBean listadoscentrosactividadesSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ListadosCentrosActividades> listadoscentrosactividadess;		
	public List<ListadosCentrosActividades> listadoscentrosactividadessEliminados;	
	public List<ListadosCentrosActividades> listadoscentrosactividadessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByListadosCentrosActividades;		
	protected JButton jButtonAbrirOrderByListadosCentrosActividades;
	
	
	//protected JPanel jPanelOrderByListadosCentrosActividades;
	//public JScrollPane jScrollPanelOrderByListadosCentrosActividades;	
	//protected JButton jButtonCerrarOrderByListadosCentrosActividades;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ListadosCentrosActividadesLogic listadoscentrosactividadesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosListadosCentrosActividades;
	public JScrollPane jScrollPanelDatosEdicionListadosCentrosActividades;
	public JScrollPane jScrollPanelDatosGeneralListadosCentrosActividades;
    
	
	
	//public JScrollPane jScrollPanelDatosListadosCentrosActividadesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoListadosCentrosActividades;
	//public JScrollPane jScrollPanelImportacionListadosCentrosActividades;
	
	
	
	protected JPanel jPanelAccionesListadosCentrosActividades;
	
    protected JPanel jPanelPaginacionListadosCentrosActividades;
    protected JPanel jPanelParametrosReportesListadosCentrosActividades;
	protected JPanel jPanelParametrosReportesAccionesListadosCentrosActividades;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ListadosCentrosActividades;
	protected JPanel jPanelParametrosAuxiliar2ListadosCentrosActividades;
	protected JPanel jPanelParametrosAuxiliar3ListadosCentrosActividades;
	protected JPanel jPanelParametrosAuxiliar4ListadosCentrosActividades;
	//protected JPanel jPanelParametrosAuxiliar5ListadosCentrosActividades;
	
	
	
	//protected JPanel jPanelReporteDinamicoListadosCentrosActividades;
	//protected JPanel jPanelImportacionListadosCentrosActividades;
	
	
	public JTable jTableDatosListadosCentrosActividades;
	
	
	
	//public JTable jTableDatosListadosCentrosActividadesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoListadosCentrosActividades;
	protected JButton jButtonDuplicarListadosCentrosActividades;
	protected JButton jButtonCopiarListadosCentrosActividades;
	protected JButton jButtonVerFormListadosCentrosActividades;
	protected JButton jButtonNuevoRelacionesListadosCentrosActividades;
	protected JButton jButtonModificarListadosCentrosActividades;
	
    protected JButton jButtonGuardarCambiosTablaListadosCentrosActividades;
	protected JButton jButtonCerrarListadosCentrosActividades;
	
	
	protected JButton jButtonRecargarInformacionListadosCentrosActividades;
	protected JButton jButtonProcesarInformacionListadosCentrosActividades;
	
	
	protected JButton jButtonAnterioresListadosCentrosActividades;
	protected JButton jButtonSiguientesListadosCentrosActividades;
	protected JButton jButtonNuevoGuardarCambiosListadosCentrosActividades;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoListadosCentrosActividades;
	//protected JButton jButtonCerrarReporteDinamicoListadosCentrosActividades;
	//protected JButton jButtonGenerarExcelReporteDinamicoListadosCentrosActividades;	
	
	
	
	//protected JButton jButtonAbrirImportacionListadosCentrosActividades;
	//protected JButton jButtonGenerarImportacionListadosCentrosActividades;
	//protected JButton jButtonCerrarImportacionListadosCentrosActividades;
	//protected JFileChooser jFileChooserImportacionListadosCentrosActividades;
	//protected File fileImportacionListadosCentrosActividades;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarListadosCentrosActividades;
	protected JButton jButtonDuplicarToolBarListadosCentrosActividades;
	protected JButton jButtonNuevoRelacionesToolBarListadosCentrosActividades;
	
	
	public JButton jButtonGuardarCambiosToolBarListadosCentrosActividades;
	protected JButton jButtonCopiarToolBarListadosCentrosActividades;
	protected JButton jButtonVerFormToolBarListadosCentrosActividades;
	public JButton jButtonGuardarCambiosTablaToolBarListadosCentrosActividades;
	protected JButton jButtonMostrarOcultarTablaToolBarListadosCentrosActividades;
	protected JButton jButtonCerrarToolBarListadosCentrosActividades;
	
	protected JButton jButtonRecargarInformacionToolBarListadosCentrosActividades;
	protected JButton jButtonProcesarInformacionToolBarListadosCentrosActividades;
	protected JButton jButtonAnterioresToolBarListadosCentrosActividades;
	protected JButton jButtonSiguientesToolBarListadosCentrosActividades;
	protected JButton jButtonNuevoGuardarCambiosToolBarListadosCentrosActividades;
	protected JButton jButtonAbrirOrderByToolBarListadosCentrosActividades;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoListadosCentrosActividades;
	protected JMenuItem jMenuItemDuplicarListadosCentrosActividades;
	protected JMenuItem jMenuItemNuevoRelacionesListadosCentrosActividades;
	
	
	protected JMenuItem jMenuItemGuardarCambiosListadosCentrosActividades;
	protected JMenuItem jMenuItemCopiarListadosCentrosActividades;
	protected JMenuItem jMenuItemVerFormListadosCentrosActividades;
	protected JMenuItem jMenuItemGuardarCambiosTablaListadosCentrosActividades;
	protected JMenuItem jMenuItemCerrarListadosCentrosActividades;
	protected JMenuItem jMenuItemDetalleCerrarListadosCentrosActividades;
	protected JMenuItem jMenuItemDetalleAbrirOrderByListadosCentrosActividades;
	protected JMenuItem jMenuItemDetalleMostarOcultarListadosCentrosActividades;
	
	protected JMenuItem jMenuItemRecargarInformacionListadosCentrosActividades;
	protected JMenuItem jMenuItemProcesarInformacionListadosCentrosActividades;
	protected JMenuItem jMenuItemAnterioresListadosCentrosActividades;
	protected JMenuItem jMenuItemSiguientesListadosCentrosActividades;
	protected JMenuItem jMenuItemNuevoGuardarCambiosListadosCentrosActividades;
	protected JMenuItem jMenuItemAbrirOrderByListadosCentrosActividades;
	protected JMenuItem jMenuItemMostrarOcultarListadosCentrosActividades;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesListadosCentrosActividades;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosListadosCentrosActividades;
	protected JCheckBox jCheckBoxSeleccionadosListadosCentrosActividades;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaListadosCentrosActividades;
	protected JCheckBox jCheckBoxConGraficoReporteListadosCentrosActividades;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesListadosCentrosActividades;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesListadosCentrosActividades;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoListadosCentrosActividades;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoListadosCentrosActividades;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesListadosCentrosActividades;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionListadosCentrosActividades;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesListadosCentrosActividades;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesListadosCentrosActividades;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarListadosCentrosActividades;
	protected JTextField jTextFieldValorCampoGeneralListadosCentrosActividades;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteListadosCentrosActividades;
	//public JList<Reporte> jListColumnasSelectReporteListadosCentrosActividades;
	//public JScrollPane jScrollColumnasSelectReporteListadosCentrosActividades;
	
	//public JLabel jLabelRelacionesSelectReporteListadosCentrosActividades;
	//public JList<Reporte> jListRelacionesSelectReporteListadosCentrosActividades;
	//public JScrollPane jScrollRelacionesSelectReporteListadosCentrosActividades;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoListadosCentrosActividades;
	//protected JCheckBox jCheckBoxConGraficoDinamicoListadosCentrosActividades;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoListadosCentrosActividades;
	//public JLabel jLabelTiposArchivoReporteDinamicoListadosCentrosActividades;
	
		
	//public JLabel jLabelArchivoImportacionListadosCentrosActividades;	
	//public JLabel jLabelPathArchivoImportacionListadosCentrosActividades;
	//protected JTextField jTextFieldPathArchivoImportacionListadosCentrosActividades;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoListadosCentrosActividades;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoListadosCentrosActividades;
	
	//public JLabel jLabelColumnaCategoriaValorListadosCentrosActividades;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorListadosCentrosActividades;
	
	//public JLabel jLabelColumnasValoresGraficoListadosCentrosActividades;
	//public JList<Reporte> jListColumnasValoresGraficoListadosCentrosActividades;
	//public JScrollPane jScrollColumnasValoresGraficoListadosCentrosActividades;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoListadosCentrosActividades;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoListadosCentrosActividades;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasListadosCentrosActividades;
	public JPanel jPanelBusquedaListadosCentrosActividadesListadosCentrosActividades;
	public JButton jButtonBusquedaListadosCentrosActividadesListadosCentrosActividades;
	
	public JPanel jPanelIdIdBusquedaListadosCentrosActividadesListadosCentrosActividades;
	public JLabel jLabelidBusquedaListadosCentrosActividadesListadosCentrosActividades;
	public JTextFieldMe jLabelidListadosCentrosActividadesBusquedaListadosCentrosActividades;
	public JButton jButtonidBusquedaListadosCentrosActividadesListadosCentrosActividadesBusqueda= new JButtonMe();

	
	
	
	
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
	public ListadosCentrosActividadesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ListadosCentrosActividades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosCentrosActividadesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosCentrosActividades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosCentrosActividadesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosCentrosActividades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosCentrosActividadesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ListadosCentrosActividades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionListadosCentrosActividades)	{
		this.jButtonRecargarInformacionListadosCentrosActividades = jButtonRecargarInformacionListadosCentrosActividades;
	}
	
	public JButton getjButtonProcesarInformacionListadosCentrosActividades() {
		return this.jButtonProcesarInformacionListadosCentrosActividades;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionListadosCentrosActividades)	{
		this.jButtonProcesarInformacionListadosCentrosActividades = jButtonProcesarInformacionListadosCentrosActividades;
	}
	
	
	public JButton getjButtonRecargarInformacionListadosCentrosActividades() {
		return this.jButtonRecargarInformacionListadosCentrosActividades;
	}
	
	
	public List<ListadosCentrosActividades> getlistadoscentrosactividadess() {
		return this.listadoscentrosactividadess;
	}

	public void setlistadoscentrosactividadess(List<ListadosCentrosActividades> listadoscentrosactividadess) {
		this.listadoscentrosactividadess = listadoscentrosactividadess;
	}
	
	public List<ListadosCentrosActividades> getlistadoscentrosactividadessAux() {
		return this.listadoscentrosactividadessAux;
	}

	public void setlistadoscentrosactividadessAux(List<ListadosCentrosActividades> listadoscentrosactividadessAux) {
		this.listadoscentrosactividadessAux = listadoscentrosactividadessAux;
	}
	
	public List<ListadosCentrosActividades> getlistadoscentrosactividadessEliminados() {
		return this.listadoscentrosactividadessEliminados;
	}

	public void setListadosCentrosActividadessEliminados(List<ListadosCentrosActividades> listadoscentrosactividadessEliminados) {
		this.listadoscentrosactividadessEliminados = listadoscentrosactividadessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarListadosCentrosActividades() {
		return jComboBoxTiposSeleccionarListadosCentrosActividades;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarListadosCentrosActividades(
			JComboBox jComboBoxTiposSeleccionarListadosCentrosActividades) {
		this.jComboBoxTiposSeleccionarListadosCentrosActividades = jComboBoxTiposSeleccionarListadosCentrosActividades;
	}
	
	public void setBorderResaltarTiposSeleccionarListadosCentrosActividades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarListadosCentrosActividades.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarListadosCentrosActividades .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralListadosCentrosActividades() {
		return jTextFieldValorCampoGeneralListadosCentrosActividades;
	}

	public void setjTextFieldValorCampoGeneralListadosCentrosActividades(
			JTextField jTextFieldValorCampoGeneralListadosCentrosActividades) {
		this.jTextFieldValorCampoGeneralListadosCentrosActividades = jTextFieldValorCampoGeneralListadosCentrosActividades;
	}

	public void setBorderResaltarValorCampoGeneralListadosCentrosActividades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosActividades.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralListadosCentrosActividades .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosListadosCentrosActividades() {
		return this.jCheckBoxSeleccionarTodosListadosCentrosActividades;
	}

	public void setjCheckBoxSeleccionarTodosListadosCentrosActividades(
			JCheckBox jCheckBoxSeleccionarTodosListadosCentrosActividades) {
		this.jCheckBoxSeleccionarTodosListadosCentrosActividades = jCheckBoxSeleccionarTodosListadosCentrosActividades;
	}

	public void setBorderResaltarSeleccionarTodosListadosCentrosActividades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosActividades.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosListadosCentrosActividades .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosListadosCentrosActividades() {
		return this.jCheckBoxSeleccionadosListadosCentrosActividades;
	}

	public void setjCheckBoxSeleccionadosListadosCentrosActividades(
			JCheckBox jCheckBoxSeleccionadosListadosCentrosActividades) {
		this.jCheckBoxSeleccionadosListadosCentrosActividades = jCheckBoxSeleccionadosListadosCentrosActividades;
	}
	
	public void setBorderResaltarSeleccionadosListadosCentrosActividades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosActividades.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosListadosCentrosActividades .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesListadosCentrosActividades() {
		return this.jComboBoxTiposArchivosReportesListadosCentrosActividades;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesListadosCentrosActividades(
			JComboBox jComboBoxTiposArchivosReportesListadosCentrosActividades) {
		this.jComboBoxTiposArchivosReportesListadosCentrosActividades = jComboBoxTiposArchivosReportesListadosCentrosActividades;
	}

	public void setBorderResaltarTiposArchivosReportesListadosCentrosActividades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosActividades.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesListadosCentrosActividades .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesListadosCentrosActividades() {
		return this.jComboBoxTiposReportesListadosCentrosActividades;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesListadosCentrosActividades(
			JComboBox jComboBoxTiposReportesListadosCentrosActividades) {
		this.jComboBoxTiposReportesListadosCentrosActividades = jComboBoxTiposReportesListadosCentrosActividades;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoListadosCentrosActividades() {
	//	return jComboBoxTiposReportesDinamicoListadosCentrosActividades;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoListadosCentrosActividades(
	//		JComboBox jComboBoxTiposReportesDinamicoListadosCentrosActividades) {
	//	this.jComboBoxTiposReportesDinamicoListadosCentrosActividades = jComboBoxTiposReportesDinamicoListadosCentrosActividades;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoListadosCentrosActividades() {
	//	return jComboBoxTiposArchivosReportesDinamicoListadosCentrosActividades;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoListadosCentrosActividades(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoListadosCentrosActividades) {
	//	this.jComboBoxTiposArchivosReportesDinamicoListadosCentrosActividades = jComboBoxTiposArchivosReportesDinamicoListadosCentrosActividades;
	//}
	
	public void setBorderResaltarTiposReportesListadosCentrosActividades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosActividades.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesListadosCentrosActividades .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesListadosCentrosActividades() {
		return this.jComboBoxTiposGraficosReportesListadosCentrosActividades;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesListadosCentrosActividades(
			JComboBox jComboBoxTiposGraficosReportesListadosCentrosActividades) {
		this.jComboBoxTiposGraficosReportesListadosCentrosActividades = jComboBoxTiposGraficosReportesListadosCentrosActividades;
	}
	
	public void setBorderResaltarTiposGraficosReportesListadosCentrosActividades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosActividades.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesListadosCentrosActividades .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionListadosCentrosActividades() {
		return this.jComboBoxTiposPaginacionListadosCentrosActividades;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionListadosCentrosActividades(
			JComboBox jComboBoxTiposPaginacionListadosCentrosActividades) {
		this.jComboBoxTiposPaginacionListadosCentrosActividades = jComboBoxTiposPaginacionListadosCentrosActividades;
	}
	
	public void setBorderResaltarTiposPaginacionListadosCentrosActividades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosActividades.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionListadosCentrosActividades .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesListadosCentrosActividades() {
		return this.jComboBoxTiposRelacionesListadosCentrosActividades;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesListadosCentrosActividades() {
		return this.jComboBoxTiposAccionesListadosCentrosActividades;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesListadosCentrosActividades(
			JComboBox jComboBoxTiposRelacionesListadosCentrosActividades) {
		this.jComboBoxTiposRelacionesListadosCentrosActividades = jComboBoxTiposRelacionesListadosCentrosActividades;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesListadosCentrosActividades(
			JComboBox jComboBoxTiposAccionesListadosCentrosActividades) {
		this.jComboBoxTiposAccionesListadosCentrosActividades = jComboBoxTiposAccionesListadosCentrosActividades;
	}
	
	public void setBorderResaltarTiposRelacionesListadosCentrosActividades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosActividades.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesListadosCentrosActividades .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesListadosCentrosActividades() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosCentrosActividades.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesListadosCentrosActividades .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoListadosCentrosActividades() {
	//	return jCheckBoxConGraficoDinamicoListadosCentrosActividades;
	//}

	//public void setjCheckBoxConGraficoDinamicoListadosCentrosActividades(
	//		JCheckBox jCheckBoxConGraficoDinamicoListadosCentrosActividades) {
	//	this.jCheckBoxConGraficoDinamicoListadosCentrosActividades = jCheckBoxConGraficoDinamicoListadosCentrosActividades;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoListadosCentrosActividades() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarListadosCentrosActividades.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoListadosCentrosActividades .setBorder(borderResaltar);		
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
		this.listadoscentrosactividadesSessionBean=new ListadosCentrosActividadesSessionBean();
		
		this.listadoscentrosactividadesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadoscentrosactividadesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ListadosCentrosActividadesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ListadosCentrosActividadesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ListadosCentrosActividadesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ListadosCentrosActividadesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ListadosCentrosActividadesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Listados Centros Actividades MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
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
		
		ListadosCentrosActividadesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ListadosCentrosActividades No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarListadosCentrosActividades= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarListadosCentrosActividades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarListadosCentrosActividades,this.jTtoolBarListadosCentrosActividades,
							"nuevo","nuevo","Nuevo"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarListadosCentrosActividades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarListadosCentrosActividades,this.jTtoolBarListadosCentrosActividades,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarListadosCentrosActividades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarListadosCentrosActividades,this.jTtoolBarListadosCentrosActividades,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarListadosCentrosActividades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarListadosCentrosActividades,this.jTtoolBarListadosCentrosActividades,
							"duplicar","duplicar","Duplicar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarListadosCentrosActividades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarListadosCentrosActividades,this.jTtoolBarListadosCentrosActividades,
							"copiar","copiar","Copiar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarListadosCentrosActividades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarListadosCentrosActividades,this.jTtoolBarListadosCentrosActividades,
							"ver_form","ver_form","Ver"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarListadosCentrosActividades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadosCentrosActividades,this.jTtoolBarListadosCentrosActividades,
							"recargar","recargar","Buscar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarListadosCentrosActividades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadosCentrosActividades,this.jTtoolBarListadosCentrosActividades,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarListadosCentrosActividades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadosCentrosActividades,this.jTtoolBarListadosCentrosActividades,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarListadosCentrosActividades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarListadosCentrosActividades,this.jTtoolBarListadosCentrosActividades,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarListadosCentrosActividades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarListadosCentrosActividades,this.jTtoolBarListadosCentrosActividades,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarListadosCentrosActividades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarListadosCentrosActividades,this.jTtoolBarListadosCentrosActividades,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarListadosCentrosActividades=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarListadosCentrosActividades,this.jTtoolBarListadosCentrosActividades,
							"cerrar","cerrar","Salir"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarListadosCentrosActividades=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarListadosCentrosActividades;
			
				this.jButtonProcesarInformacionToolBarListadosCentrosActividades=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarListadosCentrosActividades;
				
		//protected JButton jButtonModificarToolBarListadosCentrosActividades;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarListadosCentrosActividades=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuListadosCentrosActividades=new JMenuMe("General");
		this.jmenuArchivoListadosCentrosActividades=new JMenuMe("Archivo");
		this.jmenuAccionesListadosCentrosActividades=new JMenuMe("Acciones");
		this.jmenuDatosListadosCentrosActividades=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoListadosCentrosActividades= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoListadosCentrosActividades.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoListadosCentrosActividades,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarListadosCentrosActividades= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarListadosCentrosActividades.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarListadosCentrosActividades,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesListadosCentrosActividades= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesListadosCentrosActividades.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesListadosCentrosActividades,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosListadosCentrosActividades= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosListadosCentrosActividades.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosListadosCentrosActividades,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarListadosCentrosActividades= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarListadosCentrosActividades.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarListadosCentrosActividades,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormListadosCentrosActividades= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormListadosCentrosActividades.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormListadosCentrosActividades,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaListadosCentrosActividades= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaListadosCentrosActividades.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaListadosCentrosActividades,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarListadosCentrosActividades= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarListadosCentrosActividades.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarListadosCentrosActividades,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionListadosCentrosActividades= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionListadosCentrosActividades.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionListadosCentrosActividades,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionListadosCentrosActividades= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionListadosCentrosActividades.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionListadosCentrosActividades,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresListadosCentrosActividades= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresListadosCentrosActividades.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresListadosCentrosActividades,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesListadosCentrosActividades= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesListadosCentrosActividades.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesListadosCentrosActividades,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByListadosCentrosActividades= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByListadosCentrosActividades.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByListadosCentrosActividades,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarListadosCentrosActividades= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarListadosCentrosActividades.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarListadosCentrosActividades,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByListadosCentrosActividades= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByListadosCentrosActividades.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByListadosCentrosActividades,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarListadosCentrosActividades= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarListadosCentrosActividades.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarListadosCentrosActividades,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosListadosCentrosActividades= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosListadosCentrosActividades.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosListadosCentrosActividades,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoListadosCentrosActividades.add(this.jMenuItemCerrarListadosCentrosActividades);
			
			this.jmenuAccionesListadosCentrosActividades.add(this.jMenuItemNuevoListadosCentrosActividades);
			this.jmenuAccionesListadosCentrosActividades.add(this.jMenuItemNuevoGuardarCambiosListadosCentrosActividades);
			this.jmenuAccionesListadosCentrosActividades.add(this.jMenuItemNuevoRelacionesListadosCentrosActividades);
			this.jmenuAccionesListadosCentrosActividades.add(this.jMenuItemGuardarCambiosTablaListadosCentrosActividades);		
			this.jmenuAccionesListadosCentrosActividades.add(this.jMenuItemDuplicarListadosCentrosActividades);		
			this.jmenuAccionesListadosCentrosActividades.add(this.jMenuItemCopiarListadosCentrosActividades);		
			this.jmenuAccionesListadosCentrosActividades.add(this.jMenuItemVerFormListadosCentrosActividades);		
			
			this.jmenuDatosListadosCentrosActividades.add(this.jMenuItemRecargarInformacionListadosCentrosActividades);				
			this.jmenuDatosListadosCentrosActividades.add(this.jMenuItemAnterioresListadosCentrosActividades);				
			this.jmenuDatosListadosCentrosActividades.add(this.jMenuItemSiguientesListadosCentrosActividades);				
			this.jmenuDatosListadosCentrosActividades.add(this.jMenuItemAbrirOrderByListadosCentrosActividades);				
			this.jmenuDatosListadosCentrosActividades.add(this.jMenuItemMostrarOcultarListadosCentrosActividades);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesListadosCentrosActividades.add(this.jMenuItemGuardarCambiosListadosCentrosActividades);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarListadosCentrosActividades.add(this.jmenuArchivoListadosCentrosActividades);		
			this.jmenuBarListadosCentrosActividades.add(this.jmenuAccionesListadosCentrosActividades);		
			this.jmenuBarListadosCentrosActividades.add(this.jmenuDatosListadosCentrosActividades);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarListadosCentrosActividades);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasListadosCentrosActividades() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaListadosCentrosActividadesListadosCentrosActividades=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaListadosCentrosActividadesListadosCentrosActividades.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaListadosCentrosActividadesListadosCentrosActividades= new JButtonMe();
		this.jButtonBusquedaListadosCentrosActividadesListadosCentrosActividades.setText("Buscar");
		this.jButtonBusquedaListadosCentrosActividadesListadosCentrosActividades.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaListadosCentrosActividadesListadosCentrosActividades,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaListadosCentrosActividadesListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaListadosCentrosActividadesListadosCentrosActividades = new JLabelMe();
		jLabelidBusquedaListadosCentrosActividadesListadosCentrosActividades.setText("Id :");
		jLabelidBusquedaListadosCentrosActividadesListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaListadosCentrosActividadesListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaListadosCentrosActividadesListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaListadosCentrosActividadesListadosCentrosActividades,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidListadosCentrosActividadesBusquedaListadosCentrosActividades= new JTextFieldMe();
		jLabelidListadosCentrosActividadesBusquedaListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadosCentrosActividadesBusquedaListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadosCentrosActividadesBusquedaListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidListadosCentrosActividadesBusquedaListadosCentrosActividades.setVisible(false);




		this.jTabbedPaneBusquedasListadosCentrosActividades=new JTabbedPane();


		this.jTabbedPaneBusquedasListadosCentrosActividades.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasListadosCentrosActividades.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasListadosCentrosActividades.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasListadosCentrosActividades.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasListadosCentrosActividades,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleListadosCentrosActividades = new ListadosCentrosActividadesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Listados Centros Actividades DATOS");
			this.jInternalFrameDetalleFormListadosCentrosActividades = new ListadosCentrosActividadesDetalleFormJInternalFrame(jDesktopPane,this.listadoscentrosactividadesSessionBean.getConGuardarRelaciones(),this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormListadosCentrosActividades = null;//new ListadosCentrosActividadesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutListadosCentrosActividades= new GridBagLayout();
		
		
		this.jTableDatosListadosCentrosActividades = new JTableMe();      
		
		String sToolTipListadosCentrosActividades="";
		sToolTipListadosCentrosActividades=ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipListadosCentrosActividades+="(Contabilidad.ListadosCentrosActividades)";
		}
		
		if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
			sToolTipListadosCentrosActividades+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosListadosCentrosActividades.setToolTipText(sToolTipListadosCentrosActividades);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosListadosCentrosActividades);
		this.jTableDatosListadosCentrosActividades.setAutoCreateRowSorter(true);
		this.jTableDatosListadosCentrosActividades.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosListadosCentrosActividades.setRowSelectionAllowed(true);
		this.jTableDatosListadosCentrosActividades.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosListadosCentrosActividades,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoListadosCentrosActividades = new JButtonMe();
		this.jButtonDuplicarListadosCentrosActividades = new JButtonMe();
		this.jButtonCopiarListadosCentrosActividades = new JButtonMe();
		this.jButtonVerFormListadosCentrosActividades = new JButtonMe();
		this.jButtonNuevoRelacionesListadosCentrosActividades = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaListadosCentrosActividades = new JButtonMe();
		this.jButtonCerrarListadosCentrosActividades = new JButtonMe();
		
		this.jScrollPanelDatosListadosCentrosActividades = new JScrollPane();   
        this.jScrollPanelDatosGeneralListadosCentrosActividades = new JScrollPane();
		
				
		
		
		this.jPanelAccionesListadosCentrosActividades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Listados Centros Actividades";
		
		if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Centros Actividadeses" + this.sPath));
		} else {
			this.jScrollPanelDatosListadosCentrosActividades.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesListadosCentrosActividades.setToolTipText("Acciones");
        this.jPanelAccionesListadosCentrosActividades.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoListadosCentrosActividades=new ReporteDinamicoJInternalFrame(ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoListadosCentrosActividades();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionListadosCentrosActividades=new ImportacionJInternalFrame(ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionListadosCentrosActividades();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByListadosCentrosActividades = new JButtonMe();
		
		this.jButtonAbrirOrderByListadosCentrosActividades.setText("Orden");
		this.jButtonAbrirOrderByListadosCentrosActividades.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByListadosCentrosActividades,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByListadosCentrosActividades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByListadosCentrosActividades=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosCentrosActividades,false,this);
			
			//this.cargarOrderByListadosCentrosActividades(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByListadosCentrosActividades=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosCentrosActividades,true,this);
			
			//this.cargarOrderByListadosCentrosActividades(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosListadosCentrosActividades.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosListadosCentrosActividades.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosListadosCentrosActividades.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosListadosCentrosActividades.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosListadosCentrosActividades.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosListadosCentrosActividades.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoListadosCentrosActividades.setText("Nuevo");
		this.jButtonDuplicarListadosCentrosActividades.setText("Duplicar");
		this.jButtonCopiarListadosCentrosActividades.setText("Copiar");
		this.jButtonVerFormListadosCentrosActividades.setText("Ver");
		this.jButtonNuevoRelacionesListadosCentrosActividades.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaListadosCentrosActividades.setText("Guardar");
		this.jButtonCerrarListadosCentrosActividades.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoListadosCentrosActividades,"nuevo_button","Nuevo",this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarListadosCentrosActividades,"duplicar_button","Duplicar",this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarListadosCentrosActividades,"copiar_button","Copiar",this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormListadosCentrosActividades,"ver_form","Ver",this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesListadosCentrosActividades,"nuevorelaciones_button","Nuevo Rel",this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaListadosCentrosActividades,"guardarcambiostabla_button","Guardar",this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarListadosCentrosActividades,"cerrar_button","Salir",this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoListadosCentrosActividades.setToolTipText("Nuevo"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarListadosCentrosActividades.setToolTipText("Duplicar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarListadosCentrosActividades.setToolTipText("Copiar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormListadosCentrosActividades.setToolTipText("Ver"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesListadosCentrosActividades.setToolTipText("Nuevo Rel"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaListadosCentrosActividades.setToolTipText("Guardar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarListadosCentrosActividades.setToolTipText("Salir"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoListadosCentrosActividades";
		inputMap = this.jButtonNuevoListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoListadosCentrosActividades.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoListadosCentrosActividades"));
		
		//DUPLICAR
		sMapKey = "DuplicarListadosCentrosActividades";
		inputMap = this.jButtonDuplicarListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarListadosCentrosActividades.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarListadosCentrosActividades"));
		
		//COPIAR
		sMapKey = "CopiarListadosCentrosActividades";
		inputMap = this.jButtonCopiarListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarListadosCentrosActividades.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarListadosCentrosActividades"));
		
		//VEr FORM
		sMapKey = "VerFormListadosCentrosActividades";
		inputMap = this.jButtonVerFormListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormListadosCentrosActividades.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormListadosCentrosActividades"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesListadosCentrosActividades";
		inputMap = this.jButtonNuevoRelacionesListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesListadosCentrosActividades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesListadosCentrosActividades"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarListadosCentrosActividades";
		inputMap = this.jButtonModificarListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarListadosCentrosActividades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarListadosCentrosActividades"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarListadosCentrosActividades";
		inputMap = this.jButtonCerrarListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarListadosCentrosActividades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarListadosCentrosActividades"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaListadosCentrosActividades";
		inputMap = this.jButtonGuardarCambiosTablaListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaListadosCentrosActividades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaListadosCentrosActividades"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesListadosCentrosActividades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesListadosCentrosActividades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionListadosCentrosActividades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ListadosCentrosActividades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ListadosCentrosActividades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ListadosCentrosActividades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ListadosCentrosActividades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ListadosCentrosActividades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesListadosCentrosActividades.setName("jPanelParametrosReportesListadosCentrosActividades"); 
		
		this.jPanelParametrosReportesAccionesListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesListadosCentrosActividades.setName("jPanelParametrosReportesAccionesListadosCentrosActividades"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionListadosCentrosActividades = new JButtonMe();
		this.jButtonRecargarInformacionListadosCentrosActividades.setText("Buscar");
		this.jButtonRecargarInformacionListadosCentrosActividades.setToolTipText("Buscar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionListadosCentrosActividades,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionListadosCentrosActividades.setVisible(false);
		
		
		this.jButtonProcesarInformacionListadosCentrosActividades = new JButtonMe();
		this.jButtonProcesarInformacionListadosCentrosActividades.setText("Procesar");
		this.jButtonProcesarInformacionListadosCentrosActividades.setToolTipText("Procesar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionListadosCentrosActividades.setVisible(false);
			
		this.jButtonProcesarInformacionListadosCentrosActividades.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionListadosCentrosActividades.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionListadosCentrosActividades.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesListadosCentrosActividades = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadosCentrosActividades.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesListadosCentrosActividades.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesListadosCentrosActividades = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadosCentrosActividades.setText("TIPO");       
		this.jComboBoxTiposReportesListadosCentrosActividades.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesListadosCentrosActividades = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadosCentrosActividades.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesListadosCentrosActividades.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionListadosCentrosActividades = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionListadosCentrosActividades.setText("Paginacion");
		this.jComboBoxTiposPaginacionListadosCentrosActividades.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesListadosCentrosActividades = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesListadosCentrosActividades.setText("Accion");
		this.jComboBoxTiposRelacionesListadosCentrosActividades.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesListadosCentrosActividades = new JComboBoxMe();
		//this.jComboBoxTiposAccionesListadosCentrosActividades.setText("Accion");
		this.jComboBoxTiposAccionesListadosCentrosActividades.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarListadosCentrosActividades = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarListadosCentrosActividades.setText("Accion");
		this.jComboBoxTiposSeleccionarListadosCentrosActividades.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralListadosCentrosActividades=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralListadosCentrosActividades.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralListadosCentrosActividades.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralListadosCentrosActividades.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesListadosCentrosActividades = new JLabelMe();
		
		this.jLabelAccionesListadosCentrosActividades.setText("Acciones");		
		this.jLabelAccionesListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosListadosCentrosActividades = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosListadosCentrosActividades.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosListadosCentrosActividades.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosListadosCentrosActividades = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosListadosCentrosActividades.setText("Seleccionados");
		this.jCheckBoxSeleccionadosListadosCentrosActividades.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaListadosCentrosActividades = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaListadosCentrosActividades.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaListadosCentrosActividades.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteListadosCentrosActividades = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteListadosCentrosActividades.setText("Graf.");
		this.jCheckBoxConGraficoReporteListadosCentrosActividades.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresListadosCentrosActividades = new JButtonMe();
		//this.jButtonAnterioresListadosCentrosActividades.setText("<<");
        this.jButtonAnterioresListadosCentrosActividades.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresListadosCentrosActividades,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesListadosCentrosActividades = new JButtonMe();
		//this.jButtonSiguientesListadosCentrosActividades.setText(">>");
        this.jButtonSiguientesListadosCentrosActividades.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesListadosCentrosActividades,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosListadosCentrosActividades = new JButtonMe();
		this.jButtonNuevoGuardarCambiosListadosCentrosActividades.setText("Nue");
        this.jButtonNuevoGuardarCambiosListadosCentrosActividades.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosListadosCentrosActividades,"nuevoguardarcambios_button","Nue",this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosListadosCentrosActividades";
		inputMap = this.jButtonNuevoGuardarCambiosListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosListadosCentrosActividades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosListadosCentrosActividades"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionListadosCentrosActividades";
		inputMap = this.jButtonRecargarInformacionListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionListadosCentrosActividades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionListadosCentrosActividades"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesListadosCentrosActividades";
		inputMap = this.jButtonSiguientesListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesListadosCentrosActividades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesListadosCentrosActividades"));
		
		//ANTERIORES		
		sMapKey = "AnterioresListadosCentrosActividades";
		inputMap = this.jButtonAnterioresListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresListadosCentrosActividades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresListadosCentrosActividades"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasListadosCentrosActividades();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesListadosCentrosActividades.setMinimumSize(new Dimension(this.getWidth(),ListadosCentrosActividadesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadosCentrosActividadesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesListadosCentrosActividades.setMaximumSize(new Dimension(this.getWidth(),ListadosCentrosActividadesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadosCentrosActividadesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesListadosCentrosActividades.setPreferredSize(new Dimension(this.getWidth(),ListadosCentrosActividadesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadosCentrosActividadesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionListadosCentrosActividades = new GridBagLayout();

			this.jPanelPaginacionListadosCentrosActividades.setLayout(gridaBagLayoutPaginacionListadosCentrosActividades);						
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
			this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionListadosCentrosActividades.add(this.jButtonAnterioresListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
					
						
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
			
			this.jPanelPaginacionListadosCentrosActividades.add(this.jButtonNuevoGuardarCambiosListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
						
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
			this.jPanelPaginacionListadosCentrosActividades.add(this.jButtonSiguientesListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosActividades.gridy = 1;
			this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosCentrosActividades.add(this.jButtonNuevoListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
						
			
			
			if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
				this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsListadosCentrosActividades.gridy = 1;
				this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionListadosCentrosActividades.add(this.jButtonGuardarCambiosTablaListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
			}
			
			
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosActividades.gridy = 1;
			this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosCentrosActividades.add(this.jButtonDuplicarListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosActividades.gridy = 1;
			this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosCentrosActividades.add(this.jButtonCopiarListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosActividades.gridy = 1;
			this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosCentrosActividades.add(this.jButtonVerFormListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosActividades.gridy = 1;
			this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionListadosCentrosActividades.add(this.jButtonCerrarListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		
		
		
		this.jButtonRecargarInformacionListadosCentrosActividades.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionListadosCentrosActividades.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionListadosCentrosActividades.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesListadosCentrosActividades.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesListadosCentrosActividades.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesListadosCentrosActividades.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesListadosCentrosActividades.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesListadosCentrosActividades.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesListadosCentrosActividades.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesListadosCentrosActividades.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesListadosCentrosActividades.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesListadosCentrosActividades.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionListadosCentrosActividades.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionListadosCentrosActividades.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionListadosCentrosActividades.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesListadosCentrosActividades.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesListadosCentrosActividades.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesListadosCentrosActividades.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesListadosCentrosActividades.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosCentrosActividades.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosCentrosActividades.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarListadosCentrosActividades.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarListadosCentrosActividades.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarListadosCentrosActividades.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaListadosCentrosActividades.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaListadosCentrosActividades.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaListadosCentrosActividades.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteListadosCentrosActividades.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteListadosCentrosActividades.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteListadosCentrosActividades.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosListadosCentrosActividades.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosListadosCentrosActividades.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosListadosCentrosActividades.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosListadosCentrosActividades.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosListadosCentrosActividades.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosListadosCentrosActividades.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesListadosCentrosActividades = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesListadosCentrosActividades = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ListadosCentrosActividades = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ListadosCentrosActividades = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ListadosCentrosActividades = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ListadosCentrosActividades = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesListadosCentrosActividades.setLayout(gridaBagParametrosReportesListadosCentrosActividades);
			this.jPanelParametrosReportesAccionesListadosCentrosActividades.setLayout(gridaBagParametrosReportesAccionesListadosCentrosActividades);
			
			
			this.jPanelParametrosAuxiliar1ListadosCentrosActividades.setLayout(gridaBagParametrosAuxiliar1ListadosCentrosActividades);
			this.jPanelParametrosAuxiliar2ListadosCentrosActividades.setLayout(gridaBagParametrosAuxiliar2ListadosCentrosActividades);
			this.jPanelParametrosAuxiliar3ListadosCentrosActividades.setLayout(gridaBagParametrosAuxiliar3ListadosCentrosActividades);
			this.jPanelParametrosAuxiliar4ListadosCentrosActividades.setLayout(gridaBagParametrosAuxiliar4ListadosCentrosActividades);
			//this.jPanelParametrosAuxiliar5ListadosCentrosActividades.setLayout(gridaBagParametrosAuxiliar2ListadosCentrosActividades);			
			
			
			
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosCentrosActividades.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadosCentrosActividades.add(this.jButtonRecargarInformacionListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosActividades.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadosCentrosActividades.add(this.jComboBoxTiposPaginacionListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosActividades.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadosCentrosActividades.add(this.jCheckBoxConAltoMaximoTablaListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosActividades.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadosCentrosActividades.add(this.jComboBoxTiposArchivosReportesListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosActividades.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosCentrosActividades.add(this.jPanelParametrosAuxiliar1ListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosActividades.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosCentrosActividades.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ListadosCentrosActividades.add(this.jComboBoxTiposReportesListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosActividades.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosCentrosActividades.add(this.jPanelParametrosAuxiliar4ListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosActividades.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosCentrosActividades.add(this.jComboBoxTiposReportesListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosActividades.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosCentrosActividades.add(this.jCheckBoxGenerarReporteListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosActividades.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosCentrosActividades.add(this.jPanelParametrosAuxiliar2ListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosCentrosActividades.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosCentrosActividades.add(this.jLabelAccionesListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
				this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsListadosCentrosActividades.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesListadosCentrosActividades.add(this.jButtonAbrirOrderByListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosActividades.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadosCentrosActividades.add(this.jComboBoxTiposSeleccionarListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);			
			
			
			/*
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosCentrosActividades.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosCentrosActividades.add(this.jCheckBoxSeleccionarTodosListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosActividades.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosCentrosActividades.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadosCentrosActividades.add(this.jCheckBoxSeleccionarTodosListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);															
				
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosActividades.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosCentrosActividades.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadosCentrosActividades.add(this.jCheckBoxSeleccionadosListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosActividades.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosCentrosActividades.add(this.jPanelParametrosAuxiliar3ListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosCentrosActividades.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadosCentrosActividades.add(this.jComboBoxTiposAccionesListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosListadosCentrosActividades = new GridBagLayout();

			this.jScrollPanelDatosListadosCentrosActividades.setLayout(gridaBagLayoutDatosListadosCentrosActividades);
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
			this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
			
			this.jScrollPanelDatosListadosCentrosActividades.add(this.jTableDatosListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosListadosCentrosActividades.setViewportView(this.jTableDatosListadosCentrosActividades);
		this.jTableDatosListadosCentrosActividades.setFillsViewportHeight(true);
		this.jTableDatosListadosCentrosActividades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesListadosCentrosActividades= new GridBagLayout();
		this.jPanelAccionesListadosCentrosActividades.setLayout(gridaBagLayoutAccionesListadosCentrosActividades);
		
		
		/*	
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = 0;
		this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
			
		this.jPanelAccionesListadosCentrosActividades.add(this.jButtonNuevoListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaListadosCentrosActividadesListadosCentrosActividades= new GridBagLayout();
		gridaBagLayoutBusquedaListadosCentrosActividadesListadosCentrosActividades.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaListadosCentrosActividadesListadosCentrosActividades.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaListadosCentrosActividadesListadosCentrosActividades.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaListadosCentrosActividadesListadosCentrosActividades.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaListadosCentrosActividadesListadosCentrosActividades.setLayout(gridaBagLayoutBusquedaListadosCentrosActividadesListadosCentrosActividades);

		gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosCentrosActividades.gridy = 0;
		gridBagConstraintsListadosCentrosActividades.gridx = 0;
		jPanelBusquedaListadosCentrosActividadesListadosCentrosActividades.add(jLabelidBusquedaListadosCentrosActividadesListadosCentrosActividades, gridBagConstraintsListadosCentrosActividades);

		gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosCentrosActividades.gridy = 0;
		gridBagConstraintsListadosCentrosActividades.gridx = 1;
		jPanelBusquedaListadosCentrosActividadesListadosCentrosActividades.add(jLabelidListadosCentrosActividadesBusquedaListadosCentrosActividades, gridBagConstraintsListadosCentrosActividades);

		gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosCentrosActividades.gridy = 1;
		gridBagConstraintsListadosCentrosActividades.gridx =1;
		jPanelBusquedaListadosCentrosActividadesListadosCentrosActividades.add(jButtonBusquedaListadosCentrosActividadesListadosCentrosActividades, gridBagConstraintsListadosCentrosActividades);

		jTabbedPaneBusquedasListadosCentrosActividades.addTab("1.-Por Id ", jPanelBusquedaListadosCentrosActividadesListadosCentrosActividades);
		jTabbedPaneBusquedasListadosCentrosActividades.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutListadosCentrosActividades = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutListadosCentrosActividades);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();						
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadosCentrosActividades.gridx = 0;		
			//this.gridBagConstraintsListadosCentrosActividades.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsListadosCentrosActividades.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyPrincipal++;
		this.gridBagConstraintsListadosCentrosActividades.gridx = 0;		
		//this.gridBagConstraintsListadosCentrosActividades.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsListadosCentrosActividades.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsListadosCentrosActividades);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadosCentrosActividades.gridx = 0;		
			this.gridBagConstraintsListadosCentrosActividades.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosActividades.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsListadosCentrosActividades.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);								
		
		
		/*
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		*/		
		
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy =iGridyPrincipal++;
		this.gridBagConstraintsListadosCentrosActividades.gridx =0;
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsListadosCentrosActividades.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
				
		
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ListadosCentrosActividadesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosListadosCentrosActividades= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosListadosCentrosActividades = new GridBagLayout();
			this.jPanelBusquedasParametrosListadosCentrosActividades.setLayout(gridaBagLayoutBusquedasParametrosListadosCentrosActividades);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralListadosCentrosActividades=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralListadosCentrosActividades.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosCentrosActividades.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosCentrosActividades.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
			
			
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosActividades.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		
			
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsListadosCentrosActividades.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralListadosCentrosActividades;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoListadosCentrosActividades() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoListadosCentrosActividades = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoListadosCentrosActividades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoListadosCentrosActividades.setName("jPanelReporteDinamicoListadosCentrosActividades"); 
		
		this.jPanelReporteDinamicoListadosCentrosActividades.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoListadosCentrosActividades.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoListadosCentrosActividades.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoListadosCentrosActividades.setLayout(gridaBagLayoutReporteDinamicoListadosCentrosActividades);
		
		
		this.jInternalFrameReporteDinamicoListadosCentrosActividades= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoListadosCentrosActividades = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteListadosCentrosActividades= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoListadosCentrosActividades.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoListadosCentrosActividades.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoListadosCentrosActividades.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoListadosCentrosActividades.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoListadosCentrosActividades.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoListadosCentrosActividades.setResizable(true);
	    this.jInternalFrameReporteDinamicoListadosCentrosActividades.setClosable(true);
	    this.jInternalFrameReporteDinamicoListadosCentrosActividades.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoListadosCentrosActividades.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoListadosCentrosActividades.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoListadosCentrosActividades.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Centros Actividadeses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteListadosCentrosActividades = new JLabelMe();

		this.jLabelColumnasSelectReporteListadosCentrosActividades.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadosCentrosActividades.add(this.jLabelColumnasSelectReporteListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteListadosCentrosActividades = new JList<Reporte>();
		this.jListColumnasSelectReporteListadosCentrosActividades.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteListadosCentrosActividades.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteListadosCentrosActividades.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteListadosCentrosActividades.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteListadosCentrosActividades.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteListadosCentrosActividades=new JScrollPane(this.jListColumnasSelectReporteListadosCentrosActividades);
			
			this.jScrollColumnasSelectReporteListadosCentrosActividades.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteListadosCentrosActividades.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteListadosCentrosActividades.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoListadosCentrosActividades.add(this.jListColumnasSelectReporteListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		this.jPanelReporteDinamicoListadosCentrosActividades.add(this.jScrollColumnasSelectReporteListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteListadosCentrosActividades = new JLabelMe();

		this.jLabelRelacionesSelectReporteListadosCentrosActividades.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteListadosCentrosActividades = new JList<Reporte>();
		this.jListRelacionesSelectReporteListadosCentrosActividades.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteListadosCentrosActividades.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteListadosCentrosActividades.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteListadosCentrosActividades.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteListadosCentrosActividades.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteListadosCentrosActividades=new JScrollPane(this.jListRelacionesSelectReporteListadosCentrosActividades);
			
			this.jScrollRelacionesSelectReporteListadosCentrosActividades.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteListadosCentrosActividades.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteListadosCentrosActividades.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoListadosCentrosActividades = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoListadosCentrosActividades = new JComboBoxMe();
		this.jListColumnasValoresGraficoListadosCentrosActividades = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoListadosCentrosActividades = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoListadosCentrosActividades.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoListadosCentrosActividades.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoListadosCentrosActividades.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoListadosCentrosActividades.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoListadosCentrosActividades = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoListadosCentrosActividades.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoListadosCentrosActividades.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoListadosCentrosActividades.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoListadosCentrosActividades.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoListadosCentrosActividades = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoListadosCentrosActividades.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosCentrosActividades.add(this.jLabelGenerarExcelReporteDinamicoListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoListadosCentrosActividades = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoListadosCentrosActividades.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoListadosCentrosActividades,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoListadosCentrosActividades.setToolTipText("Generar EXCEL"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		//this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsListadosCentrosActividades.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoListadosCentrosActividades.add(this.jButtonGenerarExcelReporteDinamicoListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosCentrosActividades.add(this.jComboBoxTiposReportesDinamicoListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoListadosCentrosActividades = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoListadosCentrosActividades.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosCentrosActividades.add(this.jLabelTiposArchivoReporteDinamicoListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosCentrosActividades.add(this.jComboBoxTiposArchivosReportesDinamicoListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoListadosCentrosActividades = new JButtonMe();
		this.jButtonGenerarReporteDinamicoListadosCentrosActividades.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoListadosCentrosActividades,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoListadosCentrosActividades.setToolTipText("Generar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosCentrosActividades.add(this.jButtonGenerarReporteDinamicoListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoListadosCentrosActividades = new JButtonMe();
		this.jButtonCerrarReporteDinamicoListadosCentrosActividades.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoListadosCentrosActividades,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoListadosCentrosActividades.setToolTipText("Cancelar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosCentrosActividades.add(this.jButtonCerrarReporteDinamicoListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalListadosCentrosActividades = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoListadosCentrosActividades= new JScrollPane(jPanelReporteDinamicoListadosCentrosActividades,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoListadosCentrosActividades.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoListadosCentrosActividades.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoListadosCentrosActividades.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Centros Actividadeses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsListadosCentrosActividades.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoListadosCentrosActividades.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoListadosCentrosActividades.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalListadosCentrosActividades);
		this.jInternalFrameReporteDinamicoListadosCentrosActividades.getContentPane().add(this.jScrollPanelReporteDinamicoListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionListadosCentrosActividades() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionListadosCentrosActividades = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionListadosCentrosActividades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionListadosCentrosActividades.setName("jPanelImportacionListadosCentrosActividades"); 
		
		this.jPanelImportacionListadosCentrosActividades.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionListadosCentrosActividades.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionListadosCentrosActividades.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionListadosCentrosActividades.setLayout(gridaBagLayoutImportacionListadosCentrosActividades);
		
		
		this.jInternalFrameImportacionListadosCentrosActividades= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionListadosCentrosActividades= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionListadosCentrosActividades = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteListadosCentrosActividades= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionListadosCentrosActividades.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionListadosCentrosActividades.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionListadosCentrosActividades.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionListadosCentrosActividades.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionListadosCentrosActividades.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionListadosCentrosActividades.setResizable(true);
	    this.jInternalFrameImportacionListadosCentrosActividades.setClosable(true);
	    this.jInternalFrameImportacionListadosCentrosActividades.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionListadosCentrosActividades.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionListadosCentrosActividades.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionListadosCentrosActividades.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionListadosCentrosActividades.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionListadosCentrosActividades.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionListadosCentrosActividades.setResizable(true);
	    this.jInternalFrameImportacionListadosCentrosActividades.setClosable(true);
	    this.jInternalFrameImportacionListadosCentrosActividades.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionListadosCentrosActividades.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionListadosCentrosActividades.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionListadosCentrosActividades.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Centros Actividadeses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionListadosCentrosActividades = new JLabelMe();

		this.jLabelArchivoImportacionListadosCentrosActividades.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = iPosYImportacion;		
		this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXImportacion++;
			
		this.jPanelImportacionListadosCentrosActividades.add(this.jLabelArchivoImportacionListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionListadosCentrosActividades = new JFileChooser();		
		this.jFileChooserImportacionListadosCentrosActividades.setToolTipText("ESCOGER ARCHIVO"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionListadosCentrosActividades = new JButtonMe();
		this.jButtonAbrirImportacionListadosCentrosActividades.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionListadosCentrosActividades,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionListadosCentrosActividades.setToolTipText("Generar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosCentrosActividades.add(this.jButtonAbrirImportacionListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionListadosCentrosActividades = new JLabelMe();

		this.jLabelPathArchivoImportacionListadosCentrosActividades.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionListadosCentrosActividades.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionListadosCentrosActividades.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionListadosCentrosActividades.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = iPosYImportacion;		
		this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXImportacion++;
			
		this.jPanelImportacionListadosCentrosActividades.add(this.jLabelPathArchivoImportacionListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionListadosCentrosActividades=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionListadosCentrosActividades.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionListadosCentrosActividades.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionListadosCentrosActividades.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosCentrosActividades.add(this.jTextFieldPathArchivoImportacionListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionListadosCentrosActividades = new JButtonMe();
		this.jButtonGenerarImportacionListadosCentrosActividades.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionListadosCentrosActividades,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionListadosCentrosActividades.setToolTipText("Generar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosCentrosActividades.add(this.jButtonGenerarImportacionListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionListadosCentrosActividades = new JButtonMe();
		this.jButtonCerrarImportacionListadosCentrosActividades.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionListadosCentrosActividades,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionListadosCentrosActividades.setToolTipText("Cancelar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosCentrosActividades.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosCentrosActividades.add(this.jButtonCerrarImportacionListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalListadosCentrosActividades = new GridBagLayout();
		
		this.jScrollPanelImportacionListadosCentrosActividades= new JScrollPane(jPanelImportacionListadosCentrosActividades,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
		this.gridBagConstraintsListadosCentrosActividades.gridy =iPosYImportacion;
		this.gridBagConstraintsListadosCentrosActividades.gridx =iPosXImportacion;
		this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionListadosCentrosActividades.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionListadosCentrosActividades.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalListadosCentrosActividades);
		this.jInternalFrameImportacionListadosCentrosActividades.getContentPane().add(this.jScrollPanelImportacionListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByListadosCentrosActividades(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByListadosCentrosActividades = new JButtonMe();
			this.jButtonAbrirOrderByListadosCentrosActividades.setText("Orden");
			this.jButtonAbrirOrderByListadosCentrosActividades.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByListadosCentrosActividades,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByListadosCentrosActividades";
			inputMap = this.jButtonAbrirOrderByListadosCentrosActividades.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByListadosCentrosActividades.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByListadosCentrosActividades"));
		
		
			GridBagLayout gridaBagLayoutOrderByListadosCentrosActividades = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByListadosCentrosActividades = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByListadosCentrosActividades.setName("jPanelOrderByListadosCentrosActividades"); 
			
			this.jPanelOrderByListadosCentrosActividades.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByListadosCentrosActividades.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByListadosCentrosActividades.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByListadosCentrosActividades.setLayout(gridaBagLayoutOrderByListadosCentrosActividades);
			
			
			this.jTableDatosListadosCentrosActividadesOrderBy = new JTableMe();        
			this.jTableDatosListadosCentrosActividadesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosListadosCentrosActividadesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosListadosCentrosActividadesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosListadosCentrosActividadesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosListadosCentrosActividadesOrderBy.setViewportView(this.jTableDatosListadosCentrosActividadesOrderBy);
			this.jTableDatosListadosCentrosActividadesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosListadosCentrosActividadesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByListadosCentrosActividades= new OrderByJInternalFrame();
			this.jInternalFrameOrderByListadosCentrosActividades= new OrderByJInternalFrame();
			this.jScrollPanelOrderByListadosCentrosActividades = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteListadosCentrosActividades= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByListadosCentrosActividades.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByListadosCentrosActividades.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByListadosCentrosActividades.setTitle("Orden");
			this.jInternalFrameOrderByListadosCentrosActividades.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByListadosCentrosActividades.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByListadosCentrosActividades.setResizable(true);
			this.jInternalFrameOrderByListadosCentrosActividades.setClosable(true);
			this.jInternalFrameOrderByListadosCentrosActividades.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByListadosCentrosActividades.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByListadosCentrosActividades.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByListadosCentrosActividades.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByListadosCentrosActividades.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Centros Actividadeses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.gridy =iPosYOrderBy++;
			this.gridBagConstraintsListadosCentrosActividades.gridx =iPosXOrderBy;
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsListadosCentrosActividades.ipady =150;
				
			this.jPanelOrderByListadosCentrosActividades.add(jScrollPanelDatosListadosCentrosActividadesOrderBy, this.gridBagConstraintsListadosCentrosActividades);//this.jTableDatosListadosCentrosActividadesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByListadosCentrosActividades = new JButtonMe();
			this.jButtonCerrarOrderByListadosCentrosActividades.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByListadosCentrosActividades,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByListadosCentrosActividades.setToolTipText("Cancelar"+" "+ListadosCentrosActividadesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByListadosCentrosActividades, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosCentrosActividades.gridy = iPosYOrderBy++;
			this.gridBagConstraintsListadosCentrosActividades.gridx = iPosXOrderBy;
									
			this.jPanelOrderByListadosCentrosActividades.add(this.jButtonCerrarOrderByListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalListadosCentrosActividades = new GridBagLayout();
			
			this.jScrollPanelOrderByListadosCentrosActividades= new JScrollPane(jPanelOrderByListadosCentrosActividades,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsListadosCentrosActividades = new GridBagConstraints();
			this.gridBagConstraintsListadosCentrosActividades.gridy =iPosYOrderBy;
			this.gridBagConstraintsListadosCentrosActividades.gridx =iPosXOrderBy;
			this.gridBagConstraintsListadosCentrosActividades.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByListadosCentrosActividades.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByListadosCentrosActividades.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalListadosCentrosActividades);
			
			this.jInternalFrameOrderByListadosCentrosActividades.getContentPane().add(this.jScrollPanelOrderByListadosCentrosActividades, this.gridBagConstraintsListadosCentrosActividades);			
		
		} else {
			this.jButtonAbrirOrderByListadosCentrosActividades = new JButtonMe();
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
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.listadoscentrosactividadesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosListadosCentrosActividades.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosListadosCentrosActividades.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosListadosCentrosActividades.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosListadosCentrosActividades.getRowHeight();//ListadosCentrosActividadesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ListadosCentrosActividadesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaListadosCentrosActividades.isSelected()) {
					iHeightTable=ListadosCentrosActividadesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ListadosCentrosActividadesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ListadosCentrosActividadesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ListadosCentrosActividadesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaListadosCentrosActividades.isSelected()) {
					iHeightTable=ListadosCentrosActividadesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ListadosCentrosActividadesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ListadosCentrosActividadesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosListadosCentrosActividades.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosListadosCentrosActividades.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosListadosCentrosActividades.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosListadosCentrosActividades.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosListadosCentrosActividades.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosListadosCentrosActividades.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByListadosCentrosActividades!=null && this.jInternalFrameOrderByListadosCentrosActividades.getjTableDatosOrderBy()!=null) {
			//if(!this.listadoscentrosactividadesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByListadosCentrosActividades.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByListadosCentrosActividades.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByListadosCentrosActividades.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByListadosCentrosActividades.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByListadosCentrosActividades.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByListadosCentrosActividades.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByListadosCentrosActividades.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosListadosCentrosActividades.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosListadosCentrosActividades.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosListadosCentrosActividades.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=listadoscentrosactividadesLogic.getListadosCentrosActividadess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadoscentrosactividadess.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ListadosCentrosActividades> TraerListadosCentrosActividadesBeans(List<ListadosCentrosActividades> listadoscentrosactividadess,ArrayList<Classe> classes)throws Exception {
		try {
			for(ListadosCentrosActividades listadoscentrosactividades:listadoscentrosactividadess) {
					
				if(!(ListadosCentrosActividadesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ListadosCentrosActividadesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					listadoscentrosactividades.setsDetalleGeneralEntityReporte(ListadosCentrosActividadesConstantesFunciones.getListadosCentrosActividadesDescripcion(listadoscentrosactividades));
										
						
					
						
					
				} else  {
							
					//listadoscentrosactividades.setsDetalleGeneralEntityReporte(listadoscentrosactividades.getsDetalleGeneralEntityReporte());
										
				}
				
				//listadoscentrosactividadesbeans.add(listadoscentrosactividadesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return listadoscentrosactividadess;
    }
	//PARA REPORTES FIN
}
