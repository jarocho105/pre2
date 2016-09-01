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
import com.bydan.erp.inventario.util.GrupoBodegaConstantesFunciones;

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
public class GrupoBodegaDetalleFormJInternalFrame extends GrupoBodegaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleGrupoBodega;
	
	protected JMenuBar jmenuBarDetalleGrupoBodega;
	
	protected JMenu jmenuDetalleGrupoBodega;
	protected JMenu jmenuDetalleArchivoGrupoBodega;
	protected JMenu jmenuDetalleAccionesGrupoBodega;
	protected JMenu jmenuDetalleDatosGrupoBodega;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGrupoBodega;	
	protected GridBagConstraints gridBagConstraintsGrupoBodega;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected GrupoBodegaBeanSwingJInternalFrameAdditional jInternalFrameDetalleGrupoBodega;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

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

	protected CuentaContableBeanSwingJInternalFrame cuentacontableproduccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableproduccion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablebonificaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablebonifica="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostobonificaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecostobonifica="";
	
	public GrupoBodegaSessionBean grupobodegaSessionBean;
	
	

	public BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame=null;
	public BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteBodega=false;
	public BodegaSessionBean bodegaSessionBean;

	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;
	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroInventarioDefecto=false;
	public ParametroInventarioDefectoSessionBean parametroinventariodefectoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
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
	public CuentaContableSessionBean cuentacontableproduccionSessionBean;
	public CuentaContableSessionBean cuentacontablebonificaSessionBean;
	public CuentaContableSessionBean cuentacontablecostobonificaSessionBean;	
	
	public GrupoBodegaLogic grupobodegaLogic;
	
	public JScrollPane jScrollPanelDatosGrupoBodega;
	public JScrollPane jScrollPanelDatosEdicionGrupoBodega;
	public JScrollPane jScrollPanelDatosGeneralGrupoBodega;
	
	protected JPanel jPanelCamposGrupoBodega;    
	protected JPanel jPanelCamposOcultosGrupoBodega;    	
	protected JPanel jPanelAccionesGrupoBodega;
	protected JPanel jPanelAccionesFormularioGrupoBodega;
    
	
	
	protected JTabbedPane jTabbedPaneCamposGrupoBodega;	
	protected Integer iXPanelCamposGrupoBodega=0;
	protected Integer iYPanelCamposGrupoBodega=0;
	
	protected Integer iXPanelCamposOcultosGrupoBodega=0;
	protected Integer iYPanelCamposOcultosGrupoBodega=0;
	
	

	protected JPanel jPanelCamposIniciogeneralGrupoBodega;
	protected Integer iXPanelCamposIniciogeneralGrupoBodega=0;
	protected Integer iYPanelCamposIniciogeneralGrupoBodega=0;

	protected JPanel jPanelCamposIniciocuenta_contableGrupoBodega;
	protected Integer iXPanelCamposIniciocuenta_contableGrupoBodega=0;
	protected Integer iYPanelCamposIniciocuenta_contableGrupoBodega=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoGrupoBodega;
	public JButton jButtonModificarGrupoBodega;
	public JButton jButtonActualizarGrupoBodega;
    public JButton jButtonEliminarGrupoBodega;
	public JButton jButtonCancelarGrupoBodega;
    public JButton jButtonGuardarCambiosGrupoBodega;
	public JButton jButtonGuardarCambiosTablaGrupoBodega;
	protected JButton jButtonCerrarGrupoBodega;
	
	
	protected JButton jButtonProcesarInformacionGrupoBodega;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoGrupoBodega;
	protected JCheckBox jCheckBoxPostAccionSinCerrarGrupoBodega;
	protected JCheckBox jCheckBoxPostAccionSinMensajeGrupoBodega;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGrupoBodega;
	protected JButton jButtonModificarToolBarGrupoBodega;
	protected JButton jButtonActualizarToolBarGrupoBodega;
    protected JButton jButtonEliminarToolBarGrupoBodega;
	protected JButton jButtonCancelarToolBarGrupoBodega;
    protected JButton jButtonGuardarCambiosToolBarGrupoBodega;
	protected JButton jButtonGuardarCambiosTablaToolBarGrupoBodega;
	protected JButton jButtonMostrarOcultarTablaToolBarGrupoBodega;
	protected JButton jButtonCerrarToolBarGrupoBodega;
	
	protected JButton jButtonProcesarInformacionToolBarGrupoBodega;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGrupoBodega;
	protected JMenuItem jMenuItemModificarGrupoBodega;
	protected JMenuItem jMenuItemActualizarGrupoBodega;
    protected JMenuItem jMenuItemEliminarGrupoBodega;
	protected JMenuItem jMenuItemCancelarGrupoBodega;
    protected JMenuItem jMenuItemGuardarCambiosGrupoBodega;
	protected JMenuItem jMenuItemGuardarCambiosTablaGrupoBodega;
	protected JMenuItem jMenuItemCerrarGrupoBodega;
	protected JMenuItem jMenuItemDetalleCerrarGrupoBodega;
	protected JMenuItem jMenuItemDetalleMostarOcultarGrupoBodega;
	
	protected JMenuItem jMenuItemProcesarInformacionGrupoBodega;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGrupoBodega;
	protected JMenuItem jMenuItemMostrarOcultarGrupoBodega;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGrupoBodega;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGrupoBodega;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGrupoBodega;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioGrupoBodega;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidGrupoBodega;
	public JLabel jLabelIdGrupoBodega;
	public JLabel jLabelidGrupoBodega;
	public JButton jButtonidGrupoBodegaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoGrupoBodega;
	public JLabel jLabelcodigoGrupoBodega;
	public JTextField jTextFieldcodigoGrupoBodega;
	public JButton jButtoncodigoGrupoBodegaBusqueda= new JButtonMe();

	public JPanel jPanelnombreGrupoBodega;
	public JLabel jLabelnombreGrupoBodega;
	public JTextArea jTextAreanombreGrupoBodega;
	public JScrollPane jscrollPanenombreGrupoBodega;
	public JButton jButtonnombreGrupoBodegaBusqueda= new JButtonMe();

	public JPanel jPanelrucGrupoBodega;
	public JLabel jLabelrucGrupoBodega;
	public JTextField jTextFieldrucGrupoBodega;
	public JButton jButtonrucGrupoBodegaBusqueda= new JButtonMe();

	public JPanel jPaneldireccionGrupoBodega;
	public JLabel jLabeldireccionGrupoBodega;
	public JTextArea jTextAreadireccionGrupoBodega;
	public JScrollPane jscrollPanedireccionGrupoBodega;
	public JButton jButtondireccionGrupoBodegaBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoGrupoBodega;
	public JLabel jLabeltelefonoGrupoBodega;
	public JTextField jTextFieldtelefonoGrupoBodega;
	public JButton jButtontelefonoGrupoBodegaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionGrupoBodega;
	public JLabel jLabeldescripcionGrupoBodega;
	public JTextArea jTextAreadescripcionGrupoBodega;
	public JScrollPane jscrollPanedescripcionGrupoBodega;
	public JButton jButtondescripcionGrupoBodegaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaGrupoBodega;
	public JLabel jLabelid_empresaGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaGrupoBodega;
	public JButton jButtonid_empresaGrupoBodega= new JButtonMe();
	public JButton jButtonid_empresaGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_empresaGrupoBodegaBusqueda= new JButtonMe();

	public JPanel jPanelid_paisGrupoBodega;
	public JLabel jLabelid_paisGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisGrupoBodega;
	public JButton jButtonid_paisGrupoBodega= new JButtonMe();
	public JButton jButtonid_paisGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_paisGrupoBodegaBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadGrupoBodega;
	public JLabel jLabelid_ciudadGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadGrupoBodega;
	public JButton jButtonid_ciudadGrupoBodega= new JButtonMe();
	public JButton jButtonid_ciudadGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_ciudadGrupoBodegaBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoGrupoBodega;
	public JLabel jLabelid_centro_costoGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoGrupoBodega;
	public JButton jButtonid_centro_costoGrupoBodega= new JButtonMe();
	public JButton jButtonid_centro_costoGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoGrupoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoGrupoBodegaArbol= new JButtonMe();

	public JPanel jPanelid_empleadoGrupoBodega;
	public JLabel jLabelid_empleadoGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoGrupoBodega;
	public JButton jButtonid_empleadoGrupoBodega= new JButtonMe();
	public JButton jButtonid_empleadoGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoGrupoBodegaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_inventarioGrupoBodega;
	public JLabel jLabelid_cuenta_contable_inventarioGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_inventarioGrupoBodega;
	public JButton jButtonid_cuenta_contable_inventarioGrupoBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioGrupoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioGrupoBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_costoGrupoBodega;
	public JLabel jLabelid_cuenta_contable_costoGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costoGrupoBodega;
	public JButton jButtonid_cuenta_contable_costoGrupoBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoGrupoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoGrupoBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_ventaGrupoBodega;
	public JLabel jLabelid_cuenta_contable_ventaGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ventaGrupoBodega;
	public JButton jButtonid_cuenta_contable_ventaGrupoBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaGrupoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaGrupoBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_descuentoGrupoBodega;
	public JLabel jLabelid_cuenta_contable_descuentoGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_descuentoGrupoBodega;
	public JButton jButtonid_cuenta_contable_descuentoGrupoBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoGrupoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoGrupoBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_devolucionGrupoBodega;
	public JLabel jLabelid_cuenta_contable_devolucionGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_devolucionGrupoBodega;
	public JButton jButtonid_cuenta_contable_devolucionGrupoBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionGrupoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionGrupoBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_debitoGrupoBodega;
	public JLabel jLabelid_cuenta_contable_debitoGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_debitoGrupoBodega;
	public JButton jButtonid_cuenta_contable_debitoGrupoBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoGrupoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoGrupoBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_creditoGrupoBodega;
	public JLabel jLabelid_cuenta_contable_creditoGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoGrupoBodega;
	public JButton jButtonid_cuenta_contable_creditoGrupoBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoGrupoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoGrupoBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_produccionGrupoBodega;
	public JLabel jLabelid_cuenta_contable_produccionGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_produccionGrupoBodega;
	public JButton jButtonid_cuenta_contable_produccionGrupoBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_produccionGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_produccionGrupoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_produccionGrupoBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_bonificaGrupoBodega;
	public JLabel jLabelid_cuenta_contable_bonificaGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_bonificaGrupoBodega;
	public JButton jButtonid_cuenta_contable_bonificaGrupoBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_bonificaGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_bonificaGrupoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_bonificaGrupoBodegaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_costo_bonificaGrupoBodega;
	public JLabel jLabelid_cuenta_contable_costo_bonificaGrupoBodega;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costo_bonificaGrupoBodega;
	public JButton jButtonid_cuenta_contable_costo_bonificaGrupoBodega= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_bonificaGrupoBodegaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_bonificaGrupoBodegaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_bonificaGrupoBodegaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesGrupoBodega;
	
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
	public int iHeightFormulario=1562;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public GrupoBodegaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposGrupoBodega=new JPanel();
				this.jPanelAccionesFormularioGrupoBodega=new JPanel();
				this.jmenuBarDetalleGrupoBodega=new JMenuBar();
				this.jTtoolBarDetalleGrupoBodega=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoBodegaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("GrupoBodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public GrupoBodegaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("GrupoBodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoBodegaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoBodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoBodegaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoBodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoBodegaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GrupoBodega No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarGrupoBodega() {
		return this.jButtonActualizarToolBarGrupoBodega;
	}
	
	public JButton getjButtonEliminarToolBarGrupoBodega() {
		return this.jButtonEliminarToolBarGrupoBodega;
	}
	
	public JButton getjButtonCancelarToolBarGrupoBodega() {
		return this.jButtonCancelarToolBarGrupoBodega;
	}		
	
	public JButton getjButtonProcesarInformacionGrupoBodega() {
		return this.jButtonProcesarInformacionGrupoBodega;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGrupoBodega)	{
		this.jButtonProcesarInformacionGrupoBodega = jButtonProcesarInformacionGrupoBodega;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGrupoBodega() {
		return this.jComboBoxTiposAccionesGrupoBodega;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGrupoBodega(
			JComboBox jComboBoxTiposRelacionesGrupoBodega) {
		this.jComboBoxTiposRelacionesGrupoBodega = jComboBoxTiposRelacionesGrupoBodega;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGrupoBodega(
			JComboBox jComboBoxTiposAccionesGrupoBodega) {
		this.jComboBoxTiposAccionesGrupoBodega = jComboBoxTiposAccionesGrupoBodega;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioGrupoBodega() {
		return this.jComboBoxTiposAccionesFormularioGrupoBodega;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioGrupoBodega(
			JComboBox jComboBoxTiposAccionesFormularioGrupoBodega) {
		this.jComboBoxTiposAccionesFormularioGrupoBodega = jComboBoxTiposAccionesFormularioGrupoBodega;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.grupobodegaSessionBean=new GrupoBodegaSessionBean();
		
		this.grupobodegaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.grupobodegaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.grupobodegaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.bodegaSessionBean=new BodegaSessionBean();
		//this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GrupoBodegaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GrupoBodegaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GrupoBodegaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Grupo Bodega MANTENIMIENTO"));
		
		
		if(iWidth > 2250) {
			iWidth=2250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.grupobodegaSessionBean.getEsGuardarRelacionado()) {
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
	
		GrupoBodegaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleGrupoBodega= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarGrupoBodega=new JButtonMe();
				this.jButtonModificarToolBarGrupoBodega=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarGrupoBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarGrupoBodega,this.jTtoolBarDetalleGrupoBodega,
							"actualizar","actualizar","Actualizar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarGrupoBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarGrupoBodega,this.jTtoolBarDetalleGrupoBodega,
							"eliminar","eliminar","Eliminar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarGrupoBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarGrupoBodega,this.jTtoolBarDetalleGrupoBodega,
							"cancelar","cancelar","Cancelar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarGrupoBodega=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarGrupoBodega,this.jTtoolBarDetalleGrupoBodega,
							"guardarcambios","guardarcambios","Guardar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleGrupoBodega=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleGrupoBodega=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoGrupoBodega=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesGrupoBodega=new JMenuMe("Acciones");
		this.jmenuDetalleDatosGrupoBodega=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGrupoBodega= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGrupoBodega.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGrupoBodega,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarGrupoBodega= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarGrupoBodega.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarGrupoBodega,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarGrupoBodega= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarGrupoBodega.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarGrupoBodega,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarGrupoBodega= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarGrupoBodega.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarGrupoBodega,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarGrupoBodega= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarGrupoBodega.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarGrupoBodega,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosGrupoBodega= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGrupoBodega.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGrupoBodega,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGrupoBodega= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGrupoBodega.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGrupoBodega,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarGrupoBodega= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarGrupoBodega.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarGrupoBodega,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGrupoBodega= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGrupoBodega.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGrupoBodega,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGrupoBodega= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGrupoBodega.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGrupoBodega,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoGrupoBodega.add(this.jMenuItemDetalleCerrarGrupoBodega);
		
		this.jmenuDetalleAccionesGrupoBodega.add(this.jMenuItemActualizarGrupoBodega);
		this.jmenuDetalleAccionesGrupoBodega.add(this.jMenuItemEliminarGrupoBodega);
		this.jmenuDetalleAccionesGrupoBodega.add(this.jMenuItemCancelarGrupoBodega);		
		
		//this.jmenuDetalleDatosGrupoBodega.add(this.jMenuItemDetalleAbrirOrderByGrupoBodega);				
		this.jmenuDetalleDatosGrupoBodega.add(this.jMenuItemDetalleMostarOcultarGrupoBodega);				
				
		//this.jmenuDetalleAccionesGrupoBodega.add(this.jMenuItemGuardarCambiosGrupoBodega);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleGrupoBodega.add(this.jmenuDetalleArchivoGrupoBodega);		
		this.jmenuBarDetalleGrupoBodega.add(this.jmenuDetalleAccionesGrupoBodega);		
		this.jmenuBarDetalleGrupoBodega.add(this.jmenuDetalleDatosGrupoBodega);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleGrupoBodega.add(this.jmenuDetalleGrupoBodega);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleGrupoBodega);				
	}
	
	
	public void inicializarElementosCamposGrupoBodega() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdGrupoBodega = new JLabelMe();
		jLabelIdGrupoBodega.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidGrupoBodega = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutGrupoBodega= new GridBagLayout();

		this.jPanelidGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);

		jLabelidGrupoBodega = new JLabel();
		jLabelidGrupoBodega.setText("Id");

		jLabelidGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoGrupoBodega = new JLabelMe();
		this.jLabelcodigoGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoGrupoBodega.setToolTipText("Codigo");
		this.jLabelcodigoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelcodigoGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jTextFieldcodigoGrupoBodega= new JTextFieldMe();

		jTextFieldcodigoGrupoBodega.setEnabled(false);
		jTextFieldcodigoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoGrupoBodegaBusqueda= new JButtonMe();
		this.jButtoncodigoGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoGrupoBodegaBusqueda.setText("U");
		this.jButtoncodigoGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoGrupoBodegaBusqueda.setVisible(false);		}


					
		this.jLabelnombreGrupoBodega = new JLabelMe();
		this.jLabelnombreGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreGrupoBodega.setToolTipText("Nombre");
		this.jLabelnombreGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelnombreGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jTextAreanombreGrupoBodega= new JTextAreaMe();
		jTextAreanombreGrupoBodega.setEnabled(false);
		jTextAreanombreGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreGrupoBodega.setLineWrap(true);
		jTextAreanombreGrupoBodega.setWrapStyleWord(true);
		jTextAreanombreGrupoBodega.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreGrupoBodega.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreGrupoBodega = new JScrollPane(jTextAreanombreGrupoBodega);
		jscrollPanenombreGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreGrupoBodegaBusqueda= new JButtonMe();
		this.jButtonnombreGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreGrupoBodegaBusqueda.setText("U");
		this.jButtonnombreGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreGrupoBodegaBusqueda.setVisible(false);		}


					
		this.jLabelrucGrupoBodega = new JLabelMe();
		this.jLabelrucGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_RUC+" :");
		this.jLabelrucGrupoBodega.setToolTipText("Ruc");
		this.jLabelrucGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelrucGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jTextFieldrucGrupoBodega= new JTextFieldMe();

		jTextFieldrucGrupoBodega.setEnabled(false);
		jTextFieldrucGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucGrupoBodegaBusqueda= new JButtonMe();
		this.jButtonrucGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucGrupoBodegaBusqueda.setText("U");
		this.jButtonrucGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucGrupoBodegaBusqueda.setVisible(false);		}


					
		this.jLabeldireccionGrupoBodega = new JLabelMe();
		this.jLabeldireccionGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_DIRECCION+" :");
		this.jLabeldireccionGrupoBodega.setToolTipText("Direccion");
		this.jLabeldireccionGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPaneldireccionGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jTextAreadireccionGrupoBodega= new JTextAreaMe();
		jTextAreadireccionGrupoBodega.setEnabled(false);
		jTextAreadireccionGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionGrupoBodega.setLineWrap(true);
		jTextAreadireccionGrupoBodega.setWrapStyleWord(true);
		jTextAreadireccionGrupoBodega.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionGrupoBodega.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionGrupoBodega = new JScrollPane(jTextAreadireccionGrupoBodega);
		jscrollPanedireccionGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionGrupoBodegaBusqueda= new JButtonMe();
		this.jButtondireccionGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionGrupoBodegaBusqueda.setText("U");
		this.jButtondireccionGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionGrupoBodegaBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoGrupoBodega = new JLabelMe();
		this.jLabeltelefonoGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_TELEFONO+" :");
		this.jLabeltelefonoGrupoBodega.setToolTipText("Telefono");
		this.jLabeltelefonoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPaneltelefonoGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jTextFieldtelefonoGrupoBodega= new JTextFieldMe();

		jTextFieldtelefonoGrupoBodega.setEnabled(false);
		jTextFieldtelefonoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoGrupoBodegaBusqueda= new JButtonMe();
		this.jButtontelefonoGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoGrupoBodegaBusqueda.setText("U");
		this.jButtontelefonoGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoGrupoBodegaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionGrupoBodega = new JLabelMe();
		this.jLabeldescripcionGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionGrupoBodega.setToolTipText("Descripcion");
		this.jLabeldescripcionGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPaneldescripcionGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jTextAreadescripcionGrupoBodega= new JTextAreaMe();
		jTextAreadescripcionGrupoBodega.setEnabled(false);
		jTextAreadescripcionGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionGrupoBodega.setLineWrap(true);
		jTextAreadescripcionGrupoBodega.setWrapStyleWord(true);
		jTextAreadescripcionGrupoBodega.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionGrupoBodega.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionGrupoBodega = new JScrollPane(jTextAreadescripcionGrupoBodega);
		jscrollPanedescripcionGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionGrupoBodegaBusqueda= new JButtonMe();
		this.jButtondescripcionGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionGrupoBodegaBusqueda.setText("U");
		this.jButtondescripcionGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionGrupoBodegaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysGrupoBodega() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaGrupoBodega = new JLabelMe();
		this.jLabelid_empresaGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaGrupoBodega.setToolTipText("Empresa");
		this.jLabelid_empresaGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelid_empresaGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jComboBoxid_empresaGrupoBodega= new JComboBoxMe();
		jComboBoxid_empresaGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaGrupoBodega.setEnabled(false);

		this.jButtonid_empresaGrupoBodega= new JButtonMe();
		this.jButtonid_empresaGrupoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGrupoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGrupoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGrupoBodega.setText("Buscar");
		this.jButtonid_empresaGrupoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaGrupoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGrupoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGrupoBodega"));

		this.jButtonid_empresaGrupoBodegaBusqueda= new JButtonMe();
		this.jButtonid_empresaGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGrupoBodegaBusqueda.setText("U");
		this.jButtonid_empresaGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaGrupoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_empresaGrupoBodegaUpdate= new JButtonMe();
		this.jButtonid_empresaGrupoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGrupoBodegaUpdate.setText("U");
		this.jButtonid_empresaGrupoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaGrupoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGrupoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGrupoBodegaUpdate"));



					
		this.jLabelid_paisGrupoBodega = new JLabelMe();
		this.jLabelid_paisGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisGrupoBodega.setToolTipText("Pais");
		this.jLabelid_paisGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelid_paisGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jComboBoxid_paisGrupoBodega= new JComboBoxMe();
		jComboBoxid_paisGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisGrupoBodega= new JButtonMe();
		this.jButtonid_paisGrupoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisGrupoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisGrupoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisGrupoBodega.setText("Buscar");
		this.jButtonid_paisGrupoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisGrupoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisGrupoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisGrupoBodega"));

		this.jButtonid_paisGrupoBodegaBusqueda= new JButtonMe();
		this.jButtonid_paisGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisGrupoBodegaBusqueda.setText("U");
		this.jButtonid_paisGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisGrupoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_paisGrupoBodegaUpdate= new JButtonMe();
		this.jButtonid_paisGrupoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisGrupoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisGrupoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisGrupoBodegaUpdate.setText("U");
		this.jButtonid_paisGrupoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisGrupoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisGrupoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisGrupoBodegaUpdate"));



					
		this.jLabelid_ciudadGrupoBodega = new JLabelMe();
		this.jLabelid_ciudadGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadGrupoBodega.setToolTipText("Ciudad");
		this.jLabelid_ciudadGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelid_ciudadGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jComboBoxid_ciudadGrupoBodega= new JComboBoxMe();
		jComboBoxid_ciudadGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadGrupoBodega= new JButtonMe();
		this.jButtonid_ciudadGrupoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadGrupoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadGrupoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadGrupoBodega.setText("Buscar");
		this.jButtonid_ciudadGrupoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadGrupoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadGrupoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadGrupoBodega"));

		this.jButtonid_ciudadGrupoBodegaBusqueda= new JButtonMe();
		this.jButtonid_ciudadGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadGrupoBodegaBusqueda.setText("U");
		this.jButtonid_ciudadGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadGrupoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_ciudadGrupoBodegaUpdate= new JButtonMe();
		this.jButtonid_ciudadGrupoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadGrupoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadGrupoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadGrupoBodegaUpdate.setText("U");
		this.jButtonid_ciudadGrupoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadGrupoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadGrupoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadGrupoBodegaUpdate"));



					
		this.jLabelid_centro_costoGrupoBodega = new JLabelMe();
		this.jLabelid_centro_costoGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoGrupoBodega.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelid_centro_costoGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jComboBoxid_centro_costoGrupoBodega= new JComboBoxMe();
		jComboBoxid_centro_costoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoGrupoBodega= new JButtonMe();
		this.jButtonid_centro_costoGrupoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoGrupoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoGrupoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoGrupoBodega.setText("Buscar");
		this.jButtonid_centro_costoGrupoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoGrupoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoGrupoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoGrupoBodega"));

		this.jButtonid_centro_costoGrupoBodegaBusqueda= new JButtonMe();
		this.jButtonid_centro_costoGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoGrupoBodegaBusqueda.setText("U");
		this.jButtonid_centro_costoGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoGrupoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoGrupoBodegaUpdate= new JButtonMe();
		this.jButtonid_centro_costoGrupoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoGrupoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoGrupoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoGrupoBodegaUpdate.setText("U");
		this.jButtonid_centro_costoGrupoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoGrupoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoGrupoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoGrupoBodegaUpdate"));


		jButtonid_centro_costoGrupoBodegaArbol= new JButtonMe();
		jButtonid_centro_costoGrupoBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoGrupoBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoGrupoBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoGrupoBodegaArbol.setText("Arbol");
		jButtonid_centro_costoGrupoBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoGrupoBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoGrupoBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoGrupoBodegaArbol"));



					
		this.jLabelid_empleadoGrupoBodega = new JLabelMe();
		this.jLabelid_empleadoGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoGrupoBodega.setToolTipText("Empleado");
		this.jLabelid_empleadoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelid_empleadoGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jComboBoxid_empleadoGrupoBodega= new JComboBoxMe();
		jComboBoxid_empleadoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoGrupoBodega= new JButtonMe();
		this.jButtonid_empleadoGrupoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoGrupoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoGrupoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoGrupoBodega.setText("Buscar");
		this.jButtonid_empleadoGrupoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoGrupoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoGrupoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoGrupoBodega"));

		this.jButtonid_empleadoGrupoBodegaBusqueda= new JButtonMe();
		this.jButtonid_empleadoGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoGrupoBodegaBusqueda.setText("U");
		this.jButtonid_empleadoGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoGrupoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_empleadoGrupoBodegaUpdate= new JButtonMe();
		this.jButtonid_empleadoGrupoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoGrupoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoGrupoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoGrupoBodegaUpdate.setText("U");
		this.jButtonid_empleadoGrupoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoGrupoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoGrupoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoGrupoBodegaUpdate"));



					
		this.jLabelid_cuenta_contable_inventarioGrupoBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_inventarioGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIO+" : *");
		this.jLabelid_cuenta_contable_inventarioGrupoBodega.setToolTipText("Cuenta C. Inventario");
		this.jLabelid_cuenta_contable_inventarioGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_inventarioGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_inventarioGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_inventarioGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_inventarioGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_inventarioGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLEINVENTARIO);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_inventarioGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jComboBoxid_cuenta_contable_inventarioGrupoBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_inventarioGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventarioGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventarioGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_inventarioGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_inventarioGrupoBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioGrupoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioGrupoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioGrupoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_inventarioGrupoBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_inventarioGrupoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_inventarioGrupoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioGrupoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_inventarioGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioGrupoBodega"));

		this.jButtonid_cuenta_contable_inventarioGrupoBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inventarioGrupoBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_inventarioGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_inventarioGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_inventarioGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_inventarioGrupoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_inventarioGrupoBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_inventarioGrupoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioGrupoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_inventarioGrupoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_inventarioGrupoBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_inventarioGrupoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_inventarioGrupoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioGrupoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_inventarioGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioGrupoBodegaUpdate"));


		jButtonid_cuenta_contable_inventarioGrupoBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_inventarioGrupoBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioGrupoBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioGrupoBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_inventarioGrupoBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_inventarioGrupoBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_inventarioGrupoBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_inventarioGrupoBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_inventarioGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_inventarioGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_inventarioGrupoBodegaArbol"));



					
		this.jLabelid_cuenta_contable_costoGrupoBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_costoGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO+" : *");
		this.jLabelid_cuenta_contable_costoGrupoBodega.setToolTipText("Cuenta C. Costo");
		this.jLabelid_cuenta_contable_costoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_costoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_costoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costoGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_costoGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_costoGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_costoGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jComboBoxid_cuenta_contable_costoGrupoBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costoGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_costoGrupoBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_costoGrupoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoGrupoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoGrupoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costoGrupoBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_costoGrupoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_costoGrupoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoGrupoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_costoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoGrupoBodega"));

		this.jButtonid_cuenta_contable_costoGrupoBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_costoGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costoGrupoBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_costoGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_costoGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_costoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_costoGrupoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_costoGrupoBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_costoGrupoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoGrupoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costoGrupoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costoGrupoBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_costoGrupoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_costoGrupoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoGrupoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_costoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoGrupoBodegaUpdate"));


		jButtonid_cuenta_contable_costoGrupoBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_costoGrupoBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoGrupoBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoGrupoBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costoGrupoBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_costoGrupoBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_costoGrupoBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costoGrupoBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_costoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costoGrupoBodegaArbol"));



					
		this.jLabelid_cuenta_contable_ventaGrupoBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_ventaGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA+" : *");
		this.jLabelid_cuenta_contable_ventaGrupoBodega.setToolTipText("Cuenta C. Venta");
		this.jLabelid_cuenta_contable_ventaGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ventaGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_ventaGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ventaGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_ventaGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_ventaGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_ventaGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jComboBoxid_cuenta_contable_ventaGrupoBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ventaGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ventaGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_ventaGrupoBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaGrupoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaGrupoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaGrupoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_ventaGrupoBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_ventaGrupoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_ventaGrupoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaGrupoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_ventaGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaGrupoBodega"));

		this.jButtonid_cuenta_contable_ventaGrupoBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ventaGrupoBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_ventaGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_ventaGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_ventaGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_ventaGrupoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_ventaGrupoBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_ventaGrupoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaGrupoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_ventaGrupoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_ventaGrupoBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_ventaGrupoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_ventaGrupoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaGrupoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_ventaGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaGrupoBodegaUpdate"));


		jButtonid_cuenta_contable_ventaGrupoBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_ventaGrupoBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaGrupoBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaGrupoBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_ventaGrupoBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_ventaGrupoBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_ventaGrupoBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_ventaGrupoBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_ventaGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_ventaGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_ventaGrupoBodegaArbol"));



					
		this.jLabelid_cuenta_contable_descuentoGrupoBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_descuentoGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO+" : *");
		this.jLabelid_cuenta_contable_descuentoGrupoBodega.setToolTipText("Cuenta C. Descuento");
		this.jLabelid_cuenta_contable_descuentoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_descuentoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_descuentoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_descuentoGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_descuentoGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_descuentoGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_descuentoGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jComboBoxid_cuenta_contable_descuentoGrupoBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_descuentoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_descuentoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_descuentoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_descuentoGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_descuentoGrupoBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoGrupoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoGrupoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoGrupoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_descuentoGrupoBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_descuentoGrupoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_descuentoGrupoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoGrupoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_descuentoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoGrupoBodega"));

		this.jButtonid_cuenta_contable_descuentoGrupoBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_descuentoGrupoBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_descuentoGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_descuentoGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_descuentoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_descuentoGrupoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_descuentoGrupoBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_descuentoGrupoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoGrupoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_descuentoGrupoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_descuentoGrupoBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_descuentoGrupoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_descuentoGrupoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoGrupoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_descuentoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoGrupoBodegaUpdate"));


		jButtonid_cuenta_contable_descuentoGrupoBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_descuentoGrupoBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoGrupoBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoGrupoBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_descuentoGrupoBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_descuentoGrupoBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_descuentoGrupoBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_descuentoGrupoBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_descuentoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_descuentoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_descuentoGrupoBodegaArbol"));



					
		this.jLabelid_cuenta_contable_devolucionGrupoBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_devolucionGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION+" : *");
		this.jLabelid_cuenta_contable_devolucionGrupoBodega.setToolTipText("Cuenta C. Devolucion");
		this.jLabelid_cuenta_contable_devolucionGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_devolucionGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_devolucionGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_devolucionGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_devolucionGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_devolucionGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_devolucionGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jComboBoxid_cuenta_contable_devolucionGrupoBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_devolucionGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_devolucionGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_devolucionGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_devolucionGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_devolucionGrupoBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionGrupoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionGrupoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionGrupoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_devolucionGrupoBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_devolucionGrupoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_devolucionGrupoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionGrupoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_devolucionGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionGrupoBodega"));

		this.jButtonid_cuenta_contable_devolucionGrupoBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_devolucionGrupoBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_devolucionGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_devolucionGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_devolucionGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_devolucionGrupoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_devolucionGrupoBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_devolucionGrupoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionGrupoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_devolucionGrupoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_devolucionGrupoBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_devolucionGrupoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_devolucionGrupoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionGrupoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_devolucionGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionGrupoBodegaUpdate"));


		jButtonid_cuenta_contable_devolucionGrupoBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_devolucionGrupoBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionGrupoBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionGrupoBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_devolucionGrupoBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_devolucionGrupoBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_devolucionGrupoBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_devolucionGrupoBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_devolucionGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_devolucionGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_devolucionGrupoBodegaArbol"));



					
		this.jLabelid_cuenta_contable_debitoGrupoBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_debitoGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO+" : *");
		this.jLabelid_cuenta_contable_debitoGrupoBodega.setToolTipText("Cuenta C. Debito");
		this.jLabelid_cuenta_contable_debitoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_debitoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_debitoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_debitoGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_debitoGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_debitoGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_debitoGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jComboBoxid_cuenta_contable_debitoGrupoBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_debitoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_debitoGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_debitoGrupoBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoGrupoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoGrupoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoGrupoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoGrupoBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_debitoGrupoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_debitoGrupoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoGrupoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_debitoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoGrupoBodega"));

		this.jButtonid_cuenta_contable_debitoGrupoBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoGrupoBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_debitoGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_debitoGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_debitoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_debitoGrupoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_debitoGrupoBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoGrupoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoGrupoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoGrupoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoGrupoBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_debitoGrupoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_debitoGrupoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoGrupoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_debitoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoGrupoBodegaUpdate"));


		jButtonid_cuenta_contable_debitoGrupoBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_debitoGrupoBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoGrupoBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoGrupoBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoGrupoBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_debitoGrupoBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_debitoGrupoBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoGrupoBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_debitoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoGrupoBodegaArbol"));



					
		this.jLabelid_cuenta_contable_creditoGrupoBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_creditoGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO+" : *");
		this.jLabelid_cuenta_contable_creditoGrupoBodega.setToolTipText("Cuenta C. Credito");
		this.jLabelid_cuenta_contable_creditoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_creditoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_creditoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_creditoGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_creditoGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_creditoGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jComboBoxid_cuenta_contable_creditoGrupoBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_creditoGrupoBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoGrupoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoGrupoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoGrupoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoGrupoBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_creditoGrupoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_creditoGrupoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoGrupoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_creditoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoGrupoBodega"));

		this.jButtonid_cuenta_contable_creditoGrupoBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoGrupoBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_creditoGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_creditoGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_creditoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_creditoGrupoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_creditoGrupoBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoGrupoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoGrupoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoGrupoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoGrupoBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_creditoGrupoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_creditoGrupoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoGrupoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_creditoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoGrupoBodegaUpdate"));


		jButtonid_cuenta_contable_creditoGrupoBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_creditoGrupoBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoGrupoBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoGrupoBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoGrupoBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_creditoGrupoBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_creditoGrupoBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoGrupoBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_creditoGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoGrupoBodegaArbol"));



					
		this.jLabelid_cuenta_contable_produccionGrupoBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_produccionGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLEPRODUCCION+" : *");
		this.jLabelid_cuenta_contable_produccionGrupoBodega.setToolTipText("Cuenta C. Produccion");
		this.jLabelid_cuenta_contable_produccionGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_produccionGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_produccionGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_produccionGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_produccionGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_produccionGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLEPRODUCCION);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_produccionGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jComboBoxid_cuenta_contable_produccionGrupoBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_produccionGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_produccionGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_produccionGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_produccionGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_produccionGrupoBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_produccionGrupoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_produccionGrupoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_produccionGrupoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_produccionGrupoBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_produccionGrupoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_produccionGrupoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_produccionGrupoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_produccionGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_produccionGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_produccionGrupoBodega"));

		this.jButtonid_cuenta_contable_produccionGrupoBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_produccionGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_produccionGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_produccionGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_produccionGrupoBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_produccionGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_produccionGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_produccionGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_produccionGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_produccionGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_produccionGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_produccionGrupoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_produccionGrupoBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_produccionGrupoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_produccionGrupoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_produccionGrupoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_produccionGrupoBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_produccionGrupoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_produccionGrupoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_produccionGrupoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_produccionGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_produccionGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_produccionGrupoBodegaUpdate"));


		jButtonid_cuenta_contable_produccionGrupoBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_produccionGrupoBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_produccionGrupoBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_produccionGrupoBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_produccionGrupoBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_produccionGrupoBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_produccionGrupoBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_produccionGrupoBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_produccionGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_produccionGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_produccionGrupoBodegaArbol"));



					
		this.jLabelid_cuenta_contable_bonificaGrupoBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_bonificaGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLEBONIFICA+" : *");
		this.jLabelid_cuenta_contable_bonificaGrupoBodega.setToolTipText("Cuenta C. Bonifica");
		this.jLabelid_cuenta_contable_bonificaGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_bonificaGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_bonificaGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_bonificaGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_bonificaGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_bonificaGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLEBONIFICA);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_bonificaGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jComboBoxid_cuenta_contable_bonificaGrupoBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_bonificaGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_bonificaGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_bonificaGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_bonificaGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_bonificaGrupoBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_bonificaGrupoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_bonificaGrupoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_bonificaGrupoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_bonificaGrupoBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_bonificaGrupoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_bonificaGrupoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_bonificaGrupoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_bonificaGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_bonificaGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_bonificaGrupoBodega"));

		this.jButtonid_cuenta_contable_bonificaGrupoBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_bonificaGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_bonificaGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_bonificaGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_bonificaGrupoBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_bonificaGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_bonificaGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_bonificaGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_bonificaGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_bonificaGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_bonificaGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_bonificaGrupoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_bonificaGrupoBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_bonificaGrupoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_bonificaGrupoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_bonificaGrupoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_bonificaGrupoBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_bonificaGrupoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_bonificaGrupoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_bonificaGrupoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_bonificaGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_bonificaGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_bonificaGrupoBodegaUpdate"));


		jButtonid_cuenta_contable_bonificaGrupoBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_bonificaGrupoBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_bonificaGrupoBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_bonificaGrupoBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_bonificaGrupoBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_bonificaGrupoBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_bonificaGrupoBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_bonificaGrupoBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_bonificaGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_bonificaGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_bonificaGrupoBodegaArbol"));



					
		this.jLabelid_cuenta_contable_costo_bonificaGrupoBodega = new JLabelMe();
		this.jLabelid_cuenta_contable_costo_bonificaGrupoBodega.setText(""+GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOBONIFICA+" : *");
		this.jLabelid_cuenta_contable_costo_bonificaGrupoBodega.setToolTipText("Cuenta C. Costo Bonifica");
		this.jLabelid_cuenta_contable_costo_bonificaGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costo_bonificaGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costo_bonificaGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costo_bonificaGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_costo_bonificaGrupoBodega=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_costo_bonificaGrupoBodega.setToolTipText(GrupoBodegaConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOBONIFICA);
		this.gridaBagLayoutGrupoBodega = new GridBagLayout();
		this.jPanelid_cuenta_contable_costo_bonificaGrupoBodega.setLayout(this.gridaBagLayoutGrupoBodega);


		jComboBoxid_cuenta_contable_costo_bonificaGrupoBodega= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costo_bonificaGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_bonificaGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_bonificaGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costo_bonificaGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodega= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodega.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodega.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodega.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodega.setText("Buscar");
		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodega.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodega.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_bonificaGrupoBodega,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_costo_bonificaGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_bonificaGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_bonificaGrupoBodega"));

		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_costo_bonificaGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_bonificaGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_bonificaGrupoBodegaBusqueda"));

		if(this.grupobodegaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaUpdate.setText("U");
		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_costo_bonificaGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_bonificaGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_bonificaGrupoBodegaUpdate"));


		jButtonid_cuenta_contable_costo_bonificaGrupoBodegaArbol= new JButtonMe();
		jButtonid_cuenta_contable_costo_bonificaGrupoBodegaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_bonificaGrupoBodegaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_bonificaGrupoBodegaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_bonificaGrupoBodegaArbol.setText("Arbol");
		jButtonid_cuenta_contable_costo_bonificaGrupoBodegaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_costo_bonificaGrupoBodegaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_bonificaGrupoBodegaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_costo_bonificaGrupoBodega.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_bonificaGrupoBodega.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_bonificaGrupoBodegaArbol"));



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
		//this.jInternalFrameDetalleGrupoBodega = new GrupoBodegaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Grupo Bodega DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGrupoBodega= new GridBagLayout();
		

		
		String sToolTipGrupoBodega="";
		sToolTipGrupoBodega=GrupoBodegaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGrupoBodega+="(Inventario.GrupoBodega)";
		}
		
		if(!this.grupobodegaSessionBean.getEsGuardarRelacionado()) {
			sToolTipGrupoBodega+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoGrupoBodega = new JButtonMe();
		this.jButtonModificarGrupoBodega = new JButtonMe();
        this.jButtonActualizarGrupoBodega = new JButtonMe();
        this.jButtonEliminarGrupoBodega = new JButtonMe();
        this.jButtonCancelarGrupoBodega = new JButtonMe();
        this.jButtonGuardarCambiosGrupoBodega = new JButtonMe();
		this.jButtonGuardarCambiosTablaGrupoBodega = new JButtonMe();
		this.jButtonCerrarGrupoBodega = new JButtonMe();
		
		this.jScrollPanelDatosGrupoBodega = new JScrollPane();   
        this.jScrollPanelDatosEdicionGrupoBodega = new JScrollPane();
		this.jScrollPanelDatosGeneralGrupoBodega = new JScrollPane();
				
		
		
		this.jPanelCamposGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposGrupoBodega=new JTabbedPane();
		
		
		this.jTabbedPaneCamposGrupoBodega.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Grupo Bodega";
		
		if(!this.grupobodegaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Bodegaes" + this.sPath));
		} else {
			this.jScrollPanelDatosGrupoBodega.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposGrupoBodega.setName("jPanelCamposGrupoBodega"); 

		this.jPanelCamposOcultosGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosGrupoBodega.setName("jPanelCamposOcultosGrupoBodega"); 

        this.jPanelAccionesGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGrupoBodega.setToolTipText("Acciones");
        this.jPanelAccionesGrupoBodega.setName("Acciones"); 

		this.jPanelAccionesFormularioGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioGrupoBodega.setToolTipText("Acciones");
        this.jPanelAccionesFormularioGrupoBodega.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralGrupoBodega.setName("jPanelCamposFingeneralGrupoBodega");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contableGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contableGrupoBodega.setName("jPanelCamposFincuenta_contableGrupoBodega");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contableGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoGrupoBodega.setText("Nuevo");
		this.jButtonModificarGrupoBodega.setText("Editar");
        this.jButtonActualizarGrupoBodega.setText("Actualizar");
        this.jButtonEliminarGrupoBodega.setText("Eliminar");
        this.jButtonCancelarGrupoBodega.setText("Cancelar");
        this.jButtonGuardarCambiosGrupoBodega.setText("Guardar");
		this.jButtonGuardarCambiosTablaGrupoBodega.setText("Guardar");
		this.jButtonCerrarGrupoBodega.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGrupoBodega,"nuevo_button","Nuevo",this.grupobodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarGrupoBodega,"modificar_button","Editar",this.grupobodegaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarGrupoBodega,"actualizar_button","Actualizar",this.grupobodegaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarGrupoBodega,"eliminar_button","Eliminar",this.grupobodegaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarGrupoBodega,"cancelar_button","Cancelar",this.grupobodegaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosGrupoBodega,"guardarcambios_button","Guardar",this.grupobodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGrupoBodega,"guardarcambiostabla_button","Guardar",this.grupobodegaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGrupoBodega,"cerrar_button","Salir",this.grupobodegaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoGrupoBodega.setToolTipText("Nuevo"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarGrupoBodega.setToolTipText("Editar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarGrupoBodega.setToolTipText("Actualizar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarGrupoBodega.setToolTipText("Eliminar)"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarGrupoBodega.setToolTipText("Cancelar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosGrupoBodega.setToolTipText("Guardar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaGrupoBodega.setToolTipText("Guardar"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGrupoBodega.setToolTipText("Salir"+" "+GrupoBodegaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGrupoBodega";
		inputMap = this.jButtonNuevoGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGrupoBodega.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGrupoBodega"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarGrupoBodega";
		inputMap = this.jButtonActualizarGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarGrupoBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarGrupoBodega"));
		
		//ELIMINAR
		sMapKey = "EliminarGrupoBodega";
		inputMap = this.jButtonEliminarGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarGrupoBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarGrupoBodega"));
		
		//CANCELAR	
		sMapKey = "CancelarGrupoBodega";
		inputMap = this.jButtonCancelarGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarGrupoBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarGrupoBodega"));
		
		//CERRAR		
		sMapKey = "CerrarGrupoBodega";
		inputMap = this.jButtonCerrarGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGrupoBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGrupoBodega"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGrupoBodega";
		inputMap = this.jButtonGuardarCambiosTablaGrupoBodega.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGrupoBodega.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGrupoBodega"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoGrupoBodega = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoGrupoBodega.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoGrupoBodega.setToolTipText("Nuevo GrupoBodega");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarGrupoBodega = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarGrupoBodega.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarGrupoBodega.setToolTipText("Sin Cerrar Ventana GrupoBodega");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeGrupoBodega = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeGrupoBodega.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeGrupoBodega.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesGrupoBodega = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGrupoBodega.setText("Accion");
		this.jComboBoxTiposAccionesGrupoBodega.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioGrupoBodega = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioGrupoBodega.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioGrupoBodega.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesGrupoBodega = new JLabelMe();
		
		this.jLabelAccionesGrupoBodega.setText("Acciones");		
		this.jLabelAccionesGrupoBodega.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoBodega.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoBodega.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposGrupoBodega();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysGrupoBodega();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesGrupoBodega=new JTabbedPane();
		this.jTabbedPaneRelacionesGrupoBodega.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesGrupoBodega,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesGrupoBodega.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoBodega.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoBodega.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGrupoBodega, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioGrupoBodega.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGrupoBodega.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGrupoBodega.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioGrupoBodega, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposGrupoBodega = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosGrupoBodega = new GridBagLayout();
		
		this.jPanelCamposGrupoBodega.setLayout(gridaBagLayoutCamposGrupoBodega);
		this.jPanelCamposOcultosGrupoBodega.setLayout(gridaBagLayoutCamposOcultosGrupoBodega);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralGrupoBodega= new GridBagLayout();
		this.jPanelCamposIniciogeneralGrupoBodega.setLayout(gridaBagLayoutCamposIniciogeneralGrupoBodega);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableGrupoBodega= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableGrupoBodega.setLayout(gridaBagLayoutCamposIniciocuenta_contableGrupoBodega);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidGrupoBodega.add(jLabelIdGrupoBodega, this.gridBagConstraintsGrupoBodega);



	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidGrupoBodega.add(jLabelidGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaGrupoBodega.add(jLabelid_empresaGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGrupoBodega.add(jButtonid_empresaGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 3;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGrupoBodega.add(jButtonid_empresaGrupoBodegaUpdate, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaGrupoBodega.add(jComboBoxid_empresaGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoGrupoBodega.add(jLabelcodigoGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoGrupoBodega.add(jButtoncodigoGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoGrupoBodega.add(jTextFieldcodigoGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreGrupoBodega.add(jLabelnombreGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreGrupoBodega.add(jButtonnombreGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreGrupoBodega.add(jscrollPanenombreGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucGrupoBodega.add(jLabelrucGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucGrupoBodega.add(jButtonrucGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucGrupoBodega.add(jTextFieldrucGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionGrupoBodega.add(jLabeldireccionGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionGrupoBodega.add(jButtondireccionGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionGrupoBodega.add(jscrollPanedireccionGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoGrupoBodega.add(jLabeltelefonoGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoGrupoBodega.add(jButtontelefonoGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoGrupoBodega.add(jTextFieldtelefonoGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisGrupoBodega.add(jLabelid_paisGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisGrupoBodega.add(jButtonid_paisGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 3;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisGrupoBodega.add(jButtonid_paisGrupoBodegaUpdate, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisGrupoBodega.add(jComboBoxid_paisGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadGrupoBodega.add(jLabelid_ciudadGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadGrupoBodega.add(jButtonid_ciudadGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 3;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadGrupoBodega.add(jButtonid_ciudadGrupoBodegaUpdate, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadGrupoBodega.add(jComboBoxid_ciudadGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoGrupoBodega.add(jLabelid_centro_costoGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoGrupoBodega.add(jButtonid_centro_costoGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 3;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoGrupoBodega.add(jButtonid_centro_costoGrupoBodegaUpdate, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoGrupoBodega.add(jComboBoxid_centro_costoGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoGrupoBodega.add(jLabelid_empleadoGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoGrupoBodega.add(jButtonid_empleadoGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 3;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoGrupoBodega.add(jButtonid_empleadoGrupoBodegaUpdate, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoGrupoBodega.add(jComboBoxid_empleadoGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionGrupoBodega.add(jLabeldescripcionGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionGrupoBodega.add(jButtondescripcionGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionGrupoBodega.add(jscrollPanedescripcionGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_inventarioGrupoBodega.add(jLabelid_cuenta_contable_inventarioGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inventarioGrupoBodega.add(jButtonid_cuenta_contable_inventarioGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 3;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_inventarioGrupoBodega.add(jButtonid_cuenta_contable_inventarioGrupoBodegaUpdate, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_inventarioGrupoBodega.add(jComboBoxid_cuenta_contable_inventarioGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_costoGrupoBodega.add(jLabelid_cuenta_contable_costoGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costoGrupoBodega.add(jButtonid_cuenta_contable_costoGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 3;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costoGrupoBodega.add(jButtonid_cuenta_contable_costoGrupoBodegaUpdate, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_costoGrupoBodega.add(jComboBoxid_cuenta_contable_costoGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_ventaGrupoBodega.add(jLabelid_cuenta_contable_ventaGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ventaGrupoBodega.add(jButtonid_cuenta_contable_ventaGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 3;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_ventaGrupoBodega.add(jButtonid_cuenta_contable_ventaGrupoBodegaUpdate, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_ventaGrupoBodega.add(jComboBoxid_cuenta_contable_ventaGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_descuentoGrupoBodega.add(jLabelid_cuenta_contable_descuentoGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_descuentoGrupoBodega.add(jButtonid_cuenta_contable_descuentoGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 3;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_descuentoGrupoBodega.add(jButtonid_cuenta_contable_descuentoGrupoBodegaUpdate, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_descuentoGrupoBodega.add(jComboBoxid_cuenta_contable_descuentoGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_devolucionGrupoBodega.add(jLabelid_cuenta_contable_devolucionGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_devolucionGrupoBodega.add(jButtonid_cuenta_contable_devolucionGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 3;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_devolucionGrupoBodega.add(jButtonid_cuenta_contable_devolucionGrupoBodegaUpdate, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_devolucionGrupoBodega.add(jComboBoxid_cuenta_contable_devolucionGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_debitoGrupoBodega.add(jLabelid_cuenta_contable_debitoGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoGrupoBodega.add(jButtonid_cuenta_contable_debitoGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 3;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoGrupoBodega.add(jButtonid_cuenta_contable_debitoGrupoBodegaUpdate, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_debitoGrupoBodega.add(jComboBoxid_cuenta_contable_debitoGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_creditoGrupoBodega.add(jLabelid_cuenta_contable_creditoGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoGrupoBodega.add(jButtonid_cuenta_contable_creditoGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 3;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoGrupoBodega.add(jButtonid_cuenta_contable_creditoGrupoBodegaUpdate, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_creditoGrupoBodega.add(jComboBoxid_cuenta_contable_creditoGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_produccionGrupoBodega.add(jLabelid_cuenta_contable_produccionGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_produccionGrupoBodega.add(jButtonid_cuenta_contable_produccionGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 3;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_produccionGrupoBodega.add(jButtonid_cuenta_contable_produccionGrupoBodegaUpdate, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_produccionGrupoBodega.add(jComboBoxid_cuenta_contable_produccionGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_bonificaGrupoBodega.add(jLabelid_cuenta_contable_bonificaGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_bonificaGrupoBodega.add(jButtonid_cuenta_contable_bonificaGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 3;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_bonificaGrupoBodega.add(jButtonid_cuenta_contable_bonificaGrupoBodegaUpdate, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_bonificaGrupoBodega.add(jComboBoxid_cuenta_contable_bonificaGrupoBodega, this.gridBagConstraintsGrupoBodega);


	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 0;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_costo_bonificaGrupoBodega.add(jLabelid_cuenta_contable_costo_bonificaGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 2;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costo_bonificaGrupoBodega.add(jButtonid_cuenta_contable_costo_bonificaGrupoBodegaBusqueda, this.gridBagConstraintsGrupoBodega);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		//this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = 3;
		this.gridBagConstraintsGrupoBodega.ipadx = 0;
		this.gridBagConstraintsGrupoBodega.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costo_bonificaGrupoBodega.add(jButtonid_cuenta_contable_costo_bonificaGrupoBodegaUpdate, this.gridBagConstraintsGrupoBodega);
	}

	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoBodega.gridy = 0;
	this.gridBagConstraintsGrupoBodega.gridx = 1;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_costo_bonificaGrupoBodega.add(jComboBoxid_cuenta_contable_costo_bonificaGrupoBodega, this.gridBagConstraintsGrupoBodega);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposOcultosGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposOcultosGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGrupoBodega.add(this.jPanelid_empresaGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposOcultosGrupoBodega % 1==0) {
		iXPanelCamposOcultosGrupoBodega=0;
		iYPanelCamposOcultosGrupoBodega++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciogeneralGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciogeneralGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralGrupoBodega.add(this.jPanelidGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciogeneralGrupoBodega % 1==0) {
		iXPanelCamposIniciogeneralGrupoBodega=0;
		iYPanelCamposIniciogeneralGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciogeneralGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciogeneralGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralGrupoBodega.add(this.jPanelcodigoGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciogeneralGrupoBodega % 1==0) {
		iXPanelCamposIniciogeneralGrupoBodega=0;
		iYPanelCamposIniciogeneralGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciogeneralGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciogeneralGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralGrupoBodega.add(this.jPanelnombreGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciogeneralGrupoBodega % 1==0) {
		iXPanelCamposIniciogeneralGrupoBodega=0;
		iYPanelCamposIniciogeneralGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciogeneralGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciogeneralGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralGrupoBodega.add(this.jPanelrucGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciogeneralGrupoBodega % 1==0) {
		iXPanelCamposIniciogeneralGrupoBodega=0;
		iYPanelCamposIniciogeneralGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciogeneralGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciogeneralGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralGrupoBodega.add(this.jPaneldireccionGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciogeneralGrupoBodega % 1==0) {
		iXPanelCamposIniciogeneralGrupoBodega=0;
		iYPanelCamposIniciogeneralGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciogeneralGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciogeneralGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralGrupoBodega.add(this.jPaneltelefonoGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciogeneralGrupoBodega % 1==0) {
		iXPanelCamposIniciogeneralGrupoBodega=0;
		iYPanelCamposIniciogeneralGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciogeneralGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciogeneralGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralGrupoBodega.add(this.jPanelid_paisGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciogeneralGrupoBodega % 1==0) {
		iXPanelCamposIniciogeneralGrupoBodega=0;
		iYPanelCamposIniciogeneralGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciogeneralGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciogeneralGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralGrupoBodega.add(this.jPanelid_ciudadGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciogeneralGrupoBodega % 1==0) {
		iXPanelCamposIniciogeneralGrupoBodega=0;
		iYPanelCamposIniciogeneralGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciogeneralGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciogeneralGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralGrupoBodega.add(this.jPanelid_centro_costoGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciogeneralGrupoBodega % 1==0) {
		iXPanelCamposIniciogeneralGrupoBodega=0;
		iYPanelCamposIniciogeneralGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciogeneralGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciogeneralGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralGrupoBodega.add(this.jPanelid_empleadoGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciogeneralGrupoBodega % 1==0) {
		iXPanelCamposIniciogeneralGrupoBodega=0;
		iYPanelCamposIniciogeneralGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciogeneralGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciogeneralGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralGrupoBodega.add(this.jPaneldescripcionGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciogeneralGrupoBodega % 1==0) {
		iXPanelCamposIniciogeneralGrupoBodega=0;
		iYPanelCamposIniciogeneralGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciocuenta_contableGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciocuenta_contableGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableGrupoBodega.add(this.jPanelid_cuenta_contable_inventarioGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciocuenta_contableGrupoBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableGrupoBodega=0;
		iYPanelCamposIniciocuenta_contableGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciocuenta_contableGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciocuenta_contableGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableGrupoBodega.add(this.jPanelid_cuenta_contable_costoGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciocuenta_contableGrupoBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableGrupoBodega=0;
		iYPanelCamposIniciocuenta_contableGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciocuenta_contableGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciocuenta_contableGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableGrupoBodega.add(this.jPanelid_cuenta_contable_ventaGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciocuenta_contableGrupoBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableGrupoBodega=0;
		iYPanelCamposIniciocuenta_contableGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciocuenta_contableGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciocuenta_contableGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableGrupoBodega.add(this.jPanelid_cuenta_contable_descuentoGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciocuenta_contableGrupoBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableGrupoBodega=0;
		iYPanelCamposIniciocuenta_contableGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciocuenta_contableGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciocuenta_contableGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableGrupoBodega.add(this.jPanelid_cuenta_contable_devolucionGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciocuenta_contableGrupoBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableGrupoBodega=0;
		iYPanelCamposIniciocuenta_contableGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciocuenta_contableGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciocuenta_contableGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableGrupoBodega.add(this.jPanelid_cuenta_contable_debitoGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciocuenta_contableGrupoBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableGrupoBodega=0;
		iYPanelCamposIniciocuenta_contableGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciocuenta_contableGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciocuenta_contableGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableGrupoBodega.add(this.jPanelid_cuenta_contable_creditoGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciocuenta_contableGrupoBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableGrupoBodega=0;
		iYPanelCamposIniciocuenta_contableGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciocuenta_contableGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciocuenta_contableGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableGrupoBodega.add(this.jPanelid_cuenta_contable_produccionGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciocuenta_contableGrupoBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableGrupoBodega=0;
		iYPanelCamposIniciocuenta_contableGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciocuenta_contableGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciocuenta_contableGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableGrupoBodega.add(this.jPanelid_cuenta_contable_bonificaGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciocuenta_contableGrupoBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableGrupoBodega=0;
		iYPanelCamposIniciocuenta_contableGrupoBodega++;
	}
	this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoBodega.gridy = iYPanelCamposIniciocuenta_contableGrupoBodega;
	this.gridBagConstraintsGrupoBodega.gridx = iXPanelCamposIniciocuenta_contableGrupoBodega++;
	this.gridBagConstraintsGrupoBodega.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoBodega.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableGrupoBodega.add(this.jPanelid_cuenta_contable_costo_bonificaGrupoBodega, this.gridBagConstraintsGrupoBodega);



	if(iXPanelCamposIniciocuenta_contableGrupoBodega % 1==0) {
		iXPanelCamposIniciocuenta_contableGrupoBodega=0;
		iYPanelCamposIniciocuenta_contableGrupoBodega++;
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
			
		GridBagLayout gridaBagLayoutAccionesGrupoBodega= new GridBagLayout();
		this.jPanelAccionesGrupoBodega.setLayout(gridaBagLayoutAccionesGrupoBodega);
		
		GridBagLayout gridaBagLayoutAccionesFormularioGrupoBodega= new GridBagLayout();
		this.jPanelAccionesFormularioGrupoBodega.setLayout(gridaBagLayoutAccionesFormularioGrupoBodega);
		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGrupoBodega.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGrupoBodega.add(this.jComboBoxTiposAccionesFormularioGrupoBodega, this.gridBagConstraintsGrupoBodega);

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGrupoBodega.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGrupoBodega.add(this.jCheckBoxPostAccionNuevoGrupoBodega, this.gridBagConstraintsGrupoBodega);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.grupobodegaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGrupoBodega.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGrupoBodega.add(this.jCheckBoxPostAccionSinCerrarGrupoBodega, this.gridBagConstraintsGrupoBodega);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.grupobodegaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.grupobodegaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGrupoBodega.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGrupoBodega.add(this.jCheckBoxPostAccionSinMensajeGrupoBodega, this.gridBagConstraintsGrupoBodega);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx = iPosXAccion++;
			
		this.jPanelAccionesGrupoBodega.add(this.jButtonModificarGrupoBodega, this.gridBagConstraintsGrupoBodega);							

		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoBodega.gridy = 0;
		this.gridBagConstraintsGrupoBodega.gridx =iPosXAccion++;
			
		this.jPanelAccionesGrupoBodega.add(this.jButtonEliminarGrupoBodega, this.gridBagConstraintsGrupoBodega);
		
			
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy = 0;		
		this.gridBagConstraintsGrupoBodega.gridx = iPosXAccion++;
		
		this.jPanelAccionesGrupoBodega.add(this.jButtonActualizarGrupoBodega, this.gridBagConstraintsGrupoBodega);


		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy = 0;		
		this.gridBagConstraintsGrupoBodega.gridx = iPosXAccion++;
		
		this.jPanelAccionesGrupoBodega.add(this.jButtonGuardarCambiosGrupoBodega, this.gridBagConstraintsGrupoBodega);	
		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy = 0;		
		this.gridBagConstraintsGrupoBodega.gridx =iPosXAccion++;
		
		this.jPanelAccionesGrupoBodega.add(this.jButtonCancelarGrupoBodega, this.gridBagConstraintsGrupoBodega);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGrupoBodega = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGrupoBodega);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.grupobodegaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();						
			this.gridBagConstraintsGrupoBodega.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoBodega.gridx = 0;		
			//this.gridBagConstraintsGrupoBodega.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGrupoBodega.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGrupoBodega.gridx =0;
		this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGrupoBodega.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGrupoBodega, this.gridBagConstraintsGrupoBodega);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(GrupoBodegaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleGrupoBodega = new GrupoBodegaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Grupo Bodega DATOS");
			
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
			
	        //this.setTitle("[FOR] - Grupo Bodega DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Grupo Bodega Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			GrupoBodegaModel grupobodegaModel=new GrupoBodegaModel(this);
			
			//SI USARA CLASE INTERNA
			//GrupoBodegaModel.GrupoBodegaFocusTraversalPolicy grupobodegaFocusTraversalPolicy = grupobodegaModel.new GrupoBodegaFocusTraversalPolicy(this);
			
			//grupobodegaFocusTraversalPolicy.setgrupobodegaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(grupobodegaModel);
			
			
			this.jContentPaneDetalleGrupoBodega = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleGrupoBodega = new GridBagLayout();	
			this.jContentPaneDetalleGrupoBodega.setLayout(gridaBagLayoutDetalleGrupoBodega);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGrupoBodega = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
				this.gridBagConstraintsGrupoBodega.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsGrupoBodega.gridx = 0;
					
				
				this.jContentPaneDetalleGrupoBodega.add(jTtoolBarDetalleGrupoBodega, gridBagConstraintsGrupoBodega);								
				
}
			
			this.jScrollPanelDatosEdicionGrupoBodega=   new JScrollPane(jContentPaneDetalleGrupoBodega,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGrupoBodega.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoBodega.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoBodega.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralGrupoBodega=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGrupoBodega.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoBodega.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoBodega.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposGrupoBodega.add("General",this.jPanelCamposIniciogeneralGrupoBodega);
		this.jTabbedPaneCamposGrupoBodega.add("Cuenta Contable",this.jPanelCamposIniciocuenta_contableGrupoBodega);
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
						
			this.gridBagConstraintsGrupoBodega.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsGrupoBodega.gridx = 0;
	        
			this.jContentPaneDetalleGrupoBodega.add(jTabbedPaneCamposGrupoBodega, gridBagConstraintsGrupoBodega);
			
			
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
						&& grupobodegaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameBodega(this.puedeCargarPorParteBodega,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(this.puedeCargarPorParteParametroInventarioDefecto,false,-1);
					
					if(this.grupobodegaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsGrupoBodega= new GridBagConstraints();
						this.gridBagConstraintsGrupoBodega.gridy = iGridyRelaciones++;
						this.gridBagConstraintsGrupoBodega.gridx = 0;
						this.jContentPaneDetalleGrupoBodega.add(this.jTabbedPaneRelacionesGrupoBodega, this.gridBagConstraintsGrupoBodega);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesGrupoBodega.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameBodega(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosGrupoBodega.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
					this.gridBagConstraintsGrupoBodega.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsGrupoBodega.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsGrupoBodega.gridx = 0;
					
				
					this.jContentPaneDetalleGrupoBodega.add(jPanelCamposOcultosGrupoBodega, gridBagConstraintsGrupoBodega);
				
					this.jPanelCamposOcultosGrupoBodega.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsGrupoBodega.gridx = 0;
	        this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleGrupoBodega.add(this.jPanelAccionesFormularioGrupoBodega, this.gridBagConstraintsGrupoBodega);							
			
			
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
	        this.gridBagConstraintsGrupoBodega.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsGrupoBodega.gridx = 0;
	        
			
			this.jContentPaneDetalleGrupoBodega.add(this.jPanelAccionesGrupoBodega, this.gridBagConstraintsGrupoBodega);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionGrupoBodega);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionGrupoBodega=   new JScrollPane(this.jPanelCamposGrupoBodega,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGrupoBodega.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoBodega.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoBodega.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsGrupoBodega.gridx = 0;
			this.gridBagConstraintsGrupoBodega.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsGrupoBodega.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsGrupoBodega.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionGrupoBodega, this.gridBagConstraintsGrupoBodega);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGrupoBodega.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioGrupoBodega, this.gridBagConstraintsGrupoBodega);			
			
			this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
			this.gridBagConstraintsGrupoBodega.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGrupoBodega.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesGrupoBodega, this.gridBagConstraintsGrupoBodega);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoBodega.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGrupoBodega, this.gridBagConstraintsGrupoBodega);
			
			
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoBodega.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGrupoBodega, this.gridBagConstraintsGrupoBodega);
		
			
		this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
		this.gridBagConstraintsGrupoBodega.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGrupoBodega.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGrupoBodega, this.gridBagConstraintsGrupoBodega);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralGrupoBodega;//jContentPane;
		
		return jScrollPanelDatosEdicionGrupoBodega;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameBodega(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.bodegaSessionBean=new BodegaSessionBean();
		this.bodegaSessionBean.setConGuardarRelaciones(false);
		this.bodegaSessionBean.setEsGuardarRelacionado(true);

		this.bodegaBeanSwingJInternalFrame=null;//new BodegaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.bodegaBeanSwingJInternalFramePopup=new BodegaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.bodegaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.bodegaSessionBean.getEsGuardarRelacionado()) {

				BodegaJInternalFrame.STIPO_TAMANIO_GENERAL=GrupoBodegaJInternalFrame.STIPO_TAMANIO_GENERAL;
				BodegaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=GrupoBodegaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.bodegaSessionBean.setEsGuardarRelacionado(true);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.bodegaBeanSwingJInternalFrame.setbodegaSessionBean(this.bodegaSessionBean);

				//this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
				//this.gridBagConstraintsGrupoBodega.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsGrupoBodega.gridx = 0;
				//this.jContentPaneDetalleGrupoBodega.add(this.bodegaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsGrupoBodega);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesGrupoBodega.add("Bodegas",this.bodegaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesGrupoBodega.setComponentAt(iIndexTab,this.bodegaBeanSwingJInternalFrame.getContentPane());
				}

				//BodegaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.bodegaSessionBean.setEsGuardarRelacionado(false);
				this.bodegaBeanSwingJInternalFrame=null;//new BodegaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.bodegaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteBodega) {
					this.jTabbedPaneRelacionesGrupoBodega.add("Bodegas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		this.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
		this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametroinventariodefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=GrupoBodegaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=GrupoBodegaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroinventariodefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroinventariodefectoBeanSwingJInternalFrame.setparametroinventariodefectoSessionBean(this.parametroinventariodefectoSessionBean);

				//this.gridBagConstraintsGrupoBodega = new GridBagConstraints();
				//this.gridBagConstraintsGrupoBodega.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsGrupoBodega.gridx = 0;
				//this.jContentPaneDetalleGrupoBodega.add(this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsGrupoBodega);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesGrupoBodega.add("Parametro Inventario Defectos",this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesGrupoBodega.setComponentAt(iIndexTab,this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroInventarioDefecto) {
					this.jTabbedPaneRelacionesGrupoBodega.add("Parametro Inventario Defectos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarBodegaBeanSwingJInternalFrame(List<GrupoBodega> grupobodegas,GrupoBodega grupobodega,BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.grupobodegaLogic.getConnexion());

					bodegaBeanSwingJInternalFrame.setgrupobodegasForeignKey(grupobodegas);
					bodegaBeanSwingJInternalFrame.setgrupobodegaForeignKey(grupobodega);
					bodegaBeanSwingJInternalFrame.bodegaSessionBean.setisBusquedaDesdeForeignKeySesionGrupoBodega(true);
					bodegaBeanSwingJInternalFrame.bodegaSessionBean.setlidGrupoBodegaActual(grupobodega.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					bodegaBeanSwingJInternalFrame.cargarCombosForeignKeyBodega(bodegaBeanSwingJInternalFrame.isCargarCombosDependencia);
					bodegaBeanSwingJInternalFrame.setVisibilidadBusquedasParaGrupoBodega(true);
					bodegaBeanSwingJInternalFrame.setid_grupo_bodegaFK_IdGrupoBodega(grupobodega.getId());

					if(!this.conCargarFormDetalle) {
						bodegaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					bodegaBeanSwingJInternalFrame.setSelectedItemCombosFrameGrupoBodegaForeignKey(grupobodega,1,false,true,true);
					bodegaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					bodegaBeanSwingJInternalFrame.procesarBusqueda("FK_IdGrupoBodega");
					bodegaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdGrupoBodega");
					bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega(true);
					bodegaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesBodega("n",bodegaBeanSwingJInternalFrame.isGuardarCambiosEnLote, bodegaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					bodegaBeanSwingJInternalFrame.setAutoscrolls(true);
					bodegaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						bodegaBeanSwingJInternalFrame.actualizarEstadoPanelsBodega("relacionado");
					} else {
						bodegaBeanSwingJInternalFrame.actualizarEstadoPanelsBodega("no_relacionado");
					}

					bodegaBeanSwingJInternalFrame.getjButtonRecargarInformacionBodega().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParametroInventarioDefectoBeanSwingJInternalFrame(List<GrupoBodega> grupobodegas,GrupoBodega grupobodega,ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroinventariodefectoBeanSwingJInternalFrame.getParametroInventarioDefectoLogic().setConnexion(this.grupobodegaLogic.getConnexion());

					parametroinventariodefectoBeanSwingJInternalFrame.setgrupobodegasForeignKey(grupobodegas);
					parametroinventariodefectoBeanSwingJInternalFrame.setgrupobodegaForeignKey(grupobodega);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionGrupoBodega(true);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setlidGrupoBodegaActual(grupobodega.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroinventariodefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroInventarioDefecto(parametroinventariodefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaGrupoBodega(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setid_grupo_bodegaFK_IdGrupoBodega(grupobodega.getId());

					if(!this.conCargarFormDetalle) {
						parametroinventariodefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroinventariodefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameGrupoBodegaForeignKey(grupobodega,1,false,true,true);
					parametroinventariodefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroinventariodefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdGrupoBodega");
					parametroinventariodefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdGrupoBodega");
					parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroInventarioDefecto("n",parametroinventariodefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametroinventariodefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametroinventariodefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("relacionado");
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");
					}

					parametroinventariodefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroInventarioDefecto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
