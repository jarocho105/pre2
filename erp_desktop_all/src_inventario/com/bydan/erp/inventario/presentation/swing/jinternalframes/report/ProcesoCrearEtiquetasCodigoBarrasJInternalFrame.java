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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.report.*;
import com.bydan.erp.inventario.util.report.ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
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
public class ProcesoCrearEtiquetasCodigoBarrasJInternalFrame extends ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoCrearEtiquetasCodigoBarras;
	
	protected JMenuBar jmenuBarProcesoCrearEtiquetasCodigoBarras;
	
	protected JMenu jmenuProcesoCrearEtiquetasCodigoBarras;
	protected JMenu jmenuDatosProcesoCrearEtiquetasCodigoBarras;
	protected JMenu jmenuArchivoProcesoCrearEtiquetasCodigoBarras;
	protected JMenu jmenuAccionesProcesoCrearEtiquetasCodigoBarras;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoCrearEtiquetasCodigoBarras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCrearEtiquetasCodigoBarras;	
	protected GridBagConstraints gridBagConstraintsProcesoCrearEtiquetasCodigoBarras;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoCrearEtiquetasCodigoBarrasDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

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
	
	public ProcesoCrearEtiquetasCodigoBarrasSessionBean procesocrearetiquetascodigobarrasSessionBean;
		
	
	
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrass;		
	public List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassEliminados;	
	public List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras;		
	protected JButton jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras;
	
	
	//protected JPanel jPanelOrderByProcesoCrearEtiquetasCodigoBarras;
	//public JScrollPane jScrollPanelOrderByProcesoCrearEtiquetasCodigoBarras;	
	//protected JButton jButtonCerrarOrderByProcesoCrearEtiquetasCodigoBarras;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoCrearEtiquetasCodigoBarrasLogic procesocrearetiquetascodigobarrasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras;
	public JScrollPane jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras;
	public JScrollPane jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoCrearEtiquetasCodigoBarrasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras;
	//public JScrollPane jScrollPanelImportacionProcesoCrearEtiquetasCodigoBarras;
	
	
	
	protected JPanel jPanelAccionesProcesoCrearEtiquetasCodigoBarras;
	
    protected JPanel jPanelPaginacionProcesoCrearEtiquetasCodigoBarras;
    protected JPanel jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras;
	protected JPanel jPanelParametrosReportesAccionesProcesoCrearEtiquetasCodigoBarras;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoCrearEtiquetasCodigoBarras;
	protected JPanel jPanelParametrosAuxiliar2ProcesoCrearEtiquetasCodigoBarras;
	protected JPanel jPanelParametrosAuxiliar3ProcesoCrearEtiquetasCodigoBarras;
	protected JPanel jPanelParametrosAuxiliar4ProcesoCrearEtiquetasCodigoBarras;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoCrearEtiquetasCodigoBarras;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras;
	//protected JPanel jPanelImportacionProcesoCrearEtiquetasCodigoBarras;
	
	
	public JTable jTableDatosProcesoCrearEtiquetasCodigoBarras;
	
	
	
	//public JTable jTableDatosProcesoCrearEtiquetasCodigoBarrasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonDuplicarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonCopiarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonVerFormProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonNuevoRelacionesProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonModificarProcesoCrearEtiquetasCodigoBarras;
	
    protected JButton jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonCerrarProcesoCrearEtiquetasCodigoBarras;
	
	
	protected JButton jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras;
	
	
	protected JButton jButtonAnterioresProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonSiguientesProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoCrearEtiquetasCodigoBarras;
	//protected JButton jButtonCerrarReporteDinamicoProcesoCrearEtiquetasCodigoBarras;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoCrearEtiquetasCodigoBarras;
	//protected JButton jButtonGenerarImportacionProcesoCrearEtiquetasCodigoBarras;
	//protected JButton jButtonCerrarImportacionProcesoCrearEtiquetasCodigoBarras;
	//protected JFileChooser jFileChooserImportacionProcesoCrearEtiquetasCodigoBarras;
	//protected File fileImportacionProcesoCrearEtiquetasCodigoBarras;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonDuplicarToolBarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasCodigoBarras;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonCopiarToolBarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonVerFormToolBarProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonCerrarToolBarProcesoCrearEtiquetasCodigoBarras;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonProcesarInformacionToolBarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonAnterioresToolBarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonSiguientesToolBarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras;
	protected JButton jButtonAbrirOrderByToolBarProcesoCrearEtiquetasCodigoBarras;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemDuplicarProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoCrearEtiquetasCodigoBarras;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemCopiarProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemVerFormProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemCerrarProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasCodigoBarras;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemProcesarInformacionProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemAnterioresProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemSiguientesProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemAbrirOrderByProcesoCrearEtiquetasCodigoBarras;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCrearEtiquetasCodigoBarras;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCrearEtiquetasCodigoBarras;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras;
	protected JCheckBox jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasCodigoBarras;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasCodigoBarras;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras;
	protected JTextField jTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarras;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras;
	//public JList<Reporte> jListColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras;
	//public JScrollPane jScrollColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoCrearEtiquetasCodigoBarras;
	
		
	//public JLabel jLabelArchivoImportacionProcesoCrearEtiquetasCodigoBarras;	
	//public JLabel jLabelPathArchivoImportacionProcesoCrearEtiquetasCodigoBarras;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoCrearEtiquetasCodigoBarras;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoCrearEtiquetasCodigoBarras;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasCodigoBarras;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoCrearEtiquetasCodigoBarras;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoCrearEtiquetasCodigoBarras;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoCrearEtiquetasCodigoBarras;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoCrearEtiquetasCodigoBarras;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras;
	public JPanel jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	
	public JPanel jPanelid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
	public JButton jButtonid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
	public JButton jButtonid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
	public JButton jButtonid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
	public JButton jButtonid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	public JLabel jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras;
	public JButton jButtonid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarrasUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarrasBusqueda= new JButtonMe();

	
	
	
	
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
	public ProcesoCrearEtiquetasCodigoBarrasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoCrearEtiquetasCodigoBarras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCrearEtiquetasCodigoBarrasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCrearEtiquetasCodigoBarras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCrearEtiquetasCodigoBarrasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCrearEtiquetasCodigoBarras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCrearEtiquetasCodigoBarrasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCrearEtiquetasCodigoBarras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras)	{
		this.jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras = jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras;
	}
	
	public JButton getjButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras() {
		return this.jButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras)	{
		this.jButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras = jButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras() {
		return this.jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras;
	}
	
	
	public List<ProcesoCrearEtiquetasCodigoBarras> getprocesocrearetiquetascodigobarrass() {
		return this.procesocrearetiquetascodigobarrass;
	}

	public void setprocesocrearetiquetascodigobarrass(List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrass) {
		this.procesocrearetiquetascodigobarrass = procesocrearetiquetascodigobarrass;
	}
	
	public List<ProcesoCrearEtiquetasCodigoBarras> getprocesocrearetiquetascodigobarrassAux() {
		return this.procesocrearetiquetascodigobarrassAux;
	}

	public void setprocesocrearetiquetascodigobarrassAux(List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassAux) {
		this.procesocrearetiquetascodigobarrassAux = procesocrearetiquetascodigobarrassAux;
	}
	
	public List<ProcesoCrearEtiquetasCodigoBarras> getprocesocrearetiquetascodigobarrassEliminados() {
		return this.procesocrearetiquetascodigobarrassEliminados;
	}

	public void setProcesoCrearEtiquetasCodigoBarrassEliminados(List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassEliminados) {
		this.procesocrearetiquetascodigobarrassEliminados = procesocrearetiquetascodigobarrassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras() {
		return jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras(
			JComboBox jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras) {
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras = jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoCrearEtiquetasCodigoBarras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoCrearEtiquetasCodigoBarras.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarras() {
		return jTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarras;
	}

	public void setjTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarras(
			JTextField jTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarras) {
		this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarras = jTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarras;
	}

	public void setBorderResaltarValorCampoGeneralProcesoCrearEtiquetasCodigoBarras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasCodigoBarras.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarras .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras() {
		return this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras;
	}

	public void setjCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras(
			JCheckBox jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras) {
		this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras = jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras;
	}

	public void setBorderResaltarSeleccionarTodosProcesoCrearEtiquetasCodigoBarras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasCodigoBarras.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras() {
		return this.jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras;
	}

	public void setjCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras(
			JCheckBox jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras) {
		this.jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras = jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras;
	}
	
	public void setBorderResaltarSeleccionadosProcesoCrearEtiquetasCodigoBarras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasCodigoBarras.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras() {
		return this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras(
			JComboBox jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras) {
		this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras = jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasCodigoBarras.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras() {
		return this.jComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras(
			JComboBox jComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras) {
		this.jComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras = jComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoCrearEtiquetasCodigoBarras() {
	//	return jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasCodigoBarras;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoCrearEtiquetasCodigoBarras(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasCodigoBarras) {
	//	this.jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasCodigoBarras = jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasCodigoBarras;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasCodigoBarras() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasCodigoBarras;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasCodigoBarras(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasCodigoBarras) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasCodigoBarras = jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasCodigoBarras;
	//}
	
	public void setBorderResaltarTiposReportesProcesoCrearEtiquetasCodigoBarras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasCodigoBarras.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras() {
		return this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras(
			JComboBox jComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras) {
		this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras = jComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasCodigoBarras.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras() {
		return this.jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras(
			JComboBox jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras) {
		this.jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras = jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoCrearEtiquetasCodigoBarras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasCodigoBarras.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras() {
		return this.jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras() {
		return this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras(
			JComboBox jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras) {
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras = jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras(
			JComboBox jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras) {
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras = jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoCrearEtiquetasCodigoBarras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasCodigoBarras.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoCrearEtiquetasCodigoBarras() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoCrearEtiquetasCodigoBarras.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras() {
	//	return jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras) {
	//	this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras = jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoCrearEtiquetasCodigoBarras.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras .setBorder(borderResaltar);		
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
		this.procesocrearetiquetascodigobarrasSessionBean=new ProcesoCrearEtiquetasCodigoBarrasSessionBean();
		
		this.procesocrearetiquetascodigobarrasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocrearetiquetascodigobarrasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Crear Etiquetas Codigo Barras MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoCrearEtiquetasCodigoBarras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoCrearEtiquetasCodigoBarras= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoCrearEtiquetasCodigoBarras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarProcesoCrearEtiquetasCodigoBarras,
							"nuevo","nuevo","Nuevo"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarProcesoCrearEtiquetasCodigoBarras,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCrearEtiquetasCodigoBarras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarProcesoCrearEtiquetasCodigoBarras,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoCrearEtiquetasCodigoBarras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarProcesoCrearEtiquetasCodigoBarras,
							"duplicar","duplicar","Duplicar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoCrearEtiquetasCodigoBarras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarProcesoCrearEtiquetasCodigoBarras,
							"copiar","copiar","Copiar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoCrearEtiquetasCodigoBarras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarProcesoCrearEtiquetasCodigoBarras,
							"ver_form","ver_form","Ver"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoCrearEtiquetasCodigoBarras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarProcesoCrearEtiquetasCodigoBarras,
							"recargar","recargar","Buscar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoCrearEtiquetasCodigoBarras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarProcesoCrearEtiquetasCodigoBarras,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoCrearEtiquetasCodigoBarras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarProcesoCrearEtiquetasCodigoBarras,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoCrearEtiquetasCodigoBarras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarProcesoCrearEtiquetasCodigoBarras,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasCodigoBarras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarProcesoCrearEtiquetasCodigoBarras,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCrearEtiquetasCodigoBarras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarProcesoCrearEtiquetasCodigoBarras,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoCrearEtiquetasCodigoBarras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarProcesoCrearEtiquetasCodigoBarras,
							"cerrar","cerrar","Salir"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasCodigoBarras=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasCodigoBarras;
			
				this.jButtonProcesarInformacionToolBarProcesoCrearEtiquetasCodigoBarras=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoCrearEtiquetasCodigoBarras;
				
		//protected JButton jButtonModificarToolBarProcesoCrearEtiquetasCodigoBarras;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoCrearEtiquetasCodigoBarras=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoCrearEtiquetasCodigoBarras=new JMenuMe("General");
		this.jmenuArchivoProcesoCrearEtiquetasCodigoBarras=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoCrearEtiquetasCodigoBarras=new JMenuMe("Acciones");
		this.jmenuDatosProcesoCrearEtiquetasCodigoBarras=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCrearEtiquetasCodigoBarras.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCrearEtiquetasCodigoBarras,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoCrearEtiquetasCodigoBarras.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoCrearEtiquetasCodigoBarras,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasCodigoBarras.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasCodigoBarras,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoCrearEtiquetasCodigoBarras.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoCrearEtiquetasCodigoBarras,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoCrearEtiquetasCodigoBarras.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoCrearEtiquetasCodigoBarras,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCrearEtiquetasCodigoBarras.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCrearEtiquetasCodigoBarras,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoCrearEtiquetasCodigoBarras.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoCrearEtiquetasCodigoBarras,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoCrearEtiquetasCodigoBarras.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoCrearEtiquetasCodigoBarras,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoCrearEtiquetasCodigoBarras.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoCrearEtiquetasCodigoBarras,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoCrearEtiquetasCodigoBarras.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoCrearEtiquetasCodigoBarras,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoCrearEtiquetasCodigoBarras.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoCrearEtiquetasCodigoBarras,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCrearEtiquetasCodigoBarras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCrearEtiquetasCodigoBarras,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoCrearEtiquetasCodigoBarras.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoCrearEtiquetasCodigoBarras,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasCodigoBarras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasCodigoBarras,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemCerrarProcesoCrearEtiquetasCodigoBarras);
			
			this.jmenuAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemNuevoProcesoCrearEtiquetasCodigoBarras);
			this.jmenuAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras);
			this.jmenuAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasCodigoBarras);
			this.jmenuAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras);		
			this.jmenuAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemDuplicarProcesoCrearEtiquetasCodigoBarras);		
			this.jmenuAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemCopiarProcesoCrearEtiquetasCodigoBarras);		
			this.jmenuAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemVerFormProcesoCrearEtiquetasCodigoBarras);		
			
			this.jmenuDatosProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemRecargarInformacionProcesoCrearEtiquetasCodigoBarras);				
			this.jmenuDatosProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemAnterioresProcesoCrearEtiquetasCodigoBarras);				
			this.jmenuDatosProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemSiguientesProcesoCrearEtiquetasCodigoBarras);				
			this.jmenuDatosProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemAbrirOrderByProcesoCrearEtiquetasCodigoBarras);				
			this.jmenuDatosProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemMostrarOcultarProcesoCrearEtiquetasCodigoBarras);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jMenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoCrearEtiquetasCodigoBarras.add(this.jmenuArchivoProcesoCrearEtiquetasCodigoBarras);		
			this.jmenuBarProcesoCrearEtiquetasCodigoBarras.add(this.jmenuAccionesProcesoCrearEtiquetasCodigoBarras);		
			this.jmenuBarProcesoCrearEtiquetasCodigoBarras.add(this.jmenuDatosProcesoCrearEtiquetasCodigoBarras);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoCrearEtiquetasCodigoBarras);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoCrearEtiquetasCodigoBarras() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");
		this.jButtonBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras= new JButtonMe();
		this.jButtonBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setText("Buscar");
		this.jButtonBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setToolTipText("Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras,"buscar_button","Buscar Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		jLabelid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setText("Bodega :");
		jLabelid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setToolTipText("Bodega");
		jLabelid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras= new JComboBoxMe();
		jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		jLabelid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setText("Producto :");
		jLabelid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setToolTipText("Producto");
		jLabelid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras= new JComboBoxMe();
		jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		jLabelid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setText("Linea :");
		jLabelid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setToolTipText("Linea");
		jLabelid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras= new JComboBoxMe();
		jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setText("Linea Grupo :");
		jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras= new JComboBoxMe();
		jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setText("Linea Categoria :");
		jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras= new JComboBoxMe();
		jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setText("Linea Marca :");
		jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setToolTipText("Linea Marca");
		jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras= new JComboBoxMe();
		jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));
		this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,125)));

		//this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoCrearEtiquetasCodigoBarras = new ProcesoCrearEtiquetasCodigoBarrasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Crear Etiquetas Codigo Barras DATOS");
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras = new ProcesoCrearEtiquetasCodigoBarrasDetalleFormJInternalFrame(jDesktopPane,this.procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones(),this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras = null;//new ProcesoCrearEtiquetasCodigoBarrasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCrearEtiquetasCodigoBarras= new GridBagLayout();
		
		
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras = new JTableMe();      
		
		String sToolTipProcesoCrearEtiquetasCodigoBarras="";
		sToolTipProcesoCrearEtiquetasCodigoBarras=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCrearEtiquetasCodigoBarras+="(Inventario.ProcesoCrearEtiquetasCodigoBarras)";
		}
		
		if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCrearEtiquetasCodigoBarras+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setToolTipText(sToolTipProcesoCrearEtiquetasCodigoBarras);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoCrearEtiquetasCodigoBarras);
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setRowSelectionAllowed(true);
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoCrearEtiquetasCodigoBarras,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		this.jButtonDuplicarProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		this.jButtonCopiarProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		this.jButtonVerFormProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Crear Etiquetas Codigo Barras";
		
		if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Crear Etiquetas Codigo Barrases" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras=new ReporteDinamicoJInternalFrame(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoCrearEtiquetasCodigoBarras();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras=new ImportacionJInternalFrame(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoCrearEtiquetasCodigoBarras();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras.setText("Orden");
		this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras,false,this);
			
			//this.cargarOrderByProcesoCrearEtiquetasCodigoBarras(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras,true,this);
			
			//this.cargarOrderByProcesoCrearEtiquetasCodigoBarras(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras.setText("Nuevo");
		this.jButtonDuplicarProcesoCrearEtiquetasCodigoBarras.setText("Duplicar");
		this.jButtonCopiarProcesoCrearEtiquetasCodigoBarras.setText("Copiar");
		this.jButtonVerFormProcesoCrearEtiquetasCodigoBarras.setText("Ver");
		this.jButtonNuevoRelacionesProcesoCrearEtiquetasCodigoBarras.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.setText("Guardar");
		this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras,"nuevo_button","Nuevo",this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoCrearEtiquetasCodigoBarras,"duplicar_button","Duplicar",this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoCrearEtiquetasCodigoBarras,"copiar_button","Copiar",this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoCrearEtiquetasCodigoBarras,"ver_form","Ver",this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoCrearEtiquetasCodigoBarras,"nuevorelaciones_button","Nuevo Rel",this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras,"guardarcambiostabla_button","Guardar",this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras,"cerrar_button","Salir",this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras.setToolTipText("Nuevo"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoCrearEtiquetasCodigoBarras.setToolTipText("Duplicar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoCrearEtiquetasCodigoBarras.setToolTipText("Copiar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoCrearEtiquetasCodigoBarras.setToolTipText("Ver"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoCrearEtiquetasCodigoBarras.setToolTipText("Nuevo Rel"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.setToolTipText("Guardar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras.setToolTipText("Salir"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCrearEtiquetasCodigoBarras"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonDuplicarProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoCrearEtiquetasCodigoBarras"));
		
		//COPIAR
		sMapKey = "CopiarProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonCopiarProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoCrearEtiquetasCodigoBarras"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonVerFormProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoCrearEtiquetasCodigoBarras"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonNuevoRelacionesProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoCrearEtiquetasCodigoBarras"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonModificarProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoCrearEtiquetasCodigoBarras"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCrearEtiquetasCodigoBarras"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoCrearEtiquetasCodigoBarras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoCrearEtiquetasCodigoBarras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoCrearEtiquetasCodigoBarras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoCrearEtiquetasCodigoBarras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoCrearEtiquetasCodigoBarras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoCrearEtiquetasCodigoBarras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.setName("jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras"); 
		
		this.jPanelParametrosReportesAccionesProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoCrearEtiquetasCodigoBarras.setName("jPanelParametrosReportesAccionesProcesoCrearEtiquetasCodigoBarras"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		this.jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras.setText("Buscar");
		this.jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras.setToolTipText("Buscar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		this.jButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras.setText("Procesar");
		this.jButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras.setToolTipText("Procesar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarras=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoCrearEtiquetasCodigoBarras = new JLabelMe();
		
		this.jLabelAccionesProcesoCrearEtiquetasCodigoBarras.setText("Acciones");		
		this.jLabelAccionesProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasCodigoBarras = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasCodigoBarras.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasCodigoBarras.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasCodigoBarras = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasCodigoBarras.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasCodigoBarras.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		//this.jButtonAnterioresProcesoCrearEtiquetasCodigoBarras.setText("<<");
        this.jButtonAnterioresProcesoCrearEtiquetasCodigoBarras.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoCrearEtiquetasCodigoBarras,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		//this.jButtonSiguientesProcesoCrearEtiquetasCodigoBarras.setText(">>");
        this.jButtonSiguientesProcesoCrearEtiquetasCodigoBarras.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoCrearEtiquetasCodigoBarras,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras,"nuevoguardarcambios_button","Nue",this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoCrearEtiquetasCodigoBarras"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonSiguientesProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoCrearEtiquetasCodigoBarras"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonAnterioresProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoCrearEtiquetasCodigoBarras"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoCrearEtiquetasCodigoBarras();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(this.getWidth(),ProcesoCrearEtiquetasCodigoBarrasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCrearEtiquetasCodigoBarrasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(this.getWidth(),ProcesoCrearEtiquetasCodigoBarrasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCrearEtiquetasCodigoBarrasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(this.getWidth(),ProcesoCrearEtiquetasCodigoBarrasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoCrearEtiquetasCodigoBarrasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();

			this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagLayoutPaginacionProcesoCrearEtiquetasCodigoBarras);						
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.add(this.jButtonAnterioresProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
					
						
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
			
			this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.add(this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
						
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
			this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.add(this.jButtonSiguientesProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 1;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.add(this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
						
			
			
			if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
				this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 1;
				this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.add(this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
			}
			
			
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 1;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.add(this.jButtonDuplicarProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 1;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.add(this.jButtonCopiarProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 1;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.add(this.jButtonVerFormProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 1;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.add(this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		
		
		
		this.jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagParametrosReportesProcesoCrearEtiquetasCodigoBarras);
			this.jPanelParametrosReportesAccionesProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagParametrosReportesAccionesProcesoCrearEtiquetasCodigoBarras);
			
			
			this.jPanelParametrosAuxiliar1ProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagParametrosAuxiliar1ProcesoCrearEtiquetasCodigoBarras);
			this.jPanelParametrosAuxiliar2ProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagParametrosAuxiliar2ProcesoCrearEtiquetasCodigoBarras);
			this.jPanelParametrosAuxiliar3ProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagParametrosAuxiliar3ProcesoCrearEtiquetasCodigoBarras);
			this.jPanelParametrosAuxiliar4ProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagParametrosAuxiliar4ProcesoCrearEtiquetasCodigoBarras);
			//this.jPanelParametrosAuxiliar5ProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagParametrosAuxiliar2ProcesoCrearEtiquetasCodigoBarras);			
			
			
			
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.add(this.jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCrearEtiquetasCodigoBarras.add(this.jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCrearEtiquetasCodigoBarras.add(this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoCrearEtiquetasCodigoBarras.add(this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.add(this.jPanelParametrosAuxiliar1ProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoCrearEtiquetasCodigoBarras.add(this.jComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);																		
			
			
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProcesoCrearEtiquetasCodigoBarras.add(this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.add(this.jPanelParametrosAuxiliar4ProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.add(this.jComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.add(this.jCheckBoxGenerarReporteProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.add(this.jPanelParametrosAuxiliar2ProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.add(this.jLabelAccionesProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
				this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.add(this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.add(this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);			
			
			
			/*
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.add(this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.add(this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCrearEtiquetasCodigoBarras.add(this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);															
				
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCrearEtiquetasCodigoBarras.add(this.jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);															
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoCrearEtiquetasCodigoBarras.add(this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.add(this.jPanelParametrosAuxiliar3ProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.add(this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();

			this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagLayoutDatosProcesoCrearEtiquetasCodigoBarras);
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
			
			this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.add(this.jTableDatosProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setViewportView(this.jTableDatosProcesoCrearEtiquetasCodigoBarras);
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setFillsViewportHeight(true);
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoCrearEtiquetasCodigoBarras= new GridBagLayout();
		this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagLayoutAccionesProcesoCrearEtiquetasCodigoBarras);
		
		
		/*	
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
			
		this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras.add(this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagLayoutBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);

		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
		jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.add(jLabelid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras, gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);

		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 0;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
		jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.add(jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras, gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 1;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
		jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.add(jLabelid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras, gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);

		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 1;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
		jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.add(jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras, gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 2;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
		jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.add(jLabelid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras, gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);

		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 2;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
		jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.add(jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras, gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 3;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
		jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.add(jLabelid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras, gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);

		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 3;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
		jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.add(jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras, gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 4;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
		jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.add(jLabelid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras, gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);

		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 4;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
		jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.add(jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras, gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 5;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
		jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.add(jLabelid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras, gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);

		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 5;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 1;
		jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.add(jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras, gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);

		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = 6;
		gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =1;
		jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.add(jButtonBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras, gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);

		jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.addTab("1.-Por Bodega Por Producto Por Linea Por Linea Grupo Por Linea Categoria Por Linea Marca ", jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);
		jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCrearEtiquetasCodigoBarras);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;		
			//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;		
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;		
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);								
		
		
		/*
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		*/		
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =0;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
				
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoCrearEtiquetasCodigoBarras= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagLayoutBusquedasParametrosProcesoCrearEtiquetasCodigoBarras);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
			
			
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		
			
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProcesoCrearEtiquetasCodigoBarras;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoCrearEtiquetasCodigoBarras() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setName("jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras"); 
		
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagLayoutReporteDinamicoProcesoCrearEtiquetasCodigoBarras);
		
		
		this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Crear Etiquetas Codigo Barrases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jLabelColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras=new JScrollPane(this.jListColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras);
			
			this.jScrollColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jListColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jScrollColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras=new JScrollPane(this.jListRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras);
			
			this.jScrollRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasCodigoBarras = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasCodigoBarras = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasCodigoBarras.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasCodigoBarras = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasCodigoBarras.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras = new JLabelMe();

		this.jLabelConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jLabelConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jCheckBoxConGraficoDinamicoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProcesoCrearEtiquetasCodigoBarras = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProcesoCrearEtiquetasCodigoBarras.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jLabelColumnaCategoriaGraficoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasCodigoBarras = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasCodigoBarras.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasCodigoBarras.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProcesoCrearEtiquetasCodigoBarras = new JLabelMe();

		this.jLabelColumnaCategoriaValorProcesoCrearEtiquetasCodigoBarras.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jLabelColumnaCategoriaValorProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProcesoCrearEtiquetasCodigoBarras = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProcesoCrearEtiquetasCodigoBarras.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProcesoCrearEtiquetasCodigoBarras.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jComboBoxColumnaCategoriaValorProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras = new JLabelMe();

		this.jLabelColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jLabelColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras = new JList<Reporte>();
		this.jListColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras=new JScrollPane(this.jListColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras);
			
			this.jScrollColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jListColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jScrollColumnasValoresGraficoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProcesoCrearEtiquetasCodigoBarras = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProcesoCrearEtiquetasCodigoBarras.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jLabelTiposGraficosReportesDinamicoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProcesoCrearEtiquetasCodigoBarras = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoCrearEtiquetasCodigoBarras.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProcesoCrearEtiquetasCodigoBarras.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jComboBoxTiposGraficosReportesDinamicoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jLabelGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setToolTipText("Generar EXCEL"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jComboBoxTiposReportesDinamicoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoCrearEtiquetasCodigoBarras = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jLabelTiposArchivoReporteDinamicoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoCrearEtiquetasCodigoBarras,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setToolTipText("Generar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jButtonGenerarReporteDinamicoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoCrearEtiquetasCodigoBarras,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setToolTipText("Cancelar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.add(this.jButtonCerrarReporteDinamicoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras= new JScrollPane(jPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Crear Etiquetas Codigo Barrases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoCrearEtiquetasCodigoBarras() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoCrearEtiquetasCodigoBarras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoCrearEtiquetasCodigoBarras.setName("jPanelImportacionProcesoCrearEtiquetasCodigoBarras"); 
		
		this.jPanelImportacionProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagLayoutImportacionProcesoCrearEtiquetasCodigoBarras);
		
		
		this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoCrearEtiquetasCodigoBarras = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setResizable(true);
	    this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setClosable(true);
	    this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setResizable(true);
	    this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setClosable(true);
	    this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Crear Etiquetas Codigo Barrases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoCrearEtiquetasCodigoBarras = new JLabelMe();

		this.jLabelArchivoImportacionProcesoCrearEtiquetasCodigoBarras.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCrearEtiquetasCodigoBarras.add(this.jLabelArchivoImportacionProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoCrearEtiquetasCodigoBarras = new JFileChooser();		
		this.jFileChooserImportacionProcesoCrearEtiquetasCodigoBarras.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		this.jButtonAbrirImportacionProcesoCrearEtiquetasCodigoBarras.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoCrearEtiquetasCodigoBarras,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoCrearEtiquetasCodigoBarras.setToolTipText("Generar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCrearEtiquetasCodigoBarras.add(this.jButtonAbrirImportacionProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoCrearEtiquetasCodigoBarras = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoCrearEtiquetasCodigoBarras.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoCrearEtiquetasCodigoBarras.add(this.jLabelPathArchivoImportacionProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoCrearEtiquetasCodigoBarras=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCrearEtiquetasCodigoBarras.add(this.jTextFieldPathArchivoImportacionProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		this.jButtonGenerarImportacionProcesoCrearEtiquetasCodigoBarras.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoCrearEtiquetasCodigoBarras,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoCrearEtiquetasCodigoBarras.setToolTipText("Generar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCrearEtiquetasCodigoBarras.add(this.jButtonGenerarImportacionProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
		this.jButtonCerrarImportacionProcesoCrearEtiquetasCodigoBarras.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoCrearEtiquetasCodigoBarras,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoCrearEtiquetasCodigoBarras.setToolTipText("Cancelar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoCrearEtiquetasCodigoBarras.add(this.jButtonCerrarImportacionProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoCrearEtiquetasCodigoBarras= new JScrollPane(jPanelImportacionProcesoCrearEtiquetasCodigoBarras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.getContentPane().add(this.jScrollPanelImportacionProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoCrearEtiquetasCodigoBarras(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
			this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras.setText("Orden");
			this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoCrearEtiquetasCodigoBarras";
			inputMap = this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoCrearEtiquetasCodigoBarras"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoCrearEtiquetasCodigoBarras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoCrearEtiquetasCodigoBarras.setName("jPanelOrderByProcesoCrearEtiquetasCodigoBarras"); 
			
			this.jPanelOrderByProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoCrearEtiquetasCodigoBarras.setLayout(gridaBagLayoutOrderByProcesoCrearEtiquetasCodigoBarras);
			
			
			this.jTableDatosProcesoCrearEtiquetasCodigoBarrasOrderBy = new JTableMe();        
			this.jTableDatosProcesoCrearEtiquetasCodigoBarrasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoCrearEtiquetasCodigoBarrasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarrasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarrasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarrasOrderBy.setViewportView(this.jTableDatosProcesoCrearEtiquetasCodigoBarrasOrderBy);
			this.jTableDatosProcesoCrearEtiquetasCodigoBarrasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoCrearEtiquetasCodigoBarrasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoCrearEtiquetasCodigoBarras = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoCrearEtiquetasCodigoBarras= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.setTitle("Orden");
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.setResizable(true);
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.setClosable(true);
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoCrearEtiquetasCodigoBarras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Crear Etiquetas Codigo Barrases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.ipady =150;
				
			this.jPanelOrderByProcesoCrearEtiquetasCodigoBarras.add(jScrollPanelDatosProcesoCrearEtiquetasCodigoBarrasOrderBy, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);//this.jTableDatosProcesoCrearEtiquetasCodigoBarrasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
			this.jButtonCerrarOrderByProcesoCrearEtiquetasCodigoBarras.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoCrearEtiquetasCodigoBarras,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoCrearEtiquetasCodigoBarras.setToolTipText("Cancelar"+" "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoCrearEtiquetasCodigoBarras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoCrearEtiquetasCodigoBarras.add(this.jButtonCerrarOrderByProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoCrearEtiquetasCodigoBarras = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoCrearEtiquetasCodigoBarras= new JScrollPane(jPanelOrderByProcesoCrearEtiquetasCodigoBarras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras = new GridBagConstraints();
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoCrearEtiquetasCodigoBarras);
			
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getContentPane().add(this.jScrollPanelOrderByProcesoCrearEtiquetasCodigoBarras, this.gridBagConstraintsProcesoCrearEtiquetasCodigoBarras);			
		
		} else {
			this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowHeight();//ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasCodigoBarras.isSelected()) {
					iHeightTable=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoCrearEtiquetasCodigoBarras.isSelected()) {
					iHeightTable=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjTableDatosOrderBy()!=null) {
			//if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocrearetiquetascodigobarrass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoCrearEtiquetasCodigoBarras> TraerProcesoCrearEtiquetasCodigoBarrasBeans(List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrass,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:procesocrearetiquetascodigobarrass) {
					
				if(!(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesocrearetiquetascodigobarras.setsDetalleGeneralEntityReporte(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getProcesoCrearEtiquetasCodigoBarrasDescripcion(procesocrearetiquetascodigobarras));
										
						
					
						
					
				} else  {
							
					//procesocrearetiquetascodigobarras.setsDetalleGeneralEntityReporte(procesocrearetiquetascodigobarras.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesocrearetiquetascodigobarrasbeans.add(procesocrearetiquetascodigobarrasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesocrearetiquetascodigobarrass;
    }
	//PARA REPORTES FIN
}
