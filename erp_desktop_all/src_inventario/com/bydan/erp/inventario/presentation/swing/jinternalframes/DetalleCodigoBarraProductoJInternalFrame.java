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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.DetalleCodigoBarraProductoConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class DetalleCodigoBarraProductoJInternalFrame extends DetalleCodigoBarraProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleCodigoBarraProducto;
	
	protected JMenuBar jmenuBarDetalleCodigoBarraProducto;
	
	protected JMenu jmenuDetalleCodigoBarraProducto;
	protected JMenu jmenuDatosDetalleCodigoBarraProducto;
	protected JMenu jmenuArchivoDetalleCodigoBarraProducto;
	protected JMenu jmenuAccionesDetalleCodigoBarraProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleCodigoBarraProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleCodigoBarraProducto;	
	protected GridBagConstraints gridBagConstraintsDetalleCodigoBarraProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleCodigoBarraProductoDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleCodigoBarraProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleCodigoBarraProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleCodigoBarraProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public DetalleCodigoBarraProductoSessionBean detallecodigobarraproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleCodigoBarraProducto> detallecodigobarraproductos;		
	public List<DetalleCodigoBarraProducto> detallecodigobarraproductosEliminados;	
	public List<DetalleCodigoBarraProducto> detallecodigobarraproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleCodigoBarraProducto;		
	protected JButton jButtonAbrirOrderByDetalleCodigoBarraProducto;
	
	
	//protected JPanel jPanelOrderByDetalleCodigoBarraProducto;
	//public JScrollPane jScrollPanelOrderByDetalleCodigoBarraProducto;	
	//protected JButton jButtonCerrarOrderByDetalleCodigoBarraProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleCodigoBarraProductoLogic detallecodigobarraproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleCodigoBarraProducto;
	public JScrollPane jScrollPanelDatosEdicionDetalleCodigoBarraProducto;
	public JScrollPane jScrollPanelDatosGeneralDetalleCodigoBarraProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleCodigoBarraProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleCodigoBarraProducto;
	//public JScrollPane jScrollPanelImportacionDetalleCodigoBarraProducto;
	
	
	
	protected JPanel jPanelAccionesDetalleCodigoBarraProducto;
	
    protected JPanel jPanelPaginacionDetalleCodigoBarraProducto;
    protected JPanel jPanelParametrosReportesDetalleCodigoBarraProducto;
	protected JPanel jPanelParametrosReportesAccionesDetalleCodigoBarraProducto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleCodigoBarraProducto;
	protected JPanel jPanelParametrosAuxiliar2DetalleCodigoBarraProducto;
	protected JPanel jPanelParametrosAuxiliar3DetalleCodigoBarraProducto;
	protected JPanel jPanelParametrosAuxiliar4DetalleCodigoBarraProducto;
	//protected JPanel jPanelParametrosAuxiliar5DetalleCodigoBarraProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleCodigoBarraProducto;
	//protected JPanel jPanelImportacionDetalleCodigoBarraProducto;
	
	
	public JTable jTableDatosDetalleCodigoBarraProducto;
	
	
	
	//public JTable jTableDatosDetalleCodigoBarraProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleCodigoBarraProducto;
	protected JButton jButtonDuplicarDetalleCodigoBarraProducto;
	protected JButton jButtonCopiarDetalleCodigoBarraProducto;
	protected JButton jButtonVerFormDetalleCodigoBarraProducto;
	protected JButton jButtonNuevoRelacionesDetalleCodigoBarraProducto;
	protected JButton jButtonModificarDetalleCodigoBarraProducto;
	
    protected JButton jButtonGuardarCambiosTablaDetalleCodigoBarraProducto;
	protected JButton jButtonCerrarDetalleCodigoBarraProducto;
	
	
	protected JButton jButtonRecargarInformacionDetalleCodigoBarraProducto;
	protected JButton jButtonProcesarInformacionDetalleCodigoBarraProducto;
	
	
	protected JButton jButtonAnterioresDetalleCodigoBarraProducto;
	protected JButton jButtonSiguientesDetalleCodigoBarraProducto;
	protected JButton jButtonNuevoGuardarCambiosDetalleCodigoBarraProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleCodigoBarraProducto;
	//protected JButton jButtonCerrarReporteDinamicoDetalleCodigoBarraProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleCodigoBarraProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleCodigoBarraProducto;
	//protected JButton jButtonGenerarImportacionDetalleCodigoBarraProducto;
	//protected JButton jButtonCerrarImportacionDetalleCodigoBarraProducto;
	//protected JFileChooser jFileChooserImportacionDetalleCodigoBarraProducto;
	//protected File fileImportacionDetalleCodigoBarraProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleCodigoBarraProducto;
	protected JButton jButtonDuplicarToolBarDetalleCodigoBarraProducto;
	protected JButton jButtonNuevoRelacionesToolBarDetalleCodigoBarraProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleCodigoBarraProducto;
	protected JButton jButtonCopiarToolBarDetalleCodigoBarraProducto;
	protected JButton jButtonVerFormToolBarDetalleCodigoBarraProducto;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleCodigoBarraProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleCodigoBarraProducto;
	protected JButton jButtonCerrarToolBarDetalleCodigoBarraProducto;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleCodigoBarraProducto;
	protected JButton jButtonProcesarInformacionToolBarDetalleCodigoBarraProducto;
	protected JButton jButtonAnterioresToolBarDetalleCodigoBarraProducto;
	protected JButton jButtonSiguientesToolBarDetalleCodigoBarraProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleCodigoBarraProducto;
	protected JButton jButtonAbrirOrderByToolBarDetalleCodigoBarraProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemDuplicarDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleCodigoBarraProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemCopiarDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemVerFormDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemCerrarDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemDetalleCerrarDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleCodigoBarraProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemProcesarInformacionDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemAnterioresDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemSiguientesDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemAbrirOrderByDetalleCodigoBarraProducto;
	protected JMenuItem jMenuItemMostrarOcultarDetalleCodigoBarraProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleCodigoBarraProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleCodigoBarraProducto;
	protected JCheckBox jCheckBoxSeleccionadosDetalleCodigoBarraProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleCodigoBarraProducto;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleCodigoBarraProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleCodigoBarraProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleCodigoBarraProducto;
	protected JTextField jTextFieldValorCampoGeneralDetalleCodigoBarraProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleCodigoBarraProducto;
	//public JList<Reporte> jListColumnasSelectReporteDetalleCodigoBarraProducto;
	//public JScrollPane jScrollColumnasSelectReporteDetalleCodigoBarraProducto;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleCodigoBarraProducto;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleCodigoBarraProducto;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleCodigoBarraProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleCodigoBarraProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleCodigoBarraProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleCodigoBarraProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleCodigoBarraProducto;
	
		
	//public JLabel jLabelArchivoImportacionDetalleCodigoBarraProducto;	
	//public JLabel jLabelPathArchivoImportacionDetalleCodigoBarraProducto;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleCodigoBarraProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleCodigoBarraProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleCodigoBarraProducto;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleCodigoBarraProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleCodigoBarraProducto;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleCodigoBarraProducto;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleCodigoBarraProducto;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleCodigoBarraProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleCodigoBarraProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleCodigoBarraProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleCodigoBarraProducto;
	public JPanel jPanelFK_IdBodegaDetalleCodigoBarraProducto;
	public JButton jButtonFK_IdBodegaDetalleCodigoBarraProducto;
	public JPanel jPanelFK_IdLineaDetalleCodigoBarraProducto;
	public JButton jButtonFK_IdLineaDetalleCodigoBarraProducto;
	public JPanel jPanelFK_IdLineaCategoriaDetalleCodigoBarraProducto;
	public JButton jButtonFK_IdLineaCategoriaDetalleCodigoBarraProducto;
	public JPanel jPanelFK_IdLineaGrupoDetalleCodigoBarraProducto;
	public JButton jButtonFK_IdLineaGrupoDetalleCodigoBarraProducto;
	public JPanel jPanelFK_IdLineaMarcaDetalleCodigoBarraProducto;
	public JButton jButtonFK_IdLineaMarcaDetalleCodigoBarraProducto;
	public JPanel jPanelFK_IdProductoDetalleCodigoBarraProducto;
	public JButton jButtonFK_IdProductoDetalleCodigoBarraProducto;
	public JPanel jPanelFK_IdUnidadDetalleCodigoBarraProducto;
	public JButton jButtonFK_IdUnidadDetalleCodigoBarraProducto;
	
	public JPanel jPanelid_bodegaFK_IdBodegaDetalleCodigoBarraProducto;
	public JLabel jLabelid_bodegaFK_IdBodegaDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaDetalleCodigoBarraProducto;
	public JButton jButtonid_bodegaFK_IdBodegaDetalleCodigoBarraProducto= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleCodigoBarraProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaDetalleCodigoBarraProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_lineaFK_IdLineaDetalleCodigoBarraProducto;
	public JLabel jLabelid_lineaFK_IdLineaDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaFK_IdLineaDetalleCodigoBarraProducto;
	public JButton jButtonid_lineaFK_IdLineaDetalleCodigoBarraProducto= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaDetalleCodigoBarraProductoUpdate= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaDetalleCodigoBarraProductoBusqueda= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaDetalleCodigoBarraProductoArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto;
	public JLabel jLabelid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto;
	public JButton jButtonid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto= new JButtonMe();
	public JButton jButtonid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProductoUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProductoBusqueda= new JButtonMe();
	public JButton jButtonid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProductoArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto;
	public JLabel jLabelid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto;
	public JButton jButtonid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto= new JButtonMe();
	public JButton jButtonid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProductoUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProductoBusqueda= new JButtonMe();
	public JButton jButtonid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProductoArbol= new JButtonMe();

	
	public JPanel jPanelid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto;
	public JLabel jLabelid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto;
	public JButton jButtonid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto= new JButtonMe();
	public JButton jButtonid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProductoUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProductoBusqueda= new JButtonMe();
	public JButton jButtonid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProductoArbol= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoDetalleCodigoBarraProducto;
	public JLabel jLabelid_productoFK_IdProductoDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoDetalleCodigoBarraProducto;
	public JButton jButtonid_productoFK_IdProductoDetalleCodigoBarraProducto= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleCodigoBarraProductoUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoDetalleCodigoBarraProductoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoDetalleCodigoBarraProducto;
	
	public JPanel jPanelid_unidadFK_IdUnidadDetalleCodigoBarraProducto;
	public JLabel jLabelid_unidadFK_IdUnidadDetalleCodigoBarraProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadDetalleCodigoBarraProducto;
	public JButton jButtonid_unidadFK_IdUnidadDetalleCodigoBarraProducto= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleCodigoBarraProductoUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadDetalleCodigoBarraProductoBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=528;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleCodigoBarraProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleCodigoBarraProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCodigoBarraProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCodigoBarraProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCodigoBarraProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCodigoBarraProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCodigoBarraProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleCodigoBarraProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleCodigoBarraProducto)	{
		this.jButtonRecargarInformacionDetalleCodigoBarraProducto = jButtonRecargarInformacionDetalleCodigoBarraProducto;
	}
	
	public JButton getjButtonProcesarInformacionDetalleCodigoBarraProducto() {
		return this.jButtonProcesarInformacionDetalleCodigoBarraProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleCodigoBarraProducto)	{
		this.jButtonProcesarInformacionDetalleCodigoBarraProducto = jButtonProcesarInformacionDetalleCodigoBarraProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleCodigoBarraProducto() {
		return this.jButtonRecargarInformacionDetalleCodigoBarraProducto;
	}
	
	
	public List<DetalleCodigoBarraProducto> getdetallecodigobarraproductos() {
		return this.detallecodigobarraproductos;
	}

	public void setdetallecodigobarraproductos(List<DetalleCodigoBarraProducto> detallecodigobarraproductos) {
		this.detallecodigobarraproductos = detallecodigobarraproductos;
	}
	
	public List<DetalleCodigoBarraProducto> getdetallecodigobarraproductosAux() {
		return this.detallecodigobarraproductosAux;
	}

	public void setdetallecodigobarraproductosAux(List<DetalleCodigoBarraProducto> detallecodigobarraproductosAux) {
		this.detallecodigobarraproductosAux = detallecodigobarraproductosAux;
	}
	
	public List<DetalleCodigoBarraProducto> getdetallecodigobarraproductosEliminados() {
		return this.detallecodigobarraproductosEliminados;
	}

	public void setDetalleCodigoBarraProductosEliminados(List<DetalleCodigoBarraProducto> detallecodigobarraproductosEliminados) {
		this.detallecodigobarraproductosEliminados = detallecodigobarraproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleCodigoBarraProducto() {
		return jComboBoxTiposSeleccionarDetalleCodigoBarraProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleCodigoBarraProducto(
			JComboBox jComboBoxTiposSeleccionarDetalleCodigoBarraProducto) {
		this.jComboBoxTiposSeleccionarDetalleCodigoBarraProducto = jComboBoxTiposSeleccionarDetalleCodigoBarraProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleCodigoBarraProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleCodigoBarraProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleCodigoBarraProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleCodigoBarraProducto() {
		return jTextFieldValorCampoGeneralDetalleCodigoBarraProducto;
	}

	public void setjTextFieldValorCampoGeneralDetalleCodigoBarraProducto(
			JTextField jTextFieldValorCampoGeneralDetalleCodigoBarraProducto) {
		this.jTextFieldValorCampoGeneralDetalleCodigoBarraProducto = jTextFieldValorCampoGeneralDetalleCodigoBarraProducto;
	}

	public void setBorderResaltarValorCampoGeneralDetalleCodigoBarraProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCodigoBarraProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleCodigoBarraProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleCodigoBarraProducto() {
		return this.jCheckBoxSeleccionarTodosDetalleCodigoBarraProducto;
	}

	public void setjCheckBoxSeleccionarTodosDetalleCodigoBarraProducto(
			JCheckBox jCheckBoxSeleccionarTodosDetalleCodigoBarraProducto) {
		this.jCheckBoxSeleccionarTodosDetalleCodigoBarraProducto = jCheckBoxSeleccionarTodosDetalleCodigoBarraProducto;
	}

	public void setBorderResaltarSeleccionarTodosDetalleCodigoBarraProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCodigoBarraProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleCodigoBarraProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleCodigoBarraProducto() {
		return this.jCheckBoxSeleccionadosDetalleCodigoBarraProducto;
	}

	public void setjCheckBoxSeleccionadosDetalleCodigoBarraProducto(
			JCheckBox jCheckBoxSeleccionadosDetalleCodigoBarraProducto) {
		this.jCheckBoxSeleccionadosDetalleCodigoBarraProducto = jCheckBoxSeleccionadosDetalleCodigoBarraProducto;
	}
	
	public void setBorderResaltarSeleccionadosDetalleCodigoBarraProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCodigoBarraProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleCodigoBarraProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleCodigoBarraProducto() {
		return this.jComboBoxTiposArchivosReportesDetalleCodigoBarraProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleCodigoBarraProducto(
			JComboBox jComboBoxTiposArchivosReportesDetalleCodigoBarraProducto) {
		this.jComboBoxTiposArchivosReportesDetalleCodigoBarraProducto = jComboBoxTiposArchivosReportesDetalleCodigoBarraProducto;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleCodigoBarraProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCodigoBarraProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleCodigoBarraProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleCodigoBarraProducto() {
		return this.jComboBoxTiposReportesDetalleCodigoBarraProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleCodigoBarraProducto(
			JComboBox jComboBoxTiposReportesDetalleCodigoBarraProducto) {
		this.jComboBoxTiposReportesDetalleCodigoBarraProducto = jComboBoxTiposReportesDetalleCodigoBarraProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleCodigoBarraProducto() {
	//	return jComboBoxTiposReportesDinamicoDetalleCodigoBarraProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleCodigoBarraProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleCodigoBarraProducto) {
	//	this.jComboBoxTiposReportesDinamicoDetalleCodigoBarraProducto = jComboBoxTiposReportesDinamicoDetalleCodigoBarraProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleCodigoBarraProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleCodigoBarraProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleCodigoBarraProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleCodigoBarraProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleCodigoBarraProducto = jComboBoxTiposArchivosReportesDinamicoDetalleCodigoBarraProducto;
	//}
	
	public void setBorderResaltarTiposReportesDetalleCodigoBarraProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCodigoBarraProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleCodigoBarraProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleCodigoBarraProducto() {
		return this.jComboBoxTiposGraficosReportesDetalleCodigoBarraProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleCodigoBarraProducto(
			JComboBox jComboBoxTiposGraficosReportesDetalleCodigoBarraProducto) {
		this.jComboBoxTiposGraficosReportesDetalleCodigoBarraProducto = jComboBoxTiposGraficosReportesDetalleCodigoBarraProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleCodigoBarraProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCodigoBarraProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleCodigoBarraProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleCodigoBarraProducto() {
		return this.jComboBoxTiposPaginacionDetalleCodigoBarraProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleCodigoBarraProducto(
			JComboBox jComboBoxTiposPaginacionDetalleCodigoBarraProducto) {
		this.jComboBoxTiposPaginacionDetalleCodigoBarraProducto = jComboBoxTiposPaginacionDetalleCodigoBarraProducto;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleCodigoBarraProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCodigoBarraProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleCodigoBarraProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleCodigoBarraProducto() {
		return this.jComboBoxTiposRelacionesDetalleCodigoBarraProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleCodigoBarraProducto() {
		return this.jComboBoxTiposAccionesDetalleCodigoBarraProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleCodigoBarraProducto(
			JComboBox jComboBoxTiposRelacionesDetalleCodigoBarraProducto) {
		this.jComboBoxTiposRelacionesDetalleCodigoBarraProducto = jComboBoxTiposRelacionesDetalleCodigoBarraProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleCodigoBarraProducto(
			JComboBox jComboBoxTiposAccionesDetalleCodigoBarraProducto) {
		this.jComboBoxTiposAccionesDetalleCodigoBarraProducto = jComboBoxTiposAccionesDetalleCodigoBarraProducto;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleCodigoBarraProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCodigoBarraProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleCodigoBarraProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleCodigoBarraProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCodigoBarraProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleCodigoBarraProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleCodigoBarraProducto() {
	//	return jCheckBoxConGraficoDinamicoDetalleCodigoBarraProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleCodigoBarraProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleCodigoBarraProducto) {
	//	this.jCheckBoxConGraficoDinamicoDetalleCodigoBarraProducto = jCheckBoxConGraficoDinamicoDetalleCodigoBarraProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleCodigoBarraProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleCodigoBarraProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleCodigoBarraProducto .setBorder(borderResaltar);		
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
		this.detallecodigobarraproductoSessionBean=new DetalleCodigoBarraProductoSessionBean();
		
		this.detallecodigobarraproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallecodigobarraproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleCodigoBarraProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleCodigoBarraProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleCodigoBarraProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleCodigoBarraProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleCodigoBarraProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Codigo Barra Producto MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleCodigoBarraProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleCodigoBarraProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCodigoBarraProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleCodigoBarraProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleCodigoBarraProducto,this.jTtoolBarDetalleCodigoBarraProducto,
							"nuevo","nuevo","Nuevo"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleCodigoBarraProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleCodigoBarraProducto,this.jTtoolBarDetalleCodigoBarraProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleCodigoBarraProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleCodigoBarraProducto,this.jTtoolBarDetalleCodigoBarraProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleCodigoBarraProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleCodigoBarraProducto,this.jTtoolBarDetalleCodigoBarraProducto,
							"duplicar","duplicar","Duplicar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleCodigoBarraProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleCodigoBarraProducto,this.jTtoolBarDetalleCodigoBarraProducto,
							"copiar","copiar","Copiar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleCodigoBarraProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleCodigoBarraProducto,this.jTtoolBarDetalleCodigoBarraProducto,
							"ver_form","ver_form","Ver"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleCodigoBarraProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleCodigoBarraProducto,this.jTtoolBarDetalleCodigoBarraProducto,
							"recargar","recargar","Recargar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleCodigoBarraProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleCodigoBarraProducto,this.jTtoolBarDetalleCodigoBarraProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleCodigoBarraProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleCodigoBarraProducto,this.jTtoolBarDetalleCodigoBarraProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleCodigoBarraProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleCodigoBarraProducto,this.jTtoolBarDetalleCodigoBarraProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleCodigoBarraProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleCodigoBarraProducto,this.jTtoolBarDetalleCodigoBarraProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleCodigoBarraProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleCodigoBarraProducto,this.jTtoolBarDetalleCodigoBarraProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleCodigoBarraProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleCodigoBarraProducto,this.jTtoolBarDetalleCodigoBarraProducto,
							"cerrar","cerrar","Salir"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleCodigoBarraProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleCodigoBarraProducto;
			
				this.jButtonProcesarInformacionToolBarDetalleCodigoBarraProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleCodigoBarraProducto;
				
		//protected JButton jButtonModificarToolBarDetalleCodigoBarraProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleCodigoBarraProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleCodigoBarraProducto=new JMenuMe("General");
		this.jmenuArchivoDetalleCodigoBarraProducto=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleCodigoBarraProducto=new JMenuMe("Acciones");
		this.jmenuDatosDetalleCodigoBarraProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleCodigoBarraProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleCodigoBarraProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleCodigoBarraProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleCodigoBarraProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleCodigoBarraProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleCodigoBarraProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleCodigoBarraProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleCodigoBarraProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleCodigoBarraProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleCodigoBarraProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleCodigoBarraProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleCodigoBarraProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleCodigoBarraProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleCodigoBarraProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleCodigoBarraProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleCodigoBarraProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleCodigoBarraProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleCodigoBarraProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleCodigoBarraProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleCodigoBarraProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleCodigoBarraProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleCodigoBarraProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleCodigoBarraProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleCodigoBarraProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleCodigoBarraProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleCodigoBarraProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleCodigoBarraProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleCodigoBarraProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleCodigoBarraProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleCodigoBarraProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleCodigoBarraProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleCodigoBarraProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleCodigoBarraProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleCodigoBarraProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleCodigoBarraProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleCodigoBarraProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleCodigoBarraProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleCodigoBarraProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleCodigoBarraProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleCodigoBarraProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleCodigoBarraProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleCodigoBarraProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleCodigoBarraProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleCodigoBarraProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleCodigoBarraProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleCodigoBarraProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleCodigoBarraProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleCodigoBarraProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleCodigoBarraProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleCodigoBarraProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleCodigoBarraProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleCodigoBarraProducto.add(this.jMenuItemCerrarDetalleCodigoBarraProducto);
			
			this.jmenuAccionesDetalleCodigoBarraProducto.add(this.jMenuItemNuevoDetalleCodigoBarraProducto);
			this.jmenuAccionesDetalleCodigoBarraProducto.add(this.jMenuItemNuevoGuardarCambiosDetalleCodigoBarraProducto);
			this.jmenuAccionesDetalleCodigoBarraProducto.add(this.jMenuItemNuevoRelacionesDetalleCodigoBarraProducto);
			this.jmenuAccionesDetalleCodigoBarraProducto.add(this.jMenuItemGuardarCambiosTablaDetalleCodigoBarraProducto);		
			this.jmenuAccionesDetalleCodigoBarraProducto.add(this.jMenuItemDuplicarDetalleCodigoBarraProducto);		
			this.jmenuAccionesDetalleCodigoBarraProducto.add(this.jMenuItemCopiarDetalleCodigoBarraProducto);		
			this.jmenuAccionesDetalleCodigoBarraProducto.add(this.jMenuItemVerFormDetalleCodigoBarraProducto);		
			
			this.jmenuDatosDetalleCodigoBarraProducto.add(this.jMenuItemRecargarInformacionDetalleCodigoBarraProducto);				
			this.jmenuDatosDetalleCodigoBarraProducto.add(this.jMenuItemAnterioresDetalleCodigoBarraProducto);				
			this.jmenuDatosDetalleCodigoBarraProducto.add(this.jMenuItemSiguientesDetalleCodigoBarraProducto);				
			this.jmenuDatosDetalleCodigoBarraProducto.add(this.jMenuItemAbrirOrderByDetalleCodigoBarraProducto);				
			this.jmenuDatosDetalleCodigoBarraProducto.add(this.jMenuItemMostrarOcultarDetalleCodigoBarraProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleCodigoBarraProducto.add(this.jMenuItemGuardarCambiosDetalleCodigoBarraProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCodigoBarraProducto.add(this.jmenuArchivoDetalleCodigoBarraProducto);		
			this.jmenuBarDetalleCodigoBarraProducto.add(this.jmenuAccionesDetalleCodigoBarraProducto);		
			this.jmenuBarDetalleCodigoBarraProducto.add(this.jmenuDatosDetalleCodigoBarraProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleCodigoBarraProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleCodigoBarraProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaDetalleCodigoBarraProducto.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaDetalleCodigoBarraProducto= new JButtonMe();
		this.jButtonFK_IdBodegaDetalleCodigoBarraProducto.setText("Buscar");
		this.jButtonFK_IdBodegaDetalleCodigoBarraProducto.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaDetalleCodigoBarraProducto,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaDetalleCodigoBarraProducto = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaDetalleCodigoBarraProducto.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaDetalleCodigoBarraProducto.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaDetalleCodigoBarraProducto= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLineaDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaDetalleCodigoBarraProducto.setToolTipText("Buscar Por Linea ");
		this.jButtonFK_IdLineaDetalleCodigoBarraProducto= new JButtonMe();
		this.jButtonFK_IdLineaDetalleCodigoBarraProducto.setText("Buscar");
		this.jButtonFK_IdLineaDetalleCodigoBarraProducto.setToolTipText("Buscar Por Linea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaDetalleCodigoBarraProducto,"buscar_button","Buscar Por Linea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_lineaFK_IdLineaDetalleCodigoBarraProducto = new JLabelMe();
		jLabelid_lineaFK_IdLineaDetalleCodigoBarraProducto.setText("Linea :");
		jLabelid_lineaFK_IdLineaDetalleCodigoBarraProducto.setToolTipText("Linea");
		jLabelid_lineaFK_IdLineaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaFK_IdLineaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaFK_IdLineaDetalleCodigoBarraProducto= new JComboBoxMe();
		jComboBoxid_lineaFK_IdLineaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaFK_IdLineaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLineaCategoriaDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaCategoriaDetalleCodigoBarraProducto.setToolTipText("Buscar Por Linea Categoria ");
		this.jButtonFK_IdLineaCategoriaDetalleCodigoBarraProducto= new JButtonMe();
		this.jButtonFK_IdLineaCategoriaDetalleCodigoBarraProducto.setText("Buscar");
		this.jButtonFK_IdLineaCategoriaDetalleCodigoBarraProducto.setToolTipText("Buscar Por Linea Categoria ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaCategoriaDetalleCodigoBarraProducto,"buscar_button","Buscar Por Linea Categoria ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaCategoriaDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto = new JLabelMe();
		jLabelid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto.setText("Linea Categoria :");
		jLabelid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto.setToolTipText("Linea Categoria");
		jLabelid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto= new JComboBoxMe();
		jComboBoxid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLineaGrupoDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaGrupoDetalleCodigoBarraProducto.setToolTipText("Buscar Por Linea Grupo ");
		this.jButtonFK_IdLineaGrupoDetalleCodigoBarraProducto= new JButtonMe();
		this.jButtonFK_IdLineaGrupoDetalleCodigoBarraProducto.setText("Buscar");
		this.jButtonFK_IdLineaGrupoDetalleCodigoBarraProducto.setToolTipText("Buscar Por Linea Grupo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaGrupoDetalleCodigoBarraProducto,"buscar_button","Buscar Por Linea Grupo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaGrupoDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto = new JLabelMe();
		jLabelid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto.setText("Linea Grupo :");
		jLabelid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto.setToolTipText("Linea Grupo");
		jLabelid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto= new JComboBoxMe();
		jComboBoxid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdLineaMarcaDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaMarcaDetalleCodigoBarraProducto.setToolTipText("Buscar Por Linea Marca ");
		this.jButtonFK_IdLineaMarcaDetalleCodigoBarraProducto= new JButtonMe();
		this.jButtonFK_IdLineaMarcaDetalleCodigoBarraProducto.setText("Buscar");
		this.jButtonFK_IdLineaMarcaDetalleCodigoBarraProducto.setToolTipText("Buscar Por Linea Marca ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaMarcaDetalleCodigoBarraProducto,"buscar_button","Buscar Por Linea Marca ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaMarcaDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto = new JLabelMe();
		jLabelid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto.setText("Linea Marca :");
		jLabelid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto.setToolTipText("Linea Marca");
		jLabelid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto= new JComboBoxMe();
		jComboBoxid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDetalleCodigoBarraProducto.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoDetalleCodigoBarraProducto= new JButtonMe();
		this.jButtonFK_IdProductoDetalleCodigoBarraProducto.setText("Buscar");
		this.jButtonFK_IdProductoDetalleCodigoBarraProducto.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDetalleCodigoBarraProducto,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoDetalleCodigoBarraProducto = new JLabelMe();
		jLabelid_productoFK_IdProductoDetalleCodigoBarraProducto.setText("Producto :");
		jLabelid_productoFK_IdProductoDetalleCodigoBarraProducto.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoDetalleCodigoBarraProducto= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoDetalleCodigoBarraProducto= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoDetalleCodigoBarraProducto.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleCodigoBarraProducto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoDetalleCodigoBarraProducto.setFocusable(false);

		this.jPanelFK_IdUnidadDetalleCodigoBarraProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadDetalleCodigoBarraProducto.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadDetalleCodigoBarraProducto= new JButtonMe();
		this.jButtonFK_IdUnidadDetalleCodigoBarraProducto.setText("Buscar");
		this.jButtonFK_IdUnidadDetalleCodigoBarraProducto.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadDetalleCodigoBarraProducto,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadDetalleCodigoBarraProducto = new JLabelMe();
		jLabelid_unidadFK_IdUnidadDetalleCodigoBarraProducto.setText("Unad :");
		jLabelid_unidadFK_IdUnidadDetalleCodigoBarraProducto.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadDetalleCodigoBarraProducto= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleCodigoBarraProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleCodigoBarraProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleCodigoBarraProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleCodigoBarraProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleCodigoBarraProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleCodigoBarraProducto = new DetalleCodigoBarraProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Codigo Barra Producto DATOS");
			this.jInternalFrameDetalleFormDetalleCodigoBarraProducto = new DetalleCodigoBarraProductoDetalleFormJInternalFrame(jDesktopPane,this.detallecodigobarraproductoSessionBean.getConGuardarRelaciones(),this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleCodigoBarraProducto = null;//new DetalleCodigoBarraProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleCodigoBarraProducto= new GridBagLayout();
		
		
		this.jTableDatosDetalleCodigoBarraProducto = new JTableMe();      
		
		String sToolTipDetalleCodigoBarraProducto="";
		sToolTipDetalleCodigoBarraProducto=DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleCodigoBarraProducto+="(Inventario.DetalleCodigoBarraProducto)";
		}
		
		if(!this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleCodigoBarraProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleCodigoBarraProducto.setToolTipText(sToolTipDetalleCodigoBarraProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleCodigoBarraProducto);
		this.jTableDatosDetalleCodigoBarraProducto.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleCodigoBarraProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleCodigoBarraProducto.setRowSelectionAllowed(true);
		this.jTableDatosDetalleCodigoBarraProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleCodigoBarraProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleCodigoBarraProducto = new JButtonMe();
		this.jButtonDuplicarDetalleCodigoBarraProducto = new JButtonMe();
		this.jButtonCopiarDetalleCodigoBarraProducto = new JButtonMe();
		this.jButtonVerFormDetalleCodigoBarraProducto = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleCodigoBarraProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleCodigoBarraProducto = new JButtonMe();
		this.jButtonCerrarDetalleCodigoBarraProducto = new JButtonMe();
		
		this.jScrollPanelDatosDetalleCodigoBarraProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleCodigoBarraProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleCodigoBarraProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Codigo Barra Producto";
		
		if(!this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Codigo Barra Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleCodigoBarraProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleCodigoBarraProducto.setToolTipText("Acciones");
        this.jPanelAccionesDetalleCodigoBarraProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleCodigoBarraProducto=new ReporteDinamicoJInternalFrame(DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleCodigoBarraProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleCodigoBarraProducto=new ImportacionJInternalFrame(DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleCodigoBarraProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleCodigoBarraProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleCodigoBarraProducto.setText("Orden");
		this.jButtonAbrirOrderByDetalleCodigoBarraProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleCodigoBarraProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleCodigoBarraProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleCodigoBarraProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleCodigoBarraProducto,false,this);
			
			//this.cargarOrderByDetalleCodigoBarraProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleCodigoBarraProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleCodigoBarraProducto,true,this);
			
			//this.cargarOrderByDetalleCodigoBarraProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleCodigoBarraProducto.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosDetalleCodigoBarraProducto.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosDetalleCodigoBarraProducto.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosDetalleCodigoBarraProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleCodigoBarraProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleCodigoBarraProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleCodigoBarraProducto.setText("Nuevo");
		this.jButtonDuplicarDetalleCodigoBarraProducto.setText("Duplicar");
		this.jButtonCopiarDetalleCodigoBarraProducto.setText("Copiar");
		this.jButtonVerFormDetalleCodigoBarraProducto.setText("Ver");
		this.jButtonNuevoRelacionesDetalleCodigoBarraProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleCodigoBarraProducto.setText("Guardar");
		this.jButtonCerrarDetalleCodigoBarraProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleCodigoBarraProducto,"nuevo_button","Nuevo",this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleCodigoBarraProducto,"duplicar_button","Duplicar",this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleCodigoBarraProducto,"copiar_button","Copiar",this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleCodigoBarraProducto,"ver_form","Ver",this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleCodigoBarraProducto,"nuevorelaciones_button","Nuevo Rel",this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleCodigoBarraProducto,"guardarcambiostabla_button","Guardar",this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleCodigoBarraProducto,"cerrar_button","Salir",this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleCodigoBarraProducto.setToolTipText("Nuevo"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleCodigoBarraProducto.setToolTipText("Duplicar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleCodigoBarraProducto.setToolTipText("Copiar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleCodigoBarraProducto.setToolTipText("Ver"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleCodigoBarraProducto.setToolTipText("Nuevo Rel"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleCodigoBarraProducto.setToolTipText("Guardar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleCodigoBarraProducto.setToolTipText("Salir"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleCodigoBarraProducto";
		inputMap = this.jButtonNuevoDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleCodigoBarraProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleCodigoBarraProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleCodigoBarraProducto";
		inputMap = this.jButtonDuplicarDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleCodigoBarraProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleCodigoBarraProducto"));
		
		//COPIAR
		sMapKey = "CopiarDetalleCodigoBarraProducto";
		inputMap = this.jButtonCopiarDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleCodigoBarraProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleCodigoBarraProducto"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleCodigoBarraProducto";
		inputMap = this.jButtonVerFormDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleCodigoBarraProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleCodigoBarraProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleCodigoBarraProducto";
		inputMap = this.jButtonNuevoRelacionesDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleCodigoBarraProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleCodigoBarraProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleCodigoBarraProducto";
		inputMap = this.jButtonModificarDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleCodigoBarraProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleCodigoBarraProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleCodigoBarraProducto";
		inputMap = this.jButtonCerrarDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleCodigoBarraProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleCodigoBarraProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleCodigoBarraProducto";
		inputMap = this.jButtonGuardarCambiosTablaDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleCodigoBarraProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleCodigoBarraProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleCodigoBarraProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleCodigoBarraProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleCodigoBarraProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleCodigoBarraProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleCodigoBarraProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleCodigoBarraProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleCodigoBarraProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleCodigoBarraProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleCodigoBarraProducto.setName("jPanelParametrosReportesDetalleCodigoBarraProducto"); 
		
		this.jPanelParametrosReportesAccionesDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleCodigoBarraProducto.setName("jPanelParametrosReportesAccionesDetalleCodigoBarraProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleCodigoBarraProducto = new JButtonMe();
		this.jButtonRecargarInformacionDetalleCodigoBarraProducto.setText("Recargar");
		this.jButtonRecargarInformacionDetalleCodigoBarraProducto.setToolTipText("Recargar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleCodigoBarraProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleCodigoBarraProducto = new JButtonMe();
		this.jButtonProcesarInformacionDetalleCodigoBarraProducto.setText("Procesar");
		this.jButtonProcesarInformacionDetalleCodigoBarraProducto.setToolTipText("Procesar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleCodigoBarraProducto.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleCodigoBarraProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleCodigoBarraProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleCodigoBarraProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleCodigoBarraProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleCodigoBarraProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleCodigoBarraProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleCodigoBarraProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleCodigoBarraProducto.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleCodigoBarraProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleCodigoBarraProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleCodigoBarraProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleCodigoBarraProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleCodigoBarraProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleCodigoBarraProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleCodigoBarraProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleCodigoBarraProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleCodigoBarraProducto.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleCodigoBarraProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleCodigoBarraProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleCodigoBarraProducto.setText("Accion");
		this.jComboBoxTiposAccionesDetalleCodigoBarraProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleCodigoBarraProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleCodigoBarraProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleCodigoBarraProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleCodigoBarraProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleCodigoBarraProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleCodigoBarraProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleCodigoBarraProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleCodigoBarraProducto = new JLabelMe();
		
		this.jLabelAccionesDetalleCodigoBarraProducto.setText("Acciones");		
		this.jLabelAccionesDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleCodigoBarraProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleCodigoBarraProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleCodigoBarraProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleCodigoBarraProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleCodigoBarraProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleCodigoBarraProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleCodigoBarraProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleCodigoBarraProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleCodigoBarraProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleCodigoBarraProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleCodigoBarraProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleCodigoBarraProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleCodigoBarraProducto = new JButtonMe();
		//this.jButtonAnterioresDetalleCodigoBarraProducto.setText("<<");
        this.jButtonAnterioresDetalleCodigoBarraProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleCodigoBarraProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleCodigoBarraProducto = new JButtonMe();
		//this.jButtonSiguientesDetalleCodigoBarraProducto.setText(">>");
        this.jButtonSiguientesDetalleCodigoBarraProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleCodigoBarraProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleCodigoBarraProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleCodigoBarraProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleCodigoBarraProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleCodigoBarraProducto,"nuevoguardarcambios_button","Nue",this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleCodigoBarraProducto";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleCodigoBarraProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleCodigoBarraProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleCodigoBarraProducto";
		inputMap = this.jButtonRecargarInformacionDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleCodigoBarraProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleCodigoBarraProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleCodigoBarraProducto";
		inputMap = this.jButtonSiguientesDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleCodigoBarraProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleCodigoBarraProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleCodigoBarraProducto";
		inputMap = this.jButtonAnterioresDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleCodigoBarraProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleCodigoBarraProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleCodigoBarraProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleCodigoBarraProducto.setMinimumSize(new Dimension(this.getWidth(),DetalleCodigoBarraProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleCodigoBarraProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleCodigoBarraProducto.setMaximumSize(new Dimension(this.getWidth(),DetalleCodigoBarraProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleCodigoBarraProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleCodigoBarraProducto.setPreferredSize(new Dimension(this.getWidth(),DetalleCodigoBarraProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleCodigoBarraProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleCodigoBarraProducto = new GridBagLayout();

			this.jPanelPaginacionDetalleCodigoBarraProducto.setLayout(gridaBagLayoutPaginacionDetalleCodigoBarraProducto);						
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleCodigoBarraProducto.add(this.jButtonAnterioresDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
					
						
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
			
			this.jPanelPaginacionDetalleCodigoBarraProducto.add(this.jButtonNuevoGuardarCambiosDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
						
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
			this.jPanelPaginacionDetalleCodigoBarraProducto.add(this.jButtonSiguientesDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 1;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCodigoBarraProducto.add(this.jButtonNuevoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
						
			
			
			if(!this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
				this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 1;
				this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleCodigoBarraProducto.add(this.jButtonGuardarCambiosTablaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
			}
			
			
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 1;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCodigoBarraProducto.add(this.jButtonDuplicarDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 1;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCodigoBarraProducto.add(this.jButtonCopiarDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 1;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCodigoBarraProducto.add(this.jButtonVerFormDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 1;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleCodigoBarraProducto.add(this.jButtonCerrarDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		
		
		
		this.jButtonRecargarInformacionDetalleCodigoBarraProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleCodigoBarraProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleCodigoBarraProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleCodigoBarraProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleCodigoBarraProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleCodigoBarraProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleCodigoBarraProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleCodigoBarraProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleCodigoBarraProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleCodigoBarraProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleCodigoBarraProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleCodigoBarraProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleCodigoBarraProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleCodigoBarraProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleCodigoBarraProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleCodigoBarraProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleCodigoBarraProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleCodigoBarraProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleCodigoBarraProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCodigoBarraProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCodigoBarraProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleCodigoBarraProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleCodigoBarraProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleCodigoBarraProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleCodigoBarraProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleCodigoBarraProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleCodigoBarraProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleCodigoBarraProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleCodigoBarraProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleCodigoBarraProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleCodigoBarraProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleCodigoBarraProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleCodigoBarraProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleCodigoBarraProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleCodigoBarraProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleCodigoBarraProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleCodigoBarraProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleCodigoBarraProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleCodigoBarraProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleCodigoBarraProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleCodigoBarraProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleCodigoBarraProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleCodigoBarraProducto.setLayout(gridaBagParametrosReportesDetalleCodigoBarraProducto);
			this.jPanelParametrosReportesAccionesDetalleCodigoBarraProducto.setLayout(gridaBagParametrosReportesAccionesDetalleCodigoBarraProducto);
			
			
			this.jPanelParametrosAuxiliar1DetalleCodigoBarraProducto.setLayout(gridaBagParametrosAuxiliar1DetalleCodigoBarraProducto);
			this.jPanelParametrosAuxiliar2DetalleCodigoBarraProducto.setLayout(gridaBagParametrosAuxiliar2DetalleCodigoBarraProducto);
			this.jPanelParametrosAuxiliar3DetalleCodigoBarraProducto.setLayout(gridaBagParametrosAuxiliar3DetalleCodigoBarraProducto);
			this.jPanelParametrosAuxiliar4DetalleCodigoBarraProducto.setLayout(gridaBagParametrosAuxiliar4DetalleCodigoBarraProducto);
			//this.jPanelParametrosAuxiliar5DetalleCodigoBarraProducto.setLayout(gridaBagParametrosAuxiliar2DetalleCodigoBarraProducto);			
			
			
			
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCodigoBarraProducto.add(this.jButtonRecargarInformacionDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleCodigoBarraProducto.add(this.jComboBoxTiposPaginacionDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleCodigoBarraProducto.add(this.jCheckBoxConAltoMaximoTablaDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleCodigoBarraProducto.add(this.jComboBoxTiposArchivosReportesDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCodigoBarraProducto.add(this.jPanelParametrosAuxiliar1DetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleCodigoBarraProducto.add(this.jComboBoxTiposReportesDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);																		
			
			
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleCodigoBarraProducto.add(this.jComboBoxTiposGraficosReportesDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCodigoBarraProducto.add(this.jPanelParametrosAuxiliar4DetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCodigoBarraProducto.add(this.jComboBoxTiposReportesDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCodigoBarraProducto.add(this.jCheckBoxGenerarReporteDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCodigoBarraProducto.add(this.jPanelParametrosAuxiliar2DetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCodigoBarraProducto.add(this.jLabelAccionesDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
				this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleCodigoBarraProducto.add(this.jButtonAbrirOrderByDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCodigoBarraProducto.add(this.jComboBoxTiposSeleccionarDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);			
			
			
			/*
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCodigoBarraProducto.add(this.jCheckBoxSeleccionarTodosDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCodigoBarraProducto.add(this.jCheckBoxConGraficoReporteDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleCodigoBarraProducto.add(this.jCheckBoxSeleccionarTodosDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);															
				
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleCodigoBarraProducto.add(this.jCheckBoxSeleccionadosDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);															
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleCodigoBarraProducto.add(this.jCheckBoxConGraficoReporteDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCodigoBarraProducto.add(this.jPanelParametrosAuxiliar3DetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCodigoBarraProducto.add(this.jComboBoxTiposAccionesDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
	
				
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCodigoBarraProducto.add(this.jTextFieldValorCampoGeneralDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleCodigoBarraProducto = new GridBagLayout();

			this.jScrollPanelDatosDetalleCodigoBarraProducto.setLayout(gridaBagLayoutDatosDetalleCodigoBarraProducto);
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
			
			this.jScrollPanelDatosDetalleCodigoBarraProducto.add(this.jTableDatosDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleCodigoBarraProducto.setViewportView(this.jTableDatosDetalleCodigoBarraProducto);
		this.jTableDatosDetalleCodigoBarraProducto.setFillsViewportHeight(true);
		this.jTableDatosDetalleCodigoBarraProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleCodigoBarraProducto= new GridBagLayout();
		this.jPanelAccionesDetalleCodigoBarraProducto.setLayout(gridaBagLayoutAccionesDetalleCodigoBarraProducto);
		
		
		/*	
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
			
		this.jPanelAccionesDetalleCodigoBarraProducto.add(this.jButtonNuevoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaDetalleCodigoBarraProducto= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaDetalleCodigoBarraProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleCodigoBarraProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaDetalleCodigoBarraProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaDetalleCodigoBarraProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaDetalleCodigoBarraProducto.setLayout(gridaBagLayoutFK_IdBodegaDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
		jPanelFK_IdBodegaDetalleCodigoBarraProducto.add(jLabelid_bodegaFK_IdBodegaDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
		jPanelFK_IdBodegaDetalleCodigoBarraProducto.add(jComboBoxid_bodegaFK_IdBodegaDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 1;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx =1;
		jPanelFK_IdBodegaDetalleCodigoBarraProducto.add(jButtonFK_IdBodegaDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		jTabbedPaneBusquedasDetalleCodigoBarraProducto.addTab("1.-Por Bodega ", jPanelFK_IdBodegaDetalleCodigoBarraProducto);
		jTabbedPaneBusquedasDetalleCodigoBarraProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdLineaDetalleCodigoBarraProducto= new GridBagLayout();
		gridaBagLayoutFK_IdLineaDetalleCodigoBarraProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaDetalleCodigoBarraProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaDetalleCodigoBarraProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaDetalleCodigoBarraProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaDetalleCodigoBarraProducto.setLayout(gridaBagLayoutFK_IdLineaDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
		jPanelFK_IdLineaDetalleCodigoBarraProducto.add(jLabelid_lineaFK_IdLineaDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
		jPanelFK_IdLineaDetalleCodigoBarraProducto.add(jComboBoxid_lineaFK_IdLineaDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 1;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx =1;
		jPanelFK_IdLineaDetalleCodigoBarraProducto.add(jButtonFK_IdLineaDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		jTabbedPaneBusquedasDetalleCodigoBarraProducto.addTab("2.-Por Linea ", jPanelFK_IdLineaDetalleCodigoBarraProducto);
		jTabbedPaneBusquedasDetalleCodigoBarraProducto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdLineaCategoriaDetalleCodigoBarraProducto= new GridBagLayout();
		gridaBagLayoutFK_IdLineaCategoriaDetalleCodigoBarraProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaCategoriaDetalleCodigoBarraProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaCategoriaDetalleCodigoBarraProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaCategoriaDetalleCodigoBarraProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaCategoriaDetalleCodigoBarraProducto.setLayout(gridaBagLayoutFK_IdLineaCategoriaDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
		jPanelFK_IdLineaCategoriaDetalleCodigoBarraProducto.add(jLabelid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
		jPanelFK_IdLineaCategoriaDetalleCodigoBarraProducto.add(jComboBoxid_linea_categoriaFK_IdLineaCategoriaDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 1;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx =1;
		jPanelFK_IdLineaCategoriaDetalleCodigoBarraProducto.add(jButtonFK_IdLineaCategoriaDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		jTabbedPaneBusquedasDetalleCodigoBarraProducto.addTab("3.-Por Linea Categoria ", jPanelFK_IdLineaCategoriaDetalleCodigoBarraProducto);
		jTabbedPaneBusquedasDetalleCodigoBarraProducto.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdLineaGrupoDetalleCodigoBarraProducto= new GridBagLayout();
		gridaBagLayoutFK_IdLineaGrupoDetalleCodigoBarraProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaGrupoDetalleCodigoBarraProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaGrupoDetalleCodigoBarraProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaGrupoDetalleCodigoBarraProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaGrupoDetalleCodigoBarraProducto.setLayout(gridaBagLayoutFK_IdLineaGrupoDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
		jPanelFK_IdLineaGrupoDetalleCodigoBarraProducto.add(jLabelid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
		jPanelFK_IdLineaGrupoDetalleCodigoBarraProducto.add(jComboBoxid_linea_grupoFK_IdLineaGrupoDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 1;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx =1;
		jPanelFK_IdLineaGrupoDetalleCodigoBarraProducto.add(jButtonFK_IdLineaGrupoDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		jTabbedPaneBusquedasDetalleCodigoBarraProducto.addTab("4.-Por Linea Grupo ", jPanelFK_IdLineaGrupoDetalleCodigoBarraProducto);
		jTabbedPaneBusquedasDetalleCodigoBarraProducto.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdLineaMarcaDetalleCodigoBarraProducto= new GridBagLayout();
		gridaBagLayoutFK_IdLineaMarcaDetalleCodigoBarraProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaMarcaDetalleCodigoBarraProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaMarcaDetalleCodigoBarraProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaMarcaDetalleCodigoBarraProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaMarcaDetalleCodigoBarraProducto.setLayout(gridaBagLayoutFK_IdLineaMarcaDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
		jPanelFK_IdLineaMarcaDetalleCodigoBarraProducto.add(jLabelid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
		jPanelFK_IdLineaMarcaDetalleCodigoBarraProducto.add(jComboBoxid_linea_marcaFK_IdLineaMarcaDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 1;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx =1;
		jPanelFK_IdLineaMarcaDetalleCodigoBarraProducto.add(jButtonFK_IdLineaMarcaDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		jTabbedPaneBusquedasDetalleCodigoBarraProducto.addTab("5.-Por Linea Marca ", jPanelFK_IdLineaMarcaDetalleCodigoBarraProducto);
		jTabbedPaneBusquedasDetalleCodigoBarraProducto.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdProductoDetalleCodigoBarraProducto= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDetalleCodigoBarraProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleCodigoBarraProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDetalleCodigoBarraProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDetalleCodigoBarraProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDetalleCodigoBarraProducto.setLayout(gridaBagLayoutFK_IdProductoDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
		jPanelFK_IdProductoDetalleCodigoBarraProducto.add(jLabelid_productoFK_IdProductoDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
		jPanelFK_IdProductoDetalleCodigoBarraProducto.add(jComboBoxid_productoFK_IdProductoDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);


		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
		jPanelFK_IdProductoDetalleCodigoBarraProducto.add(this.jButtonBuscarFK_IdProductoid_productoDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 1;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx =1;
		jPanelFK_IdProductoDetalleCodigoBarraProducto.add(jButtonFK_IdProductoDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		jTabbedPaneBusquedasDetalleCodigoBarraProducto.addTab("6.-Por Producto ", jPanelFK_IdProductoDetalleCodigoBarraProducto);
		jTabbedPaneBusquedasDetalleCodigoBarraProducto.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdUnidadDetalleCodigoBarraProducto= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadDetalleCodigoBarraProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleCodigoBarraProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadDetalleCodigoBarraProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadDetalleCodigoBarraProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadDetalleCodigoBarraProducto.setLayout(gridaBagLayoutFK_IdUnidadDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
		jPanelFK_IdUnidadDetalleCodigoBarraProducto.add(jLabelid_unidadFK_IdUnidadDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 0;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx = 1;
		jPanelFK_IdUnidadDetalleCodigoBarraProducto.add(jComboBoxid_unidadFK_IdUnidadDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCodigoBarraProducto.gridy = 1;
		gridBagConstraintsDetalleCodigoBarraProducto.gridx =1;
		jPanelFK_IdUnidadDetalleCodigoBarraProducto.add(jButtonFK_IdUnidadDetalleCodigoBarraProducto, gridBagConstraintsDetalleCodigoBarraProducto);

		jTabbedPaneBusquedasDetalleCodigoBarraProducto.addTab("7.-Por Unad ", jPanelFK_IdUnidadDetalleCodigoBarraProducto);
		jTabbedPaneBusquedasDetalleCodigoBarraProducto.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleCodigoBarraProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleCodigoBarraProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();						
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;		
			//this.gridBagConstraintsDetalleCodigoBarraProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;		
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleCodigoBarraProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;		
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleCodigoBarraProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);								
		
		
		/*
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		*/		
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =0;
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleCodigoBarraProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
				
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleCodigoBarraProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleCodigoBarraProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleCodigoBarraProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleCodigoBarraProducto.setLayout(gridaBagLayoutBusquedasParametrosDetalleCodigoBarraProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleCodigoBarraProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleCodigoBarraProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCodigoBarraProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCodigoBarraProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
			
			
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		
			
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleCodigoBarraProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleCodigoBarraProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleCodigoBarraProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.setName("jPanelReporteDinamicoDetalleCodigoBarraProducto"); 
		
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.setLayout(gridaBagLayoutReporteDinamicoDetalleCodigoBarraProducto);
		
		
		this.jInternalFrameReporteDinamicoDetalleCodigoBarraProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleCodigoBarraProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleCodigoBarraProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleCodigoBarraProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleCodigoBarraProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleCodigoBarraProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleCodigoBarraProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleCodigoBarraProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleCodigoBarraProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleCodigoBarraProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleCodigoBarraProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Codigo Barra Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleCodigoBarraProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleCodigoBarraProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jLabelColumnasSelectReporteDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleCodigoBarraProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleCodigoBarraProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleCodigoBarraProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleCodigoBarraProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleCodigoBarraProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleCodigoBarraProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleCodigoBarraProducto=new JScrollPane(this.jListColumnasSelectReporteDetalleCodigoBarraProducto);
			
			this.jScrollColumnasSelectReporteDetalleCodigoBarraProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleCodigoBarraProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleCodigoBarraProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jListColumnasSelectReporteDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jScrollColumnasSelectReporteDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleCodigoBarraProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleCodigoBarraProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleCodigoBarraProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleCodigoBarraProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleCodigoBarraProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleCodigoBarraProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleCodigoBarraProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleCodigoBarraProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleCodigoBarraProducto=new JScrollPane(this.jListRelacionesSelectReporteDetalleCodigoBarraProducto);
			
			this.jScrollRelacionesSelectReporteDetalleCodigoBarraProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleCodigoBarraProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleCodigoBarraProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleCodigoBarraProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleCodigoBarraProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleCodigoBarraProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleCodigoBarraProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleCodigoBarraProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCodigoBarraProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCodigoBarraProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleCodigoBarraProducto = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleCodigoBarraProducto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jLabelConGraficoDinamicoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleCodigoBarraProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleCodigoBarraProducto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleCodigoBarraProducto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jCheckBoxConGraficoDinamicoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleCodigoBarraProducto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleCodigoBarraProducto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jLabelColumnaCategoriaGraficoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleCodigoBarraProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleCodigoBarraProducto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleCodigoBarraProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jComboBoxColumnaCategoriaGraficoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleCodigoBarraProducto = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleCodigoBarraProducto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jLabelColumnaCategoriaValorDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleCodigoBarraProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleCodigoBarraProducto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleCodigoBarraProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleCodigoBarraProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleCodigoBarraProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleCodigoBarraProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jComboBoxColumnaCategoriaValorDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleCodigoBarraProducto = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleCodigoBarraProducto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jLabelColumnasValoresGraficoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleCodigoBarraProducto = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleCodigoBarraProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleCodigoBarraProducto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleCodigoBarraProducto=new JScrollPane(this.jListColumnasValoresGraficoDetalleCodigoBarraProducto);
			
			this.jScrollColumnasValoresGraficoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jListColumnasSelectReporteDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jScrollColumnasValoresGraficoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleCodigoBarraProducto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleCodigoBarraProducto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jLabelTiposGraficosReportesDinamicoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleCodigoBarraProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleCodigoBarraProducto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleCodigoBarraProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleCodigoBarraProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleCodigoBarraProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jLabelGenerarExcelReporteDinamicoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleCodigoBarraProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleCodigoBarraProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleCodigoBarraProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleCodigoBarraProducto.setToolTipText("Generar EXCEL"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jButtonGenerarExcelReporteDinamicoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jComboBoxTiposReportesDinamicoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleCodigoBarraProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleCodigoBarraProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jLabelTiposArchivoReporteDinamicoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleCodigoBarraProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleCodigoBarraProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleCodigoBarraProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleCodigoBarraProducto.setToolTipText("Generar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jButtonGenerarReporteDinamicoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleCodigoBarraProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleCodigoBarraProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleCodigoBarraProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleCodigoBarraProducto.setToolTipText("Cancelar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCodigoBarraProducto.add(this.jButtonCerrarReporteDinamicoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleCodigoBarraProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleCodigoBarraProducto= new JScrollPane(jPanelReporteDinamicoDetalleCodigoBarraProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleCodigoBarraProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleCodigoBarraProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleCodigoBarraProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Codigo Barra Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleCodigoBarraProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleCodigoBarraProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleCodigoBarraProducto);
		this.jInternalFrameReporteDinamicoDetalleCodigoBarraProducto.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleCodigoBarraProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleCodigoBarraProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleCodigoBarraProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleCodigoBarraProducto.setName("jPanelImportacionDetalleCodigoBarraProducto"); 
		
		this.jPanelImportacionDetalleCodigoBarraProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleCodigoBarraProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleCodigoBarraProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleCodigoBarraProducto.setLayout(gridaBagLayoutImportacionDetalleCodigoBarraProducto);
		
		
		this.jInternalFrameImportacionDetalleCodigoBarraProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleCodigoBarraProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleCodigoBarraProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleCodigoBarraProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleCodigoBarraProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleCodigoBarraProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleCodigoBarraProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleCodigoBarraProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleCodigoBarraProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleCodigoBarraProducto.setResizable(true);
	    this.jInternalFrameImportacionDetalleCodigoBarraProducto.setClosable(true);
	    this.jInternalFrameImportacionDetalleCodigoBarraProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleCodigoBarraProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleCodigoBarraProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleCodigoBarraProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleCodigoBarraProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleCodigoBarraProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleCodigoBarraProducto.setResizable(true);
	    this.jInternalFrameImportacionDetalleCodigoBarraProducto.setClosable(true);
	    this.jInternalFrameImportacionDetalleCodigoBarraProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleCodigoBarraProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleCodigoBarraProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleCodigoBarraProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Codigo Barra Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleCodigoBarraProducto = new JLabelMe();

		this.jLabelArchivoImportacionDetalleCodigoBarraProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleCodigoBarraProducto.add(this.jLabelArchivoImportacionDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleCodigoBarraProducto = new JFileChooser();		
		this.jFileChooserImportacionDetalleCodigoBarraProducto.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleCodigoBarraProducto = new JButtonMe();
		this.jButtonAbrirImportacionDetalleCodigoBarraProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleCodigoBarraProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleCodigoBarraProducto.setToolTipText("Generar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCodigoBarraProducto.add(this.jButtonAbrirImportacionDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleCodigoBarraProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleCodigoBarraProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleCodigoBarraProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleCodigoBarraProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleCodigoBarraProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleCodigoBarraProducto.add(this.jLabelPathArchivoImportacionDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleCodigoBarraProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleCodigoBarraProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleCodigoBarraProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleCodigoBarraProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCodigoBarraProducto.add(this.jTextFieldPathArchivoImportacionDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleCodigoBarraProducto = new JButtonMe();
		this.jButtonGenerarImportacionDetalleCodigoBarraProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleCodigoBarraProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleCodigoBarraProducto.setToolTipText("Generar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCodigoBarraProducto.add(this.jButtonGenerarImportacionDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleCodigoBarraProducto = new JButtonMe();
		this.jButtonCerrarImportacionDetalleCodigoBarraProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleCodigoBarraProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleCodigoBarraProducto.setToolTipText("Cancelar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCodigoBarraProducto.add(this.jButtonCerrarImportacionDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleCodigoBarraProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleCodigoBarraProducto= new JScrollPane(jPanelImportacionDetalleCodigoBarraProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleCodigoBarraProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleCodigoBarraProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleCodigoBarraProducto);
		this.jInternalFrameImportacionDetalleCodigoBarraProducto.getContentPane().add(this.jScrollPanelImportacionDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleCodigoBarraProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleCodigoBarraProducto = new JButtonMe();
			this.jButtonAbrirOrderByDetalleCodigoBarraProducto.setText("Orden");
			this.jButtonAbrirOrderByDetalleCodigoBarraProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleCodigoBarraProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleCodigoBarraProducto";
			inputMap = this.jButtonAbrirOrderByDetalleCodigoBarraProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleCodigoBarraProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleCodigoBarraProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleCodigoBarraProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleCodigoBarraProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleCodigoBarraProducto.setName("jPanelOrderByDetalleCodigoBarraProducto"); 
			
			this.jPanelOrderByDetalleCodigoBarraProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleCodigoBarraProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleCodigoBarraProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleCodigoBarraProducto.setLayout(gridaBagLayoutOrderByDetalleCodigoBarraProducto);
			
			
			this.jTableDatosDetalleCodigoBarraProductoOrderBy = new JTableMe();        
			this.jTableDatosDetalleCodigoBarraProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleCodigoBarraProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleCodigoBarraProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleCodigoBarraProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleCodigoBarraProductoOrderBy.setViewportView(this.jTableDatosDetalleCodigoBarraProductoOrderBy);
			this.jTableDatosDetalleCodigoBarraProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleCodigoBarraProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleCodigoBarraProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleCodigoBarraProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleCodigoBarraProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleCodigoBarraProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleCodigoBarraProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleCodigoBarraProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleCodigoBarraProducto.setTitle("Orden");
			this.jInternalFrameOrderByDetalleCodigoBarraProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleCodigoBarraProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleCodigoBarraProducto.setResizable(true);
			this.jInternalFrameOrderByDetalleCodigoBarraProducto.setClosable(true);
			this.jInternalFrameOrderByDetalleCodigoBarraProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleCodigoBarraProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleCodigoBarraProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleCodigoBarraProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleCodigoBarraProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Codigo Barra Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleCodigoBarraProducto.ipady =150;
				
			this.jPanelOrderByDetalleCodigoBarraProducto.add(jScrollPanelDatosDetalleCodigoBarraProductoOrderBy, this.gridBagConstraintsDetalleCodigoBarraProducto);//this.jTableDatosDetalleCodigoBarraProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleCodigoBarraProducto = new JButtonMe();
			this.jButtonCerrarOrderByDetalleCodigoBarraProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleCodigoBarraProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleCodigoBarraProducto.setToolTipText("Cancelar"+" "+DetalleCodigoBarraProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleCodigoBarraProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleCodigoBarraProducto.add(this.jButtonCerrarOrderByDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleCodigoBarraProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleCodigoBarraProducto= new JScrollPane(jPanelOrderByDetalleCodigoBarraProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleCodigoBarraProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleCodigoBarraProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleCodigoBarraProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleCodigoBarraProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleCodigoBarraProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleCodigoBarraProducto);
			
			this.jInternalFrameOrderByDetalleCodigoBarraProducto.getContentPane().add(this.jScrollPanelOrderByDetalleCodigoBarraProducto, this.gridBagConstraintsDetalleCodigoBarraProducto);			
		
		} else {
			this.jButtonAbrirOrderByDetalleCodigoBarraProducto = new JButtonMe();
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
		int iWidthTableCalculado=0;//2930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallecodigobarraproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleCodigoBarraProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleCodigoBarraProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleCodigoBarraProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleCodigoBarraProducto.getRowHeight();//DetalleCodigoBarraProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleCodigoBarraProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleCodigoBarraProducto.isSelected()) {
					iHeightTable=DetalleCodigoBarraProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleCodigoBarraProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleCodigoBarraProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleCodigoBarraProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleCodigoBarraProducto.isSelected()) {
					iHeightTable=DetalleCodigoBarraProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleCodigoBarraProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleCodigoBarraProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleCodigoBarraProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleCodigoBarraProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleCodigoBarraProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleCodigoBarraProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleCodigoBarraProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleCodigoBarraProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleCodigoBarraProducto!=null && this.jInternalFrameOrderByDetalleCodigoBarraProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.detallecodigobarraproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleCodigoBarraProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleCodigoBarraProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleCodigoBarraProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleCodigoBarraProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleCodigoBarraProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleCodigoBarraProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleCodigoBarraProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleCodigoBarraProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleCodigoBarraProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleCodigoBarraProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detallecodigobarraproductoLogic.getDetalleCodigoBarraProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallecodigobarraproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleCodigoBarraProducto> TraerDetalleCodigoBarraProductoBeans(List<DetalleCodigoBarraProducto> detallecodigobarraproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleCodigoBarraProducto detallecodigobarraproducto:detallecodigobarraproductos) {
					
				if(!(DetalleCodigoBarraProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleCodigoBarraProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallecodigobarraproducto.setsDetalleGeneralEntityReporte(DetalleCodigoBarraProductoConstantesFunciones.getDetalleCodigoBarraProductoDescripcion(detallecodigobarraproducto));
										
						
					
						
					
				} else  {
							
					//detallecodigobarraproducto.setsDetalleGeneralEntityReporte(detallecodigobarraproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallecodigobarraproductobeans.add(detallecodigobarraproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallecodigobarraproductos;
    }
	//PARA REPORTES FIN
}
