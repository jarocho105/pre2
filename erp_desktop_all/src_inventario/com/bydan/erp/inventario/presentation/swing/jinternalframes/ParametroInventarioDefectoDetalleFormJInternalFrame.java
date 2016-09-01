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
public class ParametroInventarioDefectoDetalleFormJInternalFrame extends ParametroInventarioDefectoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroInventarioDefecto;
	
	protected JMenuBar jmenuBarDetalleParametroInventarioDefecto;
	
	protected JMenu jmenuDetalleParametroInventarioDefecto;
	protected JMenu jmenuDetalleArchivoParametroInventarioDefecto;
	protected JMenu jmenuDetalleAccionesParametroInventarioDefecto;
	protected JMenu jmenuDetalleDatosParametroInventarioDefecto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroInventarioDefecto;	
	protected GridBagConstraints gridBagConstraintsParametroInventarioDefecto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroInventarioDefectoBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroInventarioDefecto;		
	
	
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
	
	public ParametroInventarioDefectoLogic parametroinventariodefectoLogic;
	
	public JScrollPane jScrollPanelDatosParametroInventarioDefecto;
	public JScrollPane jScrollPanelDatosEdicionParametroInventarioDefecto;
	public JScrollPane jScrollPanelDatosGeneralParametroInventarioDefecto;
	
	protected JPanel jPanelCamposParametroInventarioDefecto;    
	protected JPanel jPanelCamposOcultosParametroInventarioDefecto;    	
	protected JPanel jPanelAccionesParametroInventarioDefecto;
	protected JPanel jPanelAccionesFormularioParametroInventarioDefecto;
    
	
	
	protected JTabbedPane jTabbedPaneCamposParametroInventarioDefecto;	
	protected Integer iXPanelCamposParametroInventarioDefecto=0;
	protected Integer iYPanelCamposParametroInventarioDefecto=0;
	
	protected Integer iXPanelCamposOcultosParametroInventarioDefecto=0;
	protected Integer iYPanelCamposOcultosParametroInventarioDefecto=0;
	
	

	protected JPanel jPanelCamposIniciogeneralParametroInventarioDefecto;
	protected Integer iXPanelCamposIniciogeneralParametroInventarioDefecto=0;
	protected Integer iYPanelCamposIniciogeneralParametroInventarioDefecto=0;

	protected JPanel jPanelCamposIniciocaracteristicaParametroInventarioDefecto;
	protected Integer iXPanelCamposIniciocaracteristicaParametroInventarioDefecto=0;
	protected Integer iYPanelCamposIniciocaracteristicaParametroInventarioDefecto=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroInventarioDefecto;
	public JButton jButtonModificarParametroInventarioDefecto;
	public JButton jButtonActualizarParametroInventarioDefecto;
    public JButton jButtonEliminarParametroInventarioDefecto;
	public JButton jButtonCancelarParametroInventarioDefecto;
    public JButton jButtonGuardarCambiosParametroInventarioDefecto;
	public JButton jButtonGuardarCambiosTablaParametroInventarioDefecto;
	protected JButton jButtonCerrarParametroInventarioDefecto;
	
	
	protected JButton jButtonProcesarInformacionParametroInventarioDefecto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroInventarioDefecto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroInventarioDefecto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroInventarioDefecto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroInventarioDefecto;
	protected JButton jButtonModificarToolBarParametroInventarioDefecto;
	protected JButton jButtonActualizarToolBarParametroInventarioDefecto;
    protected JButton jButtonEliminarToolBarParametroInventarioDefecto;
	protected JButton jButtonCancelarToolBarParametroInventarioDefecto;
    protected JButton jButtonGuardarCambiosToolBarParametroInventarioDefecto;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroInventarioDefecto;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroInventarioDefecto;
	protected JButton jButtonCerrarToolBarParametroInventarioDefecto;
	
	protected JButton jButtonProcesarInformacionToolBarParametroInventarioDefecto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroInventarioDefecto;
	protected JMenuItem jMenuItemModificarParametroInventarioDefecto;
	protected JMenuItem jMenuItemActualizarParametroInventarioDefecto;
    protected JMenuItem jMenuItemEliminarParametroInventarioDefecto;
	protected JMenuItem jMenuItemCancelarParametroInventarioDefecto;
    protected JMenuItem jMenuItemGuardarCambiosParametroInventarioDefecto;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroInventarioDefecto;
	protected JMenuItem jMenuItemCerrarParametroInventarioDefecto;
	protected JMenuItem jMenuItemDetalleCerrarParametroInventarioDefecto;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroInventarioDefecto;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroInventarioDefecto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroInventarioDefecto;
	protected JMenuItem jMenuItemMostrarOcultarParametroInventarioDefecto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroInventarioDefecto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroInventarioDefecto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroInventarioDefecto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroInventarioDefecto;
	public JLabel jLabelIdParametroInventarioDefecto;
	public JLabel jLabelidParametroInventarioDefecto;
	public JButton jButtonidParametroInventarioDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroInventarioDefecto;
	public JLabel jLabelid_empresaParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroInventarioDefecto;
	public JButton jButtonid_empresaParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_empresaParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalParametroInventarioDefecto;
	public JLabel jLabelid_sucursalParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalParametroInventarioDefecto;
	public JButton jButtonid_sucursalParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_sucursalParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_bodegaParametroInventarioDefecto;
	public JLabel jLabelid_grupo_bodegaParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_bodegaParametroInventarioDefecto;
	public JButton jButtonid_grupo_bodegaParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_grupo_bodegaParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_grupo_bodegaParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_calidad_productoParametroInventarioDefecto;
	public JLabel jLabelid_calidad_productoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_calidad_productoParametroInventarioDefecto;
	public JButton jButtonid_calidad_productoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_calidad_productoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_calidad_productoParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_servicioParametroInventarioDefecto;
	public JLabel jLabelid_tipo_servicioParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_servicioParametroInventarioDefecto;
	public JButton jButtonid_tipo_servicioParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_tipo_servicioParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_servicioParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_producto_servicio_invenParametroInventarioDefecto;
	public JLabel jLabelid_tipo_producto_servicio_invenParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicio_invenParametroInventarioDefecto;
	public JButton jButtonid_tipo_producto_servicio_invenParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_producto_servicioParametroInventarioDefecto;
	public JLabel jLabelid_tipo_producto_servicioParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicioParametroInventarioDefecto;
	public JButton jButtonid_tipo_producto_servicioParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_costeoParametroInventarioDefecto;
	public JLabel jLabelid_tipo_costeoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_costeoParametroInventarioDefecto;
	public JButton jButtonid_tipo_costeoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_tipo_costeoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_costeoParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_productoParametroInventarioDefecto;
	public JLabel jLabelid_tipo_productoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoParametroInventarioDefecto;
	public JButton jButtonid_tipo_productoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_tipo_productoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_via_transporteParametroInventarioDefecto;
	public JLabel jLabelid_tipo_via_transporteParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_via_transporteParametroInventarioDefecto;
	public JButton jButtonid_tipo_via_transporteParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_rango_unidad_ventaParametroInventarioDefecto;
	public JLabel jLabelid_rango_unidad_ventaParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rango_unidad_ventaParametroInventarioDefecto;
	public JButton jButtonid_rango_unidad_ventaParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_rango_unidad_ventaParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_rango_unidad_ventaParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_paisParametroInventarioDefecto;
	public JLabel jLabelid_paisParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisParametroInventarioDefecto;
	public JButton jButtonid_paisParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_paisParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_paisParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadParametroInventarioDefecto;
	public JLabel jLabelid_ciudadParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadParametroInventarioDefecto;
	public JButton jButtonid_ciudadParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_ciudadParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_ciudadParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_color_productoParametroInventarioDefecto;
	public JLabel jLabelid_color_productoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_color_productoParametroInventarioDefecto;
	public JButton jButtonid_color_productoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_color_productoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_color_productoParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_clase_productoParametroInventarioDefecto;
	public JLabel jLabelid_clase_productoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clase_productoParametroInventarioDefecto;
	public JButton jButtonid_clase_productoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_clase_productoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_clase_productoParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_efecto_productoParametroInventarioDefecto;
	public JLabel jLabelid_efecto_productoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_efecto_productoParametroInventarioDefecto;
	public JButton jButtonid_efecto_productoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_efecto_productoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_efecto_productoParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_marca_productoParametroInventarioDefecto;
	public JLabel jLabelid_marca_productoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_marca_productoParametroInventarioDefecto;
	public JButton jButtonid_marca_productoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_marca_productoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_marca_productoParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_modelo_productoParametroInventarioDefecto;
	public JLabel jLabelid_modelo_productoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_modelo_productoParametroInventarioDefecto;
	public JButton jButtonid_modelo_productoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_modelo_productoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_modelo_productoParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_material_productoParametroInventarioDefecto;
	public JLabel jLabelid_material_productoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_material_productoParametroInventarioDefecto;
	public JButton jButtonid_material_productoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_material_productoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_material_productoParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_segmento_productoParametroInventarioDefecto;
	public JLabel jLabelid_segmento_productoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_segmento_productoParametroInventarioDefecto;
	public JButton jButtonid_segmento_productoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_segmento_productoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_segmento_productoParametroInventarioDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_talla_productoParametroInventarioDefecto;
	public JLabel jLabelid_talla_productoParametroInventarioDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_talla_productoParametroInventarioDefecto;
	public JButton jButtonid_talla_productoParametroInventarioDefecto= new JButtonMe();
	public JButton jButtonid_talla_productoParametroInventarioDefectoUpdate= new JButtonMe();
	public JButton jButtonid_talla_productoParametroInventarioDefectoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroInventarioDefecto;
	
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
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroInventarioDefectoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroInventarioDefecto=new JPanel();
				this.jPanelAccionesFormularioParametroInventarioDefecto=new JPanel();
				this.jmenuBarDetalleParametroInventarioDefecto=new JMenuBar();
				this.jTtoolBarDetalleParametroInventarioDefecto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroInventarioDefectoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroInventarioDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroInventarioDefectoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroInventarioDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroInventarioDefectoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroInventarioDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroInventarioDefectoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroInventarioDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroInventarioDefectoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
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

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
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
	
	
	public JButton getjButtonActualizarToolBarParametroInventarioDefecto() {
		return this.jButtonActualizarToolBarParametroInventarioDefecto;
	}
	
	public JButton getjButtonEliminarToolBarParametroInventarioDefecto() {
		return this.jButtonEliminarToolBarParametroInventarioDefecto;
	}
	
	public JButton getjButtonCancelarToolBarParametroInventarioDefecto() {
		return this.jButtonCancelarToolBarParametroInventarioDefecto;
	}		
	
	public JButton getjButtonProcesarInformacionParametroInventarioDefecto() {
		return this.jButtonProcesarInformacionParametroInventarioDefecto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroInventarioDefecto)	{
		this.jButtonProcesarInformacionParametroInventarioDefecto = jButtonProcesarInformacionParametroInventarioDefecto;
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
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroInventarioDefecto() {
		return this.jComboBoxTiposAccionesFormularioParametroInventarioDefecto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroInventarioDefecto(
			JComboBox jComboBoxTiposAccionesFormularioParametroInventarioDefecto) {
		this.jComboBoxTiposAccionesFormularioParametroInventarioDefecto = jComboBoxTiposAccionesFormularioParametroInventarioDefecto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		
		this.parametroinventariodefectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
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
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroInventarioDefecto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroInventarioDefecto=new JButtonMe();
				this.jButtonModificarToolBarParametroInventarioDefecto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroInventarioDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroInventarioDefecto,this.jTtoolBarDetalleParametroInventarioDefecto,
							"actualizar","actualizar","Actualizar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroInventarioDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroInventarioDefecto,this.jTtoolBarDetalleParametroInventarioDefecto,
							"eliminar","eliminar","Eliminar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroInventarioDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroInventarioDefecto,this.jTtoolBarDetalleParametroInventarioDefecto,
							"cancelar","cancelar","Cancelar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroInventarioDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroInventarioDefecto,this.jTtoolBarDetalleParametroInventarioDefecto,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroInventarioDefecto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroInventarioDefecto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroInventarioDefecto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroInventarioDefecto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroInventarioDefecto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroInventarioDefecto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroInventarioDefecto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroInventarioDefecto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroInventarioDefecto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroInventarioDefecto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroInventarioDefecto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroInventarioDefecto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroInventarioDefecto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroInventarioDefecto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroInventarioDefecto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroInventarioDefecto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroInventarioDefecto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroInventarioDefecto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroInventarioDefecto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroInventarioDefecto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroInventarioDefecto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroInventarioDefecto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroInventarioDefecto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroInventarioDefecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroInventarioDefecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroInventarioDefecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroInventarioDefecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroInventarioDefecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroInventarioDefecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroInventarioDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroInventarioDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroInventarioDefecto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroInventarioDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroInventarioDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroInventarioDefecto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroInventarioDefecto.add(this.jMenuItemDetalleCerrarParametroInventarioDefecto);
		
		this.jmenuDetalleAccionesParametroInventarioDefecto.add(this.jMenuItemActualizarParametroInventarioDefecto);
		this.jmenuDetalleAccionesParametroInventarioDefecto.add(this.jMenuItemEliminarParametroInventarioDefecto);
		this.jmenuDetalleAccionesParametroInventarioDefecto.add(this.jMenuItemCancelarParametroInventarioDefecto);		
		
		//this.jmenuDetalleDatosParametroInventarioDefecto.add(this.jMenuItemDetalleAbrirOrderByParametroInventarioDefecto);				
		this.jmenuDetalleDatosParametroInventarioDefecto.add(this.jMenuItemDetalleMostarOcultarParametroInventarioDefecto);				
				
		//this.jmenuDetalleAccionesParametroInventarioDefecto.add(this.jMenuItemGuardarCambiosParametroInventarioDefecto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroInventarioDefecto.add(this.jmenuDetalleArchivoParametroInventarioDefecto);		
		this.jmenuBarDetalleParametroInventarioDefecto.add(this.jmenuDetalleAccionesParametroInventarioDefecto);		
		this.jmenuBarDetalleParametroInventarioDefecto.add(this.jmenuDetalleDatosParametroInventarioDefecto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroInventarioDefecto);				
	}
	
	
	public void inicializarElementosCamposParametroInventarioDefecto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroInventarioDefecto = new JLabelMe();
		jLabelIdParametroInventarioDefecto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroInventarioDefecto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroInventarioDefecto= new GridBagLayout();

		this.jPanelidParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);

		jLabelidParametroInventarioDefecto = new JLabel();
		jLabelidParametroInventarioDefecto.setText("Id");

		jLabelidParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysParametroInventarioDefecto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_empresaParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroInventarioDefecto.setToolTipText("Empresa");
		this.jLabelid_empresaParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_empresaParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_empresaParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_empresaParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroInventarioDefecto.setEnabled(false);

		this.jButtonid_empresaParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_empresaParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_empresaParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroInventarioDefecto"));

		this.jButtonid_empresaParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_empresaParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_empresaParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_empresaParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroInventarioDefectoUpdate"));



					
		this.jLabelid_sucursalParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_sucursalParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalParametroInventarioDefecto.setToolTipText("Sucursal");
		this.jLabelid_sucursalParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_sucursalParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_sucursalParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_sucursalParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalParametroInventarioDefecto.setEnabled(false);

		this.jButtonid_sucursalParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_sucursalParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_sucursalParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroInventarioDefecto"));

		this.jButtonid_sucursalParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_sucursalParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_sucursalParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_sucursalParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_sucursalParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroInventarioDefectoUpdate"));



					
		this.jLabelid_grupo_bodegaParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_grupo_bodegaParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDGRUPOBODEGA+" : *");
		this.jLabelid_grupo_bodegaParametroInventarioDefecto.setToolTipText("Grupo Bodega");
		this.jLabelid_grupo_bodegaParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_bodegaParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_bodegaParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_bodegaParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_bodegaParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_bodegaParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDGRUPOBODEGA);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_grupo_bodegaParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_grupo_bodegaParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_grupo_bodegaParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_bodegaParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_bodegaParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_bodegaParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_bodegaParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_grupo_bodegaParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_bodegaParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_bodegaParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_bodegaParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_grupo_bodegaParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_bodegaParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_bodegaParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_bodegaParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_bodegaParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_bodegaParametroInventarioDefecto"));

		this.jButtonid_grupo_bodegaParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_grupo_bodegaParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_bodegaParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_bodegaParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_bodegaParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_grupo_bodegaParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_bodegaParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_bodegaParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_bodegaParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_bodegaParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_bodegaParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_bodegaParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_grupo_bodegaParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_grupo_bodegaParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_bodegaParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_bodegaParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_bodegaParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_grupo_bodegaParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_bodegaParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_bodegaParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_bodegaParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_bodegaParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_bodegaParametroInventarioDefectoUpdate"));



					
		this.jLabelid_calidad_productoParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_calidad_productoParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDCALIDADPRODUCTO+" : *");
		this.jLabelid_calidad_productoParametroInventarioDefecto.setToolTipText("Calidad Producto");
		this.jLabelid_calidad_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_calidad_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_calidad_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_calidad_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_calidad_productoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_calidad_productoParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDCALIDADPRODUCTO);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_calidad_productoParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_calidad_productoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_calidad_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_calidad_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_calidad_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_calidad_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_calidad_productoParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_calidad_productoParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_calidad_productoParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_calidad_productoParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_calidad_productoParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_calidad_productoParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_calidad_productoParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_calidad_productoParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_calidad_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_calidad_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_calidad_productoParametroInventarioDefecto"));

		this.jButtonid_calidad_productoParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_calidad_productoParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_calidad_productoParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_calidad_productoParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_calidad_productoParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_calidad_productoParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_calidad_productoParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_calidad_productoParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_calidad_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_calidad_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_calidad_productoParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_calidad_productoParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_calidad_productoParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_calidad_productoParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_calidad_productoParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_calidad_productoParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_calidad_productoParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_calidad_productoParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_calidad_productoParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_calidad_productoParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_calidad_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_calidad_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_calidad_productoParametroInventarioDefectoUpdate"));



					
		this.jLabelid_tipo_servicioParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_tipo_servicioParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDTIPOSERVICIO+" : *");
		this.jLabelid_tipo_servicioParametroInventarioDefecto.setToolTipText("Tipo Servicio");
		this.jLabelid_tipo_servicioParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_servicioParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_servicioParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_servicioParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_servicioParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_servicioParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDTIPOSERVICIO);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_tipo_servicioParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_tipo_servicioParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_tipo_servicioParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_servicioParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_servicioParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_servicioParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_servicioParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_tipo_servicioParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_servicioParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_servicioParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_servicioParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_tipo_servicioParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_servicioParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_servicioParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_servicioParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_servicioParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_servicioParametroInventarioDefecto"));

		this.jButtonid_tipo_servicioParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_tipo_servicioParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_servicioParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_servicioParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_servicioParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_tipo_servicioParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_servicioParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_servicioParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_servicioParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_servicioParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_servicioParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_servicioParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_servicioParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_tipo_servicioParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_servicioParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_servicioParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_servicioParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_tipo_servicioParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_servicioParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_servicioParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_servicioParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_servicioParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_servicioParametroInventarioDefectoUpdate"));



					
		this.jLabelid_tipo_producto_servicio_invenParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_tipo_producto_servicio_invenParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIOINVEN+" : *");
		this.jLabelid_tipo_producto_servicio_invenParametroInventarioDefecto.setToolTipText("Tipo Producto Servicio.");
		this.jLabelid_tipo_producto_servicio_invenParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicio_invenParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicio_invenParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicio_invenParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_producto_servicio_invenParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_producto_servicio_invenParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIOINVEN);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_tipo_producto_servicio_invenParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_tipo_producto_servicio_invenParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicio_invenParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicio_invenParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicio_invenParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicio_invenParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_producto_servicio_invenParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicio_invenParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicio_invenParametroInventarioDefecto"));

		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_producto_servicio_invenParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicio_invenParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicio_invenParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_producto_servicio_invenParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicio_invenParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicio_invenParametroInventarioDefectoUpdate"));



					
		this.jLabelid_tipo_producto_servicioParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_tipo_producto_servicioParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO+" : *");
		this.jLabelid_tipo_producto_servicioParametroInventarioDefecto.setToolTipText("Tipo Producto Servicio");
		this.jLabelid_tipo_producto_servicioParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicioParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_producto_servicioParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicioParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_producto_servicioParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_producto_servicioParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_tipo_producto_servicioParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_tipo_producto_servicioParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicioParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicioParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_producto_servicioParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_tipo_producto_servicioParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_producto_servicioParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_tipo_producto_servicioParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_producto_servicioParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_producto_servicioParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioParametroInventarioDefecto"));

		this.jButtonid_tipo_producto_servicioParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_tipo_producto_servicioParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicioParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_tipo_producto_servicioParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_producto_servicioParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_producto_servicioParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_producto_servicioParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_producto_servicioParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_tipo_producto_servicioParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_producto_servicioParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_producto_servicioParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_tipo_producto_servicioParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_producto_servicioParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_producto_servicioParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_producto_servicioParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_producto_servicioParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_producto_servicioParametroInventarioDefectoUpdate"));



					
		this.jLabelid_tipo_costeoParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_tipo_costeoParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDTIPOCOSTEO+" : *");
		this.jLabelid_tipo_costeoParametroInventarioDefecto.setToolTipText("Tipo Costeo");
		this.jLabelid_tipo_costeoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_costeoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_costeoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_costeoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_costeoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_costeoParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDTIPOCOSTEO);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_tipo_costeoParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_tipo_costeoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_tipo_costeoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costeoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costeoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_costeoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_costeoParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_tipo_costeoParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costeoParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costeoParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costeoParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_tipo_costeoParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_costeoParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costeoParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_costeoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costeoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costeoParametroInventarioDefecto"));

		this.jButtonid_tipo_costeoParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_tipo_costeoParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costeoParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costeoParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_costeoParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_tipo_costeoParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_costeoParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costeoParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_costeoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costeoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costeoParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_costeoParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_costeoParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_tipo_costeoParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costeoParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costeoParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_costeoParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_tipo_costeoParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_costeoParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costeoParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_costeoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costeoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costeoParametroInventarioDefectoUpdate"));



					
		this.jLabelid_tipo_productoParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_tipo_productoParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDTIPOPRODUCTO+" : *");
		this.jLabelid_tipo_productoParametroInventarioDefecto.setToolTipText("Tipo Producto");
		this.jLabelid_tipo_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_productoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_productoParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDTIPOPRODUCTO);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_tipo_productoParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_tipo_productoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_tipo_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_productoParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_tipo_productoParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_productoParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_tipo_productoParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_productoParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoParametroInventarioDefecto"));

		this.jButtonid_tipo_productoParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_tipo_productoParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_tipo_productoParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_productoParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_productoParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_productoParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_tipo_productoParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_productoParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_productoParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_tipo_productoParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_productoParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_productoParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_productoParametroInventarioDefectoUpdate"));



					
		this.jLabelid_tipo_via_transporteParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_tipo_via_transporteParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE+" : *");
		this.jLabelid_tipo_via_transporteParametroInventarioDefecto.setToolTipText("Tipo Via Transporte");
		this.jLabelid_tipo_via_transporteParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_via_transporteParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_via_transporteParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_via_transporteParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_via_transporteParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_via_transporteParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_tipo_via_transporteParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_tipo_via_transporteParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_tipo_via_transporteParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_via_transporteParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_via_transporteParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_tipo_via_transporteParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_tipo_via_transporteParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_via_transporteParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_via_transporteParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteParametroInventarioDefecto"));

		this.jButtonid_tipo_via_transporteParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_tipo_via_transporteParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_via_transporteParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_tipo_via_transporteParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_via_transporteParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_via_transporteParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_via_transporteParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_via_transporteParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_tipo_via_transporteParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_via_transporteParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_tipo_via_transporteParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_via_transporteParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_via_transporteParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteParametroInventarioDefectoUpdate"));



					
		this.jLabelid_rango_unidad_ventaParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_rango_unidad_ventaParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDRANGOUNIDADVENTA+" : *");
		this.jLabelid_rango_unidad_ventaParametroInventarioDefecto.setToolTipText("Rango Unidad Venta");
		this.jLabelid_rango_unidad_ventaParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_rango_unidad_ventaParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_rango_unidad_ventaParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_rango_unidad_ventaParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_rango_unidad_ventaParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_rango_unidad_ventaParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDRANGOUNIDADVENTA);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_rango_unidad_ventaParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_rango_unidad_ventaParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_rango_unidad_ventaParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rango_unidad_ventaParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rango_unidad_ventaParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rango_unidad_ventaParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_rango_unidad_ventaParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_rango_unidad_ventaParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rango_unidad_ventaParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rango_unidad_ventaParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rango_unidad_ventaParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_rango_unidad_ventaParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_rango_unidad_ventaParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rango_unidad_ventaParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_rango_unidad_ventaParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rango_unidad_ventaParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rango_unidad_ventaParametroInventarioDefecto"));

		this.jButtonid_rango_unidad_ventaParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_rango_unidad_ventaParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rango_unidad_ventaParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rango_unidad_ventaParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rango_unidad_ventaParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_rango_unidad_ventaParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_rango_unidad_ventaParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rango_unidad_ventaParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_rango_unidad_ventaParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rango_unidad_ventaParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rango_unidad_ventaParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_rango_unidad_ventaParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_rango_unidad_ventaParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_rango_unidad_ventaParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rango_unidad_ventaParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rango_unidad_ventaParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rango_unidad_ventaParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_rango_unidad_ventaParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_rango_unidad_ventaParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rango_unidad_ventaParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_rango_unidad_ventaParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rango_unidad_ventaParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rango_unidad_ventaParametroInventarioDefectoUpdate"));



					
		this.jLabelid_paisParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_paisParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisParametroInventarioDefecto.setToolTipText("Pais");
		this.jLabelid_paisParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_paisParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_paisParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_paisParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_paisParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_paisParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisParametroInventarioDefecto"));

		this.jButtonid_paisParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_paisParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_paisParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_paisParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_paisParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_paisParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisParametroInventarioDefectoUpdate"));



					
		this.jLabelid_ciudadParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_ciudadParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadParametroInventarioDefecto.setToolTipText("Ciudad");
		this.jLabelid_ciudadParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_ciudadParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_ciudadParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_ciudadParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_ciudadParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_ciudadParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadParametroInventarioDefecto"));

		this.jButtonid_ciudadParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_ciudadParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_ciudadParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_ciudadParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_ciudadParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_ciudadParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadParametroInventarioDefectoUpdate"));



					
		this.jLabelid_color_productoParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_color_productoParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDCOLORPRODUCTO+" : *");
		this.jLabelid_color_productoParametroInventarioDefecto.setToolTipText("Color Producto");
		this.jLabelid_color_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_color_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_color_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_color_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_color_productoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_color_productoParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDCOLORPRODUCTO);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_color_productoParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_color_productoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_color_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_color_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_color_productoParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_color_productoParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_color_productoParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_color_productoParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_color_productoParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_color_productoParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_color_productoParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_color_productoParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_color_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_color_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_color_productoParametroInventarioDefecto"));

		this.jButtonid_color_productoParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_color_productoParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_productoParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_productoParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_color_productoParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_color_productoParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_color_productoParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_color_productoParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_color_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_color_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_color_productoParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_color_productoParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_color_productoParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_color_productoParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_productoParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_productoParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_color_productoParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_color_productoParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_color_productoParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_color_productoParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_color_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_color_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_color_productoParametroInventarioDefectoUpdate"));



					
		this.jLabelid_clase_productoParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_clase_productoParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDCLASEPRODUCTO+" : *");
		this.jLabelid_clase_productoParametroInventarioDefecto.setToolTipText("Clase Producto");
		this.jLabelid_clase_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clase_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clase_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clase_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clase_productoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clase_productoParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDCLASEPRODUCTO);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_clase_productoParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_clase_productoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_clase_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clase_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clase_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clase_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clase_productoParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_clase_productoParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clase_productoParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clase_productoParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clase_productoParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_clase_productoParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clase_productoParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clase_productoParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clase_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clase_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clase_productoParametroInventarioDefecto"));

		this.jButtonid_clase_productoParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_clase_productoParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clase_productoParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clase_productoParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clase_productoParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_clase_productoParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clase_productoParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clase_productoParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clase_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clase_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clase_productoParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clase_productoParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_clase_productoParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_clase_productoParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clase_productoParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clase_productoParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clase_productoParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_clase_productoParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clase_productoParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clase_productoParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clase_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clase_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clase_productoParametroInventarioDefectoUpdate"));



					
		this.jLabelid_efecto_productoParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_efecto_productoParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDEFECTOPRODUCTO+" : *");
		this.jLabelid_efecto_productoParametroInventarioDefecto.setToolTipText("Efecto Producto");
		this.jLabelid_efecto_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_efecto_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_efecto_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_efecto_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_efecto_productoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_efecto_productoParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDEFECTOPRODUCTO);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_efecto_productoParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_efecto_productoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_efecto_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_efecto_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_efecto_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_efecto_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_efecto_productoParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_efecto_productoParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_efecto_productoParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_efecto_productoParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_efecto_productoParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_efecto_productoParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_efecto_productoParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_efecto_productoParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_efecto_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_efecto_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_efecto_productoParametroInventarioDefecto"));

		this.jButtonid_efecto_productoParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_efecto_productoParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_efecto_productoParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_efecto_productoParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_efecto_productoParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_efecto_productoParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_efecto_productoParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_efecto_productoParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_efecto_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_efecto_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_efecto_productoParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_efecto_productoParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_efecto_productoParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_efecto_productoParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_efecto_productoParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_efecto_productoParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_efecto_productoParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_efecto_productoParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_efecto_productoParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_efecto_productoParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_efecto_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_efecto_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_efecto_productoParametroInventarioDefectoUpdate"));



					
		this.jLabelid_marca_productoParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_marca_productoParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDMARCAPRODUCTO+" : *");
		this.jLabelid_marca_productoParametroInventarioDefecto.setToolTipText("Marca Producto");
		this.jLabelid_marca_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_marca_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_marca_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_marca_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_marca_productoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_marca_productoParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDMARCAPRODUCTO);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_marca_productoParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_marca_productoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_marca_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_marca_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_marca_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_marca_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_marca_productoParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_marca_productoParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_marca_productoParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_marca_productoParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_marca_productoParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_marca_productoParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_marca_productoParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_marca_productoParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_marca_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_marca_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_marca_productoParametroInventarioDefecto"));

		this.jButtonid_marca_productoParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_marca_productoParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_marca_productoParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_marca_productoParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_marca_productoParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_marca_productoParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_marca_productoParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_marca_productoParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_marca_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_marca_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_marca_productoParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_marca_productoParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_marca_productoParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_marca_productoParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_marca_productoParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_marca_productoParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_marca_productoParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_marca_productoParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_marca_productoParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_marca_productoParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_marca_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_marca_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_marca_productoParametroInventarioDefectoUpdate"));



					
		this.jLabelid_modelo_productoParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_modelo_productoParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDMODELOPRODUCTO+" : *");
		this.jLabelid_modelo_productoParametroInventarioDefecto.setToolTipText("Modelo Producto");
		this.jLabelid_modelo_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_modelo_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_modelo_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_modelo_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_modelo_productoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_modelo_productoParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDMODELOPRODUCTO);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_modelo_productoParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_modelo_productoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_modelo_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_modelo_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_modelo_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_modelo_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_modelo_productoParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_modelo_productoParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_modelo_productoParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_modelo_productoParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_modelo_productoParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_modelo_productoParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_modelo_productoParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_modelo_productoParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_modelo_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_modelo_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_modelo_productoParametroInventarioDefecto"));

		this.jButtonid_modelo_productoParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_modelo_productoParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_modelo_productoParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_modelo_productoParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_modelo_productoParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_modelo_productoParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_modelo_productoParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_modelo_productoParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_modelo_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_modelo_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_modelo_productoParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_modelo_productoParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_modelo_productoParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_modelo_productoParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_modelo_productoParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_modelo_productoParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_modelo_productoParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_modelo_productoParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_modelo_productoParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_modelo_productoParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_modelo_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_modelo_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_modelo_productoParametroInventarioDefectoUpdate"));



					
		this.jLabelid_material_productoParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_material_productoParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDMATERIALPRODUCTO+" : *");
		this.jLabelid_material_productoParametroInventarioDefecto.setToolTipText("Material Producto");
		this.jLabelid_material_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_material_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_material_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_material_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_material_productoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_material_productoParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDMATERIALPRODUCTO);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_material_productoParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_material_productoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_material_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_material_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_material_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_material_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_material_productoParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_material_productoParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_material_productoParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_material_productoParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_material_productoParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_material_productoParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_material_productoParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_material_productoParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_material_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_material_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_material_productoParametroInventarioDefecto"));

		this.jButtonid_material_productoParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_material_productoParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_material_productoParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_material_productoParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_material_productoParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_material_productoParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_material_productoParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_material_productoParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_material_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_material_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_material_productoParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_material_productoParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_material_productoParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_material_productoParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_material_productoParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_material_productoParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_material_productoParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_material_productoParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_material_productoParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_material_productoParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_material_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_material_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_material_productoParametroInventarioDefectoUpdate"));



					
		this.jLabelid_segmento_productoParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_segmento_productoParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDSEGMENTOPRODUCTO+" : *");
		this.jLabelid_segmento_productoParametroInventarioDefecto.setToolTipText("Segmento Producto");
		this.jLabelid_segmento_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_segmento_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_segmento_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_segmento_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_segmento_productoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_segmento_productoParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDSEGMENTOPRODUCTO);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_segmento_productoParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_segmento_productoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_segmento_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_segmento_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_segmento_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_segmento_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_segmento_productoParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_segmento_productoParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_segmento_productoParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_segmento_productoParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_segmento_productoParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_segmento_productoParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_segmento_productoParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_segmento_productoParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_segmento_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_segmento_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_segmento_productoParametroInventarioDefecto"));

		this.jButtonid_segmento_productoParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_segmento_productoParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_segmento_productoParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_segmento_productoParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_segmento_productoParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_segmento_productoParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_segmento_productoParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_segmento_productoParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_segmento_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_segmento_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_segmento_productoParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_segmento_productoParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_segmento_productoParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_segmento_productoParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_segmento_productoParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_segmento_productoParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_segmento_productoParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_segmento_productoParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_segmento_productoParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_segmento_productoParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_segmento_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_segmento_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_segmento_productoParametroInventarioDefectoUpdate"));



					
		this.jLabelid_talla_productoParametroInventarioDefecto = new JLabelMe();
		this.jLabelid_talla_productoParametroInventarioDefecto.setText(""+ParametroInventarioDefectoConstantesFunciones.LABEL_IDTALLAPRODUCTO+" : *");
		this.jLabelid_talla_productoParametroInventarioDefecto.setToolTipText("Talla Producto");
		this.jLabelid_talla_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_talla_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_talla_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_talla_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_talla_productoParametroInventarioDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_talla_productoParametroInventarioDefecto.setToolTipText(ParametroInventarioDefectoConstantesFunciones.LABEL_IDTALLAPRODUCTO);
		this.gridaBagLayoutParametroInventarioDefecto = new GridBagLayout();
		this.jPanelid_talla_productoParametroInventarioDefecto.setLayout(this.gridaBagLayoutParametroInventarioDefecto);


		jComboBoxid_talla_productoParametroInventarioDefecto= new JComboBoxMe();
		jComboBoxid_talla_productoParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_talla_productoParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_talla_productoParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_talla_productoParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_talla_productoParametroInventarioDefecto= new JButtonMe();
		this.jButtonid_talla_productoParametroInventarioDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_talla_productoParametroInventarioDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_talla_productoParametroInventarioDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_talla_productoParametroInventarioDefecto.setText("Buscar");
		this.jButtonid_talla_productoParametroInventarioDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_talla_productoParametroInventarioDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_talla_productoParametroInventarioDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_talla_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_talla_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_talla_productoParametroInventarioDefecto"));

		this.jButtonid_talla_productoParametroInventarioDefectoBusqueda= new JButtonMe();
		this.jButtonid_talla_productoParametroInventarioDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_talla_productoParametroInventarioDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_talla_productoParametroInventarioDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_talla_productoParametroInventarioDefectoBusqueda.setText("U");
		this.jButtonid_talla_productoParametroInventarioDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_talla_productoParametroInventarioDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_talla_productoParametroInventarioDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_talla_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_talla_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_talla_productoParametroInventarioDefectoBusqueda"));

		if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_talla_productoParametroInventarioDefectoBusqueda.setVisible(false);		}

		this.jButtonid_talla_productoParametroInventarioDefectoUpdate= new JButtonMe();
		this.jButtonid_talla_productoParametroInventarioDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_talla_productoParametroInventarioDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_talla_productoParametroInventarioDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_talla_productoParametroInventarioDefectoUpdate.setText("U");
		this.jButtonid_talla_productoParametroInventarioDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_talla_productoParametroInventarioDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_talla_productoParametroInventarioDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_talla_productoParametroInventarioDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_talla_productoParametroInventarioDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_talla_productoParametroInventarioDefectoUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
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
		//this.jInternalFrameDetalleParametroInventarioDefecto = new ParametroInventarioDefectoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Inventario Defecto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroInventarioDefecto= new GridBagLayout();
		

		
		String sToolTipParametroInventarioDefecto="";
		sToolTipParametroInventarioDefecto=ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroInventarioDefecto+="(Inventario.ParametroInventarioDefecto)";
		}
		
		if(!this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroInventarioDefecto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroInventarioDefecto = new JButtonMe();
		this.jButtonModificarParametroInventarioDefecto = new JButtonMe();
        this.jButtonActualizarParametroInventarioDefecto = new JButtonMe();
        this.jButtonEliminarParametroInventarioDefecto = new JButtonMe();
        this.jButtonCancelarParametroInventarioDefecto = new JButtonMe();
        this.jButtonGuardarCambiosParametroInventarioDefecto = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroInventarioDefecto = new JButtonMe();
		this.jButtonCerrarParametroInventarioDefecto = new JButtonMe();
		
		this.jScrollPanelDatosParametroInventarioDefecto = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroInventarioDefecto = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroInventarioDefecto = new JScrollPane();
				
		
		
		this.jPanelCamposParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposParametroInventarioDefecto=new JTabbedPane();
		
		
		this.jTabbedPaneCamposParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Inventario Defecto";
		
		if(!this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Inventario Defectos" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroInventarioDefecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroInventarioDefecto.setName("jPanelCamposParametroInventarioDefecto"); 

		this.jPanelCamposOcultosParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroInventarioDefecto.setName("jPanelCamposOcultosParametroInventarioDefecto"); 

        this.jPanelAccionesParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroInventarioDefecto.setToolTipText("Acciones");
        this.jPanelAccionesParametroInventarioDefecto.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroInventarioDefecto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroInventarioDefecto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralParametroInventarioDefecto.setName("jPanelCamposFingeneralParametroInventarioDefecto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Caracteristica"));
		this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto.setName("jPanelCamposFincaracteristicaParametroInventarioDefecto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroInventarioDefecto.setText("Nuevo");
		this.jButtonModificarParametroInventarioDefecto.setText("Editar");
        this.jButtonActualizarParametroInventarioDefecto.setText("Actualizar");
        this.jButtonEliminarParametroInventarioDefecto.setText("Eliminar");
        this.jButtonCancelarParametroInventarioDefecto.setText("Cancelar");
        this.jButtonGuardarCambiosParametroInventarioDefecto.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroInventarioDefecto.setText("Guardar");
		this.jButtonCerrarParametroInventarioDefecto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroInventarioDefecto,"nuevo_button","Nuevo",this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroInventarioDefecto,"modificar_button","Editar",this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroInventarioDefecto,"actualizar_button","Actualizar",this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroInventarioDefecto,"eliminar_button","Eliminar",this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroInventarioDefecto,"cancelar_button","Cancelar",this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroInventarioDefecto,"guardarcambios_button","Guardar",this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroInventarioDefecto,"guardarcambiostabla_button","Guardar",this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroInventarioDefecto,"cerrar_button","Salir",this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroInventarioDefecto.setToolTipText("Nuevo"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroInventarioDefecto.setToolTipText("Editar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroInventarioDefecto.setToolTipText("Actualizar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroInventarioDefecto.setToolTipText("Eliminar)"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroInventarioDefecto.setToolTipText("Cancelar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroInventarioDefecto.setToolTipText("Guardar"+" "+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
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
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoParametroInventarioDefecto";
		inputMap = this.jButtonNuevoParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroInventarioDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroInventarioDefecto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroInventarioDefecto";
		inputMap = this.jButtonActualizarParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroInventarioDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroInventarioDefecto"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroInventarioDefecto";
		inputMap = this.jButtonEliminarParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroInventarioDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroInventarioDefecto"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroInventarioDefecto";
		inputMap = this.jButtonCancelarParametroInventarioDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroInventarioDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroInventarioDefecto"));
		
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
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroInventarioDefecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroInventarioDefecto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroInventarioDefecto.setToolTipText("Nuevo ParametroInventarioDefecto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroInventarioDefecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroInventarioDefecto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroInventarioDefecto.setToolTipText("Sin Cerrar Ventana ParametroInventarioDefecto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroInventarioDefecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroInventarioDefecto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroInventarioDefecto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroInventarioDefecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroInventarioDefecto.setText("Accion");
		this.jComboBoxTiposAccionesParametroInventarioDefecto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroInventarioDefecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroInventarioDefecto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroInventarioDefecto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroInventarioDefecto = new JLabelMe();
		
		this.jLabelAccionesParametroInventarioDefecto.setText("Acciones");		
		this.jLabelAccionesParametroInventarioDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroInventarioDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroInventarioDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroInventarioDefecto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroInventarioDefecto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroInventarioDefecto=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroInventarioDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroInventarioDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroInventarioDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroInventarioDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroInventarioDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroInventarioDefecto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroInventarioDefecto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroInventarioDefecto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroInventarioDefecto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroInventarioDefecto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroInventarioDefecto = new GridBagLayout();
		
		this.jPanelCamposParametroInventarioDefecto.setLayout(gridaBagLayoutCamposParametroInventarioDefecto);
		this.jPanelCamposOcultosParametroInventarioDefecto.setLayout(gridaBagLayoutCamposOcultosParametroInventarioDefecto);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralParametroInventarioDefecto= new GridBagLayout();
		this.jPanelCamposIniciogeneralParametroInventarioDefecto.setLayout(gridaBagLayoutCamposIniciogeneralParametroInventarioDefecto);

		GridBagLayout gridaBagLayoutCamposIniciocaracteristicaParametroInventarioDefecto= new GridBagLayout();
		this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto.setLayout(gridaBagLayoutCamposIniciocaracteristicaParametroInventarioDefecto);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroInventarioDefecto.add(jLabelIdParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroInventarioDefecto.add(jLabelidParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroInventarioDefecto.add(jLabelid_empresaParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroInventarioDefecto.add(jButtonid_empresaParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroInventarioDefecto.add(jButtonid_empresaParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroInventarioDefecto.add(jComboBoxid_empresaParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalParametroInventarioDefecto.add(jLabelid_sucursalParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroInventarioDefecto.add(jButtonid_sucursalParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroInventarioDefecto.add(jButtonid_sucursalParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalParametroInventarioDefecto.add(jComboBoxid_sucursalParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_bodegaParametroInventarioDefecto.add(jLabelid_grupo_bodegaParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_bodegaParametroInventarioDefecto.add(jButtonid_grupo_bodegaParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_bodegaParametroInventarioDefecto.add(jButtonid_grupo_bodegaParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_bodegaParametroInventarioDefecto.add(jComboBoxid_grupo_bodegaParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_calidad_productoParametroInventarioDefecto.add(jLabelid_calidad_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_calidad_productoParametroInventarioDefecto.add(jButtonid_calidad_productoParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_calidad_productoParametroInventarioDefecto.add(jButtonid_calidad_productoParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_calidad_productoParametroInventarioDefecto.add(jComboBoxid_calidad_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_servicioParametroInventarioDefecto.add(jLabelid_tipo_servicioParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_servicioParametroInventarioDefecto.add(jButtonid_tipo_servicioParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_servicioParametroInventarioDefecto.add(jButtonid_tipo_servicioParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_servicioParametroInventarioDefecto.add(jComboBoxid_tipo_servicioParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_producto_servicio_invenParametroInventarioDefecto.add(jLabelid_tipo_producto_servicio_invenParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicio_invenParametroInventarioDefecto.add(jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicio_invenParametroInventarioDefecto.add(jButtonid_tipo_producto_servicio_invenParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_producto_servicio_invenParametroInventarioDefecto.add(jComboBoxid_tipo_producto_servicio_invenParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_producto_servicioParametroInventarioDefecto.add(jLabelid_tipo_producto_servicioParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicioParametroInventarioDefecto.add(jButtonid_tipo_producto_servicioParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_producto_servicioParametroInventarioDefecto.add(jButtonid_tipo_producto_servicioParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_producto_servicioParametroInventarioDefecto.add(jComboBoxid_tipo_producto_servicioParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_costeoParametroInventarioDefecto.add(jLabelid_tipo_costeoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_costeoParametroInventarioDefecto.add(jButtonid_tipo_costeoParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_costeoParametroInventarioDefecto.add(jButtonid_tipo_costeoParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_costeoParametroInventarioDefecto.add(jComboBoxid_tipo_costeoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_productoParametroInventarioDefecto.add(jLabelid_tipo_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoParametroInventarioDefecto.add(jButtonid_tipo_productoParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_productoParametroInventarioDefecto.add(jButtonid_tipo_productoParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_productoParametroInventarioDefecto.add(jComboBoxid_tipo_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_via_transporteParametroInventarioDefecto.add(jLabelid_tipo_via_transporteParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_via_transporteParametroInventarioDefecto.add(jButtonid_tipo_via_transporteParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_via_transporteParametroInventarioDefecto.add(jButtonid_tipo_via_transporteParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_via_transporteParametroInventarioDefecto.add(jComboBoxid_tipo_via_transporteParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_rango_unidad_ventaParametroInventarioDefecto.add(jLabelid_rango_unidad_ventaParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rango_unidad_ventaParametroInventarioDefecto.add(jButtonid_rango_unidad_ventaParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rango_unidad_ventaParametroInventarioDefecto.add(jButtonid_rango_unidad_ventaParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_rango_unidad_ventaParametroInventarioDefecto.add(jComboBoxid_rango_unidad_ventaParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisParametroInventarioDefecto.add(jLabelid_paisParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisParametroInventarioDefecto.add(jButtonid_paisParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisParametroInventarioDefecto.add(jButtonid_paisParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisParametroInventarioDefecto.add(jComboBoxid_paisParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadParametroInventarioDefecto.add(jLabelid_ciudadParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadParametroInventarioDefecto.add(jButtonid_ciudadParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadParametroInventarioDefecto.add(jButtonid_ciudadParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadParametroInventarioDefecto.add(jComboBoxid_ciudadParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_color_productoParametroInventarioDefecto.add(jLabelid_color_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_color_productoParametroInventarioDefecto.add(jButtonid_color_productoParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_color_productoParametroInventarioDefecto.add(jButtonid_color_productoParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_color_productoParametroInventarioDefecto.add(jComboBoxid_color_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clase_productoParametroInventarioDefecto.add(jLabelid_clase_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clase_productoParametroInventarioDefecto.add(jButtonid_clase_productoParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clase_productoParametroInventarioDefecto.add(jButtonid_clase_productoParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clase_productoParametroInventarioDefecto.add(jComboBoxid_clase_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_efecto_productoParametroInventarioDefecto.add(jLabelid_efecto_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_efecto_productoParametroInventarioDefecto.add(jButtonid_efecto_productoParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_efecto_productoParametroInventarioDefecto.add(jButtonid_efecto_productoParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_efecto_productoParametroInventarioDefecto.add(jComboBoxid_efecto_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_marca_productoParametroInventarioDefecto.add(jLabelid_marca_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_marca_productoParametroInventarioDefecto.add(jButtonid_marca_productoParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_marca_productoParametroInventarioDefecto.add(jButtonid_marca_productoParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_marca_productoParametroInventarioDefecto.add(jComboBoxid_marca_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_modelo_productoParametroInventarioDefecto.add(jLabelid_modelo_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_modelo_productoParametroInventarioDefecto.add(jButtonid_modelo_productoParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_modelo_productoParametroInventarioDefecto.add(jButtonid_modelo_productoParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_modelo_productoParametroInventarioDefecto.add(jComboBoxid_modelo_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_material_productoParametroInventarioDefecto.add(jLabelid_material_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_material_productoParametroInventarioDefecto.add(jButtonid_material_productoParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_material_productoParametroInventarioDefecto.add(jButtonid_material_productoParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_material_productoParametroInventarioDefecto.add(jComboBoxid_material_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_segmento_productoParametroInventarioDefecto.add(jLabelid_segmento_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_segmento_productoParametroInventarioDefecto.add(jButtonid_segmento_productoParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_segmento_productoParametroInventarioDefecto.add(jButtonid_segmento_productoParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_segmento_productoParametroInventarioDefecto.add(jComboBoxid_segmento_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_talla_productoParametroInventarioDefecto.add(jLabelid_talla_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 2;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_talla_productoParametroInventarioDefecto.add(jButtonid_talla_productoParametroInventarioDefectoBusqueda, this.gridBagConstraintsParametroInventarioDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = 3;
		this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
		this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_talla_productoParametroInventarioDefecto.add(jButtonid_talla_productoParametroInventarioDefectoUpdate, this.gridBagConstraintsParametroInventarioDefecto);
	}

	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = 1;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_talla_productoParametroInventarioDefecto.add(jComboBoxid_talla_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposOcultosParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposOcultosParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroInventarioDefecto.add(this.jPanelid_empresaParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposOcultosParametroInventarioDefecto % 1==0) {
		iXPanelCamposOcultosParametroInventarioDefecto=0;
		iYPanelCamposOcultosParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposOcultosParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposOcultosParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroInventarioDefecto.add(this.jPanelid_sucursalParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposOcultosParametroInventarioDefecto % 1==0) {
		iXPanelCamposOcultosParametroInventarioDefecto=0;
		iYPanelCamposOcultosParametroInventarioDefecto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciogeneralParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciogeneralParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroInventarioDefecto.add(this.jPanelidParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciogeneralParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciogeneralParametroInventarioDefecto=0;
		iYPanelCamposIniciogeneralParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciogeneralParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciogeneralParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroInventarioDefecto.add(this.jPanelid_grupo_bodegaParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciogeneralParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciogeneralParametroInventarioDefecto=0;
		iYPanelCamposIniciogeneralParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciogeneralParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciogeneralParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroInventarioDefecto.add(this.jPanelid_calidad_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciogeneralParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciogeneralParametroInventarioDefecto=0;
		iYPanelCamposIniciogeneralParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciogeneralParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciogeneralParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroInventarioDefecto.add(this.jPanelid_tipo_servicioParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciogeneralParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciogeneralParametroInventarioDefecto=0;
		iYPanelCamposIniciogeneralParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciogeneralParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciogeneralParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroInventarioDefecto.add(this.jPanelid_tipo_producto_servicio_invenParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciogeneralParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciogeneralParametroInventarioDefecto=0;
		iYPanelCamposIniciogeneralParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciogeneralParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciogeneralParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroInventarioDefecto.add(this.jPanelid_tipo_producto_servicioParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciogeneralParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciogeneralParametroInventarioDefecto=0;
		iYPanelCamposIniciogeneralParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciogeneralParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciogeneralParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroInventarioDefecto.add(this.jPanelid_tipo_costeoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciogeneralParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciogeneralParametroInventarioDefecto=0;
		iYPanelCamposIniciogeneralParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciogeneralParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciogeneralParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroInventarioDefecto.add(this.jPanelid_tipo_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciogeneralParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciogeneralParametroInventarioDefecto=0;
		iYPanelCamposIniciogeneralParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciogeneralParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciogeneralParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroInventarioDefecto.add(this.jPanelid_tipo_via_transporteParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciogeneralParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciogeneralParametroInventarioDefecto=0;
		iYPanelCamposIniciogeneralParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciogeneralParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciogeneralParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroInventarioDefecto.add(this.jPanelid_rango_unidad_ventaParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciogeneralParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciogeneralParametroInventarioDefecto=0;
		iYPanelCamposIniciogeneralParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciogeneralParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciogeneralParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroInventarioDefecto.add(this.jPanelid_paisParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciogeneralParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciogeneralParametroInventarioDefecto=0;
		iYPanelCamposIniciogeneralParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciogeneralParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciogeneralParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroInventarioDefecto.add(this.jPanelid_ciudadParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciogeneralParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciogeneralParametroInventarioDefecto=0;
		iYPanelCamposIniciogeneralParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciocaracteristicaParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciocaracteristicaParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto.add(this.jPanelid_color_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciocaracteristicaParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciocaracteristicaParametroInventarioDefecto=0;
		iYPanelCamposIniciocaracteristicaParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciocaracteristicaParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciocaracteristicaParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto.add(this.jPanelid_clase_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciocaracteristicaParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciocaracteristicaParametroInventarioDefecto=0;
		iYPanelCamposIniciocaracteristicaParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciocaracteristicaParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciocaracteristicaParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto.add(this.jPanelid_efecto_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciocaracteristicaParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciocaracteristicaParametroInventarioDefecto=0;
		iYPanelCamposIniciocaracteristicaParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciocaracteristicaParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciocaracteristicaParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto.add(this.jPanelid_marca_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciocaracteristicaParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciocaracteristicaParametroInventarioDefecto=0;
		iYPanelCamposIniciocaracteristicaParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciocaracteristicaParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciocaracteristicaParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto.add(this.jPanelid_modelo_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciocaracteristicaParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciocaracteristicaParametroInventarioDefecto=0;
		iYPanelCamposIniciocaracteristicaParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciocaracteristicaParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciocaracteristicaParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto.add(this.jPanelid_material_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciocaracteristicaParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciocaracteristicaParametroInventarioDefecto=0;
		iYPanelCamposIniciocaracteristicaParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciocaracteristicaParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciocaracteristicaParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto.add(this.jPanelid_segmento_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciocaracteristicaParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciocaracteristicaParametroInventarioDefecto=0;
		iYPanelCamposIniciocaracteristicaParametroInventarioDefecto++;
	}
	this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInventarioDefecto.gridy = iYPanelCamposIniciocaracteristicaParametroInventarioDefecto;
	this.gridBagConstraintsParametroInventarioDefecto.gridx = iXPanelCamposIniciocaracteristicaParametroInventarioDefecto++;
	this.gridBagConstraintsParametroInventarioDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInventarioDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto.add(this.jPanelid_talla_productoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);



	if(iXPanelCamposIniciocaracteristicaParametroInventarioDefecto % 1==0) {
		iXPanelCamposIniciocaracteristicaParametroInventarioDefecto=0;
		iYPanelCamposIniciocaracteristicaParametroInventarioDefecto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroInventarioDefecto= new GridBagLayout();
		this.jPanelAccionesParametroInventarioDefecto.setLayout(gridaBagLayoutAccionesParametroInventarioDefecto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroInventarioDefecto= new GridBagLayout();
		this.jPanelAccionesFormularioParametroInventarioDefecto.setLayout(gridaBagLayoutAccionesFormularioParametroInventarioDefecto);
		
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroInventarioDefecto.add(this.jComboBoxTiposAccionesFormularioParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroInventarioDefecto.add(this.jCheckBoxPostAccionNuevoParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametroinventariodefectoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroInventarioDefecto.add(this.jCheckBoxPostAccionSinCerrarParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametroinventariodefectoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroInventarioDefecto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroInventarioDefecto.add(this.jCheckBoxPostAccionSinMensajeParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroInventarioDefecto.add(this.jButtonModificarParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);							

		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;
		this.gridBagConstraintsParametroInventarioDefecto.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroInventarioDefecto.add(this.jButtonEliminarParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		
			
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;		
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroInventarioDefecto.add(this.jButtonActualizarParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);


		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;		
		this.gridBagConstraintsParametroInventarioDefecto.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroInventarioDefecto.add(this.jButtonGuardarCambiosParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);	
		
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.gridy = 0;		
		this.gridBagConstraintsParametroInventarioDefecto.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroInventarioDefecto.add(this.jButtonCancelarParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
		
			
			
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
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroInventarioDefecto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroInventarioDefecto.gridx =0;
		this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroInventarioDefecto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroInventarioDefectoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroInventarioDefecto = new ParametroInventarioDefectoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Inventario Defecto DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Parametro Inventario Defecto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Inventario Defecto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroInventarioDefectoModel parametroinventariodefectoModel=new ParametroInventarioDefectoModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroInventarioDefectoModel.ParametroInventarioDefectoFocusTraversalPolicy parametroinventariodefectoFocusTraversalPolicy = parametroinventariodefectoModel.new ParametroInventarioDefectoFocusTraversalPolicy(this);
			
			//parametroinventariodefectoFocusTraversalPolicy.setparametroinventariodefectoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametroinventariodefectoModel);
			
			
			this.jContentPaneDetalleParametroInventarioDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroInventarioDefecto = new GridBagLayout();	
			this.jContentPaneDetalleParametroInventarioDefecto.setLayout(gridaBagLayoutDetalleParametroInventarioDefecto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroInventarioDefecto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
				this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
					
				
				this.jContentPaneDetalleParametroInventarioDefecto.add(jTtoolBarDetalleParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);								
				
}
			
			this.jScrollPanelDatosEdicionParametroInventarioDefecto=   new JScrollPane(jContentPaneDetalleParametroInventarioDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroInventarioDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroInventarioDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroInventarioDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroInventarioDefecto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroInventarioDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroInventarioDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroInventarioDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposParametroInventarioDefecto.add("General",this.jPanelCamposIniciogeneralParametroInventarioDefecto);
		this.jTabbedPaneCamposParametroInventarioDefecto.add("Caracteristica",this.jPanelCamposIniciocaracteristicaParametroInventarioDefecto);
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
						
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	        
			this.jContentPaneDetalleParametroInventarioDefecto.add(jTabbedPaneCamposParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);
			
			
			//if(!this.conCargarMinimo) {
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& parametroinventariodefectoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametroinventariodefectoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroInventarioDefecto= new GridBagConstraints();
						this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
						this.jContentPaneDetalleParametroInventarioDefecto.add(this.jTabbedPaneRelacionesParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroInventarioDefecto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroInventarioDefecto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
					this.gridBagConstraintsParametroInventarioDefecto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
					
				
					this.jContentPaneDetalleParametroInventarioDefecto.add(jPanelCamposOcultosParametroInventarioDefecto, gridBagConstraintsParametroInventarioDefecto);
				
					this.jPanelCamposOcultosParametroInventarioDefecto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	        this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroInventarioDefecto.add(this.jPanelAccionesFormularioParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);							
			
			
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
	        this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroInventarioDefecto.add(this.jPanelAccionesParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroInventarioDefecto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroInventarioDefecto=   new JScrollPane(this.jPanelCamposParametroInventarioDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroInventarioDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroInventarioDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroInventarioDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
			this.gridBagConstraintsParametroInventarioDefecto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroInventarioDefecto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroInventarioDefecto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);			
			
			this.gridBagConstraintsParametroInventarioDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroInventarioDefecto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroInventarioDefecto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroInventarioDefecto, this.gridBagConstraintsParametroInventarioDefecto);									
			*/
		//}								
			
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
		
		
		//return this.jScrollPanelDatosGeneralParametroInventarioDefecto;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroInventarioDefecto;
    } 
	
		
	
	
	
	
	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
