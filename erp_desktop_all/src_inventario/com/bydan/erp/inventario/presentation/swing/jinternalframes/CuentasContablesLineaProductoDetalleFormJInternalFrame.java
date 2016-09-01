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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.CuentasContablesLineaProductoConstantesFunciones;

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
public class CuentasContablesLineaProductoDetalleFormJInternalFrame extends CuentasContablesLineaProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCuentasContablesLineaProducto;
	
	protected JMenuBar jmenuBarDetalleCuentasContablesLineaProducto;
	
	protected JMenu jmenuDetalleCuentasContablesLineaProducto;
	protected JMenu jmenuDetalleArchivoCuentasContablesLineaProducto;
	protected JMenu jmenuDetalleAccionesCuentasContablesLineaProducto;
	protected JMenu jmenuDetalleDatosCuentasContablesLineaProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentasContablesLineaProducto;	
	protected GridBagConstraints gridBagConstraintsCuentasContablesLineaProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CuentasContablesLineaProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleCuentasContablesLineaProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableinventario="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecostoventa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableventa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledescuentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledescuento="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableproduccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableproduccion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledevolucionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledevolucion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableivadebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableivadebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableivacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableivacredito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablebonificaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablebonifica="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostobonificaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecostobonifica="";
	
	public CuentasContablesLineaProductoSessionBean cuentascontableslineaproductoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public CuentaContableSessionBean cuentacontableinventarioSessionBean;
	public CuentaContableSessionBean cuentacontablecostoventaSessionBean;
	public CuentaContableSessionBean cuentacontableventaSessionBean;
	public CuentaContableSessionBean cuentacontabledescuentoSessionBean;
	public CuentaContableSessionBean cuentacontableproduccionSessionBean;
	public CuentaContableSessionBean cuentacontabledevolucionSessionBean;
	public CuentaContableSessionBean cuentacontableivadebitoSessionBean;
	public CuentaContableSessionBean cuentacontableivacreditoSessionBean;
	public CuentaContableSessionBean cuentacontablebonificaSessionBean;
	public CuentaContableSessionBean cuentacontablecostobonificaSessionBean;	
	
	public CuentasContablesLineaProductoLogic cuentascontableslineaproductoLogic;
	
	public JScrollPane jScrollPanelDatosCuentasContablesLineaProducto;
	public JScrollPane jScrollPanelDatosEdicionCuentasContablesLineaProducto;
	public JScrollPane jScrollPanelDatosGeneralCuentasContablesLineaProducto;
	
	protected JPanel jPanelCamposCuentasContablesLineaProducto;    
	protected JPanel jPanelCamposOcultosCuentasContablesLineaProducto;    	
	protected JPanel jPanelAccionesCuentasContablesLineaProducto;
	protected JPanel jPanelAccionesFormularioCuentasContablesLineaProducto;
    
	
	
	protected Integer iXPanelCamposCuentasContablesLineaProducto=0;
	protected Integer iYPanelCamposCuentasContablesLineaProducto=0;
	
	protected Integer iXPanelCamposOcultosCuentasContablesLineaProducto=0;
	protected Integer iYPanelCamposOcultosCuentasContablesLineaProducto=0;
	
	

	protected JPanel jPanelCamposIniciogeneralCuentasContablesLineaProducto;
	protected Integer iXPanelCamposIniciogeneralCuentasContablesLineaProducto=0;
	protected Integer iYPanelCamposIniciogeneralCuentasContablesLineaProducto=0;

	protected JPanel jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto;
	protected Integer iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto=0;
	protected Integer iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCuentasContablesLineaProducto;
	public JButton jButtonModificarCuentasContablesLineaProducto;
	public JButton jButtonActualizarCuentasContablesLineaProducto;
    public JButton jButtonEliminarCuentasContablesLineaProducto;
	public JButton jButtonCancelarCuentasContablesLineaProducto;
    public JButton jButtonGuardarCambiosCuentasContablesLineaProducto;
	public JButton jButtonGuardarCambiosTablaCuentasContablesLineaProducto;
	protected JButton jButtonCerrarCuentasContablesLineaProducto;
	
	
	protected JButton jButtonProcesarInformacionCuentasContablesLineaProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCuentasContablesLineaProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCuentasContablesLineaProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCuentasContablesLineaProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentasContablesLineaProducto;
	protected JButton jButtonModificarToolBarCuentasContablesLineaProducto;
	protected JButton jButtonActualizarToolBarCuentasContablesLineaProducto;
    protected JButton jButtonEliminarToolBarCuentasContablesLineaProducto;
	protected JButton jButtonCancelarToolBarCuentasContablesLineaProducto;
    protected JButton jButtonGuardarCambiosToolBarCuentasContablesLineaProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarCuentasContablesLineaProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentasContablesLineaProducto;
	protected JButton jButtonCerrarToolBarCuentasContablesLineaProducto;
	
	protected JButton jButtonProcesarInformacionToolBarCuentasContablesLineaProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemModificarCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemActualizarCuentasContablesLineaProducto;
    protected JMenuItem jMenuItemEliminarCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemCancelarCuentasContablesLineaProducto;
    protected JMenuItem jMenuItemGuardarCambiosCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemCerrarCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemDetalleCerrarCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentasContablesLineaProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentasContablesLineaProducto;
	protected JMenuItem jMenuItemMostrarOcultarCuentasContablesLineaProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentasContablesLineaProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentasContablesLineaProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCuentasContablesLineaProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCuentasContablesLineaProducto;
	public JLabel jLabelIdCuentasContablesLineaProducto;
	public JLabel jLabelidCuentasContablesLineaProducto;
	public JButton jButtonidCuentasContablesLineaProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCuentasContablesLineaProducto;
	public JLabel jLabelid_empresaCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCuentasContablesLineaProducto;
	public JButton jButtonid_empresaCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_empresaCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaCuentasContablesLineaProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaCuentasContablesLineaProducto;
	public JLabel jLabelid_bodegaCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaCuentasContablesLineaProducto;
	public JButton jButtonid_bodegaCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_bodegaCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaCuentasContablesLineaProductoBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoCuentasContablesLineaProducto;
	public JLabel jLabelid_centro_costoCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoCuentasContablesLineaProducto;
	public JButton jButtonid_centro_costoCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_centro_costoCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoCuentasContablesLineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoCuentasContablesLineaProductoArbol= new JButtonMe();

	public JPanel jPanelid_lineaCuentasContablesLineaProducto;
	public JLabel jLabelid_lineaCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaCuentasContablesLineaProducto;
	public JButton jButtonid_lineaCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_lineaCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_lineaCuentasContablesLineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_lineaCuentasContablesLineaProductoArbol= new JButtonMe();

	public JPanel jPanelid_linea_grupoCuentasContablesLineaProducto;
	public JLabel jLabelid_linea_grupoCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoCuentasContablesLineaProducto;
	public JButton jButtonid_linea_grupoCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_linea_grupoCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoCuentasContablesLineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_linea_grupoCuentasContablesLineaProductoArbol= new JButtonMe();

	public JPanel jPanelid_linea_categoriaCuentasContablesLineaProducto;
	public JLabel jLabelid_linea_categoriaCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaCuentasContablesLineaProducto;
	public JButton jButtonid_linea_categoriaCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_linea_categoriaCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaCuentasContablesLineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_linea_categoriaCuentasContablesLineaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_inventarioCuentasContablesLineaProducto;
	public JLabel jLabelid_cuenta_contable_inventarioCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto;
	public JButton jButtonid_cuenta_contable_inventarioCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto;
	public JLabel jLabelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto;
	public JButton jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_ventaCuentasContablesLineaProducto;
	public JLabel jLabelid_cuenta_contable_ventaCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto;
	public JButton jButtonid_cuenta_contable_ventaCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_descuentoCuentasContablesLineaProducto;
	public JLabel jLabelid_cuenta_contable_descuentoCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto;
	public JButton jButtonid_cuenta_contable_descuentoCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_produccionCuentasContablesLineaProducto;
	public JLabel jLabelid_cuenta_contable_produccionCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto;
	public JButton jButtonid_cuenta_contable_produccionCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_devolucionCuentasContablesLineaProducto;
	public JLabel jLabelid_cuenta_contable_devolucionCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto;
	public JButton jButtonid_cuenta_contable_devolucionCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto;
	public JLabel jLabelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto;
	public JButton jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto;
	public JLabel jLabelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto;
	public JButton jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_bonificaCuentasContablesLineaProducto;
	public JLabel jLabelid_cuenta_contable_bonificaCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto;
	public JButton jButtonid_cuenta_contable_bonificaCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto;
	public JLabel jLabelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto;
	public JButton jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCuentasContablesLineaProducto;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CuentasContablesLineaProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCuentasContablesLineaProducto=new JPanel();
				this.jPanelAccionesFormularioCuentasContablesLineaProducto=new JPanel();
				this.jmenuBarDetalleCuentasContablesLineaProducto=new JMenuBar();
				this.jTtoolBarDetalleCuentasContablesLineaProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentasContablesLineaProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CuentasContablesLineaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CuentasContablesLineaProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CuentasContablesLineaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentasContablesLineaProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentasContablesLineaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentasContablesLineaProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentasContablesLineaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentasContablesLineaProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentasContablesLineaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCuentasContablesLineaProducto() {
		return this.jButtonActualizarToolBarCuentasContablesLineaProducto;
	}
	
	public JButton getjButtonEliminarToolBarCuentasContablesLineaProducto() {
		return this.jButtonEliminarToolBarCuentasContablesLineaProducto;
	}
	
	public JButton getjButtonCancelarToolBarCuentasContablesLineaProducto() {
		return this.jButtonCancelarToolBarCuentasContablesLineaProducto;
	}		
	
	public JButton getjButtonProcesarInformacionCuentasContablesLineaProducto() {
		return this.jButtonProcesarInformacionCuentasContablesLineaProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentasContablesLineaProducto)	{
		this.jButtonProcesarInformacionCuentasContablesLineaProducto = jButtonProcesarInformacionCuentasContablesLineaProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentasContablesLineaProducto() {
		return this.jComboBoxTiposAccionesCuentasContablesLineaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentasContablesLineaProducto(
			JComboBox jComboBoxTiposRelacionesCuentasContablesLineaProducto) {
		this.jComboBoxTiposRelacionesCuentasContablesLineaProducto = jComboBoxTiposRelacionesCuentasContablesLineaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentasContablesLineaProducto(
			JComboBox jComboBoxTiposAccionesCuentasContablesLineaProducto) {
		this.jComboBoxTiposAccionesCuentasContablesLineaProducto = jComboBoxTiposAccionesCuentasContablesLineaProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCuentasContablesLineaProducto() {
		return this.jComboBoxTiposAccionesFormularioCuentasContablesLineaProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCuentasContablesLineaProducto(
			JComboBox jComboBoxTiposAccionesFormularioCuentasContablesLineaProducto) {
		this.jComboBoxTiposAccionesFormularioCuentasContablesLineaProducto = jComboBoxTiposAccionesFormularioCuentasContablesLineaProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cuentascontableslineaproductoSessionBean=new CuentasContablesLineaProductoSessionBean();
		
		this.cuentascontableslineaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentascontableslineaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentasContablesLineaProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentasContablesLineaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentasContablesLineaProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuentas Contables Linea Producto MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		CuentasContablesLineaProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCuentasContablesLineaProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCuentasContablesLineaProducto=new JButtonMe();
				this.jButtonModificarToolBarCuentasContablesLineaProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCuentasContablesLineaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCuentasContablesLineaProducto,this.jTtoolBarDetalleCuentasContablesLineaProducto,
							"actualizar","actualizar","Actualizar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCuentasContablesLineaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCuentasContablesLineaProducto,this.jTtoolBarDetalleCuentasContablesLineaProducto,
							"eliminar","eliminar","Eliminar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCuentasContablesLineaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCuentasContablesLineaProducto,this.jTtoolBarDetalleCuentasContablesLineaProducto,
							"cancelar","cancelar","Cancelar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCuentasContablesLineaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCuentasContablesLineaProducto,this.jTtoolBarDetalleCuentasContablesLineaProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCuentasContablesLineaProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCuentasContablesLineaProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCuentasContablesLineaProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCuentasContablesLineaProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCuentasContablesLineaProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentasContablesLineaProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentasContablesLineaProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentasContablesLineaProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCuentasContablesLineaProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCuentasContablesLineaProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCuentasContablesLineaProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCuentasContablesLineaProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCuentasContablesLineaProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCuentasContablesLineaProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCuentasContablesLineaProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCuentasContablesLineaProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCuentasContablesLineaProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCuentasContablesLineaProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCuentasContablesLineaProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCuentasContablesLineaProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCuentasContablesLineaProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentasContablesLineaProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentasContablesLineaProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentasContablesLineaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentasContablesLineaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentasContablesLineaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCuentasContablesLineaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCuentasContablesLineaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCuentasContablesLineaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentasContablesLineaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentasContablesLineaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentasContablesLineaProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentasContablesLineaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentasContablesLineaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentasContablesLineaProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCuentasContablesLineaProducto.add(this.jMenuItemDetalleCerrarCuentasContablesLineaProducto);
		
		this.jmenuDetalleAccionesCuentasContablesLineaProducto.add(this.jMenuItemActualizarCuentasContablesLineaProducto);
		this.jmenuDetalleAccionesCuentasContablesLineaProducto.add(this.jMenuItemEliminarCuentasContablesLineaProducto);
		this.jmenuDetalleAccionesCuentasContablesLineaProducto.add(this.jMenuItemCancelarCuentasContablesLineaProducto);		
		
		//this.jmenuDetalleDatosCuentasContablesLineaProducto.add(this.jMenuItemDetalleAbrirOrderByCuentasContablesLineaProducto);				
		this.jmenuDetalleDatosCuentasContablesLineaProducto.add(this.jMenuItemDetalleMostarOcultarCuentasContablesLineaProducto);				
				
		//this.jmenuDetalleAccionesCuentasContablesLineaProducto.add(this.jMenuItemGuardarCambiosCuentasContablesLineaProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCuentasContablesLineaProducto.add(this.jmenuDetalleArchivoCuentasContablesLineaProducto);		
		this.jmenuBarDetalleCuentasContablesLineaProducto.add(this.jmenuDetalleAccionesCuentasContablesLineaProducto);		
		this.jmenuBarDetalleCuentasContablesLineaProducto.add(this.jmenuDetalleDatosCuentasContablesLineaProducto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCuentasContablesLineaProducto);				
	}
	
	
	public void inicializarElementosCamposCuentasContablesLineaProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCuentasContablesLineaProducto = new JLabelMe();
		jLabelIdCuentasContablesLineaProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCuentasContablesLineaProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCuentasContablesLineaProducto.setToolTipText(CuentasContablesLineaProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCuentasContablesLineaProducto= new GridBagLayout();

		this.jPanelidCuentasContablesLineaProducto.setLayout(this.gridaBagLayoutCuentasContablesLineaProducto);

		jLabelidCuentasContablesLineaProducto = new JLabel();
		jLabelidCuentasContablesLineaProducto.setText("Id");

		jLabelidCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysCuentasContablesLineaProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCuentasContablesLineaProducto = new JLabelMe();
		this.jLabelid_empresaCuentasContablesLineaProducto.setText(""+CuentasContablesLineaProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCuentasContablesLineaProducto.setToolTipText("Empresa");
		this.jLabelid_empresaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCuentasContablesLineaProducto.setToolTipText(CuentasContablesLineaProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		this.jPanelid_empresaCuentasContablesLineaProducto.setLayout(this.gridaBagLayoutCuentasContablesLineaProducto);


		jComboBoxid_empresaCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_empresaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCuentasContablesLineaProducto.setEnabled(false);

		this.jButtonid_empresaCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonid_empresaCuentasContablesLineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentasContablesLineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentasContablesLineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonid_empresaCuentasContablesLineaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCuentasContablesLineaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentasContablesLineaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentasContablesLineaProducto"));

		this.jButtonid_empresaCuentasContablesLineaProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaCuentasContablesLineaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentasContablesLineaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentasContablesLineaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCuentasContablesLineaProductoBusqueda.setText("U");
		this.jButtonid_empresaCuentasContablesLineaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCuentasContablesLineaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentasContablesLineaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentasContablesLineaProductoBusqueda"));

		if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCuentasContablesLineaProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaCuentasContablesLineaProductoUpdate= new JButtonMe();
		this.jButtonid_empresaCuentasContablesLineaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentasContablesLineaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentasContablesLineaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCuentasContablesLineaProductoUpdate.setText("U");
		this.jButtonid_empresaCuentasContablesLineaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCuentasContablesLineaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentasContablesLineaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentasContablesLineaProductoUpdate"));



					
		this.jLabelid_bodegaCuentasContablesLineaProducto = new JLabelMe();
		this.jLabelid_bodegaCuentasContablesLineaProducto.setText(""+CuentasContablesLineaProductoConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaCuentasContablesLineaProducto.setToolTipText("Bodega");
		this.jLabelid_bodegaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaCuentasContablesLineaProducto.setToolTipText(CuentasContablesLineaProductoConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		this.jPanelid_bodegaCuentasContablesLineaProducto.setLayout(this.gridaBagLayoutCuentasContablesLineaProducto);


		jComboBoxid_bodegaCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_bodegaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonid_bodegaCuentasContablesLineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaCuentasContablesLineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaCuentasContablesLineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonid_bodegaCuentasContablesLineaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaCuentasContablesLineaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaCuentasContablesLineaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaCuentasContablesLineaProducto"));

		this.jButtonid_bodegaCuentasContablesLineaProductoBusqueda= new JButtonMe();
		this.jButtonid_bodegaCuentasContablesLineaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaCuentasContablesLineaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaCuentasContablesLineaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaCuentasContablesLineaProductoBusqueda.setText("U");
		this.jButtonid_bodegaCuentasContablesLineaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaCuentasContablesLineaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaCuentasContablesLineaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaCuentasContablesLineaProductoBusqueda"));

		if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaCuentasContablesLineaProductoBusqueda.setVisible(false);		}

		this.jButtonid_bodegaCuentasContablesLineaProductoUpdate= new JButtonMe();
		this.jButtonid_bodegaCuentasContablesLineaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaCuentasContablesLineaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaCuentasContablesLineaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaCuentasContablesLineaProductoUpdate.setText("U");
		this.jButtonid_bodegaCuentasContablesLineaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaCuentasContablesLineaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaCuentasContablesLineaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaCuentasContablesLineaProductoUpdate"));



					
		this.jLabelid_centro_costoCuentasContablesLineaProducto = new JLabelMe();
		this.jLabelid_centro_costoCuentasContablesLineaProducto.setText(""+CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoCuentasContablesLineaProducto.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoCuentasContablesLineaProducto.setToolTipText(CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		this.jPanelid_centro_costoCuentasContablesLineaProducto.setLayout(this.gridaBagLayoutCuentasContablesLineaProducto);


		jComboBoxid_centro_costoCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_centro_costoCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonid_centro_costoCuentasContablesLineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCuentasContablesLineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCuentasContablesLineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonid_centro_costoCuentasContablesLineaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoCuentasContablesLineaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCuentasContablesLineaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCuentasContablesLineaProducto"));

		this.jButtonid_centro_costoCuentasContablesLineaProductoBusqueda= new JButtonMe();
		this.jButtonid_centro_costoCuentasContablesLineaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCuentasContablesLineaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCuentasContablesLineaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoCuentasContablesLineaProductoBusqueda.setText("U");
		this.jButtonid_centro_costoCuentasContablesLineaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoCuentasContablesLineaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCuentasContablesLineaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCuentasContablesLineaProductoBusqueda"));

		if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoCuentasContablesLineaProductoBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoCuentasContablesLineaProductoUpdate= new JButtonMe();
		this.jButtonid_centro_costoCuentasContablesLineaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCuentasContablesLineaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCuentasContablesLineaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoCuentasContablesLineaProductoUpdate.setText("U");
		this.jButtonid_centro_costoCuentasContablesLineaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoCuentasContablesLineaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCuentasContablesLineaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCuentasContablesLineaProductoUpdate"));


		jButtonid_centro_costoCuentasContablesLineaProductoArbol= new JButtonMe();
		jButtonid_centro_costoCuentasContablesLineaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCuentasContablesLineaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCuentasContablesLineaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCuentasContablesLineaProductoArbol.setText("Arbol");
		jButtonid_centro_costoCuentasContablesLineaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoCuentasContablesLineaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCuentasContablesLineaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCuentasContablesLineaProductoArbol"));



					
		this.jLabelid_lineaCuentasContablesLineaProducto = new JLabelMe();
		this.jLabelid_lineaCuentasContablesLineaProducto.setText(""+CuentasContablesLineaProductoConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaCuentasContablesLineaProducto.setToolTipText("Linea");
		this.jLabelid_lineaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaCuentasContablesLineaProducto.setToolTipText(CuentasContablesLineaProductoConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		this.jPanelid_lineaCuentasContablesLineaProducto.setLayout(this.gridaBagLayoutCuentasContablesLineaProducto);


		jComboBoxid_lineaCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_lineaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonid_lineaCuentasContablesLineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaCuentasContablesLineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaCuentasContablesLineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonid_lineaCuentasContablesLineaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaCuentasContablesLineaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaCuentasContablesLineaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaCuentasContablesLineaProducto"));

		this.jButtonid_lineaCuentasContablesLineaProductoBusqueda= new JButtonMe();
		this.jButtonid_lineaCuentasContablesLineaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaCuentasContablesLineaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaCuentasContablesLineaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaCuentasContablesLineaProductoBusqueda.setText("U");
		this.jButtonid_lineaCuentasContablesLineaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaCuentasContablesLineaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaCuentasContablesLineaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaCuentasContablesLineaProductoBusqueda"));

		if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaCuentasContablesLineaProductoBusqueda.setVisible(false);		}

		this.jButtonid_lineaCuentasContablesLineaProductoUpdate= new JButtonMe();
		this.jButtonid_lineaCuentasContablesLineaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaCuentasContablesLineaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaCuentasContablesLineaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaCuentasContablesLineaProductoUpdate.setText("U");
		this.jButtonid_lineaCuentasContablesLineaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaCuentasContablesLineaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaCuentasContablesLineaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaCuentasContablesLineaProductoUpdate"));


		jButtonid_lineaCuentasContablesLineaProductoArbol= new JButtonMe();
		jButtonid_lineaCuentasContablesLineaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaCuentasContablesLineaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaCuentasContablesLineaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_lineaCuentasContablesLineaProductoArbol.setText("Arbol");
		jButtonid_lineaCuentasContablesLineaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_lineaCuentasContablesLineaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaCuentasContablesLineaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_lineaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaCuentasContablesLineaProductoArbol"));



					
		this.jLabelid_linea_grupoCuentasContablesLineaProducto = new JLabelMe();
		this.jLabelid_linea_grupoCuentasContablesLineaProducto.setText(""+CuentasContablesLineaProductoConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoCuentasContablesLineaProducto.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoCuentasContablesLineaProducto.setToolTipText(CuentasContablesLineaProductoConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		this.jPanelid_linea_grupoCuentasContablesLineaProducto.setLayout(this.gridaBagLayoutCuentasContablesLineaProducto);


		jComboBoxid_linea_grupoCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_linea_grupoCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonid_linea_grupoCuentasContablesLineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoCuentasContablesLineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoCuentasContablesLineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonid_linea_grupoCuentasContablesLineaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoCuentasContablesLineaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoCuentasContablesLineaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoCuentasContablesLineaProducto"));

		this.jButtonid_linea_grupoCuentasContablesLineaProductoBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoCuentasContablesLineaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoCuentasContablesLineaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoCuentasContablesLineaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoCuentasContablesLineaProductoBusqueda.setText("U");
		this.jButtonid_linea_grupoCuentasContablesLineaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoCuentasContablesLineaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoCuentasContablesLineaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoCuentasContablesLineaProductoBusqueda"));

		if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoCuentasContablesLineaProductoBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoCuentasContablesLineaProductoUpdate= new JButtonMe();
		this.jButtonid_linea_grupoCuentasContablesLineaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoCuentasContablesLineaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoCuentasContablesLineaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoCuentasContablesLineaProductoUpdate.setText("U");
		this.jButtonid_linea_grupoCuentasContablesLineaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoCuentasContablesLineaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoCuentasContablesLineaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoCuentasContablesLineaProductoUpdate"));


		jButtonid_linea_grupoCuentasContablesLineaProductoArbol= new JButtonMe();
		jButtonid_linea_grupoCuentasContablesLineaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoCuentasContablesLineaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoCuentasContablesLineaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_grupoCuentasContablesLineaProductoArbol.setText("Arbol");
		jButtonid_linea_grupoCuentasContablesLineaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_grupoCuentasContablesLineaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoCuentasContablesLineaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_grupoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoCuentasContablesLineaProductoArbol"));



					
		this.jLabelid_linea_categoriaCuentasContablesLineaProducto = new JLabelMe();
		this.jLabelid_linea_categoriaCuentasContablesLineaProducto.setText(""+CuentasContablesLineaProductoConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaCuentasContablesLineaProducto.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaCuentasContablesLineaProducto.setToolTipText(CuentasContablesLineaProductoConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		this.jPanelid_linea_categoriaCuentasContablesLineaProducto.setLayout(this.gridaBagLayoutCuentasContablesLineaProducto);


		jComboBoxid_linea_categoriaCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_linea_categoriaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonid_linea_categoriaCuentasContablesLineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaCuentasContablesLineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaCuentasContablesLineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonid_linea_categoriaCuentasContablesLineaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaCuentasContablesLineaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaCuentasContablesLineaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaCuentasContablesLineaProducto"));

		this.jButtonid_linea_categoriaCuentasContablesLineaProductoBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaCuentasContablesLineaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaCuentasContablesLineaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaCuentasContablesLineaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaCuentasContablesLineaProductoBusqueda.setText("U");
		this.jButtonid_linea_categoriaCuentasContablesLineaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaCuentasContablesLineaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaCuentasContablesLineaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaCuentasContablesLineaProductoBusqueda"));

		if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaCuentasContablesLineaProductoBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaCuentasContablesLineaProductoUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaCuentasContablesLineaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaCuentasContablesLineaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaCuentasContablesLineaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaCuentasContablesLineaProductoUpdate.setText("U");
		this.jButtonid_linea_categoriaCuentasContablesLineaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaCuentasContablesLineaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaCuentasContablesLineaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaCuentasContablesLineaProductoUpdate"));


		jButtonid_linea_categoriaCuentasContablesLineaProductoArbol= new JButtonMe();
		jButtonid_linea_categoriaCuentasContablesLineaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaCuentasContablesLineaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaCuentasContablesLineaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_linea_categoriaCuentasContablesLineaProductoArbol.setText("Arbol");
		jButtonid_linea_categoriaCuentasContablesLineaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_linea_categoriaCuentasContablesLineaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaCuentasContablesLineaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_linea_categoriaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaCuentasContablesLineaProductoArbol"));



					
		this.jLabelid_cuenta_contable_inventarioCuentasContablesLineaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_inventarioCuentasContablesLineaProducto.setText(""+CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIO+" : *");
		this.jLabelid_cuenta_contable_inventarioCuentasContablesLineaProducto.setToolTipText("Cuenta C. Inventario");
		this.jLabelid_cuenta_contable_inventarioCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_inventarioCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_inventarioCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_inventarioCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_inventarioCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_inventarioCuentasContablesLineaProducto.setToolTipText(CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIO);
		this.gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_inventarioCuentasContablesLineaProducto.setLayout(this.gridaBagLayoutCuentasContablesLineaProducto);


		jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioCuentasContablesLineaProducto"));

		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioCuentasContablesLineaProductoBusqueda"));

		if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioCuentasContablesLineaProductoUpdate"));


		jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioCuentasContablesLineaProductoArbol"));



					
		this.jLabelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.setText(""+CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOVENTA+" : *");
		this.jLabelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.setToolTipText("Cuenta C. Costo Venta");
		this.jLabelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.setToolTipText(CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOVENTA);
		this.gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.setLayout(this.gridaBagLayoutCuentasContablesLineaProducto);


		jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_ventaCuentasContablesLineaProducto"));

		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_ventaCuentasContablesLineaProductoBusqueda"));

		if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_ventaCuentasContablesLineaProductoUpdate"));


		jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_ventaCuentasContablesLineaProductoArbol"));



					
		this.jLabelid_cuenta_contable_ventaCuentasContablesLineaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_ventaCuentasContablesLineaProducto.setText(""+CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA+" : *");
		this.jLabelid_cuenta_contable_ventaCuentasContablesLineaProducto.setToolTipText("Cuenta C. Venta");
		this.jLabelid_cuenta_contable_ventaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ventaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ventaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ventaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_ventaCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_ventaCuentasContablesLineaProducto.setToolTipText(CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA);
		this.gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_ventaCuentasContablesLineaProducto.setLayout(this.gridaBagLayoutCuentasContablesLineaProducto);


		jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaCuentasContablesLineaProducto"));

		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaCuentasContablesLineaProductoBusqueda"));

		if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaCuentasContablesLineaProductoUpdate"));


		jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaCuentasContablesLineaProductoArbol"));



					
		this.jLabelid_cuenta_contable_descuentoCuentasContablesLineaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_descuentoCuentasContablesLineaProducto.setText(""+CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO+" : *");
		this.jLabelid_cuenta_contable_descuentoCuentasContablesLineaProducto.setToolTipText("Cuenta C. Descuento");
		this.jLabelid_cuenta_contable_descuentoCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_descuentoCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_descuentoCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_descuentoCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_descuentoCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_descuentoCuentasContablesLineaProducto.setToolTipText(CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO);
		this.gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_descuentoCuentasContablesLineaProducto.setLayout(this.gridaBagLayoutCuentasContablesLineaProducto);


		jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoCuentasContablesLineaProducto"));

		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoCuentasContablesLineaProductoBusqueda"));

		if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoCuentasContablesLineaProductoUpdate"));


		jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoCuentasContablesLineaProductoArbol"));



					
		this.jLabelid_cuenta_contable_produccionCuentasContablesLineaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_produccionCuentasContablesLineaProducto.setText(""+CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEPRODUCCION+" : *");
		this.jLabelid_cuenta_contable_produccionCuentasContablesLineaProducto.setToolTipText("Cuenta C. Produccion");
		this.jLabelid_cuenta_contable_produccionCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_produccionCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_produccionCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_produccionCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_produccionCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_produccionCuentasContablesLineaProducto.setToolTipText(CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEPRODUCCION);
		this.gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_produccionCuentasContablesLineaProducto.setLayout(this.gridaBagLayoutCuentasContablesLineaProducto);


		jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_produccionCuentasContablesLineaProducto"));

		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_produccionCuentasContablesLineaProductoBusqueda"));

		if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_produccionCuentasContablesLineaProductoUpdate"));


		jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_produccionCuentasContablesLineaProductoArbol"));



					
		this.jLabelid_cuenta_contable_devolucionCuentasContablesLineaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_devolucionCuentasContablesLineaProducto.setText(""+CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION+" : *");
		this.jLabelid_cuenta_contable_devolucionCuentasContablesLineaProducto.setToolTipText("Cuenta C. Devolucion");
		this.jLabelid_cuenta_contable_devolucionCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_devolucionCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_devolucionCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_devolucionCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_devolucionCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_devolucionCuentasContablesLineaProducto.setToolTipText(CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION);
		this.gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_devolucionCuentasContablesLineaProducto.setLayout(this.gridaBagLayoutCuentasContablesLineaProducto);


		jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionCuentasContablesLineaProducto"));

		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionCuentasContablesLineaProductoBusqueda"));

		if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionCuentasContablesLineaProductoUpdate"));


		jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionCuentasContablesLineaProductoArbol"));



					
		this.jLabelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.setText(""+CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEIVADEBITO+" : *");
		this.jLabelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.setToolTipText("Cuenta C. Iva Debito");
		this.jLabelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.setToolTipText(CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEIVADEBITO);
		this.gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.setLayout(this.gridaBagLayoutCuentasContablesLineaProducto);


		jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva_debitoCuentasContablesLineaProducto"));

		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva_debitoCuentasContablesLineaProductoBusqueda"));

		if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva_debitoCuentasContablesLineaProductoUpdate"));


		jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva_debitoCuentasContablesLineaProductoArbol"));



					
		this.jLabelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.setText(""+CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEIVACREDITO+" : *");
		this.jLabelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.setToolTipText("Cuenta C. Iva Credito");
		this.jLabelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.setToolTipText(CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEIVACREDITO);
		this.gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.setLayout(this.gridaBagLayoutCuentasContablesLineaProducto);


		jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva_creditoCuentasContablesLineaProducto"));

		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva_creditoCuentasContablesLineaProductoBusqueda"));

		if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva_creditoCuentasContablesLineaProductoUpdate"));


		jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva_creditoCuentasContablesLineaProductoArbol"));



					
		this.jLabelid_cuenta_contable_bonificaCuentasContablesLineaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_bonificaCuentasContablesLineaProducto.setText(""+CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEBONIFICA+" : *");
		this.jLabelid_cuenta_contable_bonificaCuentasContablesLineaProducto.setToolTipText("Cuenta C. Bonifica");
		this.jLabelid_cuenta_contable_bonificaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_bonificaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_bonificaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_bonificaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_bonificaCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_bonificaCuentasContablesLineaProducto.setToolTipText(CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLEBONIFICA);
		this.gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_bonificaCuentasContablesLineaProducto.setLayout(this.gridaBagLayoutCuentasContablesLineaProducto);


		jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_bonificaCuentasContablesLineaProducto"));

		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_bonificaCuentasContablesLineaProductoBusqueda"));

		if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_bonificaCuentasContablesLineaProductoUpdate"));


		jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_bonificaCuentasContablesLineaProductoArbol"));



					
		this.jLabelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto = new JLabelMe();
		this.jLabelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.setText(""+CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOBONIFICA+" : *");
		this.jLabelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.setToolTipText("Cuenta C. Costo Bonifica");
		this.jLabelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.setToolTipText(CuentasContablesLineaProductoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOBONIFICA);
		this.gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		this.jPanelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.setLayout(this.gridaBagLayoutCuentasContablesLineaProducto);


		jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.setText("Buscar");
		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_bonificaCuentasContablesLineaProducto"));

		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_bonificaCuentasContablesLineaProductoBusqueda"));

		if(this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoUpdate.setText("U");
		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_bonificaCuentasContablesLineaProductoUpdate"));


		jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoArbol= new JButtonMe();
		jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoArbol.setText("Arbol");
		jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_bonificaCuentasContablesLineaProductoArbol"));



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
		//this.jInternalFrameDetalleCuentasContablesLineaProducto = new CuentasContablesLineaProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cuentas Contables Linea Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentasContablesLineaProducto= new GridBagLayout();
		

		
		String sToolTipCuentasContablesLineaProducto="";
		sToolTipCuentasContablesLineaProducto=CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentasContablesLineaProducto+="(Inventario.CuentasContablesLineaProducto)";
		}
		
		if(!this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentasContablesLineaProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCuentasContablesLineaProducto = new JButtonMe();
		this.jButtonModificarCuentasContablesLineaProducto = new JButtonMe();
        this.jButtonActualizarCuentasContablesLineaProducto = new JButtonMe();
        this.jButtonEliminarCuentasContablesLineaProducto = new JButtonMe();
        this.jButtonCancelarCuentasContablesLineaProducto = new JButtonMe();
        this.jButtonGuardarCambiosCuentasContablesLineaProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaCuentasContablesLineaProducto = new JButtonMe();
		this.jButtonCerrarCuentasContablesLineaProducto = new JButtonMe();
		
		this.jScrollPanelDatosCuentasContablesLineaProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionCuentasContablesLineaProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralCuentasContablesLineaProducto = new JScrollPane();
				
		
		
		this.jPanelCamposCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Cuentas Contables Linea Producto";
		
		if(!this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuentas Contables Linea Productoes" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentasContablesLineaProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCuentasContablesLineaProducto.setName("jPanelCamposCuentasContablesLineaProducto"); 

		this.jPanelCamposOcultosCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCuentasContablesLineaProducto.setName("jPanelCamposOcultosCuentasContablesLineaProducto"); 

        this.jPanelAccionesCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentasContablesLineaProducto.setToolTipText("Acciones");
        this.jPanelAccionesCuentasContablesLineaProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCuentasContablesLineaProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCuentasContablesLineaProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralCuentasContablesLineaProducto.setName("jPanelCamposFingeneralCuentasContablesLineaProducto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto.setName("jPanelCamposFincuenta_contableCuentasContablesLineaProducto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCuentasContablesLineaProducto.setText("Nuevo");
		this.jButtonModificarCuentasContablesLineaProducto.setText("Editar");
        this.jButtonActualizarCuentasContablesLineaProducto.setText("Actualizar");
        this.jButtonEliminarCuentasContablesLineaProducto.setText("Eliminar");
        this.jButtonCancelarCuentasContablesLineaProducto.setText("Cancelar");
        this.jButtonGuardarCambiosCuentasContablesLineaProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaCuentasContablesLineaProducto.setText("Guardar");
		this.jButtonCerrarCuentasContablesLineaProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentasContablesLineaProducto,"nuevo_button","Nuevo",this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCuentasContablesLineaProducto,"modificar_button","Editar",this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCuentasContablesLineaProducto,"actualizar_button","Actualizar",this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCuentasContablesLineaProducto,"eliminar_button","Eliminar",this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCuentasContablesLineaProducto,"cancelar_button","Cancelar",this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCuentasContablesLineaProducto,"guardarcambios_button","Guardar",this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentasContablesLineaProducto,"guardarcambiostabla_button","Guardar",this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentasContablesLineaProducto,"cerrar_button","Salir",this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCuentasContablesLineaProducto.setToolTipText("Nuevo"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCuentasContablesLineaProducto.setToolTipText("Editar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCuentasContablesLineaProducto.setToolTipText("Actualizar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCuentasContablesLineaProducto.setToolTipText("Eliminar)"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCuentasContablesLineaProducto.setToolTipText("Cancelar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCuentasContablesLineaProducto.setToolTipText("Guardar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCuentasContablesLineaProducto.setToolTipText("Guardar"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentasContablesLineaProducto.setToolTipText("Salir"+" "+CuentasContablesLineaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentasContablesLineaProducto";
		inputMap = this.jButtonNuevoCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentasContablesLineaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentasContablesLineaProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCuentasContablesLineaProducto";
		inputMap = this.jButtonActualizarCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCuentasContablesLineaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCuentasContablesLineaProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarCuentasContablesLineaProducto";
		inputMap = this.jButtonEliminarCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCuentasContablesLineaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCuentasContablesLineaProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarCuentasContablesLineaProducto";
		inputMap = this.jButtonCancelarCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCuentasContablesLineaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCuentasContablesLineaProducto"));
		
		//CERRAR		
		sMapKey = "CerrarCuentasContablesLineaProducto";
		inputMap = this.jButtonCerrarCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentasContablesLineaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentasContablesLineaProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentasContablesLineaProducto";
		inputMap = this.jButtonGuardarCambiosTablaCuentasContablesLineaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentasContablesLineaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentasContablesLineaProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCuentasContablesLineaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCuentasContablesLineaProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCuentasContablesLineaProducto.setToolTipText("Nuevo CuentasContablesLineaProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCuentasContablesLineaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCuentasContablesLineaProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCuentasContablesLineaProducto.setToolTipText("Sin Cerrar Ventana CuentasContablesLineaProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCuentasContablesLineaProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCuentasContablesLineaProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCuentasContablesLineaProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCuentasContablesLineaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentasContablesLineaProducto.setText("Accion");
		this.jComboBoxTiposAccionesCuentasContablesLineaProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCuentasContablesLineaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCuentasContablesLineaProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCuentasContablesLineaProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCuentasContablesLineaProducto = new JLabelMe();
		
		this.jLabelAccionesCuentasContablesLineaProducto.setText("Acciones");		
		this.jLabelAccionesCuentasContablesLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentasContablesLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentasContablesLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCuentasContablesLineaProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCuentasContablesLineaProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCuentasContablesLineaProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesCuentasContablesLineaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCuentasContablesLineaProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCuentasContablesLineaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentasContablesLineaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentasContablesLineaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCuentasContablesLineaProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentasContablesLineaProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentasContablesLineaProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCuentasContablesLineaProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCuentasContablesLineaProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCuentasContablesLineaProducto = new GridBagLayout();
		
		this.jPanelCamposCuentasContablesLineaProducto.setLayout(gridaBagLayoutCamposCuentasContablesLineaProducto);
		this.jPanelCamposOcultosCuentasContablesLineaProducto.setLayout(gridaBagLayoutCamposOcultosCuentasContablesLineaProducto);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralCuentasContablesLineaProducto= new GridBagLayout();
		this.jPanelCamposIniciogeneralCuentasContablesLineaProducto.setLayout(gridaBagLayoutCamposIniciogeneralCuentasContablesLineaProducto);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableCuentasContablesLineaProducto= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto.setLayout(gridaBagLayoutCamposIniciocuenta_contableCuentasContablesLineaProducto);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCuentasContablesLineaProducto.add(jLabelIdCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCuentasContablesLineaProducto.add(jLabelidCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCuentasContablesLineaProducto.add(jLabelid_empresaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 2;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCuentasContablesLineaProducto.add(jButtonid_empresaCuentasContablesLineaProductoBusqueda, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 3;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCuentasContablesLineaProducto.add(jButtonid_empresaCuentasContablesLineaProductoUpdate, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCuentasContablesLineaProducto.add(jComboBoxid_empresaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaCuentasContablesLineaProducto.add(jLabelid_bodegaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 2;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaCuentasContablesLineaProducto.add(jButtonid_bodegaCuentasContablesLineaProductoBusqueda, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 3;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaCuentasContablesLineaProducto.add(jButtonid_bodegaCuentasContablesLineaProductoUpdate, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaCuentasContablesLineaProducto.add(jComboBoxid_bodegaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoCuentasContablesLineaProducto.add(jLabelid_centro_costoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 2;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoCuentasContablesLineaProducto.add(jButtonid_centro_costoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 3;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoCuentasContablesLineaProducto.add(jButtonid_centro_costoCuentasContablesLineaProductoArbol, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 4;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoCuentasContablesLineaProducto.add(jButtonid_centro_costoCuentasContablesLineaProductoBusqueda, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 5;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoCuentasContablesLineaProducto.add(jButtonid_centro_costoCuentasContablesLineaProductoUpdate, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoCuentasContablesLineaProducto.add(jComboBoxid_centro_costoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaCuentasContablesLineaProducto.add(jLabelid_lineaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 2;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaCuentasContablesLineaProducto.add(jButtonid_lineaCuentasContablesLineaProductoBusqueda, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 3;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaCuentasContablesLineaProducto.add(jButtonid_lineaCuentasContablesLineaProductoUpdate, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaCuentasContablesLineaProducto.add(jComboBoxid_lineaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoCuentasContablesLineaProducto.add(jLabelid_linea_grupoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 2;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoCuentasContablesLineaProducto.add(jButtonid_linea_grupoCuentasContablesLineaProductoBusqueda, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 3;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoCuentasContablesLineaProducto.add(jButtonid_linea_grupoCuentasContablesLineaProductoUpdate, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoCuentasContablesLineaProducto.add(jComboBoxid_linea_grupoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaCuentasContablesLineaProducto.add(jLabelid_linea_categoriaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 2;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaCuentasContablesLineaProducto.add(jButtonid_linea_categoriaCuentasContablesLineaProductoBusqueda, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 3;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaCuentasContablesLineaProducto.add(jButtonid_linea_categoriaCuentasContablesLineaProductoUpdate, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaCuentasContablesLineaProducto.add(jComboBoxid_linea_categoriaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_inventarioCuentasContablesLineaProducto.add(jLabelid_cuenta_contable_inventarioCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 2;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_inventarioCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_inventarioCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 3;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_inventarioCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoArbol, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 4;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inventarioCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoBusqueda, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 5;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inventarioCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_inventarioCuentasContablesLineaProductoUpdate, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_inventarioCuentasContablesLineaProducto.add(jComboBoxid_cuenta_contable_inventarioCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.add(jLabelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 2;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 3;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoArbol, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 4;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoBusqueda, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 5;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_costo_ventaCuentasContablesLineaProductoUpdate, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto.add(jComboBoxid_cuenta_contable_costo_ventaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_ventaCuentasContablesLineaProducto.add(jLabelid_cuenta_contable_ventaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 2;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ventaCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_ventaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 3;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_ventaCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoArbol, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 4;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ventaCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoBusqueda, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 5;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ventaCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_ventaCuentasContablesLineaProductoUpdate, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_ventaCuentasContablesLineaProducto.add(jComboBoxid_cuenta_contable_ventaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_descuentoCuentasContablesLineaProducto.add(jLabelid_cuenta_contable_descuentoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 2;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_descuentoCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_descuentoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 3;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_descuentoCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoArbol, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 4;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_descuentoCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoBusqueda, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 5;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_descuentoCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_descuentoCuentasContablesLineaProductoUpdate, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_descuentoCuentasContablesLineaProducto.add(jComboBoxid_cuenta_contable_descuentoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_produccionCuentasContablesLineaProducto.add(jLabelid_cuenta_contable_produccionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 2;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_produccionCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_produccionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 3;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_produccionCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoArbol, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 4;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_produccionCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoBusqueda, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 5;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_produccionCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_produccionCuentasContablesLineaProductoUpdate, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_produccionCuentasContablesLineaProducto.add(jComboBoxid_cuenta_contable_produccionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_devolucionCuentasContablesLineaProducto.add(jLabelid_cuenta_contable_devolucionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 2;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_devolucionCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_devolucionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 3;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_devolucionCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoArbol, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 4;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_devolucionCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoBusqueda, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 5;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_devolucionCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_devolucionCuentasContablesLineaProductoUpdate, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_devolucionCuentasContablesLineaProducto.add(jComboBoxid_cuenta_contable_devolucionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.add(jLabelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 2;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 3;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoArbol, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 4;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoBusqueda, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 5;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_iva_debitoCuentasContablesLineaProductoUpdate, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto.add(jComboBoxid_cuenta_contable_iva_debitoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.add(jLabelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 2;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 3;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoArbol, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 4;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoBusqueda, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 5;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_iva_creditoCuentasContablesLineaProductoUpdate, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto.add(jComboBoxid_cuenta_contable_iva_creditoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_bonificaCuentasContablesLineaProducto.add(jLabelid_cuenta_contable_bonificaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 2;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_bonificaCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_bonificaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 3;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_bonificaCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoArbol, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 4;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_bonificaCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoBusqueda, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 5;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_bonificaCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_bonificaCuentasContablesLineaProductoUpdate, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_bonificaCuentasContablesLineaProducto.add(jComboBoxid_cuenta_contable_bonificaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.add(jLabelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 2;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 3;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoArbol, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 4;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoBusqueda, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		//this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 5;
		this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.add(jButtonid_cuenta_contable_costo_bonificaCuentasContablesLineaProductoUpdate, this.gridBagConstraintsCuentasContablesLineaProducto);
	}

	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 1;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto.add(jComboBoxid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iYPanelCamposOcultosCuentasContablesLineaProducto;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iXPanelCamposOcultosCuentasContablesLineaProducto++;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCuentasContablesLineaProducto.add(this.jPanelid_empresaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(iXPanelCamposOcultosCuentasContablesLineaProducto % 1==0) {
		iXPanelCamposOcultosCuentasContablesLineaProducto=0;
		iYPanelCamposOcultosCuentasContablesLineaProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iYPanelCamposIniciogeneralCuentasContablesLineaProducto;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iXPanelCamposIniciogeneralCuentasContablesLineaProducto++;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentasContablesLineaProducto.add(this.jPanelidCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(iXPanelCamposIniciogeneralCuentasContablesLineaProducto % 1==0) {
		iXPanelCamposIniciogeneralCuentasContablesLineaProducto=0;
		iYPanelCamposIniciogeneralCuentasContablesLineaProducto++;
	}
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iYPanelCamposIniciogeneralCuentasContablesLineaProducto;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iXPanelCamposIniciogeneralCuentasContablesLineaProducto++;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentasContablesLineaProducto.add(this.jPanelid_bodegaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(iXPanelCamposIniciogeneralCuentasContablesLineaProducto % 1==0) {
		iXPanelCamposIniciogeneralCuentasContablesLineaProducto=0;
		iYPanelCamposIniciogeneralCuentasContablesLineaProducto++;
	}
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iYPanelCamposIniciogeneralCuentasContablesLineaProducto;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iXPanelCamposIniciogeneralCuentasContablesLineaProducto++;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentasContablesLineaProducto.add(this.jPanelid_centro_costoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(iXPanelCamposIniciogeneralCuentasContablesLineaProducto % 1==0) {
		iXPanelCamposIniciogeneralCuentasContablesLineaProducto=0;
		iYPanelCamposIniciogeneralCuentasContablesLineaProducto++;
	}
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iYPanelCamposIniciogeneralCuentasContablesLineaProducto;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iXPanelCamposIniciogeneralCuentasContablesLineaProducto++;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentasContablesLineaProducto.add(this.jPanelid_lineaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(iXPanelCamposIniciogeneralCuentasContablesLineaProducto % 1==0) {
		iXPanelCamposIniciogeneralCuentasContablesLineaProducto=0;
		iYPanelCamposIniciogeneralCuentasContablesLineaProducto++;
	}
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iYPanelCamposIniciogeneralCuentasContablesLineaProducto;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iXPanelCamposIniciogeneralCuentasContablesLineaProducto++;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentasContablesLineaProducto.add(this.jPanelid_linea_grupoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(iXPanelCamposIniciogeneralCuentasContablesLineaProducto % 1==0) {
		iXPanelCamposIniciogeneralCuentasContablesLineaProducto=0;
		iYPanelCamposIniciogeneralCuentasContablesLineaProducto++;
	}
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iYPanelCamposIniciogeneralCuentasContablesLineaProducto;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iXPanelCamposIniciogeneralCuentasContablesLineaProducto++;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentasContablesLineaProducto.add(this.jPanelid_linea_categoriaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(iXPanelCamposIniciogeneralCuentasContablesLineaProducto % 1==0) {
		iXPanelCamposIniciogeneralCuentasContablesLineaProducto=0;
		iYPanelCamposIniciogeneralCuentasContablesLineaProducto++;
	}
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto.add(this.jPanelid_cuenta_contable_inventarioCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto % 1==0) {
		iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto=0;
		iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	}
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto.add(this.jPanelid_cuenta_contable_costo_ventaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto % 1==0) {
		iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto=0;
		iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	}
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto.add(this.jPanelid_cuenta_contable_ventaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto % 1==0) {
		iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto=0;
		iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	}
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto.add(this.jPanelid_cuenta_contable_descuentoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto % 1==0) {
		iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto=0;
		iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	}
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto.add(this.jPanelid_cuenta_contable_produccionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto % 1==0) {
		iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto=0;
		iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	}
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto.add(this.jPanelid_cuenta_contable_devolucionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto % 1==0) {
		iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto=0;
		iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	}
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto.add(this.jPanelid_cuenta_contable_iva_debitoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto % 1==0) {
		iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto=0;
		iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	}
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto.add(this.jPanelid_cuenta_contable_iva_creditoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto % 1==0) {
		iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto=0;
		iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	}
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto.add(this.jPanelid_cuenta_contable_bonificaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto % 1==0) {
		iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto=0;
		iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	}
	this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto;
	this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
	this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentasContablesLineaProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto.add(this.jPanelid_cuenta_contable_costo_bonificaCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);



	if(iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto % 1==0) {
		iXPanelCamposIniciocuenta_contableCuentasContablesLineaProducto=0;
		iYPanelCamposIniciocuenta_contableCuentasContablesLineaProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesCuentasContablesLineaProducto= new GridBagLayout();
		this.jPanelAccionesCuentasContablesLineaProducto.setLayout(gridaBagLayoutAccionesCuentasContablesLineaProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCuentasContablesLineaProducto= new GridBagLayout();
		this.jPanelAccionesFormularioCuentasContablesLineaProducto.setLayout(gridaBagLayoutAccionesFormularioCuentasContablesLineaProducto);
		
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentasContablesLineaProducto.add(this.jComboBoxTiposAccionesFormularioCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentasContablesLineaProducto.add(this.jCheckBoxPostAccionNuevoCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cuentascontableslineaproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentasContablesLineaProducto.add(this.jCheckBoxPostAccionSinCerrarCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cuentascontableslineaproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentasContablesLineaProducto.add(this.jCheckBoxPostAccionSinMensajeCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesCuentasContablesLineaProducto.add(this.jButtonModificarCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);							

		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesCuentasContablesLineaProducto.add(this.jButtonEliminarCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		
			
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentasContablesLineaProducto.add(this.jButtonActualizarCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);


		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentasContablesLineaProducto.add(this.jButtonGuardarCambiosCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);	
		
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = 0;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesCuentasContablesLineaProducto.add(this.jButtonCancelarCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentasContablesLineaProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentasContablesLineaProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentascontableslineaproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();						
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;		
			//this.gridBagConstraintsCuentasContablesLineaProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentasContablesLineaProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx =0;
		this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentasContablesLineaProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CuentasContablesLineaProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCuentasContablesLineaProducto = new CuentasContablesLineaProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cuentas Contables Linea Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cuentas Contables Linea Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuentas Contables Linea Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CuentasContablesLineaProductoModel cuentascontableslineaproductoModel=new CuentasContablesLineaProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//CuentasContablesLineaProductoModel.CuentasContablesLineaProductoFocusTraversalPolicy cuentascontableslineaproductoFocusTraversalPolicy = cuentascontableslineaproductoModel.new CuentasContablesLineaProductoFocusTraversalPolicy(this);
			
			//cuentascontableslineaproductoFocusTraversalPolicy.setcuentascontableslineaproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cuentascontableslineaproductoModel);
			
			
			this.jContentPaneDetalleCuentasContablesLineaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCuentasContablesLineaProducto = new GridBagLayout();	
			this.jContentPaneDetalleCuentasContablesLineaProducto.setLayout(gridaBagLayoutDetalleCuentasContablesLineaProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentasContablesLineaProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
				this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
					
				
				this.jContentPaneDetalleCuentasContablesLineaProducto.add(jTtoolBarDetalleCuentasContablesLineaProducto, gridBagConstraintsCuentasContablesLineaProducto);								
				
}
			
			this.jScrollPanelDatosEdicionCuentasContablesLineaProducto=   new JScrollPane(jContentPaneDetalleCuentasContablesLineaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentasContablesLineaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentasContablesLineaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentasContablesLineaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCuentasContablesLineaProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentasContablesLineaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentasContablesLineaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentasContablesLineaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyRelaciones++;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;

		this.jContentPaneDetalleCuentasContablesLineaProducto.add(jPanelCamposIniciogeneralCuentasContablesLineaProducto, gridBagConstraintsCuentasContablesLineaProducto);


		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyRelaciones++;
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;

		this.jContentPaneDetalleCuentasContablesLineaProducto.add(jPanelCamposIniciocuenta_contableCuentasContablesLineaProducto, gridBagConstraintsCuentasContablesLineaProducto);
			
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
						&& cuentascontableslineaproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cuentascontableslineaproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCuentasContablesLineaProducto= new GridBagConstraints();
						this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
						this.jContentPaneDetalleCuentasContablesLineaProducto.add(this.jTabbedPaneRelacionesCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCuentasContablesLineaProducto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCuentasContablesLineaProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
					this.gridBagConstraintsCuentasContablesLineaProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
					
				
					this.jContentPaneDetalleCuentasContablesLineaProducto.add(jPanelCamposOcultosCuentasContablesLineaProducto, gridBagConstraintsCuentasContablesLineaProducto);
				
					this.jPanelCamposOcultosCuentasContablesLineaProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	        this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCuentasContablesLineaProducto.add(this.jPanelAccionesFormularioCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);							
			
			
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
	        this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleCuentasContablesLineaProducto.add(this.jPanelAccionesCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCuentasContablesLineaProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCuentasContablesLineaProducto=   new JScrollPane(this.jPanelCamposCuentasContablesLineaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentasContablesLineaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentasContablesLineaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentasContablesLineaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
			this.gridBagConstraintsCuentasContablesLineaProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCuentasContablesLineaProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCuentasContablesLineaProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);			
			
			this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
			this.gridBagConstraintsCuentasContablesLineaProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
			
			
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		
			
		this.gridBagConstraintsCuentasContablesLineaProducto = new GridBagConstraints();
		this.gridBagConstraintsCuentasContablesLineaProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentasContablesLineaProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentasContablesLineaProducto, this.gridBagConstraintsCuentasContablesLineaProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCuentasContablesLineaProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionCuentasContablesLineaProducto;
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
