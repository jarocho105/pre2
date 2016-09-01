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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.CajaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class CajaDetalleFormJInternalFrame extends CajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCaja;
	
	protected JMenuBar jmenuBarDetalleCaja;
	
	protected JMenu jmenuDetalleCaja;
	protected JMenu jmenuDetalleArchivoCaja;
	protected JMenu jmenuDetalleAccionesCaja;
	protected JMenu jmenuDetalleDatosCaja;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCaja;	
	protected GridBagConstraints gridBagConstraintsCaja;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CajaBeanSwingJInternalFrameAdditional jInternalFrameDetalleCaja;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";
	
	public CajaSessionBean cajaSessionBean;
	
	

	public NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame=null;
	public NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNotaCreditoPuntoVenta=false;
	public NotaCreditoPuntoVentaSessionBean notacreditopuntoventaSessionBean;

	public CajaCierreBeanSwingJInternalFrame cajacierreBeanSwingJInternalFrame=null;
	public CajaCierreBeanSwingJInternalFrame cajacierreBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCajaCierre=false;
	public CajaCierreSessionBean cajacierreSessionBean;

	public FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame=null;
	public FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFacturaPuntoVenta=false;
	public FacturaPuntoVentaSessionBean facturapuntoventaSessionBean;

	public CajaEgresoBeanSwingJInternalFrame cajaegresoBeanSwingJInternalFrame=null;
	public CajaEgresoBeanSwingJInternalFrame cajaegresoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCajaEgreso=false;
	public CajaEgresoSessionBean cajaegresoSessionBean;

	public CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFrame=null;
	public CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCajeroTurno=false;
	public CajeroTurnoSessionBean cajeroturnoSessionBean;

	public PresupuestoVentasPunVenBeanSwingJInternalFrame presupuestoventaspunvenBeanSwingJInternalFrame=null;
	public PresupuestoVentasPunVenBeanSwingJInternalFrame presupuestoventaspunvenBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePresupuestoVentasPunVen=false;
	public PresupuestoVentasPunVenSessionBean presupuestoventaspunvenSessionBean;

	public PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFrame=null;
	public PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoPuntoVenta=false;
	public PedidoPuntoVentaSessionBean pedidopuntoventaSessionBean;

	public CajaIngresoBeanSwingJInternalFrame cajaingresoBeanSwingJInternalFrame=null;
	public CajaIngresoBeanSwingJInternalFrame cajaingresoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCajaIngreso=false;
	public CajaIngresoSessionBean cajaingresoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;	
	
	public CajaLogic cajaLogic;
	
	public JScrollPane jScrollPanelDatosCaja;
	public JScrollPane jScrollPanelDatosEdicionCaja;
	public JScrollPane jScrollPanelDatosGeneralCaja;
	
	protected JPanel jPanelCamposCaja;    
	protected JPanel jPanelCamposOcultosCaja;    	
	protected JPanel jPanelAccionesCaja;
	protected JPanel jPanelAccionesFormularioCaja;
    
	
	
	protected JTabbedPane jTabbedPaneCamposCaja;	
	protected Integer iXPanelCamposCaja=0;
	protected Integer iYPanelCamposCaja=0;
	
	protected Integer iXPanelCamposOcultosCaja=0;
	protected Integer iYPanelCamposOcultosCaja=0;
	
	

	protected JPanel jPanelCamposIniciogeneralCaja;
	protected Integer iXPanelCamposIniciogeneralCaja=0;
	protected Integer iYPanelCamposIniciogeneralCaja=0;

	protected JPanel jPanelCamposIniciocajaCaja;
	protected Integer iXPanelCamposIniciocajaCaja=0;
	protected Integer iYPanelCamposIniciocajaCaja=0;

	protected JPanel jPanelCamposInicioclienteCaja;
	protected Integer iXPanelCamposInicioclienteCaja=0;
	protected Integer iYPanelCamposInicioclienteCaja=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCaja;
	public JButton jButtonModificarCaja;
	public JButton jButtonActualizarCaja;
    public JButton jButtonEliminarCaja;
	public JButton jButtonCancelarCaja;
    public JButton jButtonGuardarCambiosCaja;
	public JButton jButtonGuardarCambiosTablaCaja;
	protected JButton jButtonCerrarCaja;
	
	
	protected JButton jButtonProcesarInformacionCaja;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCaja;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCaja;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCaja;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCaja;
	protected JButton jButtonModificarToolBarCaja;
	protected JButton jButtonActualizarToolBarCaja;
    protected JButton jButtonEliminarToolBarCaja;
	protected JButton jButtonCancelarToolBarCaja;
    protected JButton jButtonGuardarCambiosToolBarCaja;
	protected JButton jButtonGuardarCambiosTablaToolBarCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarCaja;
	protected JButton jButtonCerrarToolBarCaja;
	
	protected JButton jButtonProcesarInformacionToolBarCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCaja;
	protected JMenuItem jMenuItemModificarCaja;
	protected JMenuItem jMenuItemActualizarCaja;
    protected JMenuItem jMenuItemEliminarCaja;
	protected JMenuItem jMenuItemCancelarCaja;
    protected JMenuItem jMenuItemGuardarCambiosCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaCaja;
	protected JMenuItem jMenuItemCerrarCaja;
	protected JMenuItem jMenuItemDetalleCerrarCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarCaja;
	
	protected JMenuItem jMenuItemProcesarInformacionCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCaja;
	protected JMenuItem jMenuItemMostrarOcultarCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCaja;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCaja;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCaja;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCaja;
	public JLabel jLabelIdCaja;
	public JLabel jLabelidCaja;
	public JButton jButtonidCajaBusqueda= new JButtonMe();

	public JPanel jPanelnombreCaja;
	public JLabel jLabelnombreCaja;
	public JTextArea jTextAreanombreCaja;
	public JScrollPane jscrollPanenombreCaja;
	public JButton jButtonnombreCajaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_equipoCaja;
	public JLabel jLabelnombre_equipoCaja;
	public JTextArea jTextAreanombre_equipoCaja;
	public JScrollPane jscrollPanenombre_equipoCaja;
	public JButton jButtonnombre_equipoCajaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_impresoraCaja;
	public JLabel jLabelnombre_impresoraCaja;
	public JTextArea jTextAreanombre_impresoraCaja;
	public JScrollPane jscrollPanenombre_impresoraCaja;
	public JButton jButtonnombre_impresoraCajaBusqueda= new JButtonMe();

	public JPanel jPanelsecuencial_pedidoCaja;
	public JLabel jLabelsecuencial_pedidoCaja;
	public JTextField jTextFieldsecuencial_pedidoCaja;
	public JButton jButtonsecuencial_pedidoCajaBusqueda= new JButtonMe();

	public JPanel jPanelsecuencial_pedido_formatoCaja;
	public JLabel jLabelsecuencial_pedido_formatoCaja;
	public JTextField jTextFieldsecuencial_pedido_formatoCaja;
	public JButton jButtonsecuencial_pedido_formatoCajaBusqueda= new JButtonMe();

	public JPanel jPanelpunto_emisionCaja;
	public JLabel jLabelpunto_emisionCaja;
	public JTextField jTextFieldpunto_emisionCaja;
	public JButton jButtonpunto_emisionCajaBusqueda= new JButtonMe();

	public JPanel jPanelestablecimientoCaja;
	public JLabel jLabelestablecimientoCaja;
	public JTextField jTextFieldestablecimientoCaja;
	public JButton jButtonestablecimientoCajaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioCaja;
	public JLabel jLabelfecha_inicioCaja;
	//public JFormattedTextField jDateChooserfecha_inicioCaja;

	public JDateChooser jDateChooserfecha_inicioCaja;
	public JButton jButtonfecha_inicioCajaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finalCaja;
	public JLabel jLabelfecha_finalCaja;
	//public JFormattedTextField jDateChooserfecha_finalCaja;

	public JDateChooser jDateChooserfecha_finalCaja;
	public JButton jButtonfecha_finalCajaBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoCaja;
	public JLabel jLabelesta_activoCaja;
	public JCheckBox jCheckBoxesta_activoCaja;
	public JButton jButtonesta_activoCajaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionCaja;
	public JLabel jLabeldescripcionCaja;
	public JTextArea jTextAreadescripcionCaja;
	public JScrollPane jscrollPanedescripcionCaja;
	public JButton jButtondescripcionCajaBusqueda= new JButtonMe();

	public JPanel jPanelsecuencial_facturaCaja;
	public JLabel jLabelsecuencial_facturaCaja;
	public JTextField jTextFieldsecuencial_facturaCaja;
	public JButton jButtonsecuencial_facturaCajaBusqueda= new JButtonMe();

	public JPanel jPanelsecuencial_factura_formatoCaja;
	public JLabel jLabelsecuencial_factura_formatoCaja;
	public JTextField jTextFieldsecuencial_factura_formatoCaja;
	public JButton jButtonsecuencial_factura_formatoCajaBusqueda= new JButtonMe();

	public JPanel jPanelsecuencial_nota_ventaCaja;
	public JLabel jLabelsecuencial_nota_ventaCaja;
	public JTextField jTextFieldsecuencial_nota_ventaCaja;
	public JButton jButtonsecuencial_nota_ventaCajaBusqueda= new JButtonMe();

	public JPanel jPanelsecuencial_nota_venta_formatoCaja;
	public JLabel jLabelsecuencial_nota_venta_formatoCaja;
	public JTextField jTextFieldsecuencial_nota_venta_formatoCaja;
	public JButton jButtonsecuencial_nota_venta_formatoCajaBusqueda= new JButtonMe();

	public JPanel jPanelsecuencia_nota_creditoCaja;
	public JLabel jLabelsecuencia_nota_creditoCaja;
	public JTextField jTextFieldsecuencia_nota_creditoCaja;
	public JButton jButtonsecuencia_nota_creditoCajaBusqueda= new JButtonMe();

	public JPanel jPanelsecuencia_nota_credito_formatoCaja;
	public JLabel jLabelsecuencia_nota_credito_formatoCaja;
	public JTextField jTextFieldsecuencia_nota_credito_formatoCaja;
	public JButton jButtonsecuencia_nota_credito_formatoCajaBusqueda= new JButtonMe();

	public JPanel jPanelautorizacion_facturaCaja;
	public JLabel jLabelautorizacion_facturaCaja;
	public JTextField jTextFieldautorizacion_facturaCaja;
	public JButton jButtonautorizacion_facturaCajaBusqueda= new JButtonMe();

	public JPanel jPanelautorizacion_nota_ventaCaja;
	public JLabel jLabelautorizacion_nota_ventaCaja;
	public JTextField jTextFieldautorizacion_nota_ventaCaja;
	public JButton jButtonautorizacion_nota_ventaCajaBusqueda= new JButtonMe();

	public JPanel jPanelautorizacion_nota_creditoCaja;
	public JLabel jLabelautorizacion_nota_creditoCaja;
	public JTextField jTextFieldautorizacion_nota_creditoCaja;
	public JButton jButtonautorizacion_nota_creditoCajaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_caduca_facturaCaja;
	public JLabel jLabelfecha_caduca_facturaCaja;
	//public JFormattedTextField jDateChooserfecha_caduca_facturaCaja;

	public JDateChooser jDateChooserfecha_caduca_facturaCaja;
	public JButton jButtonfecha_caduca_facturaCajaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_caduca_nota_ventaCaja;
	public JLabel jLabelfecha_caduca_nota_ventaCaja;
	//public JFormattedTextField jDateChooserfecha_caduca_nota_ventaCaja;

	public JDateChooser jDateChooserfecha_caduca_nota_ventaCaja;
	public JButton jButtonfecha_caduca_nota_ventaCajaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_caduca_nota_creditoCaja;
	public JLabel jLabelfecha_caduca_nota_creditoCaja;
	//public JFormattedTextField jDateChooserfecha_caduca_nota_creditoCaja;

	public JDateChooser jDateChooserfecha_caduca_nota_creditoCaja;
	public JButton jButtonfecha_caduca_nota_creditoCajaBusqueda= new JButtonMe();

	public JPanel jPanelserie_facturaCaja;
	public JLabel jLabelserie_facturaCaja;
	public JTextField jTextFieldserie_facturaCaja;
	public JButton jButtonserie_facturaCajaBusqueda= new JButtonMe();

	public JPanel jPanelserie_nota_ventaCaja;
	public JLabel jLabelserie_nota_ventaCaja;
	public JTextField jTextFieldserie_nota_ventaCaja;
	public JButton jButtonserie_nota_ventaCajaBusqueda= new JButtonMe();

	public JPanel jPanelserie_nota_creditoCaja;
	public JLabel jLabelserie_nota_creditoCaja;
	public JTextField jTextFieldserie_nota_creditoCaja;
	public JButton jButtonserie_nota_creditoCajaBusqueda= new JButtonMe();

	public JPanel jPanelsec_inicial_facturaCaja;
	public JLabel jLabelsec_inicial_facturaCaja;
	public JTextField jTextFieldsec_inicial_facturaCaja;
	public JButton jButtonsec_inicial_facturaCajaBusqueda= new JButtonMe();

	public JPanel jPanelsec_inicial_nota_ventaCaja;
	public JLabel jLabelsec_inicial_nota_ventaCaja;
	public JTextField jTextFieldsec_inicial_nota_ventaCaja;
	public JButton jButtonsec_inicial_nota_ventaCajaBusqueda= new JButtonMe();

	public JPanel jPanelsec_inicial_nota_creditoCaja;
	public JLabel jLabelsec_inicial_nota_creditoCaja;
	public JTextField jTextFieldsec_inicial_nota_creditoCaja;
	public JButton jButtonsec_inicial_nota_creditoCajaBusqueda= new JButtonMe();

	public JPanel jPanelsec_final_facturaCaja;
	public JLabel jLabelsec_final_facturaCaja;
	public JTextField jTextFieldsec_final_facturaCaja;
	public JButton jButtonsec_final_facturaCajaBusqueda= new JButtonMe();

	public JPanel jPanelsec_final_nota_ventaCaja;
	public JLabel jLabelsec_final_nota_ventaCaja;
	public JTextField jTextFieldsec_final_nota_ventaCaja;
	public JButton jButtonsec_final_nota_ventaCajaBusqueda= new JButtonMe();

	public JPanel jPanelsec_final_nota_creditoCaja;
	public JLabel jLabelsec_final_nota_creditoCaja;
	public JTextField jTextFieldsec_final_nota_creditoCaja;
	public JButton jButtonsec_final_nota_creditoCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCaja;
	public JLabel jLabelid_empresaCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCaja;
	public JButton jButtonid_empresaCaja= new JButtonMe();
	public JButton jButtonid_empresaCajaUpdate= new JButtonMe();
	public JButton jButtonid_empresaCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCaja;
	public JLabel jLabelid_sucursalCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCaja;
	public JButton jButtonid_sucursalCaja= new JButtonMe();
	public JButton jButtonid_sucursalCajaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_paisCaja;
	public JLabel jLabelid_paisCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisCaja;
	public JButton jButtonid_paisCaja= new JButtonMe();
	public JButton jButtonid_paisCajaUpdate= new JButtonMe();
	public JButton jButtonid_paisCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadCaja;
	public JLabel jLabelid_ciudadCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadCaja;
	public JButton jButtonid_ciudadCaja= new JButtonMe();
	public JButton jButtonid_ciudadCajaUpdate= new JButtonMe();
	public JButton jButtonid_ciudadCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_zonaCaja;
	public JLabel jLabelid_zonaCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaCaja;
	public JButton jButtonid_zonaCaja= new JButtonMe();
	public JButton jButtonid_zonaCajaUpdate= new JButtonMe();
	public JButton jButtonid_zonaCajaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCaja;
	
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
	public int iHeightFormulario=1870;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CajaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCaja=new JPanel();
				this.jPanelAccionesFormularioCaja=new JPanel();
				this.jmenuBarDetalleCaja=new JMenuBar();
				this.jTtoolBarDetalleCaja=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Caja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CajaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Caja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Caja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Caja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Caja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCaja() {
		return this.jButtonActualizarToolBarCaja;
	}
	
	public JButton getjButtonEliminarToolBarCaja() {
		return this.jButtonEliminarToolBarCaja;
	}
	
	public JButton getjButtonCancelarToolBarCaja() {
		return this.jButtonCancelarToolBarCaja;
	}		
	
	public JButton getjButtonProcesarInformacionCaja() {
		return this.jButtonProcesarInformacionCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCaja)	{
		this.jButtonProcesarInformacionCaja = jButtonProcesarInformacionCaja;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCaja() {
		return this.jComboBoxTiposAccionesCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCaja(
			JComboBox jComboBoxTiposRelacionesCaja) {
		this.jComboBoxTiposRelacionesCaja = jComboBoxTiposRelacionesCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCaja(
			JComboBox jComboBoxTiposAccionesCaja) {
		this.jComboBoxTiposAccionesCaja = jComboBoxTiposAccionesCaja;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCaja() {
		return this.jComboBoxTiposAccionesFormularioCaja;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCaja(
			JComboBox jComboBoxTiposAccionesFormularioCaja) {
		this.jComboBoxTiposAccionesFormularioCaja = jComboBoxTiposAccionesFormularioCaja;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cajaSessionBean=new CajaSessionBean();
		
		this.cajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.notacreditopuntoventaSessionBean=new NotaCreditoPuntoVentaSessionBean();
		//this.cajacierreSessionBean=new CajaCierreSessionBean();
		//this.facturapuntoventaSessionBean=new FacturaPuntoVentaSessionBean();
		//this.cajaegresoSessionBean=new CajaEgresoSessionBean();
		//this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
		//this.presupuestoventaspunvenSessionBean=new PresupuestoVentasPunVenSessionBean();
		//this.pedidopuntoventaSessionBean=new PedidoPuntoVentaSessionBean();
		//this.cajaingresoSessionBean=new CajaIngresoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caja MANTENIMIENTO"));
		
		
		if(iWidth > 3750) {
			iWidth=3750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cajaSessionBean.getEsGuardarRelacionado()) {
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
	
		CajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCaja= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCaja=new JButtonMe();
				this.jButtonModificarToolBarCaja=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCaja,this.jTtoolBarDetalleCaja,
							"actualizar","actualizar","Actualizar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCaja,this.jTtoolBarDetalleCaja,
							"eliminar","eliminar","Eliminar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCaja,this.jTtoolBarDetalleCaja,
							"cancelar","cancelar","Cancelar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCaja,this.jTtoolBarDetalleCaja,
							"guardarcambios","guardarcambios","Guardar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCaja,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCaja=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCaja=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCaja=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCaja=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCaja=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCaja= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCaja.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCaja,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCaja= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCaja.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCaja,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCaja= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCaja.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCaja,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCaja= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCaja.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCaja,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCaja, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCaja.add(this.jMenuItemDetalleCerrarCaja);
		
		this.jmenuDetalleAccionesCaja.add(this.jMenuItemActualizarCaja);
		this.jmenuDetalleAccionesCaja.add(this.jMenuItemEliminarCaja);
		this.jmenuDetalleAccionesCaja.add(this.jMenuItemCancelarCaja);		
		
		//this.jmenuDetalleDatosCaja.add(this.jMenuItemDetalleAbrirOrderByCaja);				
		this.jmenuDetalleDatosCaja.add(this.jMenuItemDetalleMostarOcultarCaja);				
				
		//this.jmenuDetalleAccionesCaja.add(this.jMenuItemGuardarCambiosCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCaja.add(this.jmenuDetalleArchivoCaja);		
		this.jmenuBarDetalleCaja.add(this.jmenuDetalleAccionesCaja);		
		this.jmenuBarDetalleCaja.add(this.jmenuDetalleDatosCaja);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCaja.add(this.jmenuDetalleCaja);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCaja);				
	}
	
	
	public void inicializarElementosCamposCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCaja = new JLabelMe();
		jLabelIdCaja.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCaja = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCaja.setToolTipText(CajaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCaja= new GridBagLayout();

		this.jPanelidCaja.setLayout(this.gridaBagLayoutCaja);

		jLabelidCaja = new JLabel();
		jLabelidCaja.setText("Id");

		jLabelidCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreCaja = new JLabelMe();
		this.jLabelnombreCaja.setText(""+CajaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCaja.setToolTipText("Nombre");
		this.jLabelnombreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCaja.setToolTipText(CajaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelnombreCaja.setLayout(this.gridaBagLayoutCaja);


		jTextAreanombreCaja= new JTextAreaMe();
		jTextAreanombreCaja.setEnabled(false);
		jTextAreanombreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCaja.setLineWrap(true);
		jTextAreanombreCaja.setWrapStyleWord(true);
		jTextAreanombreCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCaja.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCaja = new JScrollPane(jTextAreanombreCaja);
		jscrollPanenombreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCajaBusqueda= new JButtonMe();
		this.jButtonnombreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCajaBusqueda.setText("U");
		this.jButtonnombreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCajaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_equipoCaja = new JLabelMe();
		this.jLabelnombre_equipoCaja.setText(""+CajaConstantesFunciones.LABEL_NOMBREEQUIPO+" : *");
		this.jLabelnombre_equipoCaja.setToolTipText("Nombre Equipo");
		this.jLabelnombre_equipoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_equipoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_equipoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_equipoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_equipoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_equipoCaja.setToolTipText(CajaConstantesFunciones.LABEL_NOMBREEQUIPO);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelnombre_equipoCaja.setLayout(this.gridaBagLayoutCaja);


		jTextAreanombre_equipoCaja= new JTextAreaMe();
		jTextAreanombre_equipoCaja.setEnabled(false);
		jTextAreanombre_equipoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_equipoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_equipoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_equipoCaja.setLineWrap(true);
		jTextAreanombre_equipoCaja.setWrapStyleWord(true);
		jTextAreanombre_equipoCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_equipoCaja.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_equipoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_equipoCaja = new JScrollPane(jTextAreanombre_equipoCaja);
		jscrollPanenombre_equipoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_equipoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_equipoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_equipoCajaBusqueda= new JButtonMe();
		this.jButtonnombre_equipoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_equipoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_equipoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_equipoCajaBusqueda.setText("U");
		this.jButtonnombre_equipoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_equipoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_equipoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_equipoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_equipoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_equipoCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_equipoCajaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_impresoraCaja = new JLabelMe();
		this.jLabelnombre_impresoraCaja.setText(""+CajaConstantesFunciones.LABEL_NOMBREIMPRESORA+" : *");
		this.jLabelnombre_impresoraCaja.setToolTipText("Nombre Impresora");
		this.jLabelnombre_impresoraCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_impresoraCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_impresoraCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_impresoraCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_impresoraCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_impresoraCaja.setToolTipText(CajaConstantesFunciones.LABEL_NOMBREIMPRESORA);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelnombre_impresoraCaja.setLayout(this.gridaBagLayoutCaja);


		jTextAreanombre_impresoraCaja= new JTextAreaMe();
		jTextAreanombre_impresoraCaja.setEnabled(false);
		jTextAreanombre_impresoraCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_impresoraCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_impresoraCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_impresoraCaja.setLineWrap(true);
		jTextAreanombre_impresoraCaja.setWrapStyleWord(true);
		jTextAreanombre_impresoraCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_impresoraCaja.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_impresoraCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_impresoraCaja = new JScrollPane(jTextAreanombre_impresoraCaja);
		jscrollPanenombre_impresoraCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_impresoraCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_impresoraCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_impresoraCajaBusqueda= new JButtonMe();
		this.jButtonnombre_impresoraCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_impresoraCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_impresoraCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_impresoraCajaBusqueda.setText("U");
		this.jButtonnombre_impresoraCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_impresoraCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_impresoraCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_impresoraCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_impresoraCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_impresoraCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_impresoraCajaBusqueda.setVisible(false);		}


					
		this.jLabelsecuencial_pedidoCaja = new JLabelMe();
		this.jLabelsecuencial_pedidoCaja.setText(""+CajaConstantesFunciones.LABEL_SECUENCIALPEDIDO+" : *");
		this.jLabelsecuencial_pedidoCaja.setToolTipText("Secuencial Pedido");
		this.jLabelsecuencial_pedidoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuencial_pedidoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuencial_pedidoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencial_pedidoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencial_pedidoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencial_pedidoCaja.setToolTipText(CajaConstantesFunciones.LABEL_SECUENCIALPEDIDO);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelsecuencial_pedidoCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldsecuencial_pedidoCaja= new JTextFieldMe();
		jTextFieldsecuencial_pedidoCaja.setEnabled(false);
		jTextFieldsecuencial_pedidoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_pedidoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_pedidoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencial_pedidoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsecuencial_pedidoCaja.setText("0");

		this.jButtonsecuencial_pedidoCajaBusqueda= new JButtonMe();
		this.jButtonsecuencial_pedidoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_pedidoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_pedidoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencial_pedidoCajaBusqueda.setText("U");
		this.jButtonsecuencial_pedidoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencial_pedidoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencial_pedidoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencial_pedidoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencial_pedidoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencial_pedidoCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencial_pedidoCajaBusqueda.setVisible(false);		}


					
		this.jLabelsecuencial_pedido_formatoCaja = new JLabelMe();
		this.jLabelsecuencial_pedido_formatoCaja.setText(""+CajaConstantesFunciones.LABEL_SECUENCIALPEDIDOFORMATO+" : *");
		this.jLabelsecuencial_pedido_formatoCaja.setToolTipText("Secuencial Pedido Formato");
		this.jLabelsecuencial_pedido_formatoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsecuencial_pedido_formatoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsecuencial_pedido_formatoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencial_pedido_formatoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencial_pedido_formatoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencial_pedido_formatoCaja.setToolTipText(CajaConstantesFunciones.LABEL_SECUENCIALPEDIDOFORMATO);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelsecuencial_pedido_formatoCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldsecuencial_pedido_formatoCaja= new JTextFieldMe();

		jTextFieldsecuencial_pedido_formatoCaja.setEnabled(false);
		jTextFieldsecuencial_pedido_formatoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_pedido_formatoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_pedido_formatoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencial_pedido_formatoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencial_pedido_formatoCajaBusqueda= new JButtonMe();
		this.jButtonsecuencial_pedido_formatoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_pedido_formatoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_pedido_formatoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencial_pedido_formatoCajaBusqueda.setText("U");
		this.jButtonsecuencial_pedido_formatoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencial_pedido_formatoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencial_pedido_formatoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencial_pedido_formatoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencial_pedido_formatoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencial_pedido_formatoCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencial_pedido_formatoCajaBusqueda.setVisible(false);		}


					
		this.jLabelpunto_emisionCaja = new JLabelMe();
		this.jLabelpunto_emisionCaja.setText(""+CajaConstantesFunciones.LABEL_PUNTOEMISION+" : *");
		this.jLabelpunto_emisionCaja.setToolTipText("Punto Emision");
		this.jLabelpunto_emisionCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpunto_emisionCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpunto_emisionCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpunto_emisionCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpunto_emisionCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpunto_emisionCaja.setToolTipText(CajaConstantesFunciones.LABEL_PUNTOEMISION);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelpunto_emisionCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldpunto_emisionCaja= new JTextFieldMe();

		jTextFieldpunto_emisionCaja.setEnabled(false);
		jTextFieldpunto_emisionCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpunto_emisionCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpunto_emisionCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpunto_emisionCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpunto_emisionCajaBusqueda= new JButtonMe();
		this.jButtonpunto_emisionCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpunto_emisionCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpunto_emisionCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpunto_emisionCajaBusqueda.setText("U");
		this.jButtonpunto_emisionCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpunto_emisionCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpunto_emisionCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpunto_emisionCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpunto_emisionCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"punto_emisionCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpunto_emisionCajaBusqueda.setVisible(false);		}


					
		this.jLabelestablecimientoCaja = new JLabelMe();
		this.jLabelestablecimientoCaja.setText(""+CajaConstantesFunciones.LABEL_ESTABLECIMIENTO+" : *");
		this.jLabelestablecimientoCaja.setToolTipText("Establecimiento");
		this.jLabelestablecimientoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelestablecimientoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelestablecimientoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelestablecimientoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestablecimientoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestablecimientoCaja.setToolTipText(CajaConstantesFunciones.LABEL_ESTABLECIMIENTO);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelestablecimientoCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldestablecimientoCaja= new JTextFieldMe();

		jTextFieldestablecimientoCaja.setEnabled(false);
		jTextFieldestablecimientoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldestablecimientoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldestablecimientoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldestablecimientoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonestablecimientoCajaBusqueda= new JButtonMe();
		this.jButtonestablecimientoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestablecimientoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestablecimientoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestablecimientoCajaBusqueda.setText("U");
		this.jButtonestablecimientoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestablecimientoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestablecimientoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldestablecimientoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldestablecimientoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"establecimientoCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestablecimientoCajaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_inicioCaja = new JLabelMe();
		this.jLabelfecha_inicioCaja.setText(""+CajaConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioCaja.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioCaja.setToolTipText(CajaConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelfecha_inicioCaja.setLayout(this.gridaBagLayoutCaja);


		//jFormattedTextFieldfecha_inicioCaja= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioCaja= new JDateChooser();
		jDateChooserfecha_inicioCaja.setEnabled(false);
		jDateChooserfecha_inicioCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioCaja.setDate(new Date());
		jDateChooserfecha_inicioCaja.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioCaja.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioCajaBusqueda= new JButtonMe();
		this.jButtonfecha_inicioCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioCajaBusqueda.setText("U");
		this.jButtonfecha_inicioCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioCajaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finalCaja = new JLabelMe();
		this.jLabelfecha_finalCaja.setText(""+CajaConstantesFunciones.LABEL_FECHAFINAL+" : *");
		this.jLabelfecha_finalCaja.setToolTipText("Fecha Final");
		this.jLabelfecha_finalCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finalCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finalCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finalCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finalCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finalCaja.setToolTipText(CajaConstantesFunciones.LABEL_FECHAFINAL);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelfecha_finalCaja.setLayout(this.gridaBagLayoutCaja);


		//jFormattedTextFieldfecha_finalCaja= new JFormattedTextFieldMe();

		jDateChooserfecha_finalCaja= new JDateChooser();
		jDateChooserfecha_finalCaja.setEnabled(false);
		jDateChooserfecha_finalCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finalCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finalCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finalCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finalCaja.setDate(new Date());
		jDateChooserfecha_finalCaja.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finalCaja.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finalCajaBusqueda= new JButtonMe();
		this.jButtonfecha_finalCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finalCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finalCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finalCajaBusqueda.setText("U");
		this.jButtonfecha_finalCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finalCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finalCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finalCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finalCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finalCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finalCajaBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoCaja = new JLabelMe();
		this.jLabelesta_activoCaja.setText(""+CajaConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoCaja.setToolTipText("Esta Activo");
		this.jLabelesta_activoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoCaja.setToolTipText(CajaConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelesta_activoCaja.setLayout(this.gridaBagLayoutCaja);


		jCheckBoxesta_activoCaja= new JCheckBoxMe();
		jCheckBoxesta_activoCaja.setEnabled(false);

		jCheckBoxesta_activoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoCajaBusqueda= new JButtonMe();
		this.jButtonesta_activoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoCajaBusqueda.setText("U");
		this.jButtonesta_activoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoCajaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionCaja = new JLabelMe();
		this.jLabeldescripcionCaja.setText(""+CajaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionCaja.setToolTipText("Descripcion");
		this.jLabeldescripcionCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionCaja.setToolTipText(CajaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPaneldescripcionCaja.setLayout(this.gridaBagLayoutCaja);


		jTextAreadescripcionCaja= new JTextAreaMe();
		jTextAreadescripcionCaja.setEnabled(false);
		jTextAreadescripcionCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCaja.setLineWrap(true);
		jTextAreadescripcionCaja.setWrapStyleWord(true);
		jTextAreadescripcionCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionCaja.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionCaja = new JScrollPane(jTextAreadescripcionCaja);
		jscrollPanedescripcionCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionCajaBusqueda= new JButtonMe();
		this.jButtondescripcionCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionCajaBusqueda.setText("U");
		this.jButtondescripcionCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionCajaBusqueda.setVisible(false);		}


					
		this.jLabelsecuencial_facturaCaja = new JLabelMe();
		this.jLabelsecuencial_facturaCaja.setText(""+CajaConstantesFunciones.LABEL_SECUENCIALFACTURA+" : *");
		this.jLabelsecuencial_facturaCaja.setToolTipText("Secuencial");
		this.jLabelsecuencial_facturaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencial_facturaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencial_facturaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencial_facturaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencial_facturaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencial_facturaCaja.setToolTipText(CajaConstantesFunciones.LABEL_SECUENCIALFACTURA);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelsecuencial_facturaCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldsecuencial_facturaCaja= new JTextFieldMe();
		jTextFieldsecuencial_facturaCaja.setEnabled(false);
		jTextFieldsecuencial_facturaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_facturaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_facturaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencial_facturaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsecuencial_facturaCaja.setText("0");

		this.jButtonsecuencial_facturaCajaBusqueda= new JButtonMe();
		this.jButtonsecuencial_facturaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_facturaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_facturaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencial_facturaCajaBusqueda.setText("U");
		this.jButtonsecuencial_facturaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencial_facturaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencial_facturaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencial_facturaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencial_facturaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencial_facturaCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencial_facturaCajaBusqueda.setVisible(false);		}


					
		this.jLabelsecuencial_factura_formatoCaja = new JLabelMe();
		this.jLabelsecuencial_factura_formatoCaja.setText(""+CajaConstantesFunciones.LABEL_SECUENCIALFACTURAFORMATO+" : *");
		this.jLabelsecuencial_factura_formatoCaja.setToolTipText("Secuencial Formato");
		this.jLabelsecuencial_factura_formatoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuencial_factura_formatoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuencial_factura_formatoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencial_factura_formatoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencial_factura_formatoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencial_factura_formatoCaja.setToolTipText(CajaConstantesFunciones.LABEL_SECUENCIALFACTURAFORMATO);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelsecuencial_factura_formatoCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldsecuencial_factura_formatoCaja= new JTextFieldMe();

		jTextFieldsecuencial_factura_formatoCaja.setEnabled(false);
		jTextFieldsecuencial_factura_formatoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_factura_formatoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_factura_formatoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencial_factura_formatoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencial_factura_formatoCajaBusqueda= new JButtonMe();
		this.jButtonsecuencial_factura_formatoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_factura_formatoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_factura_formatoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencial_factura_formatoCajaBusqueda.setText("U");
		this.jButtonsecuencial_factura_formatoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencial_factura_formatoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencial_factura_formatoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencial_factura_formatoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencial_factura_formatoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencial_factura_formatoCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencial_factura_formatoCajaBusqueda.setVisible(false);		}


					
		this.jLabelsecuencial_nota_ventaCaja = new JLabelMe();
		this.jLabelsecuencial_nota_ventaCaja.setText(""+CajaConstantesFunciones.LABEL_SECUENCIALNOTAVENTA+" : *");
		this.jLabelsecuencial_nota_ventaCaja.setToolTipText("Secuencial ");
		this.jLabelsecuencial_nota_ventaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencial_nota_ventaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencial_nota_ventaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencial_nota_ventaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencial_nota_ventaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencial_nota_ventaCaja.setToolTipText(CajaConstantesFunciones.LABEL_SECUENCIALNOTAVENTA);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelsecuencial_nota_ventaCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldsecuencial_nota_ventaCaja= new JTextFieldMe();
		jTextFieldsecuencial_nota_ventaCaja.setEnabled(false);
		jTextFieldsecuencial_nota_ventaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_nota_ventaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_nota_ventaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencial_nota_ventaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsecuencial_nota_ventaCaja.setText("0");

		this.jButtonsecuencial_nota_ventaCajaBusqueda= new JButtonMe();
		this.jButtonsecuencial_nota_ventaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_nota_ventaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_nota_ventaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencial_nota_ventaCajaBusqueda.setText("U");
		this.jButtonsecuencial_nota_ventaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencial_nota_ventaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencial_nota_ventaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencial_nota_ventaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencial_nota_ventaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencial_nota_ventaCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencial_nota_ventaCajaBusqueda.setVisible(false);		}


					
		this.jLabelsecuencial_nota_venta_formatoCaja = new JLabelMe();
		this.jLabelsecuencial_nota_venta_formatoCaja.setText(""+CajaConstantesFunciones.LABEL_SECUENCIALNOTAVENTAFORMATO+" : *");
		this.jLabelsecuencial_nota_venta_formatoCaja.setToolTipText("Secuencial  Formato ");
		this.jLabelsecuencial_nota_venta_formatoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsecuencial_nota_venta_formatoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsecuencial_nota_venta_formatoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencial_nota_venta_formatoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencial_nota_venta_formatoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencial_nota_venta_formatoCaja.setToolTipText(CajaConstantesFunciones.LABEL_SECUENCIALNOTAVENTAFORMATO);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelsecuencial_nota_venta_formatoCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldsecuencial_nota_venta_formatoCaja= new JTextFieldMe();

		jTextFieldsecuencial_nota_venta_formatoCaja.setEnabled(false);
		jTextFieldsecuencial_nota_venta_formatoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_nota_venta_formatoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_nota_venta_formatoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencial_nota_venta_formatoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencial_nota_venta_formatoCajaBusqueda= new JButtonMe();
		this.jButtonsecuencial_nota_venta_formatoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_nota_venta_formatoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_nota_venta_formatoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencial_nota_venta_formatoCajaBusqueda.setText("U");
		this.jButtonsecuencial_nota_venta_formatoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencial_nota_venta_formatoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencial_nota_venta_formatoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencial_nota_venta_formatoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencial_nota_venta_formatoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencial_nota_venta_formatoCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencial_nota_venta_formatoCajaBusqueda.setVisible(false);		}


					
		this.jLabelsecuencia_nota_creditoCaja = new JLabelMe();
		this.jLabelsecuencia_nota_creditoCaja.setText(""+CajaConstantesFunciones.LABEL_SECUENCIANOTACREDITO+" : *");
		this.jLabelsecuencia_nota_creditoCaja.setToolTipText("Secuencial  ");
		this.jLabelsecuencia_nota_creditoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencia_nota_creditoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencia_nota_creditoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencia_nota_creditoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencia_nota_creditoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencia_nota_creditoCaja.setToolTipText(CajaConstantesFunciones.LABEL_SECUENCIANOTACREDITO);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelsecuencia_nota_creditoCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldsecuencia_nota_creditoCaja= new JTextFieldMe();
		jTextFieldsecuencia_nota_creditoCaja.setEnabled(false);
		jTextFieldsecuencia_nota_creditoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencia_nota_creditoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencia_nota_creditoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencia_nota_creditoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsecuencia_nota_creditoCaja.setText("0");

		this.jButtonsecuencia_nota_creditoCajaBusqueda= new JButtonMe();
		this.jButtonsecuencia_nota_creditoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencia_nota_creditoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencia_nota_creditoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencia_nota_creditoCajaBusqueda.setText("U");
		this.jButtonsecuencia_nota_creditoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencia_nota_creditoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencia_nota_creditoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencia_nota_creditoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencia_nota_creditoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencia_nota_creditoCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencia_nota_creditoCajaBusqueda.setVisible(false);		}


					
		this.jLabelsecuencia_nota_credito_formatoCaja = new JLabelMe();
		this.jLabelsecuencia_nota_credito_formatoCaja.setText(""+CajaConstantesFunciones.LABEL_SECUENCIANOTACREDITOFORMATO+" : *");
		this.jLabelsecuencia_nota_credito_formatoCaja.setToolTipText("Secuencial  Formato  ");
		this.jLabelsecuencia_nota_credito_formatoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsecuencia_nota_credito_formatoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsecuencia_nota_credito_formatoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencia_nota_credito_formatoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencia_nota_credito_formatoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencia_nota_credito_formatoCaja.setToolTipText(CajaConstantesFunciones.LABEL_SECUENCIANOTACREDITOFORMATO);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelsecuencia_nota_credito_formatoCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldsecuencia_nota_credito_formatoCaja= new JTextFieldMe();

		jTextFieldsecuencia_nota_credito_formatoCaja.setEnabled(false);
		jTextFieldsecuencia_nota_credito_formatoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencia_nota_credito_formatoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencia_nota_credito_formatoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencia_nota_credito_formatoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencia_nota_credito_formatoCajaBusqueda= new JButtonMe();
		this.jButtonsecuencia_nota_credito_formatoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencia_nota_credito_formatoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencia_nota_credito_formatoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencia_nota_credito_formatoCajaBusqueda.setText("U");
		this.jButtonsecuencia_nota_credito_formatoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencia_nota_credito_formatoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencia_nota_credito_formatoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencia_nota_credito_formatoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencia_nota_credito_formatoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencia_nota_credito_formatoCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencia_nota_credito_formatoCajaBusqueda.setVisible(false);		}


					
		this.jLabelautorizacion_facturaCaja = new JLabelMe();
		this.jLabelautorizacion_facturaCaja.setText(""+CajaConstantesFunciones.LABEL_AUTORIZACIONFACTURA+" : *");
		this.jLabelautorizacion_facturaCaja.setToolTipText("Autorizacion");
		this.jLabelautorizacion_facturaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelautorizacion_facturaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelautorizacion_facturaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelautorizacion_facturaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelautorizacion_facturaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelautorizacion_facturaCaja.setToolTipText(CajaConstantesFunciones.LABEL_AUTORIZACIONFACTURA);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelautorizacion_facturaCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldautorizacion_facturaCaja= new JTextFieldMe();

		jTextFieldautorizacion_facturaCaja.setEnabled(false);
		jTextFieldautorizacion_facturaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautorizacion_facturaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautorizacion_facturaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldautorizacion_facturaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonautorizacion_facturaCajaBusqueda= new JButtonMe();
		this.jButtonautorizacion_facturaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacion_facturaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacion_facturaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonautorizacion_facturaCajaBusqueda.setText("U");
		this.jButtonautorizacion_facturaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonautorizacion_facturaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonautorizacion_facturaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldautorizacion_facturaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldautorizacion_facturaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"autorizacion_facturaCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonautorizacion_facturaCajaBusqueda.setVisible(false);		}


					
		this.jLabelautorizacion_nota_ventaCaja = new JLabelMe();
		this.jLabelautorizacion_nota_ventaCaja.setText(""+CajaConstantesFunciones.LABEL_AUTORIZACIONNOTAVENTA+" : *");
		this.jLabelautorizacion_nota_ventaCaja.setToolTipText("Autorizacion ");
		this.jLabelautorizacion_nota_ventaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelautorizacion_nota_ventaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelautorizacion_nota_ventaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelautorizacion_nota_ventaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelautorizacion_nota_ventaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelautorizacion_nota_ventaCaja.setToolTipText(CajaConstantesFunciones.LABEL_AUTORIZACIONNOTAVENTA);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelautorizacion_nota_ventaCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldautorizacion_nota_ventaCaja= new JTextFieldMe();

		jTextFieldautorizacion_nota_ventaCaja.setEnabled(false);
		jTextFieldautorizacion_nota_ventaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautorizacion_nota_ventaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautorizacion_nota_ventaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldautorizacion_nota_ventaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonautorizacion_nota_ventaCajaBusqueda= new JButtonMe();
		this.jButtonautorizacion_nota_ventaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacion_nota_ventaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacion_nota_ventaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonautorizacion_nota_ventaCajaBusqueda.setText("U");
		this.jButtonautorizacion_nota_ventaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonautorizacion_nota_ventaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonautorizacion_nota_ventaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldautorizacion_nota_ventaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldautorizacion_nota_ventaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"autorizacion_nota_ventaCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonautorizacion_nota_ventaCajaBusqueda.setVisible(false);		}


					
		this.jLabelautorizacion_nota_creditoCaja = new JLabelMe();
		this.jLabelautorizacion_nota_creditoCaja.setText(""+CajaConstantesFunciones.LABEL_AUTORIZACIONNOTACREDITO+" : *");
		this.jLabelautorizacion_nota_creditoCaja.setToolTipText("Autorizacion  ");
		this.jLabelautorizacion_nota_creditoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelautorizacion_nota_creditoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelautorizacion_nota_creditoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelautorizacion_nota_creditoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelautorizacion_nota_creditoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelautorizacion_nota_creditoCaja.setToolTipText(CajaConstantesFunciones.LABEL_AUTORIZACIONNOTACREDITO);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelautorizacion_nota_creditoCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldautorizacion_nota_creditoCaja= new JTextFieldMe();

		jTextFieldautorizacion_nota_creditoCaja.setEnabled(false);
		jTextFieldautorizacion_nota_creditoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautorizacion_nota_creditoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautorizacion_nota_creditoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldautorizacion_nota_creditoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonautorizacion_nota_creditoCajaBusqueda= new JButtonMe();
		this.jButtonautorizacion_nota_creditoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacion_nota_creditoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacion_nota_creditoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonautorizacion_nota_creditoCajaBusqueda.setText("U");
		this.jButtonautorizacion_nota_creditoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonautorizacion_nota_creditoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonautorizacion_nota_creditoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldautorizacion_nota_creditoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldautorizacion_nota_creditoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"autorizacion_nota_creditoCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonautorizacion_nota_creditoCajaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_caduca_facturaCaja = new JLabelMe();
		this.jLabelfecha_caduca_facturaCaja.setText(""+CajaConstantesFunciones.LABEL_FECHACADUCAFACTURA+" : *");
		this.jLabelfecha_caduca_facturaCaja.setToolTipText("Fecha Caduca");
		this.jLabelfecha_caduca_facturaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_caduca_facturaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_caduca_facturaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_caduca_facturaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_caduca_facturaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_caduca_facturaCaja.setToolTipText(CajaConstantesFunciones.LABEL_FECHACADUCAFACTURA);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelfecha_caduca_facturaCaja.setLayout(this.gridaBagLayoutCaja);


		//jFormattedTextFieldfecha_caduca_facturaCaja= new JFormattedTextFieldMe();

		jDateChooserfecha_caduca_facturaCaja= new JDateChooser();
		jDateChooserfecha_caduca_facturaCaja.setEnabled(false);
		jDateChooserfecha_caduca_facturaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caduca_facturaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caduca_facturaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_caduca_facturaCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_caduca_facturaCaja.setDate(new Date());
		jDateChooserfecha_caduca_facturaCaja.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_caduca_facturaCaja.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_caduca_facturaCajaBusqueda= new JButtonMe();
		this.jButtonfecha_caduca_facturaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caduca_facturaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caduca_facturaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_caduca_facturaCajaBusqueda.setText("U");
		this.jButtonfecha_caduca_facturaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_caduca_facturaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_caduca_facturaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_caduca_facturaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_caduca_facturaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_caduca_facturaCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_caduca_facturaCajaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_caduca_nota_ventaCaja = new JLabelMe();
		this.jLabelfecha_caduca_nota_ventaCaja.setText(""+CajaConstantesFunciones.LABEL_FECHACADUCANOTAVENTA+" : *");
		this.jLabelfecha_caduca_nota_ventaCaja.setToolTipText("Fecha Caduca ");
		this.jLabelfecha_caduca_nota_ventaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_caduca_nota_ventaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_caduca_nota_ventaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_caduca_nota_ventaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_caduca_nota_ventaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_caduca_nota_ventaCaja.setToolTipText(CajaConstantesFunciones.LABEL_FECHACADUCANOTAVENTA);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelfecha_caduca_nota_ventaCaja.setLayout(this.gridaBagLayoutCaja);


		//jFormattedTextFieldfecha_caduca_nota_ventaCaja= new JFormattedTextFieldMe();

		jDateChooserfecha_caduca_nota_ventaCaja= new JDateChooser();
		jDateChooserfecha_caduca_nota_ventaCaja.setEnabled(false);
		jDateChooserfecha_caduca_nota_ventaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caduca_nota_ventaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caduca_nota_ventaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_caduca_nota_ventaCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_caduca_nota_ventaCaja.setDate(new Date());
		jDateChooserfecha_caduca_nota_ventaCaja.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_caduca_nota_ventaCaja.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_caduca_nota_ventaCajaBusqueda= new JButtonMe();
		this.jButtonfecha_caduca_nota_ventaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caduca_nota_ventaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caduca_nota_ventaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_caduca_nota_ventaCajaBusqueda.setText("U");
		this.jButtonfecha_caduca_nota_ventaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_caduca_nota_ventaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_caduca_nota_ventaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_caduca_nota_ventaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_caduca_nota_ventaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_caduca_nota_ventaCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_caduca_nota_ventaCajaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_caduca_nota_creditoCaja = new JLabelMe();
		this.jLabelfecha_caduca_nota_creditoCaja.setText(""+CajaConstantesFunciones.LABEL_FECHACADUCANOTACREDITO+" : *");
		this.jLabelfecha_caduca_nota_creditoCaja.setToolTipText("Fecha Caduca  ");
		this.jLabelfecha_caduca_nota_creditoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_caduca_nota_creditoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_caduca_nota_creditoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_caduca_nota_creditoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_caduca_nota_creditoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_caduca_nota_creditoCaja.setToolTipText(CajaConstantesFunciones.LABEL_FECHACADUCANOTACREDITO);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelfecha_caduca_nota_creditoCaja.setLayout(this.gridaBagLayoutCaja);


		//jFormattedTextFieldfecha_caduca_nota_creditoCaja= new JFormattedTextFieldMe();

		jDateChooserfecha_caduca_nota_creditoCaja= new JDateChooser();
		jDateChooserfecha_caduca_nota_creditoCaja.setEnabled(false);
		jDateChooserfecha_caduca_nota_creditoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caduca_nota_creditoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caduca_nota_creditoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_caduca_nota_creditoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_caduca_nota_creditoCaja.setDate(new Date());
		jDateChooserfecha_caduca_nota_creditoCaja.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_caduca_nota_creditoCaja.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_caduca_nota_creditoCajaBusqueda= new JButtonMe();
		this.jButtonfecha_caduca_nota_creditoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caduca_nota_creditoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caduca_nota_creditoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_caduca_nota_creditoCajaBusqueda.setText("U");
		this.jButtonfecha_caduca_nota_creditoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_caduca_nota_creditoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_caduca_nota_creditoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_caduca_nota_creditoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_caduca_nota_creditoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_caduca_nota_creditoCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_caduca_nota_creditoCajaBusqueda.setVisible(false);		}


					
		this.jLabelserie_facturaCaja = new JLabelMe();
		this.jLabelserie_facturaCaja.setText(""+CajaConstantesFunciones.LABEL_SERIEFACTURA+" :");
		this.jLabelserie_facturaCaja.setToolTipText("Serie");
		this.jLabelserie_facturaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserie_facturaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserie_facturaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelserie_facturaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelserie_facturaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelserie_facturaCaja.setToolTipText(CajaConstantesFunciones.LABEL_SERIEFACTURA);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelserie_facturaCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldserie_facturaCaja= new JTextFieldMe();

		jTextFieldserie_facturaCaja.setEnabled(false);
		jTextFieldserie_facturaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserie_facturaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserie_facturaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserie_facturaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonserie_facturaCajaBusqueda= new JButtonMe();
		this.jButtonserie_facturaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserie_facturaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserie_facturaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonserie_facturaCajaBusqueda.setText("U");
		this.jButtonserie_facturaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonserie_facturaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonserie_facturaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldserie_facturaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldserie_facturaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"serie_facturaCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonserie_facturaCajaBusqueda.setVisible(false);		}


					
		this.jLabelserie_nota_ventaCaja = new JLabelMe();
		this.jLabelserie_nota_ventaCaja.setText(""+CajaConstantesFunciones.LABEL_SERIENOTAVENTA+" :");
		this.jLabelserie_nota_ventaCaja.setToolTipText("Serie ");
		this.jLabelserie_nota_ventaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserie_nota_ventaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserie_nota_ventaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelserie_nota_ventaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelserie_nota_ventaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelserie_nota_ventaCaja.setToolTipText(CajaConstantesFunciones.LABEL_SERIENOTAVENTA);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelserie_nota_ventaCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldserie_nota_ventaCaja= new JTextFieldMe();

		jTextFieldserie_nota_ventaCaja.setEnabled(false);
		jTextFieldserie_nota_ventaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserie_nota_ventaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserie_nota_ventaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserie_nota_ventaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonserie_nota_ventaCajaBusqueda= new JButtonMe();
		this.jButtonserie_nota_ventaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserie_nota_ventaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserie_nota_ventaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonserie_nota_ventaCajaBusqueda.setText("U");
		this.jButtonserie_nota_ventaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonserie_nota_ventaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonserie_nota_ventaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldserie_nota_ventaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldserie_nota_ventaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"serie_nota_ventaCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonserie_nota_ventaCajaBusqueda.setVisible(false);		}


					
		this.jLabelserie_nota_creditoCaja = new JLabelMe();
		this.jLabelserie_nota_creditoCaja.setText(""+CajaConstantesFunciones.LABEL_SERIENOTACREDITO+" :");
		this.jLabelserie_nota_creditoCaja.setToolTipText("Serie  ");
		this.jLabelserie_nota_creditoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserie_nota_creditoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserie_nota_creditoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelserie_nota_creditoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelserie_nota_creditoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelserie_nota_creditoCaja.setToolTipText(CajaConstantesFunciones.LABEL_SERIENOTACREDITO);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelserie_nota_creditoCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldserie_nota_creditoCaja= new JTextFieldMe();

		jTextFieldserie_nota_creditoCaja.setEnabled(false);
		jTextFieldserie_nota_creditoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserie_nota_creditoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserie_nota_creditoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserie_nota_creditoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonserie_nota_creditoCajaBusqueda= new JButtonMe();
		this.jButtonserie_nota_creditoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserie_nota_creditoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserie_nota_creditoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonserie_nota_creditoCajaBusqueda.setText("U");
		this.jButtonserie_nota_creditoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonserie_nota_creditoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonserie_nota_creditoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldserie_nota_creditoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldserie_nota_creditoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"serie_nota_creditoCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonserie_nota_creditoCajaBusqueda.setVisible(false);		}


					
		this.jLabelsec_inicial_facturaCaja = new JLabelMe();
		this.jLabelsec_inicial_facturaCaja.setText(""+CajaConstantesFunciones.LABEL_SECINICIALFACTURA+" :");
		this.jLabelsec_inicial_facturaCaja.setToolTipText("Sec Inicial");
		this.jLabelsec_inicial_facturaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsec_inicial_facturaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsec_inicial_facturaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsec_inicial_facturaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsec_inicial_facturaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsec_inicial_facturaCaja.setToolTipText(CajaConstantesFunciones.LABEL_SECINICIALFACTURA);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelsec_inicial_facturaCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldsec_inicial_facturaCaja= new JTextFieldMe();

		jTextFieldsec_inicial_facturaCaja.setEnabled(false);
		jTextFieldsec_inicial_facturaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsec_inicial_facturaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsec_inicial_facturaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsec_inicial_facturaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsec_inicial_facturaCajaBusqueda= new JButtonMe();
		this.jButtonsec_inicial_facturaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsec_inicial_facturaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsec_inicial_facturaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsec_inicial_facturaCajaBusqueda.setText("U");
		this.jButtonsec_inicial_facturaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsec_inicial_facturaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsec_inicial_facturaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsec_inicial_facturaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsec_inicial_facturaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sec_inicial_facturaCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsec_inicial_facturaCajaBusqueda.setVisible(false);		}


					
		this.jLabelsec_inicial_nota_ventaCaja = new JLabelMe();
		this.jLabelsec_inicial_nota_ventaCaja.setText(""+CajaConstantesFunciones.LABEL_SECINICIALNOTAVENTA+" :");
		this.jLabelsec_inicial_nota_ventaCaja.setToolTipText("Sec Inicial ");
		this.jLabelsec_inicial_nota_ventaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsec_inicial_nota_ventaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsec_inicial_nota_ventaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsec_inicial_nota_ventaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsec_inicial_nota_ventaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsec_inicial_nota_ventaCaja.setToolTipText(CajaConstantesFunciones.LABEL_SECINICIALNOTAVENTA);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelsec_inicial_nota_ventaCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldsec_inicial_nota_ventaCaja= new JTextFieldMe();

		jTextFieldsec_inicial_nota_ventaCaja.setEnabled(false);
		jTextFieldsec_inicial_nota_ventaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsec_inicial_nota_ventaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsec_inicial_nota_ventaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsec_inicial_nota_ventaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsec_inicial_nota_ventaCajaBusqueda= new JButtonMe();
		this.jButtonsec_inicial_nota_ventaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsec_inicial_nota_ventaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsec_inicial_nota_ventaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsec_inicial_nota_ventaCajaBusqueda.setText("U");
		this.jButtonsec_inicial_nota_ventaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsec_inicial_nota_ventaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsec_inicial_nota_ventaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsec_inicial_nota_ventaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsec_inicial_nota_ventaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sec_inicial_nota_ventaCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsec_inicial_nota_ventaCajaBusqueda.setVisible(false);		}


					
		this.jLabelsec_inicial_nota_creditoCaja = new JLabelMe();
		this.jLabelsec_inicial_nota_creditoCaja.setText(""+CajaConstantesFunciones.LABEL_SECINICIALNOTACREDITO+" :");
		this.jLabelsec_inicial_nota_creditoCaja.setToolTipText("Sec Inicial  ");
		this.jLabelsec_inicial_nota_creditoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsec_inicial_nota_creditoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsec_inicial_nota_creditoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsec_inicial_nota_creditoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsec_inicial_nota_creditoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsec_inicial_nota_creditoCaja.setToolTipText(CajaConstantesFunciones.LABEL_SECINICIALNOTACREDITO);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelsec_inicial_nota_creditoCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldsec_inicial_nota_creditoCaja= new JTextFieldMe();

		jTextFieldsec_inicial_nota_creditoCaja.setEnabled(false);
		jTextFieldsec_inicial_nota_creditoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsec_inicial_nota_creditoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsec_inicial_nota_creditoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsec_inicial_nota_creditoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsec_inicial_nota_creditoCajaBusqueda= new JButtonMe();
		this.jButtonsec_inicial_nota_creditoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsec_inicial_nota_creditoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsec_inicial_nota_creditoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsec_inicial_nota_creditoCajaBusqueda.setText("U");
		this.jButtonsec_inicial_nota_creditoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsec_inicial_nota_creditoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsec_inicial_nota_creditoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsec_inicial_nota_creditoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsec_inicial_nota_creditoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sec_inicial_nota_creditoCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsec_inicial_nota_creditoCajaBusqueda.setVisible(false);		}


					
		this.jLabelsec_final_facturaCaja = new JLabelMe();
		this.jLabelsec_final_facturaCaja.setText(""+CajaConstantesFunciones.LABEL_SECFINALFACTURA+" :");
		this.jLabelsec_final_facturaCaja.setToolTipText("Sec Final");
		this.jLabelsec_final_facturaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsec_final_facturaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsec_final_facturaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsec_final_facturaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsec_final_facturaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsec_final_facturaCaja.setToolTipText(CajaConstantesFunciones.LABEL_SECFINALFACTURA);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelsec_final_facturaCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldsec_final_facturaCaja= new JTextFieldMe();

		jTextFieldsec_final_facturaCaja.setEnabled(false);
		jTextFieldsec_final_facturaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsec_final_facturaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsec_final_facturaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsec_final_facturaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsec_final_facturaCajaBusqueda= new JButtonMe();
		this.jButtonsec_final_facturaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsec_final_facturaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsec_final_facturaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsec_final_facturaCajaBusqueda.setText("U");
		this.jButtonsec_final_facturaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsec_final_facturaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsec_final_facturaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsec_final_facturaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsec_final_facturaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sec_final_facturaCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsec_final_facturaCajaBusqueda.setVisible(false);		}


					
		this.jLabelsec_final_nota_ventaCaja = new JLabelMe();
		this.jLabelsec_final_nota_ventaCaja.setText(""+CajaConstantesFunciones.LABEL_SECFINALNOTAVENTA+" :");
		this.jLabelsec_final_nota_ventaCaja.setToolTipText("Sec Final ");
		this.jLabelsec_final_nota_ventaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsec_final_nota_ventaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsec_final_nota_ventaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsec_final_nota_ventaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsec_final_nota_ventaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsec_final_nota_ventaCaja.setToolTipText(CajaConstantesFunciones.LABEL_SECFINALNOTAVENTA);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelsec_final_nota_ventaCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldsec_final_nota_ventaCaja= new JTextFieldMe();

		jTextFieldsec_final_nota_ventaCaja.setEnabled(false);
		jTextFieldsec_final_nota_ventaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsec_final_nota_ventaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsec_final_nota_ventaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsec_final_nota_ventaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsec_final_nota_ventaCajaBusqueda= new JButtonMe();
		this.jButtonsec_final_nota_ventaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsec_final_nota_ventaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsec_final_nota_ventaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsec_final_nota_ventaCajaBusqueda.setText("U");
		this.jButtonsec_final_nota_ventaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsec_final_nota_ventaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsec_final_nota_ventaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsec_final_nota_ventaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsec_final_nota_ventaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sec_final_nota_ventaCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsec_final_nota_ventaCajaBusqueda.setVisible(false);		}


					
		this.jLabelsec_final_nota_creditoCaja = new JLabelMe();
		this.jLabelsec_final_nota_creditoCaja.setText(""+CajaConstantesFunciones.LABEL_SECFINALNOTACREDITO+" :");
		this.jLabelsec_final_nota_creditoCaja.setToolTipText("Sec Final  ");
		this.jLabelsec_final_nota_creditoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsec_final_nota_creditoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsec_final_nota_creditoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsec_final_nota_creditoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsec_final_nota_creditoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsec_final_nota_creditoCaja.setToolTipText(CajaConstantesFunciones.LABEL_SECFINALNOTACREDITO);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelsec_final_nota_creditoCaja.setLayout(this.gridaBagLayoutCaja);


		jTextFieldsec_final_nota_creditoCaja= new JTextFieldMe();

		jTextFieldsec_final_nota_creditoCaja.setEnabled(false);
		jTextFieldsec_final_nota_creditoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsec_final_nota_creditoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsec_final_nota_creditoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsec_final_nota_creditoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsec_final_nota_creditoCajaBusqueda= new JButtonMe();
		this.jButtonsec_final_nota_creditoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsec_final_nota_creditoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsec_final_nota_creditoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsec_final_nota_creditoCajaBusqueda.setText("U");
		this.jButtonsec_final_nota_creditoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsec_final_nota_creditoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsec_final_nota_creditoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsec_final_nota_creditoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsec_final_nota_creditoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sec_final_nota_creditoCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsec_final_nota_creditoCajaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCaja = new JLabelMe();
		this.jLabelid_empresaCaja.setText(""+CajaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCaja.setToolTipText("Empresa");
		this.jLabelid_empresaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCaja.setToolTipText(CajaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelid_empresaCaja.setLayout(this.gridaBagLayoutCaja);


		jComboBoxid_empresaCaja= new JComboBoxMe();
		jComboBoxid_empresaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCaja.setEnabled(false);

		this.jButtonid_empresaCaja= new JButtonMe();
		this.jButtonid_empresaCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCaja.setText("Buscar");
		this.jButtonid_empresaCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCaja"));

		this.jButtonid_empresaCajaBusqueda= new JButtonMe();
		this.jButtonid_empresaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajaBusqueda.setText("U");
		this.jButtonid_empresaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCajaBusqueda.setVisible(false);		}

		this.jButtonid_empresaCajaUpdate= new JButtonMe();
		this.jButtonid_empresaCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajaUpdate.setText("U");
		this.jButtonid_empresaCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaUpdate"));



					
		this.jLabelid_sucursalCaja = new JLabelMe();
		this.jLabelid_sucursalCaja.setText(""+CajaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCaja.setToolTipText("Sucursal");
		this.jLabelid_sucursalCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCaja.setToolTipText(CajaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelid_sucursalCaja.setLayout(this.gridaBagLayoutCaja);


		jComboBoxid_sucursalCaja= new JComboBoxMe();
		jComboBoxid_sucursalCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCaja.setEnabled(false);

		this.jButtonid_sucursalCaja= new JButtonMe();
		this.jButtonid_sucursalCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCaja.setText("Buscar");
		this.jButtonid_sucursalCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCaja"));

		this.jButtonid_sucursalCajaBusqueda= new JButtonMe();
		this.jButtonid_sucursalCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCajaBusqueda.setText("U");
		this.jButtonid_sucursalCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCajaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCajaUpdate= new JButtonMe();
		this.jButtonid_sucursalCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCajaUpdate.setText("U");
		this.jButtonid_sucursalCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajaUpdate"));



					
		this.jLabelid_paisCaja = new JLabelMe();
		this.jLabelid_paisCaja.setText(""+CajaConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisCaja.setToolTipText("Pais");
		this.jLabelid_paisCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisCaja.setToolTipText(CajaConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelid_paisCaja.setLayout(this.gridaBagLayoutCaja);


		jComboBoxid_paisCaja= new JComboBoxMe();
		jComboBoxid_paisCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisCaja= new JButtonMe();
		this.jButtonid_paisCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCaja.setText("Buscar");
		this.jButtonid_paisCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisCaja"));

		this.jButtonid_paisCajaBusqueda= new JButtonMe();
		this.jButtonid_paisCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisCajaBusqueda.setText("U");
		this.jButtonid_paisCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisCajaBusqueda.setVisible(false);		}

		this.jButtonid_paisCajaUpdate= new JButtonMe();
		this.jButtonid_paisCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisCajaUpdate.setText("U");
		this.jButtonid_paisCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisCajaUpdate"));



					
		this.jLabelid_ciudadCaja = new JLabelMe();
		this.jLabelid_ciudadCaja.setText(""+CajaConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadCaja.setToolTipText("Ciudad");
		this.jLabelid_ciudadCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadCaja.setToolTipText(CajaConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelid_ciudadCaja.setLayout(this.gridaBagLayoutCaja);


		jComboBoxid_ciudadCaja= new JComboBoxMe();
		jComboBoxid_ciudadCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadCaja= new JButtonMe();
		this.jButtonid_ciudadCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadCaja.setText("Buscar");
		this.jButtonid_ciudadCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadCaja"));

		this.jButtonid_ciudadCajaBusqueda= new JButtonMe();
		this.jButtonid_ciudadCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadCajaBusqueda.setText("U");
		this.jButtonid_ciudadCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadCajaBusqueda.setVisible(false);		}

		this.jButtonid_ciudadCajaUpdate= new JButtonMe();
		this.jButtonid_ciudadCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadCajaUpdate.setText("U");
		this.jButtonid_ciudadCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadCajaUpdate"));



					
		this.jLabelid_zonaCaja = new JLabelMe();
		this.jLabelid_zonaCaja.setText(""+CajaConstantesFunciones.LABEL_IDZONA+" : *");
		this.jLabelid_zonaCaja.setToolTipText("Zona");
		this.jLabelid_zonaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_zonaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_zonaCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_zonaCaja.setToolTipText(CajaConstantesFunciones.LABEL_IDZONA);
		this.gridaBagLayoutCaja = new GridBagLayout();
		this.jPanelid_zonaCaja.setLayout(this.gridaBagLayoutCaja);


		jComboBoxid_zonaCaja= new JComboBoxMe();
		jComboBoxid_zonaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_zonaCaja= new JButtonMe();
		this.jButtonid_zonaCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaCaja.setText("Buscar");
		this.jButtonid_zonaCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_zonaCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_zonaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaCaja"));

		this.jButtonid_zonaCajaBusqueda= new JButtonMe();
		this.jButtonid_zonaCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaCajaBusqueda.setText("U");
		this.jButtonid_zonaCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_zonaCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_zonaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaCajaBusqueda"));

		if(this.cajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_zonaCajaBusqueda.setVisible(false);		}

		this.jButtonid_zonaCajaUpdate= new JButtonMe();
		this.jButtonid_zonaCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaCajaUpdate.setText("U");
		this.jButtonid_zonaCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_zonaCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_zonaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaCajaUpdate"));



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
		//this.jInternalFrameDetalleCaja = new CajaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Caja DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCaja= new GridBagLayout();
		

		
		String sToolTipCaja="";
		sToolTipCaja=CajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCaja+="(PuntoVenta.Caja)";
		}
		
		if(!this.cajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipCaja+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCaja = new JButtonMe();
		this.jButtonModificarCaja = new JButtonMe();
        this.jButtonActualizarCaja = new JButtonMe();
        this.jButtonEliminarCaja = new JButtonMe();
        this.jButtonCancelarCaja = new JButtonMe();
        this.jButtonGuardarCambiosCaja = new JButtonMe();
		this.jButtonGuardarCambiosTablaCaja = new JButtonMe();
		this.jButtonCerrarCaja = new JButtonMe();
		
		this.jScrollPanelDatosCaja = new JScrollPane();   
        this.jScrollPanelDatosEdicionCaja = new JScrollPane();
		this.jScrollPanelDatosGeneralCaja = new JScrollPane();
				
		
		
		this.jPanelCamposCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposCaja=new JTabbedPane();
		
		
		this.jTabbedPaneCamposCaja.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocajaCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioclienteCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Caja";
		
		if(!this.cajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCaja.setName("jPanelCamposCaja"); 

		this.jPanelCamposOcultosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCaja.setName("jPanelCamposOcultosCaja"); 

        this.jPanelAccionesCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCaja.setToolTipText("Acciones");
        this.jPanelAccionesCaja.setName("Acciones"); 

		this.jPanelAccionesFormularioCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCaja.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCaja.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralCaja.setName("jPanelCamposFingeneralCaja");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralCaja, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocajaCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Caja"));
		this.jPanelCamposIniciocajaCaja.setName("jPanelCamposFincajaCaja");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocajaCaja, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioclienteCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
		this.jPanelCamposInicioclienteCaja.setName("jPanelCamposFinclienteCaja");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioclienteCaja, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCaja.setText("Nuevo");
		this.jButtonModificarCaja.setText("Editar");
        this.jButtonActualizarCaja.setText("Actualizar");
        this.jButtonEliminarCaja.setText("Eliminar");
        this.jButtonCancelarCaja.setText("Cancelar");
        this.jButtonGuardarCambiosCaja.setText("Guardar");
		this.jButtonGuardarCambiosTablaCaja.setText("Guardar");
		this.jButtonCerrarCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCaja,"nuevo_button","Nuevo",this.cajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCaja,"modificar_button","Editar",this.cajaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCaja,"actualizar_button","Actualizar",this.cajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCaja,"eliminar_button","Eliminar",this.cajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCaja,"cancelar_button","Cancelar",this.cajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCaja,"guardarcambios_button","Guardar",this.cajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCaja,"guardarcambiostabla_button","Guardar",this.cajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCaja,"cerrar_button","Salir",this.cajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCaja.setToolTipText("Nuevo"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCaja.setToolTipText("Editar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCaja.setToolTipText("Actualizar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCaja.setToolTipText("Eliminar)"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCaja.setToolTipText("Cancelar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCaja.setToolTipText("Guardar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCaja.setToolTipText("Guardar"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCaja.setToolTipText("Salir"+" "+CajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCaja";
		inputMap = this.jButtonNuevoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCaja"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCaja";
		inputMap = this.jButtonActualizarCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCaja"));
		
		//ELIMINAR
		sMapKey = "EliminarCaja";
		inputMap = this.jButtonEliminarCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCaja"));
		
		//CANCELAR	
		sMapKey = "CancelarCaja";
		inputMap = this.jButtonCancelarCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCaja"));
		
		//CERRAR		
		sMapKey = "CerrarCaja";
		inputMap = this.jButtonCerrarCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCaja";
		inputMap = this.jButtonGuardarCambiosTablaCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCaja"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCaja.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCaja.setToolTipText("Nuevo Caja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCaja.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCaja.setToolTipText("Sin Cerrar Ventana Caja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCaja.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCaja.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCaja, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCaja.setText("Accion");
		this.jComboBoxTiposAccionesCaja.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCaja.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCaja.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCaja = new JLabelMe();
		
		this.jLabelAccionesCaja.setText("Acciones");		
		this.jLabelAccionesCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCaja();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCaja();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCaja=new JTabbedPane();
		this.jTabbedPaneRelacionesCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCaja.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCaja, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCaja = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCaja = new GridBagLayout();
		
		this.jPanelCamposCaja.setLayout(gridaBagLayoutCamposCaja);
		this.jPanelCamposOcultosCaja.setLayout(gridaBagLayoutCamposOcultosCaja);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralCaja= new GridBagLayout();
		this.jPanelCamposIniciogeneralCaja.setLayout(gridaBagLayoutCamposIniciogeneralCaja);

		GridBagLayout gridaBagLayoutCamposIniciocajaCaja= new GridBagLayout();
		this.jPanelCamposIniciocajaCaja.setLayout(gridaBagLayoutCamposIniciocajaCaja);

		GridBagLayout gridaBagLayoutCamposInicioclienteCaja= new GridBagLayout();
		this.jPanelCamposInicioclienteCaja.setLayout(gridaBagLayoutCamposInicioclienteCaja);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCaja.add(jLabelIdCaja, this.gridBagConstraintsCaja);



	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCaja.add(jLabelidCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCaja.add(jLabelid_empresaCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCaja.add(jButtonid_empresaCajaBusqueda, this.gridBagConstraintsCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 3;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCaja.add(jButtonid_empresaCajaUpdate, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCaja.add(jComboBoxid_empresaCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCaja.add(jLabelid_sucursalCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCaja.add(jButtonid_sucursalCajaBusqueda, this.gridBagConstraintsCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 3;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCaja.add(jButtonid_sucursalCajaUpdate, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCaja.add(jComboBoxid_sucursalCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCaja.add(jLabelnombreCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCaja.add(jButtonnombreCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCaja.add(jscrollPanenombreCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_equipoCaja.add(jLabelnombre_equipoCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_equipoCaja.add(jButtonnombre_equipoCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_equipoCaja.add(jscrollPanenombre_equipoCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_impresoraCaja.add(jLabelnombre_impresoraCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_impresoraCaja.add(jButtonnombre_impresoraCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_impresoraCaja.add(jscrollPanenombre_impresoraCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencial_pedidoCaja.add(jLabelsecuencial_pedidoCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencial_pedidoCaja.add(jButtonsecuencial_pedidoCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencial_pedidoCaja.add(jTextFieldsecuencial_pedidoCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencial_pedido_formatoCaja.add(jLabelsecuencial_pedido_formatoCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencial_pedido_formatoCaja.add(jButtonsecuencial_pedido_formatoCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencial_pedido_formatoCaja.add(jTextFieldsecuencial_pedido_formatoCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpunto_emisionCaja.add(jLabelpunto_emisionCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelpunto_emisionCaja.add(jButtonpunto_emisionCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpunto_emisionCaja.add(jTextFieldpunto_emisionCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestablecimientoCaja.add(jLabelestablecimientoCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelestablecimientoCaja.add(jButtonestablecimientoCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestablecimientoCaja.add(jTextFieldestablecimientoCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioCaja.add(jLabelfecha_inicioCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioCaja.add(jButtonfecha_inicioCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioCaja.add(jDateChooserfecha_inicioCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finalCaja.add(jLabelfecha_finalCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finalCaja.add(jButtonfecha_finalCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finalCaja.add(jDateChooserfecha_finalCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoCaja.add(jLabelesta_activoCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoCaja.add(jButtonesta_activoCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoCaja.add(jCheckBoxesta_activoCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionCaja.add(jLabeldescripcionCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionCaja.add(jButtondescripcionCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionCaja.add(jscrollPanedescripcionCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencial_facturaCaja.add(jLabelsecuencial_facturaCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencial_facturaCaja.add(jButtonsecuencial_facturaCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencial_facturaCaja.add(jTextFieldsecuencial_facturaCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencial_factura_formatoCaja.add(jLabelsecuencial_factura_formatoCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencial_factura_formatoCaja.add(jButtonsecuencial_factura_formatoCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencial_factura_formatoCaja.add(jTextFieldsecuencial_factura_formatoCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencial_nota_ventaCaja.add(jLabelsecuencial_nota_ventaCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencial_nota_ventaCaja.add(jButtonsecuencial_nota_ventaCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencial_nota_ventaCaja.add(jTextFieldsecuencial_nota_ventaCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencial_nota_venta_formatoCaja.add(jLabelsecuencial_nota_venta_formatoCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencial_nota_venta_formatoCaja.add(jButtonsecuencial_nota_venta_formatoCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencial_nota_venta_formatoCaja.add(jTextFieldsecuencial_nota_venta_formatoCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencia_nota_creditoCaja.add(jLabelsecuencia_nota_creditoCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencia_nota_creditoCaja.add(jButtonsecuencia_nota_creditoCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencia_nota_creditoCaja.add(jTextFieldsecuencia_nota_creditoCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencia_nota_credito_formatoCaja.add(jLabelsecuencia_nota_credito_formatoCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencia_nota_credito_formatoCaja.add(jButtonsecuencia_nota_credito_formatoCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencia_nota_credito_formatoCaja.add(jTextFieldsecuencia_nota_credito_formatoCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelautorizacion_facturaCaja.add(jLabelautorizacion_facturaCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelautorizacion_facturaCaja.add(jButtonautorizacion_facturaCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelautorizacion_facturaCaja.add(jTextFieldautorizacion_facturaCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelautorizacion_nota_ventaCaja.add(jLabelautorizacion_nota_ventaCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelautorizacion_nota_ventaCaja.add(jButtonautorizacion_nota_ventaCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelautorizacion_nota_ventaCaja.add(jTextFieldautorizacion_nota_ventaCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelautorizacion_nota_creditoCaja.add(jLabelautorizacion_nota_creditoCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelautorizacion_nota_creditoCaja.add(jButtonautorizacion_nota_creditoCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelautorizacion_nota_creditoCaja.add(jTextFieldautorizacion_nota_creditoCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_caduca_facturaCaja.add(jLabelfecha_caduca_facturaCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_caduca_facturaCaja.add(jButtonfecha_caduca_facturaCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_caduca_facturaCaja.add(jDateChooserfecha_caduca_facturaCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_caduca_nota_ventaCaja.add(jLabelfecha_caduca_nota_ventaCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_caduca_nota_ventaCaja.add(jButtonfecha_caduca_nota_ventaCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_caduca_nota_ventaCaja.add(jDateChooserfecha_caduca_nota_ventaCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_caduca_nota_creditoCaja.add(jLabelfecha_caduca_nota_creditoCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_caduca_nota_creditoCaja.add(jButtonfecha_caduca_nota_creditoCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_caduca_nota_creditoCaja.add(jDateChooserfecha_caduca_nota_creditoCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelserie_facturaCaja.add(jLabelserie_facturaCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelserie_facturaCaja.add(jButtonserie_facturaCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelserie_facturaCaja.add(jTextFieldserie_facturaCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelserie_nota_ventaCaja.add(jLabelserie_nota_ventaCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelserie_nota_ventaCaja.add(jButtonserie_nota_ventaCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelserie_nota_ventaCaja.add(jTextFieldserie_nota_ventaCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelserie_nota_creditoCaja.add(jLabelserie_nota_creditoCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelserie_nota_creditoCaja.add(jButtonserie_nota_creditoCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelserie_nota_creditoCaja.add(jTextFieldserie_nota_creditoCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsec_inicial_facturaCaja.add(jLabelsec_inicial_facturaCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsec_inicial_facturaCaja.add(jButtonsec_inicial_facturaCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsec_inicial_facturaCaja.add(jTextFieldsec_inicial_facturaCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsec_inicial_nota_ventaCaja.add(jLabelsec_inicial_nota_ventaCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsec_inicial_nota_ventaCaja.add(jButtonsec_inicial_nota_ventaCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsec_inicial_nota_ventaCaja.add(jTextFieldsec_inicial_nota_ventaCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsec_inicial_nota_creditoCaja.add(jLabelsec_inicial_nota_creditoCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsec_inicial_nota_creditoCaja.add(jButtonsec_inicial_nota_creditoCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsec_inicial_nota_creditoCaja.add(jTextFieldsec_inicial_nota_creditoCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsec_final_facturaCaja.add(jLabelsec_final_facturaCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsec_final_facturaCaja.add(jButtonsec_final_facturaCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsec_final_facturaCaja.add(jTextFieldsec_final_facturaCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsec_final_nota_ventaCaja.add(jLabelsec_final_nota_ventaCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsec_final_nota_ventaCaja.add(jButtonsec_final_nota_ventaCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsec_final_nota_ventaCaja.add(jTextFieldsec_final_nota_ventaCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsec_final_nota_creditoCaja.add(jLabelsec_final_nota_creditoCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsec_final_nota_creditoCaja.add(jButtonsec_final_nota_creditoCajaBusqueda, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsec_final_nota_creditoCaja.add(jTextFieldsec_final_nota_creditoCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisCaja.add(jLabelid_paisCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisCaja.add(jButtonid_paisCajaBusqueda, this.gridBagConstraintsCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 3;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisCaja.add(jButtonid_paisCajaUpdate, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisCaja.add(jComboBoxid_paisCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadCaja.add(jLabelid_ciudadCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadCaja.add(jButtonid_ciudadCajaBusqueda, this.gridBagConstraintsCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 3;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadCaja.add(jButtonid_ciudadCajaUpdate, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadCaja.add(jComboBoxid_ciudadCaja, this.gridBagConstraintsCaja);


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 0;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_zonaCaja.add(jLabelid_zonaCaja, this.gridBagConstraintsCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 2;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaCaja.add(jButtonid_zonaCajaBusqueda, this.gridBagConstraintsCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCaja = new GridBagConstraints();
		//this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = 3;
		this.gridBagConstraintsCaja.ipadx = 0;
		this.gridBagConstraintsCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaCaja.add(jButtonid_zonaCajaUpdate, this.gridBagConstraintsCaja);
	}

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCaja.gridy = 0;
	this.gridBagConstraintsCaja.gridx = 1;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_zonaCaja.add(jComboBoxid_zonaCaja, this.gridBagConstraintsCaja);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposOcultosCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposOcultosCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCaja.add(this.jPanelid_empresaCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposOcultosCaja % 2==0) {
		iXPanelCamposOcultosCaja=0;
		iYPanelCamposOcultosCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposOcultosCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposOcultosCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCaja.add(this.jPanelid_sucursalCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposOcultosCaja % 2==0) {
		iXPanelCamposOcultosCaja=0;
		iYPanelCamposOcultosCaja++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciogeneralCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciogeneralCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCaja.add(this.jPanelidCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciogeneralCaja % 2==0) {
		iXPanelCamposIniciogeneralCaja=0;
		iYPanelCamposIniciogeneralCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciogeneralCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciogeneralCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCaja.add(this.jPanelnombreCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciogeneralCaja % 2==0) {
		iXPanelCamposIniciogeneralCaja=0;
		iYPanelCamposIniciogeneralCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciogeneralCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciogeneralCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCaja.add(this.jPanelnombre_equipoCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciogeneralCaja % 2==0) {
		iXPanelCamposIniciogeneralCaja=0;
		iYPanelCamposIniciogeneralCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciogeneralCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciogeneralCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCaja.add(this.jPanelnombre_impresoraCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciogeneralCaja % 2==0) {
		iXPanelCamposIniciogeneralCaja=0;
		iYPanelCamposIniciogeneralCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciogeneralCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciogeneralCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCaja.add(this.jPanelsecuencial_pedidoCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciogeneralCaja % 2==0) {
		iXPanelCamposIniciogeneralCaja=0;
		iYPanelCamposIniciogeneralCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciogeneralCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciogeneralCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCaja.add(this.jPanelsecuencial_pedido_formatoCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciogeneralCaja % 2==0) {
		iXPanelCamposIniciogeneralCaja=0;
		iYPanelCamposIniciogeneralCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciogeneralCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciogeneralCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCaja.add(this.jPanelpunto_emisionCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciogeneralCaja % 2==0) {
		iXPanelCamposIniciogeneralCaja=0;
		iYPanelCamposIniciogeneralCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciogeneralCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciogeneralCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCaja.add(this.jPanelestablecimientoCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciogeneralCaja % 2==0) {
		iXPanelCamposIniciogeneralCaja=0;
		iYPanelCamposIniciogeneralCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciogeneralCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciogeneralCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCaja.add(this.jPanelfecha_inicioCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciogeneralCaja % 2==0) {
		iXPanelCamposIniciogeneralCaja=0;
		iYPanelCamposIniciogeneralCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciogeneralCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciogeneralCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCaja.add(this.jPanelfecha_finalCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciogeneralCaja % 2==0) {
		iXPanelCamposIniciogeneralCaja=0;
		iYPanelCamposIniciogeneralCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciogeneralCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciogeneralCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCaja.add(this.jPanelesta_activoCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciogeneralCaja % 2==0) {
		iXPanelCamposIniciogeneralCaja=0;
		iYPanelCamposIniciogeneralCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciogeneralCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciogeneralCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCaja.add(this.jPaneldescripcionCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciogeneralCaja % 2==0) {
		iXPanelCamposIniciogeneralCaja=0;
		iYPanelCamposIniciogeneralCaja++;
	}

	iXPanelCamposIniciocajaCaja=0;
	iYPanelCamposIniciocajaCaja++;


	if(!iXPanelCamposIniciocajaCaja.equals(0)) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}

	JLabelMe jLabelTitulosecuencial_facturaCaja = new JLabelMe();
	jLabelTitulosecuencial_facturaCaja.setText("                           [Factura]                      -                                        [Nota Venta]                        -                                          [Nota Credito]");
	jLabelTitulosecuencial_facturaCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,400),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulosecuencial_facturaCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,400),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulosecuencial_facturaCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,400),Constantes.ISWING_ALTO_CONTROL));

	FuncionesSwing.setFormatoLabelTituloGrupo(jLabelTitulosecuencial_facturaCaja);

	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	this.gridBagConstraintsCaja.gridwidth = 3;
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(jLabelTitulosecuencial_facturaCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}

	if(!iXPanelCamposIniciocajaCaja.equals(0)) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}


	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelsecuencial_facturaCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelsecuencial_factura_formatoCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelsecuencial_nota_ventaCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelsecuencial_nota_venta_formatoCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelsecuencia_nota_creditoCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelsecuencia_nota_credito_formatoCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelautorizacion_facturaCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelautorizacion_nota_ventaCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelautorizacion_nota_creditoCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelfecha_caduca_facturaCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelfecha_caduca_nota_ventaCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelfecha_caduca_nota_creditoCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelserie_facturaCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelserie_nota_ventaCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelserie_nota_creditoCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelsec_inicial_facturaCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelsec_inicial_nota_ventaCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelsec_inicial_nota_creditoCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelsec_final_facturaCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelsec_final_nota_ventaCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposIniciocajaCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposIniciocajaCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocajaCaja.add(this.jPanelsec_final_nota_creditoCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposIniciocajaCaja % 3==0) {
		iXPanelCamposIniciocajaCaja=0;
		iYPanelCamposIniciocajaCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposInicioclienteCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposInicioclienteCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioclienteCaja.add(this.jPanelid_paisCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposInicioclienteCaja % 1==0) {
		iXPanelCamposInicioclienteCaja=0;
		iYPanelCamposInicioclienteCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposInicioclienteCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposInicioclienteCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioclienteCaja.add(this.jPanelid_ciudadCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposInicioclienteCaja % 1==0) {
		iXPanelCamposInicioclienteCaja=0;
		iYPanelCamposInicioclienteCaja++;
	}
	this.gridBagConstraintsCaja = new GridBagConstraints();
	this.gridBagConstraintsCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCaja.gridy = iYPanelCamposInicioclienteCaja;
	this.gridBagConstraintsCaja.gridx = iXPanelCamposInicioclienteCaja++;
	this.gridBagConstraintsCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioclienteCaja.add(this.jPanelid_zonaCaja, this.gridBagConstraintsCaja);



	if(iXPanelCamposInicioclienteCaja % 1==0) {
		iXPanelCamposInicioclienteCaja=0;
		iYPanelCamposInicioclienteCaja++;
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
			
		GridBagLayout gridaBagLayoutAccionesCaja= new GridBagLayout();
		this.jPanelAccionesCaja.setLayout(gridaBagLayoutAccionesCaja);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCaja= new GridBagLayout();
		this.jPanelAccionesFormularioCaja.setLayout(gridaBagLayoutAccionesFormularioCaja);
		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCaja.add(this.jComboBoxTiposAccionesFormularioCaja, this.gridBagConstraintsCaja);

		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCaja.add(this.jCheckBoxPostAccionNuevoCaja, this.gridBagConstraintsCaja);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cajaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCaja.add(this.jCheckBoxPostAccionSinCerrarCaja, this.gridBagConstraintsCaja);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cajaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cajaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCaja.add(this.jCheckBoxPostAccionSinMensajeCaja, this.gridBagConstraintsCaja);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx = iPosXAccion++;
			
		this.jPanelAccionesCaja.add(this.jButtonModificarCaja, this.gridBagConstraintsCaja);							

		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCaja.gridy = 0;
		this.gridBagConstraintsCaja.gridx =iPosXAccion++;
			
		this.jPanelAccionesCaja.add(this.jButtonEliminarCaja, this.gridBagConstraintsCaja);
		
			
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy = 0;		
		this.gridBagConstraintsCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesCaja.add(this.jButtonActualizarCaja, this.gridBagConstraintsCaja);


		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy = 0;		
		this.gridBagConstraintsCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesCaja.add(this.jButtonGuardarCambiosCaja, this.gridBagConstraintsCaja);	
		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy = 0;		
		this.gridBagConstraintsCaja.gridx =iPosXAccion++;
		
		this.jPanelAccionesCaja.add(this.jButtonCancelarCaja, this.gridBagConstraintsCaja);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCaja);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCaja = new GridBagConstraints();						
			this.gridBagConstraintsCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCaja.gridx = 0;		
			//this.gridBagConstraintsCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCaja.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCaja.gridx =0;
		this.gridBagConstraintsCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCaja, this.gridBagConstraintsCaja);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CajaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCaja = new CajaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Caja DATOS");
			
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
			
	        //this.setTitle("[FOR] - Caja DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Caja Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CajaModel cajaModel=new CajaModel(this);
			
			//SI USARA CLASE INTERNA
			//CajaModel.CajaFocusTraversalPolicy cajaFocusTraversalPolicy = cajaModel.new CajaFocusTraversalPolicy(this);
			
			//cajaFocusTraversalPolicy.setcajaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cajaModel);
			
			
			this.jContentPaneDetalleCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCaja = new GridBagLayout();	
			this.jContentPaneDetalleCaja.setLayout(gridaBagLayoutDetalleCaja);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCaja = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCaja = new GridBagConstraints();
				this.gridBagConstraintsCaja.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCaja.gridx = 0;
					
				
				this.jContentPaneDetalleCaja.add(jTtoolBarDetalleCaja, gridBagConstraintsCaja);								
				
}
			
			this.jScrollPanelDatosEdicionCaja=   new JScrollPane(jContentPaneDetalleCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposCaja.add("General",this.jPanelCamposIniciogeneralCaja);
		this.jTabbedPaneCamposCaja.add("Caja",this.jPanelCamposIniciocajaCaja);
		this.jTabbedPaneCamposCaja.add("Cliente",this.jPanelCamposInicioclienteCaja);
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
						
			this.gridBagConstraintsCaja.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCaja.gridx = 0;
	        
			this.jContentPaneDetalleCaja.add(jTabbedPaneCamposCaja, gridBagConstraintsCaja);
			
			
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
						&& cajaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCajaCierre(this.puedeCargarPorParteCajaCierre,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCajaEgreso(this.puedeCargarPorParteCajaEgreso,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCajaIngreso(this.puedeCargarPorParteCajaIngreso,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCajeroTurno(this.puedeCargarPorParteCajeroTurno,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFacturaPuntoVenta(this.puedeCargarPorParteFacturaPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(this.puedeCargarPorParteNotaCreditoPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoPuntoVenta(this.puedeCargarPorPartePedidoPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoVentasPunVen(this.puedeCargarPorPartePresupuestoVentasPunVen,false,-1);
					
					if(this.cajaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCaja= new GridBagConstraints();
						this.gridBagConstraintsCaja.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCaja.gridx = 0;
						this.jContentPaneDetalleCaja.add(this.jTabbedPaneRelacionesCaja, this.gridBagConstraintsCaja);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCaja.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCajaCierre(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCajaEgreso(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCajaIngreso(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCajeroTurno(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFacturaPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoVentasPunVen(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCaja.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCaja = new GridBagConstraints();
					this.gridBagConstraintsCaja.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCaja.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCaja.gridx = 0;
					
				
					this.jContentPaneDetalleCaja.add(jPanelCamposOcultosCaja, gridBagConstraintsCaja);
				
					this.jPanelCamposOcultosCaja.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.gridy = iGridyRelaciones++;//25;		
	        this.gridBagConstraintsCaja.gridx = 0;
	        this.gridBagConstraintsCaja.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCaja.add(this.jPanelAccionesFormularioCaja, this.gridBagConstraintsCaja);							
			
			
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
	        this.gridBagConstraintsCaja.gridy = iGridyRelaciones;//25;		
	        this.gridBagConstraintsCaja.gridx = 0;
	        
			
			this.jContentPaneDetalleCaja.add(this.jPanelAccionesCaja, this.gridBagConstraintsCaja);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCaja);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCaja=   new JScrollPane(this.jPanelCamposCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCaja.gridx = 0;
			this.gridBagConstraintsCaja.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCaja.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCaja.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCaja, this.gridBagConstraintsCaja);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCaja, this.gridBagConstraintsCaja);			
			
			this.gridBagConstraintsCaja = new GridBagConstraints();
			this.gridBagConstraintsCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCaja, this.gridBagConstraintsCaja);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCaja, this.gridBagConstraintsCaja);
			
			
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCaja, this.gridBagConstraintsCaja);
		
			
		this.gridBagConstraintsCaja = new GridBagConstraints();
		this.gridBagConstraintsCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCaja, this.gridBagConstraintsCaja);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCaja;//jContentPane;
		
		return jScrollPanelDatosEdicionCaja;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCajaCierre(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cajacierreSessionBean=new CajaCierreSessionBean();
		this.cajacierreSessionBean.setConGuardarRelaciones(false);
		this.cajacierreSessionBean.setEsGuardarRelacionado(true);

		this.cajacierreBeanSwingJInternalFrame=null;//new CajaCierreBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cajacierreBeanSwingJInternalFramePopup=new CajaCierreBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cajacierreBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cajacierreSessionBean.getEsGuardarRelacionado()) {

				CajaCierreJInternalFrame.STIPO_TAMANIO_GENERAL=CajaJInternalFrame.STIPO_TAMANIO_GENERAL;
				CajaCierreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CajaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cajacierreSessionBean.setEsGuardarRelacionado(true);

				this.cajacierreBeanSwingJInternalFrame=new CajaCierreBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cajacierreBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cajacierreBeanSwingJInternalFrame.setcajacierreSessionBean(this.cajacierreSessionBean);

				//this.gridBagConstraintsCaja = new GridBagConstraints();
				//this.gridBagConstraintsCaja.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCaja.gridx = 0;
				//this.jContentPaneDetalleCaja.add(this.cajacierreBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCaja);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCaja.add("Caja Cierres",this.cajacierreBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCaja.setComponentAt(iIndexTab,this.cajacierreBeanSwingJInternalFrame.getContentPane());
				}

				//CajaCierreJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cajacierreSessionBean.setEsGuardarRelacionado(false);
				this.cajacierreBeanSwingJInternalFrame=null;//new CajaCierreBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cajacierreSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCajaCierre) {
					this.jTabbedPaneRelacionesCaja.add("Caja Cierres",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCajaEgreso(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cajaegresoSessionBean=new CajaEgresoSessionBean();
		this.cajaegresoSessionBean.setConGuardarRelaciones(false);
		this.cajaegresoSessionBean.setEsGuardarRelacionado(true);

		this.cajaegresoBeanSwingJInternalFrame=null;//new CajaEgresoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cajaegresoBeanSwingJInternalFramePopup=new CajaEgresoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cajaegresoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cajaegresoSessionBean.getEsGuardarRelacionado()) {

				CajaEgresoJInternalFrame.STIPO_TAMANIO_GENERAL=CajaJInternalFrame.STIPO_TAMANIO_GENERAL;
				CajaEgresoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CajaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cajaegresoSessionBean.setEsGuardarRelacionado(true);

				this.cajaegresoBeanSwingJInternalFrame=new CajaEgresoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cajaegresoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cajaegresoBeanSwingJInternalFrame.setcajaegresoSessionBean(this.cajaegresoSessionBean);

				//this.gridBagConstraintsCaja = new GridBagConstraints();
				//this.gridBagConstraintsCaja.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCaja.gridx = 0;
				//this.jContentPaneDetalleCaja.add(this.cajaegresoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCaja);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCaja.add("Caja Egresos",this.cajaegresoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCaja.setComponentAt(iIndexTab,this.cajaegresoBeanSwingJInternalFrame.getContentPane());
				}

				//CajaEgresoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cajaegresoSessionBean.setEsGuardarRelacionado(false);
				this.cajaegresoBeanSwingJInternalFrame=null;//new CajaEgresoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCajaEgreso) {
					this.jTabbedPaneRelacionesCaja.add("Caja Egresos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCajaIngreso(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cajaingresoSessionBean=new CajaIngresoSessionBean();
		this.cajaingresoSessionBean.setConGuardarRelaciones(false);
		this.cajaingresoSessionBean.setEsGuardarRelacionado(true);

		this.cajaingresoBeanSwingJInternalFrame=null;//new CajaIngresoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cajaingresoBeanSwingJInternalFramePopup=new CajaIngresoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cajaingresoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cajaingresoSessionBean.getEsGuardarRelacionado()) {

				CajaIngresoJInternalFrame.STIPO_TAMANIO_GENERAL=CajaJInternalFrame.STIPO_TAMANIO_GENERAL;
				CajaIngresoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CajaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cajaingresoSessionBean.setEsGuardarRelacionado(true);

				this.cajaingresoBeanSwingJInternalFrame=new CajaIngresoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cajaingresoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cajaingresoBeanSwingJInternalFrame.setcajaingresoSessionBean(this.cajaingresoSessionBean);

				//this.gridBagConstraintsCaja = new GridBagConstraints();
				//this.gridBagConstraintsCaja.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCaja.gridx = 0;
				//this.jContentPaneDetalleCaja.add(this.cajaingresoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCaja);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCaja.add("Caja Ingresos",this.cajaingresoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCaja.setComponentAt(iIndexTab,this.cajaingresoBeanSwingJInternalFrame.getContentPane());
				}

				//CajaIngresoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cajaingresoSessionBean.setEsGuardarRelacionado(false);
				this.cajaingresoBeanSwingJInternalFrame=null;//new CajaIngresoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCajaIngreso) {
					this.jTabbedPaneRelacionesCaja.add("Caja Ingresos",new JPanel());
				}
			}
		}
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

				CajeroTurnoJInternalFrame.STIPO_TAMANIO_GENERAL=CajaJInternalFrame.STIPO_TAMANIO_GENERAL;
				CajeroTurnoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CajaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cajeroturnoSessionBean.setEsGuardarRelacionado(true);

				this.cajeroturnoBeanSwingJInternalFrame=new CajeroTurnoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cajeroturnoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cajeroturnoBeanSwingJInternalFrame.setcajeroturnoSessionBean(this.cajeroturnoSessionBean);

				//this.gridBagConstraintsCaja = new GridBagConstraints();
				//this.gridBagConstraintsCaja.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCaja.gridx = 0;
				//this.jContentPaneDetalleCaja.add(this.cajeroturnoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCaja);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCaja.add("Cajero Turnos",this.cajeroturnoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCaja.setComponentAt(iIndexTab,this.cajeroturnoBeanSwingJInternalFrame.getContentPane());
				}

				//CajeroTurnoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cajeroturnoSessionBean.setEsGuardarRelacionado(false);
				this.cajeroturnoBeanSwingJInternalFrame=null;//new CajeroTurnoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCajeroTurno) {
					this.jTabbedPaneRelacionesCaja.add("Cajero Turnos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFacturaPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.facturapuntoventaSessionBean=new FacturaPuntoVentaSessionBean();
		this.facturapuntoventaSessionBean.setConGuardarRelaciones(true);
		this.facturapuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.facturapuntoventaBeanSwingJInternalFrame=null;//new FacturaPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.facturapuntoventaBeanSwingJInternalFramePopup=new FacturaPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.facturapuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {

				FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=CajaJInternalFrame.STIPO_TAMANIO_GENERAL;
				FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CajaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.facturapuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.facturapuntoventaBeanSwingJInternalFrame=new FacturaPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.facturapuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.facturapuntoventaBeanSwingJInternalFrame.setfacturapuntoventaSessionBean(this.facturapuntoventaSessionBean);

				//this.gridBagConstraintsCaja = new GridBagConstraints();
				//this.gridBagConstraintsCaja.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCaja.gridx = 0;
				//this.jContentPaneDetalleCaja.add(this.facturapuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCaja);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCaja.add("Factura Punto Ventas",this.facturapuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCaja.setComponentAt(iIndexTab,this.facturapuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.facturapuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.facturapuntoventaBeanSwingJInternalFrame=null;//new FacturaPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFacturaPuntoVenta) {
					this.jTabbedPaneRelacionesCaja.add("Factura Punto Ventas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.notacreditopuntoventaSessionBean=new NotaCreditoPuntoVentaSessionBean();
		this.notacreditopuntoventaSessionBean.setConGuardarRelaciones(true);
		this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.notacreditopuntoventaBeanSwingJInternalFrame=null;//new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.notacreditopuntoventaBeanSwingJInternalFramePopup=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.notacreditopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {

				NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=CajaJInternalFrame.STIPO_TAMANIO_GENERAL;
				NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CajaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.notacreditopuntoventaBeanSwingJInternalFrame=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.notacreditopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.notacreditopuntoventaBeanSwingJInternalFrame.setnotacreditopuntoventaSessionBean(this.notacreditopuntoventaSessionBean);

				//this.gridBagConstraintsCaja = new GridBagConstraints();
				//this.gridBagConstraintsCaja.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCaja.gridx = 0;
				//this.jContentPaneDetalleCaja.add(this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCaja);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCaja.add("Nota Creditos",this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCaja.setComponentAt(iIndexTab,this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.notacreditopuntoventaBeanSwingJInternalFrame=null;//new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNotaCreditoPuntoVenta) {
					this.jTabbedPaneRelacionesCaja.add("Nota Creditos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePedidoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidopuntoventaSessionBean=new PedidoPuntoVentaSessionBean();
		this.pedidopuntoventaSessionBean.setConGuardarRelaciones(true);
		this.pedidopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.pedidopuntoventaBeanSwingJInternalFrame=null;//new PedidoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidopuntoventaBeanSwingJInternalFramePopup=new PedidoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {

				PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=CajaJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CajaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.pedidopuntoventaBeanSwingJInternalFrame=new PedidoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidopuntoventaBeanSwingJInternalFrame.setpedidopuntoventaSessionBean(this.pedidopuntoventaSessionBean);

				//this.gridBagConstraintsCaja = new GridBagConstraints();
				//this.gridBagConstraintsCaja.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCaja.gridx = 0;
				//this.jContentPaneDetalleCaja.add(this.pedidopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCaja);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCaja.add("Pedido Punto Ventas",this.pedidopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCaja.setComponentAt(iIndexTab,this.pedidopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.pedidopuntoventaBeanSwingJInternalFrame=null;//new PedidoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoPuntoVenta) {
					this.jTabbedPaneRelacionesCaja.add("Pedido Punto Ventas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePresupuestoVentasPunVen(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.presupuestoventaspunvenSessionBean=new PresupuestoVentasPunVenSessionBean();
		this.presupuestoventaspunvenSessionBean.setConGuardarRelaciones(false);
		this.presupuestoventaspunvenSessionBean.setEsGuardarRelacionado(true);

		this.presupuestoventaspunvenBeanSwingJInternalFrame=null;//new PresupuestoVentasPunVenBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.presupuestoventaspunvenBeanSwingJInternalFramePopup=new PresupuestoVentasPunVenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.presupuestoventaspunvenBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {

				PresupuestoVentasPunVenJInternalFrame.STIPO_TAMANIO_GENERAL=CajaJInternalFrame.STIPO_TAMANIO_GENERAL;
				PresupuestoVentasPunVenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CajaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.presupuestoventaspunvenSessionBean.setEsGuardarRelacionado(true);

				this.presupuestoventaspunvenBeanSwingJInternalFrame=new PresupuestoVentasPunVenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.presupuestoventaspunvenBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.presupuestoventaspunvenBeanSwingJInternalFrame.setpresupuestoventaspunvenSessionBean(this.presupuestoventaspunvenSessionBean);

				//this.gridBagConstraintsCaja = new GridBagConstraints();
				//this.gridBagConstraintsCaja.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCaja.gridx = 0;
				//this.jContentPaneDetalleCaja.add(this.presupuestoventaspunvenBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCaja);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCaja.add("Presupuesto Ventases",this.presupuestoventaspunvenBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCaja.setComponentAt(iIndexTab,this.presupuestoventaspunvenBeanSwingJInternalFrame.getContentPane());
				}

				//PresupuestoVentasPunVenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.presupuestoventaspunvenSessionBean.setEsGuardarRelacionado(false);
				this.presupuestoventaspunvenBeanSwingJInternalFrame=null;//new PresupuestoVentasPunVenBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePresupuestoVentasPunVen) {
					this.jTabbedPaneRelacionesCaja.add("Presupuesto Ventases",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarNotaCreditoPuntoVentaBeanSwingJInternalFrame(List<Caja> cajas,Caja caja,NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//notacreditopuntoventaBeanSwingJInternalFrame=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					notacreditopuntoventaBeanSwingJInternalFrame.getNotaCreditoPuntoVentaLogic().setConnexion(this.cajaLogic.getConnexion());

					notacreditopuntoventaBeanSwingJInternalFrame.setcajasForeignKey(cajas);
					notacreditopuntoventaBeanSwingJInternalFrame.setcajaForeignKey(caja);
					notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionCaja(true);
					notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setlidCajaActual(caja.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					notacreditopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyNotaCreditoPuntoVenta(notacreditopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					notacreditopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaCaja(true);
					notacreditopuntoventaBeanSwingJInternalFrame.setid_cajaFK_IdCaja(caja.getId());

					if(!this.conCargarFormDetalle) {
						notacreditopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					notacreditopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameCajaForeignKey(caja,1,false,true,true);
					notacreditopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					notacreditopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdCaja");
					notacreditopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCaja");
					notacreditopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoPuntoVenta(true);
					notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNotaCreditoPuntoVenta("n",notacreditopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, notacreditopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					notacreditopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					notacreditopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoPuntoVenta("relacionado");
					} else {
						notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoPuntoVenta("no_relacionado");
					}

					notacreditopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionNotaCreditoPuntoVenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCajaCierreBeanSwingJInternalFrame(List<Caja> cajas,Caja caja,CajaCierreBeanSwingJInternalFrame cajacierreBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cajacierreBeanSwingJInternalFrame=new CajaCierreBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cajacierreBeanSwingJInternalFrame.getCajaCierreLogic().setConnexion(this.cajaLogic.getConnexion());

					cajacierreBeanSwingJInternalFrame.setcajasForeignKey(cajas);
					cajacierreBeanSwingJInternalFrame.setcajaForeignKey(caja);
					cajacierreBeanSwingJInternalFrame.cajacierreSessionBean.setisBusquedaDesdeForeignKeySesionCaja(true);
					cajacierreBeanSwingJInternalFrame.cajacierreSessionBean.setlidCajaActual(caja.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cajacierreBeanSwingJInternalFrame.cargarCombosForeignKeyCajaCierre(cajacierreBeanSwingJInternalFrame.isCargarCombosDependencia);
					cajacierreBeanSwingJInternalFrame.setVisibilidadBusquedasParaCaja(true);
					cajacierreBeanSwingJInternalFrame.setid_cajaFK_IdCaja(caja.getId());

					if(!this.conCargarFormDetalle) {
						cajacierreBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cajacierreBeanSwingJInternalFrame.setSelectedItemCombosFrameCajaForeignKey(caja,1,false,true,true);
					cajacierreBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cajacierreBeanSwingJInternalFrame.procesarBusqueda("FK_IdCaja");
					cajacierreBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCaja");
					cajacierreBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaCierre(true);
					cajacierreBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCajaCierre("n",cajacierreBeanSwingJInternalFrame.isGuardarCambiosEnLote, cajacierreBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cajacierreBeanSwingJInternalFrame.setAutoscrolls(true);
					cajacierreBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cajacierreBeanSwingJInternalFrame.actualizarEstadoPanelsCajaCierre("relacionado");
					} else {
						cajacierreBeanSwingJInternalFrame.actualizarEstadoPanelsCajaCierre("no_relacionado");
					}

					cajacierreBeanSwingJInternalFrame.getjButtonRecargarInformacionCajaCierre().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFacturaPuntoVentaBeanSwingJInternalFrame(List<Caja> cajas,Caja caja,FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//facturapuntoventaBeanSwingJInternalFrame=new FacturaPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					facturapuntoventaBeanSwingJInternalFrame.getFacturaPuntoVentaLogic().setConnexion(this.cajaLogic.getConnexion());

					facturapuntoventaBeanSwingJInternalFrame.setcajasForeignKey(cajas);
					facturapuntoventaBeanSwingJInternalFrame.setcajaForeignKey(caja);
					facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionCaja(true);
					facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setlidCajaActual(caja.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					facturapuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyFacturaPuntoVenta(facturapuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					facturapuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaCaja(true);
					facturapuntoventaBeanSwingJInternalFrame.setid_cajaFK_IdCaja(caja.getId());

					if(!this.conCargarFormDetalle) {
						facturapuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					facturapuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameCajaForeignKey(caja,1,false,true,true);
					facturapuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					facturapuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdCaja");
					facturapuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCaja");
					facturapuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaPuntoVenta(true);
					facturapuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFacturaPuntoVenta("n",facturapuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, facturapuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					facturapuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					facturapuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						facturapuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaPuntoVenta("relacionado");
					} else {
						facturapuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaPuntoVenta("no_relacionado");
					}

					facturapuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionFacturaPuntoVenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCajaEgresoBeanSwingJInternalFrame(List<Caja> cajas,Caja caja,CajaEgresoBeanSwingJInternalFrame cajaegresoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cajaegresoBeanSwingJInternalFrame=new CajaEgresoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cajaegresoBeanSwingJInternalFrame.getCajaEgresoLogic().setConnexion(this.cajaLogic.getConnexion());

					cajaegresoBeanSwingJInternalFrame.setcajasForeignKey(cajas);
					cajaegresoBeanSwingJInternalFrame.setcajaForeignKey(caja);
					cajaegresoBeanSwingJInternalFrame.cajaegresoSessionBean.setisBusquedaDesdeForeignKeySesionCaja(true);
					cajaegresoBeanSwingJInternalFrame.cajaegresoSessionBean.setlidCajaActual(caja.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cajaegresoBeanSwingJInternalFrame.cargarCombosForeignKeyCajaEgreso(cajaegresoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cajaegresoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCaja(true);
					cajaegresoBeanSwingJInternalFrame.setid_cajaFK_IdCaja(caja.getId());

					if(!this.conCargarFormDetalle) {
						cajaegresoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cajaegresoBeanSwingJInternalFrame.setSelectedItemCombosFrameCajaForeignKey(caja,1,false,true,true);
					cajaegresoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cajaegresoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCaja");
					cajaegresoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCaja");
					cajaegresoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaEgreso(true);
					cajaegresoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCajaEgreso("n",cajaegresoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cajaegresoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cajaegresoBeanSwingJInternalFrame.setAutoscrolls(true);
					cajaegresoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cajaegresoBeanSwingJInternalFrame.actualizarEstadoPanelsCajaEgreso("relacionado");
					} else {
						cajaegresoBeanSwingJInternalFrame.actualizarEstadoPanelsCajaEgreso("no_relacionado");
					}

					cajaegresoBeanSwingJInternalFrame.getjButtonRecargarInformacionCajaEgreso().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCajeroTurnoBeanSwingJInternalFrame(List<Caja> cajas,Caja caja,CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cajeroturnoBeanSwingJInternalFrame=new CajeroTurnoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cajeroturnoBeanSwingJInternalFrame.getCajeroTurnoLogic().setConnexion(this.cajaLogic.getConnexion());

					cajeroturnoBeanSwingJInternalFrame.setcajasForeignKey(cajas);
					cajeroturnoBeanSwingJInternalFrame.setcajaForeignKey(caja);
					cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setisBusquedaDesdeForeignKeySesionCaja(true);
					cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setlidCajaActual(caja.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cajeroturnoBeanSwingJInternalFrame.cargarCombosForeignKeyCajeroTurno(cajeroturnoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cajeroturnoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCaja(true);
					cajeroturnoBeanSwingJInternalFrame.setid_cajaFK_IdCaja(caja.getId());

					if(!this.conCargarFormDetalle) {
						cajeroturnoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cajeroturnoBeanSwingJInternalFrame.setSelectedItemCombosFrameCajaForeignKey(caja,1,false,true,true);
					cajeroturnoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cajeroturnoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCaja");
					cajeroturnoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCaja");
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

		public void cargarPresupuestoVentasPunVenBeanSwingJInternalFrame(List<Caja> cajas,Caja caja,PresupuestoVentasPunVenBeanSwingJInternalFrame presupuestoventaspunvenBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//presupuestoventaspunvenBeanSwingJInternalFrame=new PresupuestoVentasPunVenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					presupuestoventaspunvenBeanSwingJInternalFrame.getPresupuestoVentasPunVenLogic().setConnexion(this.cajaLogic.getConnexion());

					presupuestoventaspunvenBeanSwingJInternalFrame.setcajasForeignKey(cajas);
					presupuestoventaspunvenBeanSwingJInternalFrame.setcajaForeignKey(caja);
					presupuestoventaspunvenBeanSwingJInternalFrame.presupuestoventaspunvenSessionBean.setisBusquedaDesdeForeignKeySesionCaja(true);
					presupuestoventaspunvenBeanSwingJInternalFrame.presupuestoventaspunvenSessionBean.setlidCajaActual(caja.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					presupuestoventaspunvenBeanSwingJInternalFrame.cargarCombosForeignKeyPresupuestoVentasPunVen(presupuestoventaspunvenBeanSwingJInternalFrame.isCargarCombosDependencia);
					presupuestoventaspunvenBeanSwingJInternalFrame.setVisibilidadBusquedasParaCaja(true);
					presupuestoventaspunvenBeanSwingJInternalFrame.setid_cajaFK_IdCaja(caja.getId());

					if(!this.conCargarFormDetalle) {
						presupuestoventaspunvenBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					presupuestoventaspunvenBeanSwingJInternalFrame.setSelectedItemCombosFrameCajaForeignKey(caja,1,false,true,true);
					presupuestoventaspunvenBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					presupuestoventaspunvenBeanSwingJInternalFrame.procesarBusqueda("FK_IdCaja");
					presupuestoventaspunvenBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCaja");
					presupuestoventaspunvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresupuestoVentasPunVen(true);
					presupuestoventaspunvenBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPresupuestoVentasPunVen("n",presupuestoventaspunvenBeanSwingJInternalFrame.isGuardarCambiosEnLote, presupuestoventaspunvenBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					presupuestoventaspunvenBeanSwingJInternalFrame.setAutoscrolls(true);
					presupuestoventaspunvenBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						presupuestoventaspunvenBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoVentasPunVen("relacionado");
					} else {
						presupuestoventaspunvenBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoVentasPunVen("no_relacionado");
					}

					presupuestoventaspunvenBeanSwingJInternalFrame.getjButtonRecargarInformacionPresupuestoVentasPunVen().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPedidoPuntoVentaBeanSwingJInternalFrame(List<Caja> cajas,Caja caja,PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidopuntoventaBeanSwingJInternalFrame=new PedidoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidopuntoventaBeanSwingJInternalFrame.getPedidoPuntoVentaLogic().setConnexion(this.cajaLogic.getConnexion());

					pedidopuntoventaBeanSwingJInternalFrame.setcajasForeignKey(cajas);
					pedidopuntoventaBeanSwingJInternalFrame.setcajaForeignKey(caja);
					pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionCaja(true);
					pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.setlidCajaActual(caja.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoPuntoVenta(pedidopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaCaja(true);
					pedidopuntoventaBeanSwingJInternalFrame.setid_cajaFK_IdCaja(caja.getId());

					if(!this.conCargarFormDetalle) {
						pedidopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameCajaForeignKey(caja,1,false,true,true);
					pedidopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdCaja");
					pedidopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCaja");
					pedidopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoPuntoVenta(true);
					pedidopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedidoPuntoVenta("n",pedidopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoPuntoVenta("relacionado");
					} else {
						pedidopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoPuntoVenta("no_relacionado");
					}

					pedidopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionPedidoPuntoVenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCajaIngresoBeanSwingJInternalFrame(List<Caja> cajas,Caja caja,CajaIngresoBeanSwingJInternalFrame cajaingresoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cajaingresoBeanSwingJInternalFrame=new CajaIngresoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cajaingresoBeanSwingJInternalFrame.getCajaIngresoLogic().setConnexion(this.cajaLogic.getConnexion());

					cajaingresoBeanSwingJInternalFrame.setcajasForeignKey(cajas);
					cajaingresoBeanSwingJInternalFrame.setcajaForeignKey(caja);
					cajaingresoBeanSwingJInternalFrame.cajaingresoSessionBean.setisBusquedaDesdeForeignKeySesionCaja(true);
					cajaingresoBeanSwingJInternalFrame.cajaingresoSessionBean.setlidCajaActual(caja.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cajaingresoBeanSwingJInternalFrame.cargarCombosForeignKeyCajaIngreso(cajaingresoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cajaingresoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCaja(true);
					cajaingresoBeanSwingJInternalFrame.setid_cajaFK_IdCaja(caja.getId());

					if(!this.conCargarFormDetalle) {
						cajaingresoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cajaingresoBeanSwingJInternalFrame.setSelectedItemCombosFrameCajaForeignKey(caja,1,false,true,true);
					cajaingresoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cajaingresoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCaja");
					cajaingresoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCaja");
					cajaingresoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaIngreso(true);
					cajaingresoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCajaIngreso("n",cajaingresoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cajaingresoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cajaingresoBeanSwingJInternalFrame.setAutoscrolls(true);
					cajaingresoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cajaingresoBeanSwingJInternalFrame.actualizarEstadoPanelsCajaIngreso("relacionado");
					} else {
						cajaingresoBeanSwingJInternalFrame.actualizarEstadoPanelsCajaIngreso("no_relacionado");
					}

					cajaingresoBeanSwingJInternalFrame.getjButtonRecargarInformacionCajaIngreso().setVisible(false);

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
