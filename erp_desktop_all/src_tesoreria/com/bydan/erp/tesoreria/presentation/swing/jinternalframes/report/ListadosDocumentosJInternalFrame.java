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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.ListadosDocumentosConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
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
public class ListadosDocumentosJInternalFrame extends ListadosDocumentosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarListadosDocumentos;
	
	protected JMenuBar jmenuBarListadosDocumentos;
	
	protected JMenu jmenuListadosDocumentos;
	protected JMenu jmenuDatosListadosDocumentos;
	protected JMenu jmenuArchivoListadosDocumentos;
	protected JMenu jmenuAccionesListadosDocumentos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosListadosDocumentos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutListadosDocumentos;	
	protected GridBagConstraints gridBagConstraintsListadosDocumentos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ListadosDocumentosDetalleFormJInternalFrame jInternalFrameDetalleFormListadosDocumentos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoListadosDocumentos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionListadosDocumentos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public ListadosDocumentosSessionBean listadosdocumentosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ListadosDocumentos> listadosdocumentoss;		
	public List<ListadosDocumentos> listadosdocumentossEliminados;	
	public List<ListadosDocumentos> listadosdocumentossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByListadosDocumentos;		
	protected JButton jButtonAbrirOrderByListadosDocumentos;
	
	
	//protected JPanel jPanelOrderByListadosDocumentos;
	//public JScrollPane jScrollPanelOrderByListadosDocumentos;	
	//protected JButton jButtonCerrarOrderByListadosDocumentos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ListadosDocumentosLogic listadosdocumentosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosListadosDocumentos;
	public JScrollPane jScrollPanelDatosEdicionListadosDocumentos;
	public JScrollPane jScrollPanelDatosGeneralListadosDocumentos;
    
	
	
	//public JScrollPane jScrollPanelDatosListadosDocumentosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoListadosDocumentos;
	//public JScrollPane jScrollPanelImportacionListadosDocumentos;
	
	
	
	protected JPanel jPanelAccionesListadosDocumentos;
	
    protected JPanel jPanelPaginacionListadosDocumentos;
    protected JPanel jPanelParametrosReportesListadosDocumentos;
	protected JPanel jPanelParametrosReportesAccionesListadosDocumentos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ListadosDocumentos;
	protected JPanel jPanelParametrosAuxiliar2ListadosDocumentos;
	protected JPanel jPanelParametrosAuxiliar3ListadosDocumentos;
	protected JPanel jPanelParametrosAuxiliar4ListadosDocumentos;
	//protected JPanel jPanelParametrosAuxiliar5ListadosDocumentos;
	
	
	
	//protected JPanel jPanelReporteDinamicoListadosDocumentos;
	//protected JPanel jPanelImportacionListadosDocumentos;
	
	
	public JTable jTableDatosListadosDocumentos;
	
	
	
	//public JTable jTableDatosListadosDocumentosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoListadosDocumentos;
	protected JButton jButtonDuplicarListadosDocumentos;
	protected JButton jButtonCopiarListadosDocumentos;
	protected JButton jButtonVerFormListadosDocumentos;
	protected JButton jButtonNuevoRelacionesListadosDocumentos;
	protected JButton jButtonModificarListadosDocumentos;
	
    protected JButton jButtonGuardarCambiosTablaListadosDocumentos;
	protected JButton jButtonCerrarListadosDocumentos;
	
	
	protected JButton jButtonRecargarInformacionListadosDocumentos;
	protected JButton jButtonProcesarInformacionListadosDocumentos;
	
	
	protected JButton jButtonAnterioresListadosDocumentos;
	protected JButton jButtonSiguientesListadosDocumentos;
	protected JButton jButtonNuevoGuardarCambiosListadosDocumentos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoListadosDocumentos;
	//protected JButton jButtonCerrarReporteDinamicoListadosDocumentos;
	//protected JButton jButtonGenerarExcelReporteDinamicoListadosDocumentos;	
	
	
	
	//protected JButton jButtonAbrirImportacionListadosDocumentos;
	//protected JButton jButtonGenerarImportacionListadosDocumentos;
	//protected JButton jButtonCerrarImportacionListadosDocumentos;
	//protected JFileChooser jFileChooserImportacionListadosDocumentos;
	//protected File fileImportacionListadosDocumentos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarListadosDocumentos;
	protected JButton jButtonDuplicarToolBarListadosDocumentos;
	protected JButton jButtonNuevoRelacionesToolBarListadosDocumentos;
	
	
	public JButton jButtonGuardarCambiosToolBarListadosDocumentos;
	protected JButton jButtonCopiarToolBarListadosDocumentos;
	protected JButton jButtonVerFormToolBarListadosDocumentos;
	public JButton jButtonGuardarCambiosTablaToolBarListadosDocumentos;
	protected JButton jButtonMostrarOcultarTablaToolBarListadosDocumentos;
	protected JButton jButtonCerrarToolBarListadosDocumentos;
	
	protected JButton jButtonRecargarInformacionToolBarListadosDocumentos;
	protected JButton jButtonProcesarInformacionToolBarListadosDocumentos;
	protected JButton jButtonAnterioresToolBarListadosDocumentos;
	protected JButton jButtonSiguientesToolBarListadosDocumentos;
	protected JButton jButtonNuevoGuardarCambiosToolBarListadosDocumentos;
	protected JButton jButtonAbrirOrderByToolBarListadosDocumentos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoListadosDocumentos;
	protected JMenuItem jMenuItemDuplicarListadosDocumentos;
	protected JMenuItem jMenuItemNuevoRelacionesListadosDocumentos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosListadosDocumentos;
	protected JMenuItem jMenuItemCopiarListadosDocumentos;
	protected JMenuItem jMenuItemVerFormListadosDocumentos;
	protected JMenuItem jMenuItemGuardarCambiosTablaListadosDocumentos;
	protected JMenuItem jMenuItemCerrarListadosDocumentos;
	protected JMenuItem jMenuItemDetalleCerrarListadosDocumentos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByListadosDocumentos;
	protected JMenuItem jMenuItemDetalleMostarOcultarListadosDocumentos;
	
	protected JMenuItem jMenuItemRecargarInformacionListadosDocumentos;
	protected JMenuItem jMenuItemProcesarInformacionListadosDocumentos;
	protected JMenuItem jMenuItemAnterioresListadosDocumentos;
	protected JMenuItem jMenuItemSiguientesListadosDocumentos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosListadosDocumentos;
	protected JMenuItem jMenuItemAbrirOrderByListadosDocumentos;
	protected JMenuItem jMenuItemMostrarOcultarListadosDocumentos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesListadosDocumentos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosListadosDocumentos;
	protected JCheckBox jCheckBoxSeleccionadosListadosDocumentos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaListadosDocumentos;
	protected JCheckBox jCheckBoxConGraficoReporteListadosDocumentos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesListadosDocumentos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesListadosDocumentos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoListadosDocumentos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoListadosDocumentos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesListadosDocumentos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionListadosDocumentos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesListadosDocumentos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesListadosDocumentos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarListadosDocumentos;
	protected JTextField jTextFieldValorCampoGeneralListadosDocumentos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteListadosDocumentos;
	//public JList<Reporte> jListColumnasSelectReporteListadosDocumentos;
	//public JScrollPane jScrollColumnasSelectReporteListadosDocumentos;
	
	//public JLabel jLabelRelacionesSelectReporteListadosDocumentos;
	//public JList<Reporte> jListRelacionesSelectReporteListadosDocumentos;
	//public JScrollPane jScrollRelacionesSelectReporteListadosDocumentos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoListadosDocumentos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoListadosDocumentos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoListadosDocumentos;
	//public JLabel jLabelTiposArchivoReporteDinamicoListadosDocumentos;
	
		
	//public JLabel jLabelArchivoImportacionListadosDocumentos;	
	//public JLabel jLabelPathArchivoImportacionListadosDocumentos;
	//protected JTextField jTextFieldPathArchivoImportacionListadosDocumentos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoListadosDocumentos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoListadosDocumentos;
	
	//public JLabel jLabelColumnaCategoriaValorListadosDocumentos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorListadosDocumentos;
	
	//public JLabel jLabelColumnasValoresGraficoListadosDocumentos;
	//public JList<Reporte> jListColumnasValoresGraficoListadosDocumentos;
	//public JScrollPane jScrollColumnasValoresGraficoListadosDocumentos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoListadosDocumentos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoListadosDocumentos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasListadosDocumentos;
	public JPanel jPanelBusquedaListadosDocumentosListadosDocumentos;
	public JButton jButtonBusquedaListadosDocumentosListadosDocumentos;
	
	public JPanel jPanelid_ejercicioBusquedaListadosDocumentosListadosDocumentos;
	public JLabel jLabelid_ejercicioBusquedaListadosDocumentosListadosDocumentos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos;
	public JButton jButtonid_ejercicioBusquedaListadosDocumentosListadosDocumentos= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaListadosDocumentosListadosDocumentosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaListadosDocumentosListadosDocumentosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos;
	public JLabel jLabelid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos;
	public JButton jButtonid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos= new JButtonMe();
	public JButton jButtonid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentosUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_desdeBusquedaListadosDocumentosListadosDocumentos;
	public JLabel jLabelfecha_desdeBusquedaListadosDocumentosListadosDocumentos;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaListadosDocumentosListadosDocumentos;

	public JDateChooser jDateChooserfecha_desdeBusquedaListadosDocumentosListadosDocumentos;
	public JButton jButtonfecha_desdeBusquedaListadosDocumentosListadosDocumentosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaListadosDocumentosListadosDocumentos;
	public JLabel jLabelfecha_hastaBusquedaListadosDocumentosListadosDocumentos;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaListadosDocumentosListadosDocumentos;

	public JDateChooser jDateChooserfecha_hastaBusquedaListadosDocumentosListadosDocumentos;
	public JButton jButtonfecha_hastaBusquedaListadosDocumentosListadosDocumentosBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ListadosDocumentosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ListadosDocumentos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosDocumentosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosDocumentos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosDocumentosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosDocumentos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosDocumentosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ListadosDocumentos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionListadosDocumentos)	{
		this.jButtonRecargarInformacionListadosDocumentos = jButtonRecargarInformacionListadosDocumentos;
	}
	
	public JButton getjButtonProcesarInformacionListadosDocumentos() {
		return this.jButtonProcesarInformacionListadosDocumentos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionListadosDocumentos)	{
		this.jButtonProcesarInformacionListadosDocumentos = jButtonProcesarInformacionListadosDocumentos;
	}
	
	
	public JButton getjButtonRecargarInformacionListadosDocumentos() {
		return this.jButtonRecargarInformacionListadosDocumentos;
	}
	
	
	public List<ListadosDocumentos> getlistadosdocumentoss() {
		return this.listadosdocumentoss;
	}

	public void setlistadosdocumentoss(List<ListadosDocumentos> listadosdocumentoss) {
		this.listadosdocumentoss = listadosdocumentoss;
	}
	
	public List<ListadosDocumentos> getlistadosdocumentossAux() {
		return this.listadosdocumentossAux;
	}

	public void setlistadosdocumentossAux(List<ListadosDocumentos> listadosdocumentossAux) {
		this.listadosdocumentossAux = listadosdocumentossAux;
	}
	
	public List<ListadosDocumentos> getlistadosdocumentossEliminados() {
		return this.listadosdocumentossEliminados;
	}

	public void setListadosDocumentossEliminados(List<ListadosDocumentos> listadosdocumentossEliminados) {
		this.listadosdocumentossEliminados = listadosdocumentossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarListadosDocumentos() {
		return jComboBoxTiposSeleccionarListadosDocumentos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarListadosDocumentos(
			JComboBox jComboBoxTiposSeleccionarListadosDocumentos) {
		this.jComboBoxTiposSeleccionarListadosDocumentos = jComboBoxTiposSeleccionarListadosDocumentos;
	}
	
	public void setBorderResaltarTiposSeleccionarListadosDocumentos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarListadosDocumentos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarListadosDocumentos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralListadosDocumentos() {
		return jTextFieldValorCampoGeneralListadosDocumentos;
	}

	public void setjTextFieldValorCampoGeneralListadosDocumentos(
			JTextField jTextFieldValorCampoGeneralListadosDocumentos) {
		this.jTextFieldValorCampoGeneralListadosDocumentos = jTextFieldValorCampoGeneralListadosDocumentos;
	}

	public void setBorderResaltarValorCampoGeneralListadosDocumentos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosDocumentos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralListadosDocumentos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosListadosDocumentos() {
		return this.jCheckBoxSeleccionarTodosListadosDocumentos;
	}

	public void setjCheckBoxSeleccionarTodosListadosDocumentos(
			JCheckBox jCheckBoxSeleccionarTodosListadosDocumentos) {
		this.jCheckBoxSeleccionarTodosListadosDocumentos = jCheckBoxSeleccionarTodosListadosDocumentos;
	}

	public void setBorderResaltarSeleccionarTodosListadosDocumentos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosDocumentos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosListadosDocumentos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosListadosDocumentos() {
		return this.jCheckBoxSeleccionadosListadosDocumentos;
	}

	public void setjCheckBoxSeleccionadosListadosDocumentos(
			JCheckBox jCheckBoxSeleccionadosListadosDocumentos) {
		this.jCheckBoxSeleccionadosListadosDocumentos = jCheckBoxSeleccionadosListadosDocumentos;
	}
	
	public void setBorderResaltarSeleccionadosListadosDocumentos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosDocumentos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosListadosDocumentos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesListadosDocumentos() {
		return this.jComboBoxTiposArchivosReportesListadosDocumentos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesListadosDocumentos(
			JComboBox jComboBoxTiposArchivosReportesListadosDocumentos) {
		this.jComboBoxTiposArchivosReportesListadosDocumentos = jComboBoxTiposArchivosReportesListadosDocumentos;
	}

	public void setBorderResaltarTiposArchivosReportesListadosDocumentos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosDocumentos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesListadosDocumentos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesListadosDocumentos() {
		return this.jComboBoxTiposReportesListadosDocumentos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesListadosDocumentos(
			JComboBox jComboBoxTiposReportesListadosDocumentos) {
		this.jComboBoxTiposReportesListadosDocumentos = jComboBoxTiposReportesListadosDocumentos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoListadosDocumentos() {
	//	return jComboBoxTiposReportesDinamicoListadosDocumentos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoListadosDocumentos(
	//		JComboBox jComboBoxTiposReportesDinamicoListadosDocumentos) {
	//	this.jComboBoxTiposReportesDinamicoListadosDocumentos = jComboBoxTiposReportesDinamicoListadosDocumentos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoListadosDocumentos() {
	//	return jComboBoxTiposArchivosReportesDinamicoListadosDocumentos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoListadosDocumentos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoListadosDocumentos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoListadosDocumentos = jComboBoxTiposArchivosReportesDinamicoListadosDocumentos;
	//}
	
	public void setBorderResaltarTiposReportesListadosDocumentos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosDocumentos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesListadosDocumentos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesListadosDocumentos() {
		return this.jComboBoxTiposGraficosReportesListadosDocumentos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesListadosDocumentos(
			JComboBox jComboBoxTiposGraficosReportesListadosDocumentos) {
		this.jComboBoxTiposGraficosReportesListadosDocumentos = jComboBoxTiposGraficosReportesListadosDocumentos;
	}
	
	public void setBorderResaltarTiposGraficosReportesListadosDocumentos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosDocumentos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesListadosDocumentos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionListadosDocumentos() {
		return this.jComboBoxTiposPaginacionListadosDocumentos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionListadosDocumentos(
			JComboBox jComboBoxTiposPaginacionListadosDocumentos) {
		this.jComboBoxTiposPaginacionListadosDocumentos = jComboBoxTiposPaginacionListadosDocumentos;
	}
	
	public void setBorderResaltarTiposPaginacionListadosDocumentos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosDocumentos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionListadosDocumentos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesListadosDocumentos() {
		return this.jComboBoxTiposRelacionesListadosDocumentos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesListadosDocumentos() {
		return this.jComboBoxTiposAccionesListadosDocumentos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesListadosDocumentos(
			JComboBox jComboBoxTiposRelacionesListadosDocumentos) {
		this.jComboBoxTiposRelacionesListadosDocumentos = jComboBoxTiposRelacionesListadosDocumentos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesListadosDocumentos(
			JComboBox jComboBoxTiposAccionesListadosDocumentos) {
		this.jComboBoxTiposAccionesListadosDocumentos = jComboBoxTiposAccionesListadosDocumentos;
	}
	
	public void setBorderResaltarTiposRelacionesListadosDocumentos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosDocumentos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesListadosDocumentos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesListadosDocumentos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosDocumentos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesListadosDocumentos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoListadosDocumentos() {
	//	return jCheckBoxConGraficoDinamicoListadosDocumentos;
	//}

	//public void setjCheckBoxConGraficoDinamicoListadosDocumentos(
	//		JCheckBox jCheckBoxConGraficoDinamicoListadosDocumentos) {
	//	this.jCheckBoxConGraficoDinamicoListadosDocumentos = jCheckBoxConGraficoDinamicoListadosDocumentos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoListadosDocumentos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarListadosDocumentos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoListadosDocumentos .setBorder(borderResaltar);		
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
		this.listadosdocumentosSessionBean=new ListadosDocumentosSessionBean();
		
		this.listadosdocumentosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadosdocumentosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.listadosdocumentosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ListadosDocumentosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ListadosDocumentosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ListadosDocumentosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ListadosDocumentosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ListadosDocumentosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Listados Documentos MANTENIMIENTO"));
		
		
		if(iWidth > 2250) {
			iWidth=2250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
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
		
		ListadosDocumentosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ListadosDocumentos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarListadosDocumentos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarListadosDocumentos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarListadosDocumentos,this.jTtoolBarListadosDocumentos,
							"nuevo","nuevo","Nuevo"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarListadosDocumentos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarListadosDocumentos,this.jTtoolBarListadosDocumentos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarListadosDocumentos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarListadosDocumentos,this.jTtoolBarListadosDocumentos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarListadosDocumentos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarListadosDocumentos,this.jTtoolBarListadosDocumentos,
							"duplicar","duplicar","Duplicar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarListadosDocumentos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarListadosDocumentos,this.jTtoolBarListadosDocumentos,
							"copiar","copiar","Copiar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarListadosDocumentos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarListadosDocumentos,this.jTtoolBarListadosDocumentos,
							"ver_form","ver_form","Ver"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarListadosDocumentos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadosDocumentos,this.jTtoolBarListadosDocumentos,
							"recargar","recargar","Buscar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarListadosDocumentos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadosDocumentos,this.jTtoolBarListadosDocumentos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarListadosDocumentos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadosDocumentos,this.jTtoolBarListadosDocumentos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarListadosDocumentos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarListadosDocumentos,this.jTtoolBarListadosDocumentos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarListadosDocumentos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarListadosDocumentos,this.jTtoolBarListadosDocumentos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarListadosDocumentos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarListadosDocumentos,this.jTtoolBarListadosDocumentos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarListadosDocumentos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarListadosDocumentos,this.jTtoolBarListadosDocumentos,
							"cerrar","cerrar","Salir"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarListadosDocumentos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarListadosDocumentos;
			
				this.jButtonProcesarInformacionToolBarListadosDocumentos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarListadosDocumentos;
				
		//protected JButton jButtonModificarToolBarListadosDocumentos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarListadosDocumentos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuListadosDocumentos=new JMenuMe("General");
		this.jmenuArchivoListadosDocumentos=new JMenuMe("Archivo");
		this.jmenuAccionesListadosDocumentos=new JMenuMe("Acciones");
		this.jmenuDatosListadosDocumentos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoListadosDocumentos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoListadosDocumentos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoListadosDocumentos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarListadosDocumentos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarListadosDocumentos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarListadosDocumentos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesListadosDocumentos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesListadosDocumentos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesListadosDocumentos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosListadosDocumentos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosListadosDocumentos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosListadosDocumentos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarListadosDocumentos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarListadosDocumentos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarListadosDocumentos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormListadosDocumentos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormListadosDocumentos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormListadosDocumentos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaListadosDocumentos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaListadosDocumentos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaListadosDocumentos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarListadosDocumentos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarListadosDocumentos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarListadosDocumentos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionListadosDocumentos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionListadosDocumentos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionListadosDocumentos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionListadosDocumentos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionListadosDocumentos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionListadosDocumentos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresListadosDocumentos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresListadosDocumentos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresListadosDocumentos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesListadosDocumentos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesListadosDocumentos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesListadosDocumentos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByListadosDocumentos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByListadosDocumentos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByListadosDocumentos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarListadosDocumentos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarListadosDocumentos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarListadosDocumentos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByListadosDocumentos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByListadosDocumentos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByListadosDocumentos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarListadosDocumentos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarListadosDocumentos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarListadosDocumentos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosListadosDocumentos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosListadosDocumentos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosListadosDocumentos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoListadosDocumentos.add(this.jMenuItemCerrarListadosDocumentos);
			
			this.jmenuAccionesListadosDocumentos.add(this.jMenuItemNuevoListadosDocumentos);
			this.jmenuAccionesListadosDocumentos.add(this.jMenuItemNuevoGuardarCambiosListadosDocumentos);
			this.jmenuAccionesListadosDocumentos.add(this.jMenuItemNuevoRelacionesListadosDocumentos);
			this.jmenuAccionesListadosDocumentos.add(this.jMenuItemGuardarCambiosTablaListadosDocumentos);		
			this.jmenuAccionesListadosDocumentos.add(this.jMenuItemDuplicarListadosDocumentos);		
			this.jmenuAccionesListadosDocumentos.add(this.jMenuItemCopiarListadosDocumentos);		
			this.jmenuAccionesListadosDocumentos.add(this.jMenuItemVerFormListadosDocumentos);		
			
			this.jmenuDatosListadosDocumentos.add(this.jMenuItemRecargarInformacionListadosDocumentos);				
			this.jmenuDatosListadosDocumentos.add(this.jMenuItemAnterioresListadosDocumentos);				
			this.jmenuDatosListadosDocumentos.add(this.jMenuItemSiguientesListadosDocumentos);				
			this.jmenuDatosListadosDocumentos.add(this.jMenuItemAbrirOrderByListadosDocumentos);				
			this.jmenuDatosListadosDocumentos.add(this.jMenuItemMostrarOcultarListadosDocumentos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesListadosDocumentos.add(this.jMenuItemGuardarCambiosListadosDocumentos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarListadosDocumentos.add(this.jmenuArchivoListadosDocumentos);		
			this.jmenuBarListadosDocumentos.add(this.jmenuAccionesListadosDocumentos);		
			this.jmenuBarListadosDocumentos.add(this.jmenuDatosListadosDocumentos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarListadosDocumentos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasListadosDocumentos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaListadosDocumentosListadosDocumentos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaListadosDocumentosListadosDocumentos.setToolTipText("Buscar Por Ejercicio Por Tipo Movimiento Base Por Fecha Desde Por Fecha Hasta ");
		this.jButtonBusquedaListadosDocumentosListadosDocumentos= new JButtonMe();
		this.jButtonBusquedaListadosDocumentosListadosDocumentos.setText("Buscar");
		this.jButtonBusquedaListadosDocumentosListadosDocumentos.setToolTipText("Buscar Por Ejercicio Por Tipo Movimiento Base Por Fecha Desde Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaListadosDocumentosListadosDocumentos,"buscar_button","Buscar Por Ejercicio Por Tipo Movimiento Base Por Fecha Desde Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaListadosDocumentosListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaListadosDocumentosListadosDocumentos = new JLabelMe();
		jLabelid_ejercicioBusquedaListadosDocumentosListadosDocumentos.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaListadosDocumentosListadosDocumentos.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaListadosDocumentosListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaListadosDocumentosListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaListadosDocumentosListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaListadosDocumentosListadosDocumentos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos = new JLabelMe();
		jLabelid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.setText("Tipo Movimiento Base :");
		jLabelid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.setToolTipText("Tipo Movimiento Base");
		jLabelid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos= new JComboBoxMe();
		jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_desdeBusquedaListadosDocumentosListadosDocumentos = new JLabelMe();
		jLabelfecha_desdeBusquedaListadosDocumentosListadosDocumentos.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaListadosDocumentosListadosDocumentos.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaListadosDocumentosListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaListadosDocumentosListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaListadosDocumentosListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaListadosDocumentosListadosDocumentos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaListadosDocumentosListadosDocumentos= new JDateChooser();
		jDateChooserfecha_desdeBusquedaListadosDocumentosListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaListadosDocumentosListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaListadosDocumentosListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaListadosDocumentosListadosDocumentos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaListadosDocumentosListadosDocumentos.setDate(new Date());
		jDateChooserfecha_desdeBusquedaListadosDocumentosListadosDocumentos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaListadosDocumentosListadosDocumentos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_hastaBusquedaListadosDocumentosListadosDocumentos = new JLabelMe();
		jLabelfecha_hastaBusquedaListadosDocumentosListadosDocumentos.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaListadosDocumentosListadosDocumentos.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaListadosDocumentosListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaListadosDocumentosListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaListadosDocumentosListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaListadosDocumentosListadosDocumentos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaListadosDocumentosListadosDocumentos= new JDateChooser();
		jDateChooserfecha_hastaBusquedaListadosDocumentosListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaListadosDocumentosListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaListadosDocumentosListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaListadosDocumentosListadosDocumentos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaListadosDocumentosListadosDocumentos.setDate(new Date());
		jDateChooserfecha_hastaBusquedaListadosDocumentosListadosDocumentos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaListadosDocumentosListadosDocumentos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasListadosDocumentos=new JTabbedPane();


		this.jTabbedPaneBusquedasListadosDocumentos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasListadosDocumentos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasListadosDocumentos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasListadosDocumentos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasListadosDocumentos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleListadosDocumentos = new ListadosDocumentosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Listados Documentos DATOS");
			this.jInternalFrameDetalleFormListadosDocumentos = new ListadosDocumentosDetalleFormJInternalFrame(jDesktopPane,this.listadosdocumentosSessionBean.getConGuardarRelaciones(),this.listadosdocumentosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormListadosDocumentos = null;//new ListadosDocumentosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutListadosDocumentos= new GridBagLayout();
		
		
		this.jTableDatosListadosDocumentos = new JTableMe();      
		
		String sToolTipListadosDocumentos="";
		sToolTipListadosDocumentos=ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipListadosDocumentos+="(Tesoreria.ListadosDocumentos)";
		}
		
		if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
			sToolTipListadosDocumentos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosListadosDocumentos.setToolTipText(sToolTipListadosDocumentos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosListadosDocumentos);
		this.jTableDatosListadosDocumentos.setAutoCreateRowSorter(true);
		this.jTableDatosListadosDocumentos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosListadosDocumentos.setRowSelectionAllowed(true);
		this.jTableDatosListadosDocumentos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosListadosDocumentos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoListadosDocumentos = new JButtonMe();
		this.jButtonDuplicarListadosDocumentos = new JButtonMe();
		this.jButtonCopiarListadosDocumentos = new JButtonMe();
		this.jButtonVerFormListadosDocumentos = new JButtonMe();
		this.jButtonNuevoRelacionesListadosDocumentos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaListadosDocumentos = new JButtonMe();
		this.jButtonCerrarListadosDocumentos = new JButtonMe();
		
		this.jScrollPanelDatosListadosDocumentos = new JScrollPane();   
        this.jScrollPanelDatosGeneralListadosDocumentos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesListadosDocumentos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Listados Documentos";
		
		if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Documentoses" + this.sPath));
		} else {
			this.jScrollPanelDatosListadosDocumentos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesListadosDocumentos.setToolTipText("Acciones");
        this.jPanelAccionesListadosDocumentos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralListadosDocumentos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosListadosDocumentos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoListadosDocumentos=new ReporteDinamicoJInternalFrame(ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoListadosDocumentos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionListadosDocumentos=new ImportacionJInternalFrame(ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionListadosDocumentos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByListadosDocumentos = new JButtonMe();
		
		this.jButtonAbrirOrderByListadosDocumentos.setText("Orden");
		this.jButtonAbrirOrderByListadosDocumentos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByListadosDocumentos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByListadosDocumentos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByListadosDocumentos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosDocumentos,false,this);
			
			//this.cargarOrderByListadosDocumentos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByListadosDocumentos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosDocumentos,true,this);
			
			//this.cargarOrderByListadosDocumentos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosListadosDocumentos.setMinimumSize(new Dimension(400,50));//1930
		this.jTableDatosListadosDocumentos.setMaximumSize(new Dimension(400,50));//1930
		this.jTableDatosListadosDocumentos.setPreferredSize(new Dimension(400,50));//1930
		
		this.jScrollPanelDatosListadosDocumentos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosListadosDocumentos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosListadosDocumentos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoListadosDocumentos.setText("Nuevo");
		this.jButtonDuplicarListadosDocumentos.setText("Duplicar");
		this.jButtonCopiarListadosDocumentos.setText("Copiar");
		this.jButtonVerFormListadosDocumentos.setText("Ver");
		this.jButtonNuevoRelacionesListadosDocumentos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaListadosDocumentos.setText("Guardar");
		this.jButtonCerrarListadosDocumentos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoListadosDocumentos,"nuevo_button","Nuevo",this.listadosdocumentosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarListadosDocumentos,"duplicar_button","Duplicar",this.listadosdocumentosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarListadosDocumentos,"copiar_button","Copiar",this.listadosdocumentosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormListadosDocumentos,"ver_form","Ver",this.listadosdocumentosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesListadosDocumentos,"nuevorelaciones_button","Nuevo Rel",this.listadosdocumentosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaListadosDocumentos,"guardarcambiostabla_button","Guardar",this.listadosdocumentosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarListadosDocumentos,"cerrar_button","Salir",this.listadosdocumentosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoListadosDocumentos.setToolTipText("Nuevo"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarListadosDocumentos.setToolTipText("Duplicar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarListadosDocumentos.setToolTipText("Copiar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormListadosDocumentos.setToolTipText("Ver"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesListadosDocumentos.setToolTipText("Nuevo Rel"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaListadosDocumentos.setToolTipText("Guardar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarListadosDocumentos.setToolTipText("Salir"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoListadosDocumentos";
		inputMap = this.jButtonNuevoListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoListadosDocumentos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoListadosDocumentos"));
		
		//DUPLICAR
		sMapKey = "DuplicarListadosDocumentos";
		inputMap = this.jButtonDuplicarListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarListadosDocumentos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarListadosDocumentos"));
		
		//COPIAR
		sMapKey = "CopiarListadosDocumentos";
		inputMap = this.jButtonCopiarListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarListadosDocumentos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarListadosDocumentos"));
		
		//VEr FORM
		sMapKey = "VerFormListadosDocumentos";
		inputMap = this.jButtonVerFormListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormListadosDocumentos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormListadosDocumentos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesListadosDocumentos";
		inputMap = this.jButtonNuevoRelacionesListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesListadosDocumentos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesListadosDocumentos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarListadosDocumentos";
		inputMap = this.jButtonModificarListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarListadosDocumentos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarListadosDocumentos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarListadosDocumentos";
		inputMap = this.jButtonCerrarListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarListadosDocumentos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarListadosDocumentos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaListadosDocumentos";
		inputMap = this.jButtonGuardarCambiosTablaListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaListadosDocumentos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaListadosDocumentos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesListadosDocumentos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesListadosDocumentos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionListadosDocumentos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ListadosDocumentos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ListadosDocumentos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ListadosDocumentos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ListadosDocumentos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ListadosDocumentos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesListadosDocumentos.setName("jPanelParametrosReportesListadosDocumentos"); 
		
		this.jPanelParametrosReportesAccionesListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesListadosDocumentos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesListadosDocumentos.setName("jPanelParametrosReportesAccionesListadosDocumentos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesListadosDocumentos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesListadosDocumentos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionListadosDocumentos = new JButtonMe();
		this.jButtonRecargarInformacionListadosDocumentos.setText("Buscar");
		this.jButtonRecargarInformacionListadosDocumentos.setToolTipText("Buscar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionListadosDocumentos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionListadosDocumentos.setVisible(false);
		
		
		this.jButtonProcesarInformacionListadosDocumentos = new JButtonMe();
		this.jButtonProcesarInformacionListadosDocumentos.setText("Procesar");
		this.jButtonProcesarInformacionListadosDocumentos.setToolTipText("Procesar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionListadosDocumentos.setVisible(false);
			
		this.jButtonProcesarInformacionListadosDocumentos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionListadosDocumentos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionListadosDocumentos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesListadosDocumentos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadosDocumentos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesListadosDocumentos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesListadosDocumentos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadosDocumentos.setText("TIPO");       
		this.jComboBoxTiposReportesListadosDocumentos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesListadosDocumentos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadosDocumentos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesListadosDocumentos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionListadosDocumentos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionListadosDocumentos.setText("Paginacion");
		this.jComboBoxTiposPaginacionListadosDocumentos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesListadosDocumentos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesListadosDocumentos.setText("Accion");
		this.jComboBoxTiposRelacionesListadosDocumentos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesListadosDocumentos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesListadosDocumentos.setText("Accion");
		this.jComboBoxTiposAccionesListadosDocumentos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarListadosDocumentos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarListadosDocumentos.setText("Accion");
		this.jComboBoxTiposSeleccionarListadosDocumentos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralListadosDocumentos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralListadosDocumentos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralListadosDocumentos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralListadosDocumentos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesListadosDocumentos = new JLabelMe();
		
		this.jLabelAccionesListadosDocumentos.setText("Acciones");		
		this.jLabelAccionesListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosListadosDocumentos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosListadosDocumentos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosListadosDocumentos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosListadosDocumentos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosListadosDocumentos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosListadosDocumentos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaListadosDocumentos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaListadosDocumentos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaListadosDocumentos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteListadosDocumentos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteListadosDocumentos.setText("Graf.");
		this.jCheckBoxConGraficoReporteListadosDocumentos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresListadosDocumentos = new JButtonMe();
		//this.jButtonAnterioresListadosDocumentos.setText("<<");
        this.jButtonAnterioresListadosDocumentos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresListadosDocumentos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesListadosDocumentos = new JButtonMe();
		//this.jButtonSiguientesListadosDocumentos.setText(">>");
        this.jButtonSiguientesListadosDocumentos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesListadosDocumentos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosListadosDocumentos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosListadosDocumentos.setText("Nue");
        this.jButtonNuevoGuardarCambiosListadosDocumentos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosListadosDocumentos,"nuevoguardarcambios_button","Nue",this.listadosdocumentosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosListadosDocumentos";
		inputMap = this.jButtonNuevoGuardarCambiosListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosListadosDocumentos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosListadosDocumentos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionListadosDocumentos";
		inputMap = this.jButtonRecargarInformacionListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionListadosDocumentos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionListadosDocumentos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesListadosDocumentos";
		inputMap = this.jButtonSiguientesListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesListadosDocumentos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesListadosDocumentos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresListadosDocumentos";
		inputMap = this.jButtonAnterioresListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresListadosDocumentos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresListadosDocumentos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasListadosDocumentos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesListadosDocumentos.setMinimumSize(new Dimension(this.getWidth(),ListadosDocumentosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadosDocumentosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesListadosDocumentos.setMaximumSize(new Dimension(this.getWidth(),ListadosDocumentosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadosDocumentosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesListadosDocumentos.setPreferredSize(new Dimension(this.getWidth(),ListadosDocumentosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadosDocumentosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionListadosDocumentos = new GridBagLayout();

			this.jPanelPaginacionListadosDocumentos.setLayout(gridaBagLayoutPaginacionListadosDocumentos);						
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.gridy = 0;
			this.gridBagConstraintsListadosDocumentos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionListadosDocumentos.add(this.jButtonAnterioresListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
					
						
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsListadosDocumentos.gridy = 0;
			
			this.jPanelPaginacionListadosDocumentos.add(this.jButtonNuevoGuardarCambiosListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
						
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsListadosDocumentos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsListadosDocumentos.gridy = 0;
			this.jPanelPaginacionListadosDocumentos.add(this.jButtonSiguientesListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.gridy = 1;
			this.gridBagConstraintsListadosDocumentos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosDocumentos.add(this.jButtonNuevoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
						
			
			
			if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
				this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsListadosDocumentos.gridy = 1;
				this.gridBagConstraintsListadosDocumentos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionListadosDocumentos.add(this.jButtonGuardarCambiosTablaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
			}
			
			
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.gridy = 1;
			this.gridBagConstraintsListadosDocumentos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosDocumentos.add(this.jButtonDuplicarListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.gridy = 1;
			this.gridBagConstraintsListadosDocumentos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosDocumentos.add(this.jButtonCopiarListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.gridy = 1;
			this.gridBagConstraintsListadosDocumentos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosDocumentos.add(this.jButtonVerFormListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.gridy = 1;
			this.gridBagConstraintsListadosDocumentos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionListadosDocumentos.add(this.jButtonCerrarListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		
		
		
		this.jButtonRecargarInformacionListadosDocumentos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionListadosDocumentos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionListadosDocumentos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesListadosDocumentos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesListadosDocumentos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesListadosDocumentos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesListadosDocumentos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesListadosDocumentos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesListadosDocumentos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesListadosDocumentos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesListadosDocumentos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesListadosDocumentos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionListadosDocumentos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionListadosDocumentos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionListadosDocumentos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesListadosDocumentos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesListadosDocumentos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesListadosDocumentos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesListadosDocumentos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosDocumentos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosDocumentos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarListadosDocumentos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarListadosDocumentos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarListadosDocumentos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaListadosDocumentos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaListadosDocumentos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaListadosDocumentos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteListadosDocumentos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteListadosDocumentos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteListadosDocumentos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosListadosDocumentos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosListadosDocumentos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosListadosDocumentos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosListadosDocumentos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosListadosDocumentos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosListadosDocumentos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesListadosDocumentos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesListadosDocumentos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ListadosDocumentos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ListadosDocumentos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ListadosDocumentos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ListadosDocumentos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesListadosDocumentos.setLayout(gridaBagParametrosReportesListadosDocumentos);
			this.jPanelParametrosReportesAccionesListadosDocumentos.setLayout(gridaBagParametrosReportesAccionesListadosDocumentos);
			
			
			this.jPanelParametrosAuxiliar1ListadosDocumentos.setLayout(gridaBagParametrosAuxiliar1ListadosDocumentos);
			this.jPanelParametrosAuxiliar2ListadosDocumentos.setLayout(gridaBagParametrosAuxiliar2ListadosDocumentos);
			this.jPanelParametrosAuxiliar3ListadosDocumentos.setLayout(gridaBagParametrosAuxiliar3ListadosDocumentos);
			this.jPanelParametrosAuxiliar4ListadosDocumentos.setLayout(gridaBagParametrosAuxiliar4ListadosDocumentos);
			//this.jPanelParametrosAuxiliar5ListadosDocumentos.setLayout(gridaBagParametrosAuxiliar2ListadosDocumentos);			
			
			
			
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosDocumentos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadosDocumentos.add(this.jButtonRecargarInformacionListadosDocumentos, this.gridBagConstraintsListadosDocumentos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosDocumentos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadosDocumentos.add(this.jComboBoxTiposPaginacionListadosDocumentos, this.gridBagConstraintsListadosDocumentos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosDocumentos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadosDocumentos.add(this.jCheckBoxConAltoMaximoTablaListadosDocumentos, this.gridBagConstraintsListadosDocumentos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosDocumentos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadosDocumentos.add(this.jComboBoxTiposArchivosReportesListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosDocumentos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosDocumentos.add(this.jPanelParametrosAuxiliar1ListadosDocumentos, this.gridBagConstraintsListadosDocumentos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosDocumentos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ListadosDocumentos.add(this.jComboBoxTiposReportesListadosDocumentos, this.gridBagConstraintsListadosDocumentos);																		
			
			
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosDocumentos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ListadosDocumentos.add(this.jComboBoxTiposGraficosReportesListadosDocumentos, this.gridBagConstraintsListadosDocumentos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosDocumentos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosDocumentos.add(this.jPanelParametrosAuxiliar4ListadosDocumentos, this.gridBagConstraintsListadosDocumentos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosDocumentos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosDocumentos.add(this.jComboBoxTiposReportesListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosDocumentos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosDocumentos.add(this.jCheckBoxGenerarReporteListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosDocumentos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosDocumentos.add(this.jPanelParametrosAuxiliar2ListadosDocumentos, this.gridBagConstraintsListadosDocumentos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosDocumentos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosDocumentos.add(this.jLabelAccionesListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
				this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsListadosDocumentos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsListadosDocumentos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesListadosDocumentos.add(this.jButtonAbrirOrderByListadosDocumentos, this.gridBagConstraintsListadosDocumentos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosDocumentos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadosDocumentos.add(this.jComboBoxTiposSeleccionarListadosDocumentos, this.gridBagConstraintsListadosDocumentos);			
			
			
			/*
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosDocumentos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosDocumentos.add(this.jCheckBoxSeleccionarTodosListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosDocumentos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosDocumentos.add(this.jCheckBoxConGraficoReporteListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosDocumentos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadosDocumentos.add(this.jCheckBoxSeleccionarTodosListadosDocumentos, this.gridBagConstraintsListadosDocumentos);															
				
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosDocumentos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadosDocumentos.add(this.jCheckBoxSeleccionadosListadosDocumentos, this.gridBagConstraintsListadosDocumentos);															
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosDocumentos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadosDocumentos.add(this.jCheckBoxConGraficoReporteListadosDocumentos, this.gridBagConstraintsListadosDocumentos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosDocumentos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosDocumentos.add(this.jPanelParametrosAuxiliar3ListadosDocumentos, this.gridBagConstraintsListadosDocumentos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosDocumentos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadosDocumentos.add(this.jComboBoxTiposAccionesListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosListadosDocumentos = new GridBagLayout();

			this.jScrollPanelDatosListadosDocumentos.setLayout(gridaBagLayoutDatosListadosDocumentos);
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.gridy = 0;
			this.gridBagConstraintsListadosDocumentos.gridx = 0;
			
			this.jScrollPanelDatosListadosDocumentos.add(this.jTableDatosListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosListadosDocumentos.setViewportView(this.jTableDatosListadosDocumentos);
		this.jTableDatosListadosDocumentos.setFillsViewportHeight(true);
		this.jTableDatosListadosDocumentos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesListadosDocumentos= new GridBagLayout();
		this.jPanelAccionesListadosDocumentos.setLayout(gridaBagLayoutAccionesListadosDocumentos);
		
		
		/*	
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosDocumentos.gridy = 0;
		this.gridBagConstraintsListadosDocumentos.gridx = 0;
			
		this.jPanelAccionesListadosDocumentos.add(this.jButtonNuevoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaListadosDocumentosListadosDocumentos= new GridBagLayout();
		gridaBagLayoutBusquedaListadosDocumentosListadosDocumentos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaListadosDocumentosListadosDocumentos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaListadosDocumentosListadosDocumentos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaListadosDocumentosListadosDocumentos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaListadosDocumentosListadosDocumentos.setLayout(gridaBagLayoutBusquedaListadosDocumentosListadosDocumentos);

		gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosDocumentos.gridy = 0;
		gridBagConstraintsListadosDocumentos.gridx = 0;
		jPanelBusquedaListadosDocumentosListadosDocumentos.add(jLabelid_ejercicioBusquedaListadosDocumentosListadosDocumentos, gridBagConstraintsListadosDocumentos);

		gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosDocumentos.gridy = 0;
		gridBagConstraintsListadosDocumentos.gridx = 1;
		jPanelBusquedaListadosDocumentosListadosDocumentos.add(jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos, gridBagConstraintsListadosDocumentos);


		gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosDocumentos.gridy = 1;
		gridBagConstraintsListadosDocumentos.gridx = 0;
		jPanelBusquedaListadosDocumentosListadosDocumentos.add(jLabelid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos, gridBagConstraintsListadosDocumentos);

		gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosDocumentos.gridy = 1;
		gridBagConstraintsListadosDocumentos.gridx = 1;
		jPanelBusquedaListadosDocumentosListadosDocumentos.add(jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos, gridBagConstraintsListadosDocumentos);


		gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosDocumentos.gridy = 2;
		gridBagConstraintsListadosDocumentos.gridx = 0;
		jPanelBusquedaListadosDocumentosListadosDocumentos.add(jLabelfecha_desdeBusquedaListadosDocumentosListadosDocumentos, gridBagConstraintsListadosDocumentos);

		gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosDocumentos.gridy = 2;
		gridBagConstraintsListadosDocumentos.gridx = 1;
		jPanelBusquedaListadosDocumentosListadosDocumentos.add(jDateChooserfecha_desdeBusquedaListadosDocumentosListadosDocumentos, gridBagConstraintsListadosDocumentos);


		gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosDocumentos.gridy = 3;
		gridBagConstraintsListadosDocumentos.gridx = 0;
		jPanelBusquedaListadosDocumentosListadosDocumentos.add(jLabelfecha_hastaBusquedaListadosDocumentosListadosDocumentos, gridBagConstraintsListadosDocumentos);

		gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosDocumentos.gridy = 3;
		gridBagConstraintsListadosDocumentos.gridx = 1;
		jPanelBusquedaListadosDocumentosListadosDocumentos.add(jDateChooserfecha_hastaBusquedaListadosDocumentosListadosDocumentos, gridBagConstraintsListadosDocumentos);

		gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosDocumentos.gridy = 4;
		gridBagConstraintsListadosDocumentos.gridx =1;
		jPanelBusquedaListadosDocumentosListadosDocumentos.add(jButtonBusquedaListadosDocumentosListadosDocumentos, gridBagConstraintsListadosDocumentos);

		jTabbedPaneBusquedasListadosDocumentos.addTab("1.-Por Ejercicio Por Tipo Movimiento Base Por Fecha Desde Por Fecha Hasta ", jPanelBusquedaListadosDocumentosListadosDocumentos);
		jTabbedPaneBusquedasListadosDocumentos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutListadosDocumentos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutListadosDocumentos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();						
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadosDocumentos.gridx = 0;		
			//this.gridBagConstraintsListadosDocumentos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsListadosDocumentos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarListadosDocumentos, this.gridBagConstraintsListadosDocumentos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsListadosDocumentos.gridx = 0;		
		//this.gridBagConstraintsListadosDocumentos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsListadosDocumentos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsListadosDocumentos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsListadosDocumentos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadosDocumentos.gridx = 0;		
			this.gridBagConstraintsListadosDocumentos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsListadosDocumentos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasListadosDocumentos, this.gridBagConstraintsListadosDocumentos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosDocumentos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesListadosDocumentos, this.gridBagConstraintsListadosDocumentos);								
		
		
		/*
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosDocumentos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		*/		
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsListadosDocumentos.gridx =0;
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsListadosDocumentos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
				
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosDocumentos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ListadosDocumentosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosListadosDocumentos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosListadosDocumentos = new GridBagLayout();
			this.jPanelBusquedasParametrosListadosDocumentos.setLayout(gridaBagLayoutBusquedasParametrosListadosDocumentos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralListadosDocumentos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralListadosDocumentos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosDocumentos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosDocumentos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosDocumentos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
			
			
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosDocumentos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		
			
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsListadosDocumentos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralListadosDocumentos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoListadosDocumentos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoListadosDocumentos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoListadosDocumentos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoListadosDocumentos.setName("jPanelReporteDinamicoListadosDocumentos"); 
		
		this.jPanelReporteDinamicoListadosDocumentos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoListadosDocumentos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoListadosDocumentos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoListadosDocumentos.setLayout(gridaBagLayoutReporteDinamicoListadosDocumentos);
		
		
		this.jInternalFrameReporteDinamicoListadosDocumentos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoListadosDocumentos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteListadosDocumentos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoListadosDocumentos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoListadosDocumentos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoListadosDocumentos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoListadosDocumentos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoListadosDocumentos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoListadosDocumentos.setResizable(true);
	    this.jInternalFrameReporteDinamicoListadosDocumentos.setClosable(true);
	    this.jInternalFrameReporteDinamicoListadosDocumentos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoListadosDocumentos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoListadosDocumentos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoListadosDocumentos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Documentoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteListadosDocumentos = new JLabelMe();

		this.jLabelColumnasSelectReporteListadosDocumentos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jLabelColumnasSelectReporteListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteListadosDocumentos = new JList<Reporte>();
		this.jListColumnasSelectReporteListadosDocumentos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteListadosDocumentos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteListadosDocumentos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteListadosDocumentos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteListadosDocumentos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteListadosDocumentos=new JScrollPane(this.jListColumnasSelectReporteListadosDocumentos);
			
			this.jScrollColumnasSelectReporteListadosDocumentos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteListadosDocumentos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteListadosDocumentos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoListadosDocumentos.add(this.jListColumnasSelectReporteListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jScrollColumnasSelectReporteListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteListadosDocumentos = new JLabelMe();

		this.jLabelRelacionesSelectReporteListadosDocumentos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteListadosDocumentos = new JList<Reporte>();
		this.jListRelacionesSelectReporteListadosDocumentos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteListadosDocumentos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteListadosDocumentos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteListadosDocumentos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteListadosDocumentos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteListadosDocumentos=new JScrollPane(this.jListRelacionesSelectReporteListadosDocumentos);
			
			this.jScrollRelacionesSelectReporteListadosDocumentos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteListadosDocumentos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteListadosDocumentos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoListadosDocumentos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoListadosDocumentos = new JComboBoxMe();
		this.jListColumnasValoresGraficoListadosDocumentos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoListadosDocumentos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoListadosDocumentos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoListadosDocumentos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoListadosDocumentos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoListadosDocumentos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoListadosDocumentos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoListadosDocumentos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoListadosDocumentos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoListadosDocumentos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoListadosDocumentos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoListadosDocumentos = new JLabelMe();

		this.jLabelConGraficoDinamicoListadosDocumentos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jLabelConGraficoDinamicoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoListadosDocumentos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoListadosDocumentos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoListadosDocumentos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoListadosDocumentos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoListadosDocumentos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoListadosDocumentos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jCheckBoxConGraficoDinamicoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoListadosDocumentos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoListadosDocumentos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jLabelColumnaCategoriaGraficoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoListadosDocumentos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoListadosDocumentos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoListadosDocumentos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoListadosDocumentos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoListadosDocumentos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoListadosDocumentos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jComboBoxColumnaCategoriaGraficoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorListadosDocumentos = new JLabelMe();

		this.jLabelColumnaCategoriaValorListadosDocumentos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jLabelColumnaCategoriaValorListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorListadosDocumentos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorListadosDocumentos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorListadosDocumentos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorListadosDocumentos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorListadosDocumentos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorListadosDocumentos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jComboBoxColumnaCategoriaValorListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoListadosDocumentos = new JLabelMe();

		this.jLabelColumnasValoresGraficoListadosDocumentos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jLabelColumnasValoresGraficoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoListadosDocumentos = new JList<Reporte>();
		this.jListColumnasValoresGraficoListadosDocumentos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoListadosDocumentos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoListadosDocumentos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoListadosDocumentos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoListadosDocumentos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoListadosDocumentos=new JScrollPane(this.jListColumnasValoresGraficoListadosDocumentos);
			
			this.jScrollColumnasValoresGraficoListadosDocumentos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoListadosDocumentos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoListadosDocumentos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoListadosDocumentos.add(this.jListColumnasSelectReporteListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jScrollColumnasValoresGraficoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoListadosDocumentos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoListadosDocumentos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jLabelTiposGraficosReportesDinamicoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoListadosDocumentos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoListadosDocumentos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoListadosDocumentos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoListadosDocumentos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoListadosDocumentos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoListadosDocumentos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jComboBoxTiposGraficosReportesDinamicoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoListadosDocumentos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoListadosDocumentos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jLabelGenerarExcelReporteDinamicoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoListadosDocumentos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoListadosDocumentos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoListadosDocumentos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoListadosDocumentos.setToolTipText("Generar EXCEL"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		//this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoListadosDocumentos.add(this.jButtonGenerarExcelReporteDinamicoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jComboBoxTiposReportesDinamicoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoListadosDocumentos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoListadosDocumentos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jLabelTiposArchivoReporteDinamicoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jComboBoxTiposArchivosReportesDinamicoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoListadosDocumentos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoListadosDocumentos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoListadosDocumentos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoListadosDocumentos.setToolTipText("Generar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jButtonGenerarReporteDinamicoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoListadosDocumentos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoListadosDocumentos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoListadosDocumentos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoListadosDocumentos.setToolTipText("Cancelar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosDocumentos.add(this.jButtonCerrarReporteDinamicoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalListadosDocumentos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoListadosDocumentos= new JScrollPane(jPanelReporteDinamicoListadosDocumentos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoListadosDocumentos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoListadosDocumentos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoListadosDocumentos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Documentoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsListadosDocumentos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoListadosDocumentos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoListadosDocumentos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalListadosDocumentos);
		this.jInternalFrameReporteDinamicoListadosDocumentos.getContentPane().add(this.jScrollPanelReporteDinamicoListadosDocumentos, this.gridBagConstraintsListadosDocumentos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionListadosDocumentos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionListadosDocumentos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionListadosDocumentos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionListadosDocumentos.setName("jPanelImportacionListadosDocumentos"); 
		
		this.jPanelImportacionListadosDocumentos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionListadosDocumentos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionListadosDocumentos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionListadosDocumentos.setLayout(gridaBagLayoutImportacionListadosDocumentos);
		
		
		this.jInternalFrameImportacionListadosDocumentos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionListadosDocumentos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionListadosDocumentos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteListadosDocumentos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionListadosDocumentos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionListadosDocumentos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionListadosDocumentos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionListadosDocumentos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionListadosDocumentos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionListadosDocumentos.setResizable(true);
	    this.jInternalFrameImportacionListadosDocumentos.setClosable(true);
	    this.jInternalFrameImportacionListadosDocumentos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionListadosDocumentos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionListadosDocumentos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionListadosDocumentos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionListadosDocumentos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionListadosDocumentos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionListadosDocumentos.setResizable(true);
	    this.jInternalFrameImportacionListadosDocumentos.setClosable(true);
	    this.jInternalFrameImportacionListadosDocumentos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionListadosDocumentos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionListadosDocumentos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionListadosDocumentos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Documentoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionListadosDocumentos = new JLabelMe();

		this.jLabelArchivoImportacionListadosDocumentos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYImportacion;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionListadosDocumentos.add(this.jLabelArchivoImportacionListadosDocumentos, this.gridBagConstraintsListadosDocumentos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionListadosDocumentos = new JFileChooser();		
		this.jFileChooserImportacionListadosDocumentos.setToolTipText("ESCOGER ARCHIVO"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionListadosDocumentos = new JButtonMe();
		this.jButtonAbrirImportacionListadosDocumentos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionListadosDocumentos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionListadosDocumentos.setToolTipText("Generar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosDocumentos.add(this.jButtonAbrirImportacionListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionListadosDocumentos = new JLabelMe();

		this.jLabelPathArchivoImportacionListadosDocumentos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionListadosDocumentos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionListadosDocumentos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionListadosDocumentos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYImportacion;		
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionListadosDocumentos.add(this.jLabelPathArchivoImportacionListadosDocumentos, this.gridBagConstraintsListadosDocumentos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionListadosDocumentos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionListadosDocumentos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionListadosDocumentos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionListadosDocumentos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosDocumentos.add(this.jTextFieldPathArchivoImportacionListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionListadosDocumentos = new JButtonMe();
		this.jButtonGenerarImportacionListadosDocumentos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionListadosDocumentos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionListadosDocumentos.setToolTipText("Generar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosDocumentos.add(this.jButtonGenerarImportacionListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionListadosDocumentos = new JButtonMe();
		this.jButtonCerrarImportacionListadosDocumentos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionListadosDocumentos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionListadosDocumentos.setToolTipText("Cancelar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosDocumentos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosDocumentos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosDocumentos.add(this.jButtonCerrarImportacionListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalListadosDocumentos = new GridBagLayout();
		
		this.jScrollPanelImportacionListadosDocumentos= new JScrollPane(jPanelImportacionListadosDocumentos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
		this.gridBagConstraintsListadosDocumentos.gridy =iPosYImportacion;
		this.gridBagConstraintsListadosDocumentos.gridx =iPosXImportacion;
		this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionListadosDocumentos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionListadosDocumentos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalListadosDocumentos);
		this.jInternalFrameImportacionListadosDocumentos.getContentPane().add(this.jScrollPanelImportacionListadosDocumentos, this.gridBagConstraintsListadosDocumentos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByListadosDocumentos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByListadosDocumentos = new JButtonMe();
			this.jButtonAbrirOrderByListadosDocumentos.setText("Orden");
			this.jButtonAbrirOrderByListadosDocumentos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByListadosDocumentos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByListadosDocumentos";
			inputMap = this.jButtonAbrirOrderByListadosDocumentos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByListadosDocumentos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByListadosDocumentos"));
		
		
			GridBagLayout gridaBagLayoutOrderByListadosDocumentos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByListadosDocumentos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByListadosDocumentos.setName("jPanelOrderByListadosDocumentos"); 
			
			this.jPanelOrderByListadosDocumentos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByListadosDocumentos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByListadosDocumentos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByListadosDocumentos.setLayout(gridaBagLayoutOrderByListadosDocumentos);
			
			
			this.jTableDatosListadosDocumentosOrderBy = new JTableMe();        
			this.jTableDatosListadosDocumentosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosListadosDocumentosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosListadosDocumentosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosListadosDocumentosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosListadosDocumentosOrderBy.setViewportView(this.jTableDatosListadosDocumentosOrderBy);
			this.jTableDatosListadosDocumentosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosListadosDocumentosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByListadosDocumentos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByListadosDocumentos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByListadosDocumentos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteListadosDocumentos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByListadosDocumentos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByListadosDocumentos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByListadosDocumentos.setTitle("Orden");
			this.jInternalFrameOrderByListadosDocumentos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByListadosDocumentos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByListadosDocumentos.setResizable(true);
			this.jInternalFrameOrderByListadosDocumentos.setClosable(true);
			this.jInternalFrameOrderByListadosDocumentos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByListadosDocumentos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByListadosDocumentos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByListadosDocumentos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByListadosDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Documentoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsListadosDocumentos.gridx =iPosXOrderBy;
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsListadosDocumentos.ipady =150;
				
			this.jPanelOrderByListadosDocumentos.add(jScrollPanelDatosListadosDocumentosOrderBy, this.gridBagConstraintsListadosDocumentos);//this.jTableDatosListadosDocumentosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByListadosDocumentos = new JButtonMe();
			this.jButtonCerrarOrderByListadosDocumentos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByListadosDocumentos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByListadosDocumentos.setToolTipText("Cancelar"+" "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByListadosDocumentos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosDocumentos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsListadosDocumentos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByListadosDocumentos.add(this.jButtonCerrarOrderByListadosDocumentos, this.gridBagConstraintsListadosDocumentos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalListadosDocumentos = new GridBagLayout();
			
			this.jScrollPanelOrderByListadosDocumentos= new JScrollPane(jPanelOrderByListadosDocumentos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsListadosDocumentos = new GridBagConstraints();
			this.gridBagConstraintsListadosDocumentos.gridy =iPosYOrderBy;
			this.gridBagConstraintsListadosDocumentos.gridx =iPosXOrderBy;
			this.gridBagConstraintsListadosDocumentos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByListadosDocumentos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByListadosDocumentos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalListadosDocumentos);
			
			this.jInternalFrameOrderByListadosDocumentos.getContentPane().add(this.jScrollPanelOrderByListadosDocumentos, this.gridBagConstraintsListadosDocumentos);			
		
		} else {
			this.jButtonAbrirOrderByListadosDocumentos = new JButtonMe();
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
		int iWidthTableCalculado=0;//4330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.listadosdocumentosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosListadosDocumentos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosListadosDocumentos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosListadosDocumentos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosListadosDocumentos.getRowHeight();//ListadosDocumentosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ListadosDocumentosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaListadosDocumentos.isSelected()) {
					iHeightTable=ListadosDocumentosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ListadosDocumentosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ListadosDocumentosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ListadosDocumentosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaListadosDocumentos.isSelected()) {
					iHeightTable=ListadosDocumentosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ListadosDocumentosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ListadosDocumentosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosListadosDocumentos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosListadosDocumentos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosListadosDocumentos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosListadosDocumentos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosListadosDocumentos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosListadosDocumentos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByListadosDocumentos!=null && this.jInternalFrameOrderByListadosDocumentos.getjTableDatosOrderBy()!=null) {
			//if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByListadosDocumentos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByListadosDocumentos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByListadosDocumentos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByListadosDocumentos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByListadosDocumentos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByListadosDocumentos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByListadosDocumentos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosListadosDocumentos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosListadosDocumentos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosListadosDocumentos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=listadosdocumentosLogic.getListadosDocumentoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadosdocumentoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ListadosDocumentos> TraerListadosDocumentosBeans(List<ListadosDocumentos> listadosdocumentoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ListadosDocumentos listadosdocumentos:listadosdocumentoss) {
					
				if(!(ListadosDocumentosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ListadosDocumentosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					listadosdocumentos.setsDetalleGeneralEntityReporte(ListadosDocumentosConstantesFunciones.getListadosDocumentosDescripcion(listadosdocumentos));
										
						
					
						
					
				} else  {
							
					//listadosdocumentos.setsDetalleGeneralEntityReporte(listadosdocumentos.getsDetalleGeneralEntityReporte());
										
				}
				
				//listadosdocumentosbeans.add(listadosdocumentosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return listadosdocumentoss;
    }
	//PARA REPORTES FIN
}
