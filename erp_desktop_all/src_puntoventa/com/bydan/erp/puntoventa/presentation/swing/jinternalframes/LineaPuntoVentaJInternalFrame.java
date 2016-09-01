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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.LineaPuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class LineaPuntoVentaJInternalFrame extends LineaPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarLineaPuntoVenta;
	
	protected JMenuBar jmenuBarLineaPuntoVenta;
	
	protected JMenu jmenuLineaPuntoVenta;
	protected JMenu jmenuDatosLineaPuntoVenta;
	protected JMenu jmenuArchivoLineaPuntoVenta;
	protected JMenu jmenuAccionesLineaPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosLineaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutLineaPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsLineaPuntoVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public LineaPuntoVentaDetalleFormJInternalFrame jInternalFrameDetalleFormLineaPuntoVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoLineaPuntoVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionLineaPuntoVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public LineaPuntoVentaSessionBean lineapuntoventaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<LineaPuntoVenta> lineapuntoventas;		
	public List<LineaPuntoVenta> lineapuntoventasEliminados;	
	public List<LineaPuntoVenta> lineapuntoventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByLineaPuntoVenta;		
	protected JButton jButtonAbrirOrderByLineaPuntoVenta;
	
	
	//protected JPanel jPanelOrderByLineaPuntoVenta;
	//public JScrollPane jScrollPanelOrderByLineaPuntoVenta;	
	//protected JButton jButtonCerrarOrderByLineaPuntoVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public LineaPuntoVentaLogic lineapuntoventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosLineaPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionLineaPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralLineaPuntoVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosLineaPuntoVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoLineaPuntoVenta;
	//public JScrollPane jScrollPanelImportacionLineaPuntoVenta;
	
	
	
	protected JPanel jPanelAccionesLineaPuntoVenta;
	
    protected JPanel jPanelPaginacionLineaPuntoVenta;
    protected JPanel jPanelParametrosReportesLineaPuntoVenta;
	protected JPanel jPanelParametrosReportesAccionesLineaPuntoVenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1LineaPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar2LineaPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar3LineaPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar4LineaPuntoVenta;
	//protected JPanel jPanelParametrosAuxiliar5LineaPuntoVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoLineaPuntoVenta;
	//protected JPanel jPanelImportacionLineaPuntoVenta;
	
	
	public JTable jTableDatosLineaPuntoVenta;
	
	
	
	//public JTable jTableDatosLineaPuntoVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoLineaPuntoVenta;
	protected JButton jButtonDuplicarLineaPuntoVenta;
	protected JButton jButtonCopiarLineaPuntoVenta;
	protected JButton jButtonVerFormLineaPuntoVenta;
	protected JButton jButtonNuevoRelacionesLineaPuntoVenta;
	protected JButton jButtonModificarLineaPuntoVenta;
	
    protected JButton jButtonGuardarCambiosTablaLineaPuntoVenta;
	protected JButton jButtonCerrarLineaPuntoVenta;
	
	
	protected JButton jButtonRecargarInformacionLineaPuntoVenta;
	protected JButton jButtonProcesarInformacionLineaPuntoVenta;
	
	
	protected JButton jButtonAnterioresLineaPuntoVenta;
	protected JButton jButtonSiguientesLineaPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosLineaPuntoVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoLineaPuntoVenta;
	//protected JButton jButtonCerrarReporteDinamicoLineaPuntoVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoLineaPuntoVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionLineaPuntoVenta;
	//protected JButton jButtonGenerarImportacionLineaPuntoVenta;
	//protected JButton jButtonCerrarImportacionLineaPuntoVenta;
	//protected JFileChooser jFileChooserImportacionLineaPuntoVenta;
	//protected File fileImportacionLineaPuntoVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarLineaPuntoVenta;
	protected JButton jButtonDuplicarToolBarLineaPuntoVenta;
	protected JButton jButtonNuevoRelacionesToolBarLineaPuntoVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarLineaPuntoVenta;
	protected JButton jButtonCopiarToolBarLineaPuntoVenta;
	protected JButton jButtonVerFormToolBarLineaPuntoVenta;
	public JButton jButtonGuardarCambiosTablaToolBarLineaPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarLineaPuntoVenta;
	protected JButton jButtonCerrarToolBarLineaPuntoVenta;
	
	protected JButton jButtonRecargarInformacionToolBarLineaPuntoVenta;
	protected JButton jButtonProcesarInformacionToolBarLineaPuntoVenta;
	protected JButton jButtonAnterioresToolBarLineaPuntoVenta;
	protected JButton jButtonSiguientesToolBarLineaPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarLineaPuntoVenta;
	protected JButton jButtonAbrirOrderByToolBarLineaPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoLineaPuntoVenta;
	protected JMenuItem jMenuItemDuplicarLineaPuntoVenta;
	protected JMenuItem jMenuItemNuevoRelacionesLineaPuntoVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosLineaPuntoVenta;
	protected JMenuItem jMenuItemCopiarLineaPuntoVenta;
	protected JMenuItem jMenuItemVerFormLineaPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaLineaPuntoVenta;
	protected JMenuItem jMenuItemCerrarLineaPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarLineaPuntoVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByLineaPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarLineaPuntoVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionLineaPuntoVenta;
	protected JMenuItem jMenuItemProcesarInformacionLineaPuntoVenta;
	protected JMenuItem jMenuItemAnterioresLineaPuntoVenta;
	protected JMenuItem jMenuItemSiguientesLineaPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosLineaPuntoVenta;
	protected JMenuItem jMenuItemAbrirOrderByLineaPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarLineaPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesLineaPuntoVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosLineaPuntoVenta;
	protected JCheckBox jCheckBoxSeleccionadosLineaPuntoVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaLineaPuntoVenta;
	protected JCheckBox jCheckBoxConGraficoReporteLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesLineaPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoLineaPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarLineaPuntoVenta;
	protected JTextField jTextFieldValorCampoGeneralLineaPuntoVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteLineaPuntoVenta;
	//public JList<Reporte> jListColumnasSelectReporteLineaPuntoVenta;
	//public JScrollPane jScrollColumnasSelectReporteLineaPuntoVenta;
	
	//public JLabel jLabelRelacionesSelectReporteLineaPuntoVenta;
	//public JList<Reporte> jListRelacionesSelectReporteLineaPuntoVenta;
	//public JScrollPane jScrollRelacionesSelectReporteLineaPuntoVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoLineaPuntoVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoLineaPuntoVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoLineaPuntoVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoLineaPuntoVenta;
	
		
	//public JLabel jLabelArchivoImportacionLineaPuntoVenta;	
	//public JLabel jLabelPathArchivoImportacionLineaPuntoVenta;
	//protected JTextField jTextFieldPathArchivoImportacionLineaPuntoVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoLineaPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoLineaPuntoVenta;
	
	//public JLabel jLabelColumnaCategoriaValorLineaPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorLineaPuntoVenta;
	
	//public JLabel jLabelColumnasValoresGraficoLineaPuntoVenta;
	//public JList<Reporte> jListColumnasValoresGraficoLineaPuntoVenta;
	//public JScrollPane jScrollColumnasValoresGraficoLineaPuntoVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoLineaPuntoVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoLineaPuntoVenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasLineaPuntoVenta;
	public JPanel jPanelFK_IdLineaLineaPuntoVenta;
	public JButton jButtonFK_IdLineaLineaPuntoVenta;
	public JPanel jPanelFK_IdLineaCategoriaLineaPuntoVenta;
	public JButton jButtonFK_IdLineaCategoriaLineaPuntoVenta;
	public JPanel jPanelFK_IdLineaGrupoLineaPuntoVenta;
	public JButton jButtonFK_IdLineaGrupoLineaPuntoVenta;
	public JPanel jPanelFK_IdLineaMarcaLineaPuntoVenta;
	public JButton jButtonFK_IdLineaMarcaLineaPuntoVenta;
	
	public JPanel jPanelid_lineaFK_IdLineaLineaPuntoVenta;
	public JLabel jLabelid_lineaFK_IdLineaLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaFK_IdLineaLineaPuntoVenta;
	public JButton jButtonid_lineaFK_IdLineaLineaPuntoVenta= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaLineaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaLineaPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaLineaPuntoVentaArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta;
	public JLabel jLabelid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta;
	public JButton jButtonid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta= new JButtonMe();
	public JButton jButtonid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVentaArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta;
	public JLabel jLabelid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta;
	public JButton jButtonid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta= new JButtonMe();
	public JButton jButtonid_linea_grupoFK_IdLineaGrupoLineaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoFK_IdLineaGrupoLineaPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_linea_grupoFK_IdLineaGrupoLineaPuntoVentaArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta;
	public JLabel jLabelid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta;
	public JButton jButtonid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta= new JButtonMe();
	public JButton jButtonid_linea_marcaFK_IdLineaMarcaLineaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaFK_IdLineaMarcaLineaPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_linea_marcaFK_IdLineaMarcaLineaPuntoVentaArbol= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public LineaPuntoVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("LineaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaPuntoVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LineaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaPuntoVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LineaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaPuntoVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("LineaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionLineaPuntoVenta)	{
		this.jButtonRecargarInformacionLineaPuntoVenta = jButtonRecargarInformacionLineaPuntoVenta;
	}
	
	public JButton getjButtonProcesarInformacionLineaPuntoVenta() {
		return this.jButtonProcesarInformacionLineaPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionLineaPuntoVenta)	{
		this.jButtonProcesarInformacionLineaPuntoVenta = jButtonProcesarInformacionLineaPuntoVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionLineaPuntoVenta() {
		return this.jButtonRecargarInformacionLineaPuntoVenta;
	}
	
	
	public List<LineaPuntoVenta> getlineapuntoventas() {
		return this.lineapuntoventas;
	}

	public void setlineapuntoventas(List<LineaPuntoVenta> lineapuntoventas) {
		this.lineapuntoventas = lineapuntoventas;
	}
	
	public List<LineaPuntoVenta> getlineapuntoventasAux() {
		return this.lineapuntoventasAux;
	}

	public void setlineapuntoventasAux(List<LineaPuntoVenta> lineapuntoventasAux) {
		this.lineapuntoventasAux = lineapuntoventasAux;
	}
	
	public List<LineaPuntoVenta> getlineapuntoventasEliminados() {
		return this.lineapuntoventasEliminados;
	}

	public void setLineaPuntoVentasEliminados(List<LineaPuntoVenta> lineapuntoventasEliminados) {
		this.lineapuntoventasEliminados = lineapuntoventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarLineaPuntoVenta() {
		return jComboBoxTiposSeleccionarLineaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarLineaPuntoVenta(
			JComboBox jComboBoxTiposSeleccionarLineaPuntoVenta) {
		this.jComboBoxTiposSeleccionarLineaPuntoVenta = jComboBoxTiposSeleccionarLineaPuntoVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarLineaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarLineaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarLineaPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralLineaPuntoVenta() {
		return jTextFieldValorCampoGeneralLineaPuntoVenta;
	}

	public void setjTextFieldValorCampoGeneralLineaPuntoVenta(
			JTextField jTextFieldValorCampoGeneralLineaPuntoVenta) {
		this.jTextFieldValorCampoGeneralLineaPuntoVenta = jTextFieldValorCampoGeneralLineaPuntoVenta;
	}

	public void setBorderResaltarValorCampoGeneralLineaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaPuntoVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralLineaPuntoVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosLineaPuntoVenta() {
		return this.jCheckBoxSeleccionarTodosLineaPuntoVenta;
	}

	public void setjCheckBoxSeleccionarTodosLineaPuntoVenta(
			JCheckBox jCheckBoxSeleccionarTodosLineaPuntoVenta) {
		this.jCheckBoxSeleccionarTodosLineaPuntoVenta = jCheckBoxSeleccionarTodosLineaPuntoVenta;
	}

	public void setBorderResaltarSeleccionarTodosLineaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosLineaPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosLineaPuntoVenta() {
		return this.jCheckBoxSeleccionadosLineaPuntoVenta;
	}

	public void setjCheckBoxSeleccionadosLineaPuntoVenta(
			JCheckBox jCheckBoxSeleccionadosLineaPuntoVenta) {
		this.jCheckBoxSeleccionadosLineaPuntoVenta = jCheckBoxSeleccionadosLineaPuntoVenta;
	}
	
	public void setBorderResaltarSeleccionadosLineaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosLineaPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesLineaPuntoVenta() {
		return this.jComboBoxTiposArchivosReportesLineaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesLineaPuntoVenta(
			JComboBox jComboBoxTiposArchivosReportesLineaPuntoVenta) {
		this.jComboBoxTiposArchivosReportesLineaPuntoVenta = jComboBoxTiposArchivosReportesLineaPuntoVenta;
	}

	public void setBorderResaltarTiposArchivosReportesLineaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesLineaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesLineaPuntoVenta() {
		return this.jComboBoxTiposReportesLineaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesLineaPuntoVenta(
			JComboBox jComboBoxTiposReportesLineaPuntoVenta) {
		this.jComboBoxTiposReportesLineaPuntoVenta = jComboBoxTiposReportesLineaPuntoVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoLineaPuntoVenta() {
	//	return jComboBoxTiposReportesDinamicoLineaPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoLineaPuntoVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoLineaPuntoVenta) {
	//	this.jComboBoxTiposReportesDinamicoLineaPuntoVenta = jComboBoxTiposReportesDinamicoLineaPuntoVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoLineaPuntoVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoLineaPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoLineaPuntoVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoLineaPuntoVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoLineaPuntoVenta = jComboBoxTiposArchivosReportesDinamicoLineaPuntoVenta;
	//}
	
	public void setBorderResaltarTiposReportesLineaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesLineaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesLineaPuntoVenta() {
		return this.jComboBoxTiposGraficosReportesLineaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesLineaPuntoVenta(
			JComboBox jComboBoxTiposGraficosReportesLineaPuntoVenta) {
		this.jComboBoxTiposGraficosReportesLineaPuntoVenta = jComboBoxTiposGraficosReportesLineaPuntoVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesLineaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesLineaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionLineaPuntoVenta() {
		return this.jComboBoxTiposPaginacionLineaPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionLineaPuntoVenta(
			JComboBox jComboBoxTiposPaginacionLineaPuntoVenta) {
		this.jComboBoxTiposPaginacionLineaPuntoVenta = jComboBoxTiposPaginacionLineaPuntoVenta;
	}
	
	public void setBorderResaltarTiposPaginacionLineaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionLineaPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesLineaPuntoVenta() {
		return this.jComboBoxTiposRelacionesLineaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesLineaPuntoVenta() {
		return this.jComboBoxTiposAccionesLineaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesLineaPuntoVenta(
			JComboBox jComboBoxTiposRelacionesLineaPuntoVenta) {
		this.jComboBoxTiposRelacionesLineaPuntoVenta = jComboBoxTiposRelacionesLineaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesLineaPuntoVenta(
			JComboBox jComboBoxTiposAccionesLineaPuntoVenta) {
		this.jComboBoxTiposAccionesLineaPuntoVenta = jComboBoxTiposAccionesLineaPuntoVenta;
	}
	
	public void setBorderResaltarTiposRelacionesLineaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesLineaPuntoVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesLineaPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarLineaPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesLineaPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoLineaPuntoVenta() {
	//	return jCheckBoxConGraficoDinamicoLineaPuntoVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoLineaPuntoVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoLineaPuntoVenta) {
	//	this.jCheckBoxConGraficoDinamicoLineaPuntoVenta = jCheckBoxConGraficoDinamicoLineaPuntoVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoLineaPuntoVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarLineaPuntoVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoLineaPuntoVenta .setBorder(borderResaltar);		
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
		this.lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
		
		this.lineapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.lineapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.lineapuntoventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=LineaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=LineaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		LineaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		LineaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		LineaPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Linea Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
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
		
		LineaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("LineaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarLineaPuntoVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarLineaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarLineaPuntoVenta,this.jTtoolBarLineaPuntoVenta,
							"nuevo","nuevo","Nuevo"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarLineaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarLineaPuntoVenta,this.jTtoolBarLineaPuntoVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarLineaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarLineaPuntoVenta,this.jTtoolBarLineaPuntoVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarLineaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarLineaPuntoVenta,this.jTtoolBarLineaPuntoVenta,
							"duplicar","duplicar","Duplicar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarLineaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarLineaPuntoVenta,this.jTtoolBarLineaPuntoVenta,
							"copiar","copiar","Copiar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarLineaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarLineaPuntoVenta,this.jTtoolBarLineaPuntoVenta,
							"ver_form","ver_form","Ver"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarLineaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLineaPuntoVenta,this.jTtoolBarLineaPuntoVenta,
							"recargar","recargar","Recargar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarLineaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLineaPuntoVenta,this.jTtoolBarLineaPuntoVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarLineaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarLineaPuntoVenta,this.jTtoolBarLineaPuntoVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarLineaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarLineaPuntoVenta,this.jTtoolBarLineaPuntoVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarLineaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarLineaPuntoVenta,this.jTtoolBarLineaPuntoVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarLineaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarLineaPuntoVenta,this.jTtoolBarLineaPuntoVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarLineaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarLineaPuntoVenta,this.jTtoolBarLineaPuntoVenta,
							"cerrar","cerrar","Salir"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarLineaPuntoVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarLineaPuntoVenta;
			
				this.jButtonProcesarInformacionToolBarLineaPuntoVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarLineaPuntoVenta;
				
		//protected JButton jButtonModificarToolBarLineaPuntoVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarLineaPuntoVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuLineaPuntoVenta=new JMenuMe("General");
		this.jmenuArchivoLineaPuntoVenta=new JMenuMe("Archivo");
		this.jmenuAccionesLineaPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDatosLineaPuntoVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoLineaPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoLineaPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoLineaPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarLineaPuntoVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarLineaPuntoVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarLineaPuntoVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesLineaPuntoVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesLineaPuntoVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesLineaPuntoVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosLineaPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosLineaPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosLineaPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarLineaPuntoVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarLineaPuntoVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarLineaPuntoVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormLineaPuntoVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormLineaPuntoVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormLineaPuntoVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaLineaPuntoVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaLineaPuntoVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaLineaPuntoVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarLineaPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarLineaPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarLineaPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionLineaPuntoVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionLineaPuntoVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionLineaPuntoVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionLineaPuntoVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionLineaPuntoVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionLineaPuntoVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresLineaPuntoVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresLineaPuntoVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresLineaPuntoVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesLineaPuntoVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesLineaPuntoVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesLineaPuntoVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByLineaPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByLineaPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByLineaPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarLineaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarLineaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarLineaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByLineaPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByLineaPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByLineaPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarLineaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarLineaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarLineaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosLineaPuntoVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosLineaPuntoVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosLineaPuntoVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoLineaPuntoVenta.add(this.jMenuItemCerrarLineaPuntoVenta);
			
			this.jmenuAccionesLineaPuntoVenta.add(this.jMenuItemNuevoLineaPuntoVenta);
			this.jmenuAccionesLineaPuntoVenta.add(this.jMenuItemNuevoGuardarCambiosLineaPuntoVenta);
			this.jmenuAccionesLineaPuntoVenta.add(this.jMenuItemNuevoRelacionesLineaPuntoVenta);
			this.jmenuAccionesLineaPuntoVenta.add(this.jMenuItemGuardarCambiosTablaLineaPuntoVenta);		
			this.jmenuAccionesLineaPuntoVenta.add(this.jMenuItemDuplicarLineaPuntoVenta);		
			this.jmenuAccionesLineaPuntoVenta.add(this.jMenuItemCopiarLineaPuntoVenta);		
			this.jmenuAccionesLineaPuntoVenta.add(this.jMenuItemVerFormLineaPuntoVenta);		
			
			this.jmenuDatosLineaPuntoVenta.add(this.jMenuItemRecargarInformacionLineaPuntoVenta);				
			this.jmenuDatosLineaPuntoVenta.add(this.jMenuItemAnterioresLineaPuntoVenta);				
			this.jmenuDatosLineaPuntoVenta.add(this.jMenuItemSiguientesLineaPuntoVenta);				
			this.jmenuDatosLineaPuntoVenta.add(this.jMenuItemAbrirOrderByLineaPuntoVenta);				
			this.jmenuDatosLineaPuntoVenta.add(this.jMenuItemMostrarOcultarLineaPuntoVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesLineaPuntoVenta.add(this.jMenuItemGuardarCambiosLineaPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarLineaPuntoVenta.add(this.jmenuArchivoLineaPuntoVenta);		
			this.jmenuBarLineaPuntoVenta.add(this.jmenuAccionesLineaPuntoVenta);		
			this.jmenuBarLineaPuntoVenta.add(this.jmenuDatosLineaPuntoVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarLineaPuntoVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasLineaPuntoVenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdLineaLineaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaLineaPuntoVenta.setToolTipText("Buscar Por Linea ");
		this.jButtonFK_IdLineaLineaPuntoVenta= new JButtonMe();
		this.jButtonFK_IdLineaLineaPuntoVenta.setText("Buscar");
		this.jButtonFK_IdLineaLineaPuntoVenta.setToolTipText("Buscar Por Linea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaLineaPuntoVenta,"buscar_button","Buscar Por Linea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_lineaFK_IdLineaLineaPuntoVenta = new JLabelMe();
		jLabelid_lineaFK_IdLineaLineaPuntoVenta.setText("Linea :");
		jLabelid_lineaFK_IdLineaLineaPuntoVenta.setToolTipText("Linea");
		jLabelid_lineaFK_IdLineaLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaFK_IdLineaLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaFK_IdLineaLineaPuntoVenta= new JComboBoxMe();
		jComboBoxid_lineaFK_IdLineaLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaFK_IdLineaLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLineaCategoriaLineaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaCategoriaLineaPuntoVenta.setToolTipText("Buscar Por Linea Categoria ");
		this.jButtonFK_IdLineaCategoriaLineaPuntoVenta= new JButtonMe();
		this.jButtonFK_IdLineaCategoriaLineaPuntoVenta.setText("Buscar");
		this.jButtonFK_IdLineaCategoriaLineaPuntoVenta.setToolTipText("Buscar Por Linea Categoria ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaCategoriaLineaPuntoVenta,"buscar_button","Buscar Por Linea Categoria ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaCategoriaLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta = new JLabelMe();
		jLabelid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.setText("Linea Categoria :");
		jLabelid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta= new JComboBoxMe();
		jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLineaGrupoLineaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaGrupoLineaPuntoVenta.setToolTipText("Buscar Por Linea Grupo ");
		this.jButtonFK_IdLineaGrupoLineaPuntoVenta= new JButtonMe();
		this.jButtonFK_IdLineaGrupoLineaPuntoVenta.setText("Buscar");
		this.jButtonFK_IdLineaGrupoLineaPuntoVenta.setToolTipText("Buscar Por Linea Grupo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaGrupoLineaPuntoVenta,"buscar_button","Buscar Por Linea Grupo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaGrupoLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta = new JLabelMe();
		jLabelid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.setText("Linea Grupo :");
		jLabelid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta= new JComboBoxMe();
		jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLineaMarcaLineaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaMarcaLineaPuntoVenta.setToolTipText("Buscar Por Linea Marca ");
		this.jButtonFK_IdLineaMarcaLineaPuntoVenta= new JButtonMe();
		this.jButtonFK_IdLineaMarcaLineaPuntoVenta.setText("Buscar");
		this.jButtonFK_IdLineaMarcaLineaPuntoVenta.setToolTipText("Buscar Por Linea Marca ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaMarcaLineaPuntoVenta,"buscar_button","Buscar Por Linea Marca ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaMarcaLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta = new JLabelMe();
		jLabelid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.setText("Linea Marca :");
		jLabelid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.setToolTipText("Linea Marca");
		jLabelid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta= new JComboBoxMe();
		jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasLineaPuntoVenta=new JTabbedPane();


		this.jTabbedPaneBusquedasLineaPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasLineaPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasLineaPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasLineaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleLineaPuntoVenta = new LineaPuntoVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Linea Punto Venta DATOS");
			this.jInternalFrameDetalleFormLineaPuntoVenta = new LineaPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.lineapuntoventaSessionBean.getConGuardarRelaciones(),this.lineapuntoventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormLineaPuntoVenta = null;//new LineaPuntoVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutLineaPuntoVenta= new GridBagLayout();
		
		
		this.jTableDatosLineaPuntoVenta = new JTableMe();      
		
		String sToolTipLineaPuntoVenta="";
		sToolTipLineaPuntoVenta=LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipLineaPuntoVenta+="(PuntoVenta.LineaPuntoVenta)";
		}
		
		if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipLineaPuntoVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosLineaPuntoVenta.setToolTipText(sToolTipLineaPuntoVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosLineaPuntoVenta);
		this.jTableDatosLineaPuntoVenta.setAutoCreateRowSorter(true);
		this.jTableDatosLineaPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosLineaPuntoVenta.setRowSelectionAllowed(true);
		this.jTableDatosLineaPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosLineaPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoLineaPuntoVenta = new JButtonMe();
		this.jButtonDuplicarLineaPuntoVenta = new JButtonMe();
		this.jButtonCopiarLineaPuntoVenta = new JButtonMe();
		this.jButtonVerFormLineaPuntoVenta = new JButtonMe();
		this.jButtonNuevoRelacionesLineaPuntoVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaLineaPuntoVenta = new JButtonMe();
		this.jButtonCerrarLineaPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosLineaPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralLineaPuntoVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesLineaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Linea Punto Venta";
		
		if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosLineaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesLineaPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesLineaPuntoVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoLineaPuntoVenta=new ReporteDinamicoJInternalFrame(LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoLineaPuntoVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionLineaPuntoVenta=new ImportacionJInternalFrame(LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionLineaPuntoVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByLineaPuntoVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByLineaPuntoVenta.setText("Orden");
		this.jButtonAbrirOrderByLineaPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByLineaPuntoVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByLineaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByLineaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLineaPuntoVenta,false,this);
			
			//this.cargarOrderByLineaPuntoVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByLineaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLineaPuntoVenta,true,this);
			
			//this.cargarOrderByLineaPuntoVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosLineaPuntoVenta.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosLineaPuntoVenta.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosLineaPuntoVenta.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosLineaPuntoVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosLineaPuntoVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosLineaPuntoVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoLineaPuntoVenta.setText("Nuevo");
		this.jButtonDuplicarLineaPuntoVenta.setText("Duplicar");
		this.jButtonCopiarLineaPuntoVenta.setText("Copiar");
		this.jButtonVerFormLineaPuntoVenta.setText("Ver");
		this.jButtonNuevoRelacionesLineaPuntoVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaLineaPuntoVenta.setText("Guardar");
		this.jButtonCerrarLineaPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoLineaPuntoVenta,"nuevo_button","Nuevo",this.lineapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarLineaPuntoVenta,"duplicar_button","Duplicar",this.lineapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarLineaPuntoVenta,"copiar_button","Copiar",this.lineapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormLineaPuntoVenta,"ver_form","Ver",this.lineapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesLineaPuntoVenta,"nuevorelaciones_button","Nuevo Rel",this.lineapuntoventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaLineaPuntoVenta,"guardarcambiostabla_button","Guardar",this.lineapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarLineaPuntoVenta,"cerrar_button","Salir",this.lineapuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoLineaPuntoVenta.setToolTipText("Nuevo"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarLineaPuntoVenta.setToolTipText("Duplicar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarLineaPuntoVenta.setToolTipText("Copiar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormLineaPuntoVenta.setToolTipText("Ver"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesLineaPuntoVenta.setToolTipText("Nuevo Rel"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaLineaPuntoVenta.setToolTipText("Guardar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarLineaPuntoVenta.setToolTipText("Salir"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoLineaPuntoVenta";
		inputMap = this.jButtonNuevoLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoLineaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoLineaPuntoVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarLineaPuntoVenta";
		inputMap = this.jButtonDuplicarLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarLineaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarLineaPuntoVenta"));
		
		//COPIAR
		sMapKey = "CopiarLineaPuntoVenta";
		inputMap = this.jButtonCopiarLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarLineaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarLineaPuntoVenta"));
		
		//VEr FORM
		sMapKey = "VerFormLineaPuntoVenta";
		inputMap = this.jButtonVerFormLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormLineaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormLineaPuntoVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesLineaPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesLineaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesLineaPuntoVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarLineaPuntoVenta";
		inputMap = this.jButtonModificarLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarLineaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarLineaPuntoVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarLineaPuntoVenta";
		inputMap = this.jButtonCerrarLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarLineaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarLineaPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaLineaPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaLineaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaLineaPuntoVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesLineaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesLineaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionLineaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1LineaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2LineaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3LineaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4LineaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5LineaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesLineaPuntoVenta.setName("jPanelParametrosReportesLineaPuntoVenta"); 
		
		this.jPanelParametrosReportesAccionesLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesLineaPuntoVenta.setName("jPanelParametrosReportesAccionesLineaPuntoVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionLineaPuntoVenta = new JButtonMe();
		this.jButtonRecargarInformacionLineaPuntoVenta.setText("Recargar");
		this.jButtonRecargarInformacionLineaPuntoVenta.setToolTipText("Recargar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionLineaPuntoVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionLineaPuntoVenta = new JButtonMe();
		this.jButtonProcesarInformacionLineaPuntoVenta.setText("Procesar");
		this.jButtonProcesarInformacionLineaPuntoVenta.setToolTipText("Procesar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionLineaPuntoVenta.setVisible(false);
			
		this.jButtonProcesarInformacionLineaPuntoVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionLineaPuntoVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionLineaPuntoVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesLineaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLineaPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesLineaPuntoVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesLineaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLineaPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposReportesLineaPuntoVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesLineaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesLineaPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesLineaPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionLineaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionLineaPuntoVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionLineaPuntoVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesLineaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesLineaPuntoVenta.setText("Accion");
		this.jComboBoxTiposRelacionesLineaPuntoVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesLineaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesLineaPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesLineaPuntoVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarLineaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarLineaPuntoVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarLineaPuntoVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralLineaPuntoVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralLineaPuntoVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralLineaPuntoVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralLineaPuntoVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesLineaPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesLineaPuntoVenta.setText("Acciones");		
		this.jLabelAccionesLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosLineaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosLineaPuntoVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosLineaPuntoVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosLineaPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosLineaPuntoVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosLineaPuntoVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaLineaPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaLineaPuntoVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaLineaPuntoVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteLineaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteLineaPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoReporteLineaPuntoVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresLineaPuntoVenta = new JButtonMe();
		//this.jButtonAnterioresLineaPuntoVenta.setText("<<");
        this.jButtonAnterioresLineaPuntoVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresLineaPuntoVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesLineaPuntoVenta = new JButtonMe();
		//this.jButtonSiguientesLineaPuntoVenta.setText(">>");
        this.jButtonSiguientesLineaPuntoVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesLineaPuntoVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosLineaPuntoVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosLineaPuntoVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosLineaPuntoVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosLineaPuntoVenta,"nuevoguardarcambios_button","Nue",this.lineapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosLineaPuntoVenta";
		inputMap = this.jButtonNuevoGuardarCambiosLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosLineaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosLineaPuntoVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionLineaPuntoVenta";
		inputMap = this.jButtonRecargarInformacionLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionLineaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionLineaPuntoVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesLineaPuntoVenta";
		inputMap = this.jButtonSiguientesLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesLineaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesLineaPuntoVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresLineaPuntoVenta";
		inputMap = this.jButtonAnterioresLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresLineaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresLineaPuntoVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasLineaPuntoVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesLineaPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),LineaPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LineaPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesLineaPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),LineaPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LineaPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesLineaPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),LineaPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(LineaPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionLineaPuntoVenta = new GridBagLayout();

			this.jPanelPaginacionLineaPuntoVenta.setLayout(gridaBagLayoutPaginacionLineaPuntoVenta);						
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
			this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionLineaPuntoVenta.add(this.jButtonAnterioresLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
					
						
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
			
			this.jPanelPaginacionLineaPuntoVenta.add(this.jButtonNuevoGuardarCambiosLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
						
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
			this.jPanelPaginacionLineaPuntoVenta.add(this.jButtonSiguientesLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaPuntoVenta.gridy = 1;
			this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLineaPuntoVenta.add(this.jButtonNuevoLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
						
			
			
			if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsLineaPuntoVenta.gridy = 1;
				this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionLineaPuntoVenta.add(this.jButtonGuardarCambiosTablaLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
			}
			
			
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaPuntoVenta.gridy = 1;
			this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLineaPuntoVenta.add(this.jButtonDuplicarLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaPuntoVenta.gridy = 1;
			this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLineaPuntoVenta.add(this.jButtonCopiarLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaPuntoVenta.gridy = 1;
			this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionLineaPuntoVenta.add(this.jButtonVerFormLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaPuntoVenta.gridy = 1;
			this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionLineaPuntoVenta.add(this.jButtonCerrarLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		
		
		
		this.jButtonRecargarInformacionLineaPuntoVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionLineaPuntoVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionLineaPuntoVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesLineaPuntoVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesLineaPuntoVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesLineaPuntoVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesLineaPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesLineaPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesLineaPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesLineaPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesLineaPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesLineaPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionLineaPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionLineaPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionLineaPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesLineaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesLineaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesLineaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesLineaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLineaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLineaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarLineaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarLineaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarLineaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaLineaPuntoVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaLineaPuntoVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaLineaPuntoVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteLineaPuntoVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteLineaPuntoVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteLineaPuntoVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosLineaPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosLineaPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosLineaPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosLineaPuntoVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosLineaPuntoVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosLineaPuntoVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesLineaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesLineaPuntoVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1LineaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2LineaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3LineaPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4LineaPuntoVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesLineaPuntoVenta.setLayout(gridaBagParametrosReportesLineaPuntoVenta);
			this.jPanelParametrosReportesAccionesLineaPuntoVenta.setLayout(gridaBagParametrosReportesAccionesLineaPuntoVenta);
			
			
			this.jPanelParametrosAuxiliar1LineaPuntoVenta.setLayout(gridaBagParametrosAuxiliar1LineaPuntoVenta);
			this.jPanelParametrosAuxiliar2LineaPuntoVenta.setLayout(gridaBagParametrosAuxiliar2LineaPuntoVenta);
			this.jPanelParametrosAuxiliar3LineaPuntoVenta.setLayout(gridaBagParametrosAuxiliar3LineaPuntoVenta);
			this.jPanelParametrosAuxiliar4LineaPuntoVenta.setLayout(gridaBagParametrosAuxiliar4LineaPuntoVenta);
			//this.jPanelParametrosAuxiliar5LineaPuntoVenta.setLayout(gridaBagParametrosAuxiliar2LineaPuntoVenta);			
			
			
			
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLineaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLineaPuntoVenta.add(this.jButtonRecargarInformacionLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLineaPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LineaPuntoVenta.add(this.jComboBoxTiposPaginacionLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLineaPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LineaPuntoVenta.add(this.jCheckBoxConAltoMaximoTablaLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsLineaPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1LineaPuntoVenta.add(this.jComboBoxTiposArchivosReportesLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLineaPuntoVenta.add(this.jPanelParametrosAuxiliar1LineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLineaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4LineaPuntoVenta.add(this.jComboBoxTiposReportesLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLineaPuntoVenta.add(this.jPanelParametrosAuxiliar4LineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsLineaPuntoVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLineaPuntoVenta.add(this.jComboBoxTiposReportesLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaPuntoVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLineaPuntoVenta.add(this.jCheckBoxGenerarReporteLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLineaPuntoVenta.add(this.jPanelParametrosAuxiliar2LineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLineaPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLineaPuntoVenta.add(this.jLabelAccionesLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsLineaPuntoVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesLineaPuntoVenta.add(this.jButtonAbrirOrderByLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLineaPuntoVenta.add(this.jComboBoxTiposSeleccionarLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);			
			
			
			/*
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsLineaPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesLineaPuntoVenta.add(this.jCheckBoxSeleccionarTodosLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLineaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3LineaPuntoVenta.add(this.jCheckBoxSeleccionarTodosLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);															
				
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsLineaPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3LineaPuntoVenta.add(this.jCheckBoxSeleccionadosLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesLineaPuntoVenta.add(this.jPanelParametrosAuxiliar3LineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLineaPuntoVenta.add(this.jComboBoxTiposAccionesLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
	
				
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsLineaPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesLineaPuntoVenta.add(this.jTextFieldValorCampoGeneralLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosLineaPuntoVenta = new GridBagLayout();

			this.jScrollPanelDatosLineaPuntoVenta.setLayout(gridaBagLayoutDatosLineaPuntoVenta);
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
			this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
			
			this.jScrollPanelDatosLineaPuntoVenta.add(this.jTableDatosLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosLineaPuntoVenta.setViewportView(this.jTableDatosLineaPuntoVenta);
		this.jTableDatosLineaPuntoVenta.setFillsViewportHeight(true);
		this.jTableDatosLineaPuntoVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesLineaPuntoVenta= new GridBagLayout();
		this.jPanelAccionesLineaPuntoVenta.setLayout(gridaBagLayoutAccionesLineaPuntoVenta);
		
		
		/*	
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = 0;
		this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
			
		this.jPanelAccionesLineaPuntoVenta.add(this.jButtonNuevoLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdLineaLineaPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdLineaLineaPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaLineaPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaLineaPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaLineaPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaLineaPuntoVenta.setLayout(gridaBagLayoutFK_IdLineaLineaPuntoVenta);

		gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaPuntoVenta.gridy = 0;
		gridBagConstraintsLineaPuntoVenta.gridx = 0;
		jPanelFK_IdLineaLineaPuntoVenta.add(jLabelid_lineaFK_IdLineaLineaPuntoVenta, gridBagConstraintsLineaPuntoVenta);

		gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaPuntoVenta.gridy = 0;
		gridBagConstraintsLineaPuntoVenta.gridx = 1;
		jPanelFK_IdLineaLineaPuntoVenta.add(jComboBoxid_lineaFK_IdLineaLineaPuntoVenta, gridBagConstraintsLineaPuntoVenta);

		gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaPuntoVenta.gridy = 1;
		gridBagConstraintsLineaPuntoVenta.gridx =1;
		jPanelFK_IdLineaLineaPuntoVenta.add(jButtonFK_IdLineaLineaPuntoVenta, gridBagConstraintsLineaPuntoVenta);

		jTabbedPaneBusquedasLineaPuntoVenta.addTab("1.-Por Linea ", jPanelFK_IdLineaLineaPuntoVenta);
		jTabbedPaneBusquedasLineaPuntoVenta.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdLineaCategoriaLineaPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdLineaCategoriaLineaPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaCategoriaLineaPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaCategoriaLineaPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaCategoriaLineaPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaCategoriaLineaPuntoVenta.setLayout(gridaBagLayoutFK_IdLineaCategoriaLineaPuntoVenta);

		gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaPuntoVenta.gridy = 0;
		gridBagConstraintsLineaPuntoVenta.gridx = 0;
		jPanelFK_IdLineaCategoriaLineaPuntoVenta.add(jLabelid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta, gridBagConstraintsLineaPuntoVenta);

		gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaPuntoVenta.gridy = 0;
		gridBagConstraintsLineaPuntoVenta.gridx = 1;
		jPanelFK_IdLineaCategoriaLineaPuntoVenta.add(jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta, gridBagConstraintsLineaPuntoVenta);

		gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaPuntoVenta.gridy = 1;
		gridBagConstraintsLineaPuntoVenta.gridx =1;
		jPanelFK_IdLineaCategoriaLineaPuntoVenta.add(jButtonFK_IdLineaCategoriaLineaPuntoVenta, gridBagConstraintsLineaPuntoVenta);

		jTabbedPaneBusquedasLineaPuntoVenta.addTab("2.-Por Linea Categoria ", jPanelFK_IdLineaCategoriaLineaPuntoVenta);
		jTabbedPaneBusquedasLineaPuntoVenta.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdLineaGrupoLineaPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdLineaGrupoLineaPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaGrupoLineaPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaGrupoLineaPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaGrupoLineaPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaGrupoLineaPuntoVenta.setLayout(gridaBagLayoutFK_IdLineaGrupoLineaPuntoVenta);

		gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaPuntoVenta.gridy = 0;
		gridBagConstraintsLineaPuntoVenta.gridx = 0;
		jPanelFK_IdLineaGrupoLineaPuntoVenta.add(jLabelid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta, gridBagConstraintsLineaPuntoVenta);

		gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaPuntoVenta.gridy = 0;
		gridBagConstraintsLineaPuntoVenta.gridx = 1;
		jPanelFK_IdLineaGrupoLineaPuntoVenta.add(jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta, gridBagConstraintsLineaPuntoVenta);

		gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaPuntoVenta.gridy = 1;
		gridBagConstraintsLineaPuntoVenta.gridx =1;
		jPanelFK_IdLineaGrupoLineaPuntoVenta.add(jButtonFK_IdLineaGrupoLineaPuntoVenta, gridBagConstraintsLineaPuntoVenta);

		jTabbedPaneBusquedasLineaPuntoVenta.addTab("3.-Por Linea Grupo ", jPanelFK_IdLineaGrupoLineaPuntoVenta);
		jTabbedPaneBusquedasLineaPuntoVenta.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdLineaMarcaLineaPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdLineaMarcaLineaPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaMarcaLineaPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaMarcaLineaPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaMarcaLineaPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaMarcaLineaPuntoVenta.setLayout(gridaBagLayoutFK_IdLineaMarcaLineaPuntoVenta);

		gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaPuntoVenta.gridy = 0;
		gridBagConstraintsLineaPuntoVenta.gridx = 0;
		jPanelFK_IdLineaMarcaLineaPuntoVenta.add(jLabelid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta, gridBagConstraintsLineaPuntoVenta);

		gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaPuntoVenta.gridy = 0;
		gridBagConstraintsLineaPuntoVenta.gridx = 1;
		jPanelFK_IdLineaMarcaLineaPuntoVenta.add(jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta, gridBagConstraintsLineaPuntoVenta);

		gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLineaPuntoVenta.gridy = 1;
		gridBagConstraintsLineaPuntoVenta.gridx =1;
		jPanelFK_IdLineaMarcaLineaPuntoVenta.add(jButtonFK_IdLineaMarcaLineaPuntoVenta, gridBagConstraintsLineaPuntoVenta);

		jTabbedPaneBusquedasLineaPuntoVenta.addTab("4.-Por Linea Marca ", jPanelFK_IdLineaMarcaLineaPuntoVenta);
		jTabbedPaneBusquedasLineaPuntoVenta.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutLineaPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutLineaPuntoVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLineaPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsLineaPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsLineaPuntoVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsLineaPuntoVenta.gridx = 0;		
		//this.gridBagConstraintsLineaPuntoVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsLineaPuntoVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsLineaPuntoVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLineaPuntoVenta.gridx = 0;		
			this.gridBagConstraintsLineaPuntoVenta.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaPuntoVenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsLineaPuntoVenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);								
		
		
		/*
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		*/		
		
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsLineaPuntoVenta.gridx =0;
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsLineaPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
				
		
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(LineaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosLineaPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosLineaPuntoVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosLineaPuntoVenta.setLayout(gridaBagLayoutBusquedasParametrosLineaPuntoVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralLineaPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralLineaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLineaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLineaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
			
			
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		
			
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsLineaPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralLineaPuntoVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoLineaPuntoVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoLineaPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoLineaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoLineaPuntoVenta.setName("jPanelReporteDinamicoLineaPuntoVenta"); 
		
		this.jPanelReporteDinamicoLineaPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoLineaPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoLineaPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoLineaPuntoVenta.setLayout(gridaBagLayoutReporteDinamicoLineaPuntoVenta);
		
		
		this.jInternalFrameReporteDinamicoLineaPuntoVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoLineaPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteLineaPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoLineaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoLineaPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoLineaPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoLineaPuntoVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoLineaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoLineaPuntoVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoLineaPuntoVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoLineaPuntoVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoLineaPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoLineaPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoLineaPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea Punto Ventas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteLineaPuntoVenta = new JLabelMe();

		this.jLabelColumnasSelectReporteLineaPuntoVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoLineaPuntoVenta.add(this.jLabelColumnasSelectReporteLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteLineaPuntoVenta = new JList<Reporte>();
		this.jListColumnasSelectReporteLineaPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteLineaPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteLineaPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteLineaPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteLineaPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteLineaPuntoVenta=new JScrollPane(this.jListColumnasSelectReporteLineaPuntoVenta);
			
			this.jScrollColumnasSelectReporteLineaPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteLineaPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteLineaPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoLineaPuntoVenta.add(this.jListColumnasSelectReporteLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		this.jPanelReporteDinamicoLineaPuntoVenta.add(this.jScrollColumnasSelectReporteLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteLineaPuntoVenta = new JLabelMe();

		this.jLabelRelacionesSelectReporteLineaPuntoVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteLineaPuntoVenta = new JList<Reporte>();
		this.jListRelacionesSelectReporteLineaPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteLineaPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteLineaPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteLineaPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteLineaPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteLineaPuntoVenta=new JScrollPane(this.jListRelacionesSelectReporteLineaPuntoVenta);
			
			this.jScrollRelacionesSelectReporteLineaPuntoVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteLineaPuntoVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteLineaPuntoVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoLineaPuntoVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoLineaPuntoVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoLineaPuntoVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoLineaPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoLineaPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoLineaPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoLineaPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoLineaPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoLineaPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoLineaPuntoVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoLineaPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoLineaPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoLineaPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoLineaPuntoVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoLineaPuntoVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLineaPuntoVenta.add(this.jLabelGenerarExcelReporteDinamicoLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoLineaPuntoVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoLineaPuntoVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoLineaPuntoVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoLineaPuntoVenta.setToolTipText("Generar EXCEL"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsLineaPuntoVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoLineaPuntoVenta.add(this.jButtonGenerarExcelReporteDinamicoLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLineaPuntoVenta.add(this.jComboBoxTiposReportesDinamicoLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoLineaPuntoVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoLineaPuntoVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoLineaPuntoVenta.add(this.jLabelTiposArchivoReporteDinamicoLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLineaPuntoVenta.add(this.jComboBoxTiposArchivosReportesDinamicoLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoLineaPuntoVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoLineaPuntoVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoLineaPuntoVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoLineaPuntoVenta.setToolTipText("Generar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLineaPuntoVenta.add(this.jButtonGenerarReporteDinamicoLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoLineaPuntoVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoLineaPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoLineaPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoLineaPuntoVenta.setToolTipText("Cancelar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoLineaPuntoVenta.add(this.jButtonCerrarReporteDinamicoLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalLineaPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoLineaPuntoVenta= new JScrollPane(jPanelReporteDinamicoLineaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoLineaPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoLineaPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoLineaPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea Punto Ventas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsLineaPuntoVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoLineaPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoLineaPuntoVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalLineaPuntoVenta);
		this.jInternalFrameReporteDinamicoLineaPuntoVenta.getContentPane().add(this.jScrollPanelReporteDinamicoLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionLineaPuntoVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionLineaPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionLineaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionLineaPuntoVenta.setName("jPanelImportacionLineaPuntoVenta"); 
		
		this.jPanelImportacionLineaPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionLineaPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionLineaPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionLineaPuntoVenta.setLayout(gridaBagLayoutImportacionLineaPuntoVenta);
		
		
		this.jInternalFrameImportacionLineaPuntoVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionLineaPuntoVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionLineaPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteLineaPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionLineaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionLineaPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionLineaPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionLineaPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionLineaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionLineaPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionLineaPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionLineaPuntoVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionLineaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionLineaPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionLineaPuntoVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionLineaPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionLineaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionLineaPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionLineaPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionLineaPuntoVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionLineaPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionLineaPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionLineaPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea Punto Ventas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionLineaPuntoVenta = new JLabelMe();

		this.jLabelArchivoImportacionLineaPuntoVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionLineaPuntoVenta.add(this.jLabelArchivoImportacionLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionLineaPuntoVenta = new JFileChooser();		
		this.jFileChooserImportacionLineaPuntoVenta.setToolTipText("ESCOGER ARCHIVO"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionLineaPuntoVenta = new JButtonMe();
		this.jButtonAbrirImportacionLineaPuntoVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionLineaPuntoVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionLineaPuntoVenta.setToolTipText("Generar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLineaPuntoVenta.add(this.jButtonAbrirImportacionLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionLineaPuntoVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionLineaPuntoVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionLineaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionLineaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionLineaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionLineaPuntoVenta.add(this.jLabelPathArchivoImportacionLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionLineaPuntoVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionLineaPuntoVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionLineaPuntoVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionLineaPuntoVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLineaPuntoVenta.add(this.jTextFieldPathArchivoImportacionLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionLineaPuntoVenta = new JButtonMe();
		this.jButtonGenerarImportacionLineaPuntoVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionLineaPuntoVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionLineaPuntoVenta.setToolTipText("Generar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLineaPuntoVenta.add(this.jButtonGenerarImportacionLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionLineaPuntoVenta = new JButtonMe();
		this.jButtonCerrarImportacionLineaPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionLineaPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionLineaPuntoVenta.setToolTipText("Cancelar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionLineaPuntoVenta.add(this.jButtonCerrarImportacionLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalLineaPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionLineaPuntoVenta= new JScrollPane(jPanelImportacionLineaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsLineaPuntoVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsLineaPuntoVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionLineaPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionLineaPuntoVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalLineaPuntoVenta);
		this.jInternalFrameImportacionLineaPuntoVenta.getContentPane().add(this.jScrollPanelImportacionLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByLineaPuntoVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByLineaPuntoVenta = new JButtonMe();
			this.jButtonAbrirOrderByLineaPuntoVenta.setText("Orden");
			this.jButtonAbrirOrderByLineaPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByLineaPuntoVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByLineaPuntoVenta";
			inputMap = this.jButtonAbrirOrderByLineaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByLineaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByLineaPuntoVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByLineaPuntoVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByLineaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByLineaPuntoVenta.setName("jPanelOrderByLineaPuntoVenta"); 
			
			this.jPanelOrderByLineaPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByLineaPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByLineaPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByLineaPuntoVenta.setLayout(gridaBagLayoutOrderByLineaPuntoVenta);
			
			
			this.jTableDatosLineaPuntoVentaOrderBy = new JTableMe();        
			this.jTableDatosLineaPuntoVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosLineaPuntoVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosLineaPuntoVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosLineaPuntoVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosLineaPuntoVentaOrderBy.setViewportView(this.jTableDatosLineaPuntoVentaOrderBy);
			this.jTableDatosLineaPuntoVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosLineaPuntoVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByLineaPuntoVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByLineaPuntoVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByLineaPuntoVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteLineaPuntoVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByLineaPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByLineaPuntoVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByLineaPuntoVenta.setTitle("Orden");
			this.jInternalFrameOrderByLineaPuntoVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByLineaPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByLineaPuntoVenta.setResizable(true);
			this.jInternalFrameOrderByLineaPuntoVenta.setClosable(true);
			this.jInternalFrameOrderByLineaPuntoVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByLineaPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByLineaPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByLineaPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByLineaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea Punto Ventas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsLineaPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsLineaPuntoVenta.ipady =150;
				
			this.jPanelOrderByLineaPuntoVenta.add(jScrollPanelDatosLineaPuntoVentaOrderBy, this.gridBagConstraintsLineaPuntoVenta);//this.jTableDatosLineaPuntoVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByLineaPuntoVenta = new JButtonMe();
			this.jButtonCerrarOrderByLineaPuntoVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByLineaPuntoVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByLineaPuntoVenta.setToolTipText("Cancelar"+" "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByLineaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaPuntoVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsLineaPuntoVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByLineaPuntoVenta.add(this.jButtonCerrarOrderByLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalLineaPuntoVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByLineaPuntoVenta= new JScrollPane(jPanelOrderByLineaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsLineaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsLineaPuntoVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsLineaPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsLineaPuntoVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByLineaPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByLineaPuntoVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalLineaPuntoVenta);
			
			this.jInternalFrameOrderByLineaPuntoVenta.getContentPane().add(this.jScrollPanelOrderByLineaPuntoVenta, this.gridBagConstraintsLineaPuntoVenta);			
		
		} else {
			this.jButtonAbrirOrderByLineaPuntoVenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//1530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.lineapuntoventaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosLineaPuntoVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosLineaPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosLineaPuntoVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosLineaPuntoVenta.getRowHeight();//LineaPuntoVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > LineaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaLineaPuntoVenta.isSelected()) {
					iHeightTable=LineaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < LineaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=LineaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > LineaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaLineaPuntoVenta.isSelected()) {
					iHeightTable=LineaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < LineaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=LineaPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosLineaPuntoVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosLineaPuntoVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosLineaPuntoVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosLineaPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosLineaPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosLineaPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByLineaPuntoVenta!=null && this.jInternalFrameOrderByLineaPuntoVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByLineaPuntoVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByLineaPuntoVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByLineaPuntoVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByLineaPuntoVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByLineaPuntoVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByLineaPuntoVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByLineaPuntoVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosLineaPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosLineaPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosLineaPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=lineapuntoventaLogic.getLineaPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=lineapuntoventas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<LineaPuntoVenta> TraerLineaPuntoVentaBeans(List<LineaPuntoVenta> lineapuntoventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(LineaPuntoVenta lineapuntoventa:lineapuntoventas) {
					
				if(!(LineaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || LineaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					lineapuntoventa.setsDetalleGeneralEntityReporte(LineaPuntoVentaConstantesFunciones.getLineaPuntoVentaDescripcion(lineapuntoventa));
										
					lineapuntoventa.setesta_activo_descripcion(LineaPuntoVentaConstantesFunciones.getesta_activoDescripcion(lineapuntoventa));	
					
						
					
				} else  {
							
					//lineapuntoventa.setsDetalleGeneralEntityReporte(lineapuntoventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//lineapuntoventabeans.add(lineapuntoventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return lineapuntoventas;
    }
	//PARA REPORTES FIN
}
