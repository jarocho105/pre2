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
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.TipoPrecioConstantesFunciones;

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
public class TipoPrecioDetalleFormJInternalFrame extends TipoPrecioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoPrecio;
	
	protected JMenuBar jmenuBarDetalleTipoPrecio;
	
	protected JMenu jmenuDetalleTipoPrecio;
	protected JMenu jmenuDetalleArchivoTipoPrecio;
	protected JMenu jmenuDetalleAccionesTipoPrecio;
	protected JMenu jmenuDetalleDatosTipoPrecio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPrecio;	
	protected GridBagConstraints gridBagConstraintsTipoPrecio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoPrecioBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoPrecio;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoPrecioSessionBean tipoprecioSessionBean;
	
	

	public PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFrame=null;
	public PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePrecio=false;
	public PrecioSessionBean precioSessionBean;

	public UtilidadTipoPrecioBeanSwingJInternalFrame utilidadtipoprecioBeanSwingJInternalFrame=null;
	public UtilidadTipoPrecioBeanSwingJInternalFrame utilidadtipoprecioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteUtilidadTipoPrecio=false;
	public UtilidadTipoPrecioSessionBean utilidadtipoprecioSessionBean;

	public PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFrame=null;
	public PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoPuntoVenta=false;
	public PedidoPuntoVentaSessionBean pedidopuntoventaSessionBean;

	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;
	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroCarteraDefecto=false;
	public ParametroCarteraDefectoSessionBean parametrocarteradefectoSessionBean;

	public DescuentoTipoPrecioBeanSwingJInternalFrame descuentotipoprecioBeanSwingJInternalFrame=null;
	public DescuentoTipoPrecioBeanSwingJInternalFrame descuentotipoprecioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDescuentoTipoPrecio=false;
	public DescuentoTipoPrecioSessionBean descuentotipoprecioSessionBean;

	public PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFrame=null;
	public PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePoliticasCliente=false;
	public PoliticasClienteSessionBean politicasclienteSessionBean;

	public ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame=null;
	public ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProforma=false;
	public ProformaSessionBean proformaSessionBean;

	public NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame=null;
	public NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNotaCreditoSoli=false;
	public NotaCreditoSoliSessionBean notacreditosoliSessionBean;

	public ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame=null;
	public ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteConsignacion=false;
	public ConsignacionSessionBean consignacionSessionBean;

	public PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame=null;
	public PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoExpor=false;
	public PedidoExporSessionBean pedidoexporSessionBean;

	public ServicioClienteBeanSwingJInternalFrame servicioclienteBeanSwingJInternalFrame=null;
	public ServicioClienteBeanSwingJInternalFrame servicioclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteServicioCliente=false;
	public ServicioClienteSessionBean servicioclienteSessionBean;

	public FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame=null;
	public FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFacturaPuntoVenta=false;
	public FacturaPuntoVentaSessionBean facturapuntoventaSessionBean;

	public GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFrame=null;
	public GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteGuiaRemision=false;
	public GuiaRemisionSessionBean guiaremisionSessionBean;

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;

	public NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame=null;
	public NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNotaCreditoPuntoVenta=false;
	public NotaCreditoPuntoVentaSessionBean notacreditopuntoventaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoPrecioLogic tipoprecioLogic;
	
	public JScrollPane jScrollPanelDatosTipoPrecio;
	public JScrollPane jScrollPanelDatosEdicionTipoPrecio;
	public JScrollPane jScrollPanelDatosGeneralTipoPrecio;
	
	protected JPanel jPanelCamposTipoPrecio;    
	protected JPanel jPanelCamposOcultosTipoPrecio;    	
	protected JPanel jPanelAccionesTipoPrecio;
	protected JPanel jPanelAccionesFormularioTipoPrecio;
    
	
	
	protected Integer iXPanelCamposTipoPrecio=0;
	protected Integer iYPanelCamposTipoPrecio=0;
	
	protected Integer iXPanelCamposOcultosTipoPrecio=0;
	protected Integer iYPanelCamposOcultosTipoPrecio=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoPrecio;
	public JButton jButtonModificarTipoPrecio;
	public JButton jButtonActualizarTipoPrecio;
    public JButton jButtonEliminarTipoPrecio;
	public JButton jButtonCancelarTipoPrecio;
    public JButton jButtonGuardarCambiosTipoPrecio;
	public JButton jButtonGuardarCambiosTablaTipoPrecio;
	protected JButton jButtonCerrarTipoPrecio;
	
	
	protected JButton jButtonProcesarInformacionTipoPrecio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoPrecio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoPrecio;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoPrecio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPrecio;
	protected JButton jButtonModificarToolBarTipoPrecio;
	protected JButton jButtonActualizarToolBarTipoPrecio;
    protected JButton jButtonEliminarToolBarTipoPrecio;
	protected JButton jButtonCancelarToolBarTipoPrecio;
    protected JButton jButtonGuardarCambiosToolBarTipoPrecio;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoPrecio;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPrecio;
	protected JButton jButtonCerrarToolBarTipoPrecio;
	
	protected JButton jButtonProcesarInformacionToolBarTipoPrecio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPrecio;
	protected JMenuItem jMenuItemModificarTipoPrecio;
	protected JMenuItem jMenuItemActualizarTipoPrecio;
    protected JMenuItem jMenuItemEliminarTipoPrecio;
	protected JMenuItem jMenuItemCancelarTipoPrecio;
    protected JMenuItem jMenuItemGuardarCambiosTipoPrecio;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPrecio;
	protected JMenuItem jMenuItemCerrarTipoPrecio;
	protected JMenuItem jMenuItemDetalleCerrarTipoPrecio;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPrecio;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoPrecio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPrecio;
	protected JMenuItem jMenuItemMostrarOcultarTipoPrecio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPrecio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPrecio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoPrecio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoPrecio;
	public JLabel jLabelIdTipoPrecio;
	public JLabel jLabelidTipoPrecio;
	public JButton jButtonidTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoPrecio;
	public JLabel jLabelcodigoTipoPrecio;
	public JTextArea jTextAreacodigoTipoPrecio;
	public JScrollPane jscrollPanecodigoTipoPrecio;
	public JButton jButtoncodigoTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoPrecio;
	public JLabel jLabelnombreTipoPrecio;
	public JTextArea jTextAreanombreTipoPrecio;
	public JScrollPane jscrollPanenombreTipoPrecio;
	public JButton jButtonnombreTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeTipoPrecio;
	public JLabel jLabelfecha_desdeTipoPrecio;
	//public JFormattedTextField jDateChooserfecha_desdeTipoPrecio;

	public JDateChooser jDateChooserfecha_desdeTipoPrecio;
	public JButton jButtonfecha_desdeTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaTipoPrecio;
	public JLabel jLabelfecha_hastaTipoPrecio;
	//public JFormattedTextField jDateChooserfecha_hastaTipoPrecio;

	public JDateChooser jDateChooserfecha_hastaTipoPrecio;
	public JButton jButtonfecha_hastaTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelmontoTipoPrecio;
	public JLabel jLabelmontoTipoPrecio;
	public JTextField jTextFieldmontoTipoPrecio;
	public JButton jButtonmontoTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoTipoPrecio;
	public JLabel jLabelesta_activoTipoPrecio;
	public JCheckBox jCheckBoxesta_activoTipoPrecio;
	public JButton jButtonesta_activoTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoPrecio;
	public JLabel jLabeldescripcionTipoPrecio;
	public JTextArea jTextAreadescripcionTipoPrecio;
	public JScrollPane jscrollPanedescripcionTipoPrecio;
	public JButton jButtondescripcionTipoPrecioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoPrecio;
	public JLabel jLabelid_empresaTipoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoPrecio;
	public JButton jButtonid_empresaTipoPrecio= new JButtonMe();
	public JButton jButtonid_empresaTipoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoPrecioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoPrecio;
	
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoPrecioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoPrecio=new JPanel();
				this.jPanelAccionesFormularioTipoPrecio=new JPanel();
				this.jmenuBarDetalleTipoPrecio=new JMenuBar();
				this.jTtoolBarDetalleTipoPrecio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrecioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoPrecioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrecioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrecioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrecioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoPrecio() {
		return this.jButtonActualizarToolBarTipoPrecio;
	}
	
	public JButton getjButtonEliminarToolBarTipoPrecio() {
		return this.jButtonEliminarToolBarTipoPrecio;
	}
	
	public JButton getjButtonCancelarToolBarTipoPrecio() {
		return this.jButtonCancelarToolBarTipoPrecio;
	}		
	
	public JButton getjButtonProcesarInformacionTipoPrecio() {
		return this.jButtonProcesarInformacionTipoPrecio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPrecio)	{
		this.jButtonProcesarInformacionTipoPrecio = jButtonProcesarInformacionTipoPrecio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPrecio() {
		return this.jComboBoxTiposAccionesTipoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPrecio(
			JComboBox jComboBoxTiposRelacionesTipoPrecio) {
		this.jComboBoxTiposRelacionesTipoPrecio = jComboBoxTiposRelacionesTipoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPrecio(
			JComboBox jComboBoxTiposAccionesTipoPrecio) {
		this.jComboBoxTiposAccionesTipoPrecio = jComboBoxTiposAccionesTipoPrecio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoPrecio() {
		return this.jComboBoxTiposAccionesFormularioTipoPrecio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoPrecio(
			JComboBox jComboBoxTiposAccionesFormularioTipoPrecio) {
		this.jComboBoxTiposAccionesFormularioTipoPrecio = jComboBoxTiposAccionesFormularioTipoPrecio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoprecioSessionBean=new TipoPrecioSessionBean();
		
		this.tipoprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprecioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.precioSessionBean=new PrecioSessionBean();
		//this.utilidadtipoprecioSessionBean=new UtilidadTipoPrecioSessionBean();
		//this.pedidopuntoventaSessionBean=new PedidoPuntoVentaSessionBean();
		//this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		//this.descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
		//this.politicasclienteSessionBean=new PoliticasClienteSessionBean();
		//this.proformaSessionBean=new ProformaSessionBean();
		//this.notacreditosoliSessionBean=new NotaCreditoSoliSessionBean();
		//this.consignacionSessionBean=new ConsignacionSessionBean();
		//this.pedidoexporSessionBean=new PedidoExporSessionBean();
		//this.servicioclienteSessionBean=new ServicioClienteSessionBean();
		//this.facturapuntoventaSessionBean=new FacturaPuntoVentaSessionBean();
		//this.guiaremisionSessionBean=new GuiaRemisionSessionBean();
		//this.clienteSessionBean=new ClienteSessionBean();
		//this.notacreditopuntoventaSessionBean=new NotaCreditoPuntoVentaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPrecioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Precio MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoprecioSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoPrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoPrecio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoPrecio=new JButtonMe();
				this.jButtonModificarToolBarTipoPrecio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoPrecio,this.jTtoolBarDetalleTipoPrecio,
							"actualizar","actualizar","Actualizar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoPrecio,this.jTtoolBarDetalleTipoPrecio,
							"eliminar","eliminar","Eliminar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoPrecio,this.jTtoolBarDetalleTipoPrecio,
							"cancelar","cancelar","Cancelar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoPrecio,this.jTtoolBarDetalleTipoPrecio,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoPrecio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoPrecio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoPrecio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoPrecio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoPrecio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPrecio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPrecio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPrecio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoPrecio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoPrecio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoPrecio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoPrecio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoPrecio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoPrecio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoPrecio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoPrecio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoPrecio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoPrecio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoPrecio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoPrecio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoPrecio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPrecio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPrecio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPrecio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPrecio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoPrecio.add(this.jMenuItemDetalleCerrarTipoPrecio);
		
		this.jmenuDetalleAccionesTipoPrecio.add(this.jMenuItemActualizarTipoPrecio);
		this.jmenuDetalleAccionesTipoPrecio.add(this.jMenuItemEliminarTipoPrecio);
		this.jmenuDetalleAccionesTipoPrecio.add(this.jMenuItemCancelarTipoPrecio);		
		
		//this.jmenuDetalleDatosTipoPrecio.add(this.jMenuItemDetalleAbrirOrderByTipoPrecio);				
		this.jmenuDetalleDatosTipoPrecio.add(this.jMenuItemDetalleMostarOcultarTipoPrecio);				
				
		//this.jmenuDetalleAccionesTipoPrecio.add(this.jMenuItemGuardarCambiosTipoPrecio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoPrecio.add(this.jmenuDetalleArchivoTipoPrecio);		
		this.jmenuBarDetalleTipoPrecio.add(this.jmenuDetalleAccionesTipoPrecio);		
		this.jmenuBarDetalleTipoPrecio.add(this.jmenuDetalleDatosTipoPrecio);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoPrecio.add(this.jmenuDetalleTipoPrecio);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoPrecio);				
	}
	
	
	public void inicializarElementosCamposTipoPrecio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoPrecio = new JLabelMe();
		jLabelIdTipoPrecio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoPrecio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoPrecio.setToolTipText(TipoPrecioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoPrecio= new GridBagLayout();

		this.jPanelidTipoPrecio.setLayout(this.gridaBagLayoutTipoPrecio);

		jLabelidTipoPrecio = new JLabel();
		jLabelidTipoPrecio.setText("Id");

		jLabelidTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoPrecio = new JLabelMe();
		this.jLabelcodigoTipoPrecio.setText(""+TipoPrecioConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoPrecio.setToolTipText("Codigo");
		this.jLabelcodigoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoPrecio.setToolTipText(TipoPrecioConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoPrecio = new GridBagLayout();
		this.jPanelcodigoTipoPrecio.setLayout(this.gridaBagLayoutTipoPrecio);


		jTextAreacodigoTipoPrecio= new JTextAreaMe();
		jTextAreacodigoTipoPrecio.setEnabled(false);
		jTextAreacodigoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoTipoPrecio.setLineWrap(true);
		jTextAreacodigoTipoPrecio.setWrapStyleWord(true);
		jTextAreacodigoTipoPrecio.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigoTipoPrecio.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacodigoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigoTipoPrecio = new JScrollPane(jTextAreacodigoTipoPrecio);
		jscrollPanecodigoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigoTipoPrecioBusqueda= new JButtonMe();
		this.jButtoncodigoTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoPrecioBusqueda.setText("U");
		this.jButtoncodigoTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoPrecioBusqueda"));

		if(this.tipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoPrecioBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoPrecio = new JLabelMe();
		this.jLabelnombreTipoPrecio.setText(""+TipoPrecioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoPrecio.setToolTipText("Nombre");
		this.jLabelnombreTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoPrecio.setToolTipText(TipoPrecioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoPrecio = new GridBagLayout();
		this.jPanelnombreTipoPrecio.setLayout(this.gridaBagLayoutTipoPrecio);


		jTextAreanombreTipoPrecio= new JTextAreaMe();
		jTextAreanombreTipoPrecio.setEnabled(false);
		jTextAreanombreTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPrecio.setLineWrap(true);
		jTextAreanombreTipoPrecio.setWrapStyleWord(true);
		jTextAreanombreTipoPrecio.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoPrecio.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoPrecio = new JScrollPane(jTextAreanombreTipoPrecio);
		jscrollPanenombreTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoPrecioBusqueda= new JButtonMe();
		this.jButtonnombreTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoPrecioBusqueda.setText("U");
		this.jButtonnombreTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoPrecioBusqueda"));

		if(this.tipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoPrecioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_desdeTipoPrecio = new JLabelMe();
		this.jLabelfecha_desdeTipoPrecio.setText(""+TipoPrecioConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeTipoPrecio.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeTipoPrecio.setToolTipText(TipoPrecioConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutTipoPrecio = new GridBagLayout();
		this.jPanelfecha_desdeTipoPrecio.setLayout(this.gridaBagLayoutTipoPrecio);


		//jFormattedTextFieldfecha_desdeTipoPrecio= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeTipoPrecio= new JDateChooser();
		jDateChooserfecha_desdeTipoPrecio.setEnabled(false);
		jDateChooserfecha_desdeTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeTipoPrecio.setDate(new Date());
		jDateChooserfecha_desdeTipoPrecio.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeTipoPrecio.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeTipoPrecioBusqueda= new JButtonMe();
		this.jButtonfecha_desdeTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeTipoPrecioBusqueda.setText("U");
		this.jButtonfecha_desdeTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeTipoPrecioBusqueda"));

		if(this.tipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeTipoPrecioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaTipoPrecio = new JLabelMe();
		this.jLabelfecha_hastaTipoPrecio.setText(""+TipoPrecioConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaTipoPrecio.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaTipoPrecio.setToolTipText(TipoPrecioConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutTipoPrecio = new GridBagLayout();
		this.jPanelfecha_hastaTipoPrecio.setLayout(this.gridaBagLayoutTipoPrecio);


		//jFormattedTextFieldfecha_hastaTipoPrecio= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaTipoPrecio= new JDateChooser();
		jDateChooserfecha_hastaTipoPrecio.setEnabled(false);
		jDateChooserfecha_hastaTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaTipoPrecio.setDate(new Date());
		jDateChooserfecha_hastaTipoPrecio.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaTipoPrecio.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaTipoPrecioBusqueda= new JButtonMe();
		this.jButtonfecha_hastaTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaTipoPrecioBusqueda.setText("U");
		this.jButtonfecha_hastaTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaTipoPrecioBusqueda"));

		if(this.tipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaTipoPrecioBusqueda.setVisible(false);		}


					
		this.jLabelmontoTipoPrecio = new JLabelMe();
		this.jLabelmontoTipoPrecio.setText(""+TipoPrecioConstantesFunciones.LABEL_MONTO+" : *");
		this.jLabelmontoTipoPrecio.setToolTipText("Monto");
		this.jLabelmontoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmontoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmontoTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmontoTipoPrecio.setToolTipText(TipoPrecioConstantesFunciones.LABEL_MONTO);
		this.gridaBagLayoutTipoPrecio = new GridBagLayout();
		this.jPanelmontoTipoPrecio.setLayout(this.gridaBagLayoutTipoPrecio);


		jTextFieldmontoTipoPrecio= new JTextFieldMe();
		jTextFieldmontoTipoPrecio.setEnabled(false);
		jTextFieldmontoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmontoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmontoTipoPrecio.setText("0.0");

		this.jButtonmontoTipoPrecioBusqueda= new JButtonMe();
		this.jButtonmontoTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmontoTipoPrecioBusqueda.setText("U");
		this.jButtonmontoTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmontoTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmontoTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmontoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmontoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"montoTipoPrecioBusqueda"));

		if(this.tipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmontoTipoPrecioBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoTipoPrecio = new JLabelMe();
		this.jLabelesta_activoTipoPrecio.setText(""+TipoPrecioConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoTipoPrecio.setToolTipText("Esta Activo");
		this.jLabelesta_activoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoTipoPrecio.setToolTipText(TipoPrecioConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutTipoPrecio = new GridBagLayout();
		this.jPanelesta_activoTipoPrecio.setLayout(this.gridaBagLayoutTipoPrecio);


		jCheckBoxesta_activoTipoPrecio= new JCheckBoxMe();
		jCheckBoxesta_activoTipoPrecio.setEnabled(false);

		jCheckBoxesta_activoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoTipoPrecioBusqueda= new JButtonMe();
		this.jButtonesta_activoTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoTipoPrecioBusqueda.setText("U");
		this.jButtonesta_activoTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoTipoPrecioBusqueda"));

		if(this.tipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoTipoPrecioBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoPrecio = new JLabelMe();
		this.jLabeldescripcionTipoPrecio.setText(""+TipoPrecioConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionTipoPrecio.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoPrecio.setToolTipText(TipoPrecioConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoPrecio = new GridBagLayout();
		this.jPaneldescripcionTipoPrecio.setLayout(this.gridaBagLayoutTipoPrecio);


		jTextAreadescripcionTipoPrecio= new JTextAreaMe();
		jTextAreadescripcionTipoPrecio.setEnabled(false);
		jTextAreadescripcionTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoPrecio.setLineWrap(true);
		jTextAreadescripcionTipoPrecio.setWrapStyleWord(true);
		jTextAreadescripcionTipoPrecio.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoPrecio.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoPrecio = new JScrollPane(jTextAreadescripcionTipoPrecio);
		jscrollPanedescripcionTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionTipoPrecioBusqueda= new JButtonMe();
		this.jButtondescripcionTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoPrecioBusqueda.setText("U");
		this.jButtondescripcionTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoPrecioBusqueda"));

		if(this.tipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoPrecioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoPrecio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoPrecio = new JLabelMe();
		this.jLabelid_empresaTipoPrecio.setText(""+TipoPrecioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoPrecio.setToolTipText("Empresa");
		this.jLabelid_empresaTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoPrecio.setToolTipText(TipoPrecioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoPrecio = new GridBagLayout();
		this.jPanelid_empresaTipoPrecio.setLayout(this.gridaBagLayoutTipoPrecio);


		jComboBoxid_empresaTipoPrecio= new JComboBoxMe();
		jComboBoxid_empresaTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoPrecio.setEnabled(false);

		this.jButtonid_empresaTipoPrecio= new JButtonMe();
		this.jButtonid_empresaTipoPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPrecio.setText("Buscar");
		this.jButtonid_empresaTipoPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPrecio"));

		this.jButtonid_empresaTipoPrecioBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoPrecioBusqueda.setText("U");
		this.jButtonid_empresaTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPrecioBusqueda"));

		if(this.tipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoPrecioBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoPrecioUpdate= new JButtonMe();
		this.jButtonid_empresaTipoPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoPrecioUpdate.setText("U");
		this.jButtonid_empresaTipoPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPrecioUpdate"));



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
		//this.jInternalFrameDetalleTipoPrecio = new TipoPrecioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Precio DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPrecio= new GridBagLayout();
		

		
		String sToolTipTipoPrecio="";
		sToolTipTipoPrecio=TipoPrecioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPrecio+="(Inventario.TipoPrecio)";
		}
		
		if(!this.tipoprecioSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPrecio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoPrecio = new JButtonMe();
		this.jButtonModificarTipoPrecio = new JButtonMe();
        this.jButtonActualizarTipoPrecio = new JButtonMe();
        this.jButtonEliminarTipoPrecio = new JButtonMe();
        this.jButtonCancelarTipoPrecio = new JButtonMe();
        this.jButtonGuardarCambiosTipoPrecio = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoPrecio = new JButtonMe();
		this.jButtonCerrarTipoPrecio = new JButtonMe();
		
		this.jScrollPanelDatosTipoPrecio = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoPrecio = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoPrecio = new JScrollPane();
				
		
		
		this.jPanelCamposTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Precio";
		
		if(!this.tipoprecioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Precioes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPrecio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoPrecio.setName("jPanelCamposTipoPrecio"); 

		this.jPanelCamposOcultosTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoPrecio.setName("jPanelCamposOcultosTipoPrecio"); 

        this.jPanelAccionesTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPrecio.setToolTipText("Acciones");
        this.jPanelAccionesTipoPrecio.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoPrecio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoPrecio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoPrecio.setText("Nuevo");
		this.jButtonModificarTipoPrecio.setText("Editar");
        this.jButtonActualizarTipoPrecio.setText("Actualizar");
        this.jButtonEliminarTipoPrecio.setText("Eliminar");
        this.jButtonCancelarTipoPrecio.setText("Cancelar");
        this.jButtonGuardarCambiosTipoPrecio.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoPrecio.setText("Guardar");
		this.jButtonCerrarTipoPrecio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPrecio,"nuevo_button","Nuevo",this.tipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoPrecio,"modificar_button","Editar",this.tipoprecioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoPrecio,"actualizar_button","Actualizar",this.tipoprecioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoPrecio,"eliminar_button","Eliminar",this.tipoprecioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoPrecio,"cancelar_button","Cancelar",this.tipoprecioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoPrecio,"guardarcambios_button","Guardar",this.tipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPrecio,"guardarcambiostabla_button","Guardar",this.tipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPrecio,"cerrar_button","Salir",this.tipoprecioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoPrecio.setToolTipText("Nuevo"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoPrecio.setToolTipText("Editar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoPrecio.setToolTipText("Actualizar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoPrecio.setToolTipText("Eliminar)"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoPrecio.setToolTipText("Cancelar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoPrecio.setToolTipText("Guardar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoPrecio.setToolTipText("Guardar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPrecio.setToolTipText("Salir"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPrecio";
		inputMap = this.jButtonNuevoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPrecio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoPrecio";
		inputMap = this.jButtonActualizarTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoPrecio"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoPrecio";
		inputMap = this.jButtonEliminarTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoPrecio"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoPrecio";
		inputMap = this.jButtonCancelarTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoPrecio"));
		
		//CERRAR		
		sMapKey = "CerrarTipoPrecio";
		inputMap = this.jButtonCerrarTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPrecio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPrecio";
		inputMap = this.jButtonGuardarCambiosTablaTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPrecio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoPrecio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoPrecio.setToolTipText("Nuevo TipoPrecio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoPrecio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoPrecio.setToolTipText("Sin Cerrar Ventana TipoPrecio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoPrecio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoPrecio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPrecio.setText("Accion");
		this.jComboBoxTiposAccionesTipoPrecio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoPrecio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoPrecio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoPrecio = new JLabelMe();
		
		this.jLabelAccionesTipoPrecio.setText("Acciones");		
		this.jLabelAccionesTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoPrecio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoPrecio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoPrecio=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPrecio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoPrecio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoPrecio = new GridBagLayout();
		
		this.jPanelCamposTipoPrecio.setLayout(gridaBagLayoutCamposTipoPrecio);
		this.jPanelCamposOcultosTipoPrecio.setLayout(gridaBagLayoutCamposOcultosTipoPrecio);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 0;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoPrecio.add(jLabelIdTipoPrecio, this.gridBagConstraintsTipoPrecio);



	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 1;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoPrecio.add(jLabelidTipoPrecio, this.gridBagConstraintsTipoPrecio);


	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 0;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoPrecio.add(jLabelid_empresaTipoPrecio, this.gridBagConstraintsTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = 0;
		this.gridBagConstraintsTipoPrecio.gridx = 2;
		this.gridBagConstraintsTipoPrecio.ipadx = 0;
		this.gridBagConstraintsTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoPrecio.add(jButtonid_empresaTipoPrecioBusqueda, this.gridBagConstraintsTipoPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = 0;
		this.gridBagConstraintsTipoPrecio.gridx = 3;
		this.gridBagConstraintsTipoPrecio.ipadx = 0;
		this.gridBagConstraintsTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoPrecio.add(jButtonid_empresaTipoPrecioUpdate, this.gridBagConstraintsTipoPrecio);
	}

	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 1;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoPrecio.add(jComboBoxid_empresaTipoPrecio, this.gridBagConstraintsTipoPrecio);


	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 0;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoPrecio.add(jLabelcodigoTipoPrecio, this.gridBagConstraintsTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = 0;
		this.gridBagConstraintsTipoPrecio.gridx = 2;
		this.gridBagConstraintsTipoPrecio.ipadx = 0;
		this.gridBagConstraintsTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoPrecio.add(jButtoncodigoTipoPrecioBusqueda, this.gridBagConstraintsTipoPrecio);
	}

	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 1;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoPrecio.add(jscrollPanecodigoTipoPrecio, this.gridBagConstraintsTipoPrecio);


	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 0;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoPrecio.add(jLabelnombreTipoPrecio, this.gridBagConstraintsTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = 0;
		this.gridBagConstraintsTipoPrecio.gridx = 2;
		this.gridBagConstraintsTipoPrecio.ipadx = 0;
		this.gridBagConstraintsTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoPrecio.add(jButtonnombreTipoPrecioBusqueda, this.gridBagConstraintsTipoPrecio);
	}

	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 1;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoPrecio.add(jscrollPanenombreTipoPrecio, this.gridBagConstraintsTipoPrecio);


	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 0;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeTipoPrecio.add(jLabelfecha_desdeTipoPrecio, this.gridBagConstraintsTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = 0;
		this.gridBagConstraintsTipoPrecio.gridx = 2;
		this.gridBagConstraintsTipoPrecio.ipadx = 0;
		this.gridBagConstraintsTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeTipoPrecio.add(jButtonfecha_desdeTipoPrecioBusqueda, this.gridBagConstraintsTipoPrecio);
	}

	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 1;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeTipoPrecio.add(jDateChooserfecha_desdeTipoPrecio, this.gridBagConstraintsTipoPrecio);


	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 0;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaTipoPrecio.add(jLabelfecha_hastaTipoPrecio, this.gridBagConstraintsTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = 0;
		this.gridBagConstraintsTipoPrecio.gridx = 2;
		this.gridBagConstraintsTipoPrecio.ipadx = 0;
		this.gridBagConstraintsTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaTipoPrecio.add(jButtonfecha_hastaTipoPrecioBusqueda, this.gridBagConstraintsTipoPrecio);
	}

	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 1;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaTipoPrecio.add(jDateChooserfecha_hastaTipoPrecio, this.gridBagConstraintsTipoPrecio);


	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 0;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmontoTipoPrecio.add(jLabelmontoTipoPrecio, this.gridBagConstraintsTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = 0;
		this.gridBagConstraintsTipoPrecio.gridx = 2;
		this.gridBagConstraintsTipoPrecio.ipadx = 0;
		this.gridBagConstraintsTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelmontoTipoPrecio.add(jButtonmontoTipoPrecioBusqueda, this.gridBagConstraintsTipoPrecio);
	}

	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 1;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmontoTipoPrecio.add(jTextFieldmontoTipoPrecio, this.gridBagConstraintsTipoPrecio);


	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 0;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoTipoPrecio.add(jLabelesta_activoTipoPrecio, this.gridBagConstraintsTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = 0;
		this.gridBagConstraintsTipoPrecio.gridx = 2;
		this.gridBagConstraintsTipoPrecio.ipadx = 0;
		this.gridBagConstraintsTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoTipoPrecio.add(jButtonesta_activoTipoPrecioBusqueda, this.gridBagConstraintsTipoPrecio);
	}

	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 1;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoTipoPrecio.add(jCheckBoxesta_activoTipoPrecio, this.gridBagConstraintsTipoPrecio);


	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 0;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoPrecio.add(jLabeldescripcionTipoPrecio, this.gridBagConstraintsTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = 0;
		this.gridBagConstraintsTipoPrecio.gridx = 2;
		this.gridBagConstraintsTipoPrecio.ipadx = 0;
		this.gridBagConstraintsTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoPrecio.add(jButtondescripcionTipoPrecioBusqueda, this.gridBagConstraintsTipoPrecio);
	}

	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrecio.gridy = 0;
	this.gridBagConstraintsTipoPrecio.gridx = 1;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoPrecio.add(jscrollPanedescripcionTipoPrecio, this.gridBagConstraintsTipoPrecio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrecio.gridy = iYPanelCamposTipoPrecio;
	this.gridBagConstraintsTipoPrecio.gridx = iXPanelCamposTipoPrecio++;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrecio.add(this.jPanelidTipoPrecio, this.gridBagConstraintsTipoPrecio);



	if(iXPanelCamposTipoPrecio % 1==0) {
		iXPanelCamposTipoPrecio=0;
		iYPanelCamposTipoPrecio++;
	}
	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrecio.gridy = iYPanelCamposTipoPrecio;
	this.gridBagConstraintsTipoPrecio.gridx = iXPanelCamposTipoPrecio++;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrecio.add(this.jPanelcodigoTipoPrecio, this.gridBagConstraintsTipoPrecio);



	if(iXPanelCamposTipoPrecio % 1==0) {
		iXPanelCamposTipoPrecio=0;
		iYPanelCamposTipoPrecio++;
	}
	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrecio.gridy = iYPanelCamposTipoPrecio;
	this.gridBagConstraintsTipoPrecio.gridx = iXPanelCamposTipoPrecio++;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrecio.add(this.jPanelnombreTipoPrecio, this.gridBagConstraintsTipoPrecio);



	if(iXPanelCamposTipoPrecio % 1==0) {
		iXPanelCamposTipoPrecio=0;
		iYPanelCamposTipoPrecio++;
	}
	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrecio.gridy = iYPanelCamposTipoPrecio;
	this.gridBagConstraintsTipoPrecio.gridx = iXPanelCamposTipoPrecio++;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrecio.add(this.jPanelfecha_desdeTipoPrecio, this.gridBagConstraintsTipoPrecio);



	if(iXPanelCamposTipoPrecio % 1==0) {
		iXPanelCamposTipoPrecio=0;
		iYPanelCamposTipoPrecio++;
	}
	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrecio.gridy = iYPanelCamposTipoPrecio;
	this.gridBagConstraintsTipoPrecio.gridx = iXPanelCamposTipoPrecio++;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrecio.add(this.jPanelfecha_hastaTipoPrecio, this.gridBagConstraintsTipoPrecio);



	if(iXPanelCamposTipoPrecio % 1==0) {
		iXPanelCamposTipoPrecio=0;
		iYPanelCamposTipoPrecio++;
	}
	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrecio.gridy = iYPanelCamposTipoPrecio;
	this.gridBagConstraintsTipoPrecio.gridx = iXPanelCamposTipoPrecio++;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrecio.add(this.jPanelmontoTipoPrecio, this.gridBagConstraintsTipoPrecio);



	if(iXPanelCamposTipoPrecio % 1==0) {
		iXPanelCamposTipoPrecio=0;
		iYPanelCamposTipoPrecio++;
	}
	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrecio.gridy = iYPanelCamposTipoPrecio;
	this.gridBagConstraintsTipoPrecio.gridx = iXPanelCamposTipoPrecio++;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrecio.add(this.jPanelesta_activoTipoPrecio, this.gridBagConstraintsTipoPrecio);



	if(iXPanelCamposTipoPrecio % 1==0) {
		iXPanelCamposTipoPrecio=0;
		iYPanelCamposTipoPrecio++;
	}
	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrecio.gridy = iYPanelCamposTipoPrecio;
	this.gridBagConstraintsTipoPrecio.gridx = iXPanelCamposTipoPrecio++;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrecio.add(this.jPaneldescripcionTipoPrecio, this.gridBagConstraintsTipoPrecio);



	if(iXPanelCamposTipoPrecio % 1==0) {
		iXPanelCamposTipoPrecio=0;
		iYPanelCamposTipoPrecio++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrecio.gridy = iYPanelCamposOcultosTipoPrecio;
	this.gridBagConstraintsTipoPrecio.gridx = iXPanelCamposOcultosTipoPrecio++;
	this.gridBagConstraintsTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoPrecio.add(this.jPanelid_empresaTipoPrecio, this.gridBagConstraintsTipoPrecio);



	if(iXPanelCamposOcultosTipoPrecio % 1==0) {
		iXPanelCamposOcultosTipoPrecio=0;
		iYPanelCamposOcultosTipoPrecio++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoPrecio= new GridBagLayout();
		this.jPanelAccionesTipoPrecio.setLayout(gridaBagLayoutAccionesTipoPrecio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoPrecio= new GridBagLayout();
		this.jPanelAccionesFormularioTipoPrecio.setLayout(gridaBagLayoutAccionesFormularioTipoPrecio);
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPrecio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPrecio.add(this.jComboBoxTiposAccionesFormularioTipoPrecio, this.gridBagConstraintsTipoPrecio);

		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPrecio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPrecio.add(this.jCheckBoxPostAccionNuevoTipoPrecio, this.gridBagConstraintsTipoPrecio);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoprecioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPrecio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPrecio.add(this.jCheckBoxPostAccionSinCerrarTipoPrecio, this.gridBagConstraintsTipoPrecio);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoprecioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoprecioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPrecio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPrecio.add(this.jCheckBoxPostAccionSinMensajeTipoPrecio, this.gridBagConstraintsTipoPrecio);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrecio.gridy = 0;
		this.gridBagConstraintsTipoPrecio.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoPrecio.add(this.jButtonModificarTipoPrecio, this.gridBagConstraintsTipoPrecio);							

		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrecio.gridy = 0;
		this.gridBagConstraintsTipoPrecio.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoPrecio.add(this.jButtonEliminarTipoPrecio, this.gridBagConstraintsTipoPrecio);
		
			
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy = 0;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPrecio.add(this.jButtonActualizarTipoPrecio, this.gridBagConstraintsTipoPrecio);


		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy = 0;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPrecio.add(this.jButtonGuardarCambiosTipoPrecio, this.gridBagConstraintsTipoPrecio);	
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy = 0;		
		this.gridBagConstraintsTipoPrecio.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoPrecio.add(this.jButtonCancelarTipoPrecio, this.gridBagConstraintsTipoPrecio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPrecio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPrecio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprecioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();						
			this.gridBagConstraintsTipoPrecio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPrecio.gridx = 0;		
			//this.gridBagConstraintsTipoPrecio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPrecio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPrecio.gridx =0;
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPrecio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPrecio, this.gridBagConstraintsTipoPrecio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoPrecioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoPrecio = new TipoPrecioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Precio DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Precio DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Precio Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoPrecioModel tipoprecioModel=new TipoPrecioModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoPrecioModel.TipoPrecioFocusTraversalPolicy tipoprecioFocusTraversalPolicy = tipoprecioModel.new TipoPrecioFocusTraversalPolicy(this);
			
			//tipoprecioFocusTraversalPolicy.settipoprecioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoprecioModel);
			
			
			this.jContentPaneDetalleTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoPrecio = new GridBagLayout();	
			this.jContentPaneDetalleTipoPrecio.setLayout(gridaBagLayoutDetalleTipoPrecio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPrecio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoPrecio.gridx = 0;
					
				
				this.jContentPaneDetalleTipoPrecio.add(jTtoolBarDetalleTipoPrecio, gridBagConstraintsTipoPrecio);								
				
}
			
			this.jScrollPanelDatosEdicionTipoPrecio=   new JScrollPane(jContentPaneDetalleTipoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoPrecio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoPrecio.gridx = 0;
	        
			this.jContentPaneDetalleTipoPrecio.add(jPanelCamposTipoPrecio, gridBagConstraintsTipoPrecio);
			
			
			
			
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
						&& tipoprecioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameConsignacion(this.puedeCargarPorParteConsignacion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDescuentoTipoPrecio(this.puedeCargarPorParteDescuentoTipoPrecio,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFacturaPuntoVenta(this.puedeCargarPorParteFacturaPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGuiaRemision(this.puedeCargarPorParteGuiaRemision,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(this.puedeCargarPorParteNotaCreditoPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(this.puedeCargarPorParteNotaCreditoSoli,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(this.puedeCargarPorParteParametroCarteraDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoExpor(this.puedeCargarPorPartePedidoExpor,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoPuntoVenta(this.puedeCargarPorPartePedidoPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePoliticasCliente(this.puedeCargarPorPartePoliticasCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePrecio(this.puedeCargarPorPartePrecio,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProforma(this.puedeCargarPorParteProforma,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameServicioCliente(this.puedeCargarPorParteServicioCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameUtilidadTipoPrecio(this.puedeCargarPorParteUtilidadTipoPrecio,false,-1);
					
					if(this.tipoprecioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoPrecio= new GridBagConstraints();
						this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoPrecio.gridx = 0;
						this.jContentPaneDetalleTipoPrecio.add(this.jTabbedPaneRelacionesTipoPrecio, this.gridBagConstraintsTipoPrecio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoPrecio.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameConsignacion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDescuentoTipoPrecio(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFacturaPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGuiaRemision(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoExpor(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePoliticasCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePrecio(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProforma(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameServicioCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameUtilidadTipoPrecio(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoPrecio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
					this.gridBagConstraintsTipoPrecio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoPrecio.gridx = 0;
					
				
					this.jContentPaneDetalleTipoPrecio.add(jPanelCamposOcultosTipoPrecio, gridBagConstraintsTipoPrecio);
				
					this.jPanelCamposOcultosTipoPrecio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;//46;		
	        this.gridBagConstraintsTipoPrecio.gridx = 0;
	        this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoPrecio.add(this.jPanelAccionesFormularioTipoPrecio, this.gridBagConstraintsTipoPrecio);							
			
			
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
	        this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones;//46;		
	        this.gridBagConstraintsTipoPrecio.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoPrecio.add(this.jPanelAccionesTipoPrecio, this.gridBagConstraintsTipoPrecio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoPrecio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoPrecio=   new JScrollPane(this.jPanelCamposTipoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoPrecio.gridx = 0;
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoPrecio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoPrecio, this.gridBagConstraintsTipoPrecio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPrecio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoPrecio, this.gridBagConstraintsTipoPrecio);			
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPrecio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoPrecio, this.gridBagConstraintsTipoPrecio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPrecio, this.gridBagConstraintsTipoPrecio);
			
			
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPrecio, this.gridBagConstraintsTipoPrecio);
		
			
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrecio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPrecio, this.gridBagConstraintsTipoPrecio);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoPrecio;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoPrecio;
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

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrecio.gridx = 0;
				//this.jContentPaneDetalleTipoPrecio.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPrecio.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameConsignacion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.consignacionSessionBean=new ConsignacionSessionBean();
		this.consignacionSessionBean.setConGuardarRelaciones(true);
		this.consignacionSessionBean.setEsGuardarRelacionado(true);

		this.consignacionBeanSwingJInternalFrame=null;//new ConsignacionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.consignacionBeanSwingJInternalFramePopup=new ConsignacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.consignacionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.consignacionSessionBean.getEsGuardarRelacionado()) {

				ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.consignacionSessionBean.setEsGuardarRelacionado(true);

				this.consignacionBeanSwingJInternalFrame=new ConsignacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.consignacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.consignacionBeanSwingJInternalFrame.setconsignacionSessionBean(this.consignacionSessionBean);

				//this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrecio.gridx = 0;
				//this.jContentPaneDetalleTipoPrecio.add(this.consignacionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Consignacions",this.consignacionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPrecio.setComponentAt(iIndexTab,this.consignacionBeanSwingJInternalFrame.getContentPane());
				}

				//ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.consignacionSessionBean.setEsGuardarRelacionado(false);
				this.consignacionBeanSwingJInternalFrame=null;//new ConsignacionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.consignacionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteConsignacion) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Consignacions",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDescuentoTipoPrecio(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
		this.descuentotipoprecioSessionBean.setConGuardarRelaciones(false);
		this.descuentotipoprecioSessionBean.setEsGuardarRelacionado(true);

		this.descuentotipoprecioBeanSwingJInternalFrame=null;//new DescuentoTipoPrecioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.descuentotipoprecioBeanSwingJInternalFramePopup=new DescuentoTipoPrecioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.descuentotipoprecioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {

				DescuentoTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				DescuentoTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.descuentotipoprecioSessionBean.setEsGuardarRelacionado(true);

				this.descuentotipoprecioBeanSwingJInternalFrame=new DescuentoTipoPrecioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.descuentotipoprecioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.descuentotipoprecioBeanSwingJInternalFrame.setdescuentotipoprecioSessionBean(this.descuentotipoprecioSessionBean);

				//this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrecio.gridx = 0;
				//this.jContentPaneDetalleTipoPrecio.add(this.descuentotipoprecioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Descuento Tipo Precios",this.descuentotipoprecioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPrecio.setComponentAt(iIndexTab,this.descuentotipoprecioBeanSwingJInternalFrame.getContentPane());
				}

				//DescuentoTipoPrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.descuentotipoprecioSessionBean.setEsGuardarRelacionado(false);
				this.descuentotipoprecioBeanSwingJInternalFrame=null;//new DescuentoTipoPrecioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDescuentoTipoPrecio) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Descuento Tipo Precios",new JPanel());
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

				FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.facturapuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.facturapuntoventaBeanSwingJInternalFrame=new FacturaPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.facturapuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.facturapuntoventaBeanSwingJInternalFrame.setfacturapuntoventaSessionBean(this.facturapuntoventaSessionBean);

				//this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrecio.gridx = 0;
				//this.jContentPaneDetalleTipoPrecio.add(this.facturapuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Factura Punto Ventas",this.facturapuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPrecio.setComponentAt(iIndexTab,this.facturapuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.facturapuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.facturapuntoventaBeanSwingJInternalFrame=null;//new FacturaPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFacturaPuntoVenta) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Factura Punto Ventas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameGuiaRemision(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.guiaremisionSessionBean=new GuiaRemisionSessionBean();
		this.guiaremisionSessionBean.setConGuardarRelaciones(true);
		this.guiaremisionSessionBean.setEsGuardarRelacionado(true);

		this.guiaremisionBeanSwingJInternalFrame=null;//new GuiaRemisionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.guiaremisionBeanSwingJInternalFramePopup=new GuiaRemisionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.guiaremisionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.guiaremisionSessionBean.getEsGuardarRelacionado()) {

				GuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				GuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.guiaremisionSessionBean.setEsGuardarRelacionado(true);

				this.guiaremisionBeanSwingJInternalFrame=new GuiaRemisionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.guiaremisionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.guiaremisionBeanSwingJInternalFrame.setguiaremisionSessionBean(this.guiaremisionSessionBean);

				//this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrecio.gridx = 0;
				//this.jContentPaneDetalleTipoPrecio.add(this.guiaremisionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Guia Remisiones",this.guiaremisionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPrecio.setComponentAt(iIndexTab,this.guiaremisionBeanSwingJInternalFrame.getContentPane());
				}

				//GuiaRemisionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.guiaremisionSessionBean.setEsGuardarRelacionado(false);
				this.guiaremisionBeanSwingJInternalFrame=null;//new GuiaRemisionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.guiaremisionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteGuiaRemision) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Guia Remisiones",new JPanel());
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

				NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.notacreditopuntoventaBeanSwingJInternalFrame=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.notacreditopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.notacreditopuntoventaBeanSwingJInternalFrame.setnotacreditopuntoventaSessionBean(this.notacreditopuntoventaSessionBean);

				//this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrecio.gridx = 0;
				//this.jContentPaneDetalleTipoPrecio.add(this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Nota Creditos",this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPrecio.setComponentAt(iIndexTab,this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.notacreditopuntoventaBeanSwingJInternalFrame=null;//new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNotaCreditoPuntoVenta) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Nota Creditos",new JPanel());
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

				NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.notacreditosoliSessionBean.setEsGuardarRelacionado(true);

				this.notacreditosoliBeanSwingJInternalFrame=new NotaCreditoSoliBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.notacreditosoliBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.notacreditosoliBeanSwingJInternalFrame.setnotacreditosoliSessionBean(this.notacreditosoliSessionBean);

				//this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrecio.gridx = 0;
				//this.jContentPaneDetalleTipoPrecio.add(this.notacreditosoliBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Solicitud Nota Creditos",this.notacreditosoliBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPrecio.setComponentAt(iIndexTab,this.notacreditosoliBeanSwingJInternalFrame.getContentPane());
				}

				//NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.notacreditosoliSessionBean.setEsGuardarRelacionado(false);
				this.notacreditosoliBeanSwingJInternalFrame=null;//new NotaCreditoSoliBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNotaCreditoSoli) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Solicitud Nota Creditos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		this.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
		this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrocarteradefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrocarteradefectoBeanSwingJInternalFrame.setparametrocarteradefectoSessionBean(this.parametrocarteradefectoSessionBean);

				//this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrecio.gridx = 0;
				//this.jContentPaneDetalleTipoPrecio.add(this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Parametro Cartera Defectos",this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPrecio.setComponentAt(iIndexTab,this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroCarteraDefecto) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Parametro Cartera Defectos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePedidoExpor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidoexporSessionBean=new PedidoExporSessionBean();
		this.pedidoexporSessionBean.setConGuardarRelaciones(true);
		this.pedidoexporSessionBean.setEsGuardarRelacionado(true);

		this.pedidoexporBeanSwingJInternalFrame=null;//new PedidoExporBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidoexporBeanSwingJInternalFramePopup=new PedidoExporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidoexporBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidoexporSessionBean.getEsGuardarRelacionado()) {

				PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidoexporSessionBean.setEsGuardarRelacionado(true);

				this.pedidoexporBeanSwingJInternalFrame=new PedidoExporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidoexporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidoexporBeanSwingJInternalFrame.setpedidoexporSessionBean(this.pedidoexporSessionBean);

				//this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrecio.gridx = 0;
				//this.jContentPaneDetalleTipoPrecio.add(this.pedidoexporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Pedido Exportacions",this.pedidoexporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPrecio.setComponentAt(iIndexTab,this.pedidoexporBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidoexporSessionBean.setEsGuardarRelacionado(false);
				this.pedidoexporBeanSwingJInternalFrame=null;//new PedidoExporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidoexporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoExpor) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Pedido Exportacions",new JPanel());
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

				PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.pedidopuntoventaBeanSwingJInternalFrame=new PedidoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidopuntoventaBeanSwingJInternalFrame.setpedidopuntoventaSessionBean(this.pedidopuntoventaSessionBean);

				//this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrecio.gridx = 0;
				//this.jContentPaneDetalleTipoPrecio.add(this.pedidopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Pedido Punto Ventas",this.pedidopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPrecio.setComponentAt(iIndexTab,this.pedidopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.pedidopuntoventaBeanSwingJInternalFrame=null;//new PedidoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoPuntoVenta) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Pedido Punto Ventas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePoliticasCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.politicasclienteSessionBean=new PoliticasClienteSessionBean();
		this.politicasclienteSessionBean.setConGuardarRelaciones(false);
		this.politicasclienteSessionBean.setEsGuardarRelacionado(true);

		this.politicasclienteBeanSwingJInternalFrame=null;//new PoliticasClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.politicasclienteBeanSwingJInternalFramePopup=new PoliticasClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.politicasclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.politicasclienteSessionBean.getEsGuardarRelacionado()) {

				PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.politicasclienteSessionBean.setEsGuardarRelacionado(true);

				this.politicasclienteBeanSwingJInternalFrame=new PoliticasClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.politicasclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.politicasclienteBeanSwingJInternalFrame.setpoliticasclienteSessionBean(this.politicasclienteSessionBean);

				//this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrecio.gridx = 0;
				//this.jContentPaneDetalleTipoPrecio.add(this.politicasclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Politicas Clientes",this.politicasclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPrecio.setComponentAt(iIndexTab,this.politicasclienteBeanSwingJInternalFrame.getContentPane());
				}

				//PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.politicasclienteSessionBean.setEsGuardarRelacionado(false);
				this.politicasclienteBeanSwingJInternalFrame=null;//new PoliticasClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.politicasclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePoliticasCliente) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Politicas Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePrecio(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.precioSessionBean=new PrecioSessionBean();
		this.precioSessionBean.setConGuardarRelaciones(false);
		this.precioSessionBean.setEsGuardarRelacionado(true);

		this.precioBeanSwingJInternalFrame=null;//new PrecioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.precioBeanSwingJInternalFramePopup=new PrecioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.precioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.precioSessionBean.getEsGuardarRelacionado()) {

				PrecioJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				PrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.precioSessionBean.setEsGuardarRelacionado(true);

				this.precioBeanSwingJInternalFrame=new PrecioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.precioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.precioBeanSwingJInternalFrame.setprecioSessionBean(this.precioSessionBean);

				//this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrecio.gridx = 0;
				//this.jContentPaneDetalleTipoPrecio.add(this.precioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Precios",this.precioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPrecio.setComponentAt(iIndexTab,this.precioBeanSwingJInternalFrame.getContentPane());
				}

				//PrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.precioSessionBean.setEsGuardarRelacionado(false);
				this.precioBeanSwingJInternalFrame=null;//new PrecioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.precioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePrecio) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Precios",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProforma(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.proformaSessionBean=new ProformaSessionBean();
		this.proformaSessionBean.setConGuardarRelaciones(true);
		this.proformaSessionBean.setEsGuardarRelacionado(true);

		this.proformaBeanSwingJInternalFrame=null;//new ProformaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.proformaBeanSwingJInternalFramePopup=new ProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.proformaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.proformaSessionBean.getEsGuardarRelacionado()) {

				ProformaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.proformaSessionBean.setEsGuardarRelacionado(true);

				this.proformaBeanSwingJInternalFrame=new ProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.proformaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.proformaBeanSwingJInternalFrame.setproformaSessionBean(this.proformaSessionBean);

				//this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrecio.gridx = 0;
				//this.jContentPaneDetalleTipoPrecio.add(this.proformaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Proformas",this.proformaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPrecio.setComponentAt(iIndexTab,this.proformaBeanSwingJInternalFrame.getContentPane());
				}

				//ProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.proformaSessionBean.setEsGuardarRelacionado(false);
				this.proformaBeanSwingJInternalFrame=null;//new ProformaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.proformaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProforma) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Proformas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameServicioCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.servicioclienteSessionBean=new ServicioClienteSessionBean();
		this.servicioclienteSessionBean.setConGuardarRelaciones(false);
		this.servicioclienteSessionBean.setEsGuardarRelacionado(true);

		this.servicioclienteBeanSwingJInternalFrame=null;//new ServicioClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.servicioclienteBeanSwingJInternalFramePopup=new ServicioClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.servicioclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.servicioclienteSessionBean.getEsGuardarRelacionado()) {

				ServicioClienteJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				ServicioClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.servicioclienteSessionBean.setEsGuardarRelacionado(true);

				this.servicioclienteBeanSwingJInternalFrame=new ServicioClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.servicioclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.servicioclienteBeanSwingJInternalFrame.setservicioclienteSessionBean(this.servicioclienteSessionBean);

				//this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrecio.gridx = 0;
				//this.jContentPaneDetalleTipoPrecio.add(this.servicioclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Servicio Clientes",this.servicioclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPrecio.setComponentAt(iIndexTab,this.servicioclienteBeanSwingJInternalFrame.getContentPane());
				}

				//ServicioClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.servicioclienteSessionBean.setEsGuardarRelacionado(false);
				this.servicioclienteBeanSwingJInternalFrame=null;//new ServicioClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteServicioCliente) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Servicio Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameUtilidadTipoPrecio(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.utilidadtipoprecioSessionBean=new UtilidadTipoPrecioSessionBean();
		this.utilidadtipoprecioSessionBean.setConGuardarRelaciones(false);
		this.utilidadtipoprecioSessionBean.setEsGuardarRelacionado(true);

		this.utilidadtipoprecioBeanSwingJInternalFrame=null;//new UtilidadTipoPrecioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.utilidadtipoprecioBeanSwingJInternalFramePopup=new UtilidadTipoPrecioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.utilidadtipoprecioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {

				UtilidadTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
				UtilidadTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.utilidadtipoprecioSessionBean.setEsGuardarRelacionado(true);

				this.utilidadtipoprecioBeanSwingJInternalFrame=new UtilidadTipoPrecioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.utilidadtipoprecioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.utilidadtipoprecioBeanSwingJInternalFrame.setutilidadtipoprecioSessionBean(this.utilidadtipoprecioSessionBean);

				//this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrecio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrecio.gridx = 0;
				//this.jContentPaneDetalleTipoPrecio.add(this.utilidadtipoprecioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrecio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Utilidad Tipo Precioes",this.utilidadtipoprecioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPrecio.setComponentAt(iIndexTab,this.utilidadtipoprecioBeanSwingJInternalFrame.getContentPane());
				}

				//UtilidadTipoPrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.utilidadtipoprecioSessionBean.setEsGuardarRelacionado(false);
				this.utilidadtipoprecioBeanSwingJInternalFrame=null;//new UtilidadTipoPrecioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteUtilidadTipoPrecio) {
					this.jTabbedPaneRelacionesTipoPrecio.add("Utilidad Tipo Precioes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPrecioBeanSwingJInternalFrame(List<TipoPrecio> tipoprecios,TipoPrecio tipoprecio,PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//precioBeanSwingJInternalFrame=new PrecioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					precioBeanSwingJInternalFrame.getPrecioLogic().setConnexion(this.tipoprecioLogic.getConnexion());

					precioBeanSwingJInternalFrame.settipopreciosForeignKey(tipoprecios);
					precioBeanSwingJInternalFrame.settipoprecioForeignKey(tipoprecio);
					precioBeanSwingJInternalFrame.precioSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrecio(true);
					precioBeanSwingJInternalFrame.precioSessionBean.setlidTipoPrecioActual(tipoprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					precioBeanSwingJInternalFrame.cargarCombosForeignKeyPrecio(precioBeanSwingJInternalFrame.isCargarCombosDependencia);
					precioBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrecio(true);
					precioBeanSwingJInternalFrame.setid_tipo_precioFK_IdTipoPrecio(tipoprecio.getId());

					if(!this.conCargarFormDetalle) {
						precioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					precioBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrecioForeignKey(tipoprecio,1,false,true,true);
					precioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					precioBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrecio");
					precioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrecio");
					precioBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrecio(true);
					precioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPrecio("n",precioBeanSwingJInternalFrame.isGuardarCambiosEnLote, precioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					precioBeanSwingJInternalFrame.setAutoscrolls(true);
					precioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						precioBeanSwingJInternalFrame.actualizarEstadoPanelsPrecio("relacionado");
					} else {
						precioBeanSwingJInternalFrame.actualizarEstadoPanelsPrecio("no_relacionado");
					}

					precioBeanSwingJInternalFrame.getjButtonRecargarInformacionPrecio().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarUtilidadTipoPrecioBeanSwingJInternalFrame(List<TipoPrecio> tipoprecios,TipoPrecio tipoprecio,UtilidadTipoPrecioBeanSwingJInternalFrame utilidadtipoprecioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//utilidadtipoprecioBeanSwingJInternalFrame=new UtilidadTipoPrecioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					utilidadtipoprecioBeanSwingJInternalFrame.getUtilidadTipoPrecioLogic().setConnexion(this.tipoprecioLogic.getConnexion());

					utilidadtipoprecioBeanSwingJInternalFrame.settipopreciosForeignKey(tipoprecios);
					utilidadtipoprecioBeanSwingJInternalFrame.settipoprecioForeignKey(tipoprecio);
					utilidadtipoprecioBeanSwingJInternalFrame.utilidadtipoprecioSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrecio(true);
					utilidadtipoprecioBeanSwingJInternalFrame.utilidadtipoprecioSessionBean.setlidTipoPrecioActual(tipoprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					utilidadtipoprecioBeanSwingJInternalFrame.cargarCombosForeignKeyUtilidadTipoPrecio(utilidadtipoprecioBeanSwingJInternalFrame.isCargarCombosDependencia);
					utilidadtipoprecioBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrecio(true);
					utilidadtipoprecioBeanSwingJInternalFrame.setid_tipo_precioFK_IdTipoPrecio(tipoprecio.getId());

					if(!this.conCargarFormDetalle) {
						utilidadtipoprecioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					utilidadtipoprecioBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrecioForeignKey(tipoprecio,1,false,true,true);
					utilidadtipoprecioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					utilidadtipoprecioBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrecio");
					utilidadtipoprecioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrecio");
					utilidadtipoprecioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUtilidadTipoPrecio(true);
					utilidadtipoprecioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesUtilidadTipoPrecio("n",utilidadtipoprecioBeanSwingJInternalFrame.isGuardarCambiosEnLote, utilidadtipoprecioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					utilidadtipoprecioBeanSwingJInternalFrame.setAutoscrolls(true);
					utilidadtipoprecioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						utilidadtipoprecioBeanSwingJInternalFrame.actualizarEstadoPanelsUtilidadTipoPrecio("relacionado");
					} else {
						utilidadtipoprecioBeanSwingJInternalFrame.actualizarEstadoPanelsUtilidadTipoPrecio("no_relacionado");
					}

					utilidadtipoprecioBeanSwingJInternalFrame.getjButtonRecargarInformacionUtilidadTipoPrecio().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPedidoPuntoVentaBeanSwingJInternalFrame(List<TipoPrecio> tipoprecios,TipoPrecio tipoprecio,PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidopuntoventaBeanSwingJInternalFrame=new PedidoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidopuntoventaBeanSwingJInternalFrame.getPedidoPuntoVentaLogic().setConnexion(this.tipoprecioLogic.getConnexion());

					pedidopuntoventaBeanSwingJInternalFrame.settipopreciosForeignKey(tipoprecios);
					pedidopuntoventaBeanSwingJInternalFrame.settipoprecioForeignKey(tipoprecio);
					pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrecio(true);
					pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.setlidTipoPrecioActual(tipoprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoPuntoVenta(pedidopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrecio(true);
					pedidopuntoventaBeanSwingJInternalFrame.setid_tipo_precioFK_IdTipoPrecio(tipoprecio.getId());

					if(!this.conCargarFormDetalle) {
						pedidopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrecioForeignKey(tipoprecio,1,false,true,true);
					pedidopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrecio");
					pedidopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrecio");
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

		public void cargarParametroCarteraDefectoBeanSwingJInternalFrame(List<TipoPrecio> tipoprecios,TipoPrecio tipoprecio,ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrocarteradefectoBeanSwingJInternalFrame.getParametroCarteraDefectoLogic().setConnexion(this.tipoprecioLogic.getConnexion());

					parametrocarteradefectoBeanSwingJInternalFrame.settipopreciosForeignKey(tipoprecios);
					parametrocarteradefectoBeanSwingJInternalFrame.settipoprecioForeignKey(tipoprecio);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrecio(true);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setlidTipoPrecioActual(tipoprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrocarteradefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroCarteraDefecto(parametrocarteradefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrecio(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setid_tipo_precioFK_IdTipoPrecio(tipoprecio.getId());

					if(!this.conCargarFormDetalle) {
						parametrocarteradefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrocarteradefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrecioForeignKey(tipoprecio,1,false,true,true);
					parametrocarteradefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrocarteradefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrecio");
					parametrocarteradefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrecio");
					parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(true);
					parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroCarteraDefecto("n",parametrocarteradefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrocarteradefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrocarteradefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("relacionado");
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");
					}

					parametrocarteradefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroCarteraDefecto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDescuentoTipoPrecioBeanSwingJInternalFrame(List<TipoPrecio> tipoprecios,TipoPrecio tipoprecio,DescuentoTipoPrecioBeanSwingJInternalFrame descuentotipoprecioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//descuentotipoprecioBeanSwingJInternalFrame=new DescuentoTipoPrecioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					descuentotipoprecioBeanSwingJInternalFrame.getDescuentoTipoPrecioLogic().setConnexion(this.tipoprecioLogic.getConnexion());

					descuentotipoprecioBeanSwingJInternalFrame.settipopreciosForeignKey(tipoprecios);
					descuentotipoprecioBeanSwingJInternalFrame.settipoprecioForeignKey(tipoprecio);
					descuentotipoprecioBeanSwingJInternalFrame.descuentotipoprecioSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrecio(true);
					descuentotipoprecioBeanSwingJInternalFrame.descuentotipoprecioSessionBean.setlidTipoPrecioActual(tipoprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					descuentotipoprecioBeanSwingJInternalFrame.cargarCombosForeignKeyDescuentoTipoPrecio(descuentotipoprecioBeanSwingJInternalFrame.isCargarCombosDependencia);
					descuentotipoprecioBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrecio(true);
					descuentotipoprecioBeanSwingJInternalFrame.setid_tipo_precioFK_IdTipoPrecio(tipoprecio.getId());

					if(!this.conCargarFormDetalle) {
						descuentotipoprecioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					descuentotipoprecioBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrecioForeignKey(tipoprecio,1,false,true,true);
					descuentotipoprecioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					descuentotipoprecioBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrecio");
					descuentotipoprecioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrecio");
					descuentotipoprecioBeanSwingJInternalFrame.inicializarActualizarBindingTablaDescuentoTipoPrecio(true);
					descuentotipoprecioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDescuentoTipoPrecio("n",descuentotipoprecioBeanSwingJInternalFrame.isGuardarCambiosEnLote, descuentotipoprecioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					descuentotipoprecioBeanSwingJInternalFrame.setAutoscrolls(true);
					descuentotipoprecioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						descuentotipoprecioBeanSwingJInternalFrame.actualizarEstadoPanelsDescuentoTipoPrecio("relacionado");
					} else {
						descuentotipoprecioBeanSwingJInternalFrame.actualizarEstadoPanelsDescuentoTipoPrecio("no_relacionado");
					}

					descuentotipoprecioBeanSwingJInternalFrame.getjButtonRecargarInformacionDescuentoTipoPrecio().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPoliticasClienteBeanSwingJInternalFrame(List<TipoPrecio> tipoprecios,TipoPrecio tipoprecio,PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//politicasclienteBeanSwingJInternalFrame=new PoliticasClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					politicasclienteBeanSwingJInternalFrame.getPoliticasClienteLogic().setConnexion(this.tipoprecioLogic.getConnexion());

					politicasclienteBeanSwingJInternalFrame.settipopreciosForeignKey(tipoprecios);
					politicasclienteBeanSwingJInternalFrame.settipoprecioForeignKey(tipoprecio);
					politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrecio(true);
					politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setlidTipoPrecioActual(tipoprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					politicasclienteBeanSwingJInternalFrame.cargarCombosForeignKeyPoliticasCliente(politicasclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					politicasclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrecio(true);
					politicasclienteBeanSwingJInternalFrame.setid_tipo_precioFK_IdTipoPrecio(tipoprecio.getId());

					if(!this.conCargarFormDetalle) {
						politicasclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					politicasclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrecioForeignKey(tipoprecio,1,false,true,true);
					politicasclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					politicasclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrecio");
					politicasclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrecio");
					politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPoliticasCliente(true);
					politicasclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPoliticasCliente("n",politicasclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, politicasclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingPoliticasCliente(false);
					politicasclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					politicasclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						politicasclienteBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticasCliente("relacionado");
					} else {
						politicasclienteBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticasCliente("no_relacionado");
					}

					politicasclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionPoliticasCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProformaBeanSwingJInternalFrame(List<TipoPrecio> tipoprecios,TipoPrecio tipoprecio,ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//proformaBeanSwingJInternalFrame=new ProformaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					proformaBeanSwingJInternalFrame.getProformaLogic().setConnexion(this.tipoprecioLogic.getConnexion());

					proformaBeanSwingJInternalFrame.settipopreciosForeignKey(tipoprecios);
					proformaBeanSwingJInternalFrame.settipoprecioForeignKey(tipoprecio);
					proformaBeanSwingJInternalFrame.proformaSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrecio(true);
					proformaBeanSwingJInternalFrame.proformaSessionBean.setlidTipoPrecioActual(tipoprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					proformaBeanSwingJInternalFrame.cargarCombosForeignKeyProforma(proformaBeanSwingJInternalFrame.isCargarCombosDependencia);
					proformaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrecio(true);
					proformaBeanSwingJInternalFrame.setid_tipo_precioFK_IdTipoPrecio(tipoprecio.getId());

					if(!this.conCargarFormDetalle) {
						proformaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					proformaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrecioForeignKey(tipoprecio,1,false,true,true);
					proformaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					proformaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrecio");
					proformaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrecio");
					proformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProforma(true);
					proformaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProforma("n",proformaBeanSwingJInternalFrame.isGuardarCambiosEnLote, proformaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					proformaBeanSwingJInternalFrame.setAutoscrolls(true);
					proformaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						proformaBeanSwingJInternalFrame.actualizarEstadoPanelsProforma("relacionado");
					} else {
						proformaBeanSwingJInternalFrame.actualizarEstadoPanelsProforma("no_relacionado");
					}

					proformaBeanSwingJInternalFrame.getjButtonRecargarInformacionProforma().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarNotaCreditoSoliBeanSwingJInternalFrame(List<TipoPrecio> tipoprecios,TipoPrecio tipoprecio,NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//notacreditosoliBeanSwingJInternalFrame=new NotaCreditoSoliBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					notacreditosoliBeanSwingJInternalFrame.getNotaCreditoSoliLogic().setConnexion(this.tipoprecioLogic.getConnexion());

					notacreditosoliBeanSwingJInternalFrame.settipopreciosForeignKey(tipoprecios);
					notacreditosoliBeanSwingJInternalFrame.settipoprecioForeignKey(tipoprecio);
					notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrecio(true);
					notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setlidTipoPrecioActual(tipoprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					notacreditosoliBeanSwingJInternalFrame.cargarCombosForeignKeyNotaCreditoSoli(notacreditosoliBeanSwingJInternalFrame.isCargarCombosDependencia);
					notacreditosoliBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrecio(true);
					notacreditosoliBeanSwingJInternalFrame.setid_tipo_precioFK_IdTipoPrecio(tipoprecio.getId());

					if(!this.conCargarFormDetalle) {
						notacreditosoliBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					notacreditosoliBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrecioForeignKey(tipoprecio,1,false,true,true);
					notacreditosoliBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					notacreditosoliBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrecio");
					notacreditosoliBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrecio");
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

		public void cargarConsignacionBeanSwingJInternalFrame(List<TipoPrecio> tipoprecios,TipoPrecio tipoprecio,ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//consignacionBeanSwingJInternalFrame=new ConsignacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					consignacionBeanSwingJInternalFrame.getConsignacionLogic().setConnexion(this.tipoprecioLogic.getConnexion());

					consignacionBeanSwingJInternalFrame.settipopreciosForeignKey(tipoprecios);
					consignacionBeanSwingJInternalFrame.settipoprecioForeignKey(tipoprecio);
					consignacionBeanSwingJInternalFrame.consignacionSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrecio(true);
					consignacionBeanSwingJInternalFrame.consignacionSessionBean.setlidTipoPrecioActual(tipoprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					consignacionBeanSwingJInternalFrame.cargarCombosForeignKeyConsignacion(consignacionBeanSwingJInternalFrame.isCargarCombosDependencia);
					consignacionBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrecio(true);
					consignacionBeanSwingJInternalFrame.setid_tipo_precioFK_IdTipoPrecio(tipoprecio.getId());

					if(!this.conCargarFormDetalle) {
						consignacionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					consignacionBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrecioForeignKey(tipoprecio,1,false,true,true);
					consignacionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					consignacionBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrecio");
					consignacionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrecio");
					consignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaConsignacion(true);
					consignacionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesConsignacion("n",consignacionBeanSwingJInternalFrame.isGuardarCambiosEnLote, consignacionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					consignacionBeanSwingJInternalFrame.setAutoscrolls(true);
					consignacionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						consignacionBeanSwingJInternalFrame.actualizarEstadoPanelsConsignacion("relacionado");
					} else {
						consignacionBeanSwingJInternalFrame.actualizarEstadoPanelsConsignacion("no_relacionado");
					}

					consignacionBeanSwingJInternalFrame.getjButtonRecargarInformacionConsignacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPedidoExporBeanSwingJInternalFrame(List<TipoPrecio> tipoprecios,TipoPrecio tipoprecio,PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidoexporBeanSwingJInternalFrame=new PedidoExporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidoexporBeanSwingJInternalFrame.getPedidoExporLogic().setConnexion(this.tipoprecioLogic.getConnexion());

					pedidoexporBeanSwingJInternalFrame.settipopreciosForeignKey(tipoprecios);
					pedidoexporBeanSwingJInternalFrame.settipoprecioForeignKey(tipoprecio);
					pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrecio(true);
					pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setlidTipoPrecioActual(tipoprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidoexporBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoExpor(pedidoexporBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidoexporBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrecio(true);
					pedidoexporBeanSwingJInternalFrame.setid_tipo_precioFK_IdTipoPrecio(tipoprecio.getId());

					if(!this.conCargarFormDetalle) {
						pedidoexporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidoexporBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrecioForeignKey(tipoprecio,1,false,true,true);
					pedidoexporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidoexporBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrecio");
					pedidoexporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrecio");
					pedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoExpor(true);
					pedidoexporBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedidoExpor("n",pedidoexporBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidoexporBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidoexporBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidoexporBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoExpor("relacionado");
					} else {
						pedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoExpor("no_relacionado");
					}

					pedidoexporBeanSwingJInternalFrame.getjButtonRecargarInformacionPedidoExpor().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarServicioClienteBeanSwingJInternalFrame(List<TipoPrecio> tipoprecios,TipoPrecio tipoprecio,ServicioClienteBeanSwingJInternalFrame servicioclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//servicioclienteBeanSwingJInternalFrame=new ServicioClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					servicioclienteBeanSwingJInternalFrame.getServicioClienteLogic().setConnexion(this.tipoprecioLogic.getConnexion());

					servicioclienteBeanSwingJInternalFrame.settipopreciosForeignKey(tipoprecios);
					servicioclienteBeanSwingJInternalFrame.settipoprecioForeignKey(tipoprecio);
					servicioclienteBeanSwingJInternalFrame.servicioclienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrecio(true);
					servicioclienteBeanSwingJInternalFrame.servicioclienteSessionBean.setlidTipoPrecioActual(tipoprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					servicioclienteBeanSwingJInternalFrame.cargarCombosForeignKeyServicioCliente(servicioclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					servicioclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrecio(true);
					servicioclienteBeanSwingJInternalFrame.setid_tipo_precioFK_IdTipoPrecio(tipoprecio.getId());

					if(!this.conCargarFormDetalle) {
						servicioclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					servicioclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrecioForeignKey(tipoprecio,1,false,true,true);
					servicioclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					servicioclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrecio");
					servicioclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrecio");
					servicioclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaServicioCliente(true);
					servicioclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesServicioCliente("n",servicioclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, servicioclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					servicioclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					servicioclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						servicioclienteBeanSwingJInternalFrame.actualizarEstadoPanelsServicioCliente("relacionado");
					} else {
						servicioclienteBeanSwingJInternalFrame.actualizarEstadoPanelsServicioCliente("no_relacionado");
					}

					servicioclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionServicioCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFacturaPuntoVentaBeanSwingJInternalFrame(List<TipoPrecio> tipoprecios,TipoPrecio tipoprecio,FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//facturapuntoventaBeanSwingJInternalFrame=new FacturaPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					facturapuntoventaBeanSwingJInternalFrame.getFacturaPuntoVentaLogic().setConnexion(this.tipoprecioLogic.getConnexion());

					facturapuntoventaBeanSwingJInternalFrame.settipopreciosForeignKey(tipoprecios);
					facturapuntoventaBeanSwingJInternalFrame.settipoprecioForeignKey(tipoprecio);
					facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrecio(true);
					facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setlidTipoPrecioActual(tipoprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					facturapuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyFacturaPuntoVenta(facturapuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					facturapuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrecio(true);
					facturapuntoventaBeanSwingJInternalFrame.setid_tipo_precioFK_IdTipoPrecio(tipoprecio.getId());

					if(!this.conCargarFormDetalle) {
						facturapuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					facturapuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrecioForeignKey(tipoprecio,1,false,true,true);
					facturapuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					facturapuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrecio");
					facturapuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrecio");
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

		public void cargarGuiaRemisionBeanSwingJInternalFrame(List<TipoPrecio> tipoprecios,TipoPrecio tipoprecio,GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//guiaremisionBeanSwingJInternalFrame=new GuiaRemisionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					guiaremisionBeanSwingJInternalFrame.getGuiaRemisionLogic().setConnexion(this.tipoprecioLogic.getConnexion());

					guiaremisionBeanSwingJInternalFrame.settipopreciosForeignKey(tipoprecios);
					guiaremisionBeanSwingJInternalFrame.settipoprecioForeignKey(tipoprecio);
					guiaremisionBeanSwingJInternalFrame.guiaremisionSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrecio(true);
					guiaremisionBeanSwingJInternalFrame.guiaremisionSessionBean.setlidTipoPrecioActual(tipoprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					guiaremisionBeanSwingJInternalFrame.cargarCombosForeignKeyGuiaRemision(guiaremisionBeanSwingJInternalFrame.isCargarCombosDependencia);
					guiaremisionBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrecio(true);
					guiaremisionBeanSwingJInternalFrame.setid_tipo_precioFK_IdTipoPrecio(tipoprecio.getId());

					if(!this.conCargarFormDetalle) {
						guiaremisionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					guiaremisionBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrecioForeignKey(tipoprecio,1,false,true,true);
					guiaremisionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					guiaremisionBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrecio");
					guiaremisionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrecio");
					guiaremisionBeanSwingJInternalFrame.inicializarActualizarBindingTablaGuiaRemision(true);
					guiaremisionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesGuiaRemision("n",guiaremisionBeanSwingJInternalFrame.isGuardarCambiosEnLote, guiaremisionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					guiaremisionBeanSwingJInternalFrame.setAutoscrolls(true);
					guiaremisionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						guiaremisionBeanSwingJInternalFrame.actualizarEstadoPanelsGuiaRemision("relacionado");
					} else {
						guiaremisionBeanSwingJInternalFrame.actualizarEstadoPanelsGuiaRemision("no_relacionado");
					}

					guiaremisionBeanSwingJInternalFrame.getjButtonRecargarInformacionGuiaRemision().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarClienteBeanSwingJInternalFrame(List<TipoPrecio> tipoprecios,TipoPrecio tipoprecio,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.tipoprecioLogic.getConnexion());

					clienteBeanSwingJInternalFrame.settipopreciosForeignKey(tipoprecios);
					clienteBeanSwingJInternalFrame.settipoprecioForeignKey(tipoprecio);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrecio(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidTipoPrecioActual(tipoprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrecio(true);
					clienteBeanSwingJInternalFrame.setid_tipo_precioFK_IdTipoPrecio(tipoprecio.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrecioForeignKey(tipoprecio,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrecio");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrecio");
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

		public void cargarNotaCreditoPuntoVentaBeanSwingJInternalFrame(List<TipoPrecio> tipoprecios,TipoPrecio tipoprecio,NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//notacreditopuntoventaBeanSwingJInternalFrame=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					notacreditopuntoventaBeanSwingJInternalFrame.getNotaCreditoPuntoVentaLogic().setConnexion(this.tipoprecioLogic.getConnexion());

					notacreditopuntoventaBeanSwingJInternalFrame.settipopreciosForeignKey(tipoprecios);
					notacreditopuntoventaBeanSwingJInternalFrame.settipoprecioForeignKey(tipoprecio);
					notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrecio(true);
					notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setlidTipoPrecioActual(tipoprecio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					notacreditopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyNotaCreditoPuntoVenta(notacreditopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					notacreditopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrecio(true);
					notacreditopuntoventaBeanSwingJInternalFrame.setid_tipo_precioFK_IdTipoPrecio(tipoprecio.getId());

					if(!this.conCargarFormDetalle) {
						notacreditopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					notacreditopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrecioForeignKey(tipoprecio,1,false,true,true);
					notacreditopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					notacreditopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrecio");
					notacreditopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrecio");
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
