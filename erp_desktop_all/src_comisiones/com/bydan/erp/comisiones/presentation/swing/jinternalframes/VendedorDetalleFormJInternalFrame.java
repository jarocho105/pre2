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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.comisiones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.comisiones.util.VendedorConstantesFunciones;

import com.bydan.erp.comisiones.business.logic.*;
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
public class VendedorDetalleFormJInternalFrame extends VendedorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVendedor;
	
	protected JMenuBar jmenuBarDetalleVendedor;
	
	protected JMenu jmenuDetalleVendedor;
	protected JMenu jmenuDetalleArchivoVendedor;
	protected JMenu jmenuDetalleAccionesVendedor;
	protected JMenu jmenuDetalleDatosVendedor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVendedor;	
	protected GridBagConstraints gridBagConstraintsVendedor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VendedorBeanSwingJInternalFrameAdditional jInternalFrameDetalleVendedor;		
	
	public VendedorBeanSwingJInternalFrameTree jInternalFrameTreeVendedor;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EmpleadoBeanSwingJInternalFrame empleadosoporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadosoporte="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";
	
	public VendedorSessionBean vendedorSessionBean;
	
	

	public NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame=null;
	public NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNotaCreditoSoli=false;
	public NotaCreditoSoliSessionBean notacreditosoliSessionBean;

	public ComisionVentaCobroBeanSwingJInternalFrame comisionventacobroBeanSwingJInternalFrame=null;
	public ComisionVentaCobroBeanSwingJInternalFrame comisionventacobroBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteComisionVentaCobro=false;
	public ComisionVentaCobroSessionBean comisionventacobroSessionBean;

	//public VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame=null;
	public VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteVendedor=false;

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;

	public ComisionGrupoBeanSwingJInternalFrame comisiongrupoBeanSwingJInternalFrame=null;
	public ComisionGrupoBeanSwingJInternalFrame comisiongrupoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteComisionGrupo=false;
	public ComisionGrupoSessionBean comisiongrupoSessionBean;

	public ComisionLineaBeanSwingJInternalFrame comisionlineaBeanSwingJInternalFrame=null;
	public ComisionLineaBeanSwingJInternalFrame comisionlineaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteComisionLinea=false;
	public ComisionLineaSessionBean comisionlineaSessionBean;

	public VendedorZonaBeanSwingJInternalFrame vendedorzonaBeanSwingJInternalFrame=null;
	public VendedorZonaBeanSwingJInternalFrame vendedorzonaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteVendedorZona=false;
	public VendedorZonaSessionBean vendedorzonaSessionBean;

	public ComisionCateBeanSwingJInternalFrame comisioncateBeanSwingJInternalFrame=null;
	public ComisionCateBeanSwingJInternalFrame comisioncateBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteComisionCate=false;
	public ComisionCateSessionBean comisioncateSessionBean;

	public CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFrame=null;
	public CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCajeroTurno=false;
	public CajeroTurnoSessionBean cajeroturnoSessionBean;

	public ComisionMarcaBeanSwingJInternalFrame comisionmarcaBeanSwingJInternalFrame=null;
	public ComisionMarcaBeanSwingJInternalFrame comisionmarcaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteComisionMarca=false;
	public ComisionMarcaSessionBean comisionmarcaSessionBean;

	public PresupuestoVentasBeanSwingJInternalFrame presupuestoventasBeanSwingJInternalFrame=null;
	public PresupuestoVentasBeanSwingJInternalFrame presupuestoventasBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePresupuestoVentas=false;
	public PresupuestoVentasSessionBean presupuestoventasSessionBean;

	public PresupuestoVentasLineasBeanSwingJInternalFrame presupuestoventaslineasBeanSwingJInternalFrame=null;
	public PresupuestoVentasLineasBeanSwingJInternalFrame presupuestoventaslineasBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePresupuestoVentasLineas=false;
	public PresupuestoVentasLineasSessionBean presupuestoventaslineasSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EmpleadoSessionBean empleadosoporteSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;	
	
	public VendedorLogic vendedorLogic;
	
	public JScrollPane jScrollPanelDatosVendedor;
	public JScrollPane jScrollPanelDatosEdicionVendedor;
	public JScrollPane jScrollPanelDatosGeneralVendedor;
	
	protected JPanel jPanelCamposVendedor;    
	protected JPanel jPanelCamposOcultosVendedor;    	
	protected JPanel jPanelAccionesVendedor;
	protected JPanel jPanelAccionesFormularioVendedor;
    
	
	
	protected JTabbedPane jTabbedPaneCamposVendedor;	
	protected Integer iXPanelCamposVendedor=0;
	protected Integer iYPanelCamposVendedor=0;
	
	protected Integer iXPanelCamposOcultosVendedor=0;
	protected Integer iYPanelCamposOcultosVendedor=0;
	
	

	protected JPanel jPanelCamposIniciogeneralVendedor;
	protected Integer iXPanelCamposIniciogeneralVendedor=0;
	protected Integer iYPanelCamposIniciogeneralVendedor=0;

	protected JPanel jPanelCamposInicioventasVendedor;
	protected Integer iXPanelCamposInicioventasVendedor=0;
	protected Integer iYPanelCamposInicioventasVendedor=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVendedor;
	public JButton jButtonModificarVendedor;
	public JButton jButtonActualizarVendedor;
    public JButton jButtonEliminarVendedor;
	public JButton jButtonCancelarVendedor;
    public JButton jButtonGuardarCambiosVendedor;
	public JButton jButtonGuardarCambiosTablaVendedor;
	protected JButton jButtonCerrarVendedor;
	
	
	protected JButton jButtonProcesarInformacionVendedor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVendedor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVendedor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVendedor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVendedor;
	protected JButton jButtonModificarToolBarVendedor;
	protected JButton jButtonActualizarToolBarVendedor;
    protected JButton jButtonEliminarToolBarVendedor;
	protected JButton jButtonCancelarToolBarVendedor;
    protected JButton jButtonGuardarCambiosToolBarVendedor;
	protected JButton jButtonGuardarCambiosTablaToolBarVendedor;
	protected JButton jButtonMostrarOcultarTablaToolBarVendedor;
	protected JButton jButtonCerrarToolBarVendedor;
	
	protected JButton jButtonProcesarInformacionToolBarVendedor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVendedor;
	protected JMenuItem jMenuItemModificarVendedor;
	protected JMenuItem jMenuItemActualizarVendedor;
    protected JMenuItem jMenuItemEliminarVendedor;
	protected JMenuItem jMenuItemCancelarVendedor;
    protected JMenuItem jMenuItemGuardarCambiosVendedor;
	protected JMenuItem jMenuItemGuardarCambiosTablaVendedor;
	protected JMenuItem jMenuItemCerrarVendedor;
	protected JMenuItem jMenuItemDetalleCerrarVendedor;
	protected JMenuItem jMenuItemDetalleMostarOcultarVendedor;
	
	protected JMenuItem jMenuItemProcesarInformacionVendedor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVendedor;
	protected JMenuItem jMenuItemMostrarOcultarVendedor;
	
	
	//MENU
	
	protected JButton jButtonArbolVendedor;	
	
	protected JLabel jLabelAccionesVendedor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVendedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVendedor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVendedor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVendedor;
	public JLabel jLabelIdVendedor;
	public JLabel jLabelidVendedor;
	public JButton jButtonidVendedorBusqueda= new JButtonMe();

	public JPanel jPanelcodigoVendedor;
	public JLabel jLabelcodigoVendedor;
	public JTextField jTextFieldcodigoVendedor;
	public JButton jButtoncodigoVendedorBusqueda= new JButtonMe();

	public JPanel jPanelnombreVendedor;
	public JLabel jLabelnombreVendedor;
	public JTextArea jTextAreanombreVendedor;
	public JScrollPane jscrollPanenombreVendedor;
	public JButton jButtonnombreVendedorBusqueda= new JButtonMe();

	public JPanel jPanelrucVendedor;
	public JLabel jLabelrucVendedor;
	public JTextField jTextFieldrucVendedor;
	public JButton jButtonrucVendedorBusqueda= new JButtonMe();

	public JPanel jPanelemailVendedor;
	public JLabel jLabelemailVendedor;
	public JTextArea jTextAreaemailVendedor;
	public JScrollPane jscrollPaneemailVendedor;
	public JButton jButtonemailVendedorBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoVendedor;
	public JLabel jLabeltelefonoVendedor;
	public JTextArea jTextAreatelefonoVendedor;
	public JScrollPane jscrollPanetelefonoVendedor;
	public JButton jButtontelefonoVendedorBusqueda= new JButtonMe();

	public JPanel jPanelrepresentanteVendedor;
	public JLabel jLabelrepresentanteVendedor;
	public JTextArea jTextArearepresentanteVendedor;
	public JScrollPane jscrollPanerepresentanteVendedor;
	public JButton jButtonrepresentanteVendedorBusqueda= new JButtonMe();

	public JPanel jPaneles_supervisorVendedor;
	public JLabel jLabeles_supervisorVendedor;
	public JCheckBox jCheckBoxes_supervisorVendedor;
	public JButton jButtones_supervisorVendedorBusqueda= new JButtonMe();

	public JPanel jPanelfecha_creacionVendedor;
	public JLabel jLabelfecha_creacionVendedor;
	//public JFormattedTextField jDateChooserfecha_creacionVendedor;

	public JDateChooser jDateChooserfecha_creacionVendedor;
	public JButton jButtonfecha_creacionVendedorBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_domicilioVendedor;
	public JLabel jLabeldireccion_domicilioVendedor;
	public JTextArea jTextAreadireccion_domicilioVendedor;
	public JScrollPane jscrollPanedireccion_domicilioVendedor;
	public JButton jButtondireccion_domicilioVendedorBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_referenciaVendedor;
	public JLabel jLabeldireccion_referenciaVendedor;
	public JTextArea jTextAreadireccion_referenciaVendedor;
	public JScrollPane jscrollPanedireccion_referenciaVendedor;
	public JButton jButtondireccion_referenciaVendedorBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionVendedor;
	public JLabel jLabeldescripcionVendedor;
	public JTextArea jTextAreadescripcionVendedor;
	public JScrollPane jscrollPanedescripcionVendedor;
	public JButton jButtondescripcionVendedorBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_comisionVendedor;
	public JLabel jLabelporcentaje_comisionVendedor;
	public JTextField jTextFieldporcentaje_comisionVendedor;
	public JButton jButtonporcentaje_comisionVendedorBusqueda= new JButtonMe();

	public JPanel jPanelcomisionVendedor;
	public JLabel jLabelcomisionVendedor;
	public JTextField jTextFieldcomisionVendedor;
	public JButton jButtoncomisionVendedorBusqueda= new JButtonMe();

	public JPanel jPanelmonto_vendidoVendedor;
	public JLabel jLabelmonto_vendidoVendedor;
	public JTextField jTextFieldmonto_vendidoVendedor;
	public JButton jButtonmonto_vendidoVendedorBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturasVendedor;
	public JLabel jLabelnumero_facturasVendedor;
	public JTextField jTextFieldnumero_facturasVendedor;
	public JButton jButtonnumero_facturasVendedorBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_ventaVendedor;
	public JLabel jLabelfecha_ultima_ventaVendedor;
	//public JFormattedTextField jDateChooserfecha_ultima_ventaVendedor;

	public JDateChooser jDateChooserfecha_ultima_ventaVendedor;
	public JButton jButtonfecha_ultima_ventaVendedorBusqueda= new JButtonMe();

	public JPanel jPanelmonto_ultima_ventaVendedor;
	public JLabel jLabelmonto_ultima_ventaVendedor;
	public JTextField jTextFieldmonto_ultima_ventaVendedor;
	public JButton jButtonmonto_ultima_ventaVendedorBusqueda= new JButtonMe();

	public JPanel jPanelcon_presupuestoVendedor;
	public JLabel jLabelcon_presupuestoVendedor;
	public JCheckBox jCheckBoxcon_presupuestoVendedor;
	public JButton jButtoncon_presupuestoVendedorBusqueda= new JButtonMe();

	public JPanel jPanelcon_coberturaVendedor;
	public JLabel jLabelcon_coberturaVendedor;
	public JCheckBox jCheckBoxcon_coberturaVendedor;
	public JButton jButtoncon_coberturaVendedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVendedor;
	public JLabel jLabelid_empresaVendedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVendedor;
	public JButton jButtonid_empresaVendedor= new JButtonMe();
	public JButton jButtonid_empresaVendedorUpdate= new JButtonMe();
	public JButton jButtonid_empresaVendedorBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalVendedor;
	public JLabel jLabelid_sucursalVendedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalVendedor;
	public JButton jButtonid_sucursalVendedor= new JButtonMe();
	public JButton jButtonid_sucursalVendedorUpdate= new JButtonMe();
	public JButton jButtonid_sucursalVendedorBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoVendedor;
	public JLabel jLabelid_empleadoVendedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoVendedor;
	public JButton jButtonid_empleadoVendedor= new JButtonMe();
	public JButton jButtonid_empleadoVendedorUpdate= new JButtonMe();
	public JButton jButtonid_empleadoVendedorBusqueda= new JButtonMe();

	public JPanel jPanelid_empleado_soporteVendedor;
	public JLabel jLabelid_empleado_soporteVendedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_soporteVendedor;
	public JButton jButtonid_empleado_soporteVendedor= new JButtonMe();
	public JButton jButtonid_empleado_soporteVendedorUpdate= new JButtonMe();
	public JButton jButtonid_empleado_soporteVendedorBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorVendedor;
	public JLabel jLabelid_vendedorVendedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorVendedor;
	public JButton jButtonid_vendedorVendedor= new JButtonMe();
	public JButton jButtonid_vendedorVendedorUpdate= new JButtonMe();
	public JButton jButtonid_vendedorVendedorBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorVendedorArbol= new JButtonMe();

	public JPanel jPanelid_paisVendedor;
	public JLabel jLabelid_paisVendedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisVendedor;
	public JButton jButtonid_paisVendedor= new JButtonMe();
	public JButton jButtonid_paisVendedorUpdate= new JButtonMe();
	public JButton jButtonid_paisVendedorBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadVendedor;
	public JLabel jLabelid_ciudadVendedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadVendedor;
	public JButton jButtonid_ciudadVendedor= new JButtonMe();
	public JButton jButtonid_ciudadVendedorUpdate= new JButtonMe();
	public JButton jButtonid_ciudadVendedorBusqueda= new JButtonMe();

	public JPanel jPanelid_zonaVendedor;
	public JLabel jLabelid_zonaVendedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaVendedor;
	public JButton jButtonid_zonaVendedor= new JButtonMe();
	public JButton jButtonid_zonaVendedorUpdate= new JButtonMe();
	public JButton jButtonid_zonaVendedorBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVendedor;
	
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
	public int iHeightFormulario=1078;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VendedorDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVendedor=new JPanel();
				this.jPanelAccionesFormularioVendedor=new JPanel();
				this.jmenuBarDetalleVendedor=new JMenuBar();
				this.jTtoolBarDetalleVendedor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Vendedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VendedorDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Vendedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Vendedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Vendedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Vendedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVendedor() {
		return this.jButtonActualizarToolBarVendedor;
	}
	
	public JButton getjButtonEliminarToolBarVendedor() {
		return this.jButtonEliminarToolBarVendedor;
	}
	
	public JButton getjButtonCancelarToolBarVendedor() {
		return this.jButtonCancelarToolBarVendedor;
	}		
	
	public JButton getjButtonProcesarInformacionVendedor() {
		return this.jButtonProcesarInformacionVendedor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVendedor)	{
		this.jButtonProcesarInformacionVendedor = jButtonProcesarInformacionVendedor;
	}
	
	
	public JButton getjButtonArbolVendedor() {
		return this.jButtonArbolVendedor;
	}
	
	public void setjButtonArbol(JButton jButtonArbolVendedor)	{
		this.jButtonArbolVendedor = jButtonArbolVendedor;
	}
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVendedor() {
		return this.jComboBoxTiposAccionesVendedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVendedor(
			JComboBox jComboBoxTiposRelacionesVendedor) {
		this.jComboBoxTiposRelacionesVendedor = jComboBoxTiposRelacionesVendedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVendedor(
			JComboBox jComboBoxTiposAccionesVendedor) {
		this.jComboBoxTiposAccionesVendedor = jComboBoxTiposAccionesVendedor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVendedor() {
		return this.jComboBoxTiposAccionesFormularioVendedor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVendedor(
			JComboBox jComboBoxTiposAccionesFormularioVendedor) {
		this.jComboBoxTiposAccionesFormularioVendedor = jComboBoxTiposAccionesFormularioVendedor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.vendedorSessionBean=new VendedorSessionBean();
		
		this.vendedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vendedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.vendedorSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.notacreditosoliSessionBean=new NotaCreditoSoliSessionBean();
		//this.comisionventacobroSessionBean=new ComisionVentaCobroSessionBean();
		//this.vendedorSessionBean=new VendedorSessionBean();
		//this.clienteSessionBean=new ClienteSessionBean();
		//this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
		//this.comisionlineaSessionBean=new ComisionLineaSessionBean();
		//this.vendedorzonaSessionBean=new VendedorZonaSessionBean();
		//this.comisioncateSessionBean=new ComisionCateSessionBean();
		//this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
		//this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
		//this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
		//this.presupuestoventaslineasSessionBean=new PresupuestoVentasLineasSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VendedorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VendedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VendedorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Vendedor MANTENIMIENTO"));
		
		
		if(iWidth > 2750) {
			iWidth=2750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.vendedorSessionBean.getEsGuardarRelacionado()) {
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
	
		VendedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVendedor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVendedor=new JButtonMe();
				this.jButtonModificarToolBarVendedor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVendedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVendedor,this.jTtoolBarDetalleVendedor,
							"actualizar","actualizar","Actualizar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVendedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVendedor,this.jTtoolBarDetalleVendedor,
							"eliminar","eliminar","Eliminar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVendedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVendedor,this.jTtoolBarDetalleVendedor,
							"cancelar","cancelar","Cancelar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVendedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVendedor,this.jTtoolBarDetalleVendedor,
							"guardarcambios","guardarcambios","Guardar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVendedor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVendedor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVendedor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVendedor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVendedor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVendedor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVendedor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVendedor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVendedor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVendedor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVendedor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVendedor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVendedor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVendedor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVendedor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVendedor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVendedor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVendedor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVendedor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVendedor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVendedor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVendedor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVendedor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVendedor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVendedor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVendedor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVendedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVendedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVendedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVendedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVendedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVendedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVendedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVendedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVendedor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVendedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVendedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVendedor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVendedor.add(this.jMenuItemDetalleCerrarVendedor);
		
		this.jmenuDetalleAccionesVendedor.add(this.jMenuItemActualizarVendedor);
		this.jmenuDetalleAccionesVendedor.add(this.jMenuItemEliminarVendedor);
		this.jmenuDetalleAccionesVendedor.add(this.jMenuItemCancelarVendedor);		
		
		//this.jmenuDetalleDatosVendedor.add(this.jMenuItemDetalleAbrirOrderByVendedor);				
		this.jmenuDetalleDatosVendedor.add(this.jMenuItemDetalleMostarOcultarVendedor);				
				
		//this.jmenuDetalleAccionesVendedor.add(this.jMenuItemGuardarCambiosVendedor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVendedor.add(this.jmenuDetalleArchivoVendedor);		
		this.jmenuBarDetalleVendedor.add(this.jmenuDetalleAccionesVendedor);		
		this.jmenuBarDetalleVendedor.add(this.jmenuDetalleDatosVendedor);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleVendedor.add(this.jmenuDetalleVendedor);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVendedor);				
	}
	
	
	public void inicializarElementosCamposVendedor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVendedor = new JLabelMe();
		jLabelIdVendedor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVendedor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVendedor= new GridBagLayout();

		this.jPanelidVendedor.setLayout(this.gridaBagLayoutVendedor);

		jLabelidVendedor = new JLabel();
		jLabelidVendedor.setText("Id");

		jLabelidVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoVendedor = new JLabelMe();
		this.jLabelcodigoVendedor.setText(""+VendedorConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoVendedor.setToolTipText("Codigo");
		this.jLabelcodigoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelcodigoVendedor.setLayout(this.gridaBagLayoutVendedor);


		jTextFieldcodigoVendedor= new JTextFieldMe();

		jTextFieldcodigoVendedor.setEnabled(false);
		jTextFieldcodigoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoVendedorBusqueda= new JButtonMe();
		this.jButtoncodigoVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoVendedorBusqueda.setText("U");
		this.jButtoncodigoVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoVendedorBusqueda.setVisible(false);		}


					
		this.jLabelnombreVendedor = new JLabelMe();
		this.jLabelnombreVendedor.setText(""+VendedorConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreVendedor.setToolTipText("Nombre");
		this.jLabelnombreVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelnombreVendedor.setLayout(this.gridaBagLayoutVendedor);


		jTextAreanombreVendedor= new JTextAreaMe();
		jTextAreanombreVendedor.setEnabled(false);
		jTextAreanombreVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreVendedor.setLineWrap(true);
		jTextAreanombreVendedor.setWrapStyleWord(true);
		jTextAreanombreVendedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreVendedor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreVendedor = new JScrollPane(jTextAreanombreVendedor);
		jscrollPanenombreVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreVendedorBusqueda= new JButtonMe();
		this.jButtonnombreVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreVendedorBusqueda.setText("U");
		this.jButtonnombreVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreVendedorBusqueda.setVisible(false);		}


					
		this.jLabelrucVendedor = new JLabelMe();
		this.jLabelrucVendedor.setText(""+VendedorConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucVendedor.setToolTipText("Ruc");
		this.jLabelrucVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelrucVendedor.setLayout(this.gridaBagLayoutVendedor);


		jTextFieldrucVendedor= new JTextFieldMe();

		jTextFieldrucVendedor.setEnabled(false);
		jTextFieldrucVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucVendedorBusqueda= new JButtonMe();
		this.jButtonrucVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucVendedorBusqueda.setText("U");
		this.jButtonrucVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucVendedorBusqueda.setVisible(false);		}


					
		this.jLabelemailVendedor = new JLabelMe();
		this.jLabelemailVendedor.setText(""+VendedorConstantesFunciones.LABEL_EMAIL+" :");
		this.jLabelemailVendedor.setToolTipText("Email");
		this.jLabelemailVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelemailVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelemailVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelemailVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_EMAIL);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelemailVendedor.setLayout(this.gridaBagLayoutVendedor);


		jTextAreaemailVendedor= new JTextAreaMe();
		jTextAreaemailVendedor.setEnabled(false);
		jTextAreaemailVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailVendedor.setLineWrap(true);
		jTextAreaemailVendedor.setWrapStyleWord(true);
		jTextAreaemailVendedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaemailVendedor.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaemailVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneemailVendedor = new JScrollPane(jTextAreaemailVendedor);
		jscrollPaneemailVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneemailVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneemailVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonemailVendedorBusqueda= new JButtonMe();
		this.jButtonemailVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonemailVendedorBusqueda.setText("U");
		this.jButtonemailVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonemailVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonemailVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaemailVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaemailVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"emailVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonemailVendedorBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoVendedor = new JLabelMe();
		this.jLabeltelefonoVendedor.setText(""+VendedorConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoVendedor.setToolTipText("Telefono");
		this.jLabeltelefonoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPaneltelefonoVendedor.setLayout(this.gridaBagLayoutVendedor);


		jTextAreatelefonoVendedor= new JTextAreaMe();
		jTextAreatelefonoVendedor.setEnabled(false);
		jTextAreatelefonoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoVendedor.setLineWrap(true);
		jTextAreatelefonoVendedor.setWrapStyleWord(true);
		jTextAreatelefonoVendedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonoVendedor.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonoVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonoVendedor = new JScrollPane(jTextAreatelefonoVendedor);
		jscrollPanetelefonoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontelefonoVendedorBusqueda= new JButtonMe();
		this.jButtontelefonoVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoVendedorBusqueda.setText("U");
		this.jButtontelefonoVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonoVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonoVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoVendedorBusqueda.setVisible(false);		}


					
		this.jLabelrepresentanteVendedor = new JLabelMe();
		this.jLabelrepresentanteVendedor.setText(""+VendedorConstantesFunciones.LABEL_REPRESENTANTE+" :");
		this.jLabelrepresentanteVendedor.setToolTipText("Representante");
		this.jLabelrepresentanteVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrepresentanteVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrepresentanteVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrepresentanteVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrepresentanteVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrepresentanteVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_REPRESENTANTE);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelrepresentanteVendedor.setLayout(this.gridaBagLayoutVendedor);


		jTextArearepresentanteVendedor= new JTextAreaMe();
		jTextArearepresentanteVendedor.setEnabled(false);
		jTextArearepresentanteVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentanteVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentanteVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentanteVendedor.setLineWrap(true);
		jTextArearepresentanteVendedor.setWrapStyleWord(true);
		jTextArearepresentanteVendedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearepresentanteVendedor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextArearepresentanteVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanerepresentanteVendedor = new JScrollPane(jTextArearepresentanteVendedor);
		jscrollPanerepresentanteVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanerepresentanteVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanerepresentanteVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonrepresentanteVendedorBusqueda= new JButtonMe();
		this.jButtonrepresentanteVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrepresentanteVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrepresentanteVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrepresentanteVendedorBusqueda.setText("U");
		this.jButtonrepresentanteVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrepresentanteVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrepresentanteVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearepresentanteVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearepresentanteVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"representanteVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrepresentanteVendedorBusqueda.setVisible(false);		}


					
		this.jLabeles_supervisorVendedor = new JLabelMe();
		this.jLabeles_supervisorVendedor.setText(""+VendedorConstantesFunciones.LABEL_ESSUPERVISOR+" : *");
		this.jLabeles_supervisorVendedor.setToolTipText("Es Supervisor");
		this.jLabeles_supervisorVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_supervisorVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_supervisorVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_supervisorVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_supervisorVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_supervisorVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_ESSUPERVISOR);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPaneles_supervisorVendedor.setLayout(this.gridaBagLayoutVendedor);


		jCheckBoxes_supervisorVendedor= new JCheckBoxMe();
		jCheckBoxes_supervisorVendedor.setEnabled(false);

		jCheckBoxes_supervisorVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_supervisorVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_supervisorVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_supervisorVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_supervisorVendedorBusqueda= new JButtonMe();
		this.jButtones_supervisorVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_supervisorVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_supervisorVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_supervisorVendedorBusqueda.setText("U");
		this.jButtones_supervisorVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_supervisorVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_supervisorVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_supervisorVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_supervisorVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_supervisorVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_supervisorVendedorBusqueda.setVisible(false);		}


					
		this.jLabelfecha_creacionVendedor = new JLabelMe();
		this.jLabelfecha_creacionVendedor.setText(""+VendedorConstantesFunciones.LABEL_FECHACREACION+" : *");
		this.jLabelfecha_creacionVendedor.setToolTipText("Fecha Creacion");
		this.jLabelfecha_creacionVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_creacionVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_creacionVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_creacionVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_creacionVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_creacionVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_FECHACREACION);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelfecha_creacionVendedor.setLayout(this.gridaBagLayoutVendedor);


		//jFormattedTextFieldfecha_creacionVendedor= new JFormattedTextFieldMe();

		jDateChooserfecha_creacionVendedor= new JDateChooser();
		jDateChooserfecha_creacionVendedor.setEnabled(false);
		jDateChooserfecha_creacionVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_creacionVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_creacionVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_creacionVendedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_creacionVendedor.setDate(new Date());
		jDateChooserfecha_creacionVendedor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_creacionVendedor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_creacionVendedorBusqueda= new JButtonMe();
		this.jButtonfecha_creacionVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_creacionVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_creacionVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_creacionVendedorBusqueda.setText("U");
		this.jButtonfecha_creacionVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_creacionVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_creacionVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_creacionVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_creacionVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_creacionVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_creacionVendedorBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_domicilioVendedor = new JLabelMe();
		this.jLabeldireccion_domicilioVendedor.setText(""+VendedorConstantesFunciones.LABEL_DIRECCIONDOMICILIO+" : *");
		this.jLabeldireccion_domicilioVendedor.setToolTipText("Direccion Domicilio");
		this.jLabeldireccion_domicilioVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_domicilioVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_domicilioVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_domicilioVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_domicilioVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_domicilioVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_DIRECCIONDOMICILIO);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPaneldireccion_domicilioVendedor.setLayout(this.gridaBagLayoutVendedor);


		jTextAreadireccion_domicilioVendedor= new JTextAreaMe();
		jTextAreadireccion_domicilioVendedor.setEnabled(false);
		jTextAreadireccion_domicilioVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_domicilioVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_domicilioVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_domicilioVendedor.setLineWrap(true);
		jTextAreadireccion_domicilioVendedor.setWrapStyleWord(true);
		jTextAreadireccion_domicilioVendedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_domicilioVendedor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_domicilioVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_domicilioVendedor = new JScrollPane(jTextAreadireccion_domicilioVendedor);
		jscrollPanedireccion_domicilioVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccion_domicilioVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccion_domicilioVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccion_domicilioVendedorBusqueda= new JButtonMe();
		this.jButtondireccion_domicilioVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_domicilioVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_domicilioVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_domicilioVendedorBusqueda.setText("U");
		this.jButtondireccion_domicilioVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_domicilioVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_domicilioVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_domicilioVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_domicilioVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_domicilioVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_domicilioVendedorBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_referenciaVendedor = new JLabelMe();
		this.jLabeldireccion_referenciaVendedor.setText(""+VendedorConstantesFunciones.LABEL_DIRECCIONREFERENCIA+" :");
		this.jLabeldireccion_referenciaVendedor.setToolTipText("Direccion Referencia");
		this.jLabeldireccion_referenciaVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldireccion_referenciaVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldireccion_referenciaVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_referenciaVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_referenciaVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_referenciaVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_DIRECCIONREFERENCIA);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPaneldireccion_referenciaVendedor.setLayout(this.gridaBagLayoutVendedor);


		jTextAreadireccion_referenciaVendedor= new JTextAreaMe();
		jTextAreadireccion_referenciaVendedor.setEnabled(false);
		jTextAreadireccion_referenciaVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_referenciaVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_referenciaVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_referenciaVendedor.setLineWrap(true);
		jTextAreadireccion_referenciaVendedor.setWrapStyleWord(true);
		jTextAreadireccion_referenciaVendedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_referenciaVendedor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_referenciaVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_referenciaVendedor = new JScrollPane(jTextAreadireccion_referenciaVendedor);
		jscrollPanedireccion_referenciaVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccion_referenciaVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccion_referenciaVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccion_referenciaVendedorBusqueda= new JButtonMe();
		this.jButtondireccion_referenciaVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_referenciaVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_referenciaVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_referenciaVendedorBusqueda.setText("U");
		this.jButtondireccion_referenciaVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_referenciaVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_referenciaVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_referenciaVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_referenciaVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_referenciaVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_referenciaVendedorBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionVendedor = new JLabelMe();
		this.jLabeldescripcionVendedor.setText(""+VendedorConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionVendedor.setToolTipText("Descripcion");
		this.jLabeldescripcionVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPaneldescripcionVendedor.setLayout(this.gridaBagLayoutVendedor);


		jTextAreadescripcionVendedor= new JTextAreaMe();
		jTextAreadescripcionVendedor.setEnabled(false);
		jTextAreadescripcionVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionVendedor.setLineWrap(true);
		jTextAreadescripcionVendedor.setWrapStyleWord(true);
		jTextAreadescripcionVendedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionVendedor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionVendedor = new JScrollPane(jTextAreadescripcionVendedor);
		jscrollPanedescripcionVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionVendedorBusqueda= new JButtonMe();
		this.jButtondescripcionVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionVendedorBusqueda.setText("U");
		this.jButtondescripcionVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionVendedorBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_comisionVendedor = new JLabelMe();
		this.jLabelporcentaje_comisionVendedor.setText(""+VendedorConstantesFunciones.LABEL_PORCENTAJECOMISION+" : *");
		this.jLabelporcentaje_comisionVendedor.setToolTipText("Porcentaje Comision");
		this.jLabelporcentaje_comisionVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_comisionVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_comisionVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_comisionVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_comisionVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_comisionVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_PORCENTAJECOMISION);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelporcentaje_comisionVendedor.setLayout(this.gridaBagLayoutVendedor);


		jTextFieldporcentaje_comisionVendedor= new JTextFieldMe();
		jTextFieldporcentaje_comisionVendedor.setEnabled(false);
		jTextFieldporcentaje_comisionVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_comisionVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_comisionVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_comisionVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_comisionVendedor.setText("0.0");

		this.jButtonporcentaje_comisionVendedorBusqueda= new JButtonMe();
		this.jButtonporcentaje_comisionVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_comisionVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_comisionVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_comisionVendedorBusqueda.setText("U");
		this.jButtonporcentaje_comisionVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_comisionVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_comisionVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_comisionVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_comisionVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_comisionVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_comisionVendedorBusqueda.setVisible(false);		}


					
		this.jLabelcomisionVendedor = new JLabelMe();
		this.jLabelcomisionVendedor.setText(""+VendedorConstantesFunciones.LABEL_COMISION+" : *");
		this.jLabelcomisionVendedor.setToolTipText("Comision");
		this.jLabelcomisionVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcomisionVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcomisionVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcomisionVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcomisionVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcomisionVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_COMISION);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelcomisionVendedor.setLayout(this.gridaBagLayoutVendedor);


		jTextFieldcomisionVendedor= new JTextFieldMe();
		jTextFieldcomisionVendedor.setEnabled(false);
		jTextFieldcomisionVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcomisionVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcomisionVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcomisionVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcomisionVendedor.setText("0.0");

		this.jButtoncomisionVendedorBusqueda= new JButtonMe();
		this.jButtoncomisionVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncomisionVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncomisionVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncomisionVendedorBusqueda.setText("U");
		this.jButtoncomisionVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncomisionVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncomisionVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcomisionVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcomisionVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"comisionVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncomisionVendedorBusqueda.setVisible(false);		}


					
		this.jLabelmonto_vendidoVendedor = new JLabelMe();
		this.jLabelmonto_vendidoVendedor.setText(""+VendedorConstantesFunciones.LABEL_MONTOVENDIDO+" : *");
		this.jLabelmonto_vendidoVendedor.setToolTipText("Monto Vendido");
		this.jLabelmonto_vendidoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_vendidoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_vendidoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_vendidoVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_vendidoVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_vendidoVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_MONTOVENDIDO);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelmonto_vendidoVendedor.setLayout(this.gridaBagLayoutVendedor);


		jTextFieldmonto_vendidoVendedor= new JTextFieldMe();
		jTextFieldmonto_vendidoVendedor.setEnabled(false);
		jTextFieldmonto_vendidoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_vendidoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_vendidoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_vendidoVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_vendidoVendedor.setText("0.0");

		jTextFieldmonto_vendidoVendedor.setEnabled(false);
		this.jButtonmonto_vendidoVendedorBusqueda= new JButtonMe();
		this.jButtonmonto_vendidoVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_vendidoVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_vendidoVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_vendidoVendedorBusqueda.setText("U");
		this.jButtonmonto_vendidoVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_vendidoVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_vendidoVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_vendidoVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_vendidoVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_vendidoVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_vendidoVendedorBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturasVendedor = new JLabelMe();
		this.jLabelnumero_facturasVendedor.setText(""+VendedorConstantesFunciones.LABEL_NUMEROFACTURAS+" : *");
		this.jLabelnumero_facturasVendedor.setToolTipText("Numero Facturas");
		this.jLabelnumero_facturasVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_facturasVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_facturasVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturasVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturasVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturasVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_NUMEROFACTURAS);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelnumero_facturasVendedor.setLayout(this.gridaBagLayoutVendedor);


		jTextFieldnumero_facturasVendedor= new JTextFieldMe();
		jTextFieldnumero_facturasVendedor.setEnabled(false);
		jTextFieldnumero_facturasVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturasVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturasVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturasVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_facturasVendedor.setText("0");

		jTextFieldnumero_facturasVendedor.setEnabled(false);
		this.jButtonnumero_facturasVendedorBusqueda= new JButtonMe();
		this.jButtonnumero_facturasVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturasVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturasVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturasVendedorBusqueda.setText("U");
		this.jButtonnumero_facturasVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturasVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturasVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturasVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturasVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturasVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturasVendedorBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultima_ventaVendedor = new JLabelMe();
		this.jLabelfecha_ultima_ventaVendedor.setText(""+VendedorConstantesFunciones.LABEL_FECHAULTIMAVENTA+" : *");
		this.jLabelfecha_ultima_ventaVendedor.setToolTipText("Fecha Ultima Venta");
		this.jLabelfecha_ultima_ventaVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_ventaVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultima_ventaVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_ventaVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_ventaVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_ventaVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_FECHAULTIMAVENTA);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelfecha_ultima_ventaVendedor.setLayout(this.gridaBagLayoutVendedor);


		//jFormattedTextFieldfecha_ultima_ventaVendedor= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_ventaVendedor= new JDateChooser();
		jDateChooserfecha_ultima_ventaVendedor.setEnabled(false);
		jDateChooserfecha_ultima_ventaVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_ventaVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_ventaVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_ventaVendedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_ventaVendedor.setDate(new Date());
		jDateChooserfecha_ultima_ventaVendedor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_ventaVendedor.setText(Funciones.getStringMySqlCurrentDate());

		//jFormattedTextFieldfecha_ultima_ventaVendedor.setEnabled(false);
		jDateChooserfecha_ultima_ventaVendedor.setEnabled(false);
		this.jButtonfecha_ultima_ventaVendedorBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_ventaVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_ventaVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_ventaVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_ventaVendedorBusqueda.setText("U");
		this.jButtonfecha_ultima_ventaVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_ventaVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_ventaVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_ventaVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_ventaVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_ventaVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_ventaVendedorBusqueda.setVisible(false);		}


					
		this.jLabelmonto_ultima_ventaVendedor = new JLabelMe();
		this.jLabelmonto_ultima_ventaVendedor.setText(""+VendedorConstantesFunciones.LABEL_MONTOULTIMAVENTA+" : *");
		this.jLabelmonto_ultima_ventaVendedor.setToolTipText("Monto Ultima Venta");
		this.jLabelmonto_ultima_ventaVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_ultima_ventaVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_ultima_ventaVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_ultima_ventaVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_ultima_ventaVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_ultima_ventaVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_MONTOULTIMAVENTA);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelmonto_ultima_ventaVendedor.setLayout(this.gridaBagLayoutVendedor);


		jTextFieldmonto_ultima_ventaVendedor= new JTextFieldMe();
		jTextFieldmonto_ultima_ventaVendedor.setEnabled(false);
		jTextFieldmonto_ultima_ventaVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ultima_ventaVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ultima_ventaVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_ultima_ventaVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_ultima_ventaVendedor.setText("0.0");

		jTextFieldmonto_ultima_ventaVendedor.setEnabled(false);
		this.jButtonmonto_ultima_ventaVendedorBusqueda= new JButtonMe();
		this.jButtonmonto_ultima_ventaVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ultima_ventaVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ultima_ventaVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_ultima_ventaVendedorBusqueda.setText("U");
		this.jButtonmonto_ultima_ventaVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_ultima_ventaVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_ultima_ventaVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_ultima_ventaVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_ultima_ventaVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_ultima_ventaVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_ultima_ventaVendedorBusqueda.setVisible(false);		}


					
		this.jLabelcon_presupuestoVendedor = new JLabelMe();
		this.jLabelcon_presupuestoVendedor.setText(""+VendedorConstantesFunciones.LABEL_CONPRESUPUESTO+" : *");
		this.jLabelcon_presupuestoVendedor.setToolTipText("Con Presupuesto");
		this.jLabelcon_presupuestoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_presupuestoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_presupuestoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_presupuestoVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_presupuestoVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_presupuestoVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_CONPRESUPUESTO);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelcon_presupuestoVendedor.setLayout(this.gridaBagLayoutVendedor);


		jCheckBoxcon_presupuestoVendedor= new JCheckBoxMe();
		jCheckBoxcon_presupuestoVendedor.setEnabled(false);

		jCheckBoxcon_presupuestoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_presupuestoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_presupuestoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_presupuestoVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_presupuestoVendedorBusqueda= new JButtonMe();
		this.jButtoncon_presupuestoVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_presupuestoVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_presupuestoVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_presupuestoVendedorBusqueda.setText("U");
		this.jButtoncon_presupuestoVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_presupuestoVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_presupuestoVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_presupuestoVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_presupuestoVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_presupuestoVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_presupuestoVendedorBusqueda.setVisible(false);		}


					
		this.jLabelcon_coberturaVendedor = new JLabelMe();
		this.jLabelcon_coberturaVendedor.setText(""+VendedorConstantesFunciones.LABEL_CONCOBERTURA+" : *");
		this.jLabelcon_coberturaVendedor.setToolTipText("Con Cobertura");
		this.jLabelcon_coberturaVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_coberturaVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_coberturaVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_coberturaVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_coberturaVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_coberturaVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_CONCOBERTURA);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelcon_coberturaVendedor.setLayout(this.gridaBagLayoutVendedor);


		jCheckBoxcon_coberturaVendedor= new JCheckBoxMe();
		jCheckBoxcon_coberturaVendedor.setEnabled(false);

		jCheckBoxcon_coberturaVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_coberturaVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_coberturaVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_coberturaVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_coberturaVendedorBusqueda= new JButtonMe();
		this.jButtoncon_coberturaVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_coberturaVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_coberturaVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_coberturaVendedorBusqueda.setText("U");
		this.jButtoncon_coberturaVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_coberturaVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_coberturaVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_coberturaVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_coberturaVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_coberturaVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_coberturaVendedorBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVendedor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVendedor = new JLabelMe();
		this.jLabelid_empresaVendedor.setText(""+VendedorConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVendedor.setToolTipText("Empresa");
		this.jLabelid_empresaVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelid_empresaVendedor.setLayout(this.gridaBagLayoutVendedor);


		jComboBoxid_empresaVendedor= new JComboBoxMe();
		jComboBoxid_empresaVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVendedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVendedor.setEnabled(false);

		this.jButtonid_empresaVendedor= new JButtonMe();
		this.jButtonid_empresaVendedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVendedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVendedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVendedor.setText("Buscar");
		this.jButtonid_empresaVendedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVendedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVendedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVendedor"));

		this.jButtonid_empresaVendedorBusqueda= new JButtonMe();
		this.jButtonid_empresaVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVendedorBusqueda.setText("U");
		this.jButtonid_empresaVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVendedorBusqueda.setVisible(false);		}

		this.jButtonid_empresaVendedorUpdate= new JButtonMe();
		this.jButtonid_empresaVendedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVendedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVendedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVendedorUpdate.setText("U");
		this.jButtonid_empresaVendedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVendedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVendedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVendedorUpdate"));



					
		this.jLabelid_sucursalVendedor = new JLabelMe();
		this.jLabelid_sucursalVendedor.setText(""+VendedorConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalVendedor.setToolTipText("Sucursal");
		this.jLabelid_sucursalVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelid_sucursalVendedor.setLayout(this.gridaBagLayoutVendedor);


		jComboBoxid_sucursalVendedor= new JComboBoxMe();
		jComboBoxid_sucursalVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalVendedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalVendedor.setEnabled(false);

		this.jButtonid_sucursalVendedor= new JButtonMe();
		this.jButtonid_sucursalVendedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVendedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVendedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalVendedor.setText("Buscar");
		this.jButtonid_sucursalVendedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalVendedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVendedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVendedor"));

		this.jButtonid_sucursalVendedorBusqueda= new JButtonMe();
		this.jButtonid_sucursalVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVendedorBusqueda.setText("U");
		this.jButtonid_sucursalVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalVendedorBusqueda.setVisible(false);		}

		this.jButtonid_sucursalVendedorUpdate= new JButtonMe();
		this.jButtonid_sucursalVendedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVendedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalVendedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalVendedorUpdate.setText("U");
		this.jButtonid_sucursalVendedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalVendedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalVendedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalVendedorUpdate"));



					
		this.jLabelid_empleadoVendedor = new JLabelMe();
		this.jLabelid_empleadoVendedor.setText(""+VendedorConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoVendedor.setToolTipText("Empleado");
		this.jLabelid_empleadoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelid_empleadoVendedor.setLayout(this.gridaBagLayoutVendedor);


		jComboBoxid_empleadoVendedor= new JComboBoxMe();
		jComboBoxid_empleadoVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoVendedor= new JButtonMe();
		this.jButtonid_empleadoVendedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoVendedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoVendedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoVendedor.setText("Buscar");
		this.jButtonid_empleadoVendedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoVendedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoVendedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoVendedor"));

		this.jButtonid_empleadoVendedorBusqueda= new JButtonMe();
		this.jButtonid_empleadoVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoVendedorBusqueda.setText("U");
		this.jButtonid_empleadoVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoVendedorBusqueda.setVisible(false);		}

		this.jButtonid_empleadoVendedorUpdate= new JButtonMe();
		this.jButtonid_empleadoVendedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoVendedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoVendedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoVendedorUpdate.setText("U");
		this.jButtonid_empleadoVendedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoVendedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoVendedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoVendedorUpdate"));



					
		this.jLabelid_empleado_soporteVendedor = new JLabelMe();
		this.jLabelid_empleado_soporteVendedor.setText(""+VendedorConstantesFunciones.LABEL_IDEMPLEADOSOPORTE+" :");
		this.jLabelid_empleado_soporteVendedor.setToolTipText("Empleado Soporte");
		this.jLabelid_empleado_soporteVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empleado_soporteVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empleado_soporteVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_soporteVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleado_soporteVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleado_soporteVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_IDEMPLEADOSOPORTE);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelid_empleado_soporteVendedor.setLayout(this.gridaBagLayoutVendedor);


		jComboBoxid_empleado_soporteVendedor= new JComboBoxMe();
		jComboBoxid_empleado_soporteVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_soporteVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_soporteVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_soporteVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleado_soporteVendedor= new JButtonMe();
		this.jButtonid_empleado_soporteVendedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_soporteVendedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_soporteVendedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_soporteVendedor.setText("Buscar");
		this.jButtonid_empleado_soporteVendedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleado_soporteVendedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_soporteVendedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleado_soporteVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_soporteVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_soporteVendedor"));

		this.jButtonid_empleado_soporteVendedorBusqueda= new JButtonMe();
		this.jButtonid_empleado_soporteVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_soporteVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_soporteVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_soporteVendedorBusqueda.setText("U");
		this.jButtonid_empleado_soporteVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleado_soporteVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_soporteVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleado_soporteVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_soporteVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_soporteVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleado_soporteVendedorBusqueda.setVisible(false);		}

		this.jButtonid_empleado_soporteVendedorUpdate= new JButtonMe();
		this.jButtonid_empleado_soporteVendedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_soporteVendedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_soporteVendedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_soporteVendedorUpdate.setText("U");
		this.jButtonid_empleado_soporteVendedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleado_soporteVendedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_soporteVendedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleado_soporteVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_soporteVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_soporteVendedorUpdate"));



					
		this.jLabelid_vendedorVendedor = new JLabelMe();
		this.jLabelid_vendedorVendedor.setText(""+VendedorConstantesFunciones.LABEL_IDVENDEDOR+" :");
		this.jLabelid_vendedorVendedor.setToolTipText("Vendedor Padre");
		this.jLabelid_vendedorVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelid_vendedorVendedor.setLayout(this.gridaBagLayoutVendedor);


		jComboBoxid_vendedorVendedor= new JComboBoxMe();
		jComboBoxid_vendedorVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorVendedor= new JButtonMe();
		this.jButtonid_vendedorVendedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorVendedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorVendedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorVendedor.setText("Buscar");
		this.jButtonid_vendedorVendedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorVendedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorVendedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorVendedor"));

		this.jButtonid_vendedorVendedorBusqueda= new JButtonMe();
		this.jButtonid_vendedorVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorVendedorBusqueda.setText("U");
		this.jButtonid_vendedorVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorVendedorBusqueda.setVisible(false);		}

		this.jButtonid_vendedorVendedorUpdate= new JButtonMe();
		this.jButtonid_vendedorVendedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorVendedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorVendedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorVendedorUpdate.setText("U");
		this.jButtonid_vendedorVendedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorVendedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorVendedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorVendedorUpdate"));


		jButtonid_vendedorVendedorArbol= new JButtonMe();
		jButtonid_vendedorVendedorArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorVendedorArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorVendedorArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorVendedorArbol.setText("Arbol");
		jButtonid_vendedorVendedorArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorVendedorArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorVendedorArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorVendedorArbol"));



					
		this.jLabelid_paisVendedor = new JLabelMe();
		this.jLabelid_paisVendedor.setText(""+VendedorConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisVendedor.setToolTipText("Pais");
		this.jLabelid_paisVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelid_paisVendedor.setLayout(this.gridaBagLayoutVendedor);


		jComboBoxid_paisVendedor= new JComboBoxMe();
		jComboBoxid_paisVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisVendedor= new JButtonMe();
		this.jButtonid_paisVendedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisVendedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisVendedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisVendedor.setText("Buscar");
		this.jButtonid_paisVendedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisVendedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisVendedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisVendedor"));

		this.jButtonid_paisVendedorBusqueda= new JButtonMe();
		this.jButtonid_paisVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisVendedorBusqueda.setText("U");
		this.jButtonid_paisVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisVendedorBusqueda.setVisible(false);		}

		this.jButtonid_paisVendedorUpdate= new JButtonMe();
		this.jButtonid_paisVendedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisVendedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisVendedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisVendedorUpdate.setText("U");
		this.jButtonid_paisVendedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisVendedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisVendedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisVendedorUpdate"));



					
		this.jLabelid_ciudadVendedor = new JLabelMe();
		this.jLabelid_ciudadVendedor.setText(""+VendedorConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadVendedor.setToolTipText("Ciudad");
		this.jLabelid_ciudadVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelid_ciudadVendedor.setLayout(this.gridaBagLayoutVendedor);


		jComboBoxid_ciudadVendedor= new JComboBoxMe();
		jComboBoxid_ciudadVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadVendedor= new JButtonMe();
		this.jButtonid_ciudadVendedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadVendedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadVendedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadVendedor.setText("Buscar");
		this.jButtonid_ciudadVendedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadVendedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadVendedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadVendedor"));

		this.jButtonid_ciudadVendedorBusqueda= new JButtonMe();
		this.jButtonid_ciudadVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadVendedorBusqueda.setText("U");
		this.jButtonid_ciudadVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadVendedorBusqueda.setVisible(false);		}

		this.jButtonid_ciudadVendedorUpdate= new JButtonMe();
		this.jButtonid_ciudadVendedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadVendedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadVendedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadVendedorUpdate.setText("U");
		this.jButtonid_ciudadVendedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadVendedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadVendedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadVendedorUpdate"));



					
		this.jLabelid_zonaVendedor = new JLabelMe();
		this.jLabelid_zonaVendedor.setText(""+VendedorConstantesFunciones.LABEL_IDZONA+" : *");
		this.jLabelid_zonaVendedor.setToolTipText("Zona");
		this.jLabelid_zonaVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_zonaVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_zonaVendedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_zonaVendedor.setToolTipText(VendedorConstantesFunciones.LABEL_IDZONA);
		this.gridaBagLayoutVendedor = new GridBagLayout();
		this.jPanelid_zonaVendedor.setLayout(this.gridaBagLayoutVendedor);


		jComboBoxid_zonaVendedor= new JComboBoxMe();
		jComboBoxid_zonaVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaVendedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_zonaVendedor= new JButtonMe();
		this.jButtonid_zonaVendedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaVendedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaVendedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaVendedor.setText("Buscar");
		this.jButtonid_zonaVendedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_zonaVendedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaVendedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_zonaVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaVendedor"));

		this.jButtonid_zonaVendedorBusqueda= new JButtonMe();
		this.jButtonid_zonaVendedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaVendedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaVendedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaVendedorBusqueda.setText("U");
		this.jButtonid_zonaVendedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_zonaVendedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaVendedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_zonaVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaVendedorBusqueda"));

		if(this.vendedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_zonaVendedorBusqueda.setVisible(false);		}

		this.jButtonid_zonaVendedorUpdate= new JButtonMe();
		this.jButtonid_zonaVendedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaVendedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaVendedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaVendedorUpdate.setText("U");
		this.jButtonid_zonaVendedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_zonaVendedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaVendedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_zonaVendedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaVendedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaVendedorUpdate"));



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
		//this.jInternalFrameDetalleVendedor = new VendedorBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Vendedor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVendedor= new GridBagLayout();
		

		
		String sToolTipVendedor="";
		sToolTipVendedor=VendedorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVendedor+="(Comisiones.Vendedor)";
		}
		
		if(!this.vendedorSessionBean.getEsGuardarRelacionado()) {
			sToolTipVendedor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVendedor = new JButtonMe();
		this.jButtonModificarVendedor = new JButtonMe();
        this.jButtonActualizarVendedor = new JButtonMe();
        this.jButtonEliminarVendedor = new JButtonMe();
        this.jButtonCancelarVendedor = new JButtonMe();
        this.jButtonGuardarCambiosVendedor = new JButtonMe();
		this.jButtonGuardarCambiosTablaVendedor = new JButtonMe();
		this.jButtonCerrarVendedor = new JButtonMe();
		
		this.jScrollPanelDatosVendedor = new JScrollPane();   
        this.jScrollPanelDatosEdicionVendedor = new JScrollPane();
		this.jScrollPanelDatosGeneralVendedor = new JScrollPane();
				
		
		
		this.jPanelCamposVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposVendedor=new JTabbedPane();
		
		
		this.jTabbedPaneCamposVendedor.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposVendedor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioventasVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Vendedor";
		
		if(!this.vendedorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedores" + this.sPath));
		} else {
			this.jScrollPanelDatosVendedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVendedor.setName("jPanelCamposVendedor"); 

		this.jPanelCamposOcultosVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVendedor.setName("jPanelCamposOcultosVendedor"); 

        this.jPanelAccionesVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVendedor.setToolTipText("Acciones");
        this.jPanelAccionesVendedor.setName("Acciones"); 

		this.jPanelAccionesFormularioVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVendedor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVendedor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVendedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVendedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVendedor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVendedor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVendedor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVendedor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralVendedor.setName("jPanelCamposFingeneralVendedor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralVendedor, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioventasVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Ventas"));
		this.jPanelCamposInicioventasVendedor.setName("jPanelCamposFinventasVendedor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioventasVendedor, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVendedor.setText("Nuevo");
		this.jButtonModificarVendedor.setText("Editar");
        this.jButtonActualizarVendedor.setText("Actualizar");
        this.jButtonEliminarVendedor.setText("Eliminar");
        this.jButtonCancelarVendedor.setText("Cancelar");
        this.jButtonGuardarCambiosVendedor.setText("Guardar");
		this.jButtonGuardarCambiosTablaVendedor.setText("Guardar");
		this.jButtonCerrarVendedor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVendedor,"nuevo_button","Nuevo",this.vendedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVendedor,"modificar_button","Editar",this.vendedorSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVendedor,"actualizar_button","Actualizar",this.vendedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVendedor,"eliminar_button","Eliminar",this.vendedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVendedor,"cancelar_button","Cancelar",this.vendedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVendedor,"guardarcambios_button","Guardar",this.vendedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVendedor,"guardarcambiostabla_button","Guardar",this.vendedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVendedor,"cerrar_button","Salir",this.vendedorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVendedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVendedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVendedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVendedor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVendedor.setToolTipText("Nuevo"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVendedor.setToolTipText("Editar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVendedor.setToolTipText("Actualizar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVendedor.setToolTipText("Eliminar)"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVendedor.setToolTipText("Cancelar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVendedor.setToolTipText("Guardar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVendedor.setToolTipText("Guardar"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVendedor.setToolTipText("Salir"+" "+VendedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVendedor";
		inputMap = this.jButtonNuevoVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVendedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVendedor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVendedor";
		inputMap = this.jButtonActualizarVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVendedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVendedor"));
		
		//ELIMINAR
		sMapKey = "EliminarVendedor";
		inputMap = this.jButtonEliminarVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVendedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVendedor"));
		
		//CANCELAR	
		sMapKey = "CancelarVendedor";
		inputMap = this.jButtonCancelarVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVendedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVendedor"));
		
		//CERRAR		
		sMapKey = "CerrarVendedor";
		inputMap = this.jButtonCerrarVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVendedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVendedor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVendedor";
		inputMap = this.jButtonGuardarCambiosTablaVendedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVendedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVendedor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVendedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVendedor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVendedor.setToolTipText("Nuevo Vendedor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVendedor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVendedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVendedor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVendedor.setToolTipText("Sin Cerrar Ventana Vendedor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVendedor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVendedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVendedor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVendedor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVendedor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
		this.jButtonArbolVendedor = new JButtonMe();
		this.jButtonArbolVendedor.setText("Arbol");		
		this.jButtonArbolVendedor.setToolTipText("Buscar Por Arbol");
				
		
			
			
		this.jComboBoxTiposAccionesVendedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVendedor.setText("Accion");
		this.jComboBoxTiposAccionesVendedor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVendedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVendedor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVendedor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVendedor = new JLabelMe();
		
		this.jLabelAccionesVendedor.setText("Acciones");		
		this.jLabelAccionesVendedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVendedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVendedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVendedor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVendedor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVendedor=new JTabbedPane();
		this.jTabbedPaneRelacionesVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVendedor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		this.jButtonArbolVendedor.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolVendedor.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolVendedor.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposAccionesVendedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVendedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVendedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVendedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVendedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVendedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVendedor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVendedor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVendedor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVendedor = new GridBagLayout();
		
		this.jPanelCamposVendedor.setLayout(gridaBagLayoutCamposVendedor);
		this.jPanelCamposOcultosVendedor.setLayout(gridaBagLayoutCamposOcultosVendedor);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralVendedor= new GridBagLayout();
		this.jPanelCamposIniciogeneralVendedor.setLayout(gridaBagLayoutCamposIniciogeneralVendedor);

		GridBagLayout gridaBagLayoutCamposInicioventasVendedor= new GridBagLayout();
		this.jPanelCamposInicioventasVendedor.setLayout(gridaBagLayoutCamposInicioventasVendedor);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVendedor.add(jLabelIdVendedor, this.gridBagConstraintsVendedor);



	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVendedor.add(jLabelidVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVendedor.add(jLabelid_empresaVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVendedor.add(jButtonid_empresaVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 3;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVendedor.add(jButtonid_empresaVendedorUpdate, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVendedor.add(jComboBoxid_empresaVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalVendedor.add(jLabelid_sucursalVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVendedor.add(jButtonid_sucursalVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 3;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalVendedor.add(jButtonid_sucursalVendedorUpdate, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalVendedor.add(jComboBoxid_sucursalVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoVendedor.add(jLabelcodigoVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoVendedor.add(jButtoncodigoVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoVendedor.add(jTextFieldcodigoVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreVendedor.add(jLabelnombreVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreVendedor.add(jButtonnombreVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreVendedor.add(jscrollPanenombreVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucVendedor.add(jLabelrucVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucVendedor.add(jButtonrucVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucVendedor.add(jTextFieldrucVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelemailVendedor.add(jLabelemailVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelemailVendedor.add(jButtonemailVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelemailVendedor.add(jscrollPaneemailVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoVendedor.add(jLabelid_empleadoVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 2;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoVendedor.add(jButtonid_empleadoVendedor, this.gridBagConstraintsVendedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 3;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoVendedor.add(jButtonid_empleadoVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 4;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoVendedor.add(jButtonid_empleadoVendedorUpdate, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoVendedor.add(jComboBoxid_empleadoVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoVendedor.add(jLabeltelefonoVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoVendedor.add(jButtontelefonoVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoVendedor.add(jscrollPanetelefonoVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleado_soporteVendedor.add(jLabelid_empleado_soporteVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 2;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleado_soporteVendedor.add(jButtonid_empleado_soporteVendedor, this.gridBagConstraintsVendedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 3;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_soporteVendedor.add(jButtonid_empleado_soporteVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 4;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_soporteVendedor.add(jButtonid_empleado_soporteVendedorUpdate, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleado_soporteVendedor.add(jComboBoxid_empleado_soporteVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorVendedor.add(jLabelid_vendedorVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorVendedor.add(jButtonid_vendedorVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 3;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorVendedor.add(jButtonid_vendedorVendedorUpdate, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorVendedor.add(jComboBoxid_vendedorVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisVendedor.add(jLabelid_paisVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisVendedor.add(jButtonid_paisVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 3;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisVendedor.add(jButtonid_paisVendedorUpdate, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisVendedor.add(jComboBoxid_paisVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadVendedor.add(jLabelid_ciudadVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadVendedor.add(jButtonid_ciudadVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 3;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadVendedor.add(jButtonid_ciudadVendedorUpdate, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadVendedor.add(jComboBoxid_ciudadVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_zonaVendedor.add(jLabelid_zonaVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaVendedor.add(jButtonid_zonaVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 3;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaVendedor.add(jButtonid_zonaVendedorUpdate, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_zonaVendedor.add(jComboBoxid_zonaVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrepresentanteVendedor.add(jLabelrepresentanteVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelrepresentanteVendedor.add(jButtonrepresentanteVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrepresentanteVendedor.add(jscrollPanerepresentanteVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_supervisorVendedor.add(jLabeles_supervisorVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_supervisorVendedor.add(jButtones_supervisorVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_supervisorVendedor.add(jCheckBoxes_supervisorVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_creacionVendedor.add(jLabelfecha_creacionVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_creacionVendedor.add(jButtonfecha_creacionVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_creacionVendedor.add(jDateChooserfecha_creacionVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccion_domicilioVendedor.add(jLabeldireccion_domicilioVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_domicilioVendedor.add(jButtondireccion_domicilioVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccion_domicilioVendedor.add(jscrollPanedireccion_domicilioVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccion_referenciaVendedor.add(jLabeldireccion_referenciaVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_referenciaVendedor.add(jButtondireccion_referenciaVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccion_referenciaVendedor.add(jscrollPanedireccion_referenciaVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionVendedor.add(jLabeldescripcionVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionVendedor.add(jButtondescripcionVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionVendedor.add(jscrollPanedescripcionVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_comisionVendedor.add(jLabelporcentaje_comisionVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_comisionVendedor.add(jButtonporcentaje_comisionVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_comisionVendedor.add(jTextFieldporcentaje_comisionVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcomisionVendedor.add(jLabelcomisionVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcomisionVendedor.add(jButtoncomisionVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcomisionVendedor.add(jTextFieldcomisionVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_vendidoVendedor.add(jLabelmonto_vendidoVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_vendidoVendedor.add(jButtonmonto_vendidoVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_vendidoVendedor.add(jTextFieldmonto_vendidoVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturasVendedor.add(jLabelnumero_facturasVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturasVendedor.add(jButtonnumero_facturasVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturasVendedor.add(jTextFieldnumero_facturasVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_ventaVendedor.add(jLabelfecha_ultima_ventaVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_ventaVendedor.add(jButtonfecha_ultima_ventaVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_ventaVendedor.add(jDateChooserfecha_ultima_ventaVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_ultima_ventaVendedor.add(jLabelmonto_ultima_ventaVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_ultima_ventaVendedor.add(jButtonmonto_ultima_ventaVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_ultima_ventaVendedor.add(jTextFieldmonto_ultima_ventaVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_presupuestoVendedor.add(jLabelcon_presupuestoVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_presupuestoVendedor.add(jButtoncon_presupuestoVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_presupuestoVendedor.add(jCheckBoxcon_presupuestoVendedor, this.gridBagConstraintsVendedor);


	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 0;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_coberturaVendedor.add(jLabelcon_coberturaVendedor, this.gridBagConstraintsVendedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		//this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = 2;
		this.gridBagConstraintsVendedor.ipadx = 0;
		this.gridBagConstraintsVendedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_coberturaVendedor.add(jButtoncon_coberturaVendedorBusqueda, this.gridBagConstraintsVendedor);
	}

	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedor.gridy = 0;
	this.gridBagConstraintsVendedor.gridx = 1;
	this.gridBagConstraintsVendedor.ipadx = 0;
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_coberturaVendedor.add(jCheckBoxcon_coberturaVendedor, this.gridBagConstraintsVendedor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposOcultosVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposOcultosVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVendedor.add(this.jPanelid_empresaVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposOcultosVendedor % 2==0) {
		iXPanelCamposOcultosVendedor=0;
		iYPanelCamposOcultosVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposOcultosVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposOcultosVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVendedor.add(this.jPanelid_sucursalVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposOcultosVendedor % 2==0) {
		iXPanelCamposOcultosVendedor=0;
		iYPanelCamposOcultosVendedor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPanelidVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPanelcodigoVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPanelnombreVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPanelrucVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPanelemailVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPanelid_empleadoVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPaneltelefonoVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPanelid_empleado_soporteVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPanelid_vendedorVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPanelid_paisVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPanelid_ciudadVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPanelid_zonaVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPanelrepresentanteVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPaneles_supervisorVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPanelfecha_creacionVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPaneldireccion_domicilioVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPaneldireccion_referenciaVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposIniciogeneralVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposIniciogeneralVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralVendedor.add(this.jPaneldescripcionVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposIniciogeneralVendedor % 2==0) {
		iXPanelCamposIniciogeneralVendedor=0;
		iYPanelCamposIniciogeneralVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposInicioventasVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposInicioventasVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioventasVendedor.add(this.jPanelporcentaje_comisionVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposInicioventasVendedor % 2==0) {
		iXPanelCamposInicioventasVendedor=0;
		iYPanelCamposInicioventasVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposInicioventasVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposInicioventasVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioventasVendedor.add(this.jPanelcomisionVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposInicioventasVendedor % 2==0) {
		iXPanelCamposInicioventasVendedor=0;
		iYPanelCamposInicioventasVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposInicioventasVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposInicioventasVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioventasVendedor.add(this.jPanelmonto_vendidoVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposInicioventasVendedor % 2==0) {
		iXPanelCamposInicioventasVendedor=0;
		iYPanelCamposInicioventasVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposInicioventasVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposInicioventasVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioventasVendedor.add(this.jPanelnumero_facturasVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposInicioventasVendedor % 2==0) {
		iXPanelCamposInicioventasVendedor=0;
		iYPanelCamposInicioventasVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposInicioventasVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposInicioventasVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioventasVendedor.add(this.jPanelfecha_ultima_ventaVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposInicioventasVendedor % 2==0) {
		iXPanelCamposInicioventasVendedor=0;
		iYPanelCamposInicioventasVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposInicioventasVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposInicioventasVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioventasVendedor.add(this.jPanelmonto_ultima_ventaVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposInicioventasVendedor % 2==0) {
		iXPanelCamposInicioventasVendedor=0;
		iYPanelCamposInicioventasVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposInicioventasVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposInicioventasVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioventasVendedor.add(this.jPanelcon_presupuestoVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposInicioventasVendedor % 2==0) {
		iXPanelCamposInicioventasVendedor=0;
		iYPanelCamposInicioventasVendedor++;
	}
	this.gridBagConstraintsVendedor = new GridBagConstraints();
	this.gridBagConstraintsVendedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedor.gridy = iYPanelCamposInicioventasVendedor;
	this.gridBagConstraintsVendedor.gridx = iXPanelCamposInicioventasVendedor++;
	this.gridBagConstraintsVendedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioventasVendedor.add(this.jPanelcon_coberturaVendedor, this.gridBagConstraintsVendedor);



	if(iXPanelCamposInicioventasVendedor % 2==0) {
		iXPanelCamposInicioventasVendedor=0;
		iYPanelCamposInicioventasVendedor++;
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
			
		GridBagLayout gridaBagLayoutAccionesVendedor= new GridBagLayout();
		this.jPanelAccionesVendedor.setLayout(gridaBagLayoutAccionesVendedor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVendedor= new GridBagLayout();
		this.jPanelAccionesFormularioVendedor.setLayout(gridaBagLayoutAccionesFormularioVendedor);
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVendedor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVendedor.add(this.jComboBoxTiposAccionesFormularioVendedor, this.gridBagConstraintsVendedor);

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVendedor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVendedor.add(this.jCheckBoxPostAccionNuevoVendedor, this.gridBagConstraintsVendedor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.vendedorSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVendedor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVendedor.add(this.jCheckBoxPostAccionSinCerrarVendedor, this.gridBagConstraintsVendedor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.vendedorSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.vendedorSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVendedor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVendedor.add(this.jCheckBoxPostAccionSinMensajeVendedor, this.gridBagConstraintsVendedor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx = iPosXAccion++;
			
		this.jPanelAccionesVendedor.add(this.jButtonModificarVendedor, this.gridBagConstraintsVendedor);							

		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedor.gridy = 0;
		this.gridBagConstraintsVendedor.gridx =iPosXAccion++;
			
		this.jPanelAccionesVendedor.add(this.jButtonEliminarVendedor, this.gridBagConstraintsVendedor);
		
			
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy = 0;		
		this.gridBagConstraintsVendedor.gridx = iPosXAccion++;
		
		this.jPanelAccionesVendedor.add(this.jButtonActualizarVendedor, this.gridBagConstraintsVendedor);


		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy = 0;		
		this.gridBagConstraintsVendedor.gridx = iPosXAccion++;
		
		this.jPanelAccionesVendedor.add(this.jButtonGuardarCambiosVendedor, this.gridBagConstraintsVendedor);	
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy = 0;		
		this.gridBagConstraintsVendedor.gridx =iPosXAccion++;
		
		this.jPanelAccionesVendedor.add(this.jButtonCancelarVendedor, this.gridBagConstraintsVendedor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVendedor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVendedor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.vendedorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVendedor = new GridBagConstraints();						
			this.gridBagConstraintsVendedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVendedor.gridx = 0;		
			//this.gridBagConstraintsVendedor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVendedor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVendedor.gridx =0;
		this.gridBagConstraintsVendedor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVendedor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVendedor, this.gridBagConstraintsVendedor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeVendedor = new VendedorBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeVendedor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeVendedor.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeVendedor.setTitle("Vendedor ARBOL");
		this.jInternalFrameTreeVendedor.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Vendedor Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeVendedor.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeVendedor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeVendedor.setResizable(true);
	    this.jInternalFrameTreeVendedor.setClosable(true);
	    this.jInternalFrameTreeVendedor.setMaximizable(true);
			
			
		//if(VendedorJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVendedor = new VendedorBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Vendedor DATOS");
			
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
			
	        //this.setTitle("[FOR] - Vendedor DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Vendedor Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VendedorModel vendedorModel=new VendedorModel(this);
			
			//SI USARA CLASE INTERNA
			//VendedorModel.VendedorFocusTraversalPolicy vendedorFocusTraversalPolicy = vendedorModel.new VendedorFocusTraversalPolicy(this);
			
			//vendedorFocusTraversalPolicy.setvendedorJInternalFrame(this);
			
			this.setFocusTraversalPolicy(vendedorModel);
			
			
			this.jContentPaneDetalleVendedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVendedor = new GridBagLayout();	
			this.jContentPaneDetalleVendedor.setLayout(gridaBagLayoutDetalleVendedor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVendedor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVendedor = new GridBagConstraints();
				this.gridBagConstraintsVendedor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVendedor.gridx = 0;
					
				
				this.jContentPaneDetalleVendedor.add(jTtoolBarDetalleVendedor, gridBagConstraintsVendedor);								
				
}
			
			this.jScrollPanelDatosEdicionVendedor=   new JScrollPane(jContentPaneDetalleVendedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVendedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVendedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVendedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVendedor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVendedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVendedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVendedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposVendedor.add("General",this.jPanelCamposIniciogeneralVendedor);
		this.jTabbedPaneCamposVendedor.add("Ventas",this.jPanelCamposInicioventasVendedor);
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
						
			this.gridBagConstraintsVendedor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVendedor.gridx = 0;
	        
			this.jContentPaneDetalleVendedor.add(jTabbedPaneCamposVendedor, gridBagConstraintsVendedor);
			
			
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
						&& vendedorSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCajeroTurno(this.puedeCargarPorParteCajeroTurno,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionCate(this.puedeCargarPorParteComisionCate,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionGrupo(this.puedeCargarPorParteComisionGrupo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionLinea(this.puedeCargarPorParteComisionLinea,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionMarca(this.puedeCargarPorParteComisionMarca,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionVentaCobro(this.puedeCargarPorParteComisionVentaCobro,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(this.puedeCargarPorParteNotaCreditoSoli,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoVentas(this.puedeCargarPorPartePresupuestoVentas,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoVentasLineas(this.puedeCargarPorPartePresupuestoVentasLineas,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameVendedor(this.puedeCargarPorParteVendedor,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameVendedorZona(this.puedeCargarPorParteVendedorZona,false,-1);
					
					if(this.vendedorSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVendedor= new GridBagConstraints();
						this.gridBagConstraintsVendedor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVendedor.gridx = 0;
						this.jContentPaneDetalleVendedor.add(this.jTabbedPaneRelacionesVendedor, this.gridBagConstraintsVendedor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVendedor.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCajeroTurno(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionCate(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionGrupo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionLinea(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionMarca(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameComisionVentaCobro(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoVentas(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoVentasLineas(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameVendedor(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameVendedorZona(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVendedor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVendedor = new GridBagConstraints();
					this.gridBagConstraintsVendedor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVendedor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVendedor.gridx = 0;
					
				
					this.jContentPaneDetalleVendedor.add(jPanelCamposOcultosVendedor, gridBagConstraintsVendedor);
				
					this.jPanelCamposOcultosVendedor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.gridy = iGridyRelaciones++;//37;		
	        this.gridBagConstraintsVendedor.gridx = 0;
	        this.gridBagConstraintsVendedor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVendedor.add(this.jPanelAccionesFormularioVendedor, this.gridBagConstraintsVendedor);							
			
			
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
	        this.gridBagConstraintsVendedor.gridy = iGridyRelaciones;//37;		
	        this.gridBagConstraintsVendedor.gridx = 0;
	        
			
			this.jContentPaneDetalleVendedor.add(this.jPanelAccionesVendedor, this.gridBagConstraintsVendedor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVendedor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVendedor=   new JScrollPane(this.jPanelCamposVendedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVendedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVendedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVendedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVendedor.gridx = 0;
			this.gridBagConstraintsVendedor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVendedor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVendedor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVendedor, this.gridBagConstraintsVendedor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVendedor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVendedor, this.gridBagConstraintsVendedor);			
			
			this.gridBagConstraintsVendedor = new GridBagConstraints();
			this.gridBagConstraintsVendedor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVendedor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVendedor, this.gridBagConstraintsVendedor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVendedor, this.gridBagConstraintsVendedor);
			
			
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVendedor, this.gridBagConstraintsVendedor);
		
			
		this.gridBagConstraintsVendedor = new GridBagConstraints();
		this.gridBagConstraintsVendedor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVendedor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVendedor, this.gridBagConstraintsVendedor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVendedor;//jContentPane;
		
		return jScrollPanelDatosEdicionVendedor;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCajeroTurno(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
		this.cajeroturnoSessionBean.setConGuardarRelaciones(false);
		this.cajeroturnoSessionBean.setEsGuardarRelacionado(true);

		this.cajeroturnoBeanSwingJInternalFrame=null;//new CajeroTurnoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cajeroturnoBeanSwingJInternalFramePopup=new CajeroTurnoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cajeroturnoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {

				CajeroTurnoJInternalFrame.STIPO_TAMANIO_GENERAL=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;
				CajeroTurnoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cajeroturnoSessionBean.setEsGuardarRelacionado(true);

				this.cajeroturnoBeanSwingJInternalFrame=new CajeroTurnoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cajeroturnoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cajeroturnoBeanSwingJInternalFrame.setcajeroturnoSessionBean(this.cajeroturnoSessionBean);

				//this.gridBagConstraintsVendedor = new GridBagConstraints();
				//this.gridBagConstraintsVendedor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsVendedor.gridx = 0;
				//this.jContentPaneDetalleVendedor.add(this.cajeroturnoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsVendedor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesVendedor.add("Cajero Turnos",this.cajeroturnoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesVendedor.setComponentAt(iIndexTab,this.cajeroturnoBeanSwingJInternalFrame.getContentPane());
				}

				//CajeroTurnoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cajeroturnoSessionBean.setEsGuardarRelacionado(false);
				this.cajeroturnoBeanSwingJInternalFrame=null;//new CajeroTurnoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCajeroTurno) {
					this.jTabbedPaneRelacionesVendedor.add("Cajero Turnos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clienteSessionBean=new ClienteSessionBean();
		this.clienteSessionBean.setConGuardarRelaciones(false);
		this.clienteSessionBean.setEsGuardarRelacionado(true);

		this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clienteSessionBean.getEsGuardarRelacionado()) {

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsVendedor = new GridBagConstraints();
				//this.gridBagConstraintsVendedor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsVendedor.gridx = 0;
				//this.jContentPaneDetalleVendedor.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsVendedor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesVendedor.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesVendedor.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesVendedor.add("Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameComisionCate(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.comisioncateSessionBean=new ComisionCateSessionBean();
		this.comisioncateSessionBean.setConGuardarRelaciones(false);
		this.comisioncateSessionBean.setEsGuardarRelacionado(true);

		this.comisioncateBeanSwingJInternalFrame=null;//new ComisionCateBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.comisioncateBeanSwingJInternalFramePopup=new ComisionCateBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.comisioncateBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.comisioncateSessionBean.getEsGuardarRelacionado()) {

				ComisionCateJInternalFrame.STIPO_TAMANIO_GENERAL=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;
				ComisionCateJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.comisioncateSessionBean.setEsGuardarRelacionado(true);

				this.comisioncateBeanSwingJInternalFrame=new ComisionCateBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.comisioncateBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.comisioncateBeanSwingJInternalFrame.setcomisioncateSessionBean(this.comisioncateSessionBean);

				//this.gridBagConstraintsVendedor = new GridBagConstraints();
				//this.gridBagConstraintsVendedor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsVendedor.gridx = 0;
				//this.jContentPaneDetalleVendedor.add(this.comisioncateBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsVendedor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesVendedor.add("Comision Cates",this.comisioncateBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesVendedor.setComponentAt(iIndexTab,this.comisioncateBeanSwingJInternalFrame.getContentPane());
				}

				//ComisionCateJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.comisioncateSessionBean.setEsGuardarRelacionado(false);
				this.comisioncateBeanSwingJInternalFrame=null;//new ComisionCateBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.comisioncateSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteComisionCate) {
					this.jTabbedPaneRelacionesVendedor.add("Comision Cates",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameComisionGrupo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
		this.comisiongrupoSessionBean.setConGuardarRelaciones(false);
		this.comisiongrupoSessionBean.setEsGuardarRelacionado(true);

		this.comisiongrupoBeanSwingJInternalFrame=null;//new ComisionGrupoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.comisiongrupoBeanSwingJInternalFramePopup=new ComisionGrupoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.comisiongrupoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {

				ComisionGrupoJInternalFrame.STIPO_TAMANIO_GENERAL=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;
				ComisionGrupoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.comisiongrupoSessionBean.setEsGuardarRelacionado(true);

				this.comisiongrupoBeanSwingJInternalFrame=new ComisionGrupoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.comisiongrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.comisiongrupoBeanSwingJInternalFrame.setcomisiongrupoSessionBean(this.comisiongrupoSessionBean);

				//this.gridBagConstraintsVendedor = new GridBagConstraints();
				//this.gridBagConstraintsVendedor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsVendedor.gridx = 0;
				//this.jContentPaneDetalleVendedor.add(this.comisiongrupoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsVendedor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesVendedor.add("Comision Grupos",this.comisiongrupoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesVendedor.setComponentAt(iIndexTab,this.comisiongrupoBeanSwingJInternalFrame.getContentPane());
				}

				//ComisionGrupoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.comisiongrupoSessionBean.setEsGuardarRelacionado(false);
				this.comisiongrupoBeanSwingJInternalFrame=null;//new ComisionGrupoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteComisionGrupo) {
					this.jTabbedPaneRelacionesVendedor.add("Comision Grupos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameComisionLinea(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.comisionlineaSessionBean=new ComisionLineaSessionBean();
		this.comisionlineaSessionBean.setConGuardarRelaciones(false);
		this.comisionlineaSessionBean.setEsGuardarRelacionado(true);

		this.comisionlineaBeanSwingJInternalFrame=null;//new ComisionLineaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.comisionlineaBeanSwingJInternalFramePopup=new ComisionLineaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.comisionlineaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.comisionlineaSessionBean.getEsGuardarRelacionado()) {

				ComisionLineaJInternalFrame.STIPO_TAMANIO_GENERAL=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;
				ComisionLineaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.comisionlineaSessionBean.setEsGuardarRelacionado(true);

				this.comisionlineaBeanSwingJInternalFrame=new ComisionLineaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.comisionlineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.comisionlineaBeanSwingJInternalFrame.setcomisionlineaSessionBean(this.comisionlineaSessionBean);

				//this.gridBagConstraintsVendedor = new GridBagConstraints();
				//this.gridBagConstraintsVendedor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsVendedor.gridx = 0;
				//this.jContentPaneDetalleVendedor.add(this.comisionlineaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsVendedor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesVendedor.add("Comision Lineas",this.comisionlineaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesVendedor.setComponentAt(iIndexTab,this.comisionlineaBeanSwingJInternalFrame.getContentPane());
				}

				//ComisionLineaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.comisionlineaSessionBean.setEsGuardarRelacionado(false);
				this.comisionlineaBeanSwingJInternalFrame=null;//new ComisionLineaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteComisionLinea) {
					this.jTabbedPaneRelacionesVendedor.add("Comision Lineas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameComisionMarca(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
		this.comisionmarcaSessionBean.setConGuardarRelaciones(false);
		this.comisionmarcaSessionBean.setEsGuardarRelacionado(true);

		this.comisionmarcaBeanSwingJInternalFrame=null;//new ComisionMarcaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.comisionmarcaBeanSwingJInternalFramePopup=new ComisionMarcaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.comisionmarcaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {

				ComisionMarcaJInternalFrame.STIPO_TAMANIO_GENERAL=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;
				ComisionMarcaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.comisionmarcaSessionBean.setEsGuardarRelacionado(true);

				this.comisionmarcaBeanSwingJInternalFrame=new ComisionMarcaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.comisionmarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.comisionmarcaBeanSwingJInternalFrame.setcomisionmarcaSessionBean(this.comisionmarcaSessionBean);

				//this.gridBagConstraintsVendedor = new GridBagConstraints();
				//this.gridBagConstraintsVendedor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsVendedor.gridx = 0;
				//this.jContentPaneDetalleVendedor.add(this.comisionmarcaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsVendedor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesVendedor.add("Comision Marcas",this.comisionmarcaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesVendedor.setComponentAt(iIndexTab,this.comisionmarcaBeanSwingJInternalFrame.getContentPane());
				}

				//ComisionMarcaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.comisionmarcaSessionBean.setEsGuardarRelacionado(false);
				this.comisionmarcaBeanSwingJInternalFrame=null;//new ComisionMarcaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteComisionMarca) {
					this.jTabbedPaneRelacionesVendedor.add("Comision Marcas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameComisionVentaCobro(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.comisionventacobroSessionBean=new ComisionVentaCobroSessionBean();
		this.comisionventacobroSessionBean.setConGuardarRelaciones(false);
		this.comisionventacobroSessionBean.setEsGuardarRelacionado(true);

		this.comisionventacobroBeanSwingJInternalFrame=null;//new ComisionVentaCobroBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.comisionventacobroBeanSwingJInternalFramePopup=new ComisionVentaCobroBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.comisionventacobroBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {

				ComisionVentaCobroJInternalFrame.STIPO_TAMANIO_GENERAL=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;
				ComisionVentaCobroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.comisionventacobroSessionBean.setEsGuardarRelacionado(true);

				this.comisionventacobroBeanSwingJInternalFrame=new ComisionVentaCobroBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.comisionventacobroBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.comisionventacobroBeanSwingJInternalFrame.setcomisionventacobroSessionBean(this.comisionventacobroSessionBean);

				//this.gridBagConstraintsVendedor = new GridBagConstraints();
				//this.gridBagConstraintsVendedor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsVendedor.gridx = 0;
				//this.jContentPaneDetalleVendedor.add(this.comisionventacobroBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsVendedor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesVendedor.add("Comision Venta Cobroes",this.comisionventacobroBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesVendedor.setComponentAt(iIndexTab,this.comisionventacobroBeanSwingJInternalFrame.getContentPane());
				}

				//ComisionVentaCobroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.comisionventacobroSessionBean.setEsGuardarRelacionado(false);
				this.comisionventacobroBeanSwingJInternalFrame=null;//new ComisionVentaCobroBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteComisionVentaCobro) {
					this.jTabbedPaneRelacionesVendedor.add("Comision Venta Cobroes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.notacreditosoliSessionBean=new NotaCreditoSoliSessionBean();
		this.notacreditosoliSessionBean.setConGuardarRelaciones(true);
		this.notacreditosoliSessionBean.setEsGuardarRelacionado(true);

		this.notacreditosoliBeanSwingJInternalFrame=null;//new NotaCreditoSoliBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.notacreditosoliBeanSwingJInternalFramePopup=new NotaCreditoSoliBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.notacreditosoliBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {

				NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;
				NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.notacreditosoliSessionBean.setEsGuardarRelacionado(true);

				this.notacreditosoliBeanSwingJInternalFrame=new NotaCreditoSoliBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.notacreditosoliBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.notacreditosoliBeanSwingJInternalFrame.setnotacreditosoliSessionBean(this.notacreditosoliSessionBean);

				//this.gridBagConstraintsVendedor = new GridBagConstraints();
				//this.gridBagConstraintsVendedor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsVendedor.gridx = 0;
				//this.jContentPaneDetalleVendedor.add(this.notacreditosoliBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsVendedor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesVendedor.add("Solicitud Nota Creditos",this.notacreditosoliBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesVendedor.setComponentAt(iIndexTab,this.notacreditosoliBeanSwingJInternalFrame.getContentPane());
				}

				//NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.notacreditosoliSessionBean.setEsGuardarRelacionado(false);
				this.notacreditosoliBeanSwingJInternalFrame=null;//new NotaCreditoSoliBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNotaCreditoSoli) {
					this.jTabbedPaneRelacionesVendedor.add("Solicitud Nota Creditos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePresupuestoVentas(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
		this.presupuestoventasSessionBean.setConGuardarRelaciones(false);
		this.presupuestoventasSessionBean.setEsGuardarRelacionado(true);

		this.presupuestoventasBeanSwingJInternalFrame=null;//new PresupuestoVentasBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.presupuestoventasBeanSwingJInternalFramePopup=new PresupuestoVentasBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.presupuestoventasBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {

				PresupuestoVentasJInternalFrame.STIPO_TAMANIO_GENERAL=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;
				PresupuestoVentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.presupuestoventasSessionBean.setEsGuardarRelacionado(true);

				this.presupuestoventasBeanSwingJInternalFrame=new PresupuestoVentasBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.presupuestoventasBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.presupuestoventasBeanSwingJInternalFrame.setpresupuestoventasSessionBean(this.presupuestoventasSessionBean);

				//this.gridBagConstraintsVendedor = new GridBagConstraints();
				//this.gridBagConstraintsVendedor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsVendedor.gridx = 0;
				//this.jContentPaneDetalleVendedor.add(this.presupuestoventasBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsVendedor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesVendedor.add("Presupuesto Ventases",this.presupuestoventasBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesVendedor.setComponentAt(iIndexTab,this.presupuestoventasBeanSwingJInternalFrame.getContentPane());
				}

				//PresupuestoVentasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.presupuestoventasSessionBean.setEsGuardarRelacionado(false);
				this.presupuestoventasBeanSwingJInternalFrame=null;//new PresupuestoVentasBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePresupuestoVentas) {
					this.jTabbedPaneRelacionesVendedor.add("Presupuesto Ventases",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePresupuestoVentasLineas(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.presupuestoventaslineasSessionBean=new PresupuestoVentasLineasSessionBean();
		this.presupuestoventaslineasSessionBean.setConGuardarRelaciones(false);
		this.presupuestoventaslineasSessionBean.setEsGuardarRelacionado(true);

		this.presupuestoventaslineasBeanSwingJInternalFrame=null;//new PresupuestoVentasLineasBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.presupuestoventaslineasBeanSwingJInternalFramePopup=new PresupuestoVentasLineasBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.presupuestoventaslineasBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()) {

				PresupuestoVentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;
				PresupuestoVentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.presupuestoventaslineasSessionBean.setEsGuardarRelacionado(true);

				this.presupuestoventaslineasBeanSwingJInternalFrame=new PresupuestoVentasLineasBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.presupuestoventaslineasBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.presupuestoventaslineasBeanSwingJInternalFrame.setpresupuestoventaslineasSessionBean(this.presupuestoventaslineasSessionBean);

				//this.gridBagConstraintsVendedor = new GridBagConstraints();
				//this.gridBagConstraintsVendedor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsVendedor.gridx = 0;
				//this.jContentPaneDetalleVendedor.add(this.presupuestoventaslineasBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsVendedor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesVendedor.add("Presupuesto Ventas_lineases",this.presupuestoventaslineasBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesVendedor.setComponentAt(iIndexTab,this.presupuestoventaslineasBeanSwingJInternalFrame.getContentPane());
				}

				//PresupuestoVentasLineasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.presupuestoventaslineasSessionBean.setEsGuardarRelacionado(false);
				this.presupuestoventaslineasBeanSwingJInternalFrame=null;//new PresupuestoVentasLineasBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePresupuestoVentasLineas) {
					this.jTabbedPaneRelacionesVendedor.add("Presupuesto Ventas_lineases",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameVendedor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.vendedorSessionBean=new VendedorSessionBean();
		this.vendedorSessionBean.setConGuardarRelaciones(false);
		//this.vendedorSessionBean.setEsGuardarRelacionado(true);

		this.vendedorBeanSwingJInternalFrame=null;//new VendedorBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.vendedorBeanSwingJInternalFramePopup=new VendedorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.vendedorBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.vendedorSessionBean.getEsGuardarRelacionado()) {
				VendedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.vendedorSessionBean.setEsGuardarRelacionado(true);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.vendedorBeanSwingJInternalFrame.setvendedorSessionBean(this.vendedorSessionBean);

				//this.gridBagConstraintsVendedor = new GridBagConstraints();
				//this.gridBagConstraintsVendedor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsVendedor.gridx = 0;
				//this.jContentPaneDetalleVendedor.add(this.vendedorBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsVendedor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesVendedor.add("Vendedores",this.vendedorBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesVendedor.setComponentAt(iIndexTab,this.vendedorBeanSwingJInternalFrame.getContentPane());
				}

				//VendedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.vendedorSessionBean.setEsGuardarRelacionado(false);
				this.vendedorBeanSwingJInternalFrame=null;//new VendedorBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.vendedorSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteVendedor) {
					this.jTabbedPaneRelacionesVendedor.add("Vendedores",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameVendedorZona(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.vendedorzonaSessionBean=new VendedorZonaSessionBean();
		this.vendedorzonaSessionBean.setConGuardarRelaciones(false);
		this.vendedorzonaSessionBean.setEsGuardarRelacionado(true);

		this.vendedorzonaBeanSwingJInternalFrame=null;//new VendedorZonaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.vendedorzonaBeanSwingJInternalFramePopup=new VendedorZonaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.vendedorzonaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {

				VendedorZonaJInternalFrame.STIPO_TAMANIO_GENERAL=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;
				VendedorZonaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=VendedorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.vendedorzonaSessionBean.setEsGuardarRelacionado(true);

				this.vendedorzonaBeanSwingJInternalFrame=new VendedorZonaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.vendedorzonaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.vendedorzonaBeanSwingJInternalFrame.setvendedorzonaSessionBean(this.vendedorzonaSessionBean);

				//this.gridBagConstraintsVendedor = new GridBagConstraints();
				//this.gridBagConstraintsVendedor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsVendedor.gridx = 0;
				//this.jContentPaneDetalleVendedor.add(this.vendedorzonaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsVendedor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesVendedor.add("Vendedor Zonas",this.vendedorzonaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesVendedor.setComponentAt(iIndexTab,this.vendedorzonaBeanSwingJInternalFrame.getContentPane());
				}

				//VendedorZonaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.vendedorzonaSessionBean.setEsGuardarRelacionado(false);
				this.vendedorzonaBeanSwingJInternalFrame=null;//new VendedorZonaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteVendedorZona) {
					this.jTabbedPaneRelacionesVendedor.add("Vendedor Zonas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarNotaCreditoSoliBeanSwingJInternalFrame(List<Vendedor> vendedors,Vendedor vendedor,NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//notacreditosoliBeanSwingJInternalFrame=new NotaCreditoSoliBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					notacreditosoliBeanSwingJInternalFrame.getNotaCreditoSoliLogic().setConnexion(this.vendedorLogic.getConnexion());

					notacreditosoliBeanSwingJInternalFrame.setvendedorsForeignKey(vendedors);
					notacreditosoliBeanSwingJInternalFrame.setvendedorForeignKey(vendedor);
					notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setisBusquedaDesdeForeignKeySesionVendedor(true);
					notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setlidVendedorActual(vendedor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					notacreditosoliBeanSwingJInternalFrame.cargarCombosForeignKeyNotaCreditoSoli(notacreditosoliBeanSwingJInternalFrame.isCargarCombosDependencia);
					notacreditosoliBeanSwingJInternalFrame.setVisibilidadBusquedasParaVendedor(true);
					notacreditosoliBeanSwingJInternalFrame.setid_vendedorFK_IdVendedor(vendedor.getId());

					if(!this.conCargarFormDetalle) {
						notacreditosoliBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					notacreditosoliBeanSwingJInternalFrame.setSelectedItemCombosFrameVendedorForeignKey(vendedor,1,false,true,true);
					notacreditosoliBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					notacreditosoliBeanSwingJInternalFrame.procesarBusqueda("FK_IdVendedor");
					notacreditosoliBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdVendedor");
					notacreditosoliBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoSoli(true);
					notacreditosoliBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNotaCreditoSoli("n",notacreditosoliBeanSwingJInternalFrame.isGuardarCambiosEnLote, notacreditosoliBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					notacreditosoliBeanSwingJInternalFrame.setAutoscrolls(true);
					notacreditosoliBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						notacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoSoli("relacionado");
					} else {
						notacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoSoli("no_relacionado");
					}

					notacreditosoliBeanSwingJInternalFrame.getjButtonRecargarInformacionNotaCreditoSoli().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarComisionVentaCobroBeanSwingJInternalFrame(List<Vendedor> vendedors,Vendedor vendedor,ComisionVentaCobroBeanSwingJInternalFrame comisionventacobroBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//comisionventacobroBeanSwingJInternalFrame=new ComisionVentaCobroBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					comisionventacobroBeanSwingJInternalFrame.getComisionVentaCobroLogic().setConnexion(this.vendedorLogic.getConnexion());

					comisionventacobroBeanSwingJInternalFrame.setvendedorsForeignKey(vendedors);
					comisionventacobroBeanSwingJInternalFrame.setvendedorForeignKey(vendedor);
					comisionventacobroBeanSwingJInternalFrame.comisionventacobroSessionBean.setisBusquedaDesdeForeignKeySesionVendedor(true);
					comisionventacobroBeanSwingJInternalFrame.comisionventacobroSessionBean.setlidVendedorActual(vendedor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					comisionventacobroBeanSwingJInternalFrame.cargarCombosForeignKeyComisionVentaCobro(comisionventacobroBeanSwingJInternalFrame.isCargarCombosDependencia);
					comisionventacobroBeanSwingJInternalFrame.setVisibilidadBusquedasParaVendedor(true);
					comisionventacobroBeanSwingJInternalFrame.setid_vendedorFK_IdVendedor(vendedor.getId());

					if(!this.conCargarFormDetalle) {
						comisionventacobroBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					comisionventacobroBeanSwingJInternalFrame.setSelectedItemCombosFrameVendedorForeignKey(vendedor,1,false,true,true);
					comisionventacobroBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					comisionventacobroBeanSwingJInternalFrame.procesarBusqueda("FK_IdVendedor");
					comisionventacobroBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdVendedor");
					comisionventacobroBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionVentaCobro(true);
					comisionventacobroBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesComisionVentaCobro("n",comisionventacobroBeanSwingJInternalFrame.isGuardarCambiosEnLote, comisionventacobroBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					comisionventacobroBeanSwingJInternalFrame.setAutoscrolls(true);
					comisionventacobroBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						comisionventacobroBeanSwingJInternalFrame.actualizarEstadoPanelsComisionVentaCobro("relacionado");
					} else {
						comisionventacobroBeanSwingJInternalFrame.actualizarEstadoPanelsComisionVentaCobro("no_relacionado");
					}

					comisionventacobroBeanSwingJInternalFrame.getjButtonRecargarInformacionComisionVentaCobro().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarVendedorBeanSwingJInternalFrame(List<Vendedor> vendedors,Vendedor vendedor,VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.vendedorLogic.getConnexion());

					vendedorBeanSwingJInternalFrame.setvendedorsForeignKey(vendedors);
					vendedorBeanSwingJInternalFrame.setvendedorForeignKey(vendedor);
					vendedorBeanSwingJInternalFrame.vendedorSessionBean.setisBusquedaDesdeForeignKeySesionVendedor(true);
					vendedorBeanSwingJInternalFrame.vendedorSessionBean.setlidVendedorActual(vendedor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					vendedorBeanSwingJInternalFrame.cargarCombosForeignKeyVendedor(vendedorBeanSwingJInternalFrame.isCargarCombosDependencia);
					vendedorBeanSwingJInternalFrame.setVisibilidadBusquedasParaVendedor(true);
					vendedorBeanSwingJInternalFrame.setid_vendedorFK_IdVendedor(vendedor.getId());

					if(!this.conCargarFormDetalle) {
						vendedorBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					vendedorBeanSwingJInternalFrame.setSelectedItemCombosFrameVendedorForeignKey(vendedor,1,false,true,true);
					vendedorBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					vendedorBeanSwingJInternalFrame.procesarBusqueda("FK_IdVendedor");
					vendedorBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdVendedor");
					vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor(true);
					vendedorBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesVendedor("n",vendedorBeanSwingJInternalFrame.isGuardarCambiosEnLote, vendedorBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					vendedorBeanSwingJInternalFrame.setAutoscrolls(true);
					vendedorBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						vendedorBeanSwingJInternalFrame.actualizarEstadoPanelsVendedor("relacionado");
					} else {
						vendedorBeanSwingJInternalFrame.actualizarEstadoPanelsVendedor("no_relacionado");
					}

					vendedorBeanSwingJInternalFrame.getjButtonRecargarInformacionVendedor().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarClienteBeanSwingJInternalFrame(List<Vendedor> vendedors,Vendedor vendedor,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.vendedorLogic.getConnexion());

					clienteBeanSwingJInternalFrame.setvendedorsForeignKey(vendedors);
					clienteBeanSwingJInternalFrame.setvendedorForeignKey(vendedor);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionVendedor(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidVendedorActual(vendedor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaVendedor(true);
					clienteBeanSwingJInternalFrame.setid_vendedorFK_IdVendedor(vendedor.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameVendedorForeignKey(vendedor,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdVendedor");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdVendedor");
					clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(true);
					clienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCliente("n",clienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, clienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clienteBeanSwingJInternalFrame.setAutoscrolls(true);
					clienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("relacionado");
					} else {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");
					}

					clienteBeanSwingJInternalFrame.getjButtonRecargarInformacionCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarComisionGrupoBeanSwingJInternalFrame(List<Vendedor> vendedors,Vendedor vendedor,ComisionGrupoBeanSwingJInternalFrame comisiongrupoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//comisiongrupoBeanSwingJInternalFrame=new ComisionGrupoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					comisiongrupoBeanSwingJInternalFrame.getComisionGrupoLogic().setConnexion(this.vendedorLogic.getConnexion());

					comisiongrupoBeanSwingJInternalFrame.setvendedorsForeignKey(vendedors);
					comisiongrupoBeanSwingJInternalFrame.setvendedorForeignKey(vendedor);
					comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.setisBusquedaDesdeForeignKeySesionVendedor(true);
					comisiongrupoBeanSwingJInternalFrame.comisiongrupoSessionBean.setlidVendedorActual(vendedor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					comisiongrupoBeanSwingJInternalFrame.cargarCombosForeignKeyComisionGrupo(comisiongrupoBeanSwingJInternalFrame.isCargarCombosDependencia);
					comisiongrupoBeanSwingJInternalFrame.setVisibilidadBusquedasParaVendedor(true);
					comisiongrupoBeanSwingJInternalFrame.setid_vendedorFK_IdVendedor(vendedor.getId());

					if(!this.conCargarFormDetalle) {
						comisiongrupoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					comisiongrupoBeanSwingJInternalFrame.setSelectedItemCombosFrameVendedorForeignKey(vendedor,1,false,true,true);
					comisiongrupoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					comisiongrupoBeanSwingJInternalFrame.procesarBusqueda("FK_IdVendedor");
					comisiongrupoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdVendedor");
					comisiongrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionGrupo(true);
					comisiongrupoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesComisionGrupo("n",comisiongrupoBeanSwingJInternalFrame.isGuardarCambiosEnLote, comisiongrupoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					comisiongrupoBeanSwingJInternalFrame.setAutoscrolls(true);
					comisiongrupoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						comisiongrupoBeanSwingJInternalFrame.actualizarEstadoPanelsComisionGrupo("relacionado");
					} else {
						comisiongrupoBeanSwingJInternalFrame.actualizarEstadoPanelsComisionGrupo("no_relacionado");
					}

					comisiongrupoBeanSwingJInternalFrame.getjButtonRecargarInformacionComisionGrupo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarComisionLineaBeanSwingJInternalFrame(List<Vendedor> vendedors,Vendedor vendedor,ComisionLineaBeanSwingJInternalFrame comisionlineaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//comisionlineaBeanSwingJInternalFrame=new ComisionLineaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					comisionlineaBeanSwingJInternalFrame.getComisionLineaLogic().setConnexion(this.vendedorLogic.getConnexion());

					comisionlineaBeanSwingJInternalFrame.setvendedorsForeignKey(vendedors);
					comisionlineaBeanSwingJInternalFrame.setvendedorForeignKey(vendedor);
					comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.setisBusquedaDesdeForeignKeySesionVendedor(true);
					comisionlineaBeanSwingJInternalFrame.comisionlineaSessionBean.setlidVendedorActual(vendedor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					comisionlineaBeanSwingJInternalFrame.cargarCombosForeignKeyComisionLinea(comisionlineaBeanSwingJInternalFrame.isCargarCombosDependencia);
					comisionlineaBeanSwingJInternalFrame.setVisibilidadBusquedasParaVendedor(true);
					comisionlineaBeanSwingJInternalFrame.setid_vendedorFK_IdVendedor(vendedor.getId());

					if(!this.conCargarFormDetalle) {
						comisionlineaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					comisionlineaBeanSwingJInternalFrame.setSelectedItemCombosFrameVendedorForeignKey(vendedor,1,false,true,true);
					comisionlineaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					comisionlineaBeanSwingJInternalFrame.procesarBusqueda("FK_IdVendedor");
					comisionlineaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdVendedor");
					comisionlineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionLinea(true);
					comisionlineaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesComisionLinea("n",comisionlineaBeanSwingJInternalFrame.isGuardarCambiosEnLote, comisionlineaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					comisionlineaBeanSwingJInternalFrame.setAutoscrolls(true);
					comisionlineaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						comisionlineaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionLinea("relacionado");
					} else {
						comisionlineaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionLinea("no_relacionado");
					}

					comisionlineaBeanSwingJInternalFrame.getjButtonRecargarInformacionComisionLinea().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarVendedorZonaBeanSwingJInternalFrame(List<Vendedor> vendedors,Vendedor vendedor,VendedorZonaBeanSwingJInternalFrame vendedorzonaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//vendedorzonaBeanSwingJInternalFrame=new VendedorZonaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					vendedorzonaBeanSwingJInternalFrame.getVendedorZonaLogic().setConnexion(this.vendedorLogic.getConnexion());

					vendedorzonaBeanSwingJInternalFrame.setvendedorsForeignKey(vendedors);
					vendedorzonaBeanSwingJInternalFrame.setvendedorForeignKey(vendedor);
					vendedorzonaBeanSwingJInternalFrame.vendedorzonaSessionBean.setisBusquedaDesdeForeignKeySesionVendedor(true);
					vendedorzonaBeanSwingJInternalFrame.vendedorzonaSessionBean.setlidVendedorActual(vendedor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					vendedorzonaBeanSwingJInternalFrame.cargarCombosForeignKeyVendedorZona(vendedorzonaBeanSwingJInternalFrame.isCargarCombosDependencia);
					vendedorzonaBeanSwingJInternalFrame.setVisibilidadBusquedasParaVendedor(true);
					vendedorzonaBeanSwingJInternalFrame.setid_vendedorFK_IdVendedor(vendedor.getId());

					if(!this.conCargarFormDetalle) {
						vendedorzonaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					vendedorzonaBeanSwingJInternalFrame.setSelectedItemCombosFrameVendedorForeignKey(vendedor,1,false,true,true);
					vendedorzonaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					vendedorzonaBeanSwingJInternalFrame.procesarBusqueda("FK_IdVendedor");
					vendedorzonaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdVendedor");
					vendedorzonaBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedorZona(true);
					vendedorzonaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesVendedorZona("n",vendedorzonaBeanSwingJInternalFrame.isGuardarCambiosEnLote, vendedorzonaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					vendedorzonaBeanSwingJInternalFrame.setAutoscrolls(true);
					vendedorzonaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						vendedorzonaBeanSwingJInternalFrame.actualizarEstadoPanelsVendedorZona("relacionado");
					} else {
						vendedorzonaBeanSwingJInternalFrame.actualizarEstadoPanelsVendedorZona("no_relacionado");
					}

					vendedorzonaBeanSwingJInternalFrame.getjButtonRecargarInformacionVendedorZona().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarComisionCateBeanSwingJInternalFrame(List<Vendedor> vendedors,Vendedor vendedor,ComisionCateBeanSwingJInternalFrame comisioncateBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//comisioncateBeanSwingJInternalFrame=new ComisionCateBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					comisioncateBeanSwingJInternalFrame.getComisionCateLogic().setConnexion(this.vendedorLogic.getConnexion());

					comisioncateBeanSwingJInternalFrame.setvendedorsForeignKey(vendedors);
					comisioncateBeanSwingJInternalFrame.setvendedorForeignKey(vendedor);
					comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.setisBusquedaDesdeForeignKeySesionVendedor(true);
					comisioncateBeanSwingJInternalFrame.comisioncateSessionBean.setlidVendedorActual(vendedor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					comisioncateBeanSwingJInternalFrame.cargarCombosForeignKeyComisionCate(comisioncateBeanSwingJInternalFrame.isCargarCombosDependencia);
					comisioncateBeanSwingJInternalFrame.setVisibilidadBusquedasParaVendedor(true);
					comisioncateBeanSwingJInternalFrame.setid_vendedorFK_IdVendedor(vendedor.getId());

					if(!this.conCargarFormDetalle) {
						comisioncateBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					comisioncateBeanSwingJInternalFrame.setSelectedItemCombosFrameVendedorForeignKey(vendedor,1,false,true,true);
					comisioncateBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					comisioncateBeanSwingJInternalFrame.procesarBusqueda("FK_IdVendedor");
					comisioncateBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdVendedor");
					comisioncateBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionCate(true);
					comisioncateBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesComisionCate("n",comisioncateBeanSwingJInternalFrame.isGuardarCambiosEnLote, comisioncateBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					comisioncateBeanSwingJInternalFrame.setAutoscrolls(true);
					comisioncateBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						comisioncateBeanSwingJInternalFrame.actualizarEstadoPanelsComisionCate("relacionado");
					} else {
						comisioncateBeanSwingJInternalFrame.actualizarEstadoPanelsComisionCate("no_relacionado");
					}

					comisioncateBeanSwingJInternalFrame.getjButtonRecargarInformacionComisionCate().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCajeroTurnoBeanSwingJInternalFrame(List<Vendedor> vendedors,Vendedor vendedor,CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cajeroturnoBeanSwingJInternalFrame=new CajeroTurnoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cajeroturnoBeanSwingJInternalFrame.getCajeroTurnoLogic().setConnexion(this.vendedorLogic.getConnexion());

					cajeroturnoBeanSwingJInternalFrame.setvendedorsForeignKey(vendedors);
					cajeroturnoBeanSwingJInternalFrame.setvendedorForeignKey(vendedor);
					cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setisBusquedaDesdeForeignKeySesionVendedor(true);
					cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setlidVendedorActual(vendedor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cajeroturnoBeanSwingJInternalFrame.cargarCombosForeignKeyCajeroTurno(cajeroturnoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cajeroturnoBeanSwingJInternalFrame.setVisibilidadBusquedasParaVendedor(true);
					cajeroturnoBeanSwingJInternalFrame.setid_vendedorFK_IdVendedor(vendedor.getId());

					if(!this.conCargarFormDetalle) {
						cajeroturnoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cajeroturnoBeanSwingJInternalFrame.setSelectedItemCombosFrameVendedorForeignKey(vendedor,1,false,true,true);
					cajeroturnoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cajeroturnoBeanSwingJInternalFrame.procesarBusqueda("FK_IdVendedor");
					cajeroturnoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdVendedor");
					cajeroturnoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajeroTurno(true);
					cajeroturnoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCajeroTurno("n",cajeroturnoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cajeroturnoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cajeroturnoBeanSwingJInternalFrame.setAutoscrolls(true);
					cajeroturnoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cajeroturnoBeanSwingJInternalFrame.actualizarEstadoPanelsCajeroTurno("relacionado");
					} else {
						cajeroturnoBeanSwingJInternalFrame.actualizarEstadoPanelsCajeroTurno("no_relacionado");
					}

					cajeroturnoBeanSwingJInternalFrame.getjButtonRecargarInformacionCajeroTurno().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarComisionMarcaBeanSwingJInternalFrame(List<Vendedor> vendedors,Vendedor vendedor,ComisionMarcaBeanSwingJInternalFrame comisionmarcaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//comisionmarcaBeanSwingJInternalFrame=new ComisionMarcaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					comisionmarcaBeanSwingJInternalFrame.getComisionMarcaLogic().setConnexion(this.vendedorLogic.getConnexion());

					comisionmarcaBeanSwingJInternalFrame.setvendedorsForeignKey(vendedors);
					comisionmarcaBeanSwingJInternalFrame.setvendedorForeignKey(vendedor);
					comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.setisBusquedaDesdeForeignKeySesionVendedor(true);
					comisionmarcaBeanSwingJInternalFrame.comisionmarcaSessionBean.setlidVendedorActual(vendedor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					comisionmarcaBeanSwingJInternalFrame.cargarCombosForeignKeyComisionMarca(comisionmarcaBeanSwingJInternalFrame.isCargarCombosDependencia);
					comisionmarcaBeanSwingJInternalFrame.setVisibilidadBusquedasParaVendedor(true);
					comisionmarcaBeanSwingJInternalFrame.setid_vendedorFK_IdVendedor(vendedor.getId());

					if(!this.conCargarFormDetalle) {
						comisionmarcaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					comisionmarcaBeanSwingJInternalFrame.setSelectedItemCombosFrameVendedorForeignKey(vendedor,1,false,true,true);
					comisionmarcaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					comisionmarcaBeanSwingJInternalFrame.procesarBusqueda("FK_IdVendedor");
					comisionmarcaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdVendedor");
					comisionmarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionMarca(true);
					comisionmarcaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesComisionMarca("n",comisionmarcaBeanSwingJInternalFrame.isGuardarCambiosEnLote, comisionmarcaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					comisionmarcaBeanSwingJInternalFrame.setAutoscrolls(true);
					comisionmarcaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						comisionmarcaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionMarca("relacionado");
					} else {
						comisionmarcaBeanSwingJInternalFrame.actualizarEstadoPanelsComisionMarca("no_relacionado");
					}

					comisionmarcaBeanSwingJInternalFrame.getjButtonRecargarInformacionComisionMarca().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPresupuestoVentasBeanSwingJInternalFrame(List<Vendedor> vendedors,Vendedor vendedor,PresupuestoVentasBeanSwingJInternalFrame presupuestoventasBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//presupuestoventasBeanSwingJInternalFrame=new PresupuestoVentasBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					presupuestoventasBeanSwingJInternalFrame.getPresupuestoVentasLogic().setConnexion(this.vendedorLogic.getConnexion());

					presupuestoventasBeanSwingJInternalFrame.setvendedorsForeignKey(vendedors);
					presupuestoventasBeanSwingJInternalFrame.setvendedorForeignKey(vendedor);
					presupuestoventasBeanSwingJInternalFrame.presupuestoventasSessionBean.setisBusquedaDesdeForeignKeySesionVendedor(true);
					presupuestoventasBeanSwingJInternalFrame.presupuestoventasSessionBean.setlidVendedorActual(vendedor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					presupuestoventasBeanSwingJInternalFrame.cargarCombosForeignKeyPresupuestoVentas(presupuestoventasBeanSwingJInternalFrame.isCargarCombosDependencia);
					presupuestoventasBeanSwingJInternalFrame.setVisibilidadBusquedasParaVendedor(true);
					presupuestoventasBeanSwingJInternalFrame.setid_vendedorFK_IdVendedor(vendedor.getId());

					if(!this.conCargarFormDetalle) {
						presupuestoventasBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					presupuestoventasBeanSwingJInternalFrame.setSelectedItemCombosFrameVendedorForeignKey(vendedor,1,false,true,true);
					presupuestoventasBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					presupuestoventasBeanSwingJInternalFrame.procesarBusqueda("FK_IdVendedor");
					presupuestoventasBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdVendedor");
					presupuestoventasBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresupuestoVentas(true);
					presupuestoventasBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPresupuestoVentas("n",presupuestoventasBeanSwingJInternalFrame.isGuardarCambiosEnLote, presupuestoventasBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					presupuestoventasBeanSwingJInternalFrame.setAutoscrolls(true);
					presupuestoventasBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						presupuestoventasBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoVentas("relacionado");
					} else {
						presupuestoventasBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoVentas("no_relacionado");
					}

					presupuestoventasBeanSwingJInternalFrame.getjButtonRecargarInformacionPresupuestoVentas().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPresupuestoVentasLineasBeanSwingJInternalFrame(List<Vendedor> vendedors,Vendedor vendedor,PresupuestoVentasLineasBeanSwingJInternalFrame presupuestoventaslineasBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//presupuestoventaslineasBeanSwingJInternalFrame=new PresupuestoVentasLineasBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					presupuestoventaslineasBeanSwingJInternalFrame.getPresupuestoVentasLineasLogic().setConnexion(this.vendedorLogic.getConnexion());

					presupuestoventaslineasBeanSwingJInternalFrame.setvendedorsForeignKey(vendedors);
					presupuestoventaslineasBeanSwingJInternalFrame.setvendedorForeignKey(vendedor);
					presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.setisBusquedaDesdeForeignKeySesionVendedor(true);
					presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.setlidVendedorActual(vendedor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					presupuestoventaslineasBeanSwingJInternalFrame.cargarCombosForeignKeyPresupuestoVentasLineas(presupuestoventaslineasBeanSwingJInternalFrame.isCargarCombosDependencia);
					presupuestoventaslineasBeanSwingJInternalFrame.setVisibilidadBusquedasParaVendedor(true);
					presupuestoventaslineasBeanSwingJInternalFrame.setid_vendedorFK_IdVendedor(vendedor.getId());

					if(!this.conCargarFormDetalle) {
						presupuestoventaslineasBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					presupuestoventaslineasBeanSwingJInternalFrame.setSelectedItemCombosFrameVendedorForeignKey(vendedor,1,false,true,true);
					presupuestoventaslineasBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					presupuestoventaslineasBeanSwingJInternalFrame.procesarBusqueda("FK_IdVendedor");
					presupuestoventaslineasBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdVendedor");
					presupuestoventaslineasBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresupuestoVentasLineas(true);
					presupuestoventaslineasBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPresupuestoVentasLineas("n",presupuestoventaslineasBeanSwingJInternalFrame.isGuardarCambiosEnLote, presupuestoventaslineasBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					presupuestoventaslineasBeanSwingJInternalFrame.setAutoscrolls(true);
					presupuestoventaslineasBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						presupuestoventaslineasBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoVentasLineas("relacionado");
					} else {
						presupuestoventaslineasBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoVentasLineas("no_relacionado");
					}

					presupuestoventaslineasBeanSwingJInternalFrame.getjButtonRecargarInformacionPresupuestoVentasLineas().setVisible(false);

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
