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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.PedidoExporConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class PedidoExporDetalleFormJInternalFrame extends PedidoExporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePedidoExpor;
	
	protected JMenuBar jmenuBarDetallePedidoExpor;
	
	protected JMenu jmenuDetallePedidoExpor;
	protected JMenu jmenuDetalleArchivoPedidoExpor;
	protected JMenu jmenuDetalleAccionesPedidoExpor;
	protected JMenu jmenuDetalleDatosPedidoExpor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedidoExpor;	
	protected GridBagConstraints gridBagConstraintsPedidoExpor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PedidoExporBeanSwingJInternalFrameAdditional jInternalFrameDetallePedidoExpor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subcliente="";

	protected ConsignatarioBeanSwingJInternalFrame consignatarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_consignatario="";

	protected ConsultorBeanSwingJInternalFrame consultorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_consultor="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidoexporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidoexpor="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected ResponsableBeanSwingJInternalFrame responsableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_responsable="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";
	
	public PedidoExporSessionBean pedidoexporSessionBean;
	
	

	public DetallePedidoExporBeanSwingJInternalFrame detallepedidoexporBeanSwingJInternalFrame=null;
	public DetallePedidoExporBeanSwingJInternalFrame detallepedidoexporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetallePedidoExpor=false;
	public DetallePedidoExporSessionBean detallepedidoexporSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public PaisSessionBean paisSessionBean;
	public TransporteSessionBean transporteSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public SubClienteSessionBean subclienteSessionBean;
	public ConsignatarioSessionBean consignatarioSessionBean;
	public ConsultorSessionBean consultorSessionBean;
	public EstadoPedidoSessionBean estadopedidoexporSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public ResponsableSessionBean responsableSessionBean;
	public TransportistaSessionBean transportistaSessionBean;	
	
	public PedidoExporLogic pedidoexporLogic;
	
	public JScrollPane jScrollPanelDatosPedidoExpor;
	public JScrollPane jScrollPanelDatosEdicionPedidoExpor;
	public JScrollPane jScrollPanelDatosGeneralPedidoExpor;
	
	protected JPanel jPanelCamposPedidoExpor;    
	protected JPanel jPanelCamposOcultosPedidoExpor;    	
	protected JPanel jPanelAccionesPedidoExpor;
	protected JPanel jPanelAccionesFormularioPedidoExpor;
    
	
	
	protected Integer iXPanelCamposPedidoExpor=0;
	protected Integer iYPanelCamposPedidoExpor=0;
	
	protected Integer iXPanelCamposOcultosPedidoExpor=0;
	protected Integer iYPanelCamposOcultosPedidoExpor=0;
	
	

	protected JPanel jPanelCamposFintotalPedidoExpor;
	protected Integer iXPanelCamposFintotalPedidoExpor=0;
	protected Integer iYPanelCamposFintotalPedidoExpor=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPedidoExpor;
	public JButton jButtonModificarPedidoExpor;
	public JButton jButtonActualizarPedidoExpor;
    public JButton jButtonEliminarPedidoExpor;
	public JButton jButtonCancelarPedidoExpor;
    public JButton jButtonGuardarCambiosPedidoExpor;
	public JButton jButtonGuardarCambiosTablaPedidoExpor;
	protected JButton jButtonCerrarPedidoExpor;
	
	
	protected JButton jButtonProcesarInformacionPedidoExpor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPedidoExpor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPedidoExpor;
	protected JCheckBox jCheckBoxPostAccionSinMensajePedidoExpor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedidoExpor;
	protected JButton jButtonModificarToolBarPedidoExpor;
	protected JButton jButtonActualizarToolBarPedidoExpor;
    protected JButton jButtonEliminarToolBarPedidoExpor;
	protected JButton jButtonCancelarToolBarPedidoExpor;
    protected JButton jButtonGuardarCambiosToolBarPedidoExpor;
	protected JButton jButtonGuardarCambiosTablaToolBarPedidoExpor;
	protected JButton jButtonMostrarOcultarTablaToolBarPedidoExpor;
	protected JButton jButtonCerrarToolBarPedidoExpor;
	
	protected JButton jButtonProcesarInformacionToolBarPedidoExpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedidoExpor;
	protected JMenuItem jMenuItemModificarPedidoExpor;
	protected JMenuItem jMenuItemActualizarPedidoExpor;
    protected JMenuItem jMenuItemEliminarPedidoExpor;
	protected JMenuItem jMenuItemCancelarPedidoExpor;
    protected JMenuItem jMenuItemGuardarCambiosPedidoExpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedidoExpor;
	protected JMenuItem jMenuItemCerrarPedidoExpor;
	protected JMenuItem jMenuItemDetalleCerrarPedidoExpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedidoExpor;
	
	protected JMenuItem jMenuItemProcesarInformacionPedidoExpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedidoExpor;
	protected JMenuItem jMenuItemMostrarOcultarPedidoExpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedidoExpor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedidoExpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedidoExpor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPedidoExpor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPedidoExpor;
	public JLabel jLabelIdPedidoExpor;
	public JLabel jLabelidPedidoExpor;
	public JButton jButtonidPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelnumeroPedidoExpor;
	public JLabel jLabelnumeroPedidoExpor;
	public JTextField jTextFieldnumeroPedidoExpor;
	public JButton jButtonnumeroPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelnumero_preimpresoPedidoExpor;
	public JLabel jLabelnumero_preimpresoPedidoExpor;
	public JTextField jTextFieldnumero_preimpresoPedidoExpor;
	public JButton jButtonnumero_preimpresoPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionPedidoExpor;
	public JLabel jLabelfecha_emisionPedidoExpor;
	//public JFormattedTextField jDateChooserfecha_emisionPedidoExpor;

	public JDateChooser jDateChooserfecha_emisionPedidoExpor;
	public JButton jButtonfecha_emisionPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoPedidoExpor;
	public JLabel jLabelfecha_vencimientoPedidoExpor;
	//public JFormattedTextField jDateChooserfecha_vencimientoPedidoExpor;

	public JDateChooser jDateChooserfecha_vencimientoPedidoExpor;
	public JButton jButtonfecha_vencimientoPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelcotizacionPedidoExpor;
	public JLabel jLabelcotizacionPedidoExpor;
	public JTextField jTextFieldcotizacionPedidoExpor;
	public JButton jButtoncotizacionPedidoExporBusqueda= new JButtonMe();

	public JPanel jPaneldireccionPedidoExpor;
	public JLabel jLabeldireccionPedidoExpor;
	public JTextArea jTextAreadireccionPedidoExpor;
	public JScrollPane jscrollPanedireccionPedidoExpor;
	public JButton jButtondireccionPedidoExporBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoPedidoExpor;
	public JLabel jLabeltelefonoPedidoExpor;
	public JTextField jTextFieldtelefonoPedidoExpor;
	public JButton jButtontelefonoPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelrucPedidoExpor;
	public JLabel jLabelrucPedidoExpor;
	public JTextField jTextFieldrucPedidoExpor;
	public JButton jButtonrucPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanellugar_entregaPedidoExpor;
	public JLabel jLabellugar_entregaPedidoExpor;
	public JTextField jTextFieldlugar_entregaPedidoExpor;
	public JButton jButtonlugar_entregaPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelembarquePedidoExpor;
	public JLabel jLabelembarquePedidoExpor;
	public JTextArea jTextAreaembarquePedidoExpor;
	public JScrollPane jscrollPaneembarquePedidoExpor;
	public JButton jButtonembarquePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelnegociacionPedidoExpor;
	public JLabel jLabelnegociacionPedidoExpor;
	public JTextArea jTextAreanegociacionPedidoExpor;
	public JScrollPane jscrollPanenegociacionPedidoExpor;
	public JButton jButtonnegociacionPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelforma_pagoPedidoExpor;
	public JLabel jLabelforma_pagoPedidoExpor;
	public JTextArea jTextAreaforma_pagoPedidoExpor;
	public JScrollPane jscrollPaneforma_pagoPedidoExpor;
	public JButton jButtonforma_pagoPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelordenPedidoExpor;
	public JLabel jLabelordenPedidoExpor;
	public JTextField jTextFieldordenPedidoExpor;
	public JButton jButtonordenPedidoExporBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPedidoExpor;
	public JLabel jLabeldescripcionPedidoExpor;
	public JTextArea jTextAreadescripcionPedidoExpor;
	public JScrollPane jscrollPanedescripcionPedidoExpor;
	public JButton jButtondescripcionPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelmontoPedidoExpor;
	public JLabel jLabelmontoPedidoExpor;
	public JTextField jTextFieldmontoPedidoExpor;
	public JButton jButtonmontoPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelsaldoPedidoExpor;
	public JLabel jLabelsaldoPedidoExpor;
	public JTextField jTextFieldsaldoPedidoExpor;
	public JButton jButtonsaldoPedidoExporBusqueda= new JButtonMe();

	public JPanel jPaneldisponiblePedidoExpor;
	public JLabel jLabeldisponiblePedidoExpor;
	public JTextField jTextFielddisponiblePedidoExpor;
	public JButton jButtondisponiblePedidoExporBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_porcentajePedidoExpor;
	public JLabel jLabeldescuento_porcentajePedidoExpor;
	public JTextField jTextFielddescuento_porcentajePedidoExpor;
	public JButton jButtondescuento_porcentajePedidoExporBusqueda= new JButtonMe();

	public JPanel jPaneltotal_con_ivaPedidoExpor;
	public JLabel jLabeltotal_con_ivaPedidoExpor;
	public JTextField jTextFieldtotal_con_ivaPedidoExpor;
	public JButton jButtontotal_con_ivaPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelsumanPedidoExpor;
	public JLabel jLabelsumanPedidoExpor;
	public JTextField jTextFieldsumanPedidoExpor;
	public JButton jButtonsumanPedidoExporBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorPedidoExpor;
	public JLabel jLabeldescuento_valorPedidoExpor;
	public JTextField jTextFielddescuento_valorPedidoExpor;
	public JButton jButtondescuento_valorPedidoExporBusqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaPedidoExpor;
	public JLabel jLabeltotal_sin_ivaPedidoExpor;
	public JTextField jTextFieldtotal_sin_ivaPedidoExpor;
	public JButton jButtontotal_sin_ivaPedidoExporBusqueda= new JButtonMe();

	public JPanel jPaneltotal_descuentoPedidoExpor;
	public JLabel jLabeltotal_descuentoPedidoExpor;
	public JTextField jTextFieldtotal_descuentoPedidoExpor;
	public JButton jButtontotal_descuentoPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelfletePedidoExpor;
	public JLabel jLabelfletePedidoExpor;
	public JTextField jTextFieldfletePedidoExpor;
	public JButton jButtonfletePedidoExporBusqueda= new JButtonMe();

	public JPanel jPaneltotalPedidoExpor;
	public JLabel jLabeltotalPedidoExpor;
	public JTextField jTextFieldtotalPedidoExpor;
	public JButton jButtontotalPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelsubtotalPedidoExpor;
	public JLabel jLabelsubtotalPedidoExpor;
	public JTextField jTextFieldsubtotalPedidoExpor;
	public JButton jButtonsubtotalPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelsegurosPedidoExpor;
	public JLabel jLabelsegurosPedidoExpor;
	public JTextField jTextFieldsegurosPedidoExpor;
	public JButton jButtonsegurosPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelivaPedidoExpor;
	public JLabel jLabelivaPedidoExpor;
	public JTextField jTextFieldivaPedidoExpor;
	public JButton jButtonivaPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelfinanciamientoPedidoExpor;
	public JLabel jLabelfinanciamientoPedidoExpor;
	public JTextField jTextFieldfinanciamientoPedidoExpor;
	public JButton jButtonfinanciamientoPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelmonto_retencionPedidoExpor;
	public JLabel jLabelmonto_retencionPedidoExpor;
	public JTextField jTextFieldmonto_retencionPedidoExpor;
	public JButton jButtonmonto_retencionPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelotroPedidoExpor;
	public JLabel jLabelotroPedidoExpor;
	public JTextField jTextFieldotroPedidoExpor;
	public JButton jButtonotroPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelicePedidoExpor;
	public JLabel jLabelicePedidoExpor;
	public JTextField jTextFieldicePedidoExpor;
	public JButton jButtonicePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelfechaPedidoExpor;
	public JLabel jLabelfechaPedidoExpor;
	//public JFormattedTextField jDateChooserfechaPedidoExpor;

	public JDateChooser jDateChooserfechaPedidoExpor;
	public JButton jButtonfechaPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelfecha_servidorPedidoExpor;
	public JLabel jLabelfecha_servidorPedidoExpor;
	//public JFormattedTextField jDateChooserfecha_servidorPedidoExpor;

	public JDateChooser jDateChooserfecha_servidorPedidoExpor;
	public JButton jButtonfecha_servidorPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelnumero_fuePedidoExpor;
	public JLabel jLabelnumero_fuePedidoExpor;
	public JTextField jTextFieldnumero_fuePedidoExpor;
	public JButton jButtonnumero_fuePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelhora_inicioPedidoExpor;
	public JLabel jLabelhora_inicioPedidoExpor;
	public JSpinner jSpinnerhora_inicioPedidoExpor= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_inicioPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelhora_finPedidoExpor;
	public JLabel jLabelhora_finPedidoExpor;
	public JSpinner jSpinnerhora_finPedidoExpor= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_finPedidoExporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPedidoExpor;
	public JLabel jLabelid_empresaPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPedidoExpor;
	public JButton jButtonid_empresaPedidoExpor= new JButtonMe();
	public JButton jButtonid_empresaPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_empresaPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPedidoExpor;
	public JLabel jLabelid_sucursalPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPedidoExpor;
	public JButton jButtonid_sucursalPedidoExpor= new JButtonMe();
	public JButton jButtonid_sucursalPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPedidoExpor;
	public JLabel jLabelid_ejercicioPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPedidoExpor;
	public JButton jButtonid_ejercicioPedidoExpor= new JButtonMe();
	public JButton jButtonid_ejercicioPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoPedidoExpor;
	public JLabel jLabelid_periodoPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoPedidoExpor;
	public JButton jButtonid_periodoPedidoExpor= new JButtonMe();
	public JButton jButtonid_periodoPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_periodoPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_anioPedidoExpor;
	public JLabel jLabelid_anioPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioPedidoExpor;
	public JButton jButtonid_anioPedidoExpor= new JButtonMe();
	public JButton jButtonid_anioPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_anioPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_mesPedidoExpor;
	public JLabel jLabelid_mesPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesPedidoExpor;
	public JButton jButtonid_mesPedidoExpor= new JButtonMe();
	public JButton jButtonid_mesPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_mesPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioPedidoExpor;
	public JLabel jLabelid_usuarioPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioPedidoExpor;
	public JButton jButtonid_usuarioPedidoExpor= new JButtonMe();
	public JButton jButtonid_usuarioPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_usuarioPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaPedidoExpor;
	public JLabel jLabelid_monedaPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaPedidoExpor;
	public JButton jButtonid_monedaPedidoExpor= new JButtonMe();
	public JButton jButtonid_monedaPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_monedaPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoPedidoExpor;
	public JLabel jLabelid_empleadoPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoPedidoExpor;
	public JButton jButtonid_empleadoPedidoExpor= new JButtonMe();
	public JButton jButtonid_empleadoPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_empleadoPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioPedidoExpor;
	public JLabel jLabelid_tipo_precioPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioPedidoExpor;
	public JButton jButtonid_tipo_precioPedidoExpor= new JButtonMe();
	public JButton jButtonid_tipo_precioPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoPedidoExpor;
	public JLabel jLabelid_formatoPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoPedidoExpor;
	public JButton jButtonid_formatoPedidoExpor= new JButtonMe();
	public JButton jButtonid_formatoPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_formatoPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_clientePedidoExpor;
	public JLabel jLabelid_clientePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clientePedidoExpor;
	public JButton jButtonid_clientePedidoExpor= new JButtonMe();
	public JButton jButtonid_clientePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_clientePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_paisPedidoExpor;
	public JLabel jLabelid_paisPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisPedidoExpor;
	public JButton jButtonid_paisPedidoExpor= new JButtonMe();
	public JButton jButtonid_paisPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_paisPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_transportePedidoExpor;
	public JLabel jLabelid_transportePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportePedidoExpor;
	public JButton jButtonid_transportePedidoExpor= new JButtonMe();
	public JButton jButtonid_transportePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_transportePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorPedidoExpor;
	public JLabel jLabelid_vendedorPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorPedidoExpor;
	public JButton jButtonid_vendedorPedidoExpor= new JButtonMe();
	public JButton jButtonid_vendedorPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_vendedorPedidoExporBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorPedidoExporArbol= new JButtonMe();

	public JPanel jPanelid_sub_clientePedidoExpor;
	public JLabel jLabelid_sub_clientePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_clientePedidoExpor;
	public JButton jButtonid_sub_clientePedidoExpor= new JButtonMe();
	public JButton jButtonid_sub_clientePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_sub_clientePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_consignatarioPedidoExpor;
	public JLabel jLabelid_consignatarioPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_consignatarioPedidoExpor;
	public JButton jButtonid_consignatarioPedidoExpor= new JButtonMe();
	public JButton jButtonid_consignatarioPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_consignatarioPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_consultorPedidoExpor;
	public JLabel jLabelid_consultorPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_consultorPedidoExpor;
	public JButton jButtonid_consultorPedidoExpor= new JButtonMe();
	public JButton jButtonid_consultorPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_consultorPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_pedidoPedidoExpor;
	public JLabel jLabelid_estado_pedidoPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedidoPedidoExpor;
	public JButton jButtonid_estado_pedidoPedidoExpor= new JButtonMe();
	public JButton jButtonid_estado_pedidoPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedidoPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cambioPedidoExpor;
	public JLabel jLabelid_tipo_cambioPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioPedidoExpor;
	public JButton jButtonid_tipo_cambioPedidoExpor= new JButtonMe();
	public JButton jButtonid_tipo_cambioPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioPedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoPedidoExpor;
	public JLabel jLabelid_centro_costoPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoPedidoExpor;
	public JButton jButtonid_centro_costoPedidoExpor= new JButtonMe();
	public JButton jButtonid_centro_costoPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoPedidoExporBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoPedidoExporArbol= new JButtonMe();

	public JPanel jPanelid_responsablePedidoExpor;
	public JLabel jLabelid_responsablePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_responsablePedidoExpor;
	public JButton jButtonid_responsablePedidoExpor= new JButtonMe();
	public JButton jButtonid_responsablePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_responsablePedidoExporBusqueda= new JButtonMe();

	public JPanel jPanelid_transportistaPedidoExpor;
	public JLabel jLabelid_transportistaPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaPedidoExpor;
	public JButton jButtonid_transportistaPedidoExpor= new JButtonMe();
	public JButton jButtonid_transportistaPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_transportistaPedidoExporBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPedidoExpor;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*3);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1480;//(screenSize.width-screenSize.width/2)+(250*3);
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PedidoExporDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPedidoExpor=new JPanel();
				this.jPanelAccionesFormularioPedidoExpor=new JPanel();
				this.jmenuBarDetallePedidoExpor=new JMenuBar();
				this.jTtoolBarDetallePedidoExpor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoExporDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PedidoExporDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoExporDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoExporDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoExporDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	public JButton getjButtonActualizarToolBarPedidoExpor() {
		return this.jButtonActualizarToolBarPedidoExpor;
	}
	
	public JButton getjButtonEliminarToolBarPedidoExpor() {
		return this.jButtonEliminarToolBarPedidoExpor;
	}
	
	public JButton getjButtonCancelarToolBarPedidoExpor() {
		return this.jButtonCancelarToolBarPedidoExpor;
	}		
	
	public JButton getjButtonProcesarInformacionPedidoExpor() {
		return this.jButtonProcesarInformacionPedidoExpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedidoExpor)	{
		this.jButtonProcesarInformacionPedidoExpor = jButtonProcesarInformacionPedidoExpor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedidoExpor() {
		return this.jComboBoxTiposAccionesPedidoExpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedidoExpor(
			JComboBox jComboBoxTiposRelacionesPedidoExpor) {
		this.jComboBoxTiposRelacionesPedidoExpor = jComboBoxTiposRelacionesPedidoExpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedidoExpor(
			JComboBox jComboBoxTiposAccionesPedidoExpor) {
		this.jComboBoxTiposAccionesPedidoExpor = jComboBoxTiposAccionesPedidoExpor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPedidoExpor() {
		return this.jComboBoxTiposAccionesFormularioPedidoExpor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPedidoExpor(
			JComboBox jComboBoxTiposAccionesFormularioPedidoExpor) {
		this.jComboBoxTiposAccionesFormularioPedidoExpor = jComboBoxTiposAccionesFormularioPedidoExpor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.pedidoexporSessionBean=new PedidoExporSessionBean();
		
		this.pedidoexporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidoexporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidoexporSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detallepedidoexporSessionBean=new DetallePedidoExporSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidoExporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedido Exportacion MANTENIMIENTO"));
		
		
		if(iWidth > 4350) {
			iWidth=4350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.pedidoexporSessionBean.getEsGuardarRelacionado()) {
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
	
		PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePedidoExpor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPedidoExpor=new JButtonMe();
				this.jButtonModificarToolBarPedidoExpor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPedidoExpor,this.jTtoolBarDetallePedidoExpor,
							"actualizar","actualizar","Actualizar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPedidoExpor,this.jTtoolBarDetallePedidoExpor,
							"eliminar","eliminar","Eliminar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPedidoExpor,this.jTtoolBarDetallePedidoExpor,
							"cancelar","cancelar","Cancelar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPedidoExpor,this.jTtoolBarDetallePedidoExpor,
							"guardarcambios","guardarcambios","Guardar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePedidoExpor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePedidoExpor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPedidoExpor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPedidoExpor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPedidoExpor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedidoExpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedidoExpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedidoExpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPedidoExpor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPedidoExpor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPedidoExpor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPedidoExpor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPedidoExpor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPedidoExpor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPedidoExpor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPedidoExpor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPedidoExpor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPedidoExpor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPedidoExpor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPedidoExpor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPedidoExpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedidoExpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedidoExpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedidoExpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedidoExpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedidoExpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPedidoExpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPedidoExpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPedidoExpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedidoExpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedidoExpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedidoExpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedidoExpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedidoExpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedidoExpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPedidoExpor.add(this.jMenuItemDetalleCerrarPedidoExpor);
		
		this.jmenuDetalleAccionesPedidoExpor.add(this.jMenuItemActualizarPedidoExpor);
		this.jmenuDetalleAccionesPedidoExpor.add(this.jMenuItemEliminarPedidoExpor);
		this.jmenuDetalleAccionesPedidoExpor.add(this.jMenuItemCancelarPedidoExpor);		
		
		//this.jmenuDetalleDatosPedidoExpor.add(this.jMenuItemDetalleAbrirOrderByPedidoExpor);				
		this.jmenuDetalleDatosPedidoExpor.add(this.jMenuItemDetalleMostarOcultarPedidoExpor);				
				
		//this.jmenuDetalleAccionesPedidoExpor.add(this.jMenuItemGuardarCambiosPedidoExpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePedidoExpor.add(this.jmenuDetalleArchivoPedidoExpor);		
		this.jmenuBarDetallePedidoExpor.add(this.jmenuDetalleAccionesPedidoExpor);		
		this.jmenuBarDetallePedidoExpor.add(this.jmenuDetalleDatosPedidoExpor);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePedidoExpor.add(this.jmenuDetallePedidoExpor);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	public void inicializarElementosCamposPedidoExpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPedidoExpor = new JLabelMe();
		jLabelIdPedidoExpor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPedidoExpor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPedidoExpor= new GridBagLayout();

		this.jPanelidPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);

		jLabelidPedidoExpor = new JLabel();
		jLabelidPedidoExpor.setText("Id");

		jLabelidPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumeroPedidoExpor = new JLabelMe();
		this.jLabelnumeroPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroPedidoExpor.setToolTipText("Numero");
		this.jLabelnumeroPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelnumeroPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldnumeroPedidoExpor= new JTextFieldMe();

		jTextFieldnumeroPedidoExpor.setEnabled(false);
		jTextFieldnumeroPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroPedidoExporBusqueda= new JButtonMe();
		this.jButtonnumeroPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroPedidoExporBusqueda.setText("U");
		this.jButtonnumeroPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelnumero_preimpresoPedidoExpor = new JLabelMe();
		this.jLabelnumero_preimpresoPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_NUMEROAUTORIZACION+" :");
		this.jLabelnumero_preimpresoPedidoExpor.setToolTipText("Nro Preimpreso");
		this.jLabelnumero_preimpresoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_preimpresoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_preimpresoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_preimpresoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_preimpresoPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_preimpresoPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelnumero_preimpresoPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldnumero_preimpresoPedidoExpor= new JTextFieldMe();

		jTextFieldnumero_preimpresoPedidoExpor.setEnabled(false);
		jTextFieldnumero_preimpresoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_preimpresoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_preimpresoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_preimpresoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_preimpresoPedidoExporBusqueda= new JButtonMe();
		this.jButtonnumero_preimpresoPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_preimpresoPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_preimpresoPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_preimpresoPedidoExporBusqueda.setText("U");
		this.jButtonnumero_preimpresoPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_preimpresoPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_preimpresoPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_preimpresoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_preimpresoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_preimpresoPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_preimpresoPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionPedidoExpor = new JLabelMe();
		this.jLabelfecha_emisionPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionPedidoExpor.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelfecha_emisionPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		//jFormattedTextFieldfecha_emisionPedidoExpor= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionPedidoExpor= new JDateChooser();
		jDateChooserfecha_emisionPedidoExpor.setEnabled(false);
		jDateChooserfecha_emisionPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionPedidoExpor.setDate(new Date());
		jDateChooserfecha_emisionPedidoExpor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionPedidoExpor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionPedidoExporBusqueda= new JButtonMe();
		this.jButtonfecha_emisionPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionPedidoExporBusqueda.setText("U");
		this.jButtonfecha_emisionPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoPedidoExpor = new JLabelMe();
		this.jLabelfecha_vencimientoPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoPedidoExpor.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelfecha_vencimientoPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		//jFormattedTextFieldfecha_vencimientoPedidoExpor= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoPedidoExpor= new JDateChooser();
		jDateChooserfecha_vencimientoPedidoExpor.setEnabled(false);
		jDateChooserfecha_vencimientoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoPedidoExpor.setDate(new Date());
		jDateChooserfecha_vencimientoPedidoExpor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoPedidoExpor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoPedidoExporBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoPedidoExporBusqueda.setText("U");
		this.jButtonfecha_vencimientoPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelcotizacionPedidoExpor = new JLabelMe();
		this.jLabelcotizacionPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_COTIZACION+" : *");
		this.jLabelcotizacionPedidoExpor.setToolTipText("Cotizacion");
		this.jLabelcotizacionPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcotizacionPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcotizacionPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcotizacionPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_COTIZACION);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelcotizacionPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldcotizacionPedidoExpor= new JTextFieldMe();
		jTextFieldcotizacionPedidoExpor.setEnabled(false);
		jTextFieldcotizacionPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcotizacionPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcotizacionPedidoExpor.setText("0.0");

		this.jButtoncotizacionPedidoExporBusqueda= new JButtonMe();
		this.jButtoncotizacionPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncotizacionPedidoExporBusqueda.setText("U");
		this.jButtoncotizacionPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncotizacionPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncotizacionPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcotizacionPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcotizacionPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cotizacionPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncotizacionPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabeldireccionPedidoExpor = new JLabelMe();
		this.jLabeldireccionPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_DIRECCION+" :");
		this.jLabeldireccionPedidoExpor.setToolTipText("Direccion");
		this.jLabeldireccionPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPaneldireccionPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextAreadireccionPedidoExpor= new JTextAreaMe();
		jTextAreadireccionPedidoExpor.setEnabled(false);
		jTextAreadireccionPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionPedidoExpor.setLineWrap(true);
		jTextAreadireccionPedidoExpor.setWrapStyleWord(true);
		jTextAreadireccionPedidoExpor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionPedidoExpor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionPedidoExpor = new JScrollPane(jTextAreadireccionPedidoExpor);
		jscrollPanedireccionPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccionPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccionPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondireccionPedidoExporBusqueda= new JButtonMe();
		this.jButtondireccionPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionPedidoExporBusqueda.setText("U");
		this.jButtondireccionPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoPedidoExpor = new JLabelMe();
		this.jLabeltelefonoPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_TELEFONO+" :");
		this.jLabeltelefonoPedidoExpor.setToolTipText("Telefono");
		this.jLabeltelefonoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPaneltelefonoPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldtelefonoPedidoExpor= new JTextFieldMe();

		jTextFieldtelefonoPedidoExpor.setEnabled(false);
		jTextFieldtelefonoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoPedidoExporBusqueda= new JButtonMe();
		this.jButtontelefonoPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoPedidoExporBusqueda.setText("U");
		this.jButtontelefonoPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelrucPedidoExpor = new JLabelMe();
		this.jLabelrucPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_RUC+" :");
		this.jLabelrucPedidoExpor.setToolTipText("Ruc");
		this.jLabelrucPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelrucPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldrucPedidoExpor= new JTextFieldMe();

		jTextFieldrucPedidoExpor.setEnabled(false);
		jTextFieldrucPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucPedidoExporBusqueda= new JButtonMe();
		this.jButtonrucPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucPedidoExporBusqueda.setText("U");
		this.jButtonrucPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabellugar_entregaPedidoExpor = new JLabelMe();
		this.jLabellugar_entregaPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_LUGARENTREGA+" :");
		this.jLabellugar_entregaPedidoExpor.setToolTipText("Lugar Entrega");
		this.jLabellugar_entregaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellugar_entregaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellugar_entregaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellugar_entregaPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellugar_entregaPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellugar_entregaPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_LUGARENTREGA);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanellugar_entregaPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldlugar_entregaPedidoExpor= new JTextFieldMe();

		jTextFieldlugar_entregaPedidoExpor.setEnabled(false);
		jTextFieldlugar_entregaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlugar_entregaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlugar_entregaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlugar_entregaPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonlugar_entregaPedidoExporBusqueda= new JButtonMe();
		this.jButtonlugar_entregaPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlugar_entregaPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlugar_entregaPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlugar_entregaPedidoExporBusqueda.setText("U");
		this.jButtonlugar_entregaPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlugar_entregaPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlugar_entregaPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlugar_entregaPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlugar_entregaPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"lugar_entregaPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlugar_entregaPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelembarquePedidoExpor = new JLabelMe();
		this.jLabelembarquePedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_EMBARQUE+" :");
		this.jLabelembarquePedidoExpor.setToolTipText("Embarque");
		this.jLabelembarquePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelembarquePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelembarquePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelembarquePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelembarquePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelembarquePedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_EMBARQUE);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelembarquePedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextAreaembarquePedidoExpor= new JTextAreaMe();
		jTextAreaembarquePedidoExpor.setEnabled(false);
		jTextAreaembarquePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaembarquePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaembarquePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaembarquePedidoExpor.setLineWrap(true);
		jTextAreaembarquePedidoExpor.setWrapStyleWord(true);
		jTextAreaembarquePedidoExpor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaembarquePedidoExpor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaembarquePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneembarquePedidoExpor = new JScrollPane(jTextAreaembarquePedidoExpor);
		jscrollPaneembarquePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPaneembarquePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPaneembarquePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonembarquePedidoExporBusqueda= new JButtonMe();
		this.jButtonembarquePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonembarquePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonembarquePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonembarquePedidoExporBusqueda.setText("U");
		this.jButtonembarquePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonembarquePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonembarquePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaembarquePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaembarquePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"embarquePedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonembarquePedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelnegociacionPedidoExpor = new JLabelMe();
		this.jLabelnegociacionPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_NEGOCIACION+" :");
		this.jLabelnegociacionPedidoExpor.setToolTipText("Negociacion");
		this.jLabelnegociacionPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnegociacionPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnegociacionPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnegociacionPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnegociacionPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnegociacionPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_NEGOCIACION);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelnegociacionPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextAreanegociacionPedidoExpor= new JTextAreaMe();
		jTextAreanegociacionPedidoExpor.setEnabled(false);
		jTextAreanegociacionPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanegociacionPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanegociacionPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanegociacionPedidoExpor.setLineWrap(true);
		jTextAreanegociacionPedidoExpor.setWrapStyleWord(true);
		jTextAreanegociacionPedidoExpor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanegociacionPedidoExpor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanegociacionPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenegociacionPedidoExpor = new JScrollPane(jTextAreanegociacionPedidoExpor);
		jscrollPanenegociacionPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenegociacionPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenegociacionPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnegociacionPedidoExporBusqueda= new JButtonMe();
		this.jButtonnegociacionPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnegociacionPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnegociacionPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnegociacionPedidoExporBusqueda.setText("U");
		this.jButtonnegociacionPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnegociacionPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnegociacionPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanegociacionPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanegociacionPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"negociacionPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnegociacionPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelforma_pagoPedidoExpor = new JLabelMe();
		this.jLabelforma_pagoPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_FORMAPAGO+" :");
		this.jLabelforma_pagoPedidoExpor.setToolTipText("Forma Pago");
		this.jLabelforma_pagoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelforma_pagoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelforma_pagoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelforma_pagoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelforma_pagoPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelforma_pagoPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_FORMAPAGO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelforma_pagoPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextAreaforma_pagoPedidoExpor= new JTextAreaMe();
		jTextAreaforma_pagoPedidoExpor.setEnabled(false);
		jTextAreaforma_pagoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaforma_pagoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaforma_pagoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaforma_pagoPedidoExpor.setLineWrap(true);
		jTextAreaforma_pagoPedidoExpor.setWrapStyleWord(true);
		jTextAreaforma_pagoPedidoExpor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaforma_pagoPedidoExpor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaforma_pagoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneforma_pagoPedidoExpor = new JScrollPane(jTextAreaforma_pagoPedidoExpor);
		jscrollPaneforma_pagoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPaneforma_pagoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPaneforma_pagoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonforma_pagoPedidoExporBusqueda= new JButtonMe();
		this.jButtonforma_pagoPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonforma_pagoPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonforma_pagoPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonforma_pagoPedidoExporBusqueda.setText("U");
		this.jButtonforma_pagoPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonforma_pagoPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonforma_pagoPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaforma_pagoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaforma_pagoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"forma_pagoPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonforma_pagoPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelordenPedidoExpor = new JLabelMe();
		this.jLabelordenPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_ORDEN+" :");
		this.jLabelordenPedidoExpor.setToolTipText("Orden");
		this.jLabelordenPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelordenPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldordenPedidoExpor= new JTextFieldMe();

		jTextFieldordenPedidoExpor.setEnabled(false);
		jTextFieldordenPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldordenPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonordenPedidoExporBusqueda= new JButtonMe();
		this.jButtonordenPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenPedidoExporBusqueda.setText("U");
		this.jButtonordenPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldordenPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldordenPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPedidoExpor = new JLabelMe();
		this.jLabeldescripcionPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionPedidoExpor.setToolTipText("Descripcion");
		this.jLabeldescripcionPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPaneldescripcionPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextAreadescripcionPedidoExpor= new JTextAreaMe();
		jTextAreadescripcionPedidoExpor.setEnabled(false);
		jTextAreadescripcionPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedidoExpor.setLineWrap(true);
		jTextAreadescripcionPedidoExpor.setWrapStyleWord(true);
		jTextAreadescripcionPedidoExpor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPedidoExpor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPedidoExpor = new JScrollPane(jTextAreadescripcionPedidoExpor);
		jscrollPanedescripcionPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondescripcionPedidoExporBusqueda= new JButtonMe();
		this.jButtondescripcionPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPedidoExporBusqueda.setText("U");
		this.jButtondescripcionPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelmontoPedidoExpor = new JLabelMe();
		this.jLabelmontoPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_MONTO+" : *");
		this.jLabelmontoPedidoExpor.setToolTipText("Monto");
		this.jLabelmontoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmontoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmontoPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmontoPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_MONTO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelmontoPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldmontoPedidoExpor= new JTextFieldMe();
		jTextFieldmontoPedidoExpor.setEnabled(false);
		jTextFieldmontoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmontoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmontoPedidoExpor.setText("0.0");

		this.jButtonmontoPedidoExporBusqueda= new JButtonMe();
		this.jButtonmontoPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmontoPedidoExporBusqueda.setText("U");
		this.jButtonmontoPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmontoPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmontoPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmontoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmontoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"montoPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmontoPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelsaldoPedidoExpor = new JLabelMe();
		this.jLabelsaldoPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_SALDO+" : *");
		this.jLabelsaldoPedidoExpor.setToolTipText("Saldo");
		this.jLabelsaldoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldoPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldoPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_SALDO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelsaldoPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldsaldoPedidoExpor= new JTextFieldMe();
		jTextFieldsaldoPedidoExpor.setEnabled(false);
		jTextFieldsaldoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldoPedidoExpor.setText("0.0");

		this.jButtonsaldoPedidoExporBusqueda= new JButtonMe();
		this.jButtonsaldoPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldoPedidoExporBusqueda.setText("U");
		this.jButtonsaldoPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldoPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldoPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldoPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldoPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabeldisponiblePedidoExpor = new JLabelMe();
		this.jLabeldisponiblePedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_DISPONIBLE+" : *");
		this.jLabeldisponiblePedidoExpor.setToolTipText("Disponible");
		this.jLabeldisponiblePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponiblePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponiblePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldisponiblePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldisponiblePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldisponiblePedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_DISPONIBLE);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPaneldisponiblePedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFielddisponiblePedidoExpor= new JTextFieldMe();
		jTextFielddisponiblePedidoExpor.setEnabled(false);
		jTextFielddisponiblePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponiblePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponiblePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddisponiblePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddisponiblePedidoExpor.setText("0.0");

		this.jButtondisponiblePedidoExporBusqueda= new JButtonMe();
		this.jButtondisponiblePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponiblePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponiblePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondisponiblePedidoExporBusqueda.setText("U");
		this.jButtondisponiblePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondisponiblePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondisponiblePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddisponiblePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddisponiblePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"disponiblePedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondisponiblePedidoExporBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_porcentajePedidoExpor = new JLabelMe();
		this.jLabeldescuento_porcentajePedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_DESCUENTOPORCENTAJE+" : *");
		this.jLabeldescuento_porcentajePedidoExpor.setToolTipText("Dscto Porcentaje");
		this.jLabeldescuento_porcentajePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_porcentajePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_porcentajePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_porcentajePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_porcentajePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_porcentajePedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_DESCUENTOPORCENTAJE);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPaneldescuento_porcentajePedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFielddescuento_porcentajePedidoExpor= new JTextFieldMe();
		jTextFielddescuento_porcentajePedidoExpor.setEnabled(false);
		jTextFielddescuento_porcentajePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_porcentajePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_porcentajePedidoExpor.setText("0.0");

		this.jButtondescuento_porcentajePedidoExporBusqueda= new JButtonMe();
		this.jButtondescuento_porcentajePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_porcentajePedidoExporBusqueda.setText("U");
		this.jButtondescuento_porcentajePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_porcentajePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_porcentajePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_porcentajePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_porcentajePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_porcentajePedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_porcentajePedidoExporBusqueda.setVisible(false);		}


					
		this.jLabeltotal_con_ivaPedidoExpor = new JLabelMe();
		this.jLabeltotal_con_ivaPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_TOTALCONIVA+" : *");
		this.jLabeltotal_con_ivaPedidoExpor.setToolTipText("Monto Con Iva");
		this.jLabeltotal_con_ivaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_con_ivaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_con_ivaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_con_ivaPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_con_ivaPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_con_ivaPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_TOTALCONIVA);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPaneltotal_con_ivaPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldtotal_con_ivaPedidoExpor= new JTextFieldMe();
		jTextFieldtotal_con_ivaPedidoExpor.setEnabled(false);
		jTextFieldtotal_con_ivaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_con_ivaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_con_ivaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_con_ivaPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_con_ivaPedidoExpor.setText("0.0");

		this.jButtontotal_con_ivaPedidoExporBusqueda= new JButtonMe();
		this.jButtontotal_con_ivaPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_con_ivaPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_con_ivaPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_con_ivaPedidoExporBusqueda.setText("U");
		this.jButtontotal_con_ivaPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_con_ivaPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_con_ivaPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_con_ivaPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_con_ivaPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_con_ivaPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_con_ivaPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelsumanPedidoExpor = new JLabelMe();
		this.jLabelsumanPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_SUMAN+" : *");
		this.jLabelsumanPedidoExpor.setToolTipText("Suman");
		this.jLabelsumanPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsumanPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsumanPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsumanPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_SUMAN);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelsumanPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldsumanPedidoExpor= new JTextFieldMe();
		jTextFieldsumanPedidoExpor.setEnabled(false);
		jTextFieldsumanPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsumanPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsumanPedidoExpor.setText("0.0");

		this.jButtonsumanPedidoExporBusqueda= new JButtonMe();
		this.jButtonsumanPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsumanPedidoExporBusqueda.setText("U");
		this.jButtonsumanPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsumanPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsumanPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsumanPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsumanPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sumanPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsumanPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorPedidoExpor = new JLabelMe();
		this.jLabeldescuento_valorPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorPedidoExpor.setToolTipText("Dscto Valor");
		this.jLabeldescuento_valorPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPaneldescuento_valorPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFielddescuento_valorPedidoExpor= new JTextFieldMe();
		jTextFielddescuento_valorPedidoExpor.setEnabled(false);
		jTextFielddescuento_valorPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorPedidoExpor.setText("0.0");

		this.jButtondescuento_valorPedidoExporBusqueda= new JButtonMe();
		this.jButtondescuento_valorPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorPedidoExporBusqueda.setText("U");
		this.jButtondescuento_valorPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaPedidoExpor = new JLabelMe();
		this.jLabeltotal_sin_ivaPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaPedidoExpor.setToolTipText("Monto Sin Iva");
		this.jLabeltotal_sin_ivaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPaneltotal_sin_ivaPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldtotal_sin_ivaPedidoExpor= new JTextFieldMe();
		jTextFieldtotal_sin_ivaPedidoExpor.setEnabled(false);
		jTextFieldtotal_sin_ivaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaPedidoExpor.setText("0.0");

		this.jButtontotal_sin_ivaPedidoExporBusqueda= new JButtonMe();
		this.jButtontotal_sin_ivaPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaPedidoExporBusqueda.setText("U");
		this.jButtontotal_sin_ivaPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabeltotal_descuentoPedidoExpor = new JLabelMe();
		this.jLabeltotal_descuentoPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_TOTALDESCUENTO+" : *");
		this.jLabeltotal_descuentoPedidoExpor.setToolTipText("Total Dscto");
		this.jLabeltotal_descuentoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_descuentoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_descuentoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_descuentoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_descuentoPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_descuentoPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_TOTALDESCUENTO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPaneltotal_descuentoPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldtotal_descuentoPedidoExpor= new JTextFieldMe();
		jTextFieldtotal_descuentoPedidoExpor.setEnabled(false);
		jTextFieldtotal_descuentoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_descuentoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_descuentoPedidoExpor.setText("0.0");

		this.jButtontotal_descuentoPedidoExporBusqueda= new JButtonMe();
		this.jButtontotal_descuentoPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_descuentoPedidoExporBusqueda.setText("U");
		this.jButtontotal_descuentoPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_descuentoPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_descuentoPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_descuentoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_descuentoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_descuentoPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_descuentoPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelfletePedidoExpor = new JLabelMe();
		this.jLabelfletePedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfletePedidoExpor.setToolTipText("Flete");
		this.jLabelfletePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfletePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfletePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfletePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfletePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfletePedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelfletePedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldfletePedidoExpor= new JTextFieldMe();
		jTextFieldfletePedidoExpor.setEnabled(false);
		jTextFieldfletePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfletePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfletePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfletePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfletePedidoExpor.setText("0.0");

		this.jButtonfletePedidoExporBusqueda= new JButtonMe();
		this.jButtonfletePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfletePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfletePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfletePedidoExporBusqueda.setText("U");
		this.jButtonfletePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfletePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfletePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfletePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfletePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fletePedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfletePedidoExporBusqueda.setVisible(false);		}


					
		this.jLabeltotalPedidoExpor = new JLabelMe();
		this.jLabeltotalPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalPedidoExpor.setToolTipText("Total");
		this.jLabeltotalPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPaneltotalPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldtotalPedidoExpor= new JTextFieldMe();
		jTextFieldtotalPedidoExpor.setEnabled(false);
		jTextFieldtotalPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalPedidoExpor.setText("0.0");

		this.jButtontotalPedidoExporBusqueda= new JButtonMe();
		this.jButtontotalPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalPedidoExporBusqueda.setText("U");
		this.jButtontotalPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelsubtotalPedidoExpor = new JLabelMe();
		this.jLabelsubtotalPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsubtotalPedidoExpor.setToolTipText("Subtotal");
		this.jLabelsubtotalPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsubtotalPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsubtotalPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsubtotalPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelsubtotalPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldsubtotalPedidoExpor= new JTextFieldMe();
		jTextFieldsubtotalPedidoExpor.setEnabled(false);
		jTextFieldsubtotalPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsubtotalPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsubtotalPedidoExpor.setText("0.0");

		this.jButtonsubtotalPedidoExporBusqueda= new JButtonMe();
		this.jButtonsubtotalPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsubtotalPedidoExporBusqueda.setText("U");
		this.jButtonsubtotalPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsubtotalPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsubtotalPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsubtotalPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsubtotalPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"subtotalPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsubtotalPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelsegurosPedidoExpor = new JLabelMe();
		this.jLabelsegurosPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_SEGUROS+" : *");
		this.jLabelsegurosPedidoExpor.setToolTipText("Seguros");
		this.jLabelsegurosPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsegurosPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsegurosPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsegurosPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsegurosPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsegurosPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_SEGUROS);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelsegurosPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldsegurosPedidoExpor= new JTextFieldMe();
		jTextFieldsegurosPedidoExpor.setEnabled(false);
		jTextFieldsegurosPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsegurosPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsegurosPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsegurosPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsegurosPedidoExpor.setText("0.0");

		this.jButtonsegurosPedidoExporBusqueda= new JButtonMe();
		this.jButtonsegurosPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsegurosPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsegurosPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsegurosPedidoExporBusqueda.setText("U");
		this.jButtonsegurosPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsegurosPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsegurosPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsegurosPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsegurosPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"segurosPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsegurosPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelivaPedidoExpor = new JLabelMe();
		this.jLabelivaPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaPedidoExpor.setToolTipText("Iva");
		this.jLabelivaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelivaPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldivaPedidoExpor= new JTextFieldMe();
		jTextFieldivaPedidoExpor.setEnabled(false);
		jTextFieldivaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaPedidoExpor.setText("0.0");

		this.jButtonivaPedidoExporBusqueda= new JButtonMe();
		this.jButtonivaPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaPedidoExporBusqueda.setText("U");
		this.jButtonivaPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelfinanciamientoPedidoExpor = new JLabelMe();
		this.jLabelfinanciamientoPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_FINANCIAMIENTO+" : *");
		this.jLabelfinanciamientoPedidoExpor.setToolTipText("Financiamiento");
		this.jLabelfinanciamientoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfinanciamientoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfinanciamientoPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfinanciamientoPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_FINANCIAMIENTO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelfinanciamientoPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldfinanciamientoPedidoExpor= new JTextFieldMe();
		jTextFieldfinanciamientoPedidoExpor.setEnabled(false);
		jTextFieldfinanciamientoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfinanciamientoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfinanciamientoPedidoExpor.setText("0.0");

		this.jButtonfinanciamientoPedidoExporBusqueda= new JButtonMe();
		this.jButtonfinanciamientoPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfinanciamientoPedidoExporBusqueda.setText("U");
		this.jButtonfinanciamientoPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfinanciamientoPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfinanciamientoPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfinanciamientoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfinanciamientoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"financiamientoPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfinanciamientoPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelmonto_retencionPedidoExpor = new JLabelMe();
		this.jLabelmonto_retencionPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_MONTORETENCION+" : *");
		this.jLabelmonto_retencionPedidoExpor.setToolTipText("Monto Retencion");
		this.jLabelmonto_retencionPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_retencionPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_retencionPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_retencionPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_retencionPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_retencionPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_MONTORETENCION);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelmonto_retencionPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldmonto_retencionPedidoExpor= new JTextFieldMe();
		jTextFieldmonto_retencionPedidoExpor.setEnabled(false);
		jTextFieldmonto_retencionPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_retencionPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_retencionPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_retencionPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_retencionPedidoExpor.setText("0.0");

		this.jButtonmonto_retencionPedidoExporBusqueda= new JButtonMe();
		this.jButtonmonto_retencionPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_retencionPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_retencionPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_retencionPedidoExporBusqueda.setText("U");
		this.jButtonmonto_retencionPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_retencionPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_retencionPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_retencionPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_retencionPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_retencionPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_retencionPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelotroPedidoExpor = new JLabelMe();
		this.jLabelotroPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_OTRO+" : *");
		this.jLabelotroPedidoExpor.setToolTipText("Otro");
		this.jLabelotroPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotroPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotroPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotroPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotroPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotroPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_OTRO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelotroPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldotroPedidoExpor= new JTextFieldMe();
		jTextFieldotroPedidoExpor.setEnabled(false);
		jTextFieldotroPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotroPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotroPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotroPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotroPedidoExpor.setText("0.0");

		this.jButtonotroPedidoExporBusqueda= new JButtonMe();
		this.jButtonotroPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotroPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotroPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotroPedidoExporBusqueda.setText("U");
		this.jButtonotroPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotroPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotroPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotroPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotroPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otroPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotroPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelicePedidoExpor = new JLabelMe();
		this.jLabelicePedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_ICE+" : *");
		this.jLabelicePedidoExpor.setToolTipText("Ice");
		this.jLabelicePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelicePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelicePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelicePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelicePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelicePedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelicePedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldicePedidoExpor= new JTextFieldMe();
		jTextFieldicePedidoExpor.setEnabled(false);
		jTextFieldicePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldicePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldicePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldicePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldicePedidoExpor.setText("0.0");

		this.jButtonicePedidoExporBusqueda= new JButtonMe();
		this.jButtonicePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonicePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonicePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonicePedidoExporBusqueda.setText("U");
		this.jButtonicePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonicePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonicePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldicePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldicePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"icePedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonicePedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelfechaPedidoExpor = new JLabelMe();
		this.jLabelfechaPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaPedidoExpor.setToolTipText("Fecha");
		this.jLabelfechaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelfechaPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		//jFormattedTextFieldfechaPedidoExpor= new JFormattedTextFieldMe();

		jDateChooserfechaPedidoExpor= new JDateChooser();
		jDateChooserfechaPedidoExpor.setEnabled(false);
		jDateChooserfechaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaPedidoExpor.setDate(new Date());
		jDateChooserfechaPedidoExpor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaPedidoExpor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaPedidoExporBusqueda= new JButtonMe();
		this.jButtonfechaPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaPedidoExporBusqueda.setText("U");
		this.jButtonfechaPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelfecha_servidorPedidoExpor = new JLabelMe();
		this.jLabelfecha_servidorPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_FECHASERVIDOR+" : *");
		this.jLabelfecha_servidorPedidoExpor.setToolTipText("Fecha Servidor");
		this.jLabelfecha_servidorPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_servidorPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_servidorPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_servidorPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_servidorPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_servidorPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_FECHASERVIDOR);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelfecha_servidorPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		//jFormattedTextFieldfecha_servidorPedidoExpor= new JFormattedTextFieldMe();

		jDateChooserfecha_servidorPedidoExpor= new JDateChooser();
		jDateChooserfecha_servidorPedidoExpor.setEnabled(false);
		jDateChooserfecha_servidorPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_servidorPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_servidorPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_servidorPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_servidorPedidoExpor.setDate(new Date());
		jDateChooserfecha_servidorPedidoExpor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_servidorPedidoExpor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_servidorPedidoExporBusqueda= new JButtonMe();
		this.jButtonfecha_servidorPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_servidorPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_servidorPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_servidorPedidoExporBusqueda.setText("U");
		this.jButtonfecha_servidorPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_servidorPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_servidorPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_servidorPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_servidorPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_servidorPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_servidorPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelnumero_fuePedidoExpor = new JLabelMe();
		this.jLabelnumero_fuePedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_NUMEROFUE+" : *");
		this.jLabelnumero_fuePedidoExpor.setToolTipText("Numero Fue");
		this.jLabelnumero_fuePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_fuePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_fuePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_fuePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_fuePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_fuePedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_NUMEROFUE);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelnumero_fuePedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jTextFieldnumero_fuePedidoExpor= new JTextFieldMe();

		jTextFieldnumero_fuePedidoExpor.setEnabled(false);
		jTextFieldnumero_fuePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_fuePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_fuePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_fuePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_fuePedidoExporBusqueda= new JButtonMe();
		this.jButtonnumero_fuePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_fuePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_fuePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_fuePedidoExporBusqueda.setText("U");
		this.jButtonnumero_fuePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_fuePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_fuePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_fuePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_fuePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_fuePedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_fuePedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelhora_inicioPedidoExpor = new JLabelMe();
		this.jLabelhora_inicioPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_HORAINICIO+" : *");
		this.jLabelhora_inicioPedidoExpor.setToolTipText("Hora Inicio");
		this.jLabelhora_inicioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_inicioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_inicioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_inicioPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_inicioPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_inicioPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_HORAINICIO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelhora_inicioPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		//jFormattedTextFieldhora_inicioPedidoExpor= new JFormattedTextFieldMe();

		jSpinnerhora_inicioPedidoExpor= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_inicioPedidoExpor.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_inicioPedidoExpor = new JSpinner.DateEditor(jSpinnerhora_inicioPedidoExpor, "HH:mm:ss");

		jSpinnerhora_inicioPedidoExpor.setEditor(timeEditorhora_inicioPedidoExpor);

		jSpinnerhora_inicioPedidoExpor.setValue(new Date());

		jSpinnerhora_inicioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_inicioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_inicioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_inicioPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_inicioPedidoExpor.setValue(new Date());
		//jSpinnerhora_inicioPedidoExpor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_inicioPedidoExpor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_inicioPedidoExporBusqueda= new JButtonMe();
		this.jButtonhora_inicioPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_inicioPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_inicioPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_inicioPedidoExporBusqueda.setText("U");
		this.jButtonhora_inicioPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_inicioPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_inicioPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_inicioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_inicioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_inicioPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_inicioPedidoExporBusqueda.setVisible(false);		}


					
		this.jLabelhora_finPedidoExpor = new JLabelMe();
		this.jLabelhora_finPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_HORAFIN+" : *");
		this.jLabelhora_finPedidoExpor.setToolTipText("Hora Fin");
		this.jLabelhora_finPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_finPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_finPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_finPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_finPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_finPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_HORAFIN);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelhora_finPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		//jFormattedTextFieldhora_finPedidoExpor= new JFormattedTextFieldMe();

		jSpinnerhora_finPedidoExpor= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_finPedidoExpor.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_finPedidoExpor = new JSpinner.DateEditor(jSpinnerhora_finPedidoExpor, "HH:mm:ss");

		jSpinnerhora_finPedidoExpor.setEditor(timeEditorhora_finPedidoExpor);

		jSpinnerhora_finPedidoExpor.setValue(new Date());

		jSpinnerhora_finPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_finPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_finPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_finPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_finPedidoExpor.setValue(new Date());
		//jSpinnerhora_finPedidoExpor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_finPedidoExpor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_finPedidoExporBusqueda= new JButtonMe();
		this.jButtonhora_finPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_finPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_finPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_finPedidoExporBusqueda.setText("U");
		this.jButtonhora_finPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_finPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_finPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_finPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_finPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_finPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_finPedidoExporBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPedidoExpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPedidoExpor = new JLabelMe();
		this.jLabelid_empresaPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPedidoExpor.setToolTipText("Empresa");
		this.jLabelid_empresaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_empresaPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_empresaPedidoExpor= new JComboBoxMe();
		jComboBoxid_empresaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPedidoExpor.setEnabled(false);

		this.jButtonid_empresaPedidoExpor= new JButtonMe();
		this.jButtonid_empresaPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoExpor.setText("Buscar");
		this.jButtonid_empresaPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoExpor"));

		this.jButtonid_empresaPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_empresaPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidoExporBusqueda.setText("U");
		this.jButtonid_empresaPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_empresaPedidoExporUpdate= new JButtonMe();
		this.jButtonid_empresaPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidoExporUpdate.setText("U");
		this.jButtonid_empresaPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoExporUpdate"));



					
		this.jLabelid_sucursalPedidoExpor = new JLabelMe();
		this.jLabelid_sucursalPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPedidoExpor.setToolTipText("Sucursal");
		this.jLabelid_sucursalPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_sucursalPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_sucursalPedidoExpor= new JComboBoxMe();
		jComboBoxid_sucursalPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPedidoExpor.setEnabled(false);

		this.jButtonid_sucursalPedidoExpor= new JButtonMe();
		this.jButtonid_sucursalPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoExpor.setText("Buscar");
		this.jButtonid_sucursalPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoExpor"));

		this.jButtonid_sucursalPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_sucursalPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPedidoExporBusqueda.setText("U");
		this.jButtonid_sucursalPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPedidoExporUpdate= new JButtonMe();
		this.jButtonid_sucursalPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPedidoExporUpdate.setText("U");
		this.jButtonid_sucursalPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoExporUpdate"));



					
		this.jLabelid_ejercicioPedidoExpor = new JLabelMe();
		this.jLabelid_ejercicioPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPedidoExpor.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_ejercicioPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_ejercicioPedidoExpor= new JComboBoxMe();
		jComboBoxid_ejercicioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioPedidoExpor.setEnabled(false);

		this.jButtonid_ejercicioPedidoExpor= new JButtonMe();
		this.jButtonid_ejercicioPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedidoExpor.setText("Buscar");
		this.jButtonid_ejercicioPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedidoExpor"));

		this.jButtonid_ejercicioPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPedidoExporBusqueda.setText("U");
		this.jButtonid_ejercicioPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPedidoExporUpdate= new JButtonMe();
		this.jButtonid_ejercicioPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPedidoExporUpdate.setText("U");
		this.jButtonid_ejercicioPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedidoExporUpdate"));



					
		this.jLabelid_periodoPedidoExpor = new JLabelMe();
		this.jLabelid_periodoPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoPedidoExpor.setToolTipText("Periodo");
		this.jLabelid_periodoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_periodoPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_periodoPedidoExpor= new JComboBoxMe();
		jComboBoxid_periodoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoPedidoExpor.setEnabled(false);

		this.jButtonid_periodoPedidoExpor= new JButtonMe();
		this.jButtonid_periodoPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedidoExpor.setText("Buscar");
		this.jButtonid_periodoPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedidoExpor"));

		this.jButtonid_periodoPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_periodoPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPedidoExporBusqueda.setText("U");
		this.jButtonid_periodoPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_periodoPedidoExporUpdate= new JButtonMe();
		this.jButtonid_periodoPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPedidoExporUpdate.setText("U");
		this.jButtonid_periodoPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedidoExporUpdate"));



					
		this.jLabelid_anioPedidoExpor = new JLabelMe();
		this.jLabelid_anioPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioPedidoExpor.setToolTipText("Anio");
		this.jLabelid_anioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_anioPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_anioPedidoExpor= new JComboBoxMe();
		jComboBoxid_anioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioPedidoExpor.setEnabled(false);

		this.jButtonid_anioPedidoExpor= new JButtonMe();
		this.jButtonid_anioPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPedidoExpor.setText("Buscar");
		this.jButtonid_anioPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPedidoExpor"));

		this.jButtonid_anioPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_anioPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPedidoExporBusqueda.setText("U");
		this.jButtonid_anioPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_anioPedidoExporUpdate= new JButtonMe();
		this.jButtonid_anioPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPedidoExporUpdate.setText("U");
		this.jButtonid_anioPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPedidoExporUpdate"));



					
		this.jLabelid_mesPedidoExpor = new JLabelMe();
		this.jLabelid_mesPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesPedidoExpor.setToolTipText("Mes");
		this.jLabelid_mesPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_mesPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_mesPedidoExpor= new JComboBoxMe();
		jComboBoxid_mesPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesPedidoExpor.setEnabled(false);

		this.jButtonid_mesPedidoExpor= new JButtonMe();
		this.jButtonid_mesPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPedidoExpor.setText("Buscar");
		this.jButtonid_mesPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPedidoExpor"));

		this.jButtonid_mesPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_mesPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPedidoExporBusqueda.setText("U");
		this.jButtonid_mesPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_mesPedidoExporUpdate= new JButtonMe();
		this.jButtonid_mesPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPedidoExporUpdate.setText("U");
		this.jButtonid_mesPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPedidoExporUpdate"));



					
		this.jLabelid_usuarioPedidoExpor = new JLabelMe();
		this.jLabelid_usuarioPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioPedidoExpor.setToolTipText("Usuario");
		this.jLabelid_usuarioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_usuarioPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_usuarioPedidoExpor= new JComboBoxMe();
		jComboBoxid_usuarioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioPedidoExpor.setEnabled(false);

		this.jButtonid_usuarioPedidoExpor= new JButtonMe();
		this.jButtonid_usuarioPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPedidoExpor.setText("Buscar");
		this.jButtonid_usuarioPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPedidoExpor"));

		this.jButtonid_usuarioPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_usuarioPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioPedidoExporBusqueda.setText("U");
		this.jButtonid_usuarioPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_usuarioPedidoExporUpdate= new JButtonMe();
		this.jButtonid_usuarioPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioPedidoExporUpdate.setText("U");
		this.jButtonid_usuarioPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPedidoExporUpdate"));



					
		this.jLabelid_monedaPedidoExpor = new JLabelMe();
		this.jLabelid_monedaPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaPedidoExpor.setToolTipText("Moneda");
		this.jLabelid_monedaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_monedaPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_monedaPedidoExpor= new JComboBoxMe();
		jComboBoxid_monedaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaPedidoExpor= new JButtonMe();
		this.jButtonid_monedaPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaPedidoExpor.setText("Buscar");
		this.jButtonid_monedaPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaPedidoExpor"));

		this.jButtonid_monedaPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_monedaPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaPedidoExporBusqueda.setText("U");
		this.jButtonid_monedaPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_monedaPedidoExporUpdate= new JButtonMe();
		this.jButtonid_monedaPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaPedidoExporUpdate.setText("U");
		this.jButtonid_monedaPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaPedidoExporUpdate"));



					
		this.jLabelid_empleadoPedidoExpor = new JLabelMe();
		this.jLabelid_empleadoPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoPedidoExpor.setToolTipText("Empleado");
		this.jLabelid_empleadoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_empleadoPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_empleadoPedidoExpor= new JComboBoxMe();
		jComboBoxid_empleadoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoPedidoExpor= new JButtonMe();
		this.jButtonid_empleadoPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPedidoExpor.setText("Buscar");
		this.jButtonid_empleadoPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPedidoExpor"));

		this.jButtonid_empleadoPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_empleadoPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPedidoExporBusqueda.setText("U");
		this.jButtonid_empleadoPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_empleadoPedidoExporUpdate= new JButtonMe();
		this.jButtonid_empleadoPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPedidoExporUpdate.setText("U");
		this.jButtonid_empleadoPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPedidoExporUpdate"));



					
		this.jLabelid_tipo_precioPedidoExpor = new JLabelMe();
		this.jLabelid_tipo_precioPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioPedidoExpor.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_tipo_precioPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_tipo_precioPedidoExpor= new JComboBoxMe();
		jComboBoxid_tipo_precioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioPedidoExpor= new JButtonMe();
		this.jButtonid_tipo_precioPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioPedidoExpor.setText("Buscar");
		this.jButtonid_tipo_precioPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioPedidoExpor"));

		this.jButtonid_tipo_precioPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioPedidoExporBusqueda.setText("U");
		this.jButtonid_tipo_precioPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioPedidoExporUpdate= new JButtonMe();
		this.jButtonid_tipo_precioPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioPedidoExporUpdate.setText("U");
		this.jButtonid_tipo_precioPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioPedidoExporUpdate"));



					
		this.jLabelid_formatoPedidoExpor = new JLabelMe();
		this.jLabelid_formatoPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDFORMATO+" :");
		this.jLabelid_formatoPedidoExpor.setToolTipText("Formato");
		this.jLabelid_formatoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_formatoPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_formatoPedidoExpor= new JComboBoxMe();
		jComboBoxid_formatoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoPedidoExpor= new JButtonMe();
		this.jButtonid_formatoPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPedidoExpor.setText("Buscar");
		this.jButtonid_formatoPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPedidoExpor"));

		this.jButtonid_formatoPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_formatoPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoPedidoExporBusqueda.setText("U");
		this.jButtonid_formatoPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_formatoPedidoExporUpdate= new JButtonMe();
		this.jButtonid_formatoPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoPedidoExporUpdate.setText("U");
		this.jButtonid_formatoPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPedidoExporUpdate"));



					
		this.jLabelid_clientePedidoExpor = new JLabelMe();
		this.jLabelid_clientePedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clientePedidoExpor.setToolTipText("Cliente");
		this.jLabelid_clientePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clientePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clientePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clientePedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_clientePedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_clientePedidoExpor= new JComboBoxMe();
		jComboBoxid_clientePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clientePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clientePedidoExpor= new JButtonMe();
		this.jButtonid_clientePedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedidoExpor.setText("Buscar");
		this.jButtonid_clientePedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clientePedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clientePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedidoExpor"));

		this.jButtonid_clientePedidoExporBusqueda= new JButtonMe();
		this.jButtonid_clientePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePedidoExporBusqueda.setText("U");
		this.jButtonid_clientePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clientePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clientePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clientePedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_clientePedidoExporUpdate= new JButtonMe();
		this.jButtonid_clientePedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePedidoExporUpdate.setText("U");
		this.jButtonid_clientePedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clientePedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clientePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedidoExporUpdate"));



					
		this.jLabelid_paisPedidoExpor = new JLabelMe();
		this.jLabelid_paisPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDPAIS+" :");
		this.jLabelid_paisPedidoExpor.setToolTipText("Origen");
		this.jLabelid_paisPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_paisPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_paisPedidoExpor= new JComboBoxMe();
		jComboBoxid_paisPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisPedidoExpor= new JButtonMe();
		this.jButtonid_paisPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisPedidoExpor.setText("Buscar");
		this.jButtonid_paisPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisPedidoExpor"));

		this.jButtonid_paisPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_paisPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisPedidoExporBusqueda.setText("U");
		this.jButtonid_paisPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_paisPedidoExporUpdate= new JButtonMe();
		this.jButtonid_paisPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisPedidoExporUpdate.setText("U");
		this.jButtonid_paisPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisPedidoExporUpdate"));



					
		this.jLabelid_transportePedidoExpor = new JLabelMe();
		this.jLabelid_transportePedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDTRANSPORTE+" :");
		this.jLabelid_transportePedidoExpor.setToolTipText("Transporte");
		this.jLabelid_transportePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transportePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transportePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transportePedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDTRANSPORTE);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_transportePedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_transportePedidoExpor= new JComboBoxMe();
		jComboBoxid_transportePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transportePedidoExpor= new JButtonMe();
		this.jButtonid_transportePedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportePedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportePedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportePedidoExpor.setText("Buscar");
		this.jButtonid_transportePedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transportePedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportePedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transportePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportePedidoExpor"));

		this.jButtonid_transportePedidoExporBusqueda= new JButtonMe();
		this.jButtonid_transportePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportePedidoExporBusqueda.setText("U");
		this.jButtonid_transportePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transportePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transportePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportePedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transportePedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_transportePedidoExporUpdate= new JButtonMe();
		this.jButtonid_transportePedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportePedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportePedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportePedidoExporUpdate.setText("U");
		this.jButtonid_transportePedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transportePedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportePedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transportePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportePedidoExporUpdate"));



					
		this.jLabelid_vendedorPedidoExpor = new JLabelMe();
		this.jLabelid_vendedorPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDVENDEDOR+" :");
		this.jLabelid_vendedorPedidoExpor.setToolTipText("Vendedor");
		this.jLabelid_vendedorPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_vendedorPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_vendedorPedidoExpor= new JComboBoxMe();
		jComboBoxid_vendedorPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorPedidoExpor= new JButtonMe();
		this.jButtonid_vendedorPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorPedidoExpor.setText("Buscar");
		this.jButtonid_vendedorPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPedidoExpor"));

		this.jButtonid_vendedorPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_vendedorPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorPedidoExporBusqueda.setText("U");
		this.jButtonid_vendedorPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_vendedorPedidoExporUpdate= new JButtonMe();
		this.jButtonid_vendedorPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorPedidoExporUpdate.setText("U");
		this.jButtonid_vendedorPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPedidoExporUpdate"));


		jButtonid_vendedorPedidoExporArbol= new JButtonMe();
		jButtonid_vendedorPedidoExporArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorPedidoExporArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorPedidoExporArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorPedidoExporArbol.setText("Arbol");
		jButtonid_vendedorPedidoExporArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorPedidoExporArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorPedidoExporArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorPedidoExporArbol"));



					
		this.jLabelid_sub_clientePedidoExpor = new JLabelMe();
		this.jLabelid_sub_clientePedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDSUBCLIENTE+" :");
		this.jLabelid_sub_clientePedidoExpor.setToolTipText("Contacto");
		this.jLabelid_sub_clientePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sub_clientePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sub_clientePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sub_clientePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sub_clientePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sub_clientePedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDSUBCLIENTE);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_sub_clientePedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_sub_clientePedidoExpor= new JComboBoxMe();
		jComboBoxid_sub_clientePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clientePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clientePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_clientePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sub_clientePedidoExpor= new JButtonMe();
		this.jButtonid_sub_clientePedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clientePedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clientePedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clientePedidoExpor.setText("Buscar");
		this.jButtonid_sub_clientePedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sub_clientePedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clientePedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sub_clientePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clientePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clientePedidoExpor"));

		this.jButtonid_sub_clientePedidoExporBusqueda= new JButtonMe();
		this.jButtonid_sub_clientePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clientePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clientePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_clientePedidoExporBusqueda.setText("U");
		this.jButtonid_sub_clientePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sub_clientePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clientePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sub_clientePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clientePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clientePedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sub_clientePedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_sub_clientePedidoExporUpdate= new JButtonMe();
		this.jButtonid_sub_clientePedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clientePedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clientePedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_clientePedidoExporUpdate.setText("U");
		this.jButtonid_sub_clientePedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sub_clientePedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clientePedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sub_clientePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clientePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clientePedidoExporUpdate"));



					
		this.jLabelid_consignatarioPedidoExpor = new JLabelMe();
		this.jLabelid_consignatarioPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDCONSIGNATARIO+" :");
		this.jLabelid_consignatarioPedidoExpor.setToolTipText("Consignatario");
		this.jLabelid_consignatarioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_consignatarioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_consignatarioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_consignatarioPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_consignatarioPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_consignatarioPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDCONSIGNATARIO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_consignatarioPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_consignatarioPedidoExpor= new JComboBoxMe();
		jComboBoxid_consignatarioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consignatarioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consignatarioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_consignatarioPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_consignatarioPedidoExpor= new JButtonMe();
		this.jButtonid_consignatarioPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consignatarioPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consignatarioPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consignatarioPedidoExpor.setText("Buscar");
		this.jButtonid_consignatarioPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_consignatarioPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consignatarioPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_consignatarioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consignatarioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consignatarioPedidoExpor"));

		this.jButtonid_consignatarioPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_consignatarioPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consignatarioPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consignatarioPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_consignatarioPedidoExporBusqueda.setText("U");
		this.jButtonid_consignatarioPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_consignatarioPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consignatarioPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_consignatarioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consignatarioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consignatarioPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_consignatarioPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_consignatarioPedidoExporUpdate= new JButtonMe();
		this.jButtonid_consignatarioPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consignatarioPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consignatarioPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_consignatarioPedidoExporUpdate.setText("U");
		this.jButtonid_consignatarioPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_consignatarioPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consignatarioPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_consignatarioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consignatarioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consignatarioPedidoExporUpdate"));



					
		this.jLabelid_consultorPedidoExpor = new JLabelMe();
		this.jLabelid_consultorPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDCONSULTOR+" :");
		this.jLabelid_consultorPedidoExpor.setToolTipText("Consultor");
		this.jLabelid_consultorPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_consultorPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_consultorPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_consultorPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_consultorPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_consultorPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDCONSULTOR);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_consultorPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_consultorPedidoExpor= new JComboBoxMe();
		jComboBoxid_consultorPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consultorPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consultorPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_consultorPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_consultorPedidoExpor= new JButtonMe();
		this.jButtonid_consultorPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consultorPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consultorPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consultorPedidoExpor.setText("Buscar");
		this.jButtonid_consultorPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_consultorPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consultorPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_consultorPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consultorPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consultorPedidoExpor"));

		this.jButtonid_consultorPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_consultorPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consultorPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consultorPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_consultorPedidoExporBusqueda.setText("U");
		this.jButtonid_consultorPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_consultorPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consultorPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_consultorPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consultorPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consultorPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_consultorPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_consultorPedidoExporUpdate= new JButtonMe();
		this.jButtonid_consultorPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consultorPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consultorPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_consultorPedidoExporUpdate.setText("U");
		this.jButtonid_consultorPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_consultorPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consultorPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_consultorPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consultorPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consultorPedidoExporUpdate"));



					
		this.jLabelid_estado_pedidoPedidoExpor = new JLabelMe();
		this.jLabelid_estado_pedidoPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDESTADOPEDIDOEXPOR+" : *");
		this.jLabelid_estado_pedidoPedidoExpor.setToolTipText("Estado");
		this.jLabelid_estado_pedidoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_pedidoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_pedidoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedidoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_pedidoPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_pedidoPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDESTADOPEDIDOEXPOR);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_estado_pedidoPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_estado_pedidoPedidoExpor= new JComboBoxMe();
		jComboBoxid_estado_pedidoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedidoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedidoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedidoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_pedidoPedidoExpor= new JButtonMe();
		this.jButtonid_estado_pedidoPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedidoPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedidoPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedidoPedidoExpor.setText("Buscar");
		this.jButtonid_estado_pedidoPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_pedidoPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedidoPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_pedidoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedidoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedidoPedidoExpor"));

		this.jButtonid_estado_pedidoPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_estado_pedidoPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedidoPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedidoPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedidoPedidoExporBusqueda.setText("U");
		this.jButtonid_estado_pedidoPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_pedidoPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedidoPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_pedidoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedidoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedidoPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_pedidoPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_estado_pedidoPedidoExporUpdate= new JButtonMe();
		this.jButtonid_estado_pedidoPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedidoPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedidoPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedidoPedidoExporUpdate.setText("U");
		this.jButtonid_estado_pedidoPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_pedidoPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedidoPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_pedidoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedidoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedidoPedidoExporUpdate"));



					
		this.jLabelid_tipo_cambioPedidoExpor = new JLabelMe();
		this.jLabelid_tipo_cambioPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDTIPOCAMBIO+" : *");
		this.jLabelid_tipo_cambioPedidoExpor.setToolTipText("Tipo Cambio");
		this.jLabelid_tipo_cambioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_tipo_cambioPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_tipo_cambioPedidoExpor= new JComboBoxMe();
		jComboBoxid_tipo_cambioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_cambioPedidoExpor.setEnabled(false);

		this.jButtonid_tipo_cambioPedidoExpor= new JButtonMe();
		this.jButtonid_tipo_cambioPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioPedidoExpor.setText("Buscar");
		this.jButtonid_tipo_cambioPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioPedidoExpor"));

		this.jButtonid_tipo_cambioPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioPedidoExporBusqueda.setText("U");
		this.jButtonid_tipo_cambioPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioPedidoExporUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioPedidoExporUpdate.setText("U");
		this.jButtonid_tipo_cambioPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioPedidoExporUpdate"));



					
		this.jLabelid_centro_costoPedidoExpor = new JLabelMe();
		this.jLabelid_centro_costoPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoPedidoExpor.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_centro_costoPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_centro_costoPedidoExpor= new JComboBoxMe();
		jComboBoxid_centro_costoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_centro_costoPedidoExpor.setEnabled(false);

		this.jButtonid_centro_costoPedidoExpor= new JButtonMe();
		this.jButtonid_centro_costoPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoPedidoExpor.setText("Buscar");
		this.jButtonid_centro_costoPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPedidoExpor"));

		this.jButtonid_centro_costoPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_centro_costoPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoPedidoExporBusqueda.setText("U");
		this.jButtonid_centro_costoPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoPedidoExporUpdate= new JButtonMe();
		this.jButtonid_centro_costoPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoPedidoExporUpdate.setText("U");
		this.jButtonid_centro_costoPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPedidoExporUpdate"));


		jButtonid_centro_costoPedidoExporArbol= new JButtonMe();
		jButtonid_centro_costoPedidoExporArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPedidoExporArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPedidoExporArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoPedidoExporArbol.setText("Arbol");
		jButtonid_centro_costoPedidoExporArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoPedidoExporArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoPedidoExporArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoPedidoExporArbol"));



					
		this.jLabelid_responsablePedidoExpor = new JLabelMe();
		this.jLabelid_responsablePedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDRESPONSABLE+" : *");
		this.jLabelid_responsablePedidoExpor.setToolTipText("Responsable");
		this.jLabelid_responsablePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_responsablePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_responsablePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_responsablePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_responsablePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_responsablePedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDRESPONSABLE);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_responsablePedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_responsablePedidoExpor= new JComboBoxMe();
		jComboBoxid_responsablePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsablePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsablePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_responsablePedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_responsablePedidoExpor.setEnabled(false);

		this.jButtonid_responsablePedidoExpor= new JButtonMe();
		this.jButtonid_responsablePedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsablePedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsablePedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsablePedidoExpor.setText("Buscar");
		this.jButtonid_responsablePedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_responsablePedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsablePedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_responsablePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsablePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsablePedidoExpor"));

		this.jButtonid_responsablePedidoExporBusqueda= new JButtonMe();
		this.jButtonid_responsablePedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsablePedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsablePedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_responsablePedidoExporBusqueda.setText("U");
		this.jButtonid_responsablePedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_responsablePedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsablePedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_responsablePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsablePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsablePedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_responsablePedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_responsablePedidoExporUpdate= new JButtonMe();
		this.jButtonid_responsablePedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsablePedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsablePedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_responsablePedidoExporUpdate.setText("U");
		this.jButtonid_responsablePedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_responsablePedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsablePedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_responsablePedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsablePedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsablePedidoExporUpdate"));



					
		this.jLabelid_transportistaPedidoExpor = new JLabelMe();
		this.jLabelid_transportistaPedidoExpor.setText(""+PedidoExporConstantesFunciones.LABEL_IDTRANSPORTISTA+" : *");
		this.jLabelid_transportistaPedidoExpor.setToolTipText("Transportista");
		this.jLabelid_transportistaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transportistaPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transportistaPedidoExpor.setToolTipText(PedidoExporConstantesFunciones.LABEL_IDTRANSPORTISTA);
		this.gridaBagLayoutPedidoExpor = new GridBagLayout();
		this.jPanelid_transportistaPedidoExpor.setLayout(this.gridaBagLayoutPedidoExpor);


		jComboBoxid_transportistaPedidoExpor= new JComboBoxMe();
		jComboBoxid_transportistaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_transportistaPedidoExpor.setEnabled(false);

		this.jButtonid_transportistaPedidoExpor= new JButtonMe();
		this.jButtonid_transportistaPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaPedidoExpor.setText("Buscar");
		this.jButtonid_transportistaPedidoExpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transportistaPedidoExpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaPedidoExpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transportistaPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaPedidoExpor"));

		this.jButtonid_transportistaPedidoExporBusqueda= new JButtonMe();
		this.jButtonid_transportistaPedidoExporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaPedidoExporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaPedidoExporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaPedidoExporBusqueda.setText("U");
		this.jButtonid_transportistaPedidoExporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transportistaPedidoExporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaPedidoExporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transportistaPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaPedidoExporBusqueda"));

		if(this.pedidoexporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transportistaPedidoExporBusqueda.setVisible(false);		}

		this.jButtonid_transportistaPedidoExporUpdate= new JButtonMe();
		this.jButtonid_transportistaPedidoExporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaPedidoExporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaPedidoExporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaPedidoExporUpdate.setText("U");
		this.jButtonid_transportistaPedidoExporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transportistaPedidoExporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaPedidoExporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transportistaPedidoExpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaPedidoExpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaPedidoExporUpdate"));



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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetallePedidoExpor = new PedidoExporBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pedido Exportacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedidoExpor= new GridBagLayout();
		

		
		String sToolTipPedidoExpor="";
		sToolTipPedidoExpor=PedidoExporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedidoExpor+="(Facturacion.PedidoExpor)";
		}
		
		if(!this.pedidoexporSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedidoExpor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPedidoExpor = new JButtonMe();
		this.jButtonModificarPedidoExpor = new JButtonMe();
        this.jButtonActualizarPedidoExpor = new JButtonMe();
        this.jButtonEliminarPedidoExpor = new JButtonMe();
        this.jButtonCancelarPedidoExpor = new JButtonMe();
        this.jButtonGuardarCambiosPedidoExpor = new JButtonMe();
		this.jButtonGuardarCambiosTablaPedidoExpor = new JButtonMe();
		this.jButtonCerrarPedidoExpor = new JButtonMe();
		
		this.jScrollPanelDatosPedidoExpor = new JScrollPane();   
        this.jScrollPanelDatosEdicionPedidoExpor = new JScrollPane();
		this.jScrollPanelDatosGeneralPedidoExpor = new JScrollPane();
				
		
		
		this.jPanelCamposPedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalPedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Pedido Exportacion";
		
		if(!this.pedidoexporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Exportacions" + this.sPath));
		} else {
			this.jScrollPanelDatosPedidoExpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposPedidoExpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposPedidoExpor.setName("jPanelCamposPedidoExpor"); 

		this.jPanelCamposOcultosPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPedidoExpor.setName("jPanelCamposOcultosPedidoExpor"); 

        this.jPanelAccionesPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedidoExpor.setToolTipText("Acciones");
        this.jPanelAccionesPedidoExpor.setName("Acciones"); 

		this.jPanelAccionesFormularioPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPedidoExpor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPedidoExpor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalPedidoExpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalPedidoExpor.setName("jPanelCamposFintotalPedidoExpor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPedidoExpor.setText("Nuevo");
		this.jButtonModificarPedidoExpor.setText("Editar");
        this.jButtonActualizarPedidoExpor.setText("Actualizar");
        this.jButtonEliminarPedidoExpor.setText("Eliminar");
        this.jButtonCancelarPedidoExpor.setText("Cancelar");
        this.jButtonGuardarCambiosPedidoExpor.setText("Guardar");
		this.jButtonGuardarCambiosTablaPedidoExpor.setText("Guardar");
		this.jButtonCerrarPedidoExpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedidoExpor,"nuevo_button","Nuevo",this.pedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPedidoExpor,"modificar_button","Editar",this.pedidoexporSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPedidoExpor,"actualizar_button","Actualizar",this.pedidoexporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPedidoExpor,"eliminar_button","Eliminar",this.pedidoexporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPedidoExpor,"cancelar_button","Cancelar",this.pedidoexporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPedidoExpor,"guardarcambios_button","Guardar",this.pedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedidoExpor,"guardarcambiostabla_button","Guardar",this.pedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedidoExpor,"cerrar_button","Salir",this.pedidoexporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPedidoExpor.setToolTipText("Nuevo"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPedidoExpor.setToolTipText("Editar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPedidoExpor.setToolTipText("Actualizar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPedidoExpor.setToolTipText("Eliminar)"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPedidoExpor.setToolTipText("Cancelar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPedidoExpor.setToolTipText("Guardar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPedidoExpor.setToolTipText("Guardar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedidoExpor.setToolTipText("Salir"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedidoExpor";
		inputMap = this.jButtonNuevoPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedidoExpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedidoExpor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPedidoExpor";
		inputMap = this.jButtonActualizarPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPedidoExpor"));
		
		//ELIMINAR
		sMapKey = "EliminarPedidoExpor";
		inputMap = this.jButtonEliminarPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPedidoExpor"));
		
		//CANCELAR	
		sMapKey = "CancelarPedidoExpor";
		inputMap = this.jButtonCancelarPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPedidoExpor"));
		
		//CERRAR		
		sMapKey = "CerrarPedidoExpor";
		inputMap = this.jButtonCerrarPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedidoExpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedidoExpor";
		inputMap = this.jButtonGuardarCambiosTablaPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedidoExpor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPedidoExpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPedidoExpor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPedidoExpor.setToolTipText("Nuevo PedidoExpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPedidoExpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPedidoExpor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPedidoExpor.setToolTipText("Sin Cerrar Ventana PedidoExpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePedidoExpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePedidoExpor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePedidoExpor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedidoExpor.setText("Accion");
		this.jComboBoxTiposAccionesPedidoExpor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPedidoExpor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPedidoExpor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPedidoExpor = new JLabelMe();
		
		this.jLabelAccionesPedidoExpor.setText("Acciones");		
		this.jLabelAccionesPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPedidoExpor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPedidoExpor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPedidoExpor=new JTabbedPane();
		this.jTabbedPaneRelacionesPedidoExpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPedidoExpor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPedidoExpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoExpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoExpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPedidoExpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedidoExpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedidoExpor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPedidoExpor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPedidoExpor = new GridBagLayout();
		
		this.jPanelCamposPedidoExpor.setLayout(gridaBagLayoutCamposPedidoExpor);
		this.jPanelCamposOcultosPedidoExpor.setLayout(gridaBagLayoutCamposOcultosPedidoExpor);
		
		

		GridBagLayout gridaBagLayoutCamposFintotalPedidoExpor= new GridBagLayout();
		this.jPanelCamposFintotalPedidoExpor.setLayout(gridaBagLayoutCamposFintotalPedidoExpor);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPedidoExpor.add(jLabelIdPedidoExpor, this.gridBagConstraintsPedidoExpor);



	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPedidoExpor.add(jLabelidPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPedidoExpor.add(jLabelid_empresaPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedidoExpor.add(jButtonid_empresaPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedidoExpor.add(jButtonid_empresaPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPedidoExpor.add(jComboBoxid_empresaPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPedidoExpor.add(jLabelid_sucursalPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPedidoExpor.add(jButtonid_sucursalPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPedidoExpor.add(jButtonid_sucursalPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPedidoExpor.add(jComboBoxid_sucursalPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPedidoExpor.add(jLabelid_ejercicioPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPedidoExpor.add(jButtonid_ejercicioPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPedidoExpor.add(jButtonid_ejercicioPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPedidoExpor.add(jComboBoxid_ejercicioPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoPedidoExpor.add(jLabelid_periodoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPedidoExpor.add(jButtonid_periodoPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPedidoExpor.add(jButtonid_periodoPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoPedidoExpor.add(jComboBoxid_periodoPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioPedidoExpor.add(jLabelid_anioPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPedidoExpor.add(jButtonid_anioPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPedidoExpor.add(jButtonid_anioPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioPedidoExpor.add(jComboBoxid_anioPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesPedidoExpor.add(jLabelid_mesPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPedidoExpor.add(jButtonid_mesPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPedidoExpor.add(jButtonid_mesPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesPedidoExpor.add(jComboBoxid_mesPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioPedidoExpor.add(jLabelid_usuarioPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioPedidoExpor.add(jButtonid_usuarioPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioPedidoExpor.add(jButtonid_usuarioPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioPedidoExpor.add(jComboBoxid_usuarioPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroPedidoExpor.add(jLabelnumeroPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroPedidoExpor.add(jButtonnumeroPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroPedidoExpor.add(jTextFieldnumeroPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_preimpresoPedidoExpor.add(jLabelnumero_preimpresoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_preimpresoPedidoExpor.add(jButtonnumero_preimpresoPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_preimpresoPedidoExpor.add(jTextFieldnumero_preimpresoPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionPedidoExpor.add(jLabelfecha_emisionPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionPedidoExpor.add(jButtonfecha_emisionPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionPedidoExpor.add(jDateChooserfecha_emisionPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoPedidoExpor.add(jLabelfecha_vencimientoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoPedidoExpor.add(jButtonfecha_vencimientoPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoPedidoExpor.add(jDateChooserfecha_vencimientoPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaPedidoExpor.add(jLabelid_monedaPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaPedidoExpor.add(jButtonid_monedaPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaPedidoExpor.add(jButtonid_monedaPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaPedidoExpor.add(jComboBoxid_monedaPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcotizacionPedidoExpor.add(jLabelcotizacionPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcotizacionPedidoExpor.add(jButtoncotizacionPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcotizacionPedidoExpor.add(jTextFieldcotizacionPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoPedidoExpor.add(jLabelid_empleadoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 2;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoPedidoExpor.add(jButtonid_empleadoPedidoExpor, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPedidoExpor.add(jButtonid_empleadoPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 4;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPedidoExpor.add(jButtonid_empleadoPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoPedidoExpor.add(jComboBoxid_empleadoPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_precioPedidoExpor.add(jLabelid_tipo_precioPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioPedidoExpor.add(jButtonid_tipo_precioPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioPedidoExpor.add(jButtonid_tipo_precioPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_precioPedidoExpor.add(jComboBoxid_tipo_precioPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoPedidoExpor.add(jLabelid_formatoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoPedidoExpor.add(jButtonid_formatoPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoPedidoExpor.add(jButtonid_formatoPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoPedidoExpor.add(jComboBoxid_formatoPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionPedidoExpor.add(jLabeldireccionPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionPedidoExpor.add(jButtondireccionPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionPedidoExpor.add(jscrollPanedireccionPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clientePedidoExpor.add(jLabelid_clientePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 2;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clientePedidoExpor.add(jButtonid_clientePedidoExpor, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePedidoExpor.add(jButtonid_clientePedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 4;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePedidoExpor.add(jButtonid_clientePedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clientePedidoExpor.add(jComboBoxid_clientePedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoPedidoExpor.add(jLabeltelefonoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoPedidoExpor.add(jButtontelefonoPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoPedidoExpor.add(jTextFieldtelefonoPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucPedidoExpor.add(jLabelrucPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucPedidoExpor.add(jButtonrucPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucPedidoExpor.add(jTextFieldrucPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisPedidoExpor.add(jLabelid_paisPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisPedidoExpor.add(jButtonid_paisPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisPedidoExpor.add(jButtonid_paisPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisPedidoExpor.add(jComboBoxid_paisPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellugar_entregaPedidoExpor.add(jLabellugar_entregaPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanellugar_entregaPedidoExpor.add(jButtonlugar_entregaPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellugar_entregaPedidoExpor.add(jTextFieldlugar_entregaPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelembarquePedidoExpor.add(jLabelembarquePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelembarquePedidoExpor.add(jButtonembarquePedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelembarquePedidoExpor.add(jscrollPaneembarquePedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnegociacionPedidoExpor.add(jLabelnegociacionPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnegociacionPedidoExpor.add(jButtonnegociacionPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnegociacionPedidoExpor.add(jscrollPanenegociacionPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transportePedidoExpor.add(jLabelid_transportePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportePedidoExpor.add(jButtonid_transportePedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportePedidoExpor.add(jButtonid_transportePedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transportePedidoExpor.add(jComboBoxid_transportePedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorPedidoExpor.add(jLabelid_vendedorPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 2;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorPedidoExpor.add(jButtonid_vendedorPedidoExpor, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 3;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorPedidoExpor.add(jButtonid_vendedorPedidoExporArbol, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 4;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorPedidoExpor.add(jButtonid_vendedorPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 5;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorPedidoExpor.add(jButtonid_vendedorPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorPedidoExpor.add(jComboBoxid_vendedorPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelforma_pagoPedidoExpor.add(jLabelforma_pagoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelforma_pagoPedidoExpor.add(jButtonforma_pagoPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelforma_pagoPedidoExpor.add(jscrollPaneforma_pagoPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sub_clientePedidoExpor.add(jLabelid_sub_clientePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_clientePedidoExpor.add(jButtonid_sub_clientePedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_clientePedidoExpor.add(jButtonid_sub_clientePedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sub_clientePedidoExpor.add(jComboBoxid_sub_clientePedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_consignatarioPedidoExpor.add(jLabelid_consignatarioPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_consignatarioPedidoExpor.add(jButtonid_consignatarioPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_consignatarioPedidoExpor.add(jButtonid_consignatarioPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_consignatarioPedidoExpor.add(jComboBoxid_consignatarioPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_consultorPedidoExpor.add(jLabelid_consultorPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_consultorPedidoExpor.add(jButtonid_consultorPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_consultorPedidoExpor.add(jButtonid_consultorPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_consultorPedidoExpor.add(jComboBoxid_consultorPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenPedidoExpor.add(jLabelordenPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenPedidoExpor.add(jButtonordenPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenPedidoExpor.add(jTextFieldordenPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_pedidoPedidoExpor.add(jLabelid_estado_pedidoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedidoPedidoExpor.add(jButtonid_estado_pedidoPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedidoPedidoExpor.add(jButtonid_estado_pedidoPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_pedidoPedidoExpor.add(jComboBoxid_estado_pedidoPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPedidoExpor.add(jLabeldescripcionPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPedidoExpor.add(jButtondescripcionPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPedidoExpor.add(jscrollPanedescripcionPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmontoPedidoExpor.add(jLabelmontoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelmontoPedidoExpor.add(jButtonmontoPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmontoPedidoExpor.add(jTextFieldmontoPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldoPedidoExpor.add(jLabelsaldoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldoPedidoExpor.add(jButtonsaldoPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldoPedidoExpor.add(jTextFieldsaldoPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldisponiblePedidoExpor.add(jLabeldisponiblePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldisponiblePedidoExpor.add(jButtondisponiblePedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldisponiblePedidoExpor.add(jTextFielddisponiblePedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_porcentajePedidoExpor.add(jLabeldescuento_porcentajePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_porcentajePedidoExpor.add(jButtondescuento_porcentajePedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_porcentajePedidoExpor.add(jTextFielddescuento_porcentajePedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_con_ivaPedidoExpor.add(jLabeltotal_con_ivaPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_con_ivaPedidoExpor.add(jButtontotal_con_ivaPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_con_ivaPedidoExpor.add(jTextFieldtotal_con_ivaPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsumanPedidoExpor.add(jLabelsumanPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelsumanPedidoExpor.add(jButtonsumanPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsumanPedidoExpor.add(jTextFieldsumanPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_valorPedidoExpor.add(jLabeldescuento_valorPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorPedidoExpor.add(jButtondescuento_valorPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_valorPedidoExpor.add(jTextFielddescuento_valorPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_sin_ivaPedidoExpor.add(jLabeltotal_sin_ivaPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaPedidoExpor.add(jButtontotal_sin_ivaPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_sin_ivaPedidoExpor.add(jTextFieldtotal_sin_ivaPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_descuentoPedidoExpor.add(jLabeltotal_descuentoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_descuentoPedidoExpor.add(jButtontotal_descuentoPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_descuentoPedidoExpor.add(jTextFieldtotal_descuentoPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfletePedidoExpor.add(jLabelfletePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfletePedidoExpor.add(jButtonfletePedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfletePedidoExpor.add(jTextFieldfletePedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalPedidoExpor.add(jLabeltotalPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalPedidoExpor.add(jButtontotalPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalPedidoExpor.add(jTextFieldtotalPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsubtotalPedidoExpor.add(jLabelsubtotalPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelsubtotalPedidoExpor.add(jButtonsubtotalPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsubtotalPedidoExpor.add(jTextFieldsubtotalPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsegurosPedidoExpor.add(jLabelsegurosPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelsegurosPedidoExpor.add(jButtonsegurosPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsegurosPedidoExpor.add(jTextFieldsegurosPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaPedidoExpor.add(jLabelivaPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaPedidoExpor.add(jButtonivaPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaPedidoExpor.add(jTextFieldivaPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfinanciamientoPedidoExpor.add(jLabelfinanciamientoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfinanciamientoPedidoExpor.add(jButtonfinanciamientoPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfinanciamientoPedidoExpor.add(jTextFieldfinanciamientoPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_retencionPedidoExpor.add(jLabelmonto_retencionPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_retencionPedidoExpor.add(jButtonmonto_retencionPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_retencionPedidoExpor.add(jTextFieldmonto_retencionPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelotroPedidoExpor.add(jLabelotroPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelotroPedidoExpor.add(jButtonotroPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelotroPedidoExpor.add(jTextFieldotroPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelicePedidoExpor.add(jLabelicePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelicePedidoExpor.add(jButtonicePedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelicePedidoExpor.add(jTextFieldicePedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaPedidoExpor.add(jLabelfechaPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaPedidoExpor.add(jButtonfechaPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaPedidoExpor.add(jDateChooserfechaPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_servidorPedidoExpor.add(jLabelfecha_servidorPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_servidorPedidoExpor.add(jButtonfecha_servidorPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_servidorPedidoExpor.add(jDateChooserfecha_servidorPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cambioPedidoExpor.add(jLabelid_tipo_cambioPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 2;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioPedidoExpor.add(jButtonid_tipo_cambioPedidoExpor, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioPedidoExpor.add(jButtonid_tipo_cambioPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 4;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioPedidoExpor.add(jButtonid_tipo_cambioPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cambioPedidoExpor.add(jComboBoxid_tipo_cambioPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_fuePedidoExpor.add(jLabelnumero_fuePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_fuePedidoExpor.add(jButtonnumero_fuePedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_fuePedidoExpor.add(jTextFieldnumero_fuePedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoPedidoExpor.add(jLabelid_centro_costoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 2;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoPedidoExpor.add(jButtonid_centro_costoPedidoExpor, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 3;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoPedidoExpor.add(jButtonid_centro_costoPedidoExporArbol, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 4;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoPedidoExpor.add(jButtonid_centro_costoPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 5;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoPedidoExpor.add(jButtonid_centro_costoPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoPedidoExpor.add(jComboBoxid_centro_costoPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_responsablePedidoExpor.add(jLabelid_responsablePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_responsablePedidoExpor.add(jButtonid_responsablePedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_responsablePedidoExpor.add(jButtonid_responsablePedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_responsablePedidoExpor.add(jComboBoxid_responsablePedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_inicioPedidoExpor.add(jLabelhora_inicioPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_inicioPedidoExpor.add(jButtonhora_inicioPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_inicioPedidoExpor.add(jSpinnerhora_inicioPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_finPedidoExpor.add(jLabelhora_finPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_finPedidoExpor.add(jButtonhora_finPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_finPedidoExpor.add(jSpinnerhora_finPedidoExpor, this.gridBagConstraintsPedidoExpor);


	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 0;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transportistaPedidoExpor.add(jLabelid_transportistaPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 2;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaPedidoExpor.add(jButtonid_transportistaPedidoExporBusqueda, this.gridBagConstraintsPedidoExpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 3;
		this.gridBagConstraintsPedidoExpor.ipadx = 0;
		this.gridBagConstraintsPedidoExpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaPedidoExpor.add(jButtonid_transportistaPedidoExporUpdate, this.gridBagConstraintsPedidoExpor);
	}

	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoExpor.gridy = 0;
	this.gridBagConstraintsPedidoExpor.gridx = 1;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transportistaPedidoExpor.add(jComboBoxid_transportistaPedidoExpor, this.gridBagConstraintsPedidoExpor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelidPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelnumeroPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelnumero_preimpresoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelfecha_emisionPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelfecha_vencimientoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelid_monedaPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelcotizacionPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelid_empleadoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelid_tipo_precioPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelid_formatoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPaneldireccionPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelid_clientePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPaneltelefonoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelrucPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelid_paisPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanellugar_entregaPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelembarquePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelnegociacionPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelid_transportePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelid_vendedorPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelforma_pagoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelid_sub_clientePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelid_consignatarioPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelid_consultorPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelordenPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelid_estado_pedidoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPaneldescripcionPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelmontoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPanelsaldoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoExpor.add(this.jPaneldisponiblePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposPedidoExpor % 4==0) {
		iXPanelCamposPedidoExpor=0;
		iYPanelCamposPedidoExpor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelid_empresaPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 4==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelid_sucursalPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 4==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelid_ejercicioPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 4==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelid_periodoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 4==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelid_anioPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 4==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelid_mesPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 4==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelid_usuarioPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 4==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelmonto_retencionPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 3==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelotroPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 3==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelicePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 3==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelfechaPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 4==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelfecha_servidorPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 4==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelid_tipo_cambioPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 4==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelnumero_fuePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 4==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelid_centro_costoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 4==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelid_responsablePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 4==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelhora_inicioPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 4==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelhora_finPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 4==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposOcultosPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposOcultosPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoExpor.add(this.jPanelid_transportistaPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposOcultosPedidoExpor % 4==0) {
		iXPanelCamposOcultosPedidoExpor=0;
		iYPanelCamposOcultosPedidoExpor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposFintotalPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposFintotalPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedidoExpor.add(this.jPaneldescuento_porcentajePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposFintotalPedidoExpor % 3==0) {
		iXPanelCamposFintotalPedidoExpor=0;
		iYPanelCamposFintotalPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposFintotalPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposFintotalPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedidoExpor.add(this.jPaneltotal_con_ivaPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposFintotalPedidoExpor % 3==0) {
		iXPanelCamposFintotalPedidoExpor=0;
		iYPanelCamposFintotalPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposFintotalPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposFintotalPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedidoExpor.add(this.jPanelsumanPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposFintotalPedidoExpor % 3==0) {
		iXPanelCamposFintotalPedidoExpor=0;
		iYPanelCamposFintotalPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposFintotalPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposFintotalPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedidoExpor.add(this.jPaneldescuento_valorPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposFintotalPedidoExpor % 3==0) {
		iXPanelCamposFintotalPedidoExpor=0;
		iYPanelCamposFintotalPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposFintotalPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposFintotalPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedidoExpor.add(this.jPaneltotal_sin_ivaPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposFintotalPedidoExpor % 3==0) {
		iXPanelCamposFintotalPedidoExpor=0;
		iYPanelCamposFintotalPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposFintotalPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposFintotalPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedidoExpor.add(this.jPaneltotal_descuentoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposFintotalPedidoExpor % 3==0) {
		iXPanelCamposFintotalPedidoExpor=0;
		iYPanelCamposFintotalPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposFintotalPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposFintotalPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedidoExpor.add(this.jPanelfletePedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposFintotalPedidoExpor % 3==0) {
		iXPanelCamposFintotalPedidoExpor=0;
		iYPanelCamposFintotalPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposFintotalPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposFintotalPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedidoExpor.add(this.jPaneltotalPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposFintotalPedidoExpor % 3==0) {
		iXPanelCamposFintotalPedidoExpor=0;
		iYPanelCamposFintotalPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposFintotalPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposFintotalPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedidoExpor.add(this.jPanelsubtotalPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposFintotalPedidoExpor % 3==0) {
		iXPanelCamposFintotalPedidoExpor=0;
		iYPanelCamposFintotalPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposFintotalPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposFintotalPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedidoExpor.add(this.jPanelsegurosPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposFintotalPedidoExpor % 3==0) {
		iXPanelCamposFintotalPedidoExpor=0;
		iYPanelCamposFintotalPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposFintotalPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposFintotalPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedidoExpor.add(this.jPanelivaPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposFintotalPedidoExpor % 3==0) {
		iXPanelCamposFintotalPedidoExpor=0;
		iYPanelCamposFintotalPedidoExpor++;
	}
	this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoExpor.gridy = iYPanelCamposFintotalPedidoExpor;
	this.gridBagConstraintsPedidoExpor.gridx = iXPanelCamposFintotalPedidoExpor++;
	this.gridBagConstraintsPedidoExpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoExpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalPedidoExpor.add(this.jPanelfinanciamientoPedidoExpor, this.gridBagConstraintsPedidoExpor);



	if(iXPanelCamposFintotalPedidoExpor % 3==0) {
		iXPanelCamposFintotalPedidoExpor=0;
		iYPanelCamposFintotalPedidoExpor++;
	}
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPedidoExpor= new GridBagLayout();
		this.jPanelAccionesPedidoExpor.setLayout(gridaBagLayoutAccionesPedidoExpor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPedidoExpor= new GridBagLayout();
		this.jPanelAccionesFormularioPedidoExpor.setLayout(gridaBagLayoutAccionesFormularioPedidoExpor);
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPedidoExpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPedidoExpor.add(this.jComboBoxTiposAccionesFormularioPedidoExpor, this.gridBagConstraintsPedidoExpor);

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPedidoExpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPedidoExpor.add(this.jCheckBoxPostAccionNuevoPedidoExpor, this.gridBagConstraintsPedidoExpor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.pedidoexporSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPedidoExpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPedidoExpor.add(this.jCheckBoxPostAccionSinCerrarPedidoExpor, this.gridBagConstraintsPedidoExpor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.pedidoexporSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.pedidoexporSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPedidoExpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPedidoExpor.add(this.jCheckBoxPostAccionSinMensajePedidoExpor, this.gridBagConstraintsPedidoExpor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = iPosXAccion++;
			
		this.jPanelAccionesPedidoExpor.add(this.jButtonModificarPedidoExpor, this.gridBagConstraintsPedidoExpor);							

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx =iPosXAccion++;
			
		this.jPanelAccionesPedidoExpor.add(this.jButtonEliminarPedidoExpor, this.gridBagConstraintsPedidoExpor);
		
			
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy = 0;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedidoExpor.add(this.jButtonActualizarPedidoExpor, this.gridBagConstraintsPedidoExpor);


		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy = 0;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedidoExpor.add(this.jButtonGuardarCambiosPedidoExpor, this.gridBagConstraintsPedidoExpor);	
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy = 0;		
		this.gridBagConstraintsPedidoExpor.gridx =iPosXAccion++;
		
		this.jPanelAccionesPedidoExpor.add(this.jButtonCancelarPedidoExpor, this.gridBagConstraintsPedidoExpor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedidoExpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedidoExpor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidoexporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();						
			this.gridBagConstraintsPedidoExpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoExpor.gridx = 0;		
			//this.gridBagConstraintsPedidoExpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedidoExpor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedidoExpor.gridx =0;
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedidoExpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedidoExpor, this.gridBagConstraintsPedidoExpor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PedidoExporJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePedidoExpor = new PedidoExporBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pedido Exportacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Pedido Exportacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pedido Exportacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PedidoExporModel pedidoexporModel=new PedidoExporModel(this);
			
			//SI USARA CLASE INTERNA
			//PedidoExporModel.PedidoExporFocusTraversalPolicy pedidoexporFocusTraversalPolicy = pedidoexporModel.new PedidoExporFocusTraversalPolicy(this);
			
			//pedidoexporFocusTraversalPolicy.setpedidoexporJInternalFrame(this);
			
			this.setFocusTraversalPolicy(pedidoexporModel);
			
			
			this.jContentPaneDetallePedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePedidoExpor = new GridBagLayout();	
			this.jContentPaneDetallePedidoExpor.setLayout(gridaBagLayoutDetallePedidoExpor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedidoExpor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
}
			
			this.jScrollPanelDatosEdicionPedidoExpor=   new JScrollPane(jContentPaneDetallePedidoExpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedidoExpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoExpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoExpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPedidoExpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedidoExpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoExpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoExpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsPedidoExpor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPedidoExpor.gridx = 0;
	        
			this.jContentPaneDetallePedidoExpor.add(jPanelCamposPedidoExpor, gridBagConstraintsPedidoExpor);
			
			
			
			
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
						&& pedidoexporSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetallePedidoExpor(this.puedeCargarPorParteDetallePedidoExpor,false,-1);
					
					if(this.pedidoexporSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPedidoExpor= new GridBagConstraints();
						this.gridBagConstraintsPedidoExpor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPedidoExpor.gridx = 0;
						this.jContentPaneDetallePedidoExpor.add(this.jTabbedPaneRelacionesPedidoExpor, this.gridBagConstraintsPedidoExpor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPedidoExpor.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetallePedidoExpor(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
			
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsPedidoExpor.gridy = iGridyRelaciones++;
		this.gridBagConstraintsPedidoExpor.gridx = 0;

		this.jContentPaneDetallePedidoExpor.add(jPanelCamposFintotalPedidoExpor, gridBagConstraintsPedidoExpor);			
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPedidoExpor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
					this.gridBagConstraintsPedidoExpor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPedidoExpor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPedidoExpor.gridx = 0;
					
				
					this.jContentPaneDetallePedidoExpor.add(jPanelCamposOcultosPedidoExpor, gridBagConstraintsPedidoExpor);
				
					this.jPanelCamposOcultosPedidoExpor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsPedidoExpor.gridx = 0;
	        this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePedidoExpor.add(this.jPanelAccionesFormularioPedidoExpor, this.gridBagConstraintsPedidoExpor);							
			
			
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsPedidoExpor.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsPedidoExpor.gridx = 0;
	        
			
			this.jContentPaneDetallePedidoExpor.add(this.jPanelAccionesPedidoExpor, this.gridBagConstraintsPedidoExpor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPedidoExpor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPedidoExpor=   new JScrollPane(this.jPanelCamposPedidoExpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedidoExpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoExpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoExpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPedidoExpor.gridx = 0;
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPedidoExpor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPedidoExpor, this.gridBagConstraintsPedidoExpor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedidoExpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPedidoExpor, this.gridBagConstraintsPedidoExpor);			
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedidoExpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPedidoExpor, this.gridBagConstraintsPedidoExpor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoExpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedidoExpor, this.gridBagConstraintsPedidoExpor);
			
			
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoExpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedidoExpor, this.gridBagConstraintsPedidoExpor);
		
			
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedidoExpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedidoExpor, this.gridBagConstraintsPedidoExpor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPedidoExpor;//jContentPane;
		
		return jScrollPanelDatosEdicionPedidoExpor;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetallePedidoExpor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallepedidoexporSessionBean=new DetallePedidoExporSessionBean();
		this.detallepedidoexporSessionBean.setConGuardarRelaciones(false);
		this.detallepedidoexporSessionBean.setEsGuardarRelacionado(true);

		this.detallepedidoexporBeanSwingJInternalFrame=null;//new DetallePedidoExporBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallepedidoexporBeanSwingJInternalFramePopup=new DetallePedidoExporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallepedidoexporBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado()) {

				DetallePedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL=PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetallePedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallepedidoexporSessionBean.setEsGuardarRelacionado(true);

				this.detallepedidoexporBeanSwingJInternalFrame=new DetallePedidoExporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallepedidoexporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallepedidoexporBeanSwingJInternalFrame.setdetallepedidoexporSessionBean(this.detallepedidoexporSessionBean);

				//this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
				//this.gridBagConstraintsPedidoExpor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPedidoExpor.gridx = 0;
				//this.jContentPaneDetallePedidoExpor.add(this.detallepedidoexporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPedidoExpor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPedidoExpor.add("Detalle Pedido Exportacions",this.detallepedidoexporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPedidoExpor.setComponentAt(iIndexTab,this.detallepedidoexporBeanSwingJInternalFrame.getContentPane());
				}

				//DetallePedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallepedidoexporSessionBean.setEsGuardarRelacionado(false);
				this.detallepedidoexporBeanSwingJInternalFrame=null;//new DetallePedidoExporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallepedidoexporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetallePedidoExpor) {
					this.jTabbedPaneRelacionesPedidoExpor.add("Detalle Pedido Exportacions",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetallePedidoExporBeanSwingJInternalFrame(List<PedidoExpor> pedidoexpors,PedidoExpor pedidoexpor,DetallePedidoExporBeanSwingJInternalFrame detallepedidoexporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallepedidoexporBeanSwingJInternalFrame=new DetallePedidoExporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallepedidoexporBeanSwingJInternalFrame.getDetallePedidoExporLogic().setConnexion(this.pedidoexporLogic.getConnexion());

					detallepedidoexporBeanSwingJInternalFrame.setpedidoexporsForeignKey(pedidoexpors);
					detallepedidoexporBeanSwingJInternalFrame.setpedidoexporForeignKey(pedidoexpor);
					detallepedidoexporBeanSwingJInternalFrame.detallepedidoexporSessionBean.setisBusquedaDesdeForeignKeySesionPedidoExpor(true);
					detallepedidoexporBeanSwingJInternalFrame.detallepedidoexporSessionBean.setlidPedidoExporActual(pedidoexpor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallepedidoexporBeanSwingJInternalFrame.cargarCombosForeignKeyDetallePedidoExpor(detallepedidoexporBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallepedidoexporBeanSwingJInternalFrame.setVisibilidadBusquedasParaPedidoExpor(true);
					detallepedidoexporBeanSwingJInternalFrame.setid_pedido_exporFK_IdPedidoExpor(pedidoexpor.getId());

					if(!this.conCargarFormDetalle) {
						detallepedidoexporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallepedidoexporBeanSwingJInternalFrame.setSelectedItemCombosFramePedidoExporForeignKey(pedidoexpor,1,false,true,true);
					detallepedidoexporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallepedidoexporBeanSwingJInternalFrame.procesarBusqueda("FK_IdPedidoExpor");
					detallepedidoexporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPedidoExpor");
					detallepedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetallePedidoExpor(true);
					detallepedidoexporBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetallePedidoExpor("n",detallepedidoexporBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallepedidoexporBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallepedidoexporBeanSwingJInternalFrame.setAutoscrolls(true);
					detallepedidoexporBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallepedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePedidoExpor("relacionado");
					} else {
						detallepedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePedidoExpor("no_relacionado");
					}

					detallepedidoexporBeanSwingJInternalFrame.getjButtonRecargarInformacionDetallePedidoExpor().setVisible(false);

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
