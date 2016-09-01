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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.inventario.util.ParametroInventarioDefectoConstantesFunciones;

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
public class ParametroInventarioDefectoJInternalFrame extends ParametroInventarioDefectoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroInventarioDefecto;
	
	protected JMenuBar jmenuBarParametroInventarioDefecto;
	
	protected JMenu jmenuParametroInventarioDefecto;
	protected JMenu jmenuDatosParametroInventarioDefecto;
	protected JMenu jmenuArchivoParametroInventarioDefecto;
	protected JMenu jmenuAccionesParametroInventarioDefecto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroInventarioDefecto;	
	protected GridBagConstraints gridBagConstraintsParametroInventarioDefecto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroInventarioDefectoDetalleFormJInternalFrame jInternalFrameDetalleFormParametroInventarioDefecto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroInventarioDefecto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroInventarioDefecto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected GrupoBodegaBeanSwingJInternalFrame grupobodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupobodega="";

	protected CalidadProductoBeanSwingJInternalFrame calidadproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_calidadproducto="";

	protected TipoServicioBeanSwingJInternalFrame tiposervicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiposervicio="";

	protected TipoProductoServicioInvenBeanSwingJInternalFrame tipoproductoservicioinvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproductoservicioinven="";

	protected TipoProductoServicioBeanSwingJInternalFrame tipoproductoservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproductoservicio="";

	protected TipoCosteoBeanSwingJInternalFrame tipocosteoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocosteo="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";

	protected TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoviatransporte="";

	protected RangoUnidadVentaBeanSwingJInternalFrame rangounidadventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rangounidadventa="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ColorProductoBeanSwingJInternalFrame colorproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_colorproducto="";

	protected ClaseProductoBeanSwingJInternalFrame claseproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_claseproducto="";

	protected EfectoProductoBeanSwingJInternalFrame efectoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_efectoproducto="";

	protected MarcaProductoBeanSwingJInternalFrame marcaproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_marcaproducto="";

	protected ModeloProductoBeanSwingJInternalFrame modeloproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modeloproducto="";

	protected MaterialProductoBeanSwingJInternalFrame materialproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_materialproducto="";

	protected SegmentoProductoBeanSwingJInternalFrame segmentoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_segmentoproducto="";

	protected TallaProductoBeanSwingJInternalFrame tallaproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tallaproducto="";
	
	public ParametroInventarioDefectoSessionBean parametroinventariodefectoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public GrupoBodegaSessionBean grupobodegaSessionBean;
	public CalidadProductoSessionBean calidadproductoSessionBean;
	public TipoServicioSessionBean tiposervicioSessionBean;
	public TipoProductoServicioInvenSessionBean tipoproductoservicioinvenSessionBean;
	public TipoProductoServicioSessionBean tipoproductoservicioSessionBean;
	public TipoCosteoSessionBean tipocosteoSessionBean;
	public TipoProductoSessionBean tipoproductoSessionBean;
	public TipoViaTransporteSessionBean tipoviatransporteSessionBean;
	public RangoUnidadVentaSessionBean rangounidadventaSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ColorProductoSessionBean colorproductoSessionBean;
	public ClaseProductoSessionBean claseproductoSessionBean;
	public EfectoProductoSessionBean efectoproductoSessionBean;
	public MarcaProductoSessionBean marcaproductoSessionBean;
	public ModeloProductoSessionBean modeloproductoSessionBean;
	public MaterialProductoSessionBean materialproductoSessionBean;
	public SegmentoProductoSessionBean segmentoproductoSessionBean;
	public TallaProductoSessionBean tallaproductoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroInventarioDefecto> parametroinventariodefectos;		
	public List<ParametroInventarioDefecto> parametroinventariodefectosEliminados;	
	public List<ParametroInventarioDefecto> parametroinventariodefectosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroInventarioDefecto;		
	protected JButton jButtonAbrirOrderByParametroInventarioDefecto;
	
	
	//protected JPanel jPanelOrderByParametroInventarioDefecto;
	//public JScrollPane jScrollPanelOrderByParametroInventarioDefecto;	
	//protected JButton jButtonCerrarOrderByParametroInventarioDefecto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroInventarioDefectoLogic parametroinventariodefectoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroInventarioDefecto;
	public JScrollPane jScrollPanelDatosEdicionParametroInventarioDefecto;
	public JScrollPane jScrollPanelDatosGeneralParametroInventarioDefecto;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroInventarioDefectoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroInventarioDefecto;
	//public JScrollPane jScrollPanelImportacionParametroInventarioDefecto;
	
	
	
	protected JPanel jPanelAccionesParametroInventarioDefecto;
	
    protected JPanel jPanelPaginacionParametroInventarioDefecto;
    protected JPanel jPanelParametrosReportesParametroInventarioDefecto;
	protected JPanel jPanelParametrosReportesAccionesParametroInventarioDefecto;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralParametroInventarioDefecto;
	protected Integer iXPanelCamposIniciogeneralParametroInventarioDefecto=0;
	protected Integer iYPanelCamposIniciogeneralParametroInventarioDefecto=0;

	protected JPanel jPanelCamposIniciocaracteristicaParametroInventarioDefecto;
	protected Integer iXPanelCamposIniciocaracteristicaParametroInventarioDefecto=0;
	protected Integer iYPanelCamposIniciocaracteristicaParametroInventarioDefecto=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroInventarioDefecto;
	protected JPanel jPanelParametrosAuxiliar2ParametroInventarioDefecto;
	protected JPanel jPanelParametrosAuxiliar3ParametroInventarioDefecto;
	protected JPanel jPanelParametrosAuxiliar4ParametroInventarioDefecto;
	//protected JPanel jPanelParametrosAuxiliar5ParametroInventarioDefecto;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroInventarioDefecto;
	//protected JPanel jPanelImportacionParametroInventarioDefecto;
	
	
	public JTable jTableDatosParametroInventarioDefecto;
	
	
	
	//public JTable jTableDatosParametroInventarioDefectoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroInventarioDefecto;
	protected JButton jButtonDuplicarParametroInventarioDefecto;
	protected JButton jButtonCopiarParametroInventarioDefecto;
	protected JButton jButtonVerFormParametroInventarioDefecto;
	protected JButton jButtonNuevoRelacionesParametroInventarioDefecto;
	protected JButton jButtonModificarParametroInventarioDefecto;
	
    protected JButton jButtonGuardarCambiosTablaParametroInventarioDefecto;
	protected JButton jButtonCerrarParametroInventarioDefecto;
	
	
	protected JButton jButtonRecargarInformacionParametroInventarioDefecto;
	protected JButton jButtonProcesarInformacionParametroInventarioDefecto;
	
	
	protected JButton jButtonAnterioresParametroInventarioDefecto;
	protected JButton jButtonSiguientesParametroInventarioDefecto;
	protected JButton jButtonNuevoGuardarCambiosParametroInventarioDefecto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroInventarioDefecto;
	//protected JButton jButtonCerrarReporteDinamicoParametroInventarioDefecto;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroInventarioDefecto;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroInventarioDefecto;
	//protected JButton jButtonGenerarImportacionParametroInventarioDefecto;
	//protected JButton jButtonCerrarImportacionParametroInventarioDefecto;
	//protected JFileChooser jFileChooserImportacionParametroInventarioDefecto;
	//protected File fileImportacionParametroInventarioDefecto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroInventarioDefecto;
	protected JButton jButtonDuplicarToolBarParametroInventarioDefecto;
	protected JButton jButtonNuevoRelacionesToolBarParametroInventarioDefecto;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroInventarioDefecto;
	protected JButton jButtonCopiarToolBarParametroInventarioDefecto;
	protected JButton jButtonVerFormToolBarParametroInventarioDefecto;
	public JButton jButtonGuardarCambiosTablaToolBarParametroInventarioDefecto;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroInventarioDefecto;
	protected JButton jButtonCerrarToolBarParametroInventarioDefecto;
	
	protected JButton jButtonRecargarInformacionToolBarParametroInventarioDefecto;
	protected JButton jButtonProcesarInformacionToolBarParametroInventarioDefecto;
	protected JButton jButtonAnterioresToolBarParametroInventarioDefecto;
	protected JButton jButtonSiguientesToolBarParametroInventarioDefecto;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroInventarioDefecto;
	protected JButton jButtonAbrirOrderByToolBarParametroInventarioDefecto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroInventarioDefecto;
	protected JMenuItem jMenuItemDuplicarParametroInventarioDefecto;
	protected JMenuItem jMenuItemNuevoRelacionesParametroInventarioDefecto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroInventarioDefecto;
	protected JMenuItem jMenuItemCopiarParametroInventarioDefecto;
	protected JMenuItem jMenuItemVerFormParametroInventarioDefecto;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroInventarioDefecto;
	protected JMenuItem jMenuItemCerrarParametroInventarioDefecto;
	protected JMenuItem jMenuItemDetalleCerrarParametroInventarioDefecto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroInventarioDefecto;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroInventarioDefecto;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroInventarioDefecto;
	protected JMenuItem jMenuItemProcesarInformacionParametroInventarioDefecto;
	protected JMenuItem jMenuItemAnterioresParametroInventarioDefecto;
	protected JMenuItem jMenuItemSiguientesParametroInventarioDefecto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroInventarioDefecto;
	protected JMenuItem jMenuItemAbrirOrderByParametroInventarioDefecto;
	protected JMenuItem jMenuItemMostrarOcultarParametroInventarioDefecto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroInventarioDefecto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroInventarioDefecto;
	protected JCheckBox jCheckBoxSeleccionadosParametroInventarioDefecto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroInventarioDefecto;
	protected JCheckBox jCheckBoxConGraficoReporteParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroInventarioDefecto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroInventarioDefecto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroInventarioDefecto;
	protected JTextField jTextFieldValorCampoGeneralParametroInventarioDefecto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroInventarioDefecto;
	//public JList<Reporte> jListColumnasSelectReporteParametroInventarioDefecto;
	//public JScrollPane jScrollColumnasSelectReporteParametroInventarioDefecto;
	
	//public JLabel jLabelRelacionesSelectReporteParametroInventarioDefecto;
	//public JList<Reporte> jListRelacionesSelectReporteParametroInventarioDefecto;
	//public JScrollPane jScrollRelacionesSelectReporteParametroInventarioDefecto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroInventarioDefecto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroInventarioDefecto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroInventarioDefecto;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroInventarioDefecto;
	
		
	//public JLabel jLabelArchivoImportacionParametroInventarioDefecto;	
	//public JLabel jLabelPathArchivoImportacionParametroInventarioDefecto;
	//protected JTextField jTextFieldPathArchivoImportacionParametroInventarioDefecto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroInventarioDefecto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroInventarioDefecto;
	
	//public JLabel jLabelColumnaCategoriaValorParametroInventarioDefecto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroInventarioDefecto;
	
	//public JLabel jLabelColumnasValoresGraficoParametroInventarioDefecto;
	//public JList<Reporte> jListColumnasValoresGraficoParametroInventarioDefecto;
	//public JScrollPane jScrollColumnasValoresGraficoParametroInventarioDefecto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroInventarioDefecto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroInventarioDefecto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroInventarioDefecto;
	public JPanel jPanelFK_IdCalidadProductoParametroInventarioDefecto;
	public JButton jButtonFK_IdCalidadProductoParametroInventarioDefecto;
	public JPanel jPanelFK_IdCiudadParametroInventarioDefecto;
	public JButton jButtonFK_IdCiudadParametroInventarioDefecto;
	public JPanel jPanelFK_IdClaseProductoParametroInventarioDefecto;
	public JButton jButtonFK_IdClaseProductoParametroInventarioDefecto;
	public JPanel jPanelFK_IdColorProductoParametroInventarioDefecto;
	public JButton jButtonFK_IdColorProductoParametroInventarioDefecto;
	public JPanel jPanelFK_IdEfectoProductoParametroInventarioDefecto;
	public JButton jButtonFK_IdEfectoProductoParametroInventarioDefecto;
	public JPanel jPanelFK_IdGrupoBodegaParametroInventarioDefecto;
	public JButton jButtonFK_IdGrupoBodegaParametroInventarioDefecto;
	public JPanel jPanelFK_IdMarcaProductoParametroInventarioDefecto;
	public JButton jButtonFK_IdMarcaProductoParametroInventarioDefecto;
	public JPanel jPanelFK_IdMaterialProductoParametroInventarioDefecto;
	public JButton jButtonFK_IdMaterialProductoParametroInventarioDefecto;
	public JPanel jPanelFK_IdModeloProductoParametroInventarioDefecto;
	public JButton jButtonFK_IdModeloProductoParametroInventarioDefecto;
	public JPanel jPanelFK_IdPaisParametroInventarioDefecto;
	public JButton jButtonFK_IdPaisParametroInventarioDefecto;
	public JPanel jPanelFK_IdRangoUnidadVentaParametroInventarioDefecto;
	public JButton jButtonFK_IdRangoUnidadVentaParametroInventarioDefecto;
	public JPanel jPanelFK_IdSegmentoProductoParametroInventarioDefecto;
	public JButton jButtonFK_IdSegmentoProductoParametroInventarioDefecto;
	public JPanel jPanelFK_IdTallaProductoParametroInventarioDefecto;
	public JButton jButtonFK_IdTallaProductoParametroInventarioDefecto;
	public JPanel jPanelFK_IdTipoCosteoParametroInventarioDefecto;
	public JButton jButtonFK_IdTipoCosteoParametroInventarioDefecto;
	public JPanel jPanelFK_IdTipoProductoParametroInventarioDefecto;
	public JButton jButtonFK_IdTipoProductoParametroInventarioDefecto;
	public JPanel jPanelFK_IdTipoProductoServicioParametroInventarioDefecto;
	public JButton jButtonFK_IdTipoProductoServicioParametroInventarioDefecto;
	public JPanel jPanelFK_IdTipoProductoServicioInvenParametroInventarioDefecto;
	public JButton jButtonFK_IdTipoProductoServicioInvenParametroInventarioDefecto;
	public JPanel jPanelFK_IdTipoServicioParametroInventarioDefecto;
	public JButton jButtonFK_IdTipoServicioParametroInventarioDefecto;
	public JPanel jPanelFK_IdTipoViaTransporteParametroInventarioDefecto;
	public JButton jButtonFK_IdTipoViaTransporteParametroInventarioDefecto;
	
	public JPanel jPanelid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto;
	public JLabel jLabelid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto;
	public JButton jButtonid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_calidad_productoFK_IdCalidadProductoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_calidad_productoFK_IdCalidadProductoParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ciudadFK_IdCiudadParametroInventarioDefecto;
	public JLabel jLabelid_ciudadFK_IdCiudadParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadFK_IdCiudadParametroInventarioDefecto;
	public JButton jButtonid_ciudadFK_IdCiudadParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clase_productoFK_IdClaseProductoParametroInventarioDefecto;
	public JLabel jLabelid_clase_productoFK_IdClaseProductoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clase_productoFK_IdClaseProductoParametroInventarioDefecto;
	public JButton jButtonid_clase_productoFK_IdClaseProductoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_clase_productoFK_IdClaseProductoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_clase_productoFK_IdClaseProductoParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_color_productoFK_IdColorProductoParametroInventarioDefecto;
	public JLabel jLabelid_color_productoFK_IdColorProductoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_color_productoFK_IdColorProductoParametroInventarioDefecto;
	public JButton jButtonid_color_productoFK_IdColorProductoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_color_productoFK_IdColorProductoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_color_productoFK_IdColorProductoParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto;
	public JLabel jLabelid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto;
	public JButton jButtonid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_efecto_productoFK_IdEfectoProductoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_efecto_productoFK_IdEfectoProductoParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto;
	public JLabel jLabelid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto;
	public JButton jButtonid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto;
	public JLabel jLabelid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto;
	public JButton jButtonid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_marca_productoFK_IdMarcaProductoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_marca_productoFK_IdMarcaProductoParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_material_productoFK_IdMaterialProductoParametroInventarioDefecto;
	public JLabel jLabelid_material_productoFK_IdMaterialProductoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_material_productoFK_IdMaterialProductoParametroInventarioDefecto;
	public JButton jButtonid_material_productoFK_IdMaterialProductoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_material_productoFK_IdMaterialProductoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_material_productoFK_IdMaterialProductoParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto;
	public JLabel jLabelid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto;
	public JButton jButtonid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_modelo_productoFK_IdModeloProductoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_modelo_productoFK_IdModeloProductoParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisParametroInventarioDefecto;
	public JLabel jLabelid_paisFK_IdPaisParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisParametroInventarioDefecto;
	public JButton jButtonid_paisFK_IdPaisParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto;
	public JLabel jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto;
	public JButton jButtonid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto;
	public JLabel jLabelid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto;
	public JButton jButtonid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_talla_productoFK_IdTallaProductoParametroInventarioDefecto;
	public JLabel jLabelid_talla_productoFK_IdTallaProductoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_talla_productoFK_IdTallaProductoParametroInventarioDefecto;
	public JButton jButtonid_talla_productoFK_IdTallaProductoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_talla_productoFK_IdTallaProductoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_talla_productoFK_IdTallaProductoParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto;
	public JLabel jLabelid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto;
	public JButton jButtonid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto;
	public JLabel jLabelid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto;
	public JButton jButtonid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto;
	public JLabel jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto;
	public JButton jButtonid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto;
	public JLabel jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto;
	public JButton jButtonid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto;
	public JLabel jLabelid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto;
	public JButton jButtonid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_tipo_servicioFK_IdTipoServicioParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_servicioFK_IdTipoServicioParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto;
	public JLabel jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto;
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefectoBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroInventarioDefectoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroInventarioDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroInventarioDefectoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroInventarioDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroInventarioDefectoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroInventarioDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroInventarioDefectoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroInventarioDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroInventarioDefecto)	{
		this.jButtonRecargarInformacionParametroInventarioDefecto = jButtonRecargarInformacionParametroInventarioDefecto;
	}
	
	public JButton getjButtonProcesarInformacionParametroInventarioDefecto() {
		return this.jButtonProcesarInformacionParametroInventarioDefecto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroInventarioDefecto)	{
		this.jButtonProcesarInformacionParametroInventarioDefecto = jButtonProcesarInformacionParametroInventarioDefecto;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroInventarioDefecto() {
		return this.jButtonRecargarInformacionParametroInventarioDefecto;
	}
	
	
	public List<ParametroInventarioDefecto> getparametroinventariodefectos() {
		return this.parametroinventariodefectos;
	}

	public void setparametroinventariodefectos(List<ParametroInventarioDefecto> parametroinventariodefectos) {
		this.parametroinventariodefectos = parametroinventariodefectos;
	}
	
	public List<ParametroInventarioDefecto> getparametroinventariodefectosAux() {
		return this.parametroinventariodefectosAux;
	}

	public void setparametroinventariodefectosAux(List<ParametroInventarioDefecto> parametroinventariodefectosAux) {
		this.parametroinventariodefectosAux = parametroinventariodefectosAux;
	}
	
	public List<ParametroInventarioDefecto> getparametroinventariodefectosEliminados() {
		return this.parametroinventariodefectosEliminados;
	}

	public void setParametroInventarioDefectosEliminados(List<ParametroInventarioDefecto> parametroinventariodefectosEliminados) {
		this.parametroinventariodefectosEliminados = parametroinventariodefectosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroInventarioDefecto() {
		return jComboBoxTiposSeleccionarParametroInventarioDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroInventarioDefecto(
			JComboBox jComboBoxTiposSeleccionarParametroInventarioDefecto) {
		this.jComboBoxTiposSeleccionarParametroInventarioDefecto = jComboBoxTiposSeleccionarParametroInventarioDefecto;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroInventarioDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroInventarioDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroInventarioDefecto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroInventarioDefecto() {
		return jTextFieldValorCampoGeneralParametroInventarioDefecto;
	}

	public void setjTextFieldValorCampoGeneralParametroInventarioDefecto(
			JTextField jTextFieldValorCampoGeneralParametroInventarioDefecto) {
		this.jTextFieldValorCampoGeneralParametroInventarioDefecto = jTextFieldValorCampoGeneralParametroInventarioDefecto;
	}

	public void setBorderResaltarValorCampoGeneralParametroInventarioDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInventarioDefecto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroInventarioDefecto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroInventarioDefecto() {
		return this.jCheckBoxSeleccionarTodosParametroInventarioDefecto;
	}

	public void setjCheckBoxSeleccionarTodosParametroInventarioDefecto(
			JCheckBox jCheckBoxSeleccionarTodosParametroInventarioDefecto) {
		this.jCheckBoxSeleccionarTodosParametroInventarioDefecto = jCheckBoxSeleccionarTodosParametroInventarioDefecto;
	}

	public void setBorderResaltarSeleccionarTodosParametroInventarioDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInventarioDefecto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroInventarioDefecto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroInventarioDefecto() {
		return this.jCheckBoxSeleccionadosParametroInventarioDefecto;
	}

	public void setjCheckBoxSeleccionadosParametroInventarioDefecto(
			JCheckBox jCheckBoxSeleccionadosParametroInventarioDefecto) {
		this.jCheckBoxSeleccionadosParametroInventarioDefecto = jCheckBoxSeleccionadosParametroInventarioDefecto;
	}
	
	public void setBorderResaltarSeleccionadosParametroInventarioDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInventarioDefecto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroInventarioDefecto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroInventarioDefecto() {
		return this.jComboBoxTiposArchivosReportesParametroInventarioDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroInventarioDefecto(
			JComboBox jComboBoxTiposArchivosReportesParametroInventarioDefecto) {
		this.jComboBoxTiposArchivosReportesParametroInventarioDefecto = jComboBoxTiposArchivosReportesParametroInventarioDefecto;
	}

	public void setBorderResaltarTiposArchivosReportesParametroInventarioDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInventarioDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroInventarioDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroInventarioDefecto() {
		return this.jComboBoxTiposReportesParametroInventarioDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroInventarioDefecto(
			JComboBox jComboBoxTiposReportesParametroInventarioDefecto) {
		this.jComboBoxTiposReportesParametroInventarioDefecto = jComboBoxTiposReportesParametroInventarioDefecto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroInventarioDefecto() {
	//	return jComboBoxTiposReportesDinamicoParametroInventarioDefecto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroInventarioDefecto(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroInventarioDefecto) {
	//	this.jComboBoxTiposReportesDinamicoParametroInventarioDefecto = jComboBoxTiposReportesDinamicoParametroInventarioDefecto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroInventarioDefecto() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroInventarioDefecto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroInventarioDefecto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroInventarioDefecto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroInventarioDefecto = jComboBoxTiposArchivosReportesDinamicoParametroInventarioDefecto;
	//}
	
	public void setBorderResaltarTiposReportesParametroInventarioDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInventarioDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroInventarioDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroInventarioDefecto() {
		return this.jComboBoxTiposGraficosReportesParametroInventarioDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroInventarioDefecto(
			JComboBox jComboBoxTiposGraficosReportesParametroInventarioDefecto) {
		this.jComboBoxTiposGraficosReportesParametroInventarioDefecto = jComboBoxTiposGraficosReportesParametroInventarioDefecto;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroInventarioDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInventarioDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroInventarioDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroInventarioDefecto() {
		return this.jComboBoxTiposPaginacionParametroInventarioDefecto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroInventarioDefecto(
			JComboBox jComboBoxTiposPaginacionParametroInventarioDefecto) {
		this.jComboBoxTiposPaginacionParametroInventarioDefecto = jComboBoxTiposPaginacionParametroInventarioDefecto;
	}
	
	public void setBorderResaltarTiposPaginacionParametroInventarioDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInventarioDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroInventarioDefecto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroInventarioDefecto() {
		return this.jComboBoxTiposRelacionesParametroInventarioDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroInventarioDefecto() {
		return this.jComboBoxTiposAccionesParametroInventarioDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroInventarioDefecto(
			JComboBox jComboBoxTiposRelacionesParametroInventarioDefecto) {
		this.jComboBoxTiposRelacionesParametroInventarioDefecto = jComboBoxTiposRelacionesParametroInventarioDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroInventarioDefecto(
			JComboBox jComboBoxTiposAccionesParametroInventarioDefecto) {
		this.jComboBoxTiposAccionesParametroInventarioDefecto = jComboBoxTiposAccionesParametroInventarioDefecto;
	}
	
	public void setBorderResaltarTiposRelacionesParametroInventarioDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInventarioDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroInventarioDefecto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroInventarioDefecto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroInventarioDefecto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroInventarioDefecto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroInventarioDefecto() {
	//	return jCheckBoxConGraficoDinamicoParametroInventarioDefecto;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroInventarioDefecto(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroInventarioDefecto) {
	//	this.jCheckBoxConGraficoDinamicoParametroInventarioDefecto = jCheckBoxConGraficoDinamicoParametroInventarioDefecto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroInventarioDefecto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroInventarioDefecto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroInventarioDefecto .setBorder(borderResaltar);		
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
		this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		
		this.parametroinventariodefectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroInventarioDefectoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Inventario Defecto MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroInventarioDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroInventarioDefecto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroInventarioDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroInventarioDefecto,this.jTtoolBarParametroInventarioDefecto,
							"nuevo","nuevo","Nuevo"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroInventarioDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroInventarioDefecto,this.jTtoolBarParametroInventarioDefecto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroInventarioDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroInventarioDefecto,this.jTtoolBarParametroInventarioDefecto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroInventarioDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroInventarioDefecto,this.jTtoolBarParametroInventarioDefecto,
							"duplicar","duplicar","Duplicar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroInventarioDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroInventarioDefecto,this.jTtoolBarParametroInventarioDefecto,
							"copiar","copiar","Copiar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroInventarioDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroInventarioDefecto,this.jTtoolBarParametroInventarioDefecto,
							"ver_form","ver_form","Ver"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroInventarioDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroInventarioDefecto,this.jTtoolBarParametroInventarioDefecto,
							"recargar","recargar","Recargar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroInventarioDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroInventarioDefecto,this.jTtoolBarParametroInventarioDefecto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroInventarioDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroInventarioDefecto,this.jTtoolBarParametroInventarioDefecto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroInventarioDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroInventarioDefecto,this.jTtoolBarParametroInventarioDefecto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroInventarioDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroInventarioDefecto,this.jTtoolBarParametroInventarioDefecto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroInventarioDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroInventarioDefecto,this.jTtoolBarParametroInventarioDefecto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroInventarioDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroInventarioDefecto,this.jTtoolBarParametroInventarioDefecto,
							"cerrar","cerrar","Salir"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroInventarioDefecto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroInventarioDefecto;
			
				this.jButtonProcesarInformacionToolBarParametroInventarioDefecto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroInventarioDefecto;
				
		//protected JButton jButtonModificarToolBarParametroInventarioDefecto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroInventarioDefecto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroInventarioDefecto=new JMenuMe("General");
		this.jmenuArchivoParametroInventarioDefecto=new JMenuMe("Archivo");
		this.jmenuAccionesParametroInventarioDefecto=new JMenuMe("Acciones");
		this.jmenuDatosParametroInventarioDefecto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroInventarioDefecto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroInventarioDefecto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroInventarioDefecto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroInventarioDefecto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroInventarioDefecto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroInventarioDefecto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroInventarioDefecto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroInventarioDefecto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroInventarioDefecto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroInventarioDefecto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroInventarioDefecto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroInventarioDefecto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroInventarioDefecto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroInventarioDefecto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroInventarioDefecto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroInventarioDefecto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroInventarioDefecto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroInventarioDefecto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroInventarioDefecto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroInventarioDefecto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroInventarioDefecto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroInventarioDefecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroInventarioDefecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroInventarioDefecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroInventarioDefecto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroInventarioDefecto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroInventarioDefecto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroInventarioDefecto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroInventarioDefecto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroInventarioDefecto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroInventarioDefecto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroInventarioDefecto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroInventarioDefecto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroInventarioDefecto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroInventarioDefecto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroInventarioDefecto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroInventarioDefecto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroInventarioDefecto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroInventarioDefecto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroInventarioDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroInventarioDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroInventarioDefecto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroInventarioDefecto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroInventarioDefecto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroInventarioDefecto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroInventarioDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroInventarioDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroInventarioDefecto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroInventarioDefecto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroInventarioDefecto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroInventarioDefecto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroInventarioDefecto.add(this.jMenuItemCerrarParametroInventarioDefecto);
			
			this.jmenuAccionesParametroInventarioDefecto.add(this.jMenuItemNuevoParametroInventarioDefecto);
			this.jmenuAccionesParametroInventarioDefecto.add(this.jMenuItemNuevoGuardarCambiosParametroInventarioDefecto);
			this.jmenuAccionesParametroInventarioDefecto.add(this.jMenuItemNuevoRelacionesParametroInventarioDefecto);
			this.jmenuAccionesParametroInventarioDefecto.add(this.jMenuItemGuardarCambiosTablaParametroInventarioDefecto);		
			this.jmenuAccionesParametroInventarioDefecto.add(this.jMenuItemDuplicarParametroInventarioDefecto);		
			this.jmenuAccionesParametroInventarioDefecto.add(this.jMenuItemCopiarParametroInventarioDefecto);		
			this.jmenuAccionesParametroInventarioDefecto.add(this.jMenuItemVerFormParametroInventarioDefecto);		
			
			this.jmenuDatosParametroInventarioDefecto.add(this.jMenuItemRecargarInformacionParametroInventarioDefecto);				
			this.jmenuDatosParametroInventarioDefecto.add(this.jMenuItemAnterioresParametroInventarioDefecto);				
			this.jmenuDatosParametroInventarioDefecto.add(this.jMenuItemSiguientesParametroInventarioDefecto);				
			this.jmenuDatosParametroInventarioDefecto.add(this.jMenuItemAbrirOrderByParametroInventarioDefecto);				
			this.jmenuDatosParametroInventarioDefecto.add(this.jMenuItemMostrarOcultarParametroInventarioDefecto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroInventarioDefecto.add(this.jMenuItemGuardarCambiosParametroInventarioDefecto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroInventarioDefecto.add(this.jmenuArchivoParametroInventarioDefecto);		
			this.jmenuBarParametroInventarioDefecto.add(this.jmenuAccionesParametroInventarioDefecto);		
			this.jmenuBarParametroInventarioDefecto.add(this.jmenuDatosParametroInventarioDefecto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroInventarioDefecto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroInventarioDefecto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCalidadProductoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCalidadProductoParametroInventarioDefecto.setToolTipText("Buscar Por Calidad Producto ");
		this.jButtonFK_IdCalidadProductoParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdCalidadProductoParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdCalidadProductoParametroInventarioDefecto.setToolTipText("Buscar Por Calidad Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCalidadProductoParametroInventarioDefecto,"buscar_button","Buscar Por Calidad Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCalidadProductoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto = new JLabelMe();
		jLabelid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto.setText("Calidad Producto :");
		jLabelid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto.setToolTipText("Calidad Producto");
		jLabelid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCiudadParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadParametroInventarioDefecto.setToolTipText("Buscar Por Ciudad ");
		this.jButtonFK_IdCiudadParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdCiudadParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdCiudadParametroInventarioDefecto.setToolTipText("Buscar Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadParametroInventarioDefecto,"buscar_button","Buscar Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ciudadFK_IdCiudadParametroInventarioDefecto = new JLabelMe();
		jLabelid_ciudadFK_IdCiudadParametroInventarioDefecto.setText("Ciudad :");
		jLabelid_ciudadFK_IdCiudadParametroInventarioDefecto.setToolTipText("Ciudad");
		jLabelid_ciudadFK_IdCiudadParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadFK_IdCiudadParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadFK_IdCiudadParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_ciudadFK_IdCiudadParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadFK_IdCiudadParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClaseProductoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClaseProductoParametroInventarioDefecto.setToolTipText("Buscar Por Clase Producto ");
		this.jButtonFK_IdClaseProductoParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdClaseProductoParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdClaseProductoParametroInventarioDefecto.setToolTipText("Buscar Por Clase Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClaseProductoParametroInventarioDefecto,"buscar_button","Buscar Por Clase Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClaseProductoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clase_productoFK_IdClaseProductoParametroInventarioDefecto = new JLabelMe();
		jLabelid_clase_productoFK_IdClaseProductoParametroInventarioDefecto.setText("Clase Producto :");
		jLabelid_clase_productoFK_IdClaseProductoParametroInventarioDefecto.setToolTipText("Clase Producto");
		jLabelid_clase_productoFK_IdClaseProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clase_productoFK_IdClaseProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clase_productoFK_IdClaseProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clase_productoFK_IdClaseProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clase_productoFK_IdClaseProductoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_clase_productoFK_IdClaseProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clase_productoFK_IdClaseProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clase_productoFK_IdClaseProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clase_productoFK_IdClaseProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdColorProductoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdColorProductoParametroInventarioDefecto.setToolTipText("Buscar Por Color Producto ");
		this.jButtonFK_IdColorProductoParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdColorProductoParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdColorProductoParametroInventarioDefecto.setToolTipText("Buscar Por Color Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdColorProductoParametroInventarioDefecto,"buscar_button","Buscar Por Color Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdColorProductoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_color_productoFK_IdColorProductoParametroInventarioDefecto = new JLabelMe();
		jLabelid_color_productoFK_IdColorProductoParametroInventarioDefecto.setText("Color Producto :");
		jLabelid_color_productoFK_IdColorProductoParametroInventarioDefecto.setToolTipText("Color Producto");
		jLabelid_color_productoFK_IdColorProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_color_productoFK_IdColorProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_color_productoFK_IdColorProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_color_productoFK_IdColorProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_color_productoFK_IdColorProductoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_color_productoFK_IdColorProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_productoFK_IdColorProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_productoFK_IdColorProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_color_productoFK_IdColorProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEfectoProductoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEfectoProductoParametroInventarioDefecto.setToolTipText("Buscar Por Efecto Producto ");
		this.jButtonFK_IdEfectoProductoParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdEfectoProductoParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdEfectoProductoParametroInventarioDefecto.setToolTipText("Buscar Por Efecto Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEfectoProductoParametroInventarioDefecto,"buscar_button","Buscar Por Efecto Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEfectoProductoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto = new JLabelMe();
		jLabelid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto.setText("Efecto Producto :");
		jLabelid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto.setToolTipText("Efecto Producto");
		jLabelid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdGrupoBodegaParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdGrupoBodegaParametroInventarioDefecto.setToolTipText("Buscar Por Grupo Bodega ");
		this.jButtonFK_IdGrupoBodegaParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdGrupoBodegaParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdGrupoBodegaParametroInventarioDefecto.setToolTipText("Buscar Por Grupo Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdGrupoBodegaParametroInventarioDefecto,"buscar_button","Buscar Por Grupo Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdGrupoBodegaParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto = new JLabelMe();
		jLabelid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto.setText("Grupo Bodega :");
		jLabelid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto.setToolTipText("Grupo Bodega");
		jLabelid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMarcaProductoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMarcaProductoParametroInventarioDefecto.setToolTipText("Buscar Por Marca Producto ");
		this.jButtonFK_IdMarcaProductoParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdMarcaProductoParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdMarcaProductoParametroInventarioDefecto.setToolTipText("Buscar Por Marca Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMarcaProductoParametroInventarioDefecto,"buscar_button","Buscar Por Marca Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMarcaProductoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto = new JLabelMe();
		jLabelid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto.setText("Marca Producto :");
		jLabelid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto.setToolTipText("Marca Producto");
		jLabelid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMaterialProductoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMaterialProductoParametroInventarioDefecto.setToolTipText("Buscar Por Material Producto ");
		this.jButtonFK_IdMaterialProductoParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdMaterialProductoParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdMaterialProductoParametroInventarioDefecto.setToolTipText("Buscar Por Material Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMaterialProductoParametroInventarioDefecto,"buscar_button","Buscar Por Material Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMaterialProductoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_material_productoFK_IdMaterialProductoParametroInventarioDefecto = new JLabelMe();
		jLabelid_material_productoFK_IdMaterialProductoParametroInventarioDefecto.setText("Material Producto :");
		jLabelid_material_productoFK_IdMaterialProductoParametroInventarioDefecto.setToolTipText("Material Producto");
		jLabelid_material_productoFK_IdMaterialProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_material_productoFK_IdMaterialProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_material_productoFK_IdMaterialProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_material_productoFK_IdMaterialProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_material_productoFK_IdMaterialProductoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_material_productoFK_IdMaterialProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_material_productoFK_IdMaterialProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_material_productoFK_IdMaterialProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_material_productoFK_IdMaterialProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdModeloProductoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdModeloProductoParametroInventarioDefecto.setToolTipText("Buscar Por Modelo Producto ");
		this.jButtonFK_IdModeloProductoParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdModeloProductoParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdModeloProductoParametroInventarioDefecto.setToolTipText("Buscar Por Modelo Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdModeloProductoParametroInventarioDefecto,"buscar_button","Buscar Por Modelo Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdModeloProductoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto = new JLabelMe();
		jLabelid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto.setText("Modelo Producto :");
		jLabelid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto.setToolTipText("Modelo Producto");
		jLabelid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisParametroInventarioDefecto.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdPaisParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdPaisParametroInventarioDefecto.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisParametroInventarioDefecto,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisParametroInventarioDefecto = new JLabelMe();
		jLabelid_paisFK_IdPaisParametroInventarioDefecto.setText("Pais :");
		jLabelid_paisFK_IdPaisParametroInventarioDefecto.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdRangoUnidadVentaParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRangoUnidadVentaParametroInventarioDefecto.setToolTipText("Buscar Por Rango Unidad Venta ");
		this.jButtonFK_IdRangoUnidadVentaParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdRangoUnidadVentaParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdRangoUnidadVentaParametroInventarioDefecto.setToolTipText("Buscar Por Rango Unidad Venta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRangoUnidadVentaParametroInventarioDefecto,"buscar_button","Buscar Por Rango Unidad Venta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRangoUnidadVentaParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto = new JLabelMe();
		jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto.setText("Rango Unidad Venta :");
		jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto.setToolTipText("Rango Unidad Venta");
		jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSegmentoProductoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSegmentoProductoParametroInventarioDefecto.setToolTipText("Buscar Por Segmento Producto ");
		this.jButtonFK_IdSegmentoProductoParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdSegmentoProductoParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdSegmentoProductoParametroInventarioDefecto.setToolTipText("Buscar Por Segmento Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSegmentoProductoParametroInventarioDefecto,"buscar_button","Buscar Por Segmento Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSegmentoProductoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto = new JLabelMe();
		jLabelid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto.setText("Segmento Producto :");
		jLabelid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto.setToolTipText("Segmento Producto");
		jLabelid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTallaProductoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTallaProductoParametroInventarioDefecto.setToolTipText("Buscar Por Talla Producto ");
		this.jButtonFK_IdTallaProductoParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdTallaProductoParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdTallaProductoParametroInventarioDefecto.setToolTipText("Buscar Por Talla Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTallaProductoParametroInventarioDefecto,"buscar_button","Buscar Por Talla Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTallaProductoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_talla_productoFK_IdTallaProductoParametroInventarioDefecto = new JLabelMe();
		jLabelid_talla_productoFK_IdTallaProductoParametroInventarioDefecto.setText("Talla Producto :");
		jLabelid_talla_productoFK_IdTallaProductoParametroInventarioDefecto.setToolTipText("Talla Producto");
		jLabelid_talla_productoFK_IdTallaProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_talla_productoFK_IdTallaProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_talla_productoFK_IdTallaProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_talla_productoFK_IdTallaProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_talla_productoFK_IdTallaProductoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_talla_productoFK_IdTallaProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_talla_productoFK_IdTallaProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_talla_productoFK_IdTallaProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_talla_productoFK_IdTallaProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCosteoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCosteoParametroInventarioDefecto.setToolTipText("Buscar Por Tipo Costeo ");
		this.jButtonFK_IdTipoCosteoParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdTipoCosteoParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdTipoCosteoParametroInventarioDefecto.setToolTipText("Buscar Por Tipo Costeo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCosteoParametroInventarioDefecto,"buscar_button","Buscar Por Tipo Costeo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCosteoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto = new JLabelMe();
		jLabelid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto.setText("Tipo Costeo :");
		jLabelid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto.setToolTipText("Tipo Costeo");
		jLabelid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProductoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProductoParametroInventarioDefecto.setToolTipText("Buscar Por Tipo Producto ");
		this.jButtonFK_IdTipoProductoParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdTipoProductoParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdTipoProductoParametroInventarioDefecto.setToolTipText("Buscar Por Tipo Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProductoParametroInventarioDefecto,"buscar_button","Buscar Por Tipo Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProductoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto = new JLabelMe();
		jLabelid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto.setText("Tipo Producto :");
		jLabelid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto.setToolTipText("Tipo Producto");
		jLabelid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProductoServicioParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProductoServicioParametroInventarioDefecto.setToolTipText("Buscar Por Tipo Producto Servicio ");
		this.jButtonFK_IdTipoProductoServicioParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdTipoProductoServicioParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdTipoProductoServicioParametroInventarioDefecto.setToolTipText("Buscar Por Tipo Producto Servicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProductoServicioParametroInventarioDefecto,"buscar_button","Buscar Por Tipo Producto Servicio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProductoServicioParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto = new JLabelMe();
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto.setText("Tipo Producto Servicio :");
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto.setToolTipText("Tipo Producto Servicio");
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProductoServicioInvenParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProductoServicioInvenParametroInventarioDefecto.setToolTipText("Buscar Por Tipo Producto Servicio. ");
		this.jButtonFK_IdTipoProductoServicioInvenParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdTipoProductoServicioInvenParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdTipoProductoServicioInvenParametroInventarioDefecto.setToolTipText("Buscar Por Tipo Producto Servicio. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProductoServicioInvenParametroInventarioDefecto,"buscar_button","Buscar Por Tipo Producto Servicio. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProductoServicioInvenParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto = new JLabelMe();
		jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto.setText("Tipo Producto Servicio. :");
		jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto.setToolTipText("Tipo Producto Servicio.");
		jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoServicioParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoServicioParametroInventarioDefecto.setToolTipText("Buscar Por Tipo Servicio ");
		this.jButtonFK_IdTipoServicioParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdTipoServicioParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdTipoServicioParametroInventarioDefecto.setToolTipText("Buscar Por Tipo Servicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoServicioParametroInventarioDefecto,"buscar_button","Buscar Por Tipo Servicio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoServicioParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto = new JLabelMe();
		jLabelid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto.setText("Tipo Servicio :");
		jLabelid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto.setToolTipText("Tipo Servicio");
		jLabelid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoViaTransporteParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoViaTransporteParametroInventarioDefecto.setToolTipText("Buscar Por Tipo Via Transporte ");
		this.jButtonFK_IdTipoViaTransporteParametroInventarioDefecto= new JButtonMe();
		this.jButtonFK_IdTipoViaTransporteParametroInventarioDefecto.setText("Buscar");
		this.jButtonFK_IdTipoViaTransporteParametroInventarioDefecto.setToolTipText("Buscar Por Tipo Via Transporte ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoViaTransporteParametroInventarioDefecto,"buscar_button","Buscar Por Tipo Via Transporte ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoViaTransporteParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto = new JLabelMe();
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto.setText("Tipo Via Transporte :");
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto.setToolTipText("Tipo Via Transporte");
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroInventarioDefecto=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroInventarioDefecto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroInventarioDefecto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasParametroInventarioDefecto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroInventarioDefecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroInventarioDefecto = new ParametroInventarioDefectoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Inventario Defecto DATOS");
			this.jInternalFrameDetalleFormParametroInventarioDefecto = new ParametroInventarioDefectoDetalleFormJInternalFrame(jDesktopPane,this.parametroinventariodefectoSessionBean.getConGuardarRelaciones(),this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroInventarioDefecto = null;//new ParametroInventarioDefectoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroInventarioDefecto= new GridBagLayout();
		
		
		this.jTableDatosParametroInventarioDefecto = new JTableMe();      
		
		String sToolTipParametroInventarioDefecto="";
		sToolTipParametroInventarioDefecto=ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroInventarioDefecto+="(Inventario.ParametroInventarioDefecto)";
		}
		
		if(!this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroInventarioDefecto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroInventarioDefecto.setToolTipText(sToolTipParametroInventarioDefecto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroInventarioDefecto);
		this.jTableDatosParametroInventarioDefecto.setAutoCreateRowSorter(true);
		this.jTableDatosParametroInventarioDefecto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroInventarioDefecto.setRowSelectionAllowed(true);
		this.jTableDatosParametroInventarioDefecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroInventarioDefecto = new JButtonMe();
		this.jButtonDuplicarParametroInventarioDefecto = new JButtonMe();
		this.jButtonCopiarParametroInventarioDefecto = new JButtonMe();
		this.jButtonVerFormParametroInventarioDefecto = new JButtonMe();
		this.jButtonNuevoRelacionesParametroInventarioDefecto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroInventarioDefecto = new JButtonMe();
		this.jButtonCerrarParametroInventarioDefecto = new JButtonMe();
		
		this.jScrollPanelDatosParametroInventarioDefecto = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroInventarioDefecto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Parametro Inventario Defecto";
		
		if(!this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Inventario Defectos" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroInventarioDefecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroInventarioDefecto.setToolTipText("Acciones");
        this.jPanelAccionesParametroInventarioDefecto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralParametroInventarioDefecto.setName("jPanelCamposFingeneralParametroInventarioDefecto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Caracteristica"));
		this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto.setName("jPanelCamposFincaracteristicaParametroInventarioDefecto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoParametroInventarioDefecto=new ReporteDinamicoJInternalFrame(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroInventarioDefecto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroInventarioDefecto=new ImportacionJInternalFrame(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroInventarioDefecto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroInventarioDefecto = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroInventarioDefecto.setText("Orden");
		this.jButtonAbrirOrderByParametroInventarioDefecto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroInventarioDefecto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroInventarioDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroInventarioDefecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroInventarioDefecto,false,this);
			
			//this.cargarOrderByParametroInventarioDefecto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroInventarioDefecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroInventarioDefecto,true,this);
			
			//this.cargarOrderByParametroInventarioDefecto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroInventarioDefecto.setMinimumSize(new Dimension(400,50));//2130
		this.jTableDatosParametroInventarioDefecto.setMaximumSize(new Dimension(400,50));//2130
		this.jTableDatosParametroInventarioDefecto.setPreferredSize(new Dimension(400,50));//2130
		
		this.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroInventarioDefecto.setText("Nuevo");
		this.jButtonDuplicarParametroInventarioDefecto.setText("Duplicar");
		this.jButtonCopiarParametroInventarioDefecto.setText("Copiar");
		this.jButtonVerFormParametroInventarioDefecto.setText("Ver");
		this.jButtonNuevoRelacionesParametroInventarioDefecto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroInventarioDefecto.setText("Guardar");
		this.jButtonCerrarParametroInventarioDefecto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroInventarioDefecto,"nuevo_button","Nuevo",this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroInventarioDefecto,"duplicar_button","Duplicar",this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroInventarioDefecto,"copiar_button","Copiar",this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroInventarioDefecto,"ver_form","Ver",this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroInventarioDefecto,"nuevorelaciones_button","Nuevo Rel",this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroInventarioDefecto,"guardarcambiostabla_button","Guardar",this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroInventarioDefecto,"cerrar_button","Salir",this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroInventarioDefecto.setToolTipText("Nuevo"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroInventarioDefecto.setToolTipText("Duplicar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroInventarioDefecto.setToolTipText("Copiar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroInventarioDefecto.setToolTipText("Ver"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroInventarioDefecto.setToolTipText("Nuevo Rel"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroInventarioDefecto.setToolTipText("Guardar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroInventarioDefecto.setToolTipText("Salir"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroInventarioDefecto";
		inputMap = this.jButtonNuevoParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroInventarioDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroInventarioDefecto"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroInventarioDefecto";
		inputMap = this.jButtonDuplicarParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroInventarioDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroInventarioDefecto"));
		
		//COPIAR
		sMapKey = "CopiarParametroInventarioDefecto";
		inputMap = this.jButtonCopiarParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroInventarioDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroInventarioDefecto"));
		
		//VEr FORM
		sMapKey = "VerFormParametroInventarioDefecto";
		inputMap = this.jButtonVerFormParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroInventarioDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroInventarioDefecto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroInventarioDefecto";
		inputMap = this.jButtonNuevoRelacionesParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroInventarioDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroInventarioDefecto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroInventarioDefecto";
		inputMap = this.jButtonModificarParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroInventarioDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroInventarioDefecto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroInventarioDefecto";
		inputMap = this.jButtonCerrarParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroInventarioDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroInventarioDefecto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroInventarioDefecto";
		inputMap = this.jButtonGuardarCambiosTablaParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroInventarioDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroInventarioDefecto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroInventarioDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroInventarioDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroInventarioDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroInventarioDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroInventarioDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroInventarioDefecto.setName("jPanelParametrosReportesParametroInventarioDefecto"); 
		
		this.jPanelParametrosReportesAccionesParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroInventarioDefecto.setName("jPanelParametrosReportesAccionesParametroInventarioDefecto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroInventarioDefecto = new JButtonMe();
		this.jButtonRecargarInformacionParametroInventarioDefecto.setText("Recargar");
		this.jButtonRecargarInformacionParametroInventarioDefecto.setToolTipText("Recargar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroInventarioDefecto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroInventarioDefecto = new JButtonMe();
		this.jButtonProcesarInformacionParametroInventarioDefecto.setText("Procesar");
		this.jButtonProcesarInformacionParametroInventarioDefecto.setToolTipText("Procesar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroInventarioDefecto.setVisible(false);
			
		this.jButtonProcesarInformacionParametroInventarioDefecto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroInventarioDefecto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroInventarioDefecto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroInventarioDefecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroInventarioDefecto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroInventarioDefecto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroInventarioDefecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroInventarioDefecto.setText("TIPO");       
		this.jComboBoxTiposReportesParametroInventarioDefecto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroInventarioDefecto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroInventarioDefecto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroInventarioDefecto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroInventarioDefecto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroInventarioDefecto.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroInventarioDefecto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroInventarioDefecto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroInventarioDefecto.setText("Accion");
		this.jComboBoxTiposRelacionesParametroInventarioDefecto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroInventarioDefecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroInventarioDefecto.setText("Accion");
		this.jComboBoxTiposAccionesParametroInventarioDefecto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroInventarioDefecto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroInventarioDefecto.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroInventarioDefecto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroInventarioDefecto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroInventarioDefecto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroInventarioDefecto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroInventarioDefecto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroInventarioDefecto = new JLabelMe();
		
		this.jLabelAccionesParametroInventarioDefecto.setText("Acciones");		
		this.jLabelAccionesParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroInventarioDefecto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroInventarioDefecto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroInventarioDefecto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroInventarioDefecto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroInventarioDefecto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroInventarioDefecto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroInventarioDefecto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroInventarioDefecto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroInventarioDefecto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroInventarioDefecto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroInventarioDefecto.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroInventarioDefecto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroInventarioDefecto = new JButtonMe();
		//this.jButtonAnterioresParametroInventarioDefecto.setText("<<");
        this.jButtonAnterioresParametroInventarioDefecto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroInventarioDefecto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroInventarioDefecto = new JButtonMe();
		//this.jButtonSiguientesParametroInventarioDefecto.setText(">>");
        this.jButtonSiguientesParametroInventarioDefecto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroInventarioDefecto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroInventarioDefecto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroInventarioDefecto.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroInventarioDefecto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroInventarioDefecto,"nuevoguardarcambios_button","Nue",this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroInventarioDefecto";
		inputMap = this.jButtonNuevoGuardarCambiosParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroInventarioDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroInventarioDefecto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroInventarioDefecto";
		inputMap = this.jButtonRecargarInformacionParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroInventarioDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroInventarioDefecto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroInventarioDefecto";
		inputMap = this.jButtonSiguientesParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroInventarioDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroInventarioDefecto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroInventarioDefecto";
		inputMap = this.jButtonAnterioresParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroInventarioDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroInventarioDefecto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroInventarioDefecto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroInventarioDefecto.setMinimumSize(new Dimension(this.getWidth(),ParametroInventarioDefectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroInventarioDefectoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroInventarioDefecto.setMaximumSize(new Dimension(this.getWidth(),ParametroInventarioDefectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroInventarioDefectoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroInventarioDefecto.setPreferredSize(new Dimension(this.getWidth(),ParametroInventarioDefectoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroInventarioDefectoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroInventarioDefecto = new GridBagLayout();

			this.jPanelPaginacionParametroInventarioDefecto.setLayout(gridaBagLayoutPaginacionParametroInventarioDefecto);						
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroInventarioDefecto.add(this.jButtonAnterioresParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
					
						
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
			
			this.jPanelPaginacionParametroInventarioDefecto.add(this.jButtonNuevoGuardarCambiosParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
						
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
			this.jPanelPaginacionParametroInventarioDefecto.add(this.jButtonSiguientesParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = 1;
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroInventarioDefecto.add(this.jButtonNuevoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
						
			
			
			if(!this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
				this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroInventarioDefecto.gridy = 1;
				this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroInventarioDefecto.add(this.jButtonGuardarCambiosTablaParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
			}
			
			
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = 1;
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroInventarioDefecto.add(this.jButtonDuplicarParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = 1;
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroInventarioDefecto.add(this.jButtonCopiarParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = 1;
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroInventarioDefecto.add(this.jButtonVerFormParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = 1;
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroInventarioDefecto.add(this.jButtonCerrarParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		
		
		
		this.jButtonRecargarInformacionParametroInventarioDefecto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroInventarioDefecto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroInventarioDefecto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroInventarioDefecto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroInventarioDefecto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroInventarioDefecto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroInventarioDefecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroInventarioDefecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroInventarioDefecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroInventarioDefecto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroInventarioDefecto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroInventarioDefecto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroInventarioDefecto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroInventarioDefecto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroInventarioDefecto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroInventarioDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroInventarioDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroInventarioDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroInventarioDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroInventarioDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroInventarioDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroInventarioDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroInventarioDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroInventarioDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroInventarioDefecto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroInventarioDefecto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroInventarioDefecto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroInventarioDefecto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroInventarioDefecto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroInventarioDefecto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroInventarioDefecto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroInventarioDefecto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroInventarioDefecto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroInventarioDefecto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroInventarioDefecto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroInventarioDefecto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroInventarioDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroInventarioDefecto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroInventarioDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroInventarioDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroInventarioDefecto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroInventarioDefecto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroInventarioDefecto.setLayout(gridaBagParametrosReportesParametroInventarioDefecto);
			this.jPanelParametrosReportesAccionesParametroInventarioDefecto.setLayout(gridaBagParametrosReportesAccionesParametroInventarioDefecto);
			
			
			this.jPanelParametrosAuxiliar1ParametroInventarioDefecto.setLayout(gridaBagParametrosAuxiliar1ParametroInventarioDefecto);
			this.jPanelParametrosAuxiliar2ParametroInventarioDefecto.setLayout(gridaBagParametrosAuxiliar2ParametroInventarioDefecto);
			this.jPanelParametrosAuxiliar3ParametroInventarioDefecto.setLayout(gridaBagParametrosAuxiliar3ParametroInventarioDefecto);
			this.jPanelParametrosAuxiliar4ParametroInventarioDefecto.setLayout(gridaBagParametrosAuxiliar4ParametroInventarioDefecto);
			//this.jPanelParametrosAuxiliar5ParametroInventarioDefecto.setLayout(gridaBagParametrosAuxiliar2ParametroInventarioDefecto);			
			
			
			
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroInventarioDefecto.add(this.jButtonRecargarInformacionParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroInventarioDefecto.add(this.jComboBoxTiposPaginacionParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroInventarioDefecto.add(this.jCheckBoxConAltoMaximoTablaParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroInventarioDefecto.add(this.jComboBoxTiposArchivosReportesParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroInventarioDefecto.add(this.jPanelParametrosAuxiliar1ParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInventarioDefecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroInventarioDefecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroInventarioDefecto.add(this.jComboBoxTiposReportesParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroInventarioDefecto.add(this.jPanelParametrosAuxiliar4ParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroInventarioDefecto.add(this.jComboBoxTiposReportesParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroInventarioDefecto.add(this.jCheckBoxGenerarReporteParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroInventarioDefecto.add(this.jPanelParametrosAuxiliar2ParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroInventarioDefecto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroInventarioDefecto.add(this.jLabelAccionesParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
				this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroInventarioDefecto.add(this.jButtonAbrirOrderByParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroInventarioDefecto.add(this.jComboBoxTiposSeleccionarParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);			
			
			
			/*
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroInventarioDefecto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroInventarioDefecto.add(this.jCheckBoxSeleccionarTodosParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInventarioDefecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroInventarioDefecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroInventarioDefecto.add(this.jCheckBoxSeleccionarTodosParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);															
				
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInventarioDefecto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroInventarioDefecto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroInventarioDefecto.add(this.jCheckBoxSeleccionadosParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroInventarioDefecto.add(this.jPanelParametrosAuxiliar3ParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroInventarioDefecto.add(this.jComboBoxTiposAccionesParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
	
				
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroInventarioDefecto.add(this.jTextFieldValorCampoGeneralParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralParametroInventarioDefecto= new GridBagLayout();
		this.jPanelCamposIniciogeneralParametroInventarioDefecto.setLayout(gridaBagLayoutCamposIniciogeneralParametroInventarioDefecto);

		GridBagLayout gridaBagLayoutCamposIniciocaracteristicaParametroInventarioDefecto= new GridBagLayout();
		this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto.setLayout(gridaBagLayoutCamposIniciocaracteristicaParametroInventarioDefecto);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroInventarioDefecto = new GridBagLayout();

			this.jScrollPanelDatosParametroInventarioDefecto.setLayout(gridaBagLayoutDatosParametroInventarioDefecto);
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
			this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
			
			this.jScrollPanelDatosParametroInventarioDefecto.add(this.jTableDatosParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroInventarioDefecto.setViewportView(this.jTableDatosParametroInventarioDefecto);
		this.jTableDatosParametroInventarioDefecto.setFillsViewportHeight(true);
		this.jTableDatosParametroInventarioDefecto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroInventarioDefecto= new GridBagLayout();
		this.jPanelAccionesParametroInventarioDefecto.setLayout(gridaBagLayoutAccionesParametroInventarioDefecto);
		
		
		/*	
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
			
		this.jPanelAccionesParametroInventarioDefecto.add(this.jButtonNuevoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCalidadProductoParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdCalidadProductoParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCalidadProductoParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCalidadProductoParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCalidadProductoParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCalidadProductoParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdCalidadProductoParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdCalidadProductoParametroInventarioDefecto.add(jLabelid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdCalidadProductoParametroInventarioDefecto.add(jComboBoxid_calidad_productoFK_IdCalidadProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdCalidadProductoParametroInventarioDefecto.add(jButtonFK_IdCalidadProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("1.-Por Calidad Producto ", jPanelFK_IdCalidadProductoParametroInventarioDefecto);
		jTabbedPaneBusquedasParametroInventarioDefecto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCiudadParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdCiudadParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdCiudadParametroInventarioDefecto.add(jLabelid_ciudadFK_IdCiudadParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdCiudadParametroInventarioDefecto.add(jComboBoxid_ciudadFK_IdCiudadParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdCiudadParametroInventarioDefecto.add(jButtonFK_IdCiudadParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("2.-Por Ciudad ", jPanelFK_IdCiudadParametroInventarioDefecto);
		jTabbedPaneBusquedasParametroInventarioDefecto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdClaseProductoParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdClaseProductoParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClaseProductoParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClaseProductoParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClaseProductoParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClaseProductoParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdClaseProductoParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdClaseProductoParametroInventarioDefecto.add(jLabelid_clase_productoFK_IdClaseProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdClaseProductoParametroInventarioDefecto.add(jComboBoxid_clase_productoFK_IdClaseProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdClaseProductoParametroInventarioDefecto.add(jButtonFK_IdClaseProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("3.-Por Clase Producto ", jPanelFK_IdClaseProductoParametroInventarioDefecto);
		jTabbedPaneBusquedasParametroInventarioDefecto.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdColorProductoParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdColorProductoParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdColorProductoParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdColorProductoParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdColorProductoParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdColorProductoParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdColorProductoParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdColorProductoParametroInventarioDefecto.add(jLabelid_color_productoFK_IdColorProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdColorProductoParametroInventarioDefecto.add(jComboBoxid_color_productoFK_IdColorProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdColorProductoParametroInventarioDefecto.add(jButtonFK_IdColorProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("4.-Por Color Producto ", jPanelFK_IdColorProductoParametroInventarioDefecto);
		jTabbedPaneBusquedasParametroInventarioDefecto.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEfectoProductoParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdEfectoProductoParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEfectoProductoParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEfectoProductoParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEfectoProductoParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEfectoProductoParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdEfectoProductoParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdEfectoProductoParametroInventarioDefecto.add(jLabelid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdEfectoProductoParametroInventarioDefecto.add(jComboBoxid_efecto_productoFK_IdEfectoProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdEfectoProductoParametroInventarioDefecto.add(jButtonFK_IdEfectoProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("5.-Por Efecto Producto ", jPanelFK_IdEfectoProductoParametroInventarioDefecto);
		jTabbedPaneBusquedasParametroInventarioDefecto.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdGrupoBodegaParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdGrupoBodegaParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdGrupoBodegaParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdGrupoBodegaParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdGrupoBodegaParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdGrupoBodegaParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdGrupoBodegaParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdGrupoBodegaParametroInventarioDefecto.add(jLabelid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdGrupoBodegaParametroInventarioDefecto.add(jComboBoxid_grupo_bodegaFK_IdGrupoBodegaParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdGrupoBodegaParametroInventarioDefecto.add(jButtonFK_IdGrupoBodegaParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("6.-Por Grupo Bodega ", jPanelFK_IdGrupoBodegaParametroInventarioDefecto);
		jTabbedPaneBusquedasParametroInventarioDefecto.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdMarcaProductoParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdMarcaProductoParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMarcaProductoParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMarcaProductoParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMarcaProductoParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMarcaProductoParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdMarcaProductoParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdMarcaProductoParametroInventarioDefecto.add(jLabelid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdMarcaProductoParametroInventarioDefecto.add(jComboBoxid_marca_productoFK_IdMarcaProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdMarcaProductoParametroInventarioDefecto.add(jButtonFK_IdMarcaProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("7.-Por Marca Producto ", jPanelFK_IdMarcaProductoParametroInventarioDefecto);
		jTabbedPaneBusquedasParametroInventarioDefecto.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdMaterialProductoParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdMaterialProductoParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMaterialProductoParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMaterialProductoParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMaterialProductoParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMaterialProductoParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdMaterialProductoParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdMaterialProductoParametroInventarioDefecto.add(jLabelid_material_productoFK_IdMaterialProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdMaterialProductoParametroInventarioDefecto.add(jComboBoxid_material_productoFK_IdMaterialProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdMaterialProductoParametroInventarioDefecto.add(jButtonFK_IdMaterialProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("8.-Por Material Producto ", jPanelFK_IdMaterialProductoParametroInventarioDefecto);
		jTabbedPaneBusquedasParametroInventarioDefecto.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdModeloProductoParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdModeloProductoParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdModeloProductoParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdModeloProductoParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdModeloProductoParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdModeloProductoParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdModeloProductoParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdModeloProductoParametroInventarioDefecto.add(jLabelid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdModeloProductoParametroInventarioDefecto.add(jComboBoxid_modelo_productoFK_IdModeloProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdModeloProductoParametroInventarioDefecto.add(jButtonFK_IdModeloProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("9.-Por Modelo Producto ", jPanelFK_IdModeloProductoParametroInventarioDefecto);
		jTabbedPaneBusquedasParametroInventarioDefecto.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdPaisParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdPaisParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdPaisParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdPaisParametroInventarioDefecto.add(jLabelid_paisFK_IdPaisParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdPaisParametroInventarioDefecto.add(jComboBoxid_paisFK_IdPaisParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdPaisParametroInventarioDefecto.add(jButtonFK_IdPaisParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("10.-Por Pais ", jPanelFK_IdPaisParametroInventarioDefecto);

		GridBagLayout gridaBagLayoutFK_IdRangoUnidadVentaParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdRangoUnidadVentaParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdRangoUnidadVentaParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdRangoUnidadVentaParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdRangoUnidadVentaParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdRangoUnidadVentaParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdRangoUnidadVentaParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdRangoUnidadVentaParametroInventarioDefecto.add(jLabelid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdRangoUnidadVentaParametroInventarioDefecto.add(jComboBoxid_rango_unidad_ventaFK_IdRangoUnidadVentaParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdRangoUnidadVentaParametroInventarioDefecto.add(jButtonFK_IdRangoUnidadVentaParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("11.-Por Rango Unidad Venta ", jPanelFK_IdRangoUnidadVentaParametroInventarioDefecto);

		GridBagLayout gridaBagLayoutFK_IdSegmentoProductoParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdSegmentoProductoParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSegmentoProductoParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSegmentoProductoParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSegmentoProductoParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSegmentoProductoParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdSegmentoProductoParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdSegmentoProductoParametroInventarioDefecto.add(jLabelid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdSegmentoProductoParametroInventarioDefecto.add(jComboBoxid_segmento_productoFK_IdSegmentoProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdSegmentoProductoParametroInventarioDefecto.add(jButtonFK_IdSegmentoProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("12.-Por Segmento Producto ", jPanelFK_IdSegmentoProductoParametroInventarioDefecto);

		GridBagLayout gridaBagLayoutFK_IdTallaProductoParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdTallaProductoParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTallaProductoParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTallaProductoParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTallaProductoParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTallaProductoParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdTallaProductoParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdTallaProductoParametroInventarioDefecto.add(jLabelid_talla_productoFK_IdTallaProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdTallaProductoParametroInventarioDefecto.add(jComboBoxid_talla_productoFK_IdTallaProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdTallaProductoParametroInventarioDefecto.add(jButtonFK_IdTallaProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("13.-Por Talla Producto ", jPanelFK_IdTallaProductoParametroInventarioDefecto);

		GridBagLayout gridaBagLayoutFK_IdTipoCosteoParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCosteoParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCosteoParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCosteoParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCosteoParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCosteoParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdTipoCosteoParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdTipoCosteoParametroInventarioDefecto.add(jLabelid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdTipoCosteoParametroInventarioDefecto.add(jComboBoxid_tipo_costeoFK_IdTipoCosteoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdTipoCosteoParametroInventarioDefecto.add(jButtonFK_IdTipoCosteoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("14.-Por Tipo Costeo ", jPanelFK_IdTipoCosteoParametroInventarioDefecto);

		GridBagLayout gridaBagLayoutFK_IdTipoProductoParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProductoParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProductoParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProductoParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdTipoProductoParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdTipoProductoParametroInventarioDefecto.add(jLabelid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdTipoProductoParametroInventarioDefecto.add(jComboBoxid_tipo_productoFK_IdTipoProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdTipoProductoParametroInventarioDefecto.add(jButtonFK_IdTipoProductoParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("15.-Por Tipo Producto ", jPanelFK_IdTipoProductoParametroInventarioDefecto);

		GridBagLayout gridaBagLayoutFK_IdTipoProductoServicioParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProductoServicioParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoServicioParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoServicioParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProductoServicioParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProductoServicioParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdTipoProductoServicioParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdTipoProductoServicioParametroInventarioDefecto.add(jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdTipoProductoServicioParametroInventarioDefecto.add(jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdTipoProductoServicioParametroInventarioDefecto.add(jButtonFK_IdTipoProductoServicioParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("16.-Por Tipo Producto Servicio ", jPanelFK_IdTipoProductoServicioParametroInventarioDefecto);

		GridBagLayout gridaBagLayoutFK_IdTipoProductoServicioInvenParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProductoServicioInvenParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoServicioInvenParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoServicioInvenParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProductoServicioInvenParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProductoServicioInvenParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdTipoProductoServicioInvenParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdTipoProductoServicioInvenParametroInventarioDefecto.add(jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdTipoProductoServicioInvenParametroInventarioDefecto.add(jComboBoxid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdTipoProductoServicioInvenParametroInventarioDefecto.add(jButtonFK_IdTipoProductoServicioInvenParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("17.-Por Tipo Producto Servicio. ", jPanelFK_IdTipoProductoServicioInvenParametroInventarioDefecto);

		GridBagLayout gridaBagLayoutFK_IdTipoServicioParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoServicioParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoServicioParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoServicioParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoServicioParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoServicioParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdTipoServicioParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdTipoServicioParametroInventarioDefecto.add(jLabelid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdTipoServicioParametroInventarioDefecto.add(jComboBoxid_tipo_servicioFK_IdTipoServicioParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdTipoServicioParametroInventarioDefecto.add(jButtonFK_IdTipoServicioParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("18.-Por Tipo Servicio ", jPanelFK_IdTipoServicioParametroInventarioDefecto);

		GridBagLayout gridaBagLayoutFK_IdTipoViaTransporteParametroInventarioDefecto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoViaTransporteParametroInventarioDefecto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoViaTransporteParametroInventarioDefecto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoViaTransporteParametroInventarioDefecto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoViaTransporteParametroInventarioDefecto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoViaTransporteParametroInventarioDefecto.setLayout(gridaBagLayoutFK_IdTipoViaTransporteParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		jPanelFK_IdTipoViaTransporteParametroInventarioDefecto.add(jLabelid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		gridBagConstraintsParametroInventarioDefecto.gridx = 1;
		jPanelFK_IdTipoViaTransporteParametroInventarioDefecto.add(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsParametroInventarioDefecto.gridy = 1;
		gridBagConstraintsParametroInventarioDefecto.gridx =1;
		jPanelFK_IdTipoViaTransporteParametroInventarioDefecto.add(jButtonFK_IdTipoViaTransporteParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);

		jTabbedPaneBusquedasParametroInventarioDefecto.addTab("19.-Por Tipo Via Transporte ", jPanelFK_IdTipoViaTransporteParametroInventarioDefecto);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroInventarioDefecto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();						
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;		
			//this.gridBagConstraintsParametroInventarioDefecto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroInventarioDefecto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;		
		//this.gridBagConstraintsParametroInventarioDefecto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroInventarioDefecto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;		
			this.gridBagConstraintsParametroInventarioDefecto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsParametroInventarioDefecto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);								
		
		
		/*
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		*/		
		
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroInventarioDefecto.gridx =0;
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroInventarioDefecto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
				
		
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroInventarioDefectoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroInventarioDefecto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroInventarioDefecto = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroInventarioDefecto.setLayout(gridaBagLayoutBusquedasParametrosParametroInventarioDefecto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroInventarioDefecto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroInventarioDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroInventarioDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroInventarioDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
			
			
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		
			
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroInventarioDefecto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroInventarioDefecto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroInventarioDefecto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroInventarioDefecto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroInventarioDefecto.setName("jPanelReporteDinamicoParametroInventarioDefecto"); 
		
		this.jPanelReporteDinamicoParametroInventarioDefecto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroInventarioDefecto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroInventarioDefecto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroInventarioDefecto.setLayout(gridaBagLayoutReporteDinamicoParametroInventarioDefecto);
		
		
		this.jInternalFrameReporteDinamicoParametroInventarioDefecto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroInventarioDefecto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroInventarioDefecto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroInventarioDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroInventarioDefecto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroInventarioDefecto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroInventarioDefecto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroInventarioDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroInventarioDefecto.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroInventarioDefecto.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroInventarioDefecto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroInventarioDefecto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroInventarioDefecto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroInventarioDefecto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Inventario Defectos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroInventarioDefecto = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroInventarioDefecto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroInventarioDefecto.add(this.jLabelColumnasSelectReporteParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroInventarioDefecto = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroInventarioDefecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroInventarioDefecto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroInventarioDefecto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroInventarioDefecto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroInventarioDefecto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroInventarioDefecto=new JScrollPane(this.jListColumnasSelectReporteParametroInventarioDefecto);
			
			this.jScrollColumnasSelectReporteParametroInventarioDefecto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroInventarioDefecto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroInventarioDefecto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroInventarioDefecto.add(this.jListColumnasSelectReporteParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		this.jPanelReporteDinamicoParametroInventarioDefecto.add(this.jScrollColumnasSelectReporteParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroInventarioDefecto = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroInventarioDefecto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroInventarioDefecto = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroInventarioDefecto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroInventarioDefecto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroInventarioDefecto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroInventarioDefecto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroInventarioDefecto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroInventarioDefecto=new JScrollPane(this.jListRelacionesSelectReporteParametroInventarioDefecto);
			
			this.jScrollRelacionesSelectReporteParametroInventarioDefecto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroInventarioDefecto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroInventarioDefecto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroInventarioDefecto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroInventarioDefecto = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroInventarioDefecto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroInventarioDefecto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroInventarioDefecto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroInventarioDefecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroInventarioDefecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroInventarioDefecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroInventarioDefecto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroInventarioDefecto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroInventarioDefecto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroInventarioDefecto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroInventarioDefecto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroInventarioDefecto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroInventarioDefecto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroInventarioDefecto.add(this.jLabelGenerarExcelReporteDinamicoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroInventarioDefecto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroInventarioDefecto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroInventarioDefecto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroInventarioDefecto.setToolTipText("Generar EXCEL"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroInventarioDefecto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroInventarioDefecto.add(this.jButtonGenerarExcelReporteDinamicoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroInventarioDefecto.add(this.jComboBoxTiposReportesDinamicoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroInventarioDefecto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroInventarioDefecto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroInventarioDefecto.add(this.jLabelTiposArchivoReporteDinamicoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroInventarioDefecto.add(this.jComboBoxTiposArchivosReportesDinamicoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroInventarioDefecto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroInventarioDefecto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroInventarioDefecto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroInventarioDefecto.setToolTipText("Generar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroInventarioDefecto.add(this.jButtonGenerarReporteDinamicoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroInventarioDefecto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroInventarioDefecto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroInventarioDefecto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroInventarioDefecto.setToolTipText("Cancelar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroInventarioDefecto.add(this.jButtonCerrarReporteDinamicoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroInventarioDefecto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroInventarioDefecto= new JScrollPane(jPanelReporteDinamicoParametroInventarioDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroInventarioDefecto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroInventarioDefecto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroInventarioDefecto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Inventario Defectos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroInventarioDefecto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroInventarioDefecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroInventarioDefecto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroInventarioDefecto);
		this.jInternalFrameReporteDinamicoParametroInventarioDefecto.getContentPane().add(this.jScrollPanelReporteDinamicoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroInventarioDefecto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroInventarioDefecto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroInventarioDefecto.setName("jPanelImportacionParametroInventarioDefecto"); 
		
		this.jPanelImportacionParametroInventarioDefecto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroInventarioDefecto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroInventarioDefecto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroInventarioDefecto.setLayout(gridaBagLayoutImportacionParametroInventarioDefecto);
		
		
		this.jInternalFrameImportacionParametroInventarioDefecto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroInventarioDefecto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroInventarioDefecto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroInventarioDefecto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroInventarioDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroInventarioDefecto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroInventarioDefecto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroInventarioDefecto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroInventarioDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroInventarioDefecto.setResizable(true);
	    this.jInternalFrameImportacionParametroInventarioDefecto.setClosable(true);
	    this.jInternalFrameImportacionParametroInventarioDefecto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroInventarioDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroInventarioDefecto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroInventarioDefecto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroInventarioDefecto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroInventarioDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroInventarioDefecto.setResizable(true);
	    this.jInternalFrameImportacionParametroInventarioDefecto.setClosable(true);
	    this.jInternalFrameImportacionParametroInventarioDefecto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroInventarioDefecto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroInventarioDefecto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroInventarioDefecto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Inventario Defectos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroInventarioDefecto = new JLabelMe();

		this.jLabelArchivoImportacionParametroInventarioDefecto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroInventarioDefecto.add(this.jLabelArchivoImportacionParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroInventarioDefecto = new JFileChooser();		
		this.jFileChooserImportacionParametroInventarioDefecto.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroInventarioDefecto = new JButtonMe();
		this.jButtonAbrirImportacionParametroInventarioDefecto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroInventarioDefecto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroInventarioDefecto.setToolTipText("Generar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroInventarioDefecto.add(this.jButtonAbrirImportacionParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroInventarioDefecto = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroInventarioDefecto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroInventarioDefecto.add(this.jLabelPathArchivoImportacionParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroInventarioDefecto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroInventarioDefecto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroInventarioDefecto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroInventarioDefecto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroInventarioDefecto.add(this.jTextFieldPathArchivoImportacionParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroInventarioDefecto = new JButtonMe();
		this.jButtonGenerarImportacionParametroInventarioDefecto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroInventarioDefecto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroInventarioDefecto.setToolTipText("Generar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroInventarioDefecto.add(this.jButtonGenerarImportacionParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroInventarioDefecto = new JButtonMe();
		this.jButtonCerrarImportacionParametroInventarioDefecto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroInventarioDefecto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroInventarioDefecto.setToolTipText("Cancelar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroInventarioDefecto.add(this.jButtonCerrarImportacionParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroInventarioDefecto = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroInventarioDefecto= new JScrollPane(jPanelImportacionParametroInventarioDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroInventarioDefecto.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroInventarioDefecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroInventarioDefecto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroInventarioDefecto);
		this.jInternalFrameImportacionParametroInventarioDefecto.getContentPane().add(this.jScrollPanelImportacionParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroInventarioDefecto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroInventarioDefecto = new JButtonMe();
			this.jButtonAbrirOrderByParametroInventarioDefecto.setText("Orden");
			this.jButtonAbrirOrderByParametroInventarioDefecto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroInventarioDefecto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroInventarioDefecto";
			inputMap = this.jButtonAbrirOrderByParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroInventarioDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroInventarioDefecto"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroInventarioDefecto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroInventarioDefecto.setName("jPanelOrderByParametroInventarioDefecto"); 
			
			this.jPanelOrderByParametroInventarioDefecto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroInventarioDefecto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroInventarioDefecto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroInventarioDefecto.setLayout(gridaBagLayoutOrderByParametroInventarioDefecto);
			
			
			this.jTableDatosParametroInventarioDefectoOrderBy = new JTableMe();        
			this.jTableDatosParametroInventarioDefectoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroInventarioDefectoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroInventarioDefectoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroInventarioDefectoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroInventarioDefectoOrderBy.setViewportView(this.jTableDatosParametroInventarioDefectoOrderBy);
			this.jTableDatosParametroInventarioDefectoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroInventarioDefectoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroInventarioDefecto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroInventarioDefecto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroInventarioDefecto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroInventarioDefecto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroInventarioDefecto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroInventarioDefecto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroInventarioDefecto.setTitle("Orden");
			this.jInternalFrameOrderByParametroInventarioDefecto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroInventarioDefecto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroInventarioDefecto.setResizable(true);
			this.jInternalFrameOrderByParametroInventarioDefecto.setClosable(true);
			this.jInternalFrameOrderByParametroInventarioDefecto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroInventarioDefecto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroInventarioDefecto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroInventarioDefecto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Inventario Defectos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroInventarioDefecto.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroInventarioDefecto.ipady =150;
				
			this.jPanelOrderByParametroInventarioDefecto.add(jScrollPanelDatosParametroInventarioDefectoOrderBy, this.gridBagConstraintsParametroInventarioDefecto);//this.jTableDatosParametroInventarioDefectoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroInventarioDefecto = new JButtonMe();
			this.jButtonCerrarOrderByParametroInventarioDefecto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroInventarioDefecto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroInventarioDefecto.setToolTipText("Cancelar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroInventarioDefecto.add(this.jButtonCerrarOrderByParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroInventarioDefecto = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroInventarioDefecto= new JScrollPane(jPanelOrderByParametroInventarioDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroInventarioDefecto.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroInventarioDefecto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroInventarioDefecto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroInventarioDefecto);
			
			this.jInternalFrameOrderByParametroInventarioDefecto.getContentPane().add(this.jScrollPanelOrderByParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);			
		
		} else {
			this.jButtonAbrirOrderByParametroInventarioDefecto = new JButtonMe();
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
		iWidthTableCalculado+=2130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametroinventariodefectoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroInventarioDefecto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroInventarioDefecto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroInventarioDefecto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroInventarioDefecto.getRowHeight();//ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroInventarioDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroInventarioDefecto.isSelected()) {
					iHeightTable=ParametroInventarioDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroInventarioDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroInventarioDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroInventarioDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroInventarioDefecto.isSelected()) {
					iHeightTable=ParametroInventarioDefectoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroInventarioDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroInventarioDefectoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroInventarioDefecto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroInventarioDefecto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroInventarioDefecto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroInventarioDefecto!=null && this.jInternalFrameOrderByParametroInventarioDefecto.getjTableDatosOrderBy()!=null) {
			//if(!this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroInventarioDefecto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroInventarioDefecto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroInventarioDefecto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroInventarioDefecto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroInventarioDefecto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroInventarioDefecto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroInventarioDefecto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametroinventariodefectoLogic.getParametroInventarioDefectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroinventariodefectos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroInventarioDefecto> TraerParametroInventarioDefectoBeans(List<ParametroInventarioDefecto> parametroinventariodefectos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroInventarioDefecto parametroinventariodefecto:parametroinventariodefectos) {
					
				if(!(ParametroInventarioDefectoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroInventarioDefectoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametroinventariodefecto.setsDetalleGeneralEntityReporte(ParametroInventarioDefectoConstantesFunciones.getParametroInventarioDefectoDescripcion(parametroinventariodefecto));
										
						
					
						
					
				} else  {
							
					//parametroinventariodefecto.setsDetalleGeneralEntityReporte(parametroinventariodefecto.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametroinventariodefectobeans.add(parametroinventariodefectobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametroinventariodefectos;
    }
	//PARA REPORTES FIN
}
