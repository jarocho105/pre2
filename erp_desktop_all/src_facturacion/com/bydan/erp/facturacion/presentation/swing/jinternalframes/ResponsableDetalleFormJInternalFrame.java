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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.ResponsableConstantesFunciones;

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
public class ResponsableDetalleFormJInternalFrame extends ResponsableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleResponsable;
	
	protected JMenuBar jmenuBarDetalleResponsable;
	
	protected JMenu jmenuDetalleResponsable;
	protected JMenu jmenuDetalleArchivoResponsable;
	protected JMenu jmenuDetalleAccionesResponsable;
	protected JMenu jmenuDetalleDatosResponsable;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleResponsable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutResponsable;	
	protected GridBagConstraints gridBagConstraintsResponsable;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ResponsableBeanSwingJInternalFrameAdditional jInternalFrameDetalleResponsable;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public ResponsableSessionBean responsableSessionBean;
	
	

	public FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame=null;
	public FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFactura=false;
	public FacturaSessionBean facturaSessionBean;

	public ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame=null;
	public ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteConsignacion=false;
	public ConsignacionSessionBean consignacionSessionBean;

	public PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame=null;
	public PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoExpor=false;
	public PedidoExporSessionBean pedidoexporSessionBean;

	public PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame=null;
	public PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedido=false;
	public PedidoSessionBean pedidoSessionBean;

	public NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame=null;
	public NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNotaCreditoSoli=false;
	public NotaCreditoSoliSessionBean notacreditosoliSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public UsuarioSessionBean usuarioSessionBean;	
	
	public ResponsableLogic responsableLogic;
	
	public JScrollPane jScrollPanelDatosResponsable;
	public JScrollPane jScrollPanelDatosEdicionResponsable;
	public JScrollPane jScrollPanelDatosGeneralResponsable;
	
	protected JPanel jPanelCamposResponsable;    
	protected JPanel jPanelCamposOcultosResponsable;    	
	protected JPanel jPanelAccionesResponsable;
	protected JPanel jPanelAccionesFormularioResponsable;
    
	
	
	protected Integer iXPanelCamposResponsable=0;
	protected Integer iYPanelCamposResponsable=0;
	
	protected Integer iXPanelCamposOcultosResponsable=0;
	protected Integer iYPanelCamposOcultosResponsable=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoResponsable;
	public JButton jButtonModificarResponsable;
	public JButton jButtonActualizarResponsable;
    public JButton jButtonEliminarResponsable;
	public JButton jButtonCancelarResponsable;
    public JButton jButtonGuardarCambiosResponsable;
	public JButton jButtonGuardarCambiosTablaResponsable;
	protected JButton jButtonCerrarResponsable;
	
	
	protected JButton jButtonProcesarInformacionResponsable;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoResponsable;
	protected JCheckBox jCheckBoxPostAccionSinCerrarResponsable;
	protected JCheckBox jCheckBoxPostAccionSinMensajeResponsable;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarResponsable;
	protected JButton jButtonModificarToolBarResponsable;
	protected JButton jButtonActualizarToolBarResponsable;
    protected JButton jButtonEliminarToolBarResponsable;
	protected JButton jButtonCancelarToolBarResponsable;
    protected JButton jButtonGuardarCambiosToolBarResponsable;
	protected JButton jButtonGuardarCambiosTablaToolBarResponsable;
	protected JButton jButtonMostrarOcultarTablaToolBarResponsable;
	protected JButton jButtonCerrarToolBarResponsable;
	
	protected JButton jButtonProcesarInformacionToolBarResponsable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoResponsable;
	protected JMenuItem jMenuItemModificarResponsable;
	protected JMenuItem jMenuItemActualizarResponsable;
    protected JMenuItem jMenuItemEliminarResponsable;
	protected JMenuItem jMenuItemCancelarResponsable;
    protected JMenuItem jMenuItemGuardarCambiosResponsable;
	protected JMenuItem jMenuItemGuardarCambiosTablaResponsable;
	protected JMenuItem jMenuItemCerrarResponsable;
	protected JMenuItem jMenuItemDetalleCerrarResponsable;
	protected JMenuItem jMenuItemDetalleMostarOcultarResponsable;
	
	protected JMenuItem jMenuItemProcesarInformacionResponsable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosResponsable;
	protected JMenuItem jMenuItemMostrarOcultarResponsable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesResponsable;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesResponsable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesResponsable;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioResponsable;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidResponsable;
	public JLabel jLabelIdResponsable;
	public JLabel jLabelidResponsable;
	public JButton jButtonidResponsableBusqueda= new JButtonMe();

	public JPanel jPanelidentificacionResponsable;
	public JLabel jLabelidentificacionResponsable;
	public JTextField jTextFieldidentificacionResponsable;
	public JButton jButtonidentificacionResponsableBusqueda= new JButtonMe();

	public JPanel jPanelrucResponsable;
	public JLabel jLabelrucResponsable;
	public JTextField jTextFieldrucResponsable;
	public JButton jButtonrucResponsableBusqueda= new JButtonMe();

	public JPanel jPanelnombreResponsable;
	public JLabel jLabelnombreResponsable;
	public JTextArea jTextAreanombreResponsable;
	public JScrollPane jscrollPanenombreResponsable;
	public JButton jButtonnombreResponsableBusqueda= new JButtonMe();

	public JPanel jPanelapellidoResponsable;
	public JLabel jLabelapellidoResponsable;
	public JTextArea jTextAreaapellidoResponsable;
	public JScrollPane jscrollPaneapellidoResponsable;
	public JButton jButtonapellidoResponsableBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoResponsable;
	public JLabel jLabelnombre_completoResponsable;
	public JTextArea jTextAreanombre_completoResponsable;
	public JScrollPane jscrollPanenombre_completoResponsable;
	public JButton jButtonnombre_completoResponsableBusqueda= new JButtonMe();

	public JPanel jPanelemailResponsable;
	public JLabel jLabelemailResponsable;
	public JTextArea jTextAreaemailResponsable;
	public JScrollPane jscrollPaneemailResponsable;
	public JButton jButtonemailResponsableBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoResponsable;
	public JLabel jLabeltelefonoResponsable;
	public JTextField jTextFieldtelefonoResponsable;
	public JButton jButtontelefonoResponsableBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_celularResponsable;
	public JLabel jLabeltelefono_celularResponsable;
	public JTextField jTextFieldtelefono_celularResponsable;
	public JButton jButtontelefono_celularResponsableBusqueda= new JButtonMe();

	public JPanel jPaneldireccionResponsable;
	public JLabel jLabeldireccionResponsable;
	public JTextArea jTextAreadireccionResponsable;
	public JScrollPane jscrollPanedireccionResponsable;
	public JButton jButtondireccionResponsableBusqueda= new JButtonMe();

	public JPanel jPanelfaxResponsable;
	public JLabel jLabelfaxResponsable;
	public JTextField jTextFieldfaxResponsable;
	public JButton jButtonfaxResponsableBusqueda= new JButtonMe();

	public JPanel jPanelobservacionResponsable;
	public JLabel jLabelobservacionResponsable;
	public JTextArea jTextAreaobservacionResponsable;
	public JScrollPane jscrollPaneobservacionResponsable;
	public JButton jButtonobservacionResponsableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaResponsable;
	public JLabel jLabelid_empresaResponsable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaResponsable;
	public JButton jButtonid_empresaResponsable= new JButtonMe();
	public JButton jButtonid_empresaResponsableUpdate= new JButtonMe();
	public JButton jButtonid_empresaResponsableBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalResponsable;
	public JLabel jLabelid_sucursalResponsable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalResponsable;
	public JButton jButtonid_sucursalResponsable= new JButtonMe();
	public JButton jButtonid_sucursalResponsableUpdate= new JButtonMe();
	public JButton jButtonid_sucursalResponsableBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteResponsable;
	public JLabel jLabelid_clienteResponsable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteResponsable;
	public JButton jButtonid_clienteResponsable= new JButtonMe();
	public JButton jButtonid_clienteResponsableUpdate= new JButtonMe();
	public JButton jButtonid_clienteResponsableBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioResponsable;
	public JLabel jLabelid_usuarioResponsable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioResponsable;
	public JButton jButtonid_usuarioResponsable= new JButtonMe();
	public JButton jButtonid_usuarioResponsableUpdate= new JButtonMe();
	public JButton jButtonid_usuarioResponsableBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesResponsable;
	
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
	public int iHeightFormulario=880;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ResponsableDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposResponsable=new JPanel();
				this.jPanelAccionesFormularioResponsable=new JPanel();
				this.jmenuBarDetalleResponsable=new JMenuBar();
				this.jTtoolBarDetalleResponsable=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Responsable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ResponsableDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Responsable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Responsable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Responsable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Responsable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarResponsable() {
		return this.jButtonActualizarToolBarResponsable;
	}
	
	public JButton getjButtonEliminarToolBarResponsable() {
		return this.jButtonEliminarToolBarResponsable;
	}
	
	public JButton getjButtonCancelarToolBarResponsable() {
		return this.jButtonCancelarToolBarResponsable;
	}		
	
	public JButton getjButtonProcesarInformacionResponsable() {
		return this.jButtonProcesarInformacionResponsable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionResponsable)	{
		this.jButtonProcesarInformacionResponsable = jButtonProcesarInformacionResponsable;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesResponsable() {
		return this.jComboBoxTiposAccionesResponsable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesResponsable(
			JComboBox jComboBoxTiposRelacionesResponsable) {
		this.jComboBoxTiposRelacionesResponsable = jComboBoxTiposRelacionesResponsable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesResponsable(
			JComboBox jComboBoxTiposAccionesResponsable) {
		this.jComboBoxTiposAccionesResponsable = jComboBoxTiposAccionesResponsable;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioResponsable() {
		return this.jComboBoxTiposAccionesFormularioResponsable;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioResponsable(
			JComboBox jComboBoxTiposAccionesFormularioResponsable) {
		this.jComboBoxTiposAccionesFormularioResponsable = jComboBoxTiposAccionesFormularioResponsable;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.responsableSessionBean=new ResponsableSessionBean();
		
		this.responsableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.responsableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.responsableSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.facturaSessionBean=new FacturaSessionBean();
		//this.consignacionSessionBean=new ConsignacionSessionBean();
		//this.pedidoexporSessionBean=new PedidoExporSessionBean();
		//this.pedidoSessionBean=new PedidoSessionBean();
		//this.notacreditosoliSessionBean=new NotaCreditoSoliSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ResponsableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Responsable MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
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
	
		ResponsableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleResponsable= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarResponsable=new JButtonMe();
				this.jButtonModificarToolBarResponsable=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarResponsable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarResponsable,this.jTtoolBarDetalleResponsable,
							"actualizar","actualizar","Actualizar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarResponsable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarResponsable,this.jTtoolBarDetalleResponsable,
							"eliminar","eliminar","Eliminar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarResponsable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarResponsable,this.jTtoolBarDetalleResponsable,
							"cancelar","cancelar","Cancelar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarResponsable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarResponsable,this.jTtoolBarDetalleResponsable,
							"guardarcambios","guardarcambios","Guardar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarResponsable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarResponsable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarResponsable,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleResponsable=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleResponsable=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoResponsable=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesResponsable=new JMenuMe("Acciones");
		this.jmenuDetalleDatosResponsable=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoResponsable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoResponsable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoResponsable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarResponsable= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarResponsable.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarResponsable,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarResponsable= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarResponsable.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarResponsable,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarResponsable= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarResponsable.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarResponsable,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarResponsable= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarResponsable.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarResponsable,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosResponsable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosResponsable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosResponsable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarResponsable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarResponsable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarResponsable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarResponsable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarResponsable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarResponsable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarResponsable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarResponsable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarResponsable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarResponsable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarResponsable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarResponsable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoResponsable.add(this.jMenuItemDetalleCerrarResponsable);
		
		this.jmenuDetalleAccionesResponsable.add(this.jMenuItemActualizarResponsable);
		this.jmenuDetalleAccionesResponsable.add(this.jMenuItemEliminarResponsable);
		this.jmenuDetalleAccionesResponsable.add(this.jMenuItemCancelarResponsable);		
		
		//this.jmenuDetalleDatosResponsable.add(this.jMenuItemDetalleAbrirOrderByResponsable);				
		this.jmenuDetalleDatosResponsable.add(this.jMenuItemDetalleMostarOcultarResponsable);				
				
		//this.jmenuDetalleAccionesResponsable.add(this.jMenuItemGuardarCambiosResponsable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleResponsable.add(this.jmenuDetalleArchivoResponsable);		
		this.jmenuBarDetalleResponsable.add(this.jmenuDetalleAccionesResponsable);		
		this.jmenuBarDetalleResponsable.add(this.jmenuDetalleDatosResponsable);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleResponsable.add(this.jmenuDetalleResponsable);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleResponsable);				
	}
	
	
	public void inicializarElementosCamposResponsable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdResponsable = new JLabelMe();
		jLabelIdResponsable.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidResponsable = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidResponsable.setToolTipText(ResponsableConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutResponsable= new GridBagLayout();

		this.jPanelidResponsable.setLayout(this.gridaBagLayoutResponsable);

		jLabelidResponsable = new JLabel();
		jLabelidResponsable.setText("Id");

		jLabelidResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelidentificacionResponsable = new JLabelMe();
		this.jLabelidentificacionResponsable.setText(""+ResponsableConstantesFunciones.LABEL_IDENTIFICACION+" : *");
		this.jLabelidentificacionResponsable.setToolTipText("Identificacion");
		this.jLabelidentificacionResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidentificacionResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidentificacionResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidentificacionResponsable.setToolTipText(ResponsableConstantesFunciones.LABEL_IDENTIFICACION);
		this.gridaBagLayoutResponsable = new GridBagLayout();
		this.jPanelidentificacionResponsable.setLayout(this.gridaBagLayoutResponsable);


		jTextFieldidentificacionResponsable= new JTextFieldMe();

		jTextFieldidentificacionResponsable.setEnabled(false);
		jTextFieldidentificacionResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldidentificacionResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidentificacionResponsableBusqueda= new JButtonMe();
		this.jButtonidentificacionResponsableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionResponsableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionResponsableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidentificacionResponsableBusqueda.setText("U");
		this.jButtonidentificacionResponsableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidentificacionResponsableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidentificacionResponsableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldidentificacionResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldidentificacionResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"identificacionResponsableBusqueda"));

		if(this.responsableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidentificacionResponsableBusqueda.setVisible(false);		}


					
		this.jLabelrucResponsable = new JLabelMe();
		this.jLabelrucResponsable.setText(""+ResponsableConstantesFunciones.LABEL_RUC+" :");
		this.jLabelrucResponsable.setToolTipText("Ruc");
		this.jLabelrucResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucResponsable.setToolTipText(ResponsableConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutResponsable = new GridBagLayout();
		this.jPanelrucResponsable.setLayout(this.gridaBagLayoutResponsable);


		jTextFieldrucResponsable= new JTextFieldMe();

		jTextFieldrucResponsable.setEnabled(false);
		jTextFieldrucResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucResponsableBusqueda= new JButtonMe();
		this.jButtonrucResponsableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucResponsableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucResponsableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucResponsableBusqueda.setText("U");
		this.jButtonrucResponsableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucResponsableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucResponsableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucResponsableBusqueda"));

		if(this.responsableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucResponsableBusqueda.setVisible(false);		}


					
		this.jLabelnombreResponsable = new JLabelMe();
		this.jLabelnombreResponsable.setText(""+ResponsableConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreResponsable.setToolTipText("Nombre");
		this.jLabelnombreResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreResponsable.setToolTipText(ResponsableConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutResponsable = new GridBagLayout();
		this.jPanelnombreResponsable.setLayout(this.gridaBagLayoutResponsable);


		jTextAreanombreResponsable= new JTextAreaMe();
		jTextAreanombreResponsable.setEnabled(false);
		jTextAreanombreResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreResponsable.setLineWrap(true);
		jTextAreanombreResponsable.setWrapStyleWord(true);
		jTextAreanombreResponsable.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreResponsable.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreResponsable = new JScrollPane(jTextAreanombreResponsable);
		jscrollPanenombreResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreResponsableBusqueda= new JButtonMe();
		this.jButtonnombreResponsableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreResponsableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreResponsableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreResponsableBusqueda.setText("U");
		this.jButtonnombreResponsableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreResponsableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreResponsableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreResponsableBusqueda"));

		if(this.responsableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreResponsableBusqueda.setVisible(false);		}


					
		this.jLabelapellidoResponsable = new JLabelMe();
		this.jLabelapellidoResponsable.setText(""+ResponsableConstantesFunciones.LABEL_APELLIDO+" : *");
		this.jLabelapellidoResponsable.setToolTipText("Apellido");
		this.jLabelapellidoResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidoResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidoResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidoResponsable.setToolTipText(ResponsableConstantesFunciones.LABEL_APELLIDO);
		this.gridaBagLayoutResponsable = new GridBagLayout();
		this.jPanelapellidoResponsable.setLayout(this.gridaBagLayoutResponsable);


		jTextAreaapellidoResponsable= new JTextAreaMe();
		jTextAreaapellidoResponsable.setEnabled(false);
		jTextAreaapellidoResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoResponsable.setLineWrap(true);
		jTextAreaapellidoResponsable.setWrapStyleWord(true);
		jTextAreaapellidoResponsable.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidoResponsable.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidoResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidoResponsable = new JScrollPane(jTextAreaapellidoResponsable);
		jscrollPaneapellidoResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidoResponsableBusqueda= new JButtonMe();
		this.jButtonapellidoResponsableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoResponsableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoResponsableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidoResponsableBusqueda.setText("U");
		this.jButtonapellidoResponsableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidoResponsableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidoResponsableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidoResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidoResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidoResponsableBusqueda"));

		if(this.responsableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidoResponsableBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoResponsable = new JLabelMe();
		this.jLabelnombre_completoResponsable.setText(""+ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO+" :");
		this.jLabelnombre_completoResponsable.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoResponsable.setToolTipText(ResponsableConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutResponsable = new GridBagLayout();
		this.jPanelnombre_completoResponsable.setLayout(this.gridaBagLayoutResponsable);


		jTextAreanombre_completoResponsable= new JTextAreaMe();
		jTextAreanombre_completoResponsable.setEnabled(false);
		jTextAreanombre_completoResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoResponsable.setLineWrap(true);
		jTextAreanombre_completoResponsable.setWrapStyleWord(true);
		jTextAreanombre_completoResponsable.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoResponsable.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoResponsable = new JScrollPane(jTextAreanombre_completoResponsable);
		jscrollPanenombre_completoResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		jTextAreanombre_completoResponsable.setEnabled(false);
		this.jButtonnombre_completoResponsableBusqueda= new JButtonMe();
		this.jButtonnombre_completoResponsableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoResponsableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoResponsableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoResponsableBusqueda.setText("U");
		this.jButtonnombre_completoResponsableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoResponsableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoResponsableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoResponsableBusqueda"));

		if(this.responsableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoResponsableBusqueda.setVisible(false);		}


					
		this.jLabelemailResponsable = new JLabelMe();
		this.jLabelemailResponsable.setText(""+ResponsableConstantesFunciones.LABEL_EMAIL+" :");
		this.jLabelemailResponsable.setToolTipText("Email");
		this.jLabelemailResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelemailResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelemailResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelemailResponsable.setToolTipText(ResponsableConstantesFunciones.LABEL_EMAIL);
		this.gridaBagLayoutResponsable = new GridBagLayout();
		this.jPanelemailResponsable.setLayout(this.gridaBagLayoutResponsable);


		jTextAreaemailResponsable= new JTextAreaMe();
		jTextAreaemailResponsable.setEnabled(false);
		jTextAreaemailResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaemailResponsable.setLineWrap(true);
		jTextAreaemailResponsable.setWrapStyleWord(true);
		jTextAreaemailResponsable.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaemailResponsable.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaemailResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneemailResponsable = new JScrollPane(jTextAreaemailResponsable);
		jscrollPaneemailResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneemailResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneemailResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonemailResponsableBusqueda= new JButtonMe();
		this.jButtonemailResponsableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailResponsableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailResponsableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonemailResponsableBusqueda.setText("U");
		this.jButtonemailResponsableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonemailResponsableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonemailResponsableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaemailResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaemailResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"emailResponsableBusqueda"));

		if(this.responsableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonemailResponsableBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoResponsable = new JLabelMe();
		this.jLabeltelefonoResponsable.setText(""+ResponsableConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoResponsable.setToolTipText("Telefono");
		this.jLabeltelefonoResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoResponsable.setToolTipText(ResponsableConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutResponsable = new GridBagLayout();
		this.jPaneltelefonoResponsable.setLayout(this.gridaBagLayoutResponsable);


		jTextFieldtelefonoResponsable= new JTextFieldMe();

		jTextFieldtelefonoResponsable.setEnabled(false);
		jTextFieldtelefonoResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoResponsableBusqueda= new JButtonMe();
		this.jButtontelefonoResponsableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoResponsableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoResponsableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoResponsableBusqueda.setText("U");
		this.jButtontelefonoResponsableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoResponsableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoResponsableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoResponsableBusqueda"));

		if(this.responsableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoResponsableBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_celularResponsable = new JLabelMe();
		this.jLabeltelefono_celularResponsable.setText(""+ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR+" :");
		this.jLabeltelefono_celularResponsable.setToolTipText("Telefono Celular");
		this.jLabeltelefono_celularResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_celularResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_celularResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_celularResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_celularResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_celularResponsable.setToolTipText(ResponsableConstantesFunciones.LABEL_TELEFONOCELULAR);
		this.gridaBagLayoutResponsable = new GridBagLayout();
		this.jPaneltelefono_celularResponsable.setLayout(this.gridaBagLayoutResponsable);


		jTextFieldtelefono_celularResponsable= new JTextFieldMe();

		jTextFieldtelefono_celularResponsable.setEnabled(false);
		jTextFieldtelefono_celularResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefono_celularResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefono_celularResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefono_celularResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefono_celularResponsableBusqueda= new JButtonMe();
		this.jButtontelefono_celularResponsableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_celularResponsableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_celularResponsableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_celularResponsableBusqueda.setText("U");
		this.jButtontelefono_celularResponsableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_celularResponsableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_celularResponsableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefono_celularResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefono_celularResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_celularResponsableBusqueda"));

		if(this.responsableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_celularResponsableBusqueda.setVisible(false);		}


					
		this.jLabeldireccionResponsable = new JLabelMe();
		this.jLabeldireccionResponsable.setText(""+ResponsableConstantesFunciones.LABEL_DIRECCION+" :");
		this.jLabeldireccionResponsable.setToolTipText("Direccion");
		this.jLabeldireccionResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionResponsable.setToolTipText(ResponsableConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutResponsable = new GridBagLayout();
		this.jPaneldireccionResponsable.setLayout(this.gridaBagLayoutResponsable);


		jTextAreadireccionResponsable= new JTextAreaMe();
		jTextAreadireccionResponsable.setEnabled(false);
		jTextAreadireccionResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionResponsable.setLineWrap(true);
		jTextAreadireccionResponsable.setWrapStyleWord(true);
		jTextAreadireccionResponsable.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionResponsable.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionResponsable = new JScrollPane(jTextAreadireccionResponsable);
		jscrollPanedireccionResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccionResponsableBusqueda= new JButtonMe();
		this.jButtondireccionResponsableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionResponsableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionResponsableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionResponsableBusqueda.setText("U");
		this.jButtondireccionResponsableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionResponsableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionResponsableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionResponsableBusqueda"));

		if(this.responsableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionResponsableBusqueda.setVisible(false);		}


					
		this.jLabelfaxResponsable = new JLabelMe();
		this.jLabelfaxResponsable.setText(""+ResponsableConstantesFunciones.LABEL_FAX+" :");
		this.jLabelfaxResponsable.setToolTipText("Fax");
		this.jLabelfaxResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfaxResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfaxResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfaxResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfaxResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfaxResponsable.setToolTipText(ResponsableConstantesFunciones.LABEL_FAX);
		this.gridaBagLayoutResponsable = new GridBagLayout();
		this.jPanelfaxResponsable.setLayout(this.gridaBagLayoutResponsable);


		jTextFieldfaxResponsable= new JTextFieldMe();

		jTextFieldfaxResponsable.setEnabled(false);
		jTextFieldfaxResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfaxResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfaxResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfaxResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonfaxResponsableBusqueda= new JButtonMe();
		this.jButtonfaxResponsableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfaxResponsableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfaxResponsableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfaxResponsableBusqueda.setText("U");
		this.jButtonfaxResponsableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfaxResponsableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfaxResponsableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfaxResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfaxResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"faxResponsableBusqueda"));

		if(this.responsableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfaxResponsableBusqueda.setVisible(false);		}


					
		this.jLabelobservacionResponsable = new JLabelMe();
		this.jLabelobservacionResponsable.setText(""+ResponsableConstantesFunciones.LABEL_OBSERVACION+" :");
		this.jLabelobservacionResponsable.setToolTipText("Observacion");
		this.jLabelobservacionResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionResponsable.setToolTipText(ResponsableConstantesFunciones.LABEL_OBSERVACION);
		this.gridaBagLayoutResponsable = new GridBagLayout();
		this.jPanelobservacionResponsable.setLayout(this.gridaBagLayoutResponsable);


		jTextAreaobservacionResponsable= new JTextAreaMe();
		jTextAreaobservacionResponsable.setEnabled(false);
		jTextAreaobservacionResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionResponsable.setLineWrap(true);
		jTextAreaobservacionResponsable.setWrapStyleWord(true);
		jTextAreaobservacionResponsable.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionResponsable.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionResponsable = new JScrollPane(jTextAreaobservacionResponsable);
		jscrollPaneobservacionResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonobservacionResponsableBusqueda= new JButtonMe();
		this.jButtonobservacionResponsableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionResponsableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionResponsableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionResponsableBusqueda.setText("U");
		this.jButtonobservacionResponsableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionResponsableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionResponsableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionResponsableBusqueda"));

		if(this.responsableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionResponsableBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysResponsable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaResponsable = new JLabelMe();
		this.jLabelid_empresaResponsable.setText(""+ResponsableConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaResponsable.setToolTipText("Empresa");
		this.jLabelid_empresaResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaResponsable.setToolTipText(ResponsableConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutResponsable = new GridBagLayout();
		this.jPanelid_empresaResponsable.setLayout(this.gridaBagLayoutResponsable);


		jComboBoxid_empresaResponsable= new JComboBoxMe();
		jComboBoxid_empresaResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaResponsable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaResponsable.setEnabled(false);

		this.jButtonid_empresaResponsable= new JButtonMe();
		this.jButtonid_empresaResponsable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaResponsable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaResponsable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaResponsable.setText("Buscar");
		this.jButtonid_empresaResponsable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaResponsable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaResponsable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaResponsable"));

		this.jButtonid_empresaResponsableBusqueda= new JButtonMe();
		this.jButtonid_empresaResponsableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResponsableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResponsableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaResponsableBusqueda.setText("U");
		this.jButtonid_empresaResponsableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaResponsableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaResponsableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaResponsableBusqueda"));

		if(this.responsableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaResponsableBusqueda.setVisible(false);		}

		this.jButtonid_empresaResponsableUpdate= new JButtonMe();
		this.jButtonid_empresaResponsableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResponsableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResponsableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaResponsableUpdate.setText("U");
		this.jButtonid_empresaResponsableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaResponsableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaResponsableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaResponsableUpdate"));



					
		this.jLabelid_sucursalResponsable = new JLabelMe();
		this.jLabelid_sucursalResponsable.setText(""+ResponsableConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalResponsable.setToolTipText("Sucursal");
		this.jLabelid_sucursalResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalResponsable.setToolTipText(ResponsableConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutResponsable = new GridBagLayout();
		this.jPanelid_sucursalResponsable.setLayout(this.gridaBagLayoutResponsable);


		jComboBoxid_sucursalResponsable= new JComboBoxMe();
		jComboBoxid_sucursalResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalResponsable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalResponsable.setEnabled(false);

		this.jButtonid_sucursalResponsable= new JButtonMe();
		this.jButtonid_sucursalResponsable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalResponsable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalResponsable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalResponsable.setText("Buscar");
		this.jButtonid_sucursalResponsable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalResponsable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalResponsable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalResponsable"));

		this.jButtonid_sucursalResponsableBusqueda= new JButtonMe();
		this.jButtonid_sucursalResponsableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalResponsableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalResponsableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalResponsableBusqueda.setText("U");
		this.jButtonid_sucursalResponsableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalResponsableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalResponsableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalResponsableBusqueda"));

		if(this.responsableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalResponsableBusqueda.setVisible(false);		}

		this.jButtonid_sucursalResponsableUpdate= new JButtonMe();
		this.jButtonid_sucursalResponsableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalResponsableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalResponsableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalResponsableUpdate.setText("U");
		this.jButtonid_sucursalResponsableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalResponsableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalResponsableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalResponsableUpdate"));



					
		this.jLabelid_clienteResponsable = new JLabelMe();
		this.jLabelid_clienteResponsable.setText(""+ResponsableConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteResponsable.setToolTipText("Cliente");
		this.jLabelid_clienteResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteResponsable.setToolTipText(ResponsableConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutResponsable = new GridBagLayout();
		this.jPanelid_clienteResponsable.setLayout(this.gridaBagLayoutResponsable);


		jComboBoxid_clienteResponsable= new JComboBoxMe();
		jComboBoxid_clienteResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteResponsable= new JButtonMe();
		this.jButtonid_clienteResponsable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteResponsable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteResponsable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteResponsable.setText("Buscar");
		this.jButtonid_clienteResponsable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteResponsable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteResponsable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteResponsable"));

		this.jButtonid_clienteResponsableBusqueda= new JButtonMe();
		this.jButtonid_clienteResponsableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteResponsableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteResponsableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteResponsableBusqueda.setText("U");
		this.jButtonid_clienteResponsableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteResponsableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteResponsableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteResponsableBusqueda"));

		if(this.responsableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteResponsableBusqueda.setVisible(false);		}

		this.jButtonid_clienteResponsableUpdate= new JButtonMe();
		this.jButtonid_clienteResponsableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteResponsableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteResponsableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteResponsableUpdate.setText("U");
		this.jButtonid_clienteResponsableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteResponsableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteResponsableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteResponsableUpdate"));



					
		this.jLabelid_usuarioResponsable = new JLabelMe();
		this.jLabelid_usuarioResponsable.setText(""+ResponsableConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioResponsable.setToolTipText("Usuario");
		this.jLabelid_usuarioResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioResponsable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioResponsable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioResponsable.setToolTipText(ResponsableConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutResponsable = new GridBagLayout();
		this.jPanelid_usuarioResponsable.setLayout(this.gridaBagLayoutResponsable);


		jComboBoxid_usuarioResponsable= new JComboBoxMe();
		jComboBoxid_usuarioResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioResponsable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioResponsable.setEnabled(false);

		this.jButtonid_usuarioResponsable= new JButtonMe();
		this.jButtonid_usuarioResponsable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioResponsable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioResponsable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioResponsable.setText("Buscar");
		this.jButtonid_usuarioResponsable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioResponsable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioResponsable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioResponsable"));

		this.jButtonid_usuarioResponsableBusqueda= new JButtonMe();
		this.jButtonid_usuarioResponsableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioResponsableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioResponsableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioResponsableBusqueda.setText("U");
		this.jButtonid_usuarioResponsableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioResponsableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioResponsableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioResponsableBusqueda"));

		if(this.responsableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioResponsableBusqueda.setVisible(false);		}

		this.jButtonid_usuarioResponsableUpdate= new JButtonMe();
		this.jButtonid_usuarioResponsableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioResponsableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioResponsableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioResponsableUpdate.setText("U");
		this.jButtonid_usuarioResponsableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioResponsableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioResponsableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioResponsable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioResponsable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioResponsableUpdate"));



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
		//this.jInternalFrameDetalleResponsable = new ResponsableBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Responsable DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutResponsable= new GridBagLayout();
		

		
		String sToolTipResponsable="";
		sToolTipResponsable=ResponsableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipResponsable+="(Facturacion.Responsable)";
		}
		
		if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
			sToolTipResponsable+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoResponsable = new JButtonMe();
		this.jButtonModificarResponsable = new JButtonMe();
        this.jButtonActualizarResponsable = new JButtonMe();
        this.jButtonEliminarResponsable = new JButtonMe();
        this.jButtonCancelarResponsable = new JButtonMe();
        this.jButtonGuardarCambiosResponsable = new JButtonMe();
		this.jButtonGuardarCambiosTablaResponsable = new JButtonMe();
		this.jButtonCerrarResponsable = new JButtonMe();
		
		this.jScrollPanelDatosResponsable = new JScrollPane();   
        this.jScrollPanelDatosEdicionResponsable = new JScrollPane();
		this.jScrollPanelDatosGeneralResponsable = new JScrollPane();
				
		
		
		this.jPanelCamposResponsable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosResponsable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesResponsable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioResponsable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Responsable";
		
		if(!this.responsableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsables" + this.sPath));
		} else {
			this.jScrollPanelDatosResponsable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposResponsable.setName("jPanelCamposResponsable"); 

		this.jPanelCamposOcultosResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosResponsable.setName("jPanelCamposOcultosResponsable"); 

        this.jPanelAccionesResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesResponsable.setToolTipText("Acciones");
        this.jPanelAccionesResponsable.setName("Acciones"); 

		this.jPanelAccionesFormularioResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioResponsable.setToolTipText("Acciones");
        this.jPanelAccionesFormularioResponsable.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionResponsable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralResponsable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosResponsable, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposResponsable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosResponsable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioResponsable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoResponsable.setText("Nuevo");
		this.jButtonModificarResponsable.setText("Editar");
        this.jButtonActualizarResponsable.setText("Actualizar");
        this.jButtonEliminarResponsable.setText("Eliminar");
        this.jButtonCancelarResponsable.setText("Cancelar");
        this.jButtonGuardarCambiosResponsable.setText("Guardar");
		this.jButtonGuardarCambiosTablaResponsable.setText("Guardar");
		this.jButtonCerrarResponsable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoResponsable,"nuevo_button","Nuevo",this.responsableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarResponsable,"modificar_button","Editar",this.responsableSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarResponsable,"actualizar_button","Actualizar",this.responsableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarResponsable,"eliminar_button","Eliminar",this.responsableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarResponsable,"cancelar_button","Cancelar",this.responsableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosResponsable,"guardarcambios_button","Guardar",this.responsableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaResponsable,"guardarcambiostabla_button","Guardar",this.responsableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarResponsable,"cerrar_button","Salir",this.responsableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarResponsable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarResponsable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarResponsable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarResponsable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoResponsable.setToolTipText("Nuevo"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarResponsable.setToolTipText("Editar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarResponsable.setToolTipText("Actualizar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarResponsable.setToolTipText("Eliminar)"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarResponsable.setToolTipText("Cancelar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosResponsable.setToolTipText("Guardar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaResponsable.setToolTipText("Guardar"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarResponsable.setToolTipText("Salir"+" "+ResponsableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoResponsable";
		inputMap = this.jButtonNuevoResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoResponsable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoResponsable"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarResponsable";
		inputMap = this.jButtonActualizarResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarResponsable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarResponsable"));
		
		//ELIMINAR
		sMapKey = "EliminarResponsable";
		inputMap = this.jButtonEliminarResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarResponsable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarResponsable"));
		
		//CANCELAR	
		sMapKey = "CancelarResponsable";
		inputMap = this.jButtonCancelarResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarResponsable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarResponsable"));
		
		//CERRAR		
		sMapKey = "CerrarResponsable";
		inputMap = this.jButtonCerrarResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarResponsable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarResponsable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaResponsable";
		inputMap = this.jButtonGuardarCambiosTablaResponsable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaResponsable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaResponsable"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoResponsable = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoResponsable.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoResponsable.setToolTipText("Nuevo Responsable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoResponsable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarResponsable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarResponsable.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarResponsable.setToolTipText("Sin Cerrar Ventana Responsable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarResponsable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeResponsable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeResponsable.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeResponsable.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeResponsable, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesResponsable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesResponsable.setText("Accion");
		this.jComboBoxTiposAccionesResponsable.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioResponsable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioResponsable.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioResponsable.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesResponsable = new JLabelMe();
		
		this.jLabelAccionesResponsable.setText("Acciones");		
		this.jLabelAccionesResponsable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResponsable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResponsable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposResponsable();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysResponsable();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesResponsable=new JTabbedPane();
		this.jTabbedPaneRelacionesResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesResponsable,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesResponsable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResponsable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResponsable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesResponsable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioResponsable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioResponsable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioResponsable.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioResponsable, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposResponsable = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosResponsable = new GridBagLayout();
		
		this.jPanelCamposResponsable.setLayout(gridaBagLayoutCamposResponsable);
		this.jPanelCamposOcultosResponsable.setLayout(gridaBagLayoutCamposOcultosResponsable);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 0;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidResponsable.add(jLabelIdResponsable, this.gridBagConstraintsResponsable);



	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 1;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidResponsable.add(jLabelidResponsable, this.gridBagConstraintsResponsable);


	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 0;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaResponsable.add(jLabelid_empresaResponsable, this.gridBagConstraintsResponsable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 2;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaResponsable.add(jButtonid_empresaResponsableBusqueda, this.gridBagConstraintsResponsable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 3;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaResponsable.add(jButtonid_empresaResponsableUpdate, this.gridBagConstraintsResponsable);
	}

	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 1;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaResponsable.add(jComboBoxid_empresaResponsable, this.gridBagConstraintsResponsable);


	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 0;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalResponsable.add(jLabelid_sucursalResponsable, this.gridBagConstraintsResponsable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 2;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalResponsable.add(jButtonid_sucursalResponsableBusqueda, this.gridBagConstraintsResponsable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 3;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalResponsable.add(jButtonid_sucursalResponsableUpdate, this.gridBagConstraintsResponsable);
	}

	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 1;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalResponsable.add(jComboBoxid_sucursalResponsable, this.gridBagConstraintsResponsable);


	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 0;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteResponsable.add(jLabelid_clienteResponsable, this.gridBagConstraintsResponsable);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsResponsable = new GridBagConstraints();
	//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 2;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteResponsable.add(jButtonid_clienteResponsable, this.gridBagConstraintsResponsable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 3;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteResponsable.add(jButtonid_clienteResponsableBusqueda, this.gridBagConstraintsResponsable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 4;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteResponsable.add(jButtonid_clienteResponsableUpdate, this.gridBagConstraintsResponsable);
	}

	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 1;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteResponsable.add(jComboBoxid_clienteResponsable, this.gridBagConstraintsResponsable);


	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 0;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioResponsable.add(jLabelid_usuarioResponsable, this.gridBagConstraintsResponsable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 2;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioResponsable.add(jButtonid_usuarioResponsableBusqueda, this.gridBagConstraintsResponsable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 3;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioResponsable.add(jButtonid_usuarioResponsableUpdate, this.gridBagConstraintsResponsable);
	}

	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 1;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioResponsable.add(jComboBoxid_usuarioResponsable, this.gridBagConstraintsResponsable);


	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 0;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidentificacionResponsable.add(jLabelidentificacionResponsable, this.gridBagConstraintsResponsable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 2;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPanelidentificacionResponsable.add(jButtonidentificacionResponsableBusqueda, this.gridBagConstraintsResponsable);
	}

	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 1;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidentificacionResponsable.add(jTextFieldidentificacionResponsable, this.gridBagConstraintsResponsable);


	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 0;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucResponsable.add(jLabelrucResponsable, this.gridBagConstraintsResponsable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 2;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucResponsable.add(jButtonrucResponsableBusqueda, this.gridBagConstraintsResponsable);
	}

	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 1;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucResponsable.add(jTextFieldrucResponsable, this.gridBagConstraintsResponsable);


	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 0;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreResponsable.add(jLabelnombreResponsable, this.gridBagConstraintsResponsable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 2;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreResponsable.add(jButtonnombreResponsableBusqueda, this.gridBagConstraintsResponsable);
	}

	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 1;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreResponsable.add(jscrollPanenombreResponsable, this.gridBagConstraintsResponsable);


	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 0;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidoResponsable.add(jLabelapellidoResponsable, this.gridBagConstraintsResponsable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 2;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidoResponsable.add(jButtonapellidoResponsableBusqueda, this.gridBagConstraintsResponsable);
	}

	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 1;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidoResponsable.add(jscrollPaneapellidoResponsable, this.gridBagConstraintsResponsable);


	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 0;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoResponsable.add(jLabelnombre_completoResponsable, this.gridBagConstraintsResponsable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 2;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoResponsable.add(jButtonnombre_completoResponsableBusqueda, this.gridBagConstraintsResponsable);
	}

	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 1;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoResponsable.add(jscrollPanenombre_completoResponsable, this.gridBagConstraintsResponsable);


	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 0;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelemailResponsable.add(jLabelemailResponsable, this.gridBagConstraintsResponsable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 2;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPanelemailResponsable.add(jButtonemailResponsableBusqueda, this.gridBagConstraintsResponsable);
	}

	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 1;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelemailResponsable.add(jscrollPaneemailResponsable, this.gridBagConstraintsResponsable);


	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 0;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoResponsable.add(jLabeltelefonoResponsable, this.gridBagConstraintsResponsable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 2;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoResponsable.add(jButtontelefonoResponsableBusqueda, this.gridBagConstraintsResponsable);
	}

	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 1;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoResponsable.add(jTextFieldtelefonoResponsable, this.gridBagConstraintsResponsable);


	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 0;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefono_celularResponsable.add(jLabeltelefono_celularResponsable, this.gridBagConstraintsResponsable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 2;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_celularResponsable.add(jButtontelefono_celularResponsableBusqueda, this.gridBagConstraintsResponsable);
	}

	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 1;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefono_celularResponsable.add(jTextFieldtelefono_celularResponsable, this.gridBagConstraintsResponsable);


	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 0;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionResponsable.add(jLabeldireccionResponsable, this.gridBagConstraintsResponsable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 2;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionResponsable.add(jButtondireccionResponsableBusqueda, this.gridBagConstraintsResponsable);
	}

	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 1;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionResponsable.add(jscrollPanedireccionResponsable, this.gridBagConstraintsResponsable);


	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 0;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfaxResponsable.add(jLabelfaxResponsable, this.gridBagConstraintsResponsable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 2;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPanelfaxResponsable.add(jButtonfaxResponsableBusqueda, this.gridBagConstraintsResponsable);
	}

	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 1;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfaxResponsable.add(jTextFieldfaxResponsable, this.gridBagConstraintsResponsable);


	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 0;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionResponsable.add(jLabelobservacionResponsable, this.gridBagConstraintsResponsable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		//this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = 2;
		this.gridBagConstraintsResponsable.ipadx = 0;
		this.gridBagConstraintsResponsable.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionResponsable.add(jButtonobservacionResponsableBusqueda, this.gridBagConstraintsResponsable);
	}

	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsable.gridy = 0;
	this.gridBagConstraintsResponsable.gridx = 1;
	this.gridBagConstraintsResponsable.ipadx = 0;
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionResponsable.add(jscrollPaneobservacionResponsable, this.gridBagConstraintsResponsable);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsable.gridy = iYPanelCamposResponsable;
	this.gridBagConstraintsResponsable.gridx = iXPanelCamposResponsable++;
	this.gridBagConstraintsResponsable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsable.add(this.jPanelidResponsable, this.gridBagConstraintsResponsable);



	if(iXPanelCamposResponsable % 2==0) {
		iXPanelCamposResponsable=0;
		iYPanelCamposResponsable++;
	}
	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsable.gridy = iYPanelCamposResponsable;
	this.gridBagConstraintsResponsable.gridx = iXPanelCamposResponsable++;
	this.gridBagConstraintsResponsable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsable.add(this.jPanelid_clienteResponsable, this.gridBagConstraintsResponsable);



	if(iXPanelCamposResponsable % 2==0) {
		iXPanelCamposResponsable=0;
		iYPanelCamposResponsable++;
	}
	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsable.gridy = iYPanelCamposResponsable;
	this.gridBagConstraintsResponsable.gridx = iXPanelCamposResponsable++;
	this.gridBagConstraintsResponsable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsable.add(this.jPanelidentificacionResponsable, this.gridBagConstraintsResponsable);



	if(iXPanelCamposResponsable % 2==0) {
		iXPanelCamposResponsable=0;
		iYPanelCamposResponsable++;
	}
	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsable.gridy = iYPanelCamposResponsable;
	this.gridBagConstraintsResponsable.gridx = iXPanelCamposResponsable++;
	this.gridBagConstraintsResponsable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsable.add(this.jPanelrucResponsable, this.gridBagConstraintsResponsable);



	if(iXPanelCamposResponsable % 2==0) {
		iXPanelCamposResponsable=0;
		iYPanelCamposResponsable++;
	}
	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsable.gridy = iYPanelCamposResponsable;
	this.gridBagConstraintsResponsable.gridx = iXPanelCamposResponsable++;
	this.gridBagConstraintsResponsable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsable.add(this.jPanelnombreResponsable, this.gridBagConstraintsResponsable);



	if(iXPanelCamposResponsable % 2==0) {
		iXPanelCamposResponsable=0;
		iYPanelCamposResponsable++;
	}
	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsable.gridy = iYPanelCamposResponsable;
	this.gridBagConstraintsResponsable.gridx = iXPanelCamposResponsable++;
	this.gridBagConstraintsResponsable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsable.add(this.jPanelapellidoResponsable, this.gridBagConstraintsResponsable);



	if(iXPanelCamposResponsable % 2==0) {
		iXPanelCamposResponsable=0;
		iYPanelCamposResponsable++;
	}
	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsable.gridy = iYPanelCamposResponsable;
	this.gridBagConstraintsResponsable.gridx = iXPanelCamposResponsable++;
	this.gridBagConstraintsResponsable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsable.add(this.jPanelnombre_completoResponsable, this.gridBagConstraintsResponsable);



	if(iXPanelCamposResponsable % 2==0) {
		iXPanelCamposResponsable=0;
		iYPanelCamposResponsable++;
	}
	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsable.gridy = iYPanelCamposResponsable;
	this.gridBagConstraintsResponsable.gridx = iXPanelCamposResponsable++;
	this.gridBagConstraintsResponsable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsable.add(this.jPanelemailResponsable, this.gridBagConstraintsResponsable);



	if(iXPanelCamposResponsable % 2==0) {
		iXPanelCamposResponsable=0;
		iYPanelCamposResponsable++;
	}
	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsable.gridy = iYPanelCamposResponsable;
	this.gridBagConstraintsResponsable.gridx = iXPanelCamposResponsable++;
	this.gridBagConstraintsResponsable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsable.add(this.jPaneltelefonoResponsable, this.gridBagConstraintsResponsable);



	if(iXPanelCamposResponsable % 2==0) {
		iXPanelCamposResponsable=0;
		iYPanelCamposResponsable++;
	}
	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsable.gridy = iYPanelCamposResponsable;
	this.gridBagConstraintsResponsable.gridx = iXPanelCamposResponsable++;
	this.gridBagConstraintsResponsable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsable.add(this.jPaneltelefono_celularResponsable, this.gridBagConstraintsResponsable);



	if(iXPanelCamposResponsable % 2==0) {
		iXPanelCamposResponsable=0;
		iYPanelCamposResponsable++;
	}
	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsable.gridy = iYPanelCamposResponsable;
	this.gridBagConstraintsResponsable.gridx = iXPanelCamposResponsable++;
	this.gridBagConstraintsResponsable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsable.add(this.jPaneldireccionResponsable, this.gridBagConstraintsResponsable);



	if(iXPanelCamposResponsable % 2==0) {
		iXPanelCamposResponsable=0;
		iYPanelCamposResponsable++;
	}
	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsable.gridy = iYPanelCamposResponsable;
	this.gridBagConstraintsResponsable.gridx = iXPanelCamposResponsable++;
	this.gridBagConstraintsResponsable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsable.add(this.jPanelfaxResponsable, this.gridBagConstraintsResponsable);



	if(iXPanelCamposResponsable % 2==0) {
		iXPanelCamposResponsable=0;
		iYPanelCamposResponsable++;
	}
	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsable.gridy = iYPanelCamposResponsable;
	this.gridBagConstraintsResponsable.gridx = iXPanelCamposResponsable++;
	this.gridBagConstraintsResponsable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsable.add(this.jPanelobservacionResponsable, this.gridBagConstraintsResponsable);



	if(iXPanelCamposResponsable % 2==0) {
		iXPanelCamposResponsable=0;
		iYPanelCamposResponsable++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsable.gridy = iYPanelCamposOcultosResponsable;
	this.gridBagConstraintsResponsable.gridx = iXPanelCamposOcultosResponsable++;
	this.gridBagConstraintsResponsable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosResponsable.add(this.jPanelid_empresaResponsable, this.gridBagConstraintsResponsable);



	if(iXPanelCamposOcultosResponsable % 2==0) {
		iXPanelCamposOcultosResponsable=0;
		iYPanelCamposOcultosResponsable++;
	}
	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsable.gridy = iYPanelCamposOcultosResponsable;
	this.gridBagConstraintsResponsable.gridx = iXPanelCamposOcultosResponsable++;
	this.gridBagConstraintsResponsable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosResponsable.add(this.jPanelid_sucursalResponsable, this.gridBagConstraintsResponsable);



	if(iXPanelCamposOcultosResponsable % 2==0) {
		iXPanelCamposOcultosResponsable=0;
		iYPanelCamposOcultosResponsable++;
	}
	this.gridBagConstraintsResponsable = new GridBagConstraints();
	this.gridBagConstraintsResponsable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsable.gridy = iYPanelCamposOcultosResponsable;
	this.gridBagConstraintsResponsable.gridx = iXPanelCamposOcultosResponsable++;
	this.gridBagConstraintsResponsable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosResponsable.add(this.jPanelid_usuarioResponsable, this.gridBagConstraintsResponsable);



	if(iXPanelCamposOcultosResponsable % 2==0) {
		iXPanelCamposOcultosResponsable=0;
		iYPanelCamposOcultosResponsable++;
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
			
		GridBagLayout gridaBagLayoutAccionesResponsable= new GridBagLayout();
		this.jPanelAccionesResponsable.setLayout(gridaBagLayoutAccionesResponsable);
		
		GridBagLayout gridaBagLayoutAccionesFormularioResponsable= new GridBagLayout();
		this.jPanelAccionesFormularioResponsable.setLayout(gridaBagLayoutAccionesFormularioResponsable);
		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsResponsable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioResponsable.add(this.jComboBoxTiposAccionesFormularioResponsable, this.gridBagConstraintsResponsable);

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsResponsable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioResponsable.add(this.jCheckBoxPostAccionNuevoResponsable, this.gridBagConstraintsResponsable);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.responsableSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsResponsable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioResponsable.add(this.jCheckBoxPostAccionSinCerrarResponsable, this.gridBagConstraintsResponsable);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.responsableSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.responsableSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsResponsable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioResponsable.add(this.jCheckBoxPostAccionSinMensajeResponsable, this.gridBagConstraintsResponsable);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx = iPosXAccion++;
			
		this.jPanelAccionesResponsable.add(this.jButtonModificarResponsable, this.gridBagConstraintsResponsable);							

		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsable.gridy = 0;
		this.gridBagConstraintsResponsable.gridx =iPosXAccion++;
			
		this.jPanelAccionesResponsable.add(this.jButtonEliminarResponsable, this.gridBagConstraintsResponsable);
		
			
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy = 0;		
		this.gridBagConstraintsResponsable.gridx = iPosXAccion++;
		
		this.jPanelAccionesResponsable.add(this.jButtonActualizarResponsable, this.gridBagConstraintsResponsable);


		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy = 0;		
		this.gridBagConstraintsResponsable.gridx = iPosXAccion++;
		
		this.jPanelAccionesResponsable.add(this.jButtonGuardarCambiosResponsable, this.gridBagConstraintsResponsable);	
		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy = 0;		
		this.gridBagConstraintsResponsable.gridx =iPosXAccion++;
		
		this.jPanelAccionesResponsable.add(this.jButtonCancelarResponsable, this.gridBagConstraintsResponsable);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutResponsable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutResponsable);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.responsableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsResponsable = new GridBagConstraints();						
			this.gridBagConstraintsResponsable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsResponsable.gridx = 0;		
			//this.gridBagConstraintsResponsable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsResponsable.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsResponsable.gridx =0;
		this.gridBagConstraintsResponsable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsResponsable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosResponsable, this.gridBagConstraintsResponsable);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ResponsableJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleResponsable = new ResponsableBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Responsable DATOS");
			
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
			
	        //this.setTitle("[FOR] - Responsable DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Responsable Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ResponsableModel responsableModel=new ResponsableModel(this);
			
			//SI USARA CLASE INTERNA
			//ResponsableModel.ResponsableFocusTraversalPolicy responsableFocusTraversalPolicy = responsableModel.new ResponsableFocusTraversalPolicy(this);
			
			//responsableFocusTraversalPolicy.setresponsableJInternalFrame(this);
			
			this.setFocusTraversalPolicy(responsableModel);
			
			
			this.jContentPaneDetalleResponsable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleResponsable = new GridBagLayout();	
			this.jContentPaneDetalleResponsable.setLayout(gridaBagLayoutDetalleResponsable);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosResponsable = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsResponsable = new GridBagConstraints();
				this.gridBagConstraintsResponsable.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsResponsable.gridx = 0;
					
				
				this.jContentPaneDetalleResponsable.add(jTtoolBarDetalleResponsable, gridBagConstraintsResponsable);								
				
}
			
			this.jScrollPanelDatosEdicionResponsable=   new JScrollPane(jContentPaneDetalleResponsable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionResponsable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResponsable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResponsable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralResponsable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralResponsable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResponsable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResponsable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			
			
	        this.gridBagConstraintsResponsable.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsResponsable.gridx = 0;
	        
			this.jContentPaneDetalleResponsable.add(jPanelCamposResponsable, gridBagConstraintsResponsable);
			
			
			
			
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
						&& responsableSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameConsignacion(this.puedeCargarPorParteConsignacion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFactura(this.puedeCargarPorParteFactura,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(this.puedeCargarPorParteNotaCreditoSoli,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedido(this.puedeCargarPorPartePedido,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoExpor(this.puedeCargarPorPartePedidoExpor,false,-1);
					
					if(this.responsableSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsResponsable= new GridBagConstraints();
						this.gridBagConstraintsResponsable.gridy = iGridyRelaciones++;
						this.gridBagConstraintsResponsable.gridx = 0;
						this.jContentPaneDetalleResponsable.add(this.jTabbedPaneRelacionesResponsable, this.gridBagConstraintsResponsable);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesResponsable.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameConsignacion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFactura(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedido(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoExpor(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosResponsable.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsResponsable = new GridBagConstraints();
					this.gridBagConstraintsResponsable.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsResponsable.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsResponsable.gridx = 0;
					
				
					this.jContentPaneDetalleResponsable.add(jPanelCamposOcultosResponsable, gridBagConstraintsResponsable);
				
					this.jPanelCamposOcultosResponsable.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.gridy = iGridyRelaciones++;//16;		
	        this.gridBagConstraintsResponsable.gridx = 0;
	        this.gridBagConstraintsResponsable.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleResponsable.add(this.jPanelAccionesFormularioResponsable, this.gridBagConstraintsResponsable);							
			
			
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
	        this.gridBagConstraintsResponsable.gridy = iGridyRelaciones;//16;		
	        this.gridBagConstraintsResponsable.gridx = 0;
	        
			
			this.jContentPaneDetalleResponsable.add(this.jPanelAccionesResponsable, this.gridBagConstraintsResponsable);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionResponsable);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionResponsable=   new JScrollPane(this.jPanelCamposResponsable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionResponsable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResponsable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResponsable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsResponsable.gridx = 0;
			this.gridBagConstraintsResponsable.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsResponsable.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsResponsable.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionResponsable, this.gridBagConstraintsResponsable);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsResponsable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioResponsable, this.gridBagConstraintsResponsable);			
			
			this.gridBagConstraintsResponsable = new GridBagConstraints();
			this.gridBagConstraintsResponsable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsResponsable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesResponsable, this.gridBagConstraintsResponsable);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposResponsable, this.gridBagConstraintsResponsable);
			
			
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosResponsable, this.gridBagConstraintsResponsable);
		
			
		this.gridBagConstraintsResponsable = new GridBagConstraints();
		this.gridBagConstraintsResponsable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsResponsable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesResponsable, this.gridBagConstraintsResponsable);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralResponsable;//jContentPane;
		
		return jScrollPanelDatosEdicionResponsable;
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

				ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL=ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL;
				ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.consignacionSessionBean.setEsGuardarRelacionado(true);

				this.consignacionBeanSwingJInternalFrame=new ConsignacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.consignacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.consignacionBeanSwingJInternalFrame.setconsignacionSessionBean(this.consignacionSessionBean);

				//this.gridBagConstraintsResponsable = new GridBagConstraints();
				//this.gridBagConstraintsResponsable.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsResponsable.gridx = 0;
				//this.jContentPaneDetalleResponsable.add(this.consignacionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsResponsable);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesResponsable.add("Consignacions",this.consignacionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesResponsable.setComponentAt(iIndexTab,this.consignacionBeanSwingJInternalFrame.getContentPane());
				}

				//ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.consignacionSessionBean.setEsGuardarRelacionado(false);
				this.consignacionBeanSwingJInternalFrame=null;//new ConsignacionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.consignacionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteConsignacion) {
					this.jTabbedPaneRelacionesResponsable.add("Consignacions",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFactura(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.facturaSessionBean=new FacturaSessionBean();
		this.facturaSessionBean.setConGuardarRelaciones(true);
		this.facturaSessionBean.setEsGuardarRelacionado(true);

		this.facturaBeanSwingJInternalFrame=null;//new FacturaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.facturaBeanSwingJInternalFramePopup=new FacturaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.facturaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.facturaSessionBean.getEsGuardarRelacionado()) {

				FacturaJInternalFrame.STIPO_TAMANIO_GENERAL=ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL;
				FacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.facturaSessionBean.setEsGuardarRelacionado(true);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.facturaBeanSwingJInternalFrame.setfacturaSessionBean(this.facturaSessionBean);

				//this.gridBagConstraintsResponsable = new GridBagConstraints();
				//this.gridBagConstraintsResponsable.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsResponsable.gridx = 0;
				//this.jContentPaneDetalleResponsable.add(this.facturaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsResponsable);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesResponsable.add("Facturas",this.facturaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesResponsable.setComponentAt(iIndexTab,this.facturaBeanSwingJInternalFrame.getContentPane());
				}

				//FacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.facturaSessionBean.setEsGuardarRelacionado(false);
				this.facturaBeanSwingJInternalFrame=null;//new FacturaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.facturaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFactura) {
					this.jTabbedPaneRelacionesResponsable.add("Facturas",new JPanel());
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

				NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL=ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL;
				NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.notacreditosoliSessionBean.setEsGuardarRelacionado(true);

				this.notacreditosoliBeanSwingJInternalFrame=new NotaCreditoSoliBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.notacreditosoliBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.notacreditosoliBeanSwingJInternalFrame.setnotacreditosoliSessionBean(this.notacreditosoliSessionBean);

				//this.gridBagConstraintsResponsable = new GridBagConstraints();
				//this.gridBagConstraintsResponsable.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsResponsable.gridx = 0;
				//this.jContentPaneDetalleResponsable.add(this.notacreditosoliBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsResponsable);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesResponsable.add("Solicitud Nota Creditos",this.notacreditosoliBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesResponsable.setComponentAt(iIndexTab,this.notacreditosoliBeanSwingJInternalFrame.getContentPane());
				}

				//NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.notacreditosoliSessionBean.setEsGuardarRelacionado(false);
				this.notacreditosoliBeanSwingJInternalFrame=null;//new NotaCreditoSoliBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNotaCreditoSoli) {
					this.jTabbedPaneRelacionesResponsable.add("Solicitud Nota Creditos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePedido(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidoSessionBean=new PedidoSessionBean();
		this.pedidoSessionBean.setConGuardarRelaciones(true);
		this.pedidoSessionBean.setEsGuardarRelacionado(true);

		this.pedidoBeanSwingJInternalFrame=null;//new PedidoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidoBeanSwingJInternalFramePopup=new PedidoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidoSessionBean.getEsGuardarRelacionado()) {

				PedidoJInternalFrame.STIPO_TAMANIO_GENERAL=ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidoSessionBean.setEsGuardarRelacionado(true);

				this.pedidoBeanSwingJInternalFrame=new PedidoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidoBeanSwingJInternalFrame.setpedidoSessionBean(this.pedidoSessionBean);

				//this.gridBagConstraintsResponsable = new GridBagConstraints();
				//this.gridBagConstraintsResponsable.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsResponsable.gridx = 0;
				//this.jContentPaneDetalleResponsable.add(this.pedidoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsResponsable);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesResponsable.add("Pedidos",this.pedidoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesResponsable.setComponentAt(iIndexTab,this.pedidoBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidoSessionBean.setEsGuardarRelacionado(false);
				this.pedidoBeanSwingJInternalFrame=null;//new PedidoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedido) {
					this.jTabbedPaneRelacionesResponsable.add("Pedidos",new JPanel());
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

				PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL=ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidoexporSessionBean.setEsGuardarRelacionado(true);

				this.pedidoexporBeanSwingJInternalFrame=new PedidoExporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidoexporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidoexporBeanSwingJInternalFrame.setpedidoexporSessionBean(this.pedidoexporSessionBean);

				//this.gridBagConstraintsResponsable = new GridBagConstraints();
				//this.gridBagConstraintsResponsable.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsResponsable.gridx = 0;
				//this.jContentPaneDetalleResponsable.add(this.pedidoexporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsResponsable);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesResponsable.add("Pedido Exportacions",this.pedidoexporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesResponsable.setComponentAt(iIndexTab,this.pedidoexporBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidoexporSessionBean.setEsGuardarRelacionado(false);
				this.pedidoexporBeanSwingJInternalFrame=null;//new PedidoExporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidoexporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoExpor) {
					this.jTabbedPaneRelacionesResponsable.add("Pedido Exportacions",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFacturaBeanSwingJInternalFrame(List<Responsable> responsables,Responsable responsable,FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.responsableLogic.getConnexion());

					facturaBeanSwingJInternalFrame.setresponsablesForeignKey(responsables);
					facturaBeanSwingJInternalFrame.setresponsableForeignKey(responsable);
					facturaBeanSwingJInternalFrame.facturaSessionBean.setisBusquedaDesdeForeignKeySesionResponsable(true);
					facturaBeanSwingJInternalFrame.facturaSessionBean.setlidResponsableActual(responsable.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					facturaBeanSwingJInternalFrame.cargarCombosForeignKeyFactura(facturaBeanSwingJInternalFrame.isCargarCombosDependencia);
					facturaBeanSwingJInternalFrame.setVisibilidadBusquedasParaResponsable(true);
					facturaBeanSwingJInternalFrame.setid_responsableFK_IdResponsable(responsable.getId());

					if(!this.conCargarFormDetalle) {
						facturaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					facturaBeanSwingJInternalFrame.setSelectedItemCombosFrameResponsableForeignKey(responsable,1,false,true,true);
					facturaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					facturaBeanSwingJInternalFrame.procesarBusqueda("FK_IdResponsable");
					facturaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdResponsable");
					facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura(true);
					facturaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFactura("n",facturaBeanSwingJInternalFrame.isGuardarCambiosEnLote, facturaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					facturaBeanSwingJInternalFrame.setAutoscrolls(true);
					facturaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						facturaBeanSwingJInternalFrame.actualizarEstadoPanelsFactura("relacionado");
					} else {
						facturaBeanSwingJInternalFrame.actualizarEstadoPanelsFactura("no_relacionado");
					}

					facturaBeanSwingJInternalFrame.getjButtonRecargarInformacionFactura().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarConsignacionBeanSwingJInternalFrame(List<Responsable> responsables,Responsable responsable,ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//consignacionBeanSwingJInternalFrame=new ConsignacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					consignacionBeanSwingJInternalFrame.getConsignacionLogic().setConnexion(this.responsableLogic.getConnexion());

					consignacionBeanSwingJInternalFrame.setresponsablesForeignKey(responsables);
					consignacionBeanSwingJInternalFrame.setresponsableForeignKey(responsable);
					consignacionBeanSwingJInternalFrame.consignacionSessionBean.setisBusquedaDesdeForeignKeySesionResponsable(true);
					consignacionBeanSwingJInternalFrame.consignacionSessionBean.setlidResponsableActual(responsable.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					consignacionBeanSwingJInternalFrame.cargarCombosForeignKeyConsignacion(consignacionBeanSwingJInternalFrame.isCargarCombosDependencia);
					consignacionBeanSwingJInternalFrame.setVisibilidadBusquedasParaResponsable(true);
					consignacionBeanSwingJInternalFrame.setid_responsableFK_IdResponsable(responsable.getId());

					if(!this.conCargarFormDetalle) {
						consignacionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					consignacionBeanSwingJInternalFrame.setSelectedItemCombosFrameResponsableForeignKey(responsable,1,false,true,true);
					consignacionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					consignacionBeanSwingJInternalFrame.procesarBusqueda("FK_IdResponsable");
					consignacionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdResponsable");
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

		public void cargarPedidoExporBeanSwingJInternalFrame(List<Responsable> responsables,Responsable responsable,PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidoexporBeanSwingJInternalFrame=new PedidoExporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidoexporBeanSwingJInternalFrame.getPedidoExporLogic().setConnexion(this.responsableLogic.getConnexion());

					pedidoexporBeanSwingJInternalFrame.setresponsablesForeignKey(responsables);
					pedidoexporBeanSwingJInternalFrame.setresponsableForeignKey(responsable);
					pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setisBusquedaDesdeForeignKeySesionResponsable(true);
					pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setlidResponsableActual(responsable.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidoexporBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoExpor(pedidoexporBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidoexporBeanSwingJInternalFrame.setVisibilidadBusquedasParaResponsable(true);
					pedidoexporBeanSwingJInternalFrame.setid_responsableFK_IdResponsable(responsable.getId());

					if(!this.conCargarFormDetalle) {
						pedidoexporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidoexporBeanSwingJInternalFrame.setSelectedItemCombosFrameResponsableForeignKey(responsable,1,false,true,true);
					pedidoexporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidoexporBeanSwingJInternalFrame.procesarBusqueda("FK_IdResponsable");
					pedidoexporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdResponsable");
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

		public void cargarPedidoBeanSwingJInternalFrame(List<Responsable> responsables,Responsable responsable,PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidoBeanSwingJInternalFrame=new PedidoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidoBeanSwingJInternalFrame.getPedidoLogic().setConnexion(this.responsableLogic.getConnexion());

					pedidoBeanSwingJInternalFrame.setresponsablesForeignKey(responsables);
					pedidoBeanSwingJInternalFrame.setresponsableForeignKey(responsable);
					pedidoBeanSwingJInternalFrame.pedidoSessionBean.setisBusquedaDesdeForeignKeySesionResponsable(true);
					pedidoBeanSwingJInternalFrame.pedidoSessionBean.setlidResponsableActual(responsable.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidoBeanSwingJInternalFrame.cargarCombosForeignKeyPedido(pedidoBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidoBeanSwingJInternalFrame.setVisibilidadBusquedasParaResponsable(true);
					pedidoBeanSwingJInternalFrame.setid_responsableFK_IdResponsable(responsable.getId());

					if(!this.conCargarFormDetalle) {
						pedidoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidoBeanSwingJInternalFrame.setSelectedItemCombosFrameResponsableForeignKey(responsable,1,false,true,true);
					pedidoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidoBeanSwingJInternalFrame.procesarBusqueda("FK_IdResponsable");
					pedidoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdResponsable");
					pedidoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedido(true);
					pedidoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedido("n",pedidoBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidoBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidoBeanSwingJInternalFrame.actualizarEstadoPanelsPedido("relacionado");
					} else {
						pedidoBeanSwingJInternalFrame.actualizarEstadoPanelsPedido("no_relacionado");
					}

					pedidoBeanSwingJInternalFrame.getjButtonRecargarInformacionPedido().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarNotaCreditoSoliBeanSwingJInternalFrame(List<Responsable> responsables,Responsable responsable,NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//notacreditosoliBeanSwingJInternalFrame=new NotaCreditoSoliBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					notacreditosoliBeanSwingJInternalFrame.getNotaCreditoSoliLogic().setConnexion(this.responsableLogic.getConnexion());

					notacreditosoliBeanSwingJInternalFrame.setresponsablesForeignKey(responsables);
					notacreditosoliBeanSwingJInternalFrame.setresponsableForeignKey(responsable);
					notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setisBusquedaDesdeForeignKeySesionResponsable(true);
					notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setlidResponsableActual(responsable.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					notacreditosoliBeanSwingJInternalFrame.cargarCombosForeignKeyNotaCreditoSoli(notacreditosoliBeanSwingJInternalFrame.isCargarCombosDependencia);
					notacreditosoliBeanSwingJInternalFrame.setVisibilidadBusquedasParaResponsable(true);
					notacreditosoliBeanSwingJInternalFrame.setid_responsableFK_IdResponsable(responsable.getId());

					if(!this.conCargarFormDetalle) {
						notacreditosoliBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					notacreditosoliBeanSwingJInternalFrame.setSelectedItemCombosFrameResponsableForeignKey(responsable,1,false,true,true);
					notacreditosoliBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					notacreditosoliBeanSwingJInternalFrame.procesarBusqueda("FK_IdResponsable");
					notacreditosoliBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdResponsable");
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
