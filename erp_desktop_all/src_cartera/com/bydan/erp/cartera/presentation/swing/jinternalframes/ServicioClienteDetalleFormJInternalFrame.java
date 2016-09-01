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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.ServicioClienteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class ServicioClienteDetalleFormJInternalFrame extends ServicioClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleServicioCliente;
	
	protected JMenuBar jmenuBarDetalleServicioCliente;
	
	protected JMenu jmenuDetalleServicioCliente;
	protected JMenu jmenuDetalleArchivoServicioCliente;
	protected JMenu jmenuDetalleAccionesServicioCliente;
	protected JMenu jmenuDetalleDatosServicioCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleServicioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutServicioCliente;	
	protected GridBagConstraints gridBagConstraintsServicioCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ServicioClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleServicioCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";
	
	public ServicioClienteSessionBean servicioclienteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;	
	
	public ServicioClienteLogic servicioclienteLogic;
	
	public JScrollPane jScrollPanelDatosServicioCliente;
	public JScrollPane jScrollPanelDatosEdicionServicioCliente;
	public JScrollPane jScrollPanelDatosGeneralServicioCliente;
	
	protected JPanel jPanelCamposServicioCliente;    
	protected JPanel jPanelCamposOcultosServicioCliente;    	
	protected JPanel jPanelAccionesServicioCliente;
	protected JPanel jPanelAccionesFormularioServicioCliente;
    
	
	
	protected Integer iXPanelCamposServicioCliente=0;
	protected Integer iYPanelCamposServicioCliente=0;
	
	protected Integer iXPanelCamposOcultosServicioCliente=0;
	protected Integer iYPanelCamposOcultosServicioCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoServicioCliente;
	public JButton jButtonModificarServicioCliente;
	public JButton jButtonActualizarServicioCliente;
    public JButton jButtonEliminarServicioCliente;
	public JButton jButtonCancelarServicioCliente;
    public JButton jButtonGuardarCambiosServicioCliente;
	public JButton jButtonGuardarCambiosTablaServicioCliente;
	protected JButton jButtonCerrarServicioCliente;
	
	
	protected JButton jButtonProcesarInformacionServicioCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoServicioCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarServicioCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeServicioCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarServicioCliente;
	protected JButton jButtonModificarToolBarServicioCliente;
	protected JButton jButtonActualizarToolBarServicioCliente;
    protected JButton jButtonEliminarToolBarServicioCliente;
	protected JButton jButtonCancelarToolBarServicioCliente;
    protected JButton jButtonGuardarCambiosToolBarServicioCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarServicioCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarServicioCliente;
	protected JButton jButtonCerrarToolBarServicioCliente;
	
	protected JButton jButtonProcesarInformacionToolBarServicioCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoServicioCliente;
	protected JMenuItem jMenuItemModificarServicioCliente;
	protected JMenuItem jMenuItemActualizarServicioCliente;
    protected JMenuItem jMenuItemEliminarServicioCliente;
	protected JMenuItem jMenuItemCancelarServicioCliente;
    protected JMenuItem jMenuItemGuardarCambiosServicioCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaServicioCliente;
	protected JMenuItem jMenuItemCerrarServicioCliente;
	protected JMenuItem jMenuItemDetalleCerrarServicioCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarServicioCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionServicioCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosServicioCliente;
	protected JMenuItem jMenuItemMostrarOcultarServicioCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesServicioCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesServicioCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesServicioCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioServicioCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidServicioCliente;
	public JLabel jLabelIdServicioCliente;
	public JLabel jLabelidServicioCliente;
	public JButton jButtonidServicioClienteBusqueda= new JButtonMe();

	public JPanel jPanelprecioServicioCliente;
	public JLabel jLabelprecioServicioCliente;
	public JTextField jTextFieldprecioServicioCliente;
	public JButton jButtonprecioServicioClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionServicioCliente;
	public JLabel jLabeldescripcionServicioCliente;
	public JTextArea jTextAreadescripcionServicioCliente;
	public JScrollPane jscrollPanedescripcionServicioCliente;
	public JButton jButtondescripcionServicioClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaServicioCliente;
	public JLabel jLabelid_empresaServicioCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaServicioCliente;
	public JButton jButtonid_empresaServicioCliente= new JButtonMe();
	public JButton jButtonid_empresaServicioClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaServicioClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteServicioCliente;
	public JLabel jLabelid_clienteServicioCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteServicioCliente;
	public JButton jButtonid_clienteServicioCliente= new JButtonMe();
	public JButton jButtonid_clienteServicioClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteServicioClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaServicioCliente;
	public JLabel jLabelid_bodegaServicioCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaServicioCliente;
	public JButton jButtonid_bodegaServicioCliente= new JButtonMe();
	public JButton jButtonid_bodegaServicioClienteUpdate= new JButtonMe();
	public JButton jButtonid_bodegaServicioClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_productoServicioCliente;
	public JLabel jLabelid_productoServicioCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoServicioCliente;
	public JButton jButtonid_productoServicioCliente= new JButtonMe();
	public JButton jButtonid_productoServicioClienteUpdate= new JButtonMe();
	public JButton jButtonid_productoServicioClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioServicioCliente;
	public JLabel jLabelid_tipo_precioServicioCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioServicioCliente;
	public JButton jButtonid_tipo_precioServicioCliente= new JButtonMe();
	public JButton jButtonid_tipo_precioServicioClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioServicioClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesServicioCliente;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ServicioClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposServicioCliente=new JPanel();
				this.jPanelAccionesFormularioServicioCliente=new JPanel();
				this.jmenuBarDetalleServicioCliente=new JMenuBar();
				this.jTtoolBarDetalleServicioCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ServicioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ServicioClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ServicioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ServicioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ServicioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ServicioClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ServicioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarServicioCliente() {
		return this.jButtonActualizarToolBarServicioCliente;
	}
	
	public JButton getjButtonEliminarToolBarServicioCliente() {
		return this.jButtonEliminarToolBarServicioCliente;
	}
	
	public JButton getjButtonCancelarToolBarServicioCliente() {
		return this.jButtonCancelarToolBarServicioCliente;
	}		
	
	public JButton getjButtonProcesarInformacionServicioCliente() {
		return this.jButtonProcesarInformacionServicioCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionServicioCliente)	{
		this.jButtonProcesarInformacionServicioCliente = jButtonProcesarInformacionServicioCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesServicioCliente() {
		return this.jComboBoxTiposAccionesServicioCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesServicioCliente(
			JComboBox jComboBoxTiposRelacionesServicioCliente) {
		this.jComboBoxTiposRelacionesServicioCliente = jComboBoxTiposRelacionesServicioCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesServicioCliente(
			JComboBox jComboBoxTiposAccionesServicioCliente) {
		this.jComboBoxTiposAccionesServicioCliente = jComboBoxTiposAccionesServicioCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioServicioCliente() {
		return this.jComboBoxTiposAccionesFormularioServicioCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioServicioCliente(
			JComboBox jComboBoxTiposAccionesFormularioServicioCliente) {
		this.jComboBoxTiposAccionesFormularioServicioCliente = jComboBoxTiposAccionesFormularioServicioCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.servicioclienteSessionBean=new ServicioClienteSessionBean();
		
		this.servicioclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.servicioclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.servicioclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ServicioClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ServicioClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ServicioClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Servicio Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		ServicioClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleServicioCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarServicioCliente=new JButtonMe();
				this.jButtonModificarToolBarServicioCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarServicioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarServicioCliente,this.jTtoolBarDetalleServicioCliente,
							"actualizar","actualizar","Actualizar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarServicioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarServicioCliente,this.jTtoolBarDetalleServicioCliente,
							"eliminar","eliminar","Eliminar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarServicioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarServicioCliente,this.jTtoolBarDetalleServicioCliente,
							"cancelar","cancelar","Cancelar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarServicioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarServicioCliente,this.jTtoolBarDetalleServicioCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleServicioCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleServicioCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoServicioCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesServicioCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosServicioCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoServicioCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoServicioCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoServicioCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarServicioCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarServicioCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarServicioCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarServicioCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarServicioCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarServicioCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarServicioCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarServicioCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarServicioCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarServicioCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarServicioCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarServicioCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosServicioCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosServicioCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosServicioCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarServicioCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarServicioCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarServicioCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarServicioCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarServicioCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarServicioCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarServicioCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarServicioCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarServicioCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarServicioCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarServicioCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarServicioCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoServicioCliente.add(this.jMenuItemDetalleCerrarServicioCliente);
		
		this.jmenuDetalleAccionesServicioCliente.add(this.jMenuItemActualizarServicioCliente);
		this.jmenuDetalleAccionesServicioCliente.add(this.jMenuItemEliminarServicioCliente);
		this.jmenuDetalleAccionesServicioCliente.add(this.jMenuItemCancelarServicioCliente);		
		
		//this.jmenuDetalleDatosServicioCliente.add(this.jMenuItemDetalleAbrirOrderByServicioCliente);				
		this.jmenuDetalleDatosServicioCliente.add(this.jMenuItemDetalleMostarOcultarServicioCliente);				
				
		//this.jmenuDetalleAccionesServicioCliente.add(this.jMenuItemGuardarCambiosServicioCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleServicioCliente.add(this.jmenuDetalleArchivoServicioCliente);		
		this.jmenuBarDetalleServicioCliente.add(this.jmenuDetalleAccionesServicioCliente);		
		this.jmenuBarDetalleServicioCliente.add(this.jmenuDetalleDatosServicioCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleServicioCliente);				
	}
	
	
	public void inicializarElementosCamposServicioCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdServicioCliente = new JLabelMe();
		jLabelIdServicioCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidServicioCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidServicioCliente.setToolTipText(ServicioClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutServicioCliente= new GridBagLayout();

		this.jPanelidServicioCliente.setLayout(this.gridaBagLayoutServicioCliente);

		jLabelidServicioCliente = new JLabel();
		jLabelidServicioCliente.setText("Id");

		jLabelidServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelprecioServicioCliente = new JLabelMe();
		this.jLabelprecioServicioCliente.setText(""+ServicioClienteConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioServicioCliente.setToolTipText("Precio");
		this.jLabelprecioServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioServicioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioServicioCliente.setToolTipText(ServicioClienteConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutServicioCliente = new GridBagLayout();
		this.jPanelprecioServicioCliente.setLayout(this.gridaBagLayoutServicioCliente);


		jTextFieldprecioServicioCliente= new JTextFieldMe();
		jTextFieldprecioServicioCliente.setEnabled(false);
		jTextFieldprecioServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioServicioCliente.setText("0.0");

		this.jButtonprecioServicioClienteBusqueda= new JButtonMe();
		this.jButtonprecioServicioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioServicioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioServicioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioServicioClienteBusqueda.setText("U");
		this.jButtonprecioServicioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioServicioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioServicioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioServicioClienteBusqueda"));

		if(this.servicioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioServicioClienteBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionServicioCliente = new JLabelMe();
		this.jLabeldescripcionServicioCliente.setText(""+ServicioClienteConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionServicioCliente.setToolTipText("Descripcion");
		this.jLabeldescripcionServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionServicioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionServicioCliente.setToolTipText(ServicioClienteConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutServicioCliente = new GridBagLayout();
		this.jPaneldescripcionServicioCliente.setLayout(this.gridaBagLayoutServicioCliente);


		jTextAreadescripcionServicioCliente= new JTextAreaMe();
		jTextAreadescripcionServicioCliente.setEnabled(false);
		jTextAreadescripcionServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionServicioCliente.setLineWrap(true);
		jTextAreadescripcionServicioCliente.setWrapStyleWord(true);
		jTextAreadescripcionServicioCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionServicioCliente.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionServicioCliente = new JScrollPane(jTextAreadescripcionServicioCliente);
		jscrollPanedescripcionServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionServicioClienteBusqueda= new JButtonMe();
		this.jButtondescripcionServicioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionServicioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionServicioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionServicioClienteBusqueda.setText("U");
		this.jButtondescripcionServicioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionServicioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionServicioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionServicioClienteBusqueda"));

		if(this.servicioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionServicioClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysServicioCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaServicioCliente = new JLabelMe();
		this.jLabelid_empresaServicioCliente.setText(""+ServicioClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaServicioCliente.setToolTipText("Empresa");
		this.jLabelid_empresaServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaServicioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaServicioCliente.setToolTipText(ServicioClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutServicioCliente = new GridBagLayout();
		this.jPanelid_empresaServicioCliente.setLayout(this.gridaBagLayoutServicioCliente);


		jComboBoxid_empresaServicioCliente= new JComboBoxMe();
		jComboBoxid_empresaServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaServicioCliente.setEnabled(false);

		this.jButtonid_empresaServicioCliente= new JButtonMe();
		this.jButtonid_empresaServicioCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaServicioCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaServicioCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaServicioCliente.setText("Buscar");
		this.jButtonid_empresaServicioCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaServicioCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaServicioCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaServicioCliente"));

		this.jButtonid_empresaServicioClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaServicioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaServicioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaServicioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaServicioClienteBusqueda.setText("U");
		this.jButtonid_empresaServicioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaServicioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaServicioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaServicioClienteBusqueda"));

		if(this.servicioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaServicioClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaServicioClienteUpdate= new JButtonMe();
		this.jButtonid_empresaServicioClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaServicioClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaServicioClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaServicioClienteUpdate.setText("U");
		this.jButtonid_empresaServicioClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaServicioClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaServicioClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaServicioClienteUpdate"));



					
		this.jLabelid_clienteServicioCliente = new JLabelMe();
		this.jLabelid_clienteServicioCliente.setText(""+ServicioClienteConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteServicioCliente.setToolTipText("Cliente");
		this.jLabelid_clienteServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteServicioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteServicioCliente.setToolTipText(ServicioClienteConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutServicioCliente = new GridBagLayout();
		this.jPanelid_clienteServicioCliente.setLayout(this.gridaBagLayoutServicioCliente);


		jComboBoxid_clienteServicioCliente= new JComboBoxMe();
		jComboBoxid_clienteServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteServicioCliente= new JButtonMe();
		this.jButtonid_clienteServicioCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteServicioCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteServicioCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteServicioCliente.setText("Buscar");
		this.jButtonid_clienteServicioCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteServicioCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteServicioCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteServicioCliente"));

		this.jButtonid_clienteServicioClienteBusqueda= new JButtonMe();
		this.jButtonid_clienteServicioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteServicioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteServicioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteServicioClienteBusqueda.setText("U");
		this.jButtonid_clienteServicioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteServicioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteServicioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteServicioClienteBusqueda"));

		if(this.servicioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteServicioClienteBusqueda.setVisible(false);		}

		this.jButtonid_clienteServicioClienteUpdate= new JButtonMe();
		this.jButtonid_clienteServicioClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteServicioClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteServicioClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteServicioClienteUpdate.setText("U");
		this.jButtonid_clienteServicioClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteServicioClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteServicioClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteServicioClienteUpdate"));



					
		this.jLabelid_bodegaServicioCliente = new JLabelMe();
		this.jLabelid_bodegaServicioCliente.setText(""+ServicioClienteConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaServicioCliente.setToolTipText("Bodega");
		this.jLabelid_bodegaServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaServicioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaServicioCliente.setToolTipText(ServicioClienteConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutServicioCliente = new GridBagLayout();
		this.jPanelid_bodegaServicioCliente.setLayout(this.gridaBagLayoutServicioCliente);


		jComboBoxid_bodegaServicioCliente= new JComboBoxMe();
		jComboBoxid_bodegaServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaServicioCliente= new JButtonMe();
		this.jButtonid_bodegaServicioCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaServicioCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaServicioCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaServicioCliente.setText("Buscar");
		this.jButtonid_bodegaServicioCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaServicioCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaServicioCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaServicioCliente"));

		this.jButtonid_bodegaServicioClienteBusqueda= new JButtonMe();
		this.jButtonid_bodegaServicioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaServicioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaServicioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaServicioClienteBusqueda.setText("U");
		this.jButtonid_bodegaServicioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaServicioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaServicioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaServicioClienteBusqueda"));

		if(this.servicioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaServicioClienteBusqueda.setVisible(false);		}

		this.jButtonid_bodegaServicioClienteUpdate= new JButtonMe();
		this.jButtonid_bodegaServicioClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaServicioClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaServicioClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaServicioClienteUpdate.setText("U");
		this.jButtonid_bodegaServicioClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaServicioClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaServicioClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaServicioClienteUpdate"));



					
		this.jLabelid_productoServicioCliente = new JLabelMe();
		this.jLabelid_productoServicioCliente.setText(""+ServicioClienteConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoServicioCliente.setToolTipText("Producto");
		this.jLabelid_productoServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoServicioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoServicioCliente.setToolTipText(ServicioClienteConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutServicioCliente = new GridBagLayout();
		this.jPanelid_productoServicioCliente.setLayout(this.gridaBagLayoutServicioCliente);


		jComboBoxid_productoServicioCliente= new JComboBoxMe();
		jComboBoxid_productoServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoServicioCliente= new JButtonMe();
		this.jButtonid_productoServicioCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoServicioCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoServicioCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoServicioCliente.setText("Buscar");
		this.jButtonid_productoServicioCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoServicioCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoServicioCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoServicioCliente"));

		this.jButtonid_productoServicioClienteBusqueda= new JButtonMe();
		this.jButtonid_productoServicioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoServicioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoServicioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoServicioClienteBusqueda.setText("U");
		this.jButtonid_productoServicioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoServicioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoServicioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoServicioClienteBusqueda"));

		if(this.servicioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoServicioClienteBusqueda.setVisible(false);		}

		this.jButtonid_productoServicioClienteUpdate= new JButtonMe();
		this.jButtonid_productoServicioClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoServicioClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoServicioClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoServicioClienteUpdate.setText("U");
		this.jButtonid_productoServicioClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoServicioClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoServicioClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoServicioClienteUpdate"));



					
		this.jLabelid_tipo_precioServicioCliente = new JLabelMe();
		this.jLabelid_tipo_precioServicioCliente.setText(""+ServicioClienteConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioServicioCliente.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioServicioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioServicioCliente.setToolTipText(ServicioClienteConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutServicioCliente = new GridBagLayout();
		this.jPanelid_tipo_precioServicioCliente.setLayout(this.gridaBagLayoutServicioCliente);


		jComboBoxid_tipo_precioServicioCliente= new JComboBoxMe();
		jComboBoxid_tipo_precioServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioServicioCliente= new JButtonMe();
		this.jButtonid_tipo_precioServicioCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioServicioCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioServicioCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioServicioCliente.setText("Buscar");
		this.jButtonid_tipo_precioServicioCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioServicioCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioServicioCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioServicioCliente"));

		this.jButtonid_tipo_precioServicioClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioServicioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioServicioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioServicioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioServicioClienteBusqueda.setText("U");
		this.jButtonid_tipo_precioServicioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioServicioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioServicioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioServicioClienteBusqueda"));

		if(this.servicioclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioServicioClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioServicioClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_precioServicioClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioServicioClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioServicioClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioServicioClienteUpdate.setText("U");
		this.jButtonid_tipo_precioServicioClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioServicioClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioServicioClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioServicioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioServicioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioServicioClienteUpdate"));



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
		//this.jInternalFrameDetalleServicioCliente = new ServicioClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Servicio Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutServicioCliente= new GridBagLayout();
		

		
		String sToolTipServicioCliente="";
		sToolTipServicioCliente=ServicioClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipServicioCliente+="(Cartera.ServicioCliente)";
		}
		
		if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipServicioCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoServicioCliente = new JButtonMe();
		this.jButtonModificarServicioCliente = new JButtonMe();
        this.jButtonActualizarServicioCliente = new JButtonMe();
        this.jButtonEliminarServicioCliente = new JButtonMe();
        this.jButtonCancelarServicioCliente = new JButtonMe();
        this.jButtonGuardarCambiosServicioCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaServicioCliente = new JButtonMe();
		this.jButtonCerrarServicioCliente = new JButtonMe();
		
		this.jScrollPanelDatosServicioCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionServicioCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralServicioCliente = new JScrollPane();
				
		
		
		this.jPanelCamposServicioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosServicioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesServicioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioServicioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Servicio Cliente";
		
		if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Servicio Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosServicioCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposServicioCliente.setName("jPanelCamposServicioCliente"); 

		this.jPanelCamposOcultosServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosServicioCliente.setName("jPanelCamposOcultosServicioCliente"); 

        this.jPanelAccionesServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesServicioCliente.setToolTipText("Acciones");
        this.jPanelAccionesServicioCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioServicioCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioServicioCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionServicioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralServicioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosServicioCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposServicioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosServicioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioServicioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoServicioCliente.setText("Nuevo");
		this.jButtonModificarServicioCliente.setText("Editar");
        this.jButtonActualizarServicioCliente.setText("Actualizar");
        this.jButtonEliminarServicioCliente.setText("Eliminar");
        this.jButtonCancelarServicioCliente.setText("Cancelar");
        this.jButtonGuardarCambiosServicioCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaServicioCliente.setText("Guardar");
		this.jButtonCerrarServicioCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoServicioCliente,"nuevo_button","Nuevo",this.servicioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarServicioCliente,"modificar_button","Editar",this.servicioclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarServicioCliente,"actualizar_button","Actualizar",this.servicioclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarServicioCliente,"eliminar_button","Eliminar",this.servicioclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarServicioCliente,"cancelar_button","Cancelar",this.servicioclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosServicioCliente,"guardarcambios_button","Guardar",this.servicioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaServicioCliente,"guardarcambiostabla_button","Guardar",this.servicioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarServicioCliente,"cerrar_button","Salir",this.servicioclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarServicioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarServicioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarServicioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoServicioCliente.setToolTipText("Nuevo"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarServicioCliente.setToolTipText("Editar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarServicioCliente.setToolTipText("Actualizar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarServicioCliente.setToolTipText("Eliminar)"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarServicioCliente.setToolTipText("Cancelar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosServicioCliente.setToolTipText("Guardar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaServicioCliente.setToolTipText("Guardar"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarServicioCliente.setToolTipText("Salir"+" "+ServicioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoServicioCliente";
		inputMap = this.jButtonNuevoServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoServicioCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoServicioCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarServicioCliente";
		inputMap = this.jButtonActualizarServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarServicioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarServicioCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarServicioCliente";
		inputMap = this.jButtonEliminarServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarServicioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarServicioCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarServicioCliente";
		inputMap = this.jButtonCancelarServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarServicioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarServicioCliente"));
		
		//CERRAR		
		sMapKey = "CerrarServicioCliente";
		inputMap = this.jButtonCerrarServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarServicioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarServicioCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaServicioCliente";
		inputMap = this.jButtonGuardarCambiosTablaServicioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaServicioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaServicioCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoServicioCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoServicioCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoServicioCliente.setToolTipText("Nuevo ServicioCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoServicioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarServicioCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarServicioCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarServicioCliente.setToolTipText("Sin Cerrar Ventana ServicioCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarServicioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeServicioCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeServicioCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeServicioCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeServicioCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesServicioCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesServicioCliente.setText("Accion");
		this.jComboBoxTiposAccionesServicioCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioServicioCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioServicioCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioServicioCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesServicioCliente = new JLabelMe();
		
		this.jLabelAccionesServicioCliente.setText("Acciones");		
		this.jLabelAccionesServicioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesServicioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesServicioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposServicioCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysServicioCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesServicioCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesServicioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesServicioCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesServicioCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesServicioCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesServicioCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesServicioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioServicioCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioServicioCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioServicioCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioServicioCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposServicioCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosServicioCliente = new GridBagLayout();
		
		this.jPanelCamposServicioCliente.setLayout(gridaBagLayoutCamposServicioCliente);
		this.jPanelCamposOcultosServicioCliente.setLayout(gridaBagLayoutCamposOcultosServicioCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 0;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidServicioCliente.add(jLabelIdServicioCliente, this.gridBagConstraintsServicioCliente);



	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 1;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidServicioCliente.add(jLabelidServicioCliente, this.gridBagConstraintsServicioCliente);


	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 0;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaServicioCliente.add(jLabelid_empresaServicioCliente, this.gridBagConstraintsServicioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		//this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = 0;
		this.gridBagConstraintsServicioCliente.gridx = 2;
		this.gridBagConstraintsServicioCliente.ipadx = 0;
		this.gridBagConstraintsServicioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaServicioCliente.add(jButtonid_empresaServicioClienteBusqueda, this.gridBagConstraintsServicioCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		//this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = 0;
		this.gridBagConstraintsServicioCliente.gridx = 3;
		this.gridBagConstraintsServicioCliente.ipadx = 0;
		this.gridBagConstraintsServicioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaServicioCliente.add(jButtonid_empresaServicioClienteUpdate, this.gridBagConstraintsServicioCliente);
	}

	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 1;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaServicioCliente.add(jComboBoxid_empresaServicioCliente, this.gridBagConstraintsServicioCliente);


	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 0;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteServicioCliente.add(jLabelid_clienteServicioCliente, this.gridBagConstraintsServicioCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	//this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 2;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteServicioCliente.add(jButtonid_clienteServicioCliente, this.gridBagConstraintsServicioCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		//this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = 0;
		this.gridBagConstraintsServicioCliente.gridx = 3;
		this.gridBagConstraintsServicioCliente.ipadx = 0;
		this.gridBagConstraintsServicioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteServicioCliente.add(jButtonid_clienteServicioClienteBusqueda, this.gridBagConstraintsServicioCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		//this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = 0;
		this.gridBagConstraintsServicioCliente.gridx = 4;
		this.gridBagConstraintsServicioCliente.ipadx = 0;
		this.gridBagConstraintsServicioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteServicioCliente.add(jButtonid_clienteServicioClienteUpdate, this.gridBagConstraintsServicioCliente);
	}

	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 1;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteServicioCliente.add(jComboBoxid_clienteServicioCliente, this.gridBagConstraintsServicioCliente);


	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 0;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaServicioCliente.add(jLabelid_bodegaServicioCliente, this.gridBagConstraintsServicioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		//this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = 0;
		this.gridBagConstraintsServicioCliente.gridx = 2;
		this.gridBagConstraintsServicioCliente.ipadx = 0;
		this.gridBagConstraintsServicioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaServicioCliente.add(jButtonid_bodegaServicioClienteBusqueda, this.gridBagConstraintsServicioCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		//this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = 0;
		this.gridBagConstraintsServicioCliente.gridx = 3;
		this.gridBagConstraintsServicioCliente.ipadx = 0;
		this.gridBagConstraintsServicioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaServicioCliente.add(jButtonid_bodegaServicioClienteUpdate, this.gridBagConstraintsServicioCliente);
	}

	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 1;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaServicioCliente.add(jComboBoxid_bodegaServicioCliente, this.gridBagConstraintsServicioCliente);


	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 0;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoServicioCliente.add(jLabelid_productoServicioCliente, this.gridBagConstraintsServicioCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	//this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 2;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoServicioCliente.add(jButtonid_productoServicioCliente, this.gridBagConstraintsServicioCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		//this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = 0;
		this.gridBagConstraintsServicioCliente.gridx = 3;
		this.gridBagConstraintsServicioCliente.ipadx = 0;
		this.gridBagConstraintsServicioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoServicioCliente.add(jButtonid_productoServicioClienteBusqueda, this.gridBagConstraintsServicioCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		//this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = 0;
		this.gridBagConstraintsServicioCliente.gridx = 4;
		this.gridBagConstraintsServicioCliente.ipadx = 0;
		this.gridBagConstraintsServicioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoServicioCliente.add(jButtonid_productoServicioClienteUpdate, this.gridBagConstraintsServicioCliente);
	}

	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 1;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoServicioCliente.add(jComboBoxid_productoServicioCliente, this.gridBagConstraintsServicioCliente);


	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 0;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_precioServicioCliente.add(jLabelid_tipo_precioServicioCliente, this.gridBagConstraintsServicioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		//this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = 0;
		this.gridBagConstraintsServicioCliente.gridx = 2;
		this.gridBagConstraintsServicioCliente.ipadx = 0;
		this.gridBagConstraintsServicioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioServicioCliente.add(jButtonid_tipo_precioServicioClienteBusqueda, this.gridBagConstraintsServicioCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		//this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = 0;
		this.gridBagConstraintsServicioCliente.gridx = 3;
		this.gridBagConstraintsServicioCliente.ipadx = 0;
		this.gridBagConstraintsServicioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioServicioCliente.add(jButtonid_tipo_precioServicioClienteUpdate, this.gridBagConstraintsServicioCliente);
	}

	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 1;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_precioServicioCliente.add(jComboBoxid_tipo_precioServicioCliente, this.gridBagConstraintsServicioCliente);


	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 0;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioServicioCliente.add(jLabelprecioServicioCliente, this.gridBagConstraintsServicioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		//this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = 0;
		this.gridBagConstraintsServicioCliente.gridx = 2;
		this.gridBagConstraintsServicioCliente.ipadx = 0;
		this.gridBagConstraintsServicioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioServicioCliente.add(jButtonprecioServicioClienteBusqueda, this.gridBagConstraintsServicioCliente);
	}

	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 1;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioServicioCliente.add(jTextFieldprecioServicioCliente, this.gridBagConstraintsServicioCliente);


	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 0;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionServicioCliente.add(jLabeldescripcionServicioCliente, this.gridBagConstraintsServicioCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		//this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsServicioCliente.gridy = 0;
		this.gridBagConstraintsServicioCliente.gridx = 2;
		this.gridBagConstraintsServicioCliente.ipadx = 0;
		this.gridBagConstraintsServicioCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionServicioCliente.add(jButtondescripcionServicioClienteBusqueda, this.gridBagConstraintsServicioCliente);
	}

	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsServicioCliente.gridy = 0;
	this.gridBagConstraintsServicioCliente.gridx = 1;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionServicioCliente.add(jscrollPanedescripcionServicioCliente, this.gridBagConstraintsServicioCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioCliente.gridy = iYPanelCamposServicioCliente;
	this.gridBagConstraintsServicioCliente.gridx = iXPanelCamposServicioCliente++;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioCliente.add(this.jPanelidServicioCliente, this.gridBagConstraintsServicioCliente);



	if(iXPanelCamposServicioCliente % 1==0) {
		iXPanelCamposServicioCliente=0;
		iYPanelCamposServicioCliente++;
	}
	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioCliente.gridy = iYPanelCamposServicioCliente;
	this.gridBagConstraintsServicioCliente.gridx = iXPanelCamposServicioCliente++;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioCliente.add(this.jPanelid_clienteServicioCliente, this.gridBagConstraintsServicioCliente);



	if(iXPanelCamposServicioCliente % 1==0) {
		iXPanelCamposServicioCliente=0;
		iYPanelCamposServicioCliente++;
	}
	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioCliente.gridy = iYPanelCamposServicioCliente;
	this.gridBagConstraintsServicioCliente.gridx = iXPanelCamposServicioCliente++;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioCliente.add(this.jPanelid_bodegaServicioCliente, this.gridBagConstraintsServicioCliente);



	if(iXPanelCamposServicioCliente % 1==0) {
		iXPanelCamposServicioCliente=0;
		iYPanelCamposServicioCliente++;
	}
	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioCliente.gridy = iYPanelCamposServicioCliente;
	this.gridBagConstraintsServicioCliente.gridx = iXPanelCamposServicioCliente++;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioCliente.add(this.jPanelid_productoServicioCliente, this.gridBagConstraintsServicioCliente);



	if(iXPanelCamposServicioCliente % 1==0) {
		iXPanelCamposServicioCliente=0;
		iYPanelCamposServicioCliente++;
	}
	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioCliente.gridy = iYPanelCamposServicioCliente;
	this.gridBagConstraintsServicioCliente.gridx = iXPanelCamposServicioCliente++;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioCliente.add(this.jPanelid_tipo_precioServicioCliente, this.gridBagConstraintsServicioCliente);



	if(iXPanelCamposServicioCliente % 1==0) {
		iXPanelCamposServicioCliente=0;
		iYPanelCamposServicioCliente++;
	}
	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioCliente.gridy = iYPanelCamposServicioCliente;
	this.gridBagConstraintsServicioCliente.gridx = iXPanelCamposServicioCliente++;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioCliente.add(this.jPanelprecioServicioCliente, this.gridBagConstraintsServicioCliente);



	if(iXPanelCamposServicioCliente % 1==0) {
		iXPanelCamposServicioCliente=0;
		iYPanelCamposServicioCliente++;
	}
	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioCliente.gridy = iYPanelCamposServicioCliente;
	this.gridBagConstraintsServicioCliente.gridx = iXPanelCamposServicioCliente++;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposServicioCliente.add(this.jPaneldescripcionServicioCliente, this.gridBagConstraintsServicioCliente);



	if(iXPanelCamposServicioCliente % 1==0) {
		iXPanelCamposServicioCliente=0;
		iYPanelCamposServicioCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsServicioCliente.gridy = iYPanelCamposOcultosServicioCliente;
	this.gridBagConstraintsServicioCliente.gridx = iXPanelCamposOcultosServicioCliente++;
	this.gridBagConstraintsServicioCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsServicioCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosServicioCliente.add(this.jPanelid_empresaServicioCliente, this.gridBagConstraintsServicioCliente);



	if(iXPanelCamposOcultosServicioCliente % 1==0) {
		iXPanelCamposOcultosServicioCliente=0;
		iYPanelCamposOcultosServicioCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesServicioCliente= new GridBagLayout();
		this.jPanelAccionesServicioCliente.setLayout(gridaBagLayoutAccionesServicioCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioServicioCliente= new GridBagLayout();
		this.jPanelAccionesFormularioServicioCliente.setLayout(gridaBagLayoutAccionesFormularioServicioCliente);
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsServicioCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioServicioCliente.add(this.jComboBoxTiposAccionesFormularioServicioCliente, this.gridBagConstraintsServicioCliente);

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsServicioCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioServicioCliente.add(this.jCheckBoxPostAccionNuevoServicioCliente, this.gridBagConstraintsServicioCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.servicioclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsServicioCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioServicioCliente.add(this.jCheckBoxPostAccionSinCerrarServicioCliente, this.gridBagConstraintsServicioCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.servicioclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.servicioclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsServicioCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioServicioCliente.add(this.jCheckBoxPostAccionSinMensajeServicioCliente, this.gridBagConstraintsServicioCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioCliente.gridy = 0;
		this.gridBagConstraintsServicioCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesServicioCliente.add(this.jButtonModificarServicioCliente, this.gridBagConstraintsServicioCliente);							

		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsServicioCliente.gridy = 0;
		this.gridBagConstraintsServicioCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesServicioCliente.add(this.jButtonEliminarServicioCliente, this.gridBagConstraintsServicioCliente);
		
			
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy = 0;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesServicioCliente.add(this.jButtonActualizarServicioCliente, this.gridBagConstraintsServicioCliente);


		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy = 0;		
		this.gridBagConstraintsServicioCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesServicioCliente.add(this.jButtonGuardarCambiosServicioCliente, this.gridBagConstraintsServicioCliente);	
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy = 0;		
		this.gridBagConstraintsServicioCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesServicioCliente.add(this.jButtonCancelarServicioCliente, this.gridBagConstraintsServicioCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutServicioCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutServicioCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.servicioclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();						
			this.gridBagConstraintsServicioCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsServicioCliente.gridx = 0;		
			//this.gridBagConstraintsServicioCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsServicioCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsServicioCliente.gridx =0;
		this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsServicioCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosServicioCliente, this.gridBagConstraintsServicioCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ServicioClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleServicioCliente = new ServicioClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Servicio Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Servicio Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Servicio Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ServicioClienteModel servicioclienteModel=new ServicioClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//ServicioClienteModel.ServicioClienteFocusTraversalPolicy servicioclienteFocusTraversalPolicy = servicioclienteModel.new ServicioClienteFocusTraversalPolicy(this);
			
			//servicioclienteFocusTraversalPolicy.setservicioclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(servicioclienteModel);
			
			
			this.jContentPaneDetalleServicioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleServicioCliente = new GridBagLayout();	
			this.jContentPaneDetalleServicioCliente.setLayout(gridaBagLayoutDetalleServicioCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosServicioCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsServicioCliente = new GridBagConstraints();
				this.gridBagConstraintsServicioCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsServicioCliente.gridx = 0;
					
				
				this.jContentPaneDetalleServicioCliente.add(jTtoolBarDetalleServicioCliente, gridBagConstraintsServicioCliente);								
				
}
			
			this.jScrollPanelDatosEdicionServicioCliente=   new JScrollPane(jContentPaneDetalleServicioCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionServicioCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionServicioCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionServicioCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralServicioCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralServicioCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralServicioCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralServicioCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsServicioCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsServicioCliente.gridx = 0;
	        
			this.jContentPaneDetalleServicioCliente.add(jPanelCamposServicioCliente, gridBagConstraintsServicioCliente);
			
			
			
			
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
						&& servicioclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.servicioclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsServicioCliente= new GridBagConstraints();
						this.gridBagConstraintsServicioCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsServicioCliente.gridx = 0;
						this.jContentPaneDetalleServicioCliente.add(this.jTabbedPaneRelacionesServicioCliente, this.gridBagConstraintsServicioCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesServicioCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosServicioCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsServicioCliente = new GridBagConstraints();
					this.gridBagConstraintsServicioCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsServicioCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsServicioCliente.gridx = 0;
					
				
					this.jContentPaneDetalleServicioCliente.add(jPanelCamposOcultosServicioCliente, gridBagConstraintsServicioCliente);
				
					this.jPanelCamposOcultosServicioCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsServicioCliente.gridx = 0;
	        this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleServicioCliente.add(this.jPanelAccionesFormularioServicioCliente, this.gridBagConstraintsServicioCliente);							
			
			
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
	        this.gridBagConstraintsServicioCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsServicioCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleServicioCliente.add(this.jPanelAccionesServicioCliente, this.gridBagConstraintsServicioCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionServicioCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionServicioCliente=   new JScrollPane(this.jPanelCamposServicioCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionServicioCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionServicioCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionServicioCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsServicioCliente.gridx = 0;
			this.gridBagConstraintsServicioCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsServicioCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsServicioCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionServicioCliente, this.gridBagConstraintsServicioCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsServicioCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioServicioCliente, this.gridBagConstraintsServicioCliente);			
			
			this.gridBagConstraintsServicioCliente = new GridBagConstraints();
			this.gridBagConstraintsServicioCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsServicioCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesServicioCliente, this.gridBagConstraintsServicioCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicioCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposServicioCliente, this.gridBagConstraintsServicioCliente);
			
			
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsServicioCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosServicioCliente, this.gridBagConstraintsServicioCliente);
		
			
		this.gridBagConstraintsServicioCliente = new GridBagConstraints();
		this.gridBagConstraintsServicioCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsServicioCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesServicioCliente, this.gridBagConstraintsServicioCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralServicioCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionServicioCliente;
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
