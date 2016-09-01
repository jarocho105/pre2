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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.PedidoCompraImporConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class PedidoCompraImporDetalleFormJInternalFrame extends PedidoCompraImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePedidoCompraImpor;
	
	protected JMenuBar jmenuBarDetallePedidoCompraImpor;
	
	protected JMenu jmenuDetallePedidoCompraImpor;
	protected JMenu jmenuDetalleArchivoPedidoCompraImpor;
	protected JMenu jmenuDetalleAccionesPedidoCompraImpor;
	protected JMenu jmenuDetalleDatosPedidoCompraImpor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedidoCompraImpor;	
	protected GridBagConstraints gridBagConstraintsPedidoCompraImpor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PedidoCompraImporBeanSwingJInternalFrameAdditional jInternalFrameDetallePedidoCompraImpor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected ClienteBeanSwingJInternalFrame clienteproveedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_clienteproveedor="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected TipoProrrateoImporBeanSwingJInternalFrame tipoprorrateoimporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprorrateoimpor="";

	protected EmbarcadorBeanSwingJInternalFrame embarcadorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_embarcador="";

	protected TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoviatransporte="";

	protected PuertoBeanSwingJInternalFrame puertoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_puerto="";

	protected PuertoBeanSwingJInternalFrame puertodestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_puertodestino="";

	protected TipoTerminosImporBeanSwingJInternalFrame tipoterminosimporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoterminosimpor="";

	protected EstadoPedidoCompraBeanSwingJInternalFrame estadopedidocompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidocompra="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public PedidoCompraImporSessionBean pedidocompraimporSessionBean;
	
	

	public DetallePedidoCompraImporBeanSwingJInternalFrame detallepedidocompraimporBeanSwingJInternalFrame=null;
	public DetallePedidoCompraImporBeanSwingJInternalFrame detallepedidocompraimporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetallePedidoCompraImpor=false;
	public DetallePedidoCompraImporSessionBean detallepedidocompraimporSessionBean;

	public LiquidacionImpuestoImporBeanSwingJInternalFrame liquidacionimpuestoimporBeanSwingJInternalFrame=null;
	public LiquidacionImpuestoImporBeanSwingJInternalFrame liquidacionimpuestoimporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteLiquidacionImpuestoImpor=false;
	public LiquidacionImpuestoImporSessionBean liquidacionimpuestoimporSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public PaisSessionBean paisSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public ClienteSessionBean clienteproveedorSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public TipoProrrateoImporSessionBean tipoprorrateoimporSessionBean;
	public EmbarcadorSessionBean embarcadorSessionBean;
	public TipoViaTransporteSessionBean tipoviatransporteSessionBean;
	public PuertoSessionBean puertoSessionBean;
	public PuertoSessionBean puertodestinoSessionBean;
	public TipoTerminosImporSessionBean tipoterminosimporSessionBean;
	public EstadoPedidoCompraSessionBean estadopedidocompraSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public PedidoCompraImporLogic pedidocompraimporLogic;
	
	public JScrollPane jScrollPanelDatosPedidoCompraImpor;
	public JScrollPane jScrollPanelDatosEdicionPedidoCompraImpor;
	public JScrollPane jScrollPanelDatosGeneralPedidoCompraImpor;
	
	protected JPanel jPanelCamposPedidoCompraImpor;    
	protected JPanel jPanelCamposOcultosPedidoCompraImpor;    	
	protected JPanel jPanelAccionesPedidoCompraImpor;
	protected JPanel jPanelAccionesFormularioPedidoCompraImpor;
    
	
	
	protected Integer iXPanelCamposPedidoCompraImpor=0;
	protected Integer iYPanelCamposPedidoCompraImpor=0;
	
	protected Integer iXPanelCamposOcultosPedidoCompraImpor=0;
	protected Integer iYPanelCamposOcultosPedidoCompraImpor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPedidoCompraImpor;
	public JButton jButtonModificarPedidoCompraImpor;
	public JButton jButtonActualizarPedidoCompraImpor;
    public JButton jButtonEliminarPedidoCompraImpor;
	public JButton jButtonCancelarPedidoCompraImpor;
    public JButton jButtonGuardarCambiosPedidoCompraImpor;
	public JButton jButtonGuardarCambiosTablaPedidoCompraImpor;
	protected JButton jButtonCerrarPedidoCompraImpor;
	
	
	protected JButton jButtonProcesarInformacionPedidoCompraImpor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPedidoCompraImpor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPedidoCompraImpor;
	protected JCheckBox jCheckBoxPostAccionSinMensajePedidoCompraImpor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedidoCompraImpor;
	protected JButton jButtonModificarToolBarPedidoCompraImpor;
	protected JButton jButtonActualizarToolBarPedidoCompraImpor;
    protected JButton jButtonEliminarToolBarPedidoCompraImpor;
	protected JButton jButtonCancelarToolBarPedidoCompraImpor;
    protected JButton jButtonGuardarCambiosToolBarPedidoCompraImpor;
	protected JButton jButtonGuardarCambiosTablaToolBarPedidoCompraImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarPedidoCompraImpor;
	protected JButton jButtonCerrarToolBarPedidoCompraImpor;
	
	protected JButton jButtonProcesarInformacionToolBarPedidoCompraImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedidoCompraImpor;
	protected JMenuItem jMenuItemModificarPedidoCompraImpor;
	protected JMenuItem jMenuItemActualizarPedidoCompraImpor;
    protected JMenuItem jMenuItemEliminarPedidoCompraImpor;
	protected JMenuItem jMenuItemCancelarPedidoCompraImpor;
    protected JMenuItem jMenuItemGuardarCambiosPedidoCompraImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedidoCompraImpor;
	protected JMenuItem jMenuItemCerrarPedidoCompraImpor;
	protected JMenuItem jMenuItemDetalleCerrarPedidoCompraImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedidoCompraImpor;
	
	protected JMenuItem jMenuItemProcesarInformacionPedidoCompraImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedidoCompraImpor;
	protected JMenuItem jMenuItemMostrarOcultarPedidoCompraImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedidoCompraImpor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedidoCompraImpor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPedidoCompraImpor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPedidoCompraImpor;
	public JLabel jLabelIdPedidoCompraImpor;
	public JLabel jLabelidPedidoCompraImpor;
	public JButton jButtonidPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelforma_pagoPedidoCompraImpor;
	public JLabel jLabelforma_pagoPedidoCompraImpor;
	public JTextField jTextFieldforma_pagoPedidoCompraImpor;
	public JButton jButtonforma_pagoPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelnumero_duiPedidoCompraImpor;
	public JLabel jLabelnumero_duiPedidoCompraImpor;
	public JTextField jTextFieldnumero_duiPedidoCompraImpor;
	public JButton jButtonnumero_duiPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialPedidoCompraImpor;
	public JLabel jLabelsecuencialPedidoCompraImpor;
	public JTextField jTextFieldsecuencialPedidoCompraImpor;
	public JButton jButtonsecuencialPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelnumero_ordenPedidoCompraImpor;
	public JLabel jLabelnumero_ordenPedidoCompraImpor;
	public JTextField jTextFieldnumero_ordenPedidoCompraImpor;
	public JButton jButtonnumero_ordenPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPaneluso_enPedidoCompraImpor;
	public JLabel jLabeluso_enPedidoCompraImpor;
	public JTextField jTextFielduso_enPedidoCompraImpor;
	public JButton jButtonuso_enPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelresponsablePedidoCompraImpor;
	public JLabel jLabelresponsablePedidoCompraImpor;
	public JTextArea jTextArearesponsablePedidoCompraImpor;
	public JScrollPane jscrollPaneresponsablePedidoCompraImpor;
	public JButton jButtonresponsablePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelorden_compraPedidoCompraImpor;
	public JLabel jLabelorden_compraPedidoCompraImpor;
	public JTextField jTextFieldorden_compraPedidoCompraImpor;
	public JButton jButtonorden_compraPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanellugar_entregaPedidoCompraImpor;
	public JLabel jLabellugar_entregaPedidoCompraImpor;
	public JTextField jTextFieldlugar_entregaPedidoCompraImpor;
	public JButton jButtonlugar_entregaPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPedidoCompraImpor;
	public JLabel jLabeldescripcionPedidoCompraImpor;
	public JTextArea jTextAreadescripcionPedidoCompraImpor;
	public JScrollPane jscrollPanedescripcionPedidoCompraImpor;
	public JButton jButtondescripcionPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelfechaPedidoCompraImpor;
	public JLabel jLabelfechaPedidoCompraImpor;
	//public JFormattedTextField jDateChooserfechaPedidoCompraImpor;

	public JDateChooser jDateChooserfechaPedidoCompraImpor;
	public JButton jButtonfechaPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionPedidoCompraImpor;
	public JLabel jLabelfecha_emisionPedidoCompraImpor;
	//public JFormattedTextField jDateChooserfecha_emisionPedidoCompraImpor;

	public JDateChooser jDateChooserfecha_emisionPedidoCompraImpor;
	public JButton jButtonfecha_emisionPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entregaPedidoCompraImpor;
	public JLabel jLabelfecha_entregaPedidoCompraImpor;
	//public JFormattedTextField jDateChooserfecha_entregaPedidoCompraImpor;

	public JDateChooser jDateChooserfecha_entregaPedidoCompraImpor;
	public JButton jButtonfecha_entregaPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entrega_clientePedidoCompraImpor;
	public JLabel jLabelfecha_entrega_clientePedidoCompraImpor;
	//public JFormattedTextField jDateChooserfecha_entrega_clientePedidoCompraImpor;

	public JDateChooser jDateChooserfecha_entrega_clientePedidoCompraImpor;
	public JButton jButtonfecha_entrega_clientePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelnombre_seguroPedidoCompraImpor;
	public JLabel jLabelnombre_seguroPedidoCompraImpor;
	public JTextField jTextFieldnombre_seguroPedidoCompraImpor;
	public JButton jButtonnombre_seguroPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelnombre_consignatarioPedidoCompraImpor;
	public JLabel jLabelnombre_consignatarioPedidoCompraImpor;
	public JTextField jTextFieldnombre_consignatarioPedidoCompraImpor;
	public JButton jButtonnombre_consignatarioPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelpreciosPedidoCompraImpor;
	public JLabel jLabelpreciosPedidoCompraImpor;
	public JTextField jTextFieldpreciosPedidoCompraImpor;
	public JButton jButtonpreciosPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelfletePedidoCompraImpor;
	public JLabel jLabelfletePedidoCompraImpor;
	public JTextField jTextFieldfletePedidoCompraImpor;
	public JButton jButtonfletePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelseguroPedidoCompraImpor;
	public JLabel jLabelseguroPedidoCompraImpor;
	public JTextField jTextFieldseguroPedidoCompraImpor;
	public JButton jButtonseguroPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelgastosPedidoCompraImpor;
	public JLabel jLabelgastosPedidoCompraImpor;
	public JTextField jTextFieldgastosPedidoCompraImpor;
	public JButton jButtongastosPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelcfrPedidoCompraImpor;
	public JLabel jLabelcfrPedidoCompraImpor;
	public JTextField jTextFieldcfrPedidoCompraImpor;
	public JButton jButtoncfrPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelcifPedidoCompraImpor;
	public JLabel jLabelcifPedidoCompraImpor;
	public JTextField jTextFieldcifPedidoCompraImpor;
	public JButton jButtoncifPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPaneltotalPedidoCompraImpor;
	public JLabel jLabeltotalPedidoCompraImpor;
	public JTextField jTextFieldtotalPedidoCompraImpor;
	public JButton jButtontotalPedidoCompraImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPedidoCompraImpor;
	public JLabel jLabelid_empresaPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPedidoCompraImpor;
	public JButton jButtonid_empresaPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_empresaPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_empresaPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPedidoCompraImpor;
	public JLabel jLabelid_sucursalPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPedidoCompraImpor;
	public JButton jButtonid_sucursalPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_sucursalPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloPedidoCompraImpor;
	public JLabel jLabelid_moduloPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloPedidoCompraImpor;
	public JButton jButtonid_moduloPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_moduloPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_moduloPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPedidoCompraImpor;
	public JLabel jLabelid_ejercicioPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPedidoCompraImpor;
	public JButton jButtonid_ejercicioPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_ejercicioPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoPedidoCompraImpor;
	public JLabel jLabelid_periodoPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoPedidoCompraImpor;
	public JButton jButtonid_periodoPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_periodoPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_periodoPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_paisPedidoCompraImpor;
	public JLabel jLabelid_paisPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisPedidoCompraImpor;
	public JButton jButtonid_paisPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_paisPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_paisPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_clientePedidoCompraImpor;
	public JLabel jLabelid_clientePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clientePedidoCompraImpor;
	public JButton jButtonid_clientePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_clientePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_clientePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_cliente_proveedorPedidoCompraImpor;
	public JLabel jLabelid_cliente_proveedorPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cliente_proveedorPedidoCompraImpor;
	public JButton jButtonid_cliente_proveedorPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_cliente_proveedorPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_cliente_proveedorPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoPedidoCompraImpor;
	public JLabel jLabelid_empleadoPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoPedidoCompraImpor;
	public JButton jButtonid_empleadoPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_empleadoPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_empleadoPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioPedidoCompraImpor;
	public JLabel jLabelid_usuarioPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioPedidoCompraImpor;
	public JButton jButtonid_usuarioPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_usuarioPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_usuarioPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cambioPedidoCompraImpor;
	public JLabel jLabelid_tipo_cambioPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioPedidoCompraImpor;
	public JButton jButtonid_tipo_cambioPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_tipo_cambioPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaPedidoCompraImpor;
	public JLabel jLabelid_monedaPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaPedidoCompraImpor;
	public JButton jButtonid_monedaPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_monedaPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_monedaPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_prorrateo_imporPedidoCompraImpor;
	public JLabel jLabelid_tipo_prorrateo_imporPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_prorrateo_imporPedidoCompraImpor;
	public JButton jButtonid_tipo_prorrateo_imporPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_tipo_prorrateo_imporPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_tipo_prorrateo_imporPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_embarcadorPedidoCompraImpor;
	public JLabel jLabelid_embarcadorPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_embarcadorPedidoCompraImpor;
	public JButton jButtonid_embarcadorPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_embarcadorPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_embarcadorPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_via_transportePedidoCompraImpor;
	public JLabel jLabelid_tipo_via_transportePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_via_transportePedidoCompraImpor;
	public JButton jButtonid_tipo_via_transportePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_tipo_via_transportePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_tipo_via_transportePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_puertoPedidoCompraImpor;
	public JLabel jLabelid_puertoPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_puertoPedidoCompraImpor;
	public JButton jButtonid_puertoPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_puertoPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_puertoPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_puerto_destinoPedidoCompraImpor;
	public JLabel jLabelid_puerto_destinoPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_puerto_destinoPedidoCompraImpor;
	public JButton jButtonid_puerto_destinoPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_puerto_destinoPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_puerto_destinoPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_terminos_imporPedidoCompraImpor;
	public JLabel jLabelid_tipo_terminos_imporPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_terminos_imporPedidoCompraImpor;
	public JButton jButtonid_tipo_terminos_imporPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_tipo_terminos_imporPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_tipo_terminos_imporPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_pedido_compraPedidoCompraImpor;
	public JLabel jLabelid_estado_pedido_compraPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_compraPedidoCompraImpor;
	public JButton jButtonid_estado_pedido_compraPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_estado_pedido_compraPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_compraPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoPedidoCompraImpor;
	public JLabel jLabelid_formatoPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoPedidoCompraImpor;
	public JButton jButtonid_formatoPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_formatoPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_formatoPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_anioPedidoCompraImpor;
	public JLabel jLabelid_anioPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioPedidoCompraImpor;
	public JButton jButtonid_anioPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_anioPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_anioPedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_mesPedidoCompraImpor;
	public JLabel jLabelid_mesPedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesPedidoCompraImpor;
	public JButton jButtonid_mesPedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_mesPedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_mesPedidoCompraImporBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPedidoCompraImpor;
	
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
	public int iHeightFormulario=1408;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PedidoCompraImporDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPedidoCompraImpor=new JPanel();
				this.jPanelAccionesFormularioPedidoCompraImpor=new JPanel();
				this.jmenuBarDetallePedidoCompraImpor=new JMenuBar();
				this.jTtoolBarDetallePedidoCompraImpor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoCompraImporDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PedidoCompraImporDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoCompraImporDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoCompraImporDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoCompraImporDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPedidoCompraImpor() {
		return this.jButtonActualizarToolBarPedidoCompraImpor;
	}
	
	public JButton getjButtonEliminarToolBarPedidoCompraImpor() {
		return this.jButtonEliminarToolBarPedidoCompraImpor;
	}
	
	public JButton getjButtonCancelarToolBarPedidoCompraImpor() {
		return this.jButtonCancelarToolBarPedidoCompraImpor;
	}		
	
	public JButton getjButtonProcesarInformacionPedidoCompraImpor() {
		return this.jButtonProcesarInformacionPedidoCompraImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedidoCompraImpor)	{
		this.jButtonProcesarInformacionPedidoCompraImpor = jButtonProcesarInformacionPedidoCompraImpor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedidoCompraImpor() {
		return this.jComboBoxTiposAccionesPedidoCompraImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedidoCompraImpor(
			JComboBox jComboBoxTiposRelacionesPedidoCompraImpor) {
		this.jComboBoxTiposRelacionesPedidoCompraImpor = jComboBoxTiposRelacionesPedidoCompraImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedidoCompraImpor(
			JComboBox jComboBoxTiposAccionesPedidoCompraImpor) {
		this.jComboBoxTiposAccionesPedidoCompraImpor = jComboBoxTiposAccionesPedidoCompraImpor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPedidoCompraImpor() {
		return this.jComboBoxTiposAccionesFormularioPedidoCompraImpor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPedidoCompraImpor(
			JComboBox jComboBoxTiposAccionesFormularioPedidoCompraImpor) {
		this.jComboBoxTiposAccionesFormularioPedidoCompraImpor = jComboBoxTiposAccionesFormularioPedidoCompraImpor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.pedidocompraimporSessionBean=new PedidoCompraImporSessionBean();
		
		this.pedidocompraimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidocompraimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidocompraimporSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detallepedidocompraimporSessionBean=new DetallePedidoCompraImporSessionBean();
		//this.liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidoCompraImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedido Compra MANTENIMIENTO"));
		
		
		if(iWidth > 3850) {
			iWidth=3850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.pedidocompraimporSessionBean.getEsGuardarRelacionado()) {
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
	
		PedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePedidoCompraImpor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPedidoCompraImpor=new JButtonMe();
				this.jButtonModificarToolBarPedidoCompraImpor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPedidoCompraImpor,this.jTtoolBarDetallePedidoCompraImpor,
							"actualizar","actualizar","Actualizar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPedidoCompraImpor,this.jTtoolBarDetallePedidoCompraImpor,
							"eliminar","eliminar","Eliminar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPedidoCompraImpor,this.jTtoolBarDetallePedidoCompraImpor,
							"cancelar","cancelar","Cancelar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPedidoCompraImpor,this.jTtoolBarDetallePedidoCompraImpor,
							"guardarcambios","guardarcambios","Guardar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePedidoCompraImpor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePedidoCompraImpor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPedidoCompraImpor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPedidoCompraImpor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPedidoCompraImpor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedidoCompraImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedidoCompraImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedidoCompraImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPedidoCompraImpor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPedidoCompraImpor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPedidoCompraImpor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPedidoCompraImpor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPedidoCompraImpor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPedidoCompraImpor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPedidoCompraImpor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPedidoCompraImpor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPedidoCompraImpor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPedidoCompraImpor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPedidoCompraImpor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPedidoCompraImpor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPedidoCompraImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedidoCompraImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedidoCompraImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedidoCompraImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedidoCompraImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedidoCompraImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPedidoCompraImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPedidoCompraImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPedidoCompraImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedidoCompraImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedidoCompraImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedidoCompraImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedidoCompraImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedidoCompraImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedidoCompraImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPedidoCompraImpor.add(this.jMenuItemDetalleCerrarPedidoCompraImpor);
		
		this.jmenuDetalleAccionesPedidoCompraImpor.add(this.jMenuItemActualizarPedidoCompraImpor);
		this.jmenuDetalleAccionesPedidoCompraImpor.add(this.jMenuItemEliminarPedidoCompraImpor);
		this.jmenuDetalleAccionesPedidoCompraImpor.add(this.jMenuItemCancelarPedidoCompraImpor);		
		
		//this.jmenuDetalleDatosPedidoCompraImpor.add(this.jMenuItemDetalleAbrirOrderByPedidoCompraImpor);				
		this.jmenuDetalleDatosPedidoCompraImpor.add(this.jMenuItemDetalleMostarOcultarPedidoCompraImpor);				
				
		//this.jmenuDetalleAccionesPedidoCompraImpor.add(this.jMenuItemGuardarCambiosPedidoCompraImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePedidoCompraImpor.add(this.jmenuDetalleArchivoPedidoCompraImpor);		
		this.jmenuBarDetallePedidoCompraImpor.add(this.jmenuDetalleAccionesPedidoCompraImpor);		
		this.jmenuBarDetallePedidoCompraImpor.add(this.jmenuDetalleDatosPedidoCompraImpor);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePedidoCompraImpor.add(this.jmenuDetallePedidoCompraImpor);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePedidoCompraImpor);				
	}
	
	
	public void inicializarElementosCamposPedidoCompraImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPedidoCompraImpor = new JLabelMe();
		jLabelIdPedidoCompraImpor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPedidoCompraImpor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPedidoCompraImpor= new GridBagLayout();

		this.jPanelidPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);

		jLabelidPedidoCompraImpor = new JLabel();
		jLabelidPedidoCompraImpor.setText("Id");

		jLabelidPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelforma_pagoPedidoCompraImpor = new JLabelMe();
		this.jLabelforma_pagoPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_FORMAPAGO+" : *");
		this.jLabelforma_pagoPedidoCompraImpor.setToolTipText("Forma Pago");
		this.jLabelforma_pagoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelforma_pagoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelforma_pagoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelforma_pagoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelforma_pagoPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelforma_pagoPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_FORMAPAGO);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelforma_pagoPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextFieldforma_pagoPedidoCompraImpor= new JTextFieldMe();

		jTextFieldforma_pagoPedidoCompraImpor.setEnabled(false);
		jTextFieldforma_pagoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldforma_pagoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldforma_pagoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldforma_pagoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonforma_pagoPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonforma_pagoPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonforma_pagoPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonforma_pagoPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonforma_pagoPedidoCompraImporBusqueda.setText("U");
		this.jButtonforma_pagoPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonforma_pagoPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonforma_pagoPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldforma_pagoPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldforma_pagoPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"forma_pagoPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonforma_pagoPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelnumero_duiPedidoCompraImpor = new JLabelMe();
		this.jLabelnumero_duiPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_NUMERODUI+" : *");
		this.jLabelnumero_duiPedidoCompraImpor.setToolTipText("Numero Dui");
		this.jLabelnumero_duiPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_duiPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_duiPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_duiPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_duiPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_duiPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_NUMERODUI);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelnumero_duiPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextFieldnumero_duiPedidoCompraImpor= new JTextFieldMe();

		jTextFieldnumero_duiPedidoCompraImpor.setEnabled(false);
		jTextFieldnumero_duiPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_duiPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_duiPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_duiPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_duiPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonnumero_duiPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_duiPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_duiPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_duiPedidoCompraImporBusqueda.setText("U");
		this.jButtonnumero_duiPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_duiPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_duiPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_duiPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_duiPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_duiPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_duiPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialPedidoCompraImpor = new JLabelMe();
		this.jLabelsecuencialPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialPedidoCompraImpor.setToolTipText("Secuencial");
		this.jLabelsecuencialPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelsecuencialPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextFieldsecuencialPedidoCompraImpor= new JTextFieldMe();

		jTextFieldsecuencialPedidoCompraImpor.setEnabled(false);
		jTextFieldsecuencialPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonsecuencialPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialPedidoCompraImporBusqueda.setText("U");
		this.jButtonsecuencialPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelnumero_ordenPedidoCompraImpor = new JLabelMe();
		this.jLabelnumero_ordenPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_NUMEROORDEN+" : *");
		this.jLabelnumero_ordenPedidoCompraImpor.setToolTipText("Numero Orden");
		this.jLabelnumero_ordenPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_ordenPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_ordenPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_ordenPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_ordenPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_ordenPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_NUMEROORDEN);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelnumero_ordenPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextFieldnumero_ordenPedidoCompraImpor= new JTextFieldMe();
		jTextFieldnumero_ordenPedidoCompraImpor.setEnabled(false);
		jTextFieldnumero_ordenPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_ordenPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_ordenPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_ordenPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_ordenPedidoCompraImpor.setText("0");

		this.jButtonnumero_ordenPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonnumero_ordenPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_ordenPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_ordenPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_ordenPedidoCompraImporBusqueda.setText("U");
		this.jButtonnumero_ordenPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_ordenPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_ordenPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_ordenPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_ordenPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_ordenPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_ordenPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabeluso_enPedidoCompraImpor = new JLabelMe();
		this.jLabeluso_enPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_USOEN+" : *");
		this.jLabeluso_enPedidoCompraImpor.setToolTipText("Uso En");
		this.jLabeluso_enPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeluso_enPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeluso_enPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeluso_enPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneluso_enPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneluso_enPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_USOEN);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPaneluso_enPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextFielduso_enPedidoCompraImpor= new JTextFieldMe();

		jTextFielduso_enPedidoCompraImpor.setEnabled(false);
		jTextFielduso_enPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielduso_enPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielduso_enPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielduso_enPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonuso_enPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonuso_enPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonuso_enPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonuso_enPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonuso_enPedidoCompraImporBusqueda.setText("U");
		this.jButtonuso_enPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonuso_enPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonuso_enPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielduso_enPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielduso_enPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"uso_enPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonuso_enPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelresponsablePedidoCompraImpor = new JLabelMe();
		this.jLabelresponsablePedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_RESPONSABLE+" : *");
		this.jLabelresponsablePedidoCompraImpor.setToolTipText("Responsable");
		this.jLabelresponsablePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresponsablePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresponsablePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelresponsablePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelresponsablePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelresponsablePedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_RESPONSABLE);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelresponsablePedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextArearesponsablePedidoCompraImpor= new JTextAreaMe();
		jTextArearesponsablePedidoCompraImpor.setEnabled(false);
		jTextArearesponsablePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsablePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsablePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsablePedidoCompraImpor.setLineWrap(true);
		jTextArearesponsablePedidoCompraImpor.setWrapStyleWord(true);
		jTextArearesponsablePedidoCompraImpor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearesponsablePedidoCompraImpor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextArearesponsablePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneresponsablePedidoCompraImpor = new JScrollPane(jTextArearesponsablePedidoCompraImpor);
		jscrollPaneresponsablePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneresponsablePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneresponsablePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonresponsablePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonresponsablePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsablePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsablePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonresponsablePedidoCompraImporBusqueda.setText("U");
		this.jButtonresponsablePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonresponsablePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonresponsablePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearesponsablePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearesponsablePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"responsablePedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonresponsablePedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelorden_compraPedidoCompraImpor = new JLabelMe();
		this.jLabelorden_compraPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_ORDENCOMPRA+" : *");
		this.jLabelorden_compraPedidoCompraImpor.setToolTipText("Orden Compra");
		this.jLabelorden_compraPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelorden_compraPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelorden_compraPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelorden_compraPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelorden_compraPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelorden_compraPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_ORDENCOMPRA);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelorden_compraPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextFieldorden_compraPedidoCompraImpor= new JTextFieldMe();

		jTextFieldorden_compraPedidoCompraImpor.setEnabled(false);
		jTextFieldorden_compraPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldorden_compraPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldorden_compraPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldorden_compraPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonorden_compraPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonorden_compraPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonorden_compraPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonorden_compraPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonorden_compraPedidoCompraImporBusqueda.setText("U");
		this.jButtonorden_compraPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonorden_compraPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonorden_compraPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldorden_compraPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldorden_compraPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"orden_compraPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonorden_compraPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabellugar_entregaPedidoCompraImpor = new JLabelMe();
		this.jLabellugar_entregaPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_LUGARENTREGA+" : *");
		this.jLabellugar_entregaPedidoCompraImpor.setToolTipText("Lugar Entrega");
		this.jLabellugar_entregaPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellugar_entregaPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellugar_entregaPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellugar_entregaPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellugar_entregaPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellugar_entregaPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_LUGARENTREGA);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanellugar_entregaPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextFieldlugar_entregaPedidoCompraImpor= new JTextFieldMe();

		jTextFieldlugar_entregaPedidoCompraImpor.setEnabled(false);
		jTextFieldlugar_entregaPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlugar_entregaPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlugar_entregaPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlugar_entregaPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonlugar_entregaPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonlugar_entregaPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlugar_entregaPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlugar_entregaPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlugar_entregaPedidoCompraImporBusqueda.setText("U");
		this.jButtonlugar_entregaPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlugar_entregaPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlugar_entregaPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlugar_entregaPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlugar_entregaPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"lugar_entregaPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlugar_entregaPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPedidoCompraImpor = new JLabelMe();
		this.jLabeldescripcionPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionPedidoCompraImpor.setToolTipText("Descripcion");
		this.jLabeldescripcionPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPaneldescripcionPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextAreadescripcionPedidoCompraImpor= new JTextAreaMe();
		jTextAreadescripcionPedidoCompraImpor.setEnabled(false);
		jTextAreadescripcionPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPedidoCompraImpor.setLineWrap(true);
		jTextAreadescripcionPedidoCompraImpor.setWrapStyleWord(true);
		jTextAreadescripcionPedidoCompraImpor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPedidoCompraImpor.setRows(7);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPedidoCompraImpor = new JScrollPane(jTextAreadescripcionPedidoCompraImpor);
		jscrollPanedescripcionPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtondescripcionPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPedidoCompraImporBusqueda.setText("U");
		this.jButtondescripcionPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelfechaPedidoCompraImpor = new JLabelMe();
		this.jLabelfechaPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaPedidoCompraImpor.setToolTipText("Fecha");
		this.jLabelfechaPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelfechaPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		//jFormattedTextFieldfechaPedidoCompraImpor= new JFormattedTextFieldMe();

		jDateChooserfechaPedidoCompraImpor= new JDateChooser();
		jDateChooserfechaPedidoCompraImpor.setEnabled(false);
		jDateChooserfechaPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaPedidoCompraImpor.setDate(new Date());
		jDateChooserfechaPedidoCompraImpor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaPedidoCompraImpor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonfechaPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaPedidoCompraImporBusqueda.setText("U");
		this.jButtonfechaPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionPedidoCompraImpor = new JLabelMe();
		this.jLabelfecha_emisionPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionPedidoCompraImpor.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelfecha_emisionPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		//jFormattedTextFieldfecha_emisionPedidoCompraImpor= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionPedidoCompraImpor= new JDateChooser();
		jDateChooserfecha_emisionPedidoCompraImpor.setEnabled(false);
		jDateChooserfecha_emisionPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionPedidoCompraImpor.setDate(new Date());
		jDateChooserfecha_emisionPedidoCompraImpor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionPedidoCompraImpor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonfecha_emisionPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionPedidoCompraImporBusqueda.setText("U");
		this.jButtonfecha_emisionPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entregaPedidoCompraImpor = new JLabelMe();
		this.jLabelfecha_entregaPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_FECHAENTREGA+" : *");
		this.jLabelfecha_entregaPedidoCompraImpor.setToolTipText("Fecha Entrega");
		this.jLabelfecha_entregaPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entregaPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entregaPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_FECHAENTREGA);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelfecha_entregaPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		//jFormattedTextFieldfecha_entregaPedidoCompraImpor= new JFormattedTextFieldMe();

		jDateChooserfecha_entregaPedidoCompraImpor= new JDateChooser();
		jDateChooserfecha_entregaPedidoCompraImpor.setEnabled(false);
		jDateChooserfecha_entregaPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entregaPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entregaPedidoCompraImpor.setDate(new Date());
		jDateChooserfecha_entregaPedidoCompraImpor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entregaPedidoCompraImpor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entregaPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonfecha_entregaPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entregaPedidoCompraImporBusqueda.setText("U");
		this.jButtonfecha_entregaPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entregaPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entregaPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entregaPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entregaPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entregaPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entregaPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entrega_clientePedidoCompraImpor = new JLabelMe();
		this.jLabelfecha_entrega_clientePedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_FECHAENTREGACLIENTE+" : *");
		this.jLabelfecha_entrega_clientePedidoCompraImpor.setToolTipText("Fecha Entrega Cliente");
		this.jLabelfecha_entrega_clientePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_entrega_clientePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_entrega_clientePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entrega_clientePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entrega_clientePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entrega_clientePedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_FECHAENTREGACLIENTE);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelfecha_entrega_clientePedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		//jFormattedTextFieldfecha_entrega_clientePedidoCompraImpor= new JFormattedTextFieldMe();

		jDateChooserfecha_entrega_clientePedidoCompraImpor= new JDateChooser();
		jDateChooserfecha_entrega_clientePedidoCompraImpor.setEnabled(false);
		jDateChooserfecha_entrega_clientePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entrega_clientePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entrega_clientePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entrega_clientePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entrega_clientePedidoCompraImpor.setDate(new Date());
		jDateChooserfecha_entrega_clientePedidoCompraImpor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entrega_clientePedidoCompraImpor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entrega_clientePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonfecha_entrega_clientePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entrega_clientePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entrega_clientePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entrega_clientePedidoCompraImporBusqueda.setText("U");
		this.jButtonfecha_entrega_clientePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entrega_clientePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entrega_clientePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entrega_clientePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entrega_clientePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entrega_clientePedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entrega_clientePedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelnombre_seguroPedidoCompraImpor = new JLabelMe();
		this.jLabelnombre_seguroPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_NOMBRESEGURO+" : *");
		this.jLabelnombre_seguroPedidoCompraImpor.setToolTipText("Nombre Seguro");
		this.jLabelnombre_seguroPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_seguroPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_seguroPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_seguroPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_seguroPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_seguroPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_NOMBRESEGURO);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelnombre_seguroPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextFieldnombre_seguroPedidoCompraImpor= new JTextFieldMe();

		jTextFieldnombre_seguroPedidoCompraImpor.setEnabled(false);
		jTextFieldnombre_seguroPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_seguroPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_seguroPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_seguroPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_seguroPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonnombre_seguroPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_seguroPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_seguroPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_seguroPedidoCompraImporBusqueda.setText("U");
		this.jButtonnombre_seguroPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_seguroPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_seguroPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_seguroPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_seguroPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_seguroPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_seguroPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelnombre_consignatarioPedidoCompraImpor = new JLabelMe();
		this.jLabelnombre_consignatarioPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_NOMBRECONSIGNATARIO+" : *");
		this.jLabelnombre_consignatarioPedidoCompraImpor.setToolTipText("Nombre Consignatario");
		this.jLabelnombre_consignatarioPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_consignatarioPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_consignatarioPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_consignatarioPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_consignatarioPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_consignatarioPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_NOMBRECONSIGNATARIO);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelnombre_consignatarioPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextFieldnombre_consignatarioPedidoCompraImpor= new JTextFieldMe();

		jTextFieldnombre_consignatarioPedidoCompraImpor.setEnabled(false);
		jTextFieldnombre_consignatarioPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_consignatarioPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_consignatarioPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_consignatarioPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_consignatarioPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonnombre_consignatarioPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_consignatarioPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_consignatarioPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_consignatarioPedidoCompraImporBusqueda.setText("U");
		this.jButtonnombre_consignatarioPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_consignatarioPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_consignatarioPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_consignatarioPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_consignatarioPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_consignatarioPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_consignatarioPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelpreciosPedidoCompraImpor = new JLabelMe();
		this.jLabelpreciosPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_PRECIOS+" : *");
		this.jLabelpreciosPedidoCompraImpor.setToolTipText("Precios");
		this.jLabelpreciosPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpreciosPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpreciosPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpreciosPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpreciosPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpreciosPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_PRECIOS);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelpreciosPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextFieldpreciosPedidoCompraImpor= new JTextFieldMe();

		jTextFieldpreciosPedidoCompraImpor.setEnabled(false);
		jTextFieldpreciosPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpreciosPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpreciosPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpreciosPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpreciosPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonpreciosPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpreciosPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpreciosPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpreciosPedidoCompraImporBusqueda.setText("U");
		this.jButtonpreciosPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpreciosPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpreciosPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpreciosPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpreciosPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"preciosPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpreciosPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelfletePedidoCompraImpor = new JLabelMe();
		this.jLabelfletePedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfletePedidoCompraImpor.setToolTipText("Flete");
		this.jLabelfletePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfletePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfletePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfletePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfletePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfletePedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelfletePedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextFieldfletePedidoCompraImpor= new JTextFieldMe();
		jTextFieldfletePedidoCompraImpor.setEnabled(false);
		jTextFieldfletePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfletePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfletePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfletePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfletePedidoCompraImpor.setText("0.0");

		this.jButtonfletePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonfletePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfletePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfletePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfletePedidoCompraImporBusqueda.setText("U");
		this.jButtonfletePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfletePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfletePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfletePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfletePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fletePedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfletePedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelseguroPedidoCompraImpor = new JLabelMe();
		this.jLabelseguroPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_SEGURO+" : *");
		this.jLabelseguroPedidoCompraImpor.setToolTipText("Seguro");
		this.jLabelseguroPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelseguroPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelseguroPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelseguroPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelseguroPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelseguroPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_SEGURO);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelseguroPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextFieldseguroPedidoCompraImpor= new JTextFieldMe();
		jTextFieldseguroPedidoCompraImpor.setEnabled(false);
		jTextFieldseguroPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldseguroPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldseguroPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldseguroPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldseguroPedidoCompraImpor.setText("0.0");

		this.jButtonseguroPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonseguroPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonseguroPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonseguroPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonseguroPedidoCompraImporBusqueda.setText("U");
		this.jButtonseguroPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonseguroPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonseguroPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldseguroPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldseguroPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"seguroPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonseguroPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelgastosPedidoCompraImpor = new JLabelMe();
		this.jLabelgastosPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_GASTOS+" : *");
		this.jLabelgastosPedidoCompraImpor.setToolTipText("Gastos");
		this.jLabelgastosPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgastosPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgastosPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgastosPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgastosPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgastosPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_GASTOS);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelgastosPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextFieldgastosPedidoCompraImpor= new JTextFieldMe();
		jTextFieldgastosPedidoCompraImpor.setEnabled(false);
		jTextFieldgastosPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgastosPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgastosPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgastosPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgastosPedidoCompraImpor.setText("0.0");

		this.jButtongastosPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtongastosPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongastosPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongastosPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongastosPedidoCompraImporBusqueda.setText("U");
		this.jButtongastosPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongastosPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongastosPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgastosPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgastosPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gastosPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongastosPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelcfrPedidoCompraImpor = new JLabelMe();
		this.jLabelcfrPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_CFR+" : *");
		this.jLabelcfrPedidoCompraImpor.setToolTipText("Cfr");
		this.jLabelcfrPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcfrPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcfrPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcfrPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcfrPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcfrPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_CFR);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelcfrPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextFieldcfrPedidoCompraImpor= new JTextFieldMe();
		jTextFieldcfrPedidoCompraImpor.setEnabled(false);
		jTextFieldcfrPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcfrPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcfrPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcfrPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcfrPedidoCompraImpor.setText("0.0");

		this.jButtoncfrPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtoncfrPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncfrPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncfrPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncfrPedidoCompraImporBusqueda.setText("U");
		this.jButtoncfrPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncfrPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncfrPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcfrPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcfrPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cfrPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncfrPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelcifPedidoCompraImpor = new JLabelMe();
		this.jLabelcifPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_CIF+" : *");
		this.jLabelcifPedidoCompraImpor.setToolTipText("Cif");
		this.jLabelcifPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcifPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcifPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcifPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcifPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcifPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_CIF);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelcifPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextFieldcifPedidoCompraImpor= new JTextFieldMe();
		jTextFieldcifPedidoCompraImpor.setEnabled(false);
		jTextFieldcifPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcifPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcifPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcifPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcifPedidoCompraImpor.setText("0.0");

		this.jButtoncifPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtoncifPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncifPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncifPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncifPedidoCompraImporBusqueda.setText("U");
		this.jButtoncifPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncifPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncifPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcifPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcifPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cifPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncifPedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabeltotalPedidoCompraImpor = new JLabelMe();
		this.jLabeltotalPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalPedidoCompraImpor.setToolTipText("Total");
		this.jLabeltotalPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPaneltotalPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jTextFieldtotalPedidoCompraImpor= new JTextFieldMe();
		jTextFieldtotalPedidoCompraImpor.setEnabled(false);
		jTextFieldtotalPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalPedidoCompraImpor.setText("0.0");

		this.jButtontotalPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtontotalPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalPedidoCompraImporBusqueda.setText("U");
		this.jButtontotalPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalPedidoCompraImporBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPedidoCompraImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPedidoCompraImpor = new JLabelMe();
		this.jLabelid_empresaPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPedidoCompraImpor.setToolTipText("Empresa");
		this.jLabelid_empresaPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_empresaPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_empresaPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_empresaPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPedidoCompraImpor.setEnabled(false);

		this.jButtonid_empresaPedidoCompraImpor= new JButtonMe();
		this.jButtonid_empresaPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPedidoCompraImpor.setText("Buscar");
		this.jButtonid_empresaPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoCompraImpor"));

		this.jButtonid_empresaPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_empresaPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_empresaPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_empresaPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_empresaPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPedidoCompraImporUpdate.setText("U");
		this.jButtonid_empresaPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPedidoCompraImporUpdate"));



					
		this.jLabelid_sucursalPedidoCompraImpor = new JLabelMe();
		this.jLabelid_sucursalPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPedidoCompraImpor.setToolTipText("Sucursal");
		this.jLabelid_sucursalPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_sucursalPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_sucursalPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_sucursalPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPedidoCompraImpor.setEnabled(false);

		this.jButtonid_sucursalPedidoCompraImpor= new JButtonMe();
		this.jButtonid_sucursalPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPedidoCompraImpor.setText("Buscar");
		this.jButtonid_sucursalPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoCompraImpor"));

		this.jButtonid_sucursalPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_sucursalPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_sucursalPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_sucursalPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPedidoCompraImporUpdate.setText("U");
		this.jButtonid_sucursalPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPedidoCompraImporUpdate"));



					
		this.jLabelid_moduloPedidoCompraImpor = new JLabelMe();
		this.jLabelid_moduloPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloPedidoCompraImpor.setToolTipText("Modulo");
		this.jLabelid_moduloPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_moduloPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_moduloPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_moduloPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloPedidoCompraImpor.setEnabled(false);

		this.jButtonid_moduloPedidoCompraImpor= new JButtonMe();
		this.jButtonid_moduloPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloPedidoCompraImpor.setText("Buscar");
		this.jButtonid_moduloPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloPedidoCompraImpor"));

		this.jButtonid_moduloPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_moduloPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_moduloPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_moduloPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_moduloPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloPedidoCompraImporUpdate.setText("U");
		this.jButtonid_moduloPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloPedidoCompraImporUpdate"));



					
		this.jLabelid_ejercicioPedidoCompraImpor = new JLabelMe();
		this.jLabelid_ejercicioPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPedidoCompraImpor.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_ejercicioPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_ejercicioPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_ejercicioPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioPedidoCompraImpor.setEnabled(false);

		this.jButtonid_ejercicioPedidoCompraImpor= new JButtonMe();
		this.jButtonid_ejercicioPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPedidoCompraImpor.setText("Buscar");
		this.jButtonid_ejercicioPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedidoCompraImpor"));

		this.jButtonid_ejercicioPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_ejercicioPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_ejercicioPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPedidoCompraImporUpdate.setText("U");
		this.jButtonid_ejercicioPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPedidoCompraImporUpdate"));



					
		this.jLabelid_periodoPedidoCompraImpor = new JLabelMe();
		this.jLabelid_periodoPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoPedidoCompraImpor.setToolTipText("Periodo");
		this.jLabelid_periodoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_periodoPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_periodoPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_periodoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoPedidoCompraImpor.setEnabled(false);

		this.jButtonid_periodoPedidoCompraImpor= new JButtonMe();
		this.jButtonid_periodoPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoPedidoCompraImpor.setText("Buscar");
		this.jButtonid_periodoPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedidoCompraImpor"));

		this.jButtonid_periodoPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_periodoPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_periodoPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_periodoPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_periodoPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoPedidoCompraImporUpdate.setText("U");
		this.jButtonid_periodoPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoPedidoCompraImporUpdate"));



					
		this.jLabelid_paisPedidoCompraImpor = new JLabelMe();
		this.jLabelid_paisPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisPedidoCompraImpor.setToolTipText("Pais");
		this.jLabelid_paisPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_paisPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_paisPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_paisPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisPedidoCompraImpor= new JButtonMe();
		this.jButtonid_paisPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisPedidoCompraImpor.setText("Buscar");
		this.jButtonid_paisPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisPedidoCompraImpor"));

		this.jButtonid_paisPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_paisPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_paisPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_paisPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_paisPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisPedidoCompraImporUpdate.setText("U");
		this.jButtonid_paisPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisPedidoCompraImporUpdate"));



					
		this.jLabelid_clientePedidoCompraImpor = new JLabelMe();
		this.jLabelid_clientePedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clientePedidoCompraImpor.setToolTipText("Cliente");
		this.jLabelid_clientePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clientePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clientePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clientePedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_clientePedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_clientePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_clientePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clientePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clientePedidoCompraImpor= new JButtonMe();
		this.jButtonid_clientePedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePedidoCompraImpor.setText("Buscar");
		this.jButtonid_clientePedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clientePedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clientePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedidoCompraImpor"));

		this.jButtonid_clientePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_clientePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePedidoCompraImporBusqueda.setText("U");
		this.jButtonid_clientePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clientePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clientePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clientePedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_clientePedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_clientePedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePedidoCompraImporUpdate.setText("U");
		this.jButtonid_clientePedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clientePedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clientePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePedidoCompraImporUpdate"));



					
		this.jLabelid_cliente_proveedorPedidoCompraImpor = new JLabelMe();
		this.jLabelid_cliente_proveedorPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR+" : *");
		this.jLabelid_cliente_proveedorPedidoCompraImpor.setToolTipText("Cliente Proveedor");
		this.jLabelid_cliente_proveedorPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cliente_proveedorPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cliente_proveedorPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cliente_proveedorPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cliente_proveedorPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cliente_proveedorPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDCLIENTEPROVEEDOR);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_cliente_proveedorPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_cliente_proveedorPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_cliente_proveedorPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedorPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedorPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cliente_proveedorPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cliente_proveedorPedidoCompraImpor= new JButtonMe();
		this.jButtonid_cliente_proveedorPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_proveedorPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_proveedorPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_proveedorPedidoCompraImpor.setText("Buscar");
		this.jButtonid_cliente_proveedorPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cliente_proveedorPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_proveedorPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cliente_proveedorPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_proveedorPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_proveedorPedidoCompraImpor"));

		this.jButtonid_cliente_proveedorPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_cliente_proveedorPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedorPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedorPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cliente_proveedorPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_cliente_proveedorPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cliente_proveedorPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_proveedorPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cliente_proveedorPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_proveedorPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_proveedorPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cliente_proveedorPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_cliente_proveedorPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_cliente_proveedorPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedorPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_proveedorPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cliente_proveedorPedidoCompraImporUpdate.setText("U");
		this.jButtonid_cliente_proveedorPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cliente_proveedorPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_proveedorPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cliente_proveedorPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_proveedorPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_proveedorPedidoCompraImporUpdate"));



					
		this.jLabelid_empleadoPedidoCompraImpor = new JLabelMe();
		this.jLabelid_empleadoPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoPedidoCompraImpor.setToolTipText("Empleado");
		this.jLabelid_empleadoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_empleadoPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_empleadoPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_empleadoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoPedidoCompraImpor= new JButtonMe();
		this.jButtonid_empleadoPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPedidoCompraImpor.setText("Buscar");
		this.jButtonid_empleadoPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPedidoCompraImpor"));

		this.jButtonid_empleadoPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_empleadoPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_empleadoPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_empleadoPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_empleadoPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPedidoCompraImporUpdate.setText("U");
		this.jButtonid_empleadoPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPedidoCompraImporUpdate"));



					
		this.jLabelid_usuarioPedidoCompraImpor = new JLabelMe();
		this.jLabelid_usuarioPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioPedidoCompraImpor.setToolTipText("Usuario");
		this.jLabelid_usuarioPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_usuarioPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_usuarioPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_usuarioPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioPedidoCompraImpor.setEnabled(false);

		this.jButtonid_usuarioPedidoCompraImpor= new JButtonMe();
		this.jButtonid_usuarioPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioPedidoCompraImpor.setText("Buscar");
		this.jButtonid_usuarioPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPedidoCompraImpor"));

		this.jButtonid_usuarioPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_usuarioPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_usuarioPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_usuarioPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_usuarioPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioPedidoCompraImporUpdate.setText("U");
		this.jButtonid_usuarioPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioPedidoCompraImporUpdate"));



					
		this.jLabelid_tipo_cambioPedidoCompraImpor = new JLabelMe();
		this.jLabelid_tipo_cambioPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDTIPOCAMBIO+" : *");
		this.jLabelid_tipo_cambioPedidoCompraImpor.setToolTipText("Tipo Cambio");
		this.jLabelid_tipo_cambioPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_tipo_cambioPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_tipo_cambioPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_tipo_cambioPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_cambioPedidoCompraImpor= new JButtonMe();
		this.jButtonid_tipo_cambioPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioPedidoCompraImpor.setText("Buscar");
		this.jButtonid_tipo_cambioPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioPedidoCompraImpor"));

		this.jButtonid_tipo_cambioPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_tipo_cambioPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioPedidoCompraImporUpdate.setText("U");
		this.jButtonid_tipo_cambioPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioPedidoCompraImporUpdate"));



					
		this.jLabelid_monedaPedidoCompraImpor = new JLabelMe();
		this.jLabelid_monedaPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaPedidoCompraImpor.setToolTipText("Moneda");
		this.jLabelid_monedaPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_monedaPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_monedaPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_monedaPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaPedidoCompraImpor= new JButtonMe();
		this.jButtonid_monedaPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaPedidoCompraImpor.setText("Buscar");
		this.jButtonid_monedaPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaPedidoCompraImpor"));

		this.jButtonid_monedaPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_monedaPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_monedaPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_monedaPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_monedaPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaPedidoCompraImporUpdate.setText("U");
		this.jButtonid_monedaPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaPedidoCompraImporUpdate"));



					
		this.jLabelid_tipo_prorrateo_imporPedidoCompraImpor = new JLabelMe();
		this.jLabelid_tipo_prorrateo_imporPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDTIPOPRORRATEOIMPOR+" : *");
		this.jLabelid_tipo_prorrateo_imporPedidoCompraImpor.setToolTipText("Tipo Prorrateo Impor");
		this.jLabelid_tipo_prorrateo_imporPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_prorrateo_imporPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_prorrateo_imporPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_prorrateo_imporPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_prorrateo_imporPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_prorrateo_imporPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDTIPOPRORRATEOIMPOR);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_tipo_prorrateo_imporPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_tipo_prorrateo_imporPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_tipo_prorrateo_imporPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prorrateo_imporPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prorrateo_imporPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_prorrateo_imporPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_prorrateo_imporPedidoCompraImpor= new JButtonMe();
		this.jButtonid_tipo_prorrateo_imporPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_prorrateo_imporPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_prorrateo_imporPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_prorrateo_imporPedidoCompraImpor.setText("Buscar");
		this.jButtonid_tipo_prorrateo_imporPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_prorrateo_imporPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_prorrateo_imporPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_prorrateo_imporPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_prorrateo_imporPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_prorrateo_imporPedidoCompraImpor"));

		this.jButtonid_tipo_prorrateo_imporPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_tipo_prorrateo_imporPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prorrateo_imporPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prorrateo_imporPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_prorrateo_imporPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_tipo_prorrateo_imporPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_prorrateo_imporPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_prorrateo_imporPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_prorrateo_imporPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_prorrateo_imporPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_prorrateo_imporPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_prorrateo_imporPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_tipo_prorrateo_imporPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_tipo_prorrateo_imporPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prorrateo_imporPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prorrateo_imporPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_prorrateo_imporPedidoCompraImporUpdate.setText("U");
		this.jButtonid_tipo_prorrateo_imporPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_prorrateo_imporPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_prorrateo_imporPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_prorrateo_imporPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_prorrateo_imporPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_prorrateo_imporPedidoCompraImporUpdate"));



					
		this.jLabelid_embarcadorPedidoCompraImpor = new JLabelMe();
		this.jLabelid_embarcadorPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDEMBARCADOR+" : *");
		this.jLabelid_embarcadorPedidoCompraImpor.setToolTipText("Embarcador");
		this.jLabelid_embarcadorPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_embarcadorPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_embarcadorPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_embarcadorPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_embarcadorPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_embarcadorPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDEMBARCADOR);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_embarcadorPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_embarcadorPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_embarcadorPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_embarcadorPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_embarcadorPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_embarcadorPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_embarcadorPedidoCompraImpor= new JButtonMe();
		this.jButtonid_embarcadorPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_embarcadorPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_embarcadorPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_embarcadorPedidoCompraImpor.setText("Buscar");
		this.jButtonid_embarcadorPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_embarcadorPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_embarcadorPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_embarcadorPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_embarcadorPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_embarcadorPedidoCompraImpor"));

		this.jButtonid_embarcadorPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_embarcadorPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_embarcadorPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_embarcadorPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_embarcadorPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_embarcadorPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_embarcadorPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_embarcadorPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_embarcadorPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_embarcadorPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_embarcadorPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_embarcadorPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_embarcadorPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_embarcadorPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_embarcadorPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_embarcadorPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_embarcadorPedidoCompraImporUpdate.setText("U");
		this.jButtonid_embarcadorPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_embarcadorPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_embarcadorPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_embarcadorPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_embarcadorPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_embarcadorPedidoCompraImporUpdate"));



					
		this.jLabelid_tipo_via_transportePedidoCompraImpor = new JLabelMe();
		this.jLabelid_tipo_via_transportePedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE+" : *");
		this.jLabelid_tipo_via_transportePedidoCompraImpor.setToolTipText("Tipo Via Transporte");
		this.jLabelid_tipo_via_transportePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_via_transportePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_via_transportePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_via_transportePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_via_transportePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_via_transportePedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_tipo_via_transportePedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_tipo_via_transportePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_tipo_via_transportePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transportePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transportePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_via_transportePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_via_transportePedidoCompraImpor= new JButtonMe();
		this.jButtonid_tipo_via_transportePedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transportePedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transportePedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transportePedidoCompraImpor.setText("Buscar");
		this.jButtonid_tipo_via_transportePedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_via_transportePedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transportePedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_via_transportePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transportePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transportePedidoCompraImpor"));

		this.jButtonid_tipo_via_transportePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_tipo_via_transportePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transportePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transportePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_via_transportePedidoCompraImporBusqueda.setText("U");
		this.jButtonid_tipo_via_transportePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_via_transportePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transportePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_via_transportePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transportePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transportePedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_via_transportePedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_tipo_via_transportePedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_tipo_via_transportePedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transportePedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transportePedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_via_transportePedidoCompraImporUpdate.setText("U");
		this.jButtonid_tipo_via_transportePedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_via_transportePedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transportePedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_via_transportePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transportePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transportePedidoCompraImporUpdate"));



					
		this.jLabelid_puertoPedidoCompraImpor = new JLabelMe();
		this.jLabelid_puertoPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDPUERTO+" : *");
		this.jLabelid_puertoPedidoCompraImpor.setToolTipText("Puerto");
		this.jLabelid_puertoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_puertoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_puertoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_puertoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_puertoPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_puertoPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDPUERTO);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_puertoPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_puertoPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_puertoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puertoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puertoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_puertoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_puertoPedidoCompraImpor= new JButtonMe();
		this.jButtonid_puertoPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_puertoPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_puertoPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_puertoPedidoCompraImpor.setText("Buscar");
		this.jButtonid_puertoPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_puertoPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_puertoPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_puertoPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_puertoPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_puertoPedidoCompraImpor"));

		this.jButtonid_puertoPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_puertoPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puertoPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puertoPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_puertoPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_puertoPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_puertoPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_puertoPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_puertoPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_puertoPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_puertoPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_puertoPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_puertoPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_puertoPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puertoPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puertoPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_puertoPedidoCompraImporUpdate.setText("U");
		this.jButtonid_puertoPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_puertoPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_puertoPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_puertoPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_puertoPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_puertoPedidoCompraImporUpdate"));



					
		this.jLabelid_puerto_destinoPedidoCompraImpor = new JLabelMe();
		this.jLabelid_puerto_destinoPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDPUERTODESTINO+" : *");
		this.jLabelid_puerto_destinoPedidoCompraImpor.setToolTipText("Puerto Destino");
		this.jLabelid_puerto_destinoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_puerto_destinoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_puerto_destinoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_puerto_destinoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_puerto_destinoPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_puerto_destinoPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDPUERTODESTINO);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_puerto_destinoPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_puerto_destinoPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_puerto_destinoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puerto_destinoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puerto_destinoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_puerto_destinoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_puerto_destinoPedidoCompraImpor= new JButtonMe();
		this.jButtonid_puerto_destinoPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_puerto_destinoPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_puerto_destinoPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_puerto_destinoPedidoCompraImpor.setText("Buscar");
		this.jButtonid_puerto_destinoPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_puerto_destinoPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_puerto_destinoPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_puerto_destinoPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_puerto_destinoPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_puerto_destinoPedidoCompraImpor"));

		this.jButtonid_puerto_destinoPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_puerto_destinoPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puerto_destinoPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puerto_destinoPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_puerto_destinoPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_puerto_destinoPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_puerto_destinoPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_puerto_destinoPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_puerto_destinoPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_puerto_destinoPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_puerto_destinoPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_puerto_destinoPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_puerto_destinoPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_puerto_destinoPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puerto_destinoPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puerto_destinoPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_puerto_destinoPedidoCompraImporUpdate.setText("U");
		this.jButtonid_puerto_destinoPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_puerto_destinoPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_puerto_destinoPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_puerto_destinoPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_puerto_destinoPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_puerto_destinoPedidoCompraImporUpdate"));



					
		this.jLabelid_tipo_terminos_imporPedidoCompraImpor = new JLabelMe();
		this.jLabelid_tipo_terminos_imporPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDTIPOTERMINOSIMPOR+" : *");
		this.jLabelid_tipo_terminos_imporPedidoCompraImpor.setToolTipText("Tipo Terminos Impor");
		this.jLabelid_tipo_terminos_imporPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_terminos_imporPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_terminos_imporPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_terminos_imporPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_terminos_imporPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_terminos_imporPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDTIPOTERMINOSIMPOR);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_tipo_terminos_imporPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_tipo_terminos_imporPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_tipo_terminos_imporPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_terminos_imporPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_terminos_imporPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_terminos_imporPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_terminos_imporPedidoCompraImpor= new JButtonMe();
		this.jButtonid_tipo_terminos_imporPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_terminos_imporPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_terminos_imporPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_terminos_imporPedidoCompraImpor.setText("Buscar");
		this.jButtonid_tipo_terminos_imporPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_terminos_imporPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_terminos_imporPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_terminos_imporPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_terminos_imporPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_terminos_imporPedidoCompraImpor"));

		this.jButtonid_tipo_terminos_imporPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_tipo_terminos_imporPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_terminos_imporPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_terminos_imporPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_terminos_imporPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_tipo_terminos_imporPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_terminos_imporPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_terminos_imporPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_terminos_imporPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_terminos_imporPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_terminos_imporPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_terminos_imporPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_tipo_terminos_imporPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_tipo_terminos_imporPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_terminos_imporPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_terminos_imporPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_terminos_imporPedidoCompraImporUpdate.setText("U");
		this.jButtonid_tipo_terminos_imporPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_terminos_imporPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_terminos_imporPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_terminos_imporPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_terminos_imporPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_terminos_imporPedidoCompraImporUpdate"));



					
		this.jLabelid_estado_pedido_compraPedidoCompraImpor = new JLabelMe();
		this.jLabelid_estado_pedido_compraPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDESTADOPEDIDOCOMPRA+" : *");
		this.jLabelid_estado_pedido_compraPedidoCompraImpor.setToolTipText("Estado Pedo Compra");
		this.jLabelid_estado_pedido_compraPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_pedido_compraPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_pedido_compraPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_compraPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_pedido_compraPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_pedido_compraPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDESTADOPEDIDOCOMPRA);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_estado_pedido_compraPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_estado_pedido_compraPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_estado_pedido_compraPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_compraPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_compraPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_compraPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_pedido_compraPedidoCompraImpor= new JButtonMe();
		this.jButtonid_estado_pedido_compraPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_compraPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_compraPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_compraPedidoCompraImpor.setText("Buscar");
		this.jButtonid_estado_pedido_compraPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_pedido_compraPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_compraPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_pedido_compraPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_compraPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_compraPedidoCompraImpor"));

		this.jButtonid_estado_pedido_compraPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_estado_pedido_compraPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_compraPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_compraPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_compraPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_estado_pedido_compraPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_pedido_compraPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_compraPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_pedido_compraPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_compraPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_compraPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_pedido_compraPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_estado_pedido_compraPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_estado_pedido_compraPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_compraPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_compraPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_compraPedidoCompraImporUpdate.setText("U");
		this.jButtonid_estado_pedido_compraPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_pedido_compraPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_compraPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_pedido_compraPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_compraPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_compraPedidoCompraImporUpdate"));



					
		this.jLabelid_formatoPedidoCompraImpor = new JLabelMe();
		this.jLabelid_formatoPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoPedidoCompraImpor.setToolTipText("Formato");
		this.jLabelid_formatoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_formatoPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_formatoPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_formatoPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoPedidoCompraImpor= new JButtonMe();
		this.jButtonid_formatoPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoPedidoCompraImpor.setText("Buscar");
		this.jButtonid_formatoPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPedidoCompraImpor"));

		this.jButtonid_formatoPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_formatoPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_formatoPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_formatoPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_formatoPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoPedidoCompraImporUpdate.setText("U");
		this.jButtonid_formatoPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoPedidoCompraImporUpdate"));



					
		this.jLabelid_anioPedidoCompraImpor = new JLabelMe();
		this.jLabelid_anioPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioPedidoCompraImpor.setToolTipText("Anio");
		this.jLabelid_anioPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_anioPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_anioPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_anioPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioPedidoCompraImpor.setEnabled(false);

		this.jButtonid_anioPedidoCompraImpor= new JButtonMe();
		this.jButtonid_anioPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioPedidoCompraImpor.setText("Buscar");
		this.jButtonid_anioPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPedidoCompraImpor"));

		this.jButtonid_anioPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_anioPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_anioPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_anioPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_anioPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioPedidoCompraImporUpdate.setText("U");
		this.jButtonid_anioPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioPedidoCompraImporUpdate"));



					
		this.jLabelid_mesPedidoCompraImpor = new JLabelMe();
		this.jLabelid_mesPedidoCompraImpor.setText(""+PedidoCompraImporConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesPedidoCompraImpor.setToolTipText("Mes");
		this.jLabelid_mesPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesPedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesPedidoCompraImpor.setToolTipText(PedidoCompraImporConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		this.jPanelid_mesPedidoCompraImpor.setLayout(this.gridaBagLayoutPedidoCompraImpor);


		jComboBoxid_mesPedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_mesPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesPedidoCompraImpor.setEnabled(false);

		this.jButtonid_mesPedidoCompraImpor= new JButtonMe();
		this.jButtonid_mesPedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesPedidoCompraImpor.setText("Buscar");
		this.jButtonid_mesPedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesPedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPedidoCompraImpor"));

		this.jButtonid_mesPedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_mesPedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPedidoCompraImporBusqueda.setText("U");
		this.jButtonid_mesPedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesPedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPedidoCompraImporBusqueda"));

		if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesPedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_mesPedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_mesPedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesPedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesPedidoCompraImporUpdate.setText("U");
		this.jButtonid_mesPedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesPedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesPedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesPedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesPedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesPedidoCompraImporUpdate"));



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
		//this.jInternalFrameDetallePedidoCompraImpor = new PedidoCompraImporBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pedido Compra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedidoCompraImpor= new GridBagLayout();
		

		
		String sToolTipPedidoCompraImpor="";
		sToolTipPedidoCompraImpor=PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedidoCompraImpor+="(Importaciones.PedidoCompraImpor)";
		}
		
		if(!this.pedidocompraimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedidoCompraImpor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPedidoCompraImpor = new JButtonMe();
		this.jButtonModificarPedidoCompraImpor = new JButtonMe();
        this.jButtonActualizarPedidoCompraImpor = new JButtonMe();
        this.jButtonEliminarPedidoCompraImpor = new JButtonMe();
        this.jButtonCancelarPedidoCompraImpor = new JButtonMe();
        this.jButtonGuardarCambiosPedidoCompraImpor = new JButtonMe();
		this.jButtonGuardarCambiosTablaPedidoCompraImpor = new JButtonMe();
		this.jButtonCerrarPedidoCompraImpor = new JButtonMe();
		
		this.jScrollPanelDatosPedidoCompraImpor = new JScrollPane();   
        this.jScrollPanelDatosEdicionPedidoCompraImpor = new JScrollPane();
		this.jScrollPanelDatosGeneralPedidoCompraImpor = new JScrollPane();
				
		
		
		this.jPanelCamposPedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Pedido Compra";
		
		if(!this.pedidocompraimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosPedidoCompraImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposPedidoCompraImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposPedidoCompraImpor.setName("jPanelCamposPedidoCompraImpor"); 

		this.jPanelCamposOcultosPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPedidoCompraImpor.setName("jPanelCamposOcultosPedidoCompraImpor"); 

        this.jPanelAccionesPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedidoCompraImpor.setToolTipText("Acciones");
        this.jPanelAccionesPedidoCompraImpor.setName("Acciones"); 

		this.jPanelAccionesFormularioPedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPedidoCompraImpor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPedidoCompraImpor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPedidoCompraImpor.setText("Nuevo");
		this.jButtonModificarPedidoCompraImpor.setText("Editar");
        this.jButtonActualizarPedidoCompraImpor.setText("Actualizar");
        this.jButtonEliminarPedidoCompraImpor.setText("Eliminar");
        this.jButtonCancelarPedidoCompraImpor.setText("Cancelar");
        this.jButtonGuardarCambiosPedidoCompraImpor.setText("Guardar");
		this.jButtonGuardarCambiosTablaPedidoCompraImpor.setText("Guardar");
		this.jButtonCerrarPedidoCompraImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedidoCompraImpor,"nuevo_button","Nuevo",this.pedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPedidoCompraImpor,"modificar_button","Editar",this.pedidocompraimporSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPedidoCompraImpor,"actualizar_button","Actualizar",this.pedidocompraimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPedidoCompraImpor,"eliminar_button","Eliminar",this.pedidocompraimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPedidoCompraImpor,"cancelar_button","Cancelar",this.pedidocompraimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPedidoCompraImpor,"guardarcambios_button","Guardar",this.pedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedidoCompraImpor,"guardarcambiostabla_button","Guardar",this.pedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedidoCompraImpor,"cerrar_button","Salir",this.pedidocompraimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPedidoCompraImpor.setToolTipText("Nuevo"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPedidoCompraImpor.setToolTipText("Editar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPedidoCompraImpor.setToolTipText("Actualizar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPedidoCompraImpor.setToolTipText("Eliminar)"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPedidoCompraImpor.setToolTipText("Cancelar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPedidoCompraImpor.setToolTipText("Guardar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPedidoCompraImpor.setToolTipText("Guardar"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedidoCompraImpor.setToolTipText("Salir"+" "+PedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedidoCompraImpor";
		inputMap = this.jButtonNuevoPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedidoCompraImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedidoCompraImpor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPedidoCompraImpor";
		inputMap = this.jButtonActualizarPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPedidoCompraImpor"));
		
		//ELIMINAR
		sMapKey = "EliminarPedidoCompraImpor";
		inputMap = this.jButtonEliminarPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPedidoCompraImpor"));
		
		//CANCELAR	
		sMapKey = "CancelarPedidoCompraImpor";
		inputMap = this.jButtonCancelarPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPedidoCompraImpor"));
		
		//CERRAR		
		sMapKey = "CerrarPedidoCompraImpor";
		inputMap = this.jButtonCerrarPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedidoCompraImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedidoCompraImpor";
		inputMap = this.jButtonGuardarCambiosTablaPedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedidoCompraImpor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPedidoCompraImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPedidoCompraImpor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPedidoCompraImpor.setToolTipText("Nuevo PedidoCompraImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPedidoCompraImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPedidoCompraImpor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPedidoCompraImpor.setToolTipText("Sin Cerrar Ventana PedidoCompraImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePedidoCompraImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePedidoCompraImpor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePedidoCompraImpor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedidoCompraImpor.setText("Accion");
		this.jComboBoxTiposAccionesPedidoCompraImpor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPedidoCompraImpor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPedidoCompraImpor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPedidoCompraImpor = new JLabelMe();
		
		this.jLabelAccionesPedidoCompraImpor.setText("Acciones");		
		this.jLabelAccionesPedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPedidoCompraImpor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPedidoCompraImpor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPedidoCompraImpor=new JTabbedPane();
		this.jTabbedPaneRelacionesPedidoCompraImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPedidoCompraImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoCompraImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoCompraImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPedidoCompraImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedidoCompraImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPedidoCompraImpor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPedidoCompraImpor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPedidoCompraImpor = new GridBagLayout();
		
		this.jPanelCamposPedidoCompraImpor.setLayout(gridaBagLayoutCamposPedidoCompraImpor);
		this.jPanelCamposOcultosPedidoCompraImpor.setLayout(gridaBagLayoutCamposOcultosPedidoCompraImpor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPedidoCompraImpor.add(jLabelIdPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPedidoCompraImpor.add(jLabelidPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPedidoCompraImpor.add(jLabelid_empresaPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedidoCompraImpor.add(jButtonid_empresaPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPedidoCompraImpor.add(jButtonid_empresaPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPedidoCompraImpor.add(jComboBoxid_empresaPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPedidoCompraImpor.add(jLabelid_sucursalPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPedidoCompraImpor.add(jButtonid_sucursalPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPedidoCompraImpor.add(jButtonid_sucursalPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPedidoCompraImpor.add(jComboBoxid_sucursalPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloPedidoCompraImpor.add(jLabelid_moduloPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloPedidoCompraImpor.add(jButtonid_moduloPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloPedidoCompraImpor.add(jButtonid_moduloPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloPedidoCompraImpor.add(jComboBoxid_moduloPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPedidoCompraImpor.add(jLabelid_ejercicioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPedidoCompraImpor.add(jButtonid_ejercicioPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPedidoCompraImpor.add(jButtonid_ejercicioPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPedidoCompraImpor.add(jComboBoxid_ejercicioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoPedidoCompraImpor.add(jLabelid_periodoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPedidoCompraImpor.add(jButtonid_periodoPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoPedidoCompraImpor.add(jButtonid_periodoPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoPedidoCompraImpor.add(jComboBoxid_periodoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisPedidoCompraImpor.add(jLabelid_paisPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisPedidoCompraImpor.add(jButtonid_paisPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisPedidoCompraImpor.add(jButtonid_paisPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisPedidoCompraImpor.add(jComboBoxid_paisPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clientePedidoCompraImpor.add(jLabelid_clientePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clientePedidoCompraImpor.add(jButtonid_clientePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePedidoCompraImpor.add(jButtonid_clientePedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 4;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePedidoCompraImpor.add(jButtonid_clientePedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clientePedidoCompraImpor.add(jComboBoxid_clientePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cliente_proveedorPedidoCompraImpor.add(jLabelid_cliente_proveedorPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cliente_proveedorPedidoCompraImpor.add(jButtonid_cliente_proveedorPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cliente_proveedorPedidoCompraImpor.add(jButtonid_cliente_proveedorPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 4;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cliente_proveedorPedidoCompraImpor.add(jButtonid_cliente_proveedorPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cliente_proveedorPedidoCompraImpor.add(jComboBoxid_cliente_proveedorPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoPedidoCompraImpor.add(jLabelid_empleadoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoPedidoCompraImpor.add(jButtonid_empleadoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPedidoCompraImpor.add(jButtonid_empleadoPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 4;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPedidoCompraImpor.add(jButtonid_empleadoPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoPedidoCompraImpor.add(jComboBoxid_empleadoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioPedidoCompraImpor.add(jLabelid_usuarioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioPedidoCompraImpor.add(jButtonid_usuarioPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioPedidoCompraImpor.add(jButtonid_usuarioPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioPedidoCompraImpor.add(jComboBoxid_usuarioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cambioPedidoCompraImpor.add(jLabelid_tipo_cambioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioPedidoCompraImpor.add(jButtonid_tipo_cambioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioPedidoCompraImpor.add(jButtonid_tipo_cambioPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 4;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioPedidoCompraImpor.add(jButtonid_tipo_cambioPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cambioPedidoCompraImpor.add(jComboBoxid_tipo_cambioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaPedidoCompraImpor.add(jLabelid_monedaPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaPedidoCompraImpor.add(jButtonid_monedaPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaPedidoCompraImpor.add(jButtonid_monedaPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaPedidoCompraImpor.add(jComboBoxid_monedaPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_prorrateo_imporPedidoCompraImpor.add(jLabelid_tipo_prorrateo_imporPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_prorrateo_imporPedidoCompraImpor.add(jButtonid_tipo_prorrateo_imporPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_prorrateo_imporPedidoCompraImpor.add(jButtonid_tipo_prorrateo_imporPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_prorrateo_imporPedidoCompraImpor.add(jComboBoxid_tipo_prorrateo_imporPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_embarcadorPedidoCompraImpor.add(jLabelid_embarcadorPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_embarcadorPedidoCompraImpor.add(jButtonid_embarcadorPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_embarcadorPedidoCompraImpor.add(jButtonid_embarcadorPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_embarcadorPedidoCompraImpor.add(jComboBoxid_embarcadorPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_via_transportePedidoCompraImpor.add(jLabelid_tipo_via_transportePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_via_transportePedidoCompraImpor.add(jButtonid_tipo_via_transportePedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_via_transportePedidoCompraImpor.add(jButtonid_tipo_via_transportePedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_via_transportePedidoCompraImpor.add(jComboBoxid_tipo_via_transportePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_puertoPedidoCompraImpor.add(jLabelid_puertoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_puertoPedidoCompraImpor.add(jButtonid_puertoPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_puertoPedidoCompraImpor.add(jButtonid_puertoPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_puertoPedidoCompraImpor.add(jComboBoxid_puertoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_puerto_destinoPedidoCompraImpor.add(jLabelid_puerto_destinoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_puerto_destinoPedidoCompraImpor.add(jButtonid_puerto_destinoPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_puerto_destinoPedidoCompraImpor.add(jButtonid_puerto_destinoPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_puerto_destinoPedidoCompraImpor.add(jComboBoxid_puerto_destinoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_terminos_imporPedidoCompraImpor.add(jLabelid_tipo_terminos_imporPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_terminos_imporPedidoCompraImpor.add(jButtonid_tipo_terminos_imporPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_terminos_imporPedidoCompraImpor.add(jButtonid_tipo_terminos_imporPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_terminos_imporPedidoCompraImpor.add(jComboBoxid_tipo_terminos_imporPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_pedido_compraPedidoCompraImpor.add(jLabelid_estado_pedido_compraPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_compraPedidoCompraImpor.add(jButtonid_estado_pedido_compraPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_compraPedidoCompraImpor.add(jButtonid_estado_pedido_compraPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_pedido_compraPedidoCompraImpor.add(jComboBoxid_estado_pedido_compraPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelforma_pagoPedidoCompraImpor.add(jLabelforma_pagoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelforma_pagoPedidoCompraImpor.add(jButtonforma_pagoPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelforma_pagoPedidoCompraImpor.add(jTextFieldforma_pagoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_duiPedidoCompraImpor.add(jLabelnumero_duiPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_duiPedidoCompraImpor.add(jButtonnumero_duiPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_duiPedidoCompraImpor.add(jTextFieldnumero_duiPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialPedidoCompraImpor.add(jLabelsecuencialPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialPedidoCompraImpor.add(jButtonsecuencialPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialPedidoCompraImpor.add(jTextFieldsecuencialPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_ordenPedidoCompraImpor.add(jLabelnumero_ordenPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_ordenPedidoCompraImpor.add(jButtonnumero_ordenPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_ordenPedidoCompraImpor.add(jTextFieldnumero_ordenPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneluso_enPedidoCompraImpor.add(jLabeluso_enPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneluso_enPedidoCompraImpor.add(jButtonuso_enPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneluso_enPedidoCompraImpor.add(jTextFielduso_enPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelresponsablePedidoCompraImpor.add(jLabelresponsablePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelresponsablePedidoCompraImpor.add(jButtonresponsablePedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelresponsablePedidoCompraImpor.add(jscrollPaneresponsablePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelorden_compraPedidoCompraImpor.add(jLabelorden_compraPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelorden_compraPedidoCompraImpor.add(jButtonorden_compraPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelorden_compraPedidoCompraImpor.add(jTextFieldorden_compraPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellugar_entregaPedidoCompraImpor.add(jLabellugar_entregaPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanellugar_entregaPedidoCompraImpor.add(jButtonlugar_entregaPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellugar_entregaPedidoCompraImpor.add(jTextFieldlugar_entregaPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPedidoCompraImpor.add(jLabeldescripcionPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPedidoCompraImpor.add(jButtondescripcionPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPedidoCompraImpor.add(jscrollPanedescripcionPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaPedidoCompraImpor.add(jLabelfechaPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaPedidoCompraImpor.add(jButtonfechaPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaPedidoCompraImpor.add(jDateChooserfechaPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionPedidoCompraImpor.add(jLabelfecha_emisionPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionPedidoCompraImpor.add(jButtonfecha_emisionPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionPedidoCompraImpor.add(jDateChooserfecha_emisionPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_entregaPedidoCompraImpor.add(jLabelfecha_entregaPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entregaPedidoCompraImpor.add(jButtonfecha_entregaPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_entregaPedidoCompraImpor.add(jDateChooserfecha_entregaPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_entrega_clientePedidoCompraImpor.add(jLabelfecha_entrega_clientePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entrega_clientePedidoCompraImpor.add(jButtonfecha_entrega_clientePedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_entrega_clientePedidoCompraImpor.add(jDateChooserfecha_entrega_clientePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_seguroPedidoCompraImpor.add(jLabelnombre_seguroPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_seguroPedidoCompraImpor.add(jButtonnombre_seguroPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_seguroPedidoCompraImpor.add(jTextFieldnombre_seguroPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_consignatarioPedidoCompraImpor.add(jLabelnombre_consignatarioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_consignatarioPedidoCompraImpor.add(jButtonnombre_consignatarioPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_consignatarioPedidoCompraImpor.add(jTextFieldnombre_consignatarioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpreciosPedidoCompraImpor.add(jLabelpreciosPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelpreciosPedidoCompraImpor.add(jButtonpreciosPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpreciosPedidoCompraImpor.add(jTextFieldpreciosPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfletePedidoCompraImpor.add(jLabelfletePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfletePedidoCompraImpor.add(jButtonfletePedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfletePedidoCompraImpor.add(jTextFieldfletePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelseguroPedidoCompraImpor.add(jLabelseguroPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelseguroPedidoCompraImpor.add(jButtonseguroPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelseguroPedidoCompraImpor.add(jTextFieldseguroPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgastosPedidoCompraImpor.add(jLabelgastosPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelgastosPedidoCompraImpor.add(jButtongastosPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgastosPedidoCompraImpor.add(jTextFieldgastosPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcfrPedidoCompraImpor.add(jLabelcfrPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcfrPedidoCompraImpor.add(jButtoncfrPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcfrPedidoCompraImpor.add(jTextFieldcfrPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcifPedidoCompraImpor.add(jLabelcifPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcifPedidoCompraImpor.add(jButtoncifPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcifPedidoCompraImpor.add(jTextFieldcifPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalPedidoCompraImpor.add(jLabeltotalPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalPedidoCompraImpor.add(jButtontotalPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalPedidoCompraImpor.add(jTextFieldtotalPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoPedidoCompraImpor.add(jLabelid_formatoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoPedidoCompraImpor.add(jButtonid_formatoPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoPedidoCompraImpor.add(jButtonid_formatoPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoPedidoCompraImpor.add(jComboBoxid_formatoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioPedidoCompraImpor.add(jLabelid_anioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPedidoCompraImpor.add(jButtonid_anioPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioPedidoCompraImpor.add(jButtonid_anioPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioPedidoCompraImpor.add(jComboBoxid_anioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesPedidoCompraImpor.add(jLabelid_mesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPedidoCompraImpor.add(jButtonid_mesPedidoCompraImporBusqueda, this.gridBagConstraintsPedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesPedidoCompraImpor.add(jButtonid_mesPedidoCompraImporUpdate, this.gridBagConstraintsPedidoCompraImpor);
	}

	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsPedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesPedidoCompraImpor.add(jComboBoxid_mesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelidPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelid_paisPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelid_clientePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelid_cliente_proveedorPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelid_empleadoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelid_tipo_cambioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelid_monedaPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelid_tipo_prorrateo_imporPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelid_embarcadorPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelid_tipo_via_transportePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelid_puertoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelid_puerto_destinoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelid_tipo_terminos_imporPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelid_estado_pedido_compraPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelforma_pagoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelnumero_duiPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelsecuencialPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelnumero_ordenPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPaneluso_enPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelresponsablePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelorden_compraPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanellugar_entregaPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPaneldescripcionPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelfechaPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelfecha_emisionPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelfecha_entregaPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelfecha_entrega_clientePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelnombre_seguroPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelnombre_consignatarioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelpreciosPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelfletePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelseguroPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelgastosPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelcfrPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelcifPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPaneltotalPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPedidoCompraImpor.add(this.jPanelid_formatoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposPedidoCompraImpor % 2==0) {
		iXPanelCamposPedidoCompraImpor=0;
		iYPanelCamposPedidoCompraImpor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposOcultosPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposOcultosPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompraImpor.add(this.jPanelid_empresaPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposOcultosPedidoCompraImpor % 2==0) {
		iXPanelCamposOcultosPedidoCompraImpor=0;
		iYPanelCamposOcultosPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposOcultosPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposOcultosPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompraImpor.add(this.jPanelid_sucursalPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposOcultosPedidoCompraImpor % 2==0) {
		iXPanelCamposOcultosPedidoCompraImpor=0;
		iYPanelCamposOcultosPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposOcultosPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposOcultosPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompraImpor.add(this.jPanelid_moduloPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposOcultosPedidoCompraImpor % 2==0) {
		iXPanelCamposOcultosPedidoCompraImpor=0;
		iYPanelCamposOcultosPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposOcultosPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposOcultosPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompraImpor.add(this.jPanelid_ejercicioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposOcultosPedidoCompraImpor % 2==0) {
		iXPanelCamposOcultosPedidoCompraImpor=0;
		iYPanelCamposOcultosPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposOcultosPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposOcultosPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompraImpor.add(this.jPanelid_periodoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposOcultosPedidoCompraImpor % 2==0) {
		iXPanelCamposOcultosPedidoCompraImpor=0;
		iYPanelCamposOcultosPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposOcultosPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposOcultosPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompraImpor.add(this.jPanelid_usuarioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposOcultosPedidoCompraImpor % 2==0) {
		iXPanelCamposOcultosPedidoCompraImpor=0;
		iYPanelCamposOcultosPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposOcultosPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposOcultosPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompraImpor.add(this.jPanelid_anioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposOcultosPedidoCompraImpor % 2==0) {
		iXPanelCamposOcultosPedidoCompraImpor=0;
		iYPanelCamposOcultosPedidoCompraImpor++;
	}
	this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPedidoCompraImpor.gridy = iYPanelCamposOcultosPedidoCompraImpor;
	this.gridBagConstraintsPedidoCompraImpor.gridx = iXPanelCamposOcultosPedidoCompraImpor++;
	this.gridBagConstraintsPedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPedidoCompraImpor.add(this.jPanelid_mesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);



	if(iXPanelCamposOcultosPedidoCompraImpor % 2==0) {
		iXPanelCamposOcultosPedidoCompraImpor=0;
		iYPanelCamposOcultosPedidoCompraImpor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesPedidoCompraImpor= new GridBagLayout();
		this.jPanelAccionesPedidoCompraImpor.setLayout(gridaBagLayoutAccionesPedidoCompraImpor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPedidoCompraImpor= new GridBagLayout();
		this.jPanelAccionesFormularioPedidoCompraImpor.setLayout(gridaBagLayoutAccionesFormularioPedidoCompraImpor);
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPedidoCompraImpor.add(this.jComboBoxTiposAccionesFormularioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPedidoCompraImpor.add(this.jCheckBoxPostAccionNuevoPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.pedidocompraimporSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPedidoCompraImpor.add(this.jCheckBoxPostAccionSinCerrarPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.pedidocompraimporSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.pedidocompraimporSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPedidoCompraImpor.add(this.jCheckBoxPostAccionSinMensajePedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXAccion++;
			
		this.jPanelAccionesPedidoCompraImpor.add(this.jButtonModificarPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);							

		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsPedidoCompraImpor.gridx =iPosXAccion++;
			
		this.jPanelAccionesPedidoCompraImpor.add(this.jButtonEliminarPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		
			
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedidoCompraImpor.add(this.jButtonActualizarPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);


		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesPedidoCompraImpor.add(this.jButtonGuardarCambiosPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);	
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy = 0;		
		this.gridBagConstraintsPedidoCompraImpor.gridx =iPosXAccion++;
		
		this.jPanelAccionesPedidoCompraImpor.add(this.jButtonCancelarPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedidoCompraImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedidoCompraImpor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidocompraimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();						
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoCompraImpor.gridx = 0;		
			//this.gridBagConstraintsPedidoCompraImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedidoCompraImpor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedidoCompraImpor.gridx =0;
		this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedidoCompraImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PedidoCompraImporJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePedidoCompraImpor = new PedidoCompraImporBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pedido Compra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Pedido Compra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pedido Compra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PedidoCompraImporModel pedidocompraimporModel=new PedidoCompraImporModel(this);
			
			//SI USARA CLASE INTERNA
			//PedidoCompraImporModel.PedidoCompraImporFocusTraversalPolicy pedidocompraimporFocusTraversalPolicy = pedidocompraimporModel.new PedidoCompraImporFocusTraversalPolicy(this);
			
			//pedidocompraimporFocusTraversalPolicy.setpedidocompraimporJInternalFrame(this);
			
			this.setFocusTraversalPolicy(pedidocompraimporModel);
			
			
			this.jContentPaneDetallePedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();	
			this.jContentPaneDetallePedidoCompraImpor.setLayout(gridaBagLayoutDetallePedidoCompraImpor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedidoCompraImpor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
				this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
					
				
				this.jContentPaneDetallePedidoCompraImpor.add(jTtoolBarDetallePedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);								
				
}
			
			this.jScrollPanelDatosEdicionPedidoCompraImpor=   new JScrollPane(jContentPaneDetallePedidoCompraImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedidoCompraImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoCompraImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoCompraImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPedidoCompraImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedidoCompraImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoCompraImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoCompraImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	        
			this.jContentPaneDetallePedidoCompraImpor.add(jPanelCamposPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);
			
			
			
			
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
						&& pedidocompraimporSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetallePedidoCompraImpor(this.puedeCargarPorParteDetallePedidoCompraImpor,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameLiquidacionImpuestoImpor(this.puedeCargarPorParteLiquidacionImpuestoImpor,false,-1);
					
					if(this.pedidocompraimporSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPedidoCompraImpor= new GridBagConstraints();
						this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
						this.jContentPaneDetallePedidoCompraImpor.add(this.jTabbedPaneRelacionesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPedidoCompraImpor.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetallePedidoCompraImpor(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameLiquidacionImpuestoImpor(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPedidoCompraImpor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
					this.gridBagConstraintsPedidoCompraImpor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
					
				
					this.jContentPaneDetallePedidoCompraImpor.add(jPanelCamposOcultosPedidoCompraImpor, gridBagConstraintsPedidoCompraImpor);
				
					this.jPanelCamposOcultosPedidoCompraImpor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	        this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePedidoCompraImpor.add(this.jPanelAccionesFormularioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);							
			
			
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
	        
			
			this.jContentPaneDetallePedidoCompraImpor.add(this.jPanelAccionesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPedidoCompraImpor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPedidoCompraImpor=   new JScrollPane(this.jPanelCamposPedidoCompraImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPedidoCompraImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoCompraImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPedidoCompraImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
			this.gridBagConstraintsPedidoCompraImpor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPedidoCompraImpor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPedidoCompraImpor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);			
			
			this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompraImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
			
			
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		
			
		this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompraImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompraImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedidoCompraImpor, this.gridBagConstraintsPedidoCompraImpor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPedidoCompraImpor;//jContentPane;
		
		return jScrollPanelDatosEdicionPedidoCompraImpor;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetallePedidoCompraImpor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallepedidocompraimporSessionBean=new DetallePedidoCompraImporSessionBean();
		this.detallepedidocompraimporSessionBean.setConGuardarRelaciones(false);
		this.detallepedidocompraimporSessionBean.setEsGuardarRelacionado(true);

		this.detallepedidocompraimporBeanSwingJInternalFrame=null;//new DetallePedidoCompraImporBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallepedidocompraimporBeanSwingJInternalFramePopup=new DetallePedidoCompraImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallepedidocompraimporBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado()) {

				DetallePedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL=PedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetallePedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallepedidocompraimporSessionBean.setEsGuardarRelacionado(true);

				this.detallepedidocompraimporBeanSwingJInternalFrame=new DetallePedidoCompraImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallepedidocompraimporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallepedidocompraimporBeanSwingJInternalFrame.setdetallepedidocompraimporSessionBean(this.detallepedidocompraimporSessionBean);

				//this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
				//this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
				//this.jContentPaneDetallePedidoCompraImpor.add(this.detallepedidocompraimporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPedidoCompraImpor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPedidoCompraImpor.add("Detalle Pedido Compras",this.detallepedidocompraimporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPedidoCompraImpor.setComponentAt(iIndexTab,this.detallepedidocompraimporBeanSwingJInternalFrame.getContentPane());
				}

				//DetallePedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallepedidocompraimporSessionBean.setEsGuardarRelacionado(false);
				this.detallepedidocompraimporBeanSwingJInternalFrame=null;//new DetallePedidoCompraImporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetallePedidoCompraImpor) {
					this.jTabbedPaneRelacionesPedidoCompraImpor.add("Detalle Pedido Compras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameLiquidacionImpuestoImpor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
		this.liquidacionimpuestoimporSessionBean.setConGuardarRelaciones(false);
		this.liquidacionimpuestoimporSessionBean.setEsGuardarRelacionado(true);

		this.liquidacionimpuestoimporBeanSwingJInternalFrame=null;//new LiquidacionImpuestoImporBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.liquidacionimpuestoimporBeanSwingJInternalFramePopup=new LiquidacionImpuestoImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.liquidacionimpuestoimporBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {

				LiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL=PedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL;
				LiquidacionImpuestoImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.liquidacionimpuestoimporSessionBean.setEsGuardarRelacionado(true);

				this.liquidacionimpuestoimporBeanSwingJInternalFrame=new LiquidacionImpuestoImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.liquidacionimpuestoimporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.liquidacionimpuestoimporBeanSwingJInternalFrame.setliquidacionimpuestoimporSessionBean(this.liquidacionimpuestoimporSessionBean);

				//this.gridBagConstraintsPedidoCompraImpor = new GridBagConstraints();
				//this.gridBagConstraintsPedidoCompraImpor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPedidoCompraImpor.gridx = 0;
				//this.jContentPaneDetallePedidoCompraImpor.add(this.liquidacionimpuestoimporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPedidoCompraImpor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPedidoCompraImpor.add("Liquidacion Impuesto Impores",this.liquidacionimpuestoimporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPedidoCompraImpor.setComponentAt(iIndexTab,this.liquidacionimpuestoimporBeanSwingJInternalFrame.getContentPane());
				}

				//LiquidacionImpuestoImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.liquidacionimpuestoimporSessionBean.setEsGuardarRelacionado(false);
				this.liquidacionimpuestoimporBeanSwingJInternalFrame=null;//new LiquidacionImpuestoImporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteLiquidacionImpuestoImpor) {
					this.jTabbedPaneRelacionesPedidoCompraImpor.add("Liquidacion Impuesto Impores",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetallePedidoCompraImporBeanSwingJInternalFrame(List<PedidoCompraImpor> pedidocompraimpors,PedidoCompraImpor pedidocompraimpor,DetallePedidoCompraImporBeanSwingJInternalFrame detallepedidocompraimporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallepedidocompraimporBeanSwingJInternalFrame=new DetallePedidoCompraImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallepedidocompraimporBeanSwingJInternalFrame.getDetallePedidoCompraImporLogic().setConnexion(this.pedidocompraimporLogic.getConnexion());

					detallepedidocompraimporBeanSwingJInternalFrame.setpedidocompraimporsForeignKey(pedidocompraimpors);
					detallepedidocompraimporBeanSwingJInternalFrame.setpedidocompraimporForeignKey(pedidocompraimpor);
					detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporSessionBean.setisBusquedaDesdeForeignKeySesionPedidoCompraImpor(true);
					detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporSessionBean.setlidPedidoCompraImporActual(pedidocompraimpor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallepedidocompraimporBeanSwingJInternalFrame.cargarCombosForeignKeyDetallePedidoCompraImpor(detallepedidocompraimporBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallepedidocompraimporBeanSwingJInternalFrame.setVisibilidadBusquedasParaPedidoCompraImpor(true);
					detallepedidocompraimporBeanSwingJInternalFrame.setid_pedido_compra_imporFK_IdPedidoCompraImpor(pedidocompraimpor.getId());

					if(!this.conCargarFormDetalle) {
						detallepedidocompraimporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallepedidocompraimporBeanSwingJInternalFrame.setSelectedItemCombosFramePedidoCompraImporForeignKey(pedidocompraimpor,1,false,true,true);
					detallepedidocompraimporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallepedidocompraimporBeanSwingJInternalFrame.procesarBusqueda("FK_IdPedidoCompraImpor");
					detallepedidocompraimporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPedidoCompraImpor");
					detallepedidocompraimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetallePedidoCompraImpor(true);
					detallepedidocompraimporBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetallePedidoCompraImpor("n",detallepedidocompraimporBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallepedidocompraimporBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallepedidocompraimporBeanSwingJInternalFrame.setAutoscrolls(true);
					detallepedidocompraimporBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallepedidocompraimporBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePedidoCompraImpor("relacionado");
					} else {
						detallepedidocompraimporBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePedidoCompraImpor("no_relacionado");
					}

					detallepedidocompraimporBeanSwingJInternalFrame.getjButtonRecargarInformacionDetallePedidoCompraImpor().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarLiquidacionImpuestoImporBeanSwingJInternalFrame(List<PedidoCompraImpor> pedidocompraimpors,PedidoCompraImpor pedidocompraimpor,LiquidacionImpuestoImporBeanSwingJInternalFrame liquidacionimpuestoimporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//liquidacionimpuestoimporBeanSwingJInternalFrame=new LiquidacionImpuestoImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					liquidacionimpuestoimporBeanSwingJInternalFrame.getLiquidacionImpuestoImporLogic().setConnexion(this.pedidocompraimporLogic.getConnexion());

					liquidacionimpuestoimporBeanSwingJInternalFrame.setpedidocompraimporsForeignKey(pedidocompraimpors);
					liquidacionimpuestoimporBeanSwingJInternalFrame.setpedidocompraimporForeignKey(pedidocompraimpor);
					liquidacionimpuestoimporBeanSwingJInternalFrame.liquidacionimpuestoimporSessionBean.setisBusquedaDesdeForeignKeySesionPedidoCompraImpor(true);
					liquidacionimpuestoimporBeanSwingJInternalFrame.liquidacionimpuestoimporSessionBean.setlidPedidoCompraImporActual(pedidocompraimpor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					liquidacionimpuestoimporBeanSwingJInternalFrame.cargarCombosForeignKeyLiquidacionImpuestoImpor(liquidacionimpuestoimporBeanSwingJInternalFrame.isCargarCombosDependencia);
					liquidacionimpuestoimporBeanSwingJInternalFrame.setVisibilidadBusquedasParaPedidoCompraImpor(true);
					liquidacionimpuestoimporBeanSwingJInternalFrame.setid_pedido_compra_imporFK_IdPedidoCompraImpor(pedidocompraimpor.getId());

					if(!this.conCargarFormDetalle) {
						liquidacionimpuestoimporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					liquidacionimpuestoimporBeanSwingJInternalFrame.setSelectedItemCombosFramePedidoCompraImporForeignKey(pedidocompraimpor,1,false,true,true);
					liquidacionimpuestoimporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					liquidacionimpuestoimporBeanSwingJInternalFrame.procesarBusqueda("FK_IdPedidoCompraImpor");
					liquidacionimpuestoimporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPedidoCompraImpor");
					liquidacionimpuestoimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaLiquidacionImpuestoImpor(true);
					liquidacionimpuestoimporBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesLiquidacionImpuestoImpor("n",liquidacionimpuestoimporBeanSwingJInternalFrame.isGuardarCambiosEnLote, liquidacionimpuestoimporBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					liquidacionimpuestoimporBeanSwingJInternalFrame.setAutoscrolls(true);
					liquidacionimpuestoimporBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						liquidacionimpuestoimporBeanSwingJInternalFrame.actualizarEstadoPanelsLiquidacionImpuestoImpor("relacionado");
					} else {
						liquidacionimpuestoimporBeanSwingJInternalFrame.actualizarEstadoPanelsLiquidacionImpuestoImpor("no_relacionado");
					}

					liquidacionimpuestoimporBeanSwingJInternalFrame.getjButtonRecargarInformacionLiquidacionImpuestoImpor().setVisible(false);

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
