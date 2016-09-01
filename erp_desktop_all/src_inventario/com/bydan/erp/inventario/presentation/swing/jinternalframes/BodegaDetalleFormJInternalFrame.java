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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.BodegaConstantesFunciones;

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
public class BodegaDetalleFormJInternalFrame extends BodegaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleBodega;
	
	protected JMenuBar jmenuBarDetalleBodega;
	
	protected JMenu jmenuDetalleBodega;
	protected JMenu jmenuDetalleArchivoBodega;
	protected JMenu jmenuDetalleAccionesBodega;
	protected JMenu jmenuDetalleDatosBodega;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBodega;	
	protected GridBagConstraints gridBagConstraintsBodega;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected BodegaBeanSwingJInternalFrameAdditional jInternalFrameDetalleBodega;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected GrupoBodegaBeanSwingJInternalFrame grupobodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupobodega="";

	protected CalidadProductoBeanSwingJInternalFrame calidadproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_calidadproducto="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableinventario="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecosto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableventa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledescuentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledescuento="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledevolucionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledevolucion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablebonificaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablebonifica="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableproduccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableproduccion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostobonificaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecostobonifica="";
	
	public BodegaSessionBean bodegaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public GrupoBodegaSessionBean grupobodegaSessionBean;
	public CalidadProductoSessionBean calidadproductoSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public CuentaContableSessionBean cuentacontableinventarioSessionBean;
	public CuentaContableSessionBean cuentacontablecostoSessionBean;
	public CuentaContableSessionBean cuentacontableventaSessionBean;
	public CuentaContableSessionBean cuentacontabledescuentoSessionBean;
	public CuentaContableSessionBean cuentacontabledevolucionSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	public CuentaContableSessionBean cuentacontablebonificaSessionBean;
	public CuentaContableSessionBean cuentacontableproduccionSessionBean;
	public CuentaContableSessionBean cuentacontablecostobonificaSessionBean;	
	
	public BodegaLogic bodegaLogic;
	
	public JScrollPane jScrollPanelDatosBodega;
	public JScrollPane jScrollPanelDatosEdicionBodega;
	public JScrollPane jScrollPanelDatosGeneralBodega;
	
	protected JPanel jPanelCamposBodega;    
	protected JPanel jPanelCamposOcultosBodega;    	
	protected JPanel jPanelAccionesBodega;
	protected JPanel jPanelAccionesFormularioBodega;
    
	
	
	protected JTabbedPane jTabbedPaneCamposBodega;	
	protected Integer iXPanelCamposBodega=0;
	protected Integer iYPanelCamposBodega=0;
	
	protected Integer iXPanelCamposOcultosBodega=0;
	protected Integer iYPanelCamposOcultosBodega=0;
	
	

	protected JPanel jPanelCamposIniciogeneralBodega;
	protected Integer iXPanelCamposIniciogeneralBodega=0;
	protected Integer iYPanelCamposIniciogeneralBodega=0;

	protected JPanel jPanelCamposIniciodatoBodega;
	protected Integer iXPanelCamposIniciodatoBodega=0;
	protected Integer iYPanelCamposIniciodatoBodega=0;

	protected JPanel jPanelCamposIniciocuenta_contableBodega;
	protected Integer iXPanelCamposIniciocuenta_contableBodega=0;
	protected Integer iYPanelCamposIniciocuenta_contableBodega=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoBodega;
	public JButton jButtonModificarBodega;
	public JButton jButtonActualizarBodega;
    public JButton jButtonEliminarBodega;
	public JButton jButtonCancelarBodega;
    public JButton jButtonGuardarCambiosBodega;
	public JButton jButtonGuardarCambiosTablaBodega;
	protected JButton jButtonCerrarBodega;
	
	
	protected JButton jButtonProcesarInformacionBodega;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoBodega;
	protected JCheckBox jCheckBoxPostAccionSinCerrarBodega;
	protected JCheckBox jCheckBoxPostAccionSinMensajeBodega;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBodega;
	protected JButton jButtonModificarToolBarBodega;
	protected JButton jButtonActualizarToolBarBodega;
    protected JButton jButtonEliminarToolBarBodega;
	protected JButton jButtonCancelarToolBarBodega;
    protected JButton jButtonGuardarCambiosToolBarBodega;
	protected JButton jButtonGuardarCambiosTablaToolBarBodega;
	protected JButton jButtonMostrarOcultarTablaToolBarBodega;
	protected JButton jButtonCerrarToolBarBodega;
	
	protected JButton jButtonProcesarInformacionToolBarBodega;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBodega;
	protected JMenuItem jMenuItemModificarBodega;
	protected JMenuItem jMenuItemActualizarBodega;
    protected JMenuItem jMenuItemEliminarBodega;
	protected JMenuItem jMenuItemCancelarBodega;
    protected JMenuItem jMenuItemGuardarCambiosBodega;
	protected JMenuItem jMenuItemGuardarCambiosTablaBodega;
	protected JMenuItem jMenuItemCerrarBodega;
	protected JMenuItem jMenuItemDetalleCerrarBodega;
	protected JMenuItem jMenuItemDetalleMostarOcultarBodega;
	
	protected JMenuItem jMenuItemProcesarInformacionBodega;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBodega;
	protected JMenuItem jMenuItemMostrarOcultarBodega;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBodega;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBodega;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBodega;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioBodega;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidBodega;
	public JLabel jLabelIdBodega;
	public JLabel jLabelidBodega;
	public JButton jButtonidBodegaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoBodega;
	public JLabel jLabelcodigoBodega;
	public JTextArea jTextAreacodigoBodega;
	public JScrollPane jscrollPanecodigoBodega;
	public JButton jButtoncodigoBodegaBusqueda= new JButtonMe();

	public JPanel jPanelnombreBodega;
	public JLabel jLabelnombreBodega;
	public JTextArea jTextAreanombreBodega;
	public JScrollPane jscrollPanenombreBodega;
	public JButton jButtonnombreBodegaBusqueda= new JButtonMe();

	public JPanel jPanelsiglasBodega;
	public JLabel jLabelsiglasBodega;
	public JTextField jTextFieldsiglasBodega;
	public JButton jButtonsiglasBodegaBusqueda= new JButtonMe();

	public JPanel jPaneldireccionBodega;
	public JLabel jLabeldireccionBodega;
	public JTextArea jTextAreadireccionBodega;
	public JScrollPane jscrollPanedireccionBodega;
	public JButton jButtondireccionBodegaBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoBodega;
	public JLabel jLabeltelefonoBodega;
	public JTextField jTextFieldtelefonoBodega;
	public JButton jButtontelefonoBodegaBusqueda= new JButtonMe();

	public JPanel jPanelrucBodega;
	public JLabel jLabelrucBodega;
	public JTextField jTextFieldrucBodega;
	public JButton jButtonrucBodegaBusqueda= new JButtonMe();

	public JPanel jPanelresponsable_nombreBodega;
	public JLabel jLabelresponsable_nombreBodega;
	public JTextArea jTextArearesponsable_nombreBodega;
	public JScrollPane jscrollPaneresponsable_nombreBodega;
	public JButton jButtonresponsable_nombreBodegaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionBodega;
	public JLabel jLabeldescripcionBodega;
	public JTextArea jTextAreadescripcionBodega;
	public JScrollPane jscrollPanedescripcionBodega;
	public JButton jButtondescripcionBodegaBusqueda= new JButtonMe();

	public JPanel jPaneles_multi_empresaBodega;
	public JLabel jLabeles_multi_empresaBodega;
	public JCheckBox jCheckBoxes_multi_empresaBodega;
	public JButton jButtones_multi_empresaBodegaBusqueda= new JButtonMe();

	public JPanel jPanelcon_mostrar_stockBodega;
	public JLabel jLabelcon_mostrar_stockBodega;
	public JCheckBox jCheckBoxcon_mostrar_stockBodega;
	public JButton jButtoncon_mostrar_stockBodegaBusqueda= new JButtonMe();

	public JPanel jPaneles_bodega_transitoBodega;
	public JLabel jLabeles_bodega_transitoBodega;
	public JCheckBox jCheckBoxes_bodega_transitoBodega;
	public JButton jButtones_bodega_transitoBodegaBusqueda= new JButtonMe();

	public JPanel jPanelcon_stock_negativoBodega;
	public JLabel jLabelcon_stock_negativoBodega;
	public JCheckBox jCheckBoxcon_stock_negativoBodega;
	public JButton jButtoncon_stock_negativoBodegaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaBodega;
	public JLabel jLabelid_empresaBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaBodega;
	public JButton jButtonid_empresaBodega= new JButtonMe();
	public JButton jButtonid_empresaBodegaUpdate= new JButtonMe();
	public JButton jButtonid_empresaBodegaBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_bodegaBodega;
	public JLabel jLabelid_grupo_bodegaBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_bodegaBodega;
	public JButton jButtonid_grupo_bodegaBodega= new JButtonMe();
	public JButton jButtonid_grupo_bodegaBodegaUpdate= new JButtonMe();
	public JButton jButtonid_grupo_bodegaBodegaBusqueda= new JButtonMe();

	public JPanel jPanelid_calidad_productoBodega;
	public JLabel jLabelid_calidad_productoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_calidad_productoBodega;
	public JButton jButtonid_calidad_productoBodega= new JButtonMe();
	public JButton jButtonid_calidad_productoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_calidad_productoBodegaBusqueda= new JButtonMe();

	public JPanel jPanelid_paisBodega;
	public JLabel jLabelid_paisBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisBodega;
	public JButton jButtonid_paisBodega= new JButtonMe();
	public JButton jButtonid_paisBodegaUpdate= new JButtonMe();
	public JButton jButtonid_paisBodegaBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadBodega;
	public JLabel jLabelid_ciudadBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadBodega;
	public JButton jButtonid_ciudadBodega= new JButtonMe();
	public JButton jButtonid_ciudadBodegaUpdate= new JButtonMe();
	public JButton jButtonid_ciudadBodegaBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoBodega;
	public JLabel jLabelid_centro_costoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoBodega;
	public JButton jButtonid_centro_costoBodega= new JButtonMe();
	public JButton jButtonid_centro_costoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoBodegaArbol= new JButtonMe();

	public JPanel jPanelid_empleadoBodega;
	public JLabel jLabelid_empleadoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoBodega;
	public JButton jButtonid_empleadoBodega= new JButtonMe();
	public JButton jButtonid_empleadoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoBodegaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_inventarioBodega;
	public JLabel jLabelid_cuenta_contable_inventarioBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_inventarioBodega;
	public JButton jButtonid_cuenta_contable_inventarioBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_costoBodega;
	public JLabel jLabelid_cuenta_contable_costoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costoBodega;
	public JButton jButtonid_cuenta_contable_costoBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_ventaBodega;
	public JLabel jLabelid_cuenta_contable_ventaBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ventaBodega;
	public JButton jButtonid_cuenta_contable_ventaBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_descuentoBodega;
	public JLabel jLabelid_cuenta_contable_descuentoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_descuentoBodega;
	public JButton jButtonid_cuenta_contable_descuentoBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_devolucionBodega;
	public JLabel jLabelid_cuenta_contable_devolucionBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_devolucionBodega;
	public JButton jButtonid_cuenta_contable_devolucionBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_debitoBodega;
	public JLabel jLabelid_cuenta_contable_debitoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_debitoBodega;
	public JButton jButtonid_cuenta_contable_debitoBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_creditoBodega;
	public JLabel jLabelid_cuenta_contable_creditoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoBodega;
	public JButton jButtonid_cuenta_contable_creditoBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_bonificaBodega;
	public JLabel jLabelid_cuenta_contable_bonificaBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_bonificaBodega;
	public JButton jButtonid_cuenta_contable_bonificaBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_bonificaBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_bonificaBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_bonificaBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_produccionBodega;
	public JLabel jLabelid_cuenta_contable_produccionBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_produccionBodega;
	public JButton jButtonid_cuenta_contable_produccionBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_produccionBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_produccionBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_produccionBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_costo_bonificaBodega;
	public JLabel jLabelid_cuenta_contable_costo_bonificaBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costo_bonificaBodega;
	public JButton jButtonid_cuenta_contable_costo_bonificaBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_bonificaBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_bonificaBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_bonificaBodegaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesBodega;
	
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
		
	public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=1100;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public BodegaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposBodega=new JPanel();
				this.jPanelAccionesFormularioBodega=new JPanel();
				this.jmenuBarDetalleBodega=new JMenuBar();
				this.jTtoolBarDetalleBodega=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Bodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public BodegaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Bodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Bodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Bodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Bodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarBodega() {
		return this.jButtonActualizarToolBarBodega;
	}
	
	public JButton getjButtonEliminarToolBarBodega() {
		return this.jButtonEliminarToolBarBodega;
	}
	
	public JButton getjButtonCancelarToolBarBodega() {
		return this.jButtonCancelarToolBarBodega;
	}		
	
	public JButton getjButtonProcesarInformacionBodega() {
		return this.jButtonProcesarInformacionBodega;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBodega)	{
		this.jButtonProcesarInformacionBodega = jButtonProcesarInformacionBodega;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBodega() {
		return this.jComboBoxTiposAccionesBodega;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBodega(
			JComboBox jComboBoxTiposRelacionesBodega) {
		this.jComboBoxTiposRelacionesBodega = jComboBoxTiposRelacionesBodega;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBodega(
			JComboBox jComboBoxTiposAccionesBodega) {
		this.jComboBoxTiposAccionesBodega = jComboBoxTiposAccionesBodega;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioBodega() {
		return this.jComboBoxTiposAccionesFormularioBodega;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioBodega(
			JComboBox jComboBoxTiposAccionesFormularioBodega) {
		this.jComboBoxTiposAccionesFormularioBodega = jComboBoxTiposAccionesFormularioBodega;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.bodegaSessionBean=new BodegaSessionBean();
		
		this.bodegaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bodegaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bodegaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BodegaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BodegaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BodegaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Bodega MANTENIMIENTO"));
		
		
		if(iWidth > 3050) {
			iWidth=3050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.bodegaSessionBean.getEsGuardarRelacionado()) {
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
	
		BodegaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleBodega= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarBodega=new JButtonMe();
				this.jButtonModificarToolBarBodega=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarBodega,this.jTtoolBarDetalleBodega,
							"actualizar","actualizar","Actualizar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarBodega,this.jTtoolBarDetalleBodega,
							"eliminar","eliminar","Eliminar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarBodega,this.jTtoolBarDetalleBodega,
							"cancelar","cancelar","Cancelar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarBodega,this.jTtoolBarDetalleBodega,
							"guardarcambios","guardarcambios","Guardar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarBodega,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarBodega,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarBodega,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleBodega=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleBodega=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoBodega=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesBodega=new JMenuMe("Acciones");
		this.jmenuDetalleDatosBodega=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBodega= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBodega.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBodega,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarBodega= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarBodega.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarBodega,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarBodega= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarBodega.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarBodega,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarBodega= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarBodega.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarBodega,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarBodega= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarBodega.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarBodega,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosBodega= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBodega.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBodega,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBodega= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBodega.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBodega,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarBodega= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarBodega.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarBodega,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBodega= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBodega.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBodega,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBodega= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBodega.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBodega,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBodega, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoBodega.add(this.jMenuItemDetalleCerrarBodega);
		
		this.jmenuDetalleAccionesBodega.add(this.jMenuItemActualizarBodega);
		this.jmenuDetalleAccionesBodega.add(this.jMenuItemEliminarBodega);
		this.jmenuDetalleAccionesBodega.add(this.jMenuItemCancelarBodega);		
		
		//this.jmenuDetalleDatosBodega.add(this.jMenuItemDetalleAbrirOrderByBodega);				
		this.jmenuDetalleDatosBodega.add(this.jMenuItemDetalleMostarOcultarBodega);				
				
		//this.jmenuDetalleAccionesBodega.add(this.jMenuItemGuardarCambiosBodega);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosBodega, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleBodega.add(this.jmenuDetalleArchivoBodega);		
		this.jmenuBarDetalleBodega.add(this.jmenuDetalleAccionesBodega);		
		this.jmenuBarDetalleBodega.add(this.jmenuDetalleDatosBodega);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleBodega);				
	}
	
	
	public void inicializarElementosCamposBodega() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdBodega = new JLabelMe();
		jLabelIdBodega.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidBodega = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidBodega.setToolTipText(BodegaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutBodega= new GridBagLayout();

		this.jPanelidBodega.setLayout(this.gridaBagLayoutBodega);

		jLabelidBodega = new JLabel();
		jLabelidBodega.setText("Id");

		jLabelidBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoBodega = new JLabelMe();
		this.jLabelcodigoBodega.setText(""+BodegaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoBodega.setToolTipText("Codigo");
		this.jLabelcodigoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoBodega.setToolTipText(BodegaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelcodigoBodega.setLayout(this.gridaBagLayoutBodega);


		jTextAreacodigoBodega= new JTextAreaMe();
		jTextAreacodigoBodega.setEnabled(false);
		jTextAreacodigoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBodega.setLineWrap(true);
		jTextAreacodigoBodega.setWrapStyleWord(true);
		jTextAreacodigoBodega.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigoBodega.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacodigoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigoBodega = new JScrollPane(jTextAreacodigoBodega);
		jscrollPanecodigoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigoBodegaBusqueda= new JButtonMe();
		this.jButtoncodigoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoBodegaBusqueda.setText("U");
		this.jButtoncodigoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoBodegaBusqueda.setVisible(false);		}


					
		this.jLabelnombreBodega = new JLabelMe();
		this.jLabelnombreBodega.setText(""+BodegaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreBodega.setToolTipText("Nombre");
		this.jLabelnombreBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreBodega.setToolTipText(BodegaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelnombreBodega.setLayout(this.gridaBagLayoutBodega);


		jTextAreanombreBodega= new JTextAreaMe();
		jTextAreanombreBodega.setEnabled(false);
		jTextAreanombreBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBodega.setLineWrap(true);
		jTextAreanombreBodega.setWrapStyleWord(true);
		jTextAreanombreBodega.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreBodega.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreBodega = new JScrollPane(jTextAreanombreBodega);
		jscrollPanenombreBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreBodegaBusqueda= new JButtonMe();
		this.jButtonnombreBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreBodegaBusqueda.setText("U");
		this.jButtonnombreBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreBodegaBusqueda.setVisible(false);		}


					
		this.jLabelsiglasBodega = new JLabelMe();
		this.jLabelsiglasBodega.setText(""+BodegaConstantesFunciones.LABEL_SIGLAS+" : *");
		this.jLabelsiglasBodega.setToolTipText("Siglas");
		this.jLabelsiglasBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsiglasBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsiglasBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsiglasBodega.setToolTipText(BodegaConstantesFunciones.LABEL_SIGLAS);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelsiglasBodega.setLayout(this.gridaBagLayoutBodega);


		jTextFieldsiglasBodega= new JTextFieldMe();

		jTextFieldsiglasBodega.setEnabled(false);
		jTextFieldsiglasBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsiglasBodegaBusqueda= new JButtonMe();
		this.jButtonsiglasBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsiglasBodegaBusqueda.setText("U");
		this.jButtonsiglasBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsiglasBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsiglasBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsiglasBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsiglasBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"siglasBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsiglasBodegaBusqueda.setVisible(false);		}


					
		this.jLabeldireccionBodega = new JLabelMe();
		this.jLabeldireccionBodega.setText(""+BodegaConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionBodega.setToolTipText("Direccion");
		this.jLabeldireccionBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionBodega.setToolTipText(BodegaConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPaneldireccionBodega.setLayout(this.gridaBagLayoutBodega);


		jTextAreadireccionBodega= new JTextAreaMe();
		jTextAreadireccionBodega.setEnabled(false);
		jTextAreadireccionBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionBodega.setLineWrap(true);
		jTextAreadireccionBodega.setWrapStyleWord(true);
		jTextAreadireccionBodega.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionBodega.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionBodega = new JScrollPane(jTextAreadireccionBodega);
		jscrollPanedireccionBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccionBodegaBusqueda= new JButtonMe();
		this.jButtondireccionBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionBodegaBusqueda.setText("U");
		this.jButtondireccionBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionBodegaBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoBodega = new JLabelMe();
		this.jLabeltelefonoBodega.setText(""+BodegaConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoBodega.setToolTipText("Telefono");
		this.jLabeltelefonoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoBodega.setToolTipText(BodegaConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPaneltelefonoBodega.setLayout(this.gridaBagLayoutBodega);


		jTextFieldtelefonoBodega= new JTextFieldMe();

		jTextFieldtelefonoBodega.setEnabled(false);
		jTextFieldtelefonoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoBodegaBusqueda= new JButtonMe();
		this.jButtontelefonoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoBodegaBusqueda.setText("U");
		this.jButtontelefonoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoBodegaBusqueda.setVisible(false);		}


					
		this.jLabelrucBodega = new JLabelMe();
		this.jLabelrucBodega.setText(""+BodegaConstantesFunciones.LABEL_RUC+" :");
		this.jLabelrucBodega.setToolTipText("Ruc");
		this.jLabelrucBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucBodega.setToolTipText(BodegaConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelrucBodega.setLayout(this.gridaBagLayoutBodega);


		jTextFieldrucBodega= new JTextFieldMe();

		jTextFieldrucBodega.setEnabled(false);
		jTextFieldrucBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucBodegaBusqueda= new JButtonMe();
		this.jButtonrucBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucBodegaBusqueda.setText("U");
		this.jButtonrucBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucBodegaBusqueda.setVisible(false);		}


					
		this.jLabelresponsable_nombreBodega = new JLabelMe();
		this.jLabelresponsable_nombreBodega.setText(""+BodegaConstantesFunciones.LABEL_RESPONSABLENOMBRE+" : *");
		this.jLabelresponsable_nombreBodega.setToolTipText("Responsable Nombre");
		this.jLabelresponsable_nombreBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelresponsable_nombreBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelresponsable_nombreBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelresponsable_nombreBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelresponsable_nombreBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelresponsable_nombreBodega.setToolTipText(BodegaConstantesFunciones.LABEL_RESPONSABLENOMBRE);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelresponsable_nombreBodega.setLayout(this.gridaBagLayoutBodega);


		jTextArearesponsable_nombreBodega= new JTextAreaMe();
		jTextArearesponsable_nombreBodega.setEnabled(false);
		jTextArearesponsable_nombreBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsable_nombreBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsable_nombreBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsable_nombreBodega.setLineWrap(true);
		jTextArearesponsable_nombreBodega.setWrapStyleWord(true);
		jTextArearesponsable_nombreBodega.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearesponsable_nombreBodega.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextArearesponsable_nombreBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneresponsable_nombreBodega = new JScrollPane(jTextArearesponsable_nombreBodega);
		jscrollPaneresponsable_nombreBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneresponsable_nombreBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneresponsable_nombreBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonresponsable_nombreBodegaBusqueda= new JButtonMe();
		this.jButtonresponsable_nombreBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsable_nombreBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsable_nombreBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonresponsable_nombreBodegaBusqueda.setText("U");
		this.jButtonresponsable_nombreBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonresponsable_nombreBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonresponsable_nombreBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearesponsable_nombreBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearesponsable_nombreBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"responsable_nombreBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonresponsable_nombreBodegaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionBodega = new JLabelMe();
		this.jLabeldescripcionBodega.setText(""+BodegaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionBodega.setToolTipText("Descripcion");
		this.jLabeldescripcionBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionBodega.setToolTipText(BodegaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPaneldescripcionBodega.setLayout(this.gridaBagLayoutBodega);


		jTextAreadescripcionBodega= new JTextAreaMe();
		jTextAreadescripcionBodega.setEnabled(false);
		jTextAreadescripcionBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionBodega.setLineWrap(true);
		jTextAreadescripcionBodega.setWrapStyleWord(true);
		jTextAreadescripcionBodega.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionBodega.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionBodega = new JScrollPane(jTextAreadescripcionBodega);
		jscrollPanedescripcionBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionBodegaBusqueda= new JButtonMe();
		this.jButtondescripcionBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionBodegaBusqueda.setText("U");
		this.jButtondescripcionBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionBodegaBusqueda.setVisible(false);		}


					
		this.jLabeles_multi_empresaBodega = new JLabelMe();
		this.jLabeles_multi_empresaBodega.setText(""+BodegaConstantesFunciones.LABEL_ESMULTIEMPRESA+" : *");
		this.jLabeles_multi_empresaBodega.setToolTipText("Multi Empresa");
		this.jLabeles_multi_empresaBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_multi_empresaBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_multi_empresaBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_multi_empresaBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_multi_empresaBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_multi_empresaBodega.setToolTipText(BodegaConstantesFunciones.LABEL_ESMULTIEMPRESA);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPaneles_multi_empresaBodega.setLayout(this.gridaBagLayoutBodega);


		jCheckBoxes_multi_empresaBodega= new JCheckBoxMe();
		jCheckBoxes_multi_empresaBodega.setEnabled(false);

		jCheckBoxes_multi_empresaBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_multi_empresaBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_multi_empresaBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_multi_empresaBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_multi_empresaBodegaBusqueda= new JButtonMe();
		this.jButtones_multi_empresaBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_multi_empresaBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_multi_empresaBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_multi_empresaBodegaBusqueda.setText("U");
		this.jButtones_multi_empresaBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_multi_empresaBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_multi_empresaBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_multi_empresaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_multi_empresaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_multi_empresaBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_multi_empresaBodegaBusqueda.setVisible(false);		}


					
		this.jLabelcon_mostrar_stockBodega = new JLabelMe();
		this.jLabelcon_mostrar_stockBodega.setText(""+BodegaConstantesFunciones.LABEL_CONMOSTRARSTOCK+" : *");
		this.jLabelcon_mostrar_stockBodega.setToolTipText("Mostrar Stock");
		this.jLabelcon_mostrar_stockBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_mostrar_stockBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_mostrar_stockBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_mostrar_stockBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_mostrar_stockBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_mostrar_stockBodega.setToolTipText(BodegaConstantesFunciones.LABEL_CONMOSTRARSTOCK);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelcon_mostrar_stockBodega.setLayout(this.gridaBagLayoutBodega);


		jCheckBoxcon_mostrar_stockBodega= new JCheckBoxMe();
		jCheckBoxcon_mostrar_stockBodega.setEnabled(false);

		jCheckBoxcon_mostrar_stockBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mostrar_stockBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mostrar_stockBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_mostrar_stockBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_mostrar_stockBodegaBusqueda= new JButtonMe();
		this.jButtoncon_mostrar_stockBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_mostrar_stockBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_mostrar_stockBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_mostrar_stockBodegaBusqueda.setText("U");
		this.jButtoncon_mostrar_stockBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_mostrar_stockBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_mostrar_stockBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_mostrar_stockBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_mostrar_stockBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_mostrar_stockBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_mostrar_stockBodegaBusqueda.setVisible(false);		}


					
		this.jLabeles_bodega_transitoBodega = new JLabelMe();
		this.jLabeles_bodega_transitoBodega.setText(""+BodegaConstantesFunciones.LABEL_ESBODEGATRANSITO+" : *");
		this.jLabeles_bodega_transitoBodega.setToolTipText("Bodega Transito");
		this.jLabeles_bodega_transitoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_bodega_transitoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_bodega_transitoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_bodega_transitoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_bodega_transitoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_bodega_transitoBodega.setToolTipText(BodegaConstantesFunciones.LABEL_ESBODEGATRANSITO);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPaneles_bodega_transitoBodega.setLayout(this.gridaBagLayoutBodega);


		jCheckBoxes_bodega_transitoBodega= new JCheckBoxMe();
		jCheckBoxes_bodega_transitoBodega.setEnabled(false);

		jCheckBoxes_bodega_transitoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_bodega_transitoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_bodega_transitoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_bodega_transitoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_bodega_transitoBodegaBusqueda= new JButtonMe();
		this.jButtones_bodega_transitoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_bodega_transitoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_bodega_transitoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_bodega_transitoBodegaBusqueda.setText("U");
		this.jButtones_bodega_transitoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_bodega_transitoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_bodega_transitoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_bodega_transitoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_bodega_transitoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_bodega_transitoBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_bodega_transitoBodegaBusqueda.setVisible(false);		}


					
		this.jLabelcon_stock_negativoBodega = new JLabelMe();
		this.jLabelcon_stock_negativoBodega.setText(""+BodegaConstantesFunciones.LABEL_CONSTOCKNEGATIVO+" : *");
		this.jLabelcon_stock_negativoBodega.setToolTipText("Stock Negativo");
		this.jLabelcon_stock_negativoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_stock_negativoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_stock_negativoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_stock_negativoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_stock_negativoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_stock_negativoBodega.setToolTipText(BodegaConstantesFunciones.LABEL_CONSTOCKNEGATIVO);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelcon_stock_negativoBodega.setLayout(this.gridaBagLayoutBodega);


		jCheckBoxcon_stock_negativoBodega= new JCheckBoxMe();
		jCheckBoxcon_stock_negativoBodega.setEnabled(false);

		jCheckBoxcon_stock_negativoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_stock_negativoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_stock_negativoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_stock_negativoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_stock_negativoBodegaBusqueda= new JButtonMe();
		this.jButtoncon_stock_negativoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_stock_negativoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_stock_negativoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_stock_negativoBodegaBusqueda.setText("U");
		this.jButtoncon_stock_negativoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_stock_negativoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_stock_negativoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_stock_negativoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_stock_negativoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_stock_negativoBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_stock_negativoBodegaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysBodega() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaBodega = new JLabelMe();
		this.jLabelid_empresaBodega.setText(""+BodegaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaBodega.setToolTipText("Empresa");
		this.jLabelid_empresaBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaBodega.setToolTipText(BodegaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelid_empresaBodega.setLayout(this.gridaBagLayoutBodega);


		jComboBoxid_empresaBodega= new JComboBoxMe();
		jComboBoxid_empresaBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaBodega,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaBodega.setEnabled(false);

		this.jButtonid_empresaBodega= new JButtonMe();
		this.jButtonid_empresaBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBodega.setText("Buscar");
		this.jButtonid_empresaBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBodega"));

		this.jButtonid_empresaBodegaBusqueda= new JButtonMe();
		this.jButtonid_empresaBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBodegaBusqueda.setText("U");
		this.jButtonid_empresaBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaBodegaBusqueda.setVisible(false);		}

		this.jButtonid_empresaBodegaUpdate= new JButtonMe();
		this.jButtonid_empresaBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBodegaUpdate.setText("U");
		this.jButtonid_empresaBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBodegaUpdate"));



					
		this.jLabelid_grupo_bodegaBodega = new JLabelMe();
		this.jLabelid_grupo_bodegaBodega.setText(""+BodegaConstantesFunciones.LABEL_IDGRUPOBODEGA+" : *");
		this.jLabelid_grupo_bodegaBodega.setToolTipText("Grupo Bodega");
		this.jLabelid_grupo_bodegaBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_bodegaBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_bodegaBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_bodegaBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_bodegaBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_bodegaBodega.setToolTipText(BodegaConstantesFunciones.LABEL_IDGRUPOBODEGA);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelid_grupo_bodegaBodega.setLayout(this.gridaBagLayoutBodega);


		jComboBoxid_grupo_bodegaBodega= new JComboBoxMe();
		jComboBoxid_grupo_bodegaBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_bodegaBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_bodegaBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_bodegaBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_bodegaBodega= new JButtonMe();
		this.jButtonid_grupo_bodegaBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_bodegaBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_bodegaBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_bodegaBodega.setText("Buscar");
		this.jButtonid_grupo_bodegaBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_bodegaBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_bodegaBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_bodegaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_bodegaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_bodegaBodega"));

		this.jButtonid_grupo_bodegaBodegaBusqueda= new JButtonMe();
		this.jButtonid_grupo_bodegaBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_bodegaBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_bodegaBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_bodegaBodegaBusqueda.setText("U");
		this.jButtonid_grupo_bodegaBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_bodegaBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_bodegaBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_bodegaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_bodegaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_bodegaBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_bodegaBodegaBusqueda.setVisible(false);		}

		this.jButtonid_grupo_bodegaBodegaUpdate= new JButtonMe();
		this.jButtonid_grupo_bodegaBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_bodegaBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_bodegaBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_bodegaBodegaUpdate.setText("U");
		this.jButtonid_grupo_bodegaBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_bodegaBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_bodegaBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_bodegaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_bodegaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_bodegaBodegaUpdate"));



					
		this.jLabelid_calidad_productoBodega = new JLabelMe();
		this.jLabelid_calidad_productoBodega.setText(""+BodegaConstantesFunciones.LABEL_IDCALIDADPRODUCTO+" : *");
		this.jLabelid_calidad_productoBodega.setToolTipText("Calidad Producto");
		this.jLabelid_calidad_productoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_calidad_productoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_calidad_productoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_calidad_productoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_calidad_productoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_calidad_productoBodega.setToolTipText(BodegaConstantesFunciones.LABEL_IDCALIDADPRODUCTO);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelid_calidad_productoBodega.setLayout(this.gridaBagLayoutBodega);


		jComboBoxid_calidad_productoBodega= new JComboBoxMe();
		jComboBoxid_calidad_productoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_calidad_productoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_calidad_productoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_calidad_productoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_calidad_productoBodega= new JButtonMe();
		this.jButtonid_calidad_productoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_calidad_productoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_calidad_productoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_calidad_productoBodega.setText("Buscar");
		this.jButtonid_calidad_productoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_calidad_productoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_calidad_productoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_calidad_productoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_calidad_productoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_calidad_productoBodega"));

		this.jButtonid_calidad_productoBodegaBusqueda= new JButtonMe();
		this.jButtonid_calidad_productoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_calidad_productoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_calidad_productoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_calidad_productoBodegaBusqueda.setText("U");
		this.jButtonid_calidad_productoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_calidad_productoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_calidad_productoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_calidad_productoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_calidad_productoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_calidad_productoBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_calidad_productoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_calidad_productoBodegaUpdate= new JButtonMe();
		this.jButtonid_calidad_productoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_calidad_productoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_calidad_productoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_calidad_productoBodegaUpdate.setText("U");
		this.jButtonid_calidad_productoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_calidad_productoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_calidad_productoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_calidad_productoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_calidad_productoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_calidad_productoBodegaUpdate"));



					
		this.jLabelid_paisBodega = new JLabelMe();
		this.jLabelid_paisBodega.setText(""+BodegaConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisBodega.setToolTipText("Pais");
		this.jLabelid_paisBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisBodega.setToolTipText(BodegaConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelid_paisBodega.setLayout(this.gridaBagLayoutBodega);


		jComboBoxid_paisBodega= new JComboBoxMe();
		jComboBoxid_paisBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisBodega= new JButtonMe();
		this.jButtonid_paisBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisBodega.setText("Buscar");
		this.jButtonid_paisBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisBodega"));

		this.jButtonid_paisBodegaBusqueda= new JButtonMe();
		this.jButtonid_paisBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisBodegaBusqueda.setText("U");
		this.jButtonid_paisBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisBodegaBusqueda.setVisible(false);		}

		this.jButtonid_paisBodegaUpdate= new JButtonMe();
		this.jButtonid_paisBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisBodegaUpdate.setText("U");
		this.jButtonid_paisBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisBodegaUpdate"));



					
		this.jLabelid_ciudadBodega = new JLabelMe();
		this.jLabelid_ciudadBodega.setText(""+BodegaConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadBodega.setToolTipText("Ciudad");
		this.jLabelid_ciudadBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadBodega.setToolTipText(BodegaConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelid_ciudadBodega.setLayout(this.gridaBagLayoutBodega);


		jComboBoxid_ciudadBodega= new JComboBoxMe();
		jComboBoxid_ciudadBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadBodega= new JButtonMe();
		this.jButtonid_ciudadBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadBodega.setText("Buscar");
		this.jButtonid_ciudadBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadBodega"));

		this.jButtonid_ciudadBodegaBusqueda= new JButtonMe();
		this.jButtonid_ciudadBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadBodegaBusqueda.setText("U");
		this.jButtonid_ciudadBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadBodegaBusqueda.setVisible(false);		}

		this.jButtonid_ciudadBodegaUpdate= new JButtonMe();
		this.jButtonid_ciudadBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadBodegaUpdate.setText("U");
		this.jButtonid_ciudadBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadBodegaUpdate"));



					
		this.jLabelid_centro_costoBodega = new JLabelMe();
		this.jLabelid_centro_costoBodega.setText(""+BodegaConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoBodega.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoBodega.setToolTipText(BodegaConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelid_centro_costoBodega.setLayout(this.gridaBagLayoutBodega);


		jComboBoxid_centro_costoBodega= new JComboBoxMe();
		jComboBoxid_centro_costoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoBodega= new JButtonMe();
		this.jButtonid_centro_costoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoBodega.setText("Buscar");
		this.jButtonid_centro_costoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoBodega"));

		this.jButtonid_centro_costoBodegaBusqueda= new JButtonMe();
		this.jButtonid_centro_costoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoBodegaBusqueda.setText("U");
		this.jButtonid_centro_costoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoBodegaUpdate= new JButtonMe();
		this.jButtonid_centro_costoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoBodegaUpdate.setText("U");
		this.jButtonid_centro_costoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoBodegaUpdate"));


		jButtonid_centro_costoBodegaArbol= new JButtonMe();
		jButtonid_centro_costoBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoBodegaArbol.setText("Arbol");
		jButtonid_centro_costoBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoBodegaArbol"));



					
		this.jLabelid_empleadoBodega = new JLabelMe();
		this.jLabelid_empleadoBodega.setText(""+BodegaConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoBodega.setToolTipText("Empleado");
		this.jLabelid_empleadoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoBodega.setToolTipText(BodegaConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelid_empleadoBodega.setLayout(this.gridaBagLayoutBodega);


		jComboBoxid_empleadoBodega= new JComboBoxMe();
		jComboBoxid_empleadoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoBodega= new JButtonMe();
		this.jButtonid_empleadoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoBodega.setText("Buscar");
		this.jButtonid_empleadoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoBodega"));

		this.jButtonid_empleadoBodegaBusqueda= new JButtonMe();
		this.jButtonid_empleadoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoBodegaBusqueda.setText("U");
		this.jButtonid_empleadoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_empleadoBodegaUpdate= new JButtonMe();
		this.jButtonid_empleadoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoBodegaUpdate.setText("U");
		this.jButtonid_empleadoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoBodegaUpdate"));



					
		this.jLabelid_cuenta_contable_inventarioBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_inventarioBodega.setText(""+BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIO+" : *");
		this.jLabelid_cuenta_contable_inventarioBodega.setToolTipText("Cuenta C. Inventario");
		this.jLabelid_cuenta_contable_inventarioBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_inventarioBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_inventarioBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_inventarioBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_inventarioBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_inventarioBodega.setToolTipText(BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIO);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_inventarioBodega.setLayout(this.gridaBagLayoutBodega);


		jComboBoxid_cuenta_contable_inventarioBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_inventarioBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventarioBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventarioBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_inventarioBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_inventarioBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_inventarioBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_inventarioBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_inventarioBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioBodega"));

		this.jButtonid_cuenta_contable_inventarioBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inventarioBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_inventarioBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_inventarioBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_inventarioBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_inventarioBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_inventarioBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inventarioBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_inventarioBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_inventarioBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_inventarioBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioBodegaUpdate"));


		jButtonid_cuenta_contable_inventarioBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_inventarioBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_inventarioBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_inventarioBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_inventarioBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioBodegaArbol"));



					
		this.jLabelid_cuenta_contable_costoBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_costoBodega.setText(""+BodegaConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO+" : *");
		this.jLabelid_cuenta_contable_costoBodega.setToolTipText("Cuenta C. Costo");
		this.jLabelid_cuenta_contable_costoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_costoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_costoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_costoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_costoBodega.setToolTipText(BodegaConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_costoBodega.setLayout(this.gridaBagLayoutBodega);


		jComboBoxid_cuenta_contable_costoBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_costoBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_costoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_costoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_costoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_costoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoBodega"));

		this.jButtonid_cuenta_contable_costoBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_costoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costoBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_costoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_costoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_costoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_costoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_costoBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_costoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costoBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_costoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_costoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_costoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoBodegaUpdate"));


		jButtonid_cuenta_contable_costoBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_costoBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_costoBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_costoBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_costoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoBodegaArbol"));



					
		this.jLabelid_cuenta_contable_ventaBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_ventaBodega.setText(""+BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA+" : *");
		this.jLabelid_cuenta_contable_ventaBodega.setToolTipText("Cuenta C. Venta");
		this.jLabelid_cuenta_contable_ventaBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ventaBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ventaBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ventaBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_ventaBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_ventaBodega.setToolTipText(BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_ventaBodega.setLayout(this.gridaBagLayoutBodega);


		jComboBoxid_cuenta_contable_ventaBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ventaBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ventaBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_ventaBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_ventaBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_ventaBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_ventaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaBodega"));

		this.jButtonid_cuenta_contable_ventaBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ventaBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_ventaBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_ventaBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_ventaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_ventaBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_ventaBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ventaBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_ventaBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_ventaBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_ventaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaBodegaUpdate"));


		jButtonid_cuenta_contable_ventaBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_ventaBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_ventaBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_ventaBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_ventaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaBodegaArbol"));



					
		this.jLabelid_cuenta_contable_descuentoBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_descuentoBodega.setText(""+BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO+" : *");
		this.jLabelid_cuenta_contable_descuentoBodega.setToolTipText("Cuenta C. Descuento");
		this.jLabelid_cuenta_contable_descuentoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_descuentoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_descuentoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_descuentoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_descuentoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_descuentoBodega.setToolTipText(BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_descuentoBodega.setLayout(this.gridaBagLayoutBodega);


		jComboBoxid_cuenta_contable_descuentoBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_descuentoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_descuentoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_descuentoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_descuentoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_descuentoBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_descuentoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_descuentoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_descuentoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoBodega"));

		this.jButtonid_cuenta_contable_descuentoBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_descuentoBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_descuentoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_descuentoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_descuentoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_descuentoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_descuentoBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_descuentoBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_descuentoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_descuentoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_descuentoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoBodegaUpdate"));


		jButtonid_cuenta_contable_descuentoBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_descuentoBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_descuentoBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_descuentoBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_descuentoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoBodegaArbol"));



					
		this.jLabelid_cuenta_contable_devolucionBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_devolucionBodega.setText(""+BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION+" : *");
		this.jLabelid_cuenta_contable_devolucionBodega.setToolTipText("Cuenta C. Devolucion");
		this.jLabelid_cuenta_contable_devolucionBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_devolucionBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_devolucionBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_devolucionBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_devolucionBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_devolucionBodega.setToolTipText(BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_devolucionBodega.setLayout(this.gridaBagLayoutBodega);


		jComboBoxid_cuenta_contable_devolucionBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_devolucionBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_devolucionBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_devolucionBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_devolucionBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_devolucionBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_devolucionBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_devolucionBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_devolucionBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionBodega"));

		this.jButtonid_cuenta_contable_devolucionBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_devolucionBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_devolucionBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_devolucionBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_devolucionBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_devolucionBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_devolucionBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_devolucionBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_devolucionBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_devolucionBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_devolucionBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionBodegaUpdate"));


		jButtonid_cuenta_contable_devolucionBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_devolucionBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_devolucionBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_devolucionBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_devolucionBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionBodegaArbol"));



					
		this.jLabelid_cuenta_contable_debitoBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_debitoBodega.setText(""+BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO+" : *");
		this.jLabelid_cuenta_contable_debitoBodega.setToolTipText("Cuenta C. Debito");
		this.jLabelid_cuenta_contable_debitoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_debitoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_debitoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_debitoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_debitoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_debitoBodega.setToolTipText(BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_debitoBodega.setLayout(this.gridaBagLayoutBodega);


		jComboBoxid_cuenta_contable_debitoBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_debitoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_debitoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_debitoBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_debitoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_debitoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_debitoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoBodega"));

		this.jButtonid_cuenta_contable_debitoBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_debitoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_debitoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_debitoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_debitoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_debitoBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_debitoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_debitoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_debitoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoBodegaUpdate"));


		jButtonid_cuenta_contable_debitoBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_debitoBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_debitoBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_debitoBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_debitoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoBodegaArbol"));



					
		this.jLabelid_cuenta_contable_creditoBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_creditoBodega.setText(""+BodegaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO+" : *");
		this.jLabelid_cuenta_contable_creditoBodega.setToolTipText("Cuenta C. Credito");
		this.jLabelid_cuenta_contable_creditoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_creditoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_creditoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_creditoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_creditoBodega.setToolTipText(BodegaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_creditoBodega.setLayout(this.gridaBagLayoutBodega);


		jComboBoxid_cuenta_contable_creditoBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_creditoBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_creditoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_creditoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_creditoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoBodega"));

		this.jButtonid_cuenta_contable_creditoBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_creditoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_creditoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_creditoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_creditoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_creditoBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_creditoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_creditoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_creditoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoBodegaUpdate"));


		jButtonid_cuenta_contable_creditoBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_creditoBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_creditoBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_creditoBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_creditoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoBodegaArbol"));



					
		this.jLabelid_cuenta_contable_bonificaBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_bonificaBodega.setText(""+BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEBONIFICA+" : *");
		this.jLabelid_cuenta_contable_bonificaBodega.setToolTipText("Cuenta C. Bonifica");
		this.jLabelid_cuenta_contable_bonificaBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_bonificaBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_bonificaBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_bonificaBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_bonificaBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_bonificaBodega.setToolTipText(BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEBONIFICA);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_bonificaBodega.setLayout(this.gridaBagLayoutBodega);


		jComboBoxid_cuenta_contable_bonificaBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_bonificaBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_bonificaBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_bonificaBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_bonificaBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_bonificaBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_bonificaBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_bonificaBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_bonificaBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_bonificaBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_bonificaBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_bonificaBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_bonificaBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_bonificaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_bonificaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_bonificaBodega"));

		this.jButtonid_cuenta_contable_bonificaBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_bonificaBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_bonificaBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_bonificaBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_bonificaBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_bonificaBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_bonificaBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_bonificaBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_bonificaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_bonificaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_bonificaBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_bonificaBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_bonificaBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_bonificaBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_bonificaBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_bonificaBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_bonificaBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_bonificaBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_bonificaBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_bonificaBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_bonificaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_bonificaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_bonificaBodegaUpdate"));


		jButtonid_cuenta_contable_bonificaBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_bonificaBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_bonificaBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_bonificaBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_bonificaBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_bonificaBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_bonificaBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_bonificaBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_bonificaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_bonificaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_bonificaBodegaArbol"));



					
		this.jLabelid_cuenta_contable_produccionBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_produccionBodega.setText(""+BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEPRODUCCION+" : *");
		this.jLabelid_cuenta_contable_produccionBodega.setToolTipText("Cuenta C. Produccion");
		this.jLabelid_cuenta_contable_produccionBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_produccionBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_produccionBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_produccionBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_produccionBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_produccionBodega.setToolTipText(BodegaConstantesFunciones.LABEL_IDCUENTACONTABLEPRODUCCION);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_produccionBodega.setLayout(this.gridaBagLayoutBodega);


		jComboBoxid_cuenta_contable_produccionBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_produccionBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_produccionBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_produccionBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_produccionBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_produccionBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_produccionBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_produccionBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_produccionBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_produccionBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_produccionBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_produccionBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_produccionBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_produccionBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_produccionBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_produccionBodega"));

		this.jButtonid_cuenta_contable_produccionBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_produccionBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_produccionBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_produccionBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_produccionBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_produccionBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_produccionBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_produccionBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_produccionBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_produccionBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_produccionBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_produccionBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_produccionBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_produccionBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_produccionBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_produccionBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_produccionBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_produccionBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_produccionBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_produccionBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_produccionBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_produccionBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_produccionBodegaUpdate"));


		jButtonid_cuenta_contable_produccionBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_produccionBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_produccionBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_produccionBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_produccionBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_produccionBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_produccionBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_produccionBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_produccionBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_produccionBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_produccionBodegaArbol"));



					
		this.jLabelid_cuenta_contable_costo_bonificaBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_costo_bonificaBodega.setText(""+BodegaConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOBONIFICA+" : *");
		this.jLabelid_cuenta_contable_costo_bonificaBodega.setToolTipText("Cuenta C. Costo Bonifica");
		this.jLabelid_cuenta_contable_costo_bonificaBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costo_bonificaBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costo_bonificaBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costo_bonificaBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_costo_bonificaBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_costo_bonificaBodega.setToolTipText(BodegaConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOBONIFICA);
		this.gridaBagLayoutBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_costo_bonificaBodega.setLayout(this.gridaBagLayoutBodega);


		jComboBoxid_cuenta_contable_costo_bonificaBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costo_bonificaBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_bonificaBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_bonificaBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costo_bonificaBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_costo_bonificaBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_bonificaBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_bonificaBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_bonificaBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_bonificaBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_costo_bonificaBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_costo_bonificaBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_bonificaBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_costo_bonificaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_bonificaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_bonificaBodega"));

		this.jButtonid_cuenta_contable_costo_bonificaBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_bonificaBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_bonificaBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_bonificaBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costo_bonificaBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_costo_bonificaBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_costo_bonificaBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_bonificaBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_costo_bonificaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_bonificaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_bonificaBodegaBusqueda"));

		if(this.bodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_costo_bonificaBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_costo_bonificaBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_bonificaBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_bonificaBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_bonificaBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costo_bonificaBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_costo_bonificaBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_costo_bonificaBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_bonificaBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_costo_bonificaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_bonificaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_bonificaBodegaUpdate"));


		jButtonid_cuenta_contable_costo_bonificaBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_costo_bonificaBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_bonificaBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_bonificaBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_bonificaBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_costo_bonificaBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_costo_bonificaBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_bonificaBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_costo_bonificaBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_bonificaBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_bonificaBodegaArbol"));



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
		//this.jInternalFrameDetalleBodega = new BodegaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Bodega DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBodega= new GridBagLayout();
		

		
		String sToolTipBodega="";
		sToolTipBodega=BodegaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBodega+="(Inventario.Bodega)";
		}
		
		if(!this.bodegaSessionBean.getEsGuardarRelacionado()) {
			sToolTipBodega+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoBodega = new JButtonMe();
		this.jButtonModificarBodega = new JButtonMe();
        this.jButtonActualizarBodega = new JButtonMe();
        this.jButtonEliminarBodega = new JButtonMe();
        this.jButtonCancelarBodega = new JButtonMe();
        this.jButtonGuardarCambiosBodega = new JButtonMe();
		this.jButtonGuardarCambiosTablaBodega = new JButtonMe();
		this.jButtonCerrarBodega = new JButtonMe();
		
		this.jScrollPanelDatosBodega = new JScrollPane();   
        this.jScrollPanelDatosEdicionBodega = new JScrollPane();
		this.jScrollPanelDatosGeneralBodega = new JScrollPane();
				
		
		
		this.jPanelCamposBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposBodega=new JTabbedPane();
		
		
		this.jTabbedPaneCamposBodega.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposBodega,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodatoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Bodega";
		
		if(!this.bodegaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodegas" + this.sPath));
		} else {
			this.jScrollPanelDatosBodega.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposBodega.setName("jPanelCamposBodega"); 

		this.jPanelCamposOcultosBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosBodega.setName("jPanelCamposOcultosBodega"); 

        this.jPanelAccionesBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBodega.setToolTipText("Acciones");
        this.jPanelAccionesBodega.setName("Acciones"); 

		this.jPanelAccionesFormularioBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioBodega.setToolTipText("Acciones");
        this.jPanelAccionesFormularioBodega.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionBodega, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBodega, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBodega, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposBodega, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosBodega, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioBodega, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralBodega.setName("jPanelCamposFingeneralBodega");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralBodega, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciodatoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Dato"));
		this.jPanelCamposIniciodatoBodega.setName("jPanelCamposFindatoBodega");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciodatoBodega, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contableBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contableBodega.setName("jPanelCamposFincuenta_contableBodega");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contableBodega, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoBodega.setText("Nuevo");
		this.jButtonModificarBodega.setText("Editar");
        this.jButtonActualizarBodega.setText("Actualizar");
        this.jButtonEliminarBodega.setText("Eliminar");
        this.jButtonCancelarBodega.setText("Cancelar");
        this.jButtonGuardarCambiosBodega.setText("Guardar");
		this.jButtonGuardarCambiosTablaBodega.setText("Guardar");
		this.jButtonCerrarBodega.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBodega,"nuevo_button","Nuevo",this.bodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarBodega,"modificar_button","Editar",this.bodegaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarBodega,"actualizar_button","Actualizar",this.bodegaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarBodega,"eliminar_button","Eliminar",this.bodegaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarBodega,"cancelar_button","Cancelar",this.bodegaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosBodega,"guardarcambios_button","Guardar",this.bodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBodega,"guardarcambiostabla_button","Guardar",this.bodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBodega,"cerrar_button","Salir",this.bodegaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarBodega, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarBodega, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarBodega, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoBodega.setToolTipText("Nuevo"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarBodega.setToolTipText("Editar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarBodega.setToolTipText("Actualizar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarBodega.setToolTipText("Eliminar)"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarBodega.setToolTipText("Cancelar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosBodega.setToolTipText("Guardar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaBodega.setToolTipText("Guardar"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBodega.setToolTipText("Salir"+" "+BodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBodega";
		inputMap = this.jButtonNuevoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBodega.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBodega"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarBodega";
		inputMap = this.jButtonActualizarBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarBodega"));
		
		//ELIMINAR
		sMapKey = "EliminarBodega";
		inputMap = this.jButtonEliminarBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarBodega"));
		
		//CANCELAR	
		sMapKey = "CancelarBodega";
		inputMap = this.jButtonCancelarBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarBodega"));
		
		//CERRAR		
		sMapKey = "CerrarBodega";
		inputMap = this.jButtonCerrarBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBodega"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBodega";
		inputMap = this.jButtonGuardarCambiosTablaBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBodega"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoBodega = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoBodega.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoBodega.setToolTipText("Nuevo Bodega");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoBodega, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarBodega = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarBodega.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarBodega.setToolTipText("Sin Cerrar Ventana Bodega");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarBodega, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeBodega = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeBodega.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeBodega.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeBodega, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesBodega = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBodega.setText("Accion");
		this.jComboBoxTiposAccionesBodega.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioBodega = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioBodega.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioBodega.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesBodega = new JLabelMe();
		
		this.jLabelAccionesBodega.setText("Acciones");		
		this.jLabelAccionesBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposBodega();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysBodega();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesBodega=new JTabbedPane();
		this.jTabbedPaneRelacionesBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesBodega,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesBodega.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBodega.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBodega.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioBodega.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBodega.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBodega.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioBodega, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposBodega = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosBodega = new GridBagLayout();
		
		this.jPanelCamposBodega.setLayout(gridaBagLayoutCamposBodega);
		this.jPanelCamposOcultosBodega.setLayout(gridaBagLayoutCamposOcultosBodega);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralBodega= new GridBagLayout();
		this.jPanelCamposIniciogeneralBodega.setLayout(gridaBagLayoutCamposIniciogeneralBodega);

		GridBagLayout gridaBagLayoutCamposIniciodatoBodega= new GridBagLayout();
		this.jPanelCamposIniciodatoBodega.setLayout(gridaBagLayoutCamposIniciodatoBodega);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableBodega= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableBodega.setLayout(gridaBagLayoutCamposIniciocuenta_contableBodega);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidBodega.add(jLabelIdBodega, this.gridBagConstraintsBodega);



	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidBodega.add(jLabelidBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaBodega.add(jLabelid_empresaBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 2;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBodega.add(jButtonid_empresaBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 3;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBodega.add(jButtonid_empresaBodegaUpdate, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaBodega.add(jComboBoxid_empresaBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_bodegaBodega.add(jLabelid_grupo_bodegaBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 2;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_bodegaBodega.add(jButtonid_grupo_bodegaBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 3;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_bodegaBodega.add(jButtonid_grupo_bodegaBodegaUpdate, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_bodegaBodega.add(jComboBoxid_grupo_bodegaBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_calidad_productoBodega.add(jLabelid_calidad_productoBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 2;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_calidad_productoBodega.add(jButtonid_calidad_productoBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 3;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_calidad_productoBodega.add(jButtonid_calidad_productoBodegaUpdate, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_calidad_productoBodega.add(jComboBoxid_calidad_productoBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoBodega.add(jLabelcodigoBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 2;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoBodega.add(jButtoncodigoBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoBodega.add(jscrollPanecodigoBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreBodega.add(jLabelnombreBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 2;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreBodega.add(jButtonnombreBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreBodega.add(jscrollPanenombreBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsiglasBodega.add(jLabelsiglasBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 2;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelsiglasBodega.add(jButtonsiglasBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsiglasBodega.add(jTextFieldsiglasBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionBodega.add(jLabeldireccionBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 2;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionBodega.add(jButtondireccionBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionBodega.add(jscrollPanedireccionBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoBodega.add(jLabeltelefonoBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 2;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoBodega.add(jButtontelefonoBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoBodega.add(jTextFieldtelefonoBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucBodega.add(jLabelrucBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 2;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucBodega.add(jButtonrucBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucBodega.add(jTextFieldrucBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelresponsable_nombreBodega.add(jLabelresponsable_nombreBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 2;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelresponsable_nombreBodega.add(jButtonresponsable_nombreBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelresponsable_nombreBodega.add(jscrollPaneresponsable_nombreBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionBodega.add(jLabeldescripcionBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 2;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionBodega.add(jButtondescripcionBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionBodega.add(jscrollPanedescripcionBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisBodega.add(jLabelid_paisBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 2;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisBodega.add(jButtonid_paisBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 3;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisBodega.add(jButtonid_paisBodegaUpdate, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisBodega.add(jComboBoxid_paisBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadBodega.add(jLabelid_ciudadBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 2;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadBodega.add(jButtonid_ciudadBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 3;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadBodega.add(jButtonid_ciudadBodegaUpdate, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadBodega.add(jComboBoxid_ciudadBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoBodega.add(jLabelid_centro_costoBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 2;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoBodega.add(jButtonid_centro_costoBodega, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 3;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoBodega.add(jButtonid_centro_costoBodegaArbol, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 4;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoBodega.add(jButtonid_centro_costoBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 5;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoBodega.add(jButtonid_centro_costoBodegaUpdate, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoBodega.add(jComboBoxid_centro_costoBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoBodega.add(jLabelid_empleadoBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 2;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoBodega.add(jButtonid_empleadoBodega, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 3;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoBodega.add(jButtonid_empleadoBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 4;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoBodega.add(jButtonid_empleadoBodegaUpdate, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoBodega.add(jComboBoxid_empleadoBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_multi_empresaBodega.add(jLabeles_multi_empresaBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 2;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_multi_empresaBodega.add(jButtones_multi_empresaBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_multi_empresaBodega.add(jCheckBoxes_multi_empresaBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_mostrar_stockBodega.add(jLabelcon_mostrar_stockBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 2;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_mostrar_stockBodega.add(jButtoncon_mostrar_stockBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_mostrar_stockBodega.add(jCheckBoxcon_mostrar_stockBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_bodega_transitoBodega.add(jLabeles_bodega_transitoBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 2;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_bodega_transitoBodega.add(jButtones_bodega_transitoBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_bodega_transitoBodega.add(jCheckBoxes_bodega_transitoBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_stock_negativoBodega.add(jLabelcon_stock_negativoBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 2;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_stock_negativoBodega.add(jButtoncon_stock_negativoBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_stock_negativoBodega.add(jCheckBoxcon_stock_negativoBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_inventarioBodega.add(jLabelid_cuenta_contable_inventarioBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 2;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_inventarioBodega.add(jButtonid_cuenta_contable_inventarioBodega, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 3;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_inventarioBodega.add(jButtonid_cuenta_contable_inventarioBodegaArbol, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 4;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inventarioBodega.add(jButtonid_cuenta_contable_inventarioBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 5;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inventarioBodega.add(jButtonid_cuenta_contable_inventarioBodegaUpdate, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_inventarioBodega.add(jComboBoxid_cuenta_contable_inventarioBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_costoBodega.add(jLabelid_cuenta_contable_costoBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 2;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costoBodega.add(jButtonid_cuenta_contable_costoBodega, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 3;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costoBodega.add(jButtonid_cuenta_contable_costoBodegaArbol, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 4;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costoBodega.add(jButtonid_cuenta_contable_costoBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 5;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costoBodega.add(jButtonid_cuenta_contable_costoBodegaUpdate, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_costoBodega.add(jComboBoxid_cuenta_contable_costoBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_ventaBodega.add(jLabelid_cuenta_contable_ventaBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 2;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ventaBodega.add(jButtonid_cuenta_contable_ventaBodega, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 3;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ventaBodega.add(jButtonid_cuenta_contable_ventaBodegaArbol, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 4;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ventaBodega.add(jButtonid_cuenta_contable_ventaBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 5;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ventaBodega.add(jButtonid_cuenta_contable_ventaBodegaUpdate, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_ventaBodega.add(jComboBoxid_cuenta_contable_ventaBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_descuentoBodega.add(jLabelid_cuenta_contable_descuentoBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 2;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_descuentoBodega.add(jButtonid_cuenta_contable_descuentoBodega, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 3;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_descuentoBodega.add(jButtonid_cuenta_contable_descuentoBodegaArbol, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 4;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_descuentoBodega.add(jButtonid_cuenta_contable_descuentoBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 5;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_descuentoBodega.add(jButtonid_cuenta_contable_descuentoBodegaUpdate, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_descuentoBodega.add(jComboBoxid_cuenta_contable_descuentoBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_devolucionBodega.add(jLabelid_cuenta_contable_devolucionBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 2;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_devolucionBodega.add(jButtonid_cuenta_contable_devolucionBodega, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 3;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_devolucionBodega.add(jButtonid_cuenta_contable_devolucionBodegaArbol, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 4;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_devolucionBodega.add(jButtonid_cuenta_contable_devolucionBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 5;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_devolucionBodega.add(jButtonid_cuenta_contable_devolucionBodegaUpdate, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_devolucionBodega.add(jComboBoxid_cuenta_contable_devolucionBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_debitoBodega.add(jLabelid_cuenta_contable_debitoBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 2;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_debitoBodega.add(jButtonid_cuenta_contable_debitoBodega, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 3;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_debitoBodega.add(jButtonid_cuenta_contable_debitoBodegaArbol, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 4;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoBodega.add(jButtonid_cuenta_contable_debitoBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 5;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoBodega.add(jButtonid_cuenta_contable_debitoBodegaUpdate, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_debitoBodega.add(jComboBoxid_cuenta_contable_debitoBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_creditoBodega.add(jLabelid_cuenta_contable_creditoBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 2;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoBodega.add(jButtonid_cuenta_contable_creditoBodega, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 3;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoBodega.add(jButtonid_cuenta_contable_creditoBodegaArbol, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 4;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoBodega.add(jButtonid_cuenta_contable_creditoBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 5;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoBodega.add(jButtonid_cuenta_contable_creditoBodegaUpdate, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_creditoBodega.add(jComboBoxid_cuenta_contable_creditoBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_bonificaBodega.add(jLabelid_cuenta_contable_bonificaBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 2;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_bonificaBodega.add(jButtonid_cuenta_contable_bonificaBodega, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 3;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_bonificaBodega.add(jButtonid_cuenta_contable_bonificaBodegaArbol, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 4;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_bonificaBodega.add(jButtonid_cuenta_contable_bonificaBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 5;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_bonificaBodega.add(jButtonid_cuenta_contable_bonificaBodegaUpdate, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_bonificaBodega.add(jComboBoxid_cuenta_contable_bonificaBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_produccionBodega.add(jLabelid_cuenta_contable_produccionBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 2;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_produccionBodega.add(jButtonid_cuenta_contable_produccionBodega, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 3;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_produccionBodega.add(jButtonid_cuenta_contable_produccionBodegaArbol, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 4;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_produccionBodega.add(jButtonid_cuenta_contable_produccionBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 5;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_produccionBodega.add(jButtonid_cuenta_contable_produccionBodegaUpdate, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_produccionBodega.add(jComboBoxid_cuenta_contable_produccionBodega, this.gridBagConstraintsBodega);


	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 0;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_costo_bonificaBodega.add(jLabelid_cuenta_contable_costo_bonificaBodega, this.gridBagConstraintsBodega);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 2;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costo_bonificaBodega.add(jButtonid_cuenta_contable_costo_bonificaBodega, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsBodega = new GridBagConstraints();
	//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 3;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costo_bonificaBodega.add(jButtonid_cuenta_contable_costo_bonificaBodegaArbol, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 4;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costo_bonificaBodega.add(jButtonid_cuenta_contable_costo_bonificaBodegaBusqueda, this.gridBagConstraintsBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBodega = new GridBagConstraints();
		//this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = 5;
		this.gridBagConstraintsBodega.ipadx = 0;
		this.gridBagConstraintsBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costo_bonificaBodega.add(jButtonid_cuenta_contable_costo_bonificaBodegaUpdate, this.gridBagConstraintsBodega);
	}

	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBodega.gridy = 0;
	this.gridBagConstraintsBodega.gridx = 1;
	this.gridBagConstraintsBodega.ipadx = 0;
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_costo_bonificaBodega.add(jComboBoxid_cuenta_contable_costo_bonificaBodega, this.gridBagConstraintsBodega);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposOcultosBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposOcultosBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBodega.add(this.jPanelid_empresaBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposOcultosBodega % 2==0) {
		iXPanelCamposOcultosBodega=0;
		iYPanelCamposOcultosBodega++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciogeneralBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciogeneralBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodega.add(this.jPanelidBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciogeneralBodega % 2==0) {
		iXPanelCamposIniciogeneralBodega=0;
		iYPanelCamposIniciogeneralBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciogeneralBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciogeneralBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodega.add(this.jPanelid_grupo_bodegaBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciogeneralBodega % 2==0) {
		iXPanelCamposIniciogeneralBodega=0;
		iYPanelCamposIniciogeneralBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciogeneralBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciogeneralBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodega.add(this.jPanelid_calidad_productoBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciogeneralBodega % 2==0) {
		iXPanelCamposIniciogeneralBodega=0;
		iYPanelCamposIniciogeneralBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciogeneralBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciogeneralBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodega.add(this.jPanelcodigoBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciogeneralBodega % 2==0) {
		iXPanelCamposIniciogeneralBodega=0;
		iYPanelCamposIniciogeneralBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciogeneralBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciogeneralBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodega.add(this.jPanelnombreBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciogeneralBodega % 2==0) {
		iXPanelCamposIniciogeneralBodega=0;
		iYPanelCamposIniciogeneralBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciogeneralBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciogeneralBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodega.add(this.jPanelsiglasBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciogeneralBodega % 2==0) {
		iXPanelCamposIniciogeneralBodega=0;
		iYPanelCamposIniciogeneralBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciogeneralBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciogeneralBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodega.add(this.jPaneldireccionBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciogeneralBodega % 2==0) {
		iXPanelCamposIniciogeneralBodega=0;
		iYPanelCamposIniciogeneralBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciogeneralBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciogeneralBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodega.add(this.jPaneltelefonoBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciogeneralBodega % 2==0) {
		iXPanelCamposIniciogeneralBodega=0;
		iYPanelCamposIniciogeneralBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciogeneralBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciogeneralBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodega.add(this.jPanelrucBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciogeneralBodega % 2==0) {
		iXPanelCamposIniciogeneralBodega=0;
		iYPanelCamposIniciogeneralBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciogeneralBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciogeneralBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodega.add(this.jPanelresponsable_nombreBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciogeneralBodega % 2==0) {
		iXPanelCamposIniciogeneralBodega=0;
		iYPanelCamposIniciogeneralBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciogeneralBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciogeneralBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralBodega.add(this.jPaneldescripcionBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciogeneralBodega % 2==0) {
		iXPanelCamposIniciogeneralBodega=0;
		iYPanelCamposIniciogeneralBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciodatoBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciodatoBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodega.add(this.jPanelid_paisBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciodatoBodega % 1==0) {
		iXPanelCamposIniciodatoBodega=0;
		iYPanelCamposIniciodatoBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciodatoBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciodatoBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodega.add(this.jPanelid_ciudadBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciodatoBodega % 1==0) {
		iXPanelCamposIniciodatoBodega=0;
		iYPanelCamposIniciodatoBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciodatoBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciodatoBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodega.add(this.jPanelid_centro_costoBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciodatoBodega % 1==0) {
		iXPanelCamposIniciodatoBodega=0;
		iYPanelCamposIniciodatoBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciodatoBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciodatoBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodega.add(this.jPanelid_empleadoBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciodatoBodega % 1==0) {
		iXPanelCamposIniciodatoBodega=0;
		iYPanelCamposIniciodatoBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciodatoBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciodatoBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodega.add(this.jPaneles_multi_empresaBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciodatoBodega % 1==0) {
		iXPanelCamposIniciodatoBodega=0;
		iYPanelCamposIniciodatoBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciodatoBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciodatoBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodega.add(this.jPanelcon_mostrar_stockBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciodatoBodega % 1==0) {
		iXPanelCamposIniciodatoBodega=0;
		iYPanelCamposIniciodatoBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciodatoBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciodatoBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodega.add(this.jPaneles_bodega_transitoBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciodatoBodega % 1==0) {
		iXPanelCamposIniciodatoBodega=0;
		iYPanelCamposIniciodatoBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciodatoBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciodatoBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodatoBodega.add(this.jPanelcon_stock_negativoBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciodatoBodega % 1==0) {
		iXPanelCamposIniciodatoBodega=0;
		iYPanelCamposIniciodatoBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciocuenta_contableBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciocuenta_contableBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodega.add(this.jPanelid_cuenta_contable_inventarioBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciocuenta_contableBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableBodega=0;
		iYPanelCamposIniciocuenta_contableBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciocuenta_contableBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciocuenta_contableBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodega.add(this.jPanelid_cuenta_contable_costoBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciocuenta_contableBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableBodega=0;
		iYPanelCamposIniciocuenta_contableBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciocuenta_contableBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciocuenta_contableBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodega.add(this.jPanelid_cuenta_contable_ventaBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciocuenta_contableBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableBodega=0;
		iYPanelCamposIniciocuenta_contableBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciocuenta_contableBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciocuenta_contableBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodega.add(this.jPanelid_cuenta_contable_descuentoBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciocuenta_contableBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableBodega=0;
		iYPanelCamposIniciocuenta_contableBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciocuenta_contableBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciocuenta_contableBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodega.add(this.jPanelid_cuenta_contable_devolucionBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciocuenta_contableBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableBodega=0;
		iYPanelCamposIniciocuenta_contableBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciocuenta_contableBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciocuenta_contableBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodega.add(this.jPanelid_cuenta_contable_debitoBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciocuenta_contableBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableBodega=0;
		iYPanelCamposIniciocuenta_contableBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciocuenta_contableBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciocuenta_contableBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodega.add(this.jPanelid_cuenta_contable_creditoBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciocuenta_contableBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableBodega=0;
		iYPanelCamposIniciocuenta_contableBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciocuenta_contableBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciocuenta_contableBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodega.add(this.jPanelid_cuenta_contable_bonificaBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciocuenta_contableBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableBodega=0;
		iYPanelCamposIniciocuenta_contableBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciocuenta_contableBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciocuenta_contableBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodega.add(this.jPanelid_cuenta_contable_produccionBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciocuenta_contableBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableBodega=0;
		iYPanelCamposIniciocuenta_contableBodega++;
	}
	this.gridBagConstraintsBodega = new GridBagConstraints();
	this.gridBagConstraintsBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBodega.gridy = iYPanelCamposIniciocuenta_contableBodega;
	this.gridBagConstraintsBodega.gridx = iXPanelCamposIniciocuenta_contableBodega++;
	this.gridBagConstraintsBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableBodega.add(this.jPanelid_cuenta_contable_costo_bonificaBodega, this.gridBagConstraintsBodega);



	if(iXPanelCamposIniciocuenta_contableBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableBodega=0;
		iYPanelCamposIniciocuenta_contableBodega++;
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
			
		GridBagLayout gridaBagLayoutAccionesBodega= new GridBagLayout();
		this.jPanelAccionesBodega.setLayout(gridaBagLayoutAccionesBodega);
		
		GridBagLayout gridaBagLayoutAccionesFormularioBodega= new GridBagLayout();
		this.jPanelAccionesFormularioBodega.setLayout(gridaBagLayoutAccionesFormularioBodega);
		
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBodega.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBodega.add(this.jComboBoxTiposAccionesFormularioBodega, this.gridBagConstraintsBodega);

		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBodega.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBodega.add(this.jCheckBoxPostAccionNuevoBodega, this.gridBagConstraintsBodega);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.bodegaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBodega.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBodega.add(this.jCheckBoxPostAccionSinCerrarBodega, this.gridBagConstraintsBodega);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.bodegaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.bodegaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBodega.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBodega.add(this.jCheckBoxPostAccionSinMensajeBodega, this.gridBagConstraintsBodega);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx = iPosXAccion++;
			
		this.jPanelAccionesBodega.add(this.jButtonModificarBodega, this.gridBagConstraintsBodega);							

		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodega.gridy = 0;
		this.gridBagConstraintsBodega.gridx =iPosXAccion++;
			
		this.jPanelAccionesBodega.add(this.jButtonEliminarBodega, this.gridBagConstraintsBodega);
		
			
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy = 0;		
		this.gridBagConstraintsBodega.gridx = iPosXAccion++;
		
		this.jPanelAccionesBodega.add(this.jButtonActualizarBodega, this.gridBagConstraintsBodega);


		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy = 0;		
		this.gridBagConstraintsBodega.gridx = iPosXAccion++;
		
		this.jPanelAccionesBodega.add(this.jButtonGuardarCambiosBodega, this.gridBagConstraintsBodega);	
		
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy = 0;		
		this.gridBagConstraintsBodega.gridx =iPosXAccion++;
		
		this.jPanelAccionesBodega.add(this.jButtonCancelarBodega, this.gridBagConstraintsBodega);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBodega = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBodega);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bodegaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBodega = new GridBagConstraints();						
			this.gridBagConstraintsBodega.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBodega.gridx = 0;		
			//this.gridBagConstraintsBodega.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBodega.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBodega.gridx =0;
		this.gridBagConstraintsBodega.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBodega.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBodega, this.gridBagConstraintsBodega);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(BodegaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleBodega = new BodegaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Bodega DATOS");
			
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
			
	        //this.setTitle("[FOR] - Bodega DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Bodega Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			BodegaModel bodegaModel=new BodegaModel(this);
			
			//SI USARA CLASE INTERNA
			//BodegaModel.BodegaFocusTraversalPolicy bodegaFocusTraversalPolicy = bodegaModel.new BodegaFocusTraversalPolicy(this);
			
			//bodegaFocusTraversalPolicy.setbodegaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(bodegaModel);
			
			
			this.jContentPaneDetalleBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleBodega = new GridBagLayout();	
			this.jContentPaneDetalleBodega.setLayout(gridaBagLayoutDetalleBodega);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBodega = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsBodega = new GridBagConstraints();
				this.gridBagConstraintsBodega.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsBodega.gridx = 0;
					
				
				this.jContentPaneDetalleBodega.add(jTtoolBarDetalleBodega, gridBagConstraintsBodega);								
				
}
			
			this.jScrollPanelDatosEdicionBodega=   new JScrollPane(jContentPaneDetalleBodega,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBodega.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBodega.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBodega.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralBodega=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBodega.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBodega.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBodega.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposBodega.add("General",this.jPanelCamposIniciogeneralBodega);
		this.jTabbedPaneCamposBodega.add("Dato",this.jPanelCamposIniciodatoBodega);
		this.jTabbedPaneCamposBodega.add("Cuenta Contable",this.jPanelCamposIniciocuenta_contableBodega);
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
						
			this.gridBagConstraintsBodega.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsBodega.gridx = 0;
	        
			this.jContentPaneDetalleBodega.add(jTabbedPaneCamposBodega, gridBagConstraintsBodega);
			
			
			//if(!this.conCargarMinimo) {
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& bodegaSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.bodegaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsBodega= new GridBagConstraints();
						this.gridBagConstraintsBodega.gridy = iGridyRelaciones++;
						this.gridBagConstraintsBodega.gridx = 0;
						this.jContentPaneDetalleBodega.add(this.jTabbedPaneRelacionesBodega, this.gridBagConstraintsBodega);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesBodega.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosBodega.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsBodega = new GridBagConstraints();
					this.gridBagConstraintsBodega.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsBodega.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsBodega.gridx = 0;
					
				
					this.jContentPaneDetalleBodega.add(jPanelCamposOcultosBodega, gridBagConstraintsBodega);
				
					this.jPanelCamposOcultosBodega.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsBodega.gridx = 0;
	        this.gridBagConstraintsBodega.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleBodega.add(this.jPanelAccionesFormularioBodega, this.gridBagConstraintsBodega);							
			
			
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
	        this.gridBagConstraintsBodega.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsBodega.gridx = 0;
	        
			
			this.jContentPaneDetalleBodega.add(this.jPanelAccionesBodega, this.gridBagConstraintsBodega);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionBodega);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionBodega=   new JScrollPane(this.jPanelCamposBodega,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBodega.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBodega.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBodega.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsBodega.gridx = 0;
			this.gridBagConstraintsBodega.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsBodega.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsBodega.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionBodega, this.gridBagConstraintsBodega);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBodega.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioBodega, this.gridBagConstraintsBodega);			
			
			this.gridBagConstraintsBodega = new GridBagConstraints();
			this.gridBagConstraintsBodega.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBodega.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesBodega, this.gridBagConstraintsBodega);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodega.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBodega, this.gridBagConstraintsBodega);
			
			
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodega.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBodega, this.gridBagConstraintsBodega);
		
			
		this.gridBagConstraintsBodega = new GridBagConstraints();
		this.gridBagConstraintsBodega.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBodega.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBodega, this.gridBagConstraintsBodega);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralBodega;//jContentPane;
		
		return jScrollPanelDatosEdicionBodega;
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
