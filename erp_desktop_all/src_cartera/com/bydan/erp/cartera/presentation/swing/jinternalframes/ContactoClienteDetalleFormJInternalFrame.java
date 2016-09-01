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

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.ContactoClienteConstantesFunciones;

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
public class ContactoClienteDetalleFormJInternalFrame extends ContactoClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleContactoCliente;
	
	protected JMenuBar jmenuBarDetalleContactoCliente;
	
	protected JMenu jmenuDetalleContactoCliente;
	protected JMenu jmenuDetalleArchivoContactoCliente;
	protected JMenu jmenuDetalleAccionesContactoCliente;
	protected JMenu jmenuDetalleDatosContactoCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleContactoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutContactoCliente;	
	protected GridBagConstraints gridBagConstraintsContactoCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ContactoClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleContactoCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public ContactoClienteSessionBean contactoclienteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public ContactoClienteLogic contactoclienteLogic;
	
	public JScrollPane jScrollPanelDatosContactoCliente;
	public JScrollPane jScrollPanelDatosEdicionContactoCliente;
	public JScrollPane jScrollPanelDatosGeneralContactoCliente;
	
	protected JPanel jPanelCamposContactoCliente;    
	protected JPanel jPanelCamposOcultosContactoCliente;    	
	protected JPanel jPanelAccionesContactoCliente;
	protected JPanel jPanelAccionesFormularioContactoCliente;
    
	
	
	protected Integer iXPanelCamposContactoCliente=0;
	protected Integer iYPanelCamposContactoCliente=0;
	
	protected Integer iXPanelCamposOcultosContactoCliente=0;
	protected Integer iYPanelCamposOcultosContactoCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoContactoCliente;
	public JButton jButtonModificarContactoCliente;
	public JButton jButtonActualizarContactoCliente;
    public JButton jButtonEliminarContactoCliente;
	public JButton jButtonCancelarContactoCliente;
    public JButton jButtonGuardarCambiosContactoCliente;
	public JButton jButtonGuardarCambiosTablaContactoCliente;
	protected JButton jButtonCerrarContactoCliente;
	
	
	protected JButton jButtonProcesarInformacionContactoCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoContactoCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarContactoCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeContactoCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarContactoCliente;
	protected JButton jButtonModificarToolBarContactoCliente;
	protected JButton jButtonActualizarToolBarContactoCliente;
    protected JButton jButtonEliminarToolBarContactoCliente;
	protected JButton jButtonCancelarToolBarContactoCliente;
    protected JButton jButtonGuardarCambiosToolBarContactoCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarContactoCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarContactoCliente;
	protected JButton jButtonCerrarToolBarContactoCliente;
	
	protected JButton jButtonProcesarInformacionToolBarContactoCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoContactoCliente;
	protected JMenuItem jMenuItemModificarContactoCliente;
	protected JMenuItem jMenuItemActualizarContactoCliente;
    protected JMenuItem jMenuItemEliminarContactoCliente;
	protected JMenuItem jMenuItemCancelarContactoCliente;
    protected JMenuItem jMenuItemGuardarCambiosContactoCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaContactoCliente;
	protected JMenuItem jMenuItemCerrarContactoCliente;
	protected JMenuItem jMenuItemDetalleCerrarContactoCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarContactoCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionContactoCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosContactoCliente;
	protected JMenuItem jMenuItemMostrarOcultarContactoCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesContactoCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesContactoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesContactoCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioContactoCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidContactoCliente;
	public JLabel jLabelIdContactoCliente;
	public JLabel jLabelidContactoCliente;
	public JButton jButtonidContactoClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoContactoCliente;
	public JLabel jLabelnombre_completoContactoCliente;
	public JTextArea jTextAreanombre_completoContactoCliente;
	public JScrollPane jscrollPanenombre_completoContactoCliente;
	public JButton jButtonnombre_completoContactoClienteBusqueda= new JButtonMe();

	public JPanel jPanelrucContactoCliente;
	public JLabel jLabelrucContactoCliente;
	public JTextField jTextFieldrucContactoCliente;
	public JButton jButtonrucContactoClienteBusqueda= new JButtonMe();

	public JPanel jPaneldireccionContactoCliente;
	public JLabel jLabeldireccionContactoCliente;
	public JTextArea jTextAreadireccionContactoCliente;
	public JScrollPane jscrollPanedireccionContactoCliente;
	public JButton jButtondireccionContactoClienteBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoContactoCliente;
	public JLabel jLabeltelefonoContactoCliente;
	public JTextField jTextFieldtelefonoContactoCliente;
	public JButton jButtontelefonoContactoClienteBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_celularContactoCliente;
	public JLabel jLabeltelefono_celularContactoCliente;
	public JTextField jTextFieldtelefono_celularContactoCliente;
	public JButton jButtontelefono_celularContactoClienteBusqueda= new JButtonMe();

	public JPanel jPanelemailContactoCliente;
	public JLabel jLabelemailContactoCliente;
	public JTextField jTextFieldemailContactoCliente;
	public JButton jButtonemailContactoClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionContactoCliente;
	public JLabel jLabeldescripcionContactoCliente;
	public JTextArea jTextAreadescripcionContactoCliente;
	public JScrollPane jscrollPanedescripcionContactoCliente;
	public JButton jButtondescripcionContactoClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaContactoCliente;
	public JLabel jLabelid_empresaContactoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaContactoCliente;
	public JButton jButtonid_empresaContactoCliente= new JButtonMe();
	public JButton jButtonid_empresaContactoClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaContactoClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalContactoCliente;
	public JLabel jLabelid_sucursalContactoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalContactoCliente;
	public JButton jButtonid_sucursalContactoCliente= new JButtonMe();
	public JButton jButtonid_sucursalContactoClienteUpdate= new JButtonMe();
	public JButton jButtonid_sucursalContactoClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteContactoCliente;
	public JLabel jLabelid_clienteContactoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteContactoCliente;
	public JButton jButtonid_clienteContactoCliente= new JButtonMe();
	public JButton jButtonid_clienteContactoClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteContactoClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesContactoCliente;
	
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
	public int iHeightFormulario=1122;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ContactoClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposContactoCliente=new JPanel();
				this.jPanelAccionesFormularioContactoCliente=new JPanel();
				this.jmenuBarDetalleContactoCliente=new JMenuBar();
				this.jTtoolBarDetalleContactoCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContactoClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ContactoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ContactoClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ContactoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContactoClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ContactoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContactoClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ContactoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContactoClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ContactoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarContactoCliente() {
		return this.jButtonActualizarToolBarContactoCliente;
	}
	
	public JButton getjButtonEliminarToolBarContactoCliente() {
		return this.jButtonEliminarToolBarContactoCliente;
	}
	
	public JButton getjButtonCancelarToolBarContactoCliente() {
		return this.jButtonCancelarToolBarContactoCliente;
	}		
	
	public JButton getjButtonProcesarInformacionContactoCliente() {
		return this.jButtonProcesarInformacionContactoCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionContactoCliente)	{
		this.jButtonProcesarInformacionContactoCliente = jButtonProcesarInformacionContactoCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesContactoCliente() {
		return this.jComboBoxTiposAccionesContactoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesContactoCliente(
			JComboBox jComboBoxTiposRelacionesContactoCliente) {
		this.jComboBoxTiposRelacionesContactoCliente = jComboBoxTiposRelacionesContactoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesContactoCliente(
			JComboBox jComboBoxTiposAccionesContactoCliente) {
		this.jComboBoxTiposAccionesContactoCliente = jComboBoxTiposAccionesContactoCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioContactoCliente() {
		return this.jComboBoxTiposAccionesFormularioContactoCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioContactoCliente(
			JComboBox jComboBoxTiposAccionesFormularioContactoCliente) {
		this.jComboBoxTiposAccionesFormularioContactoCliente = jComboBoxTiposAccionesFormularioContactoCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.contactoclienteSessionBean=new ContactoClienteSessionBean();
		
		this.contactoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.contactoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.contactoclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ContactoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ContactoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ContactoClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Contacto Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		ContactoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleContactoCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarContactoCliente=new JButtonMe();
				this.jButtonModificarToolBarContactoCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarContactoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarContactoCliente,this.jTtoolBarDetalleContactoCliente,
							"actualizar","actualizar","Actualizar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarContactoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarContactoCliente,this.jTtoolBarDetalleContactoCliente,
							"eliminar","eliminar","Eliminar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarContactoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarContactoCliente,this.jTtoolBarDetalleContactoCliente,
							"cancelar","cancelar","Cancelar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarContactoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarContactoCliente,this.jTtoolBarDetalleContactoCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleContactoCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleContactoCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoContactoCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesContactoCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosContactoCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoContactoCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoContactoCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoContactoCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarContactoCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarContactoCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarContactoCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarContactoCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarContactoCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarContactoCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarContactoCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarContactoCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarContactoCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarContactoCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarContactoCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarContactoCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosContactoCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosContactoCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosContactoCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarContactoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarContactoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarContactoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarContactoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarContactoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarContactoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarContactoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarContactoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarContactoCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarContactoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarContactoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarContactoCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoContactoCliente.add(this.jMenuItemDetalleCerrarContactoCliente);
		
		this.jmenuDetalleAccionesContactoCliente.add(this.jMenuItemActualizarContactoCliente);
		this.jmenuDetalleAccionesContactoCliente.add(this.jMenuItemEliminarContactoCliente);
		this.jmenuDetalleAccionesContactoCliente.add(this.jMenuItemCancelarContactoCliente);		
		
		//this.jmenuDetalleDatosContactoCliente.add(this.jMenuItemDetalleAbrirOrderByContactoCliente);				
		this.jmenuDetalleDatosContactoCliente.add(this.jMenuItemDetalleMostarOcultarContactoCliente);				
				
		//this.jmenuDetalleAccionesContactoCliente.add(this.jMenuItemGuardarCambiosContactoCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleContactoCliente.add(this.jmenuDetalleArchivoContactoCliente);		
		this.jmenuBarDetalleContactoCliente.add(this.jmenuDetalleAccionesContactoCliente);		
		this.jmenuBarDetalleContactoCliente.add(this.jmenuDetalleDatosContactoCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleContactoCliente);				
	}
	
	
	public void inicializarElementosCamposContactoCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdContactoCliente = new JLabelMe();
		jLabelIdContactoCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidContactoCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidContactoCliente.setToolTipText(ContactoClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutContactoCliente= new GridBagLayout();

		this.jPanelidContactoCliente.setLayout(this.gridaBagLayoutContactoCliente);

		jLabelidContactoCliente = new JLabel();
		jLabelidContactoCliente.setText("Id");

		jLabelidContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_completoContactoCliente = new JLabelMe();
		this.jLabelnombre_completoContactoCliente.setText(""+ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoContactoCliente.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoContactoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoContactoCliente.setToolTipText(ContactoClienteConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutContactoCliente = new GridBagLayout();
		this.jPanelnombre_completoContactoCliente.setLayout(this.gridaBagLayoutContactoCliente);


		jTextAreanombre_completoContactoCliente= new JTextAreaMe();
		jTextAreanombre_completoContactoCliente.setEnabled(false);
		jTextAreanombre_completoContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoContactoCliente.setLineWrap(true);
		jTextAreanombre_completoContactoCliente.setWrapStyleWord(true);
		jTextAreanombre_completoContactoCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoContactoCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoContactoCliente = new JScrollPane(jTextAreanombre_completoContactoCliente);
		jscrollPanenombre_completoContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completoContactoClienteBusqueda= new JButtonMe();
		this.jButtonnombre_completoContactoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoContactoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoContactoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoContactoClienteBusqueda.setText("U");
		this.jButtonnombre_completoContactoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoContactoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoContactoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoContactoClienteBusqueda"));

		if(this.contactoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoContactoClienteBusqueda.setVisible(false);		}


					
		this.jLabelrucContactoCliente = new JLabelMe();
		this.jLabelrucContactoCliente.setText(""+ContactoClienteConstantesFunciones.LABEL_RUC+" :");
		this.jLabelrucContactoCliente.setToolTipText("Ruc");
		this.jLabelrucContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucContactoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucContactoCliente.setToolTipText(ContactoClienteConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutContactoCliente = new GridBagLayout();
		this.jPanelrucContactoCliente.setLayout(this.gridaBagLayoutContactoCliente);


		jTextFieldrucContactoCliente= new JTextFieldMe();

		jTextFieldrucContactoCliente.setEnabled(false);
		jTextFieldrucContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucContactoClienteBusqueda= new JButtonMe();
		this.jButtonrucContactoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucContactoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucContactoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucContactoClienteBusqueda.setText("U");
		this.jButtonrucContactoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucContactoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucContactoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucContactoClienteBusqueda"));

		if(this.contactoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucContactoClienteBusqueda.setVisible(false);		}


					
		this.jLabeldireccionContactoCliente = new JLabelMe();
		this.jLabeldireccionContactoCliente.setText(""+ContactoClienteConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionContactoCliente.setToolTipText("Direccion");
		this.jLabeldireccionContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionContactoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionContactoCliente.setToolTipText(ContactoClienteConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutContactoCliente = new GridBagLayout();
		this.jPaneldireccionContactoCliente.setLayout(this.gridaBagLayoutContactoCliente);


		jTextAreadireccionContactoCliente= new JTextAreaMe();
		jTextAreadireccionContactoCliente.setEnabled(false);
		jTextAreadireccionContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionContactoCliente.setLineWrap(true);
		jTextAreadireccionContactoCliente.setWrapStyleWord(true);
		jTextAreadireccionContactoCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionContactoCliente.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionContactoCliente = new JScrollPane(jTextAreadireccionContactoCliente);
		jscrollPanedireccionContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionContactoClienteBusqueda= new JButtonMe();
		this.jButtondireccionContactoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionContactoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionContactoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionContactoClienteBusqueda.setText("U");
		this.jButtondireccionContactoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionContactoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionContactoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionContactoClienteBusqueda"));

		if(this.contactoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionContactoClienteBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoContactoCliente = new JLabelMe();
		this.jLabeltelefonoContactoCliente.setText(""+ContactoClienteConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoContactoCliente.setToolTipText("Telefono");
		this.jLabeltelefonoContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoContactoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoContactoCliente.setToolTipText(ContactoClienteConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutContactoCliente = new GridBagLayout();
		this.jPaneltelefonoContactoCliente.setLayout(this.gridaBagLayoutContactoCliente);


		jTextFieldtelefonoContactoCliente= new JTextFieldMe();

		jTextFieldtelefonoContactoCliente.setEnabled(false);
		jTextFieldtelefonoContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoContactoClienteBusqueda= new JButtonMe();
		this.jButtontelefonoContactoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoContactoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoContactoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoContactoClienteBusqueda.setText("U");
		this.jButtontelefonoContactoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoContactoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoContactoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoContactoClienteBusqueda"));

		if(this.contactoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoContactoClienteBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_celularContactoCliente = new JLabelMe();
		this.jLabeltelefono_celularContactoCliente.setText(""+ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR+" :");
		this.jLabeltelefono_celularContactoCliente.setToolTipText("Telefono Celular");
		this.jLabeltelefono_celularContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_celularContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_celularContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_celularContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_celularContactoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_celularContactoCliente.setToolTipText(ContactoClienteConstantesFunciones.LABEL_TELEFONOCELULAR);
		this.gridaBagLayoutContactoCliente = new GridBagLayout();
		this.jPaneltelefono_celularContactoCliente.setLayout(this.gridaBagLayoutContactoCliente);


		jTextFieldtelefono_celularContactoCliente= new JTextFieldMe();

		jTextFieldtelefono_celularContactoCliente.setEnabled(false);
		jTextFieldtelefono_celularContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefono_celularContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefono_celularContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefono_celularContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefono_celularContactoClienteBusqueda= new JButtonMe();
		this.jButtontelefono_celularContactoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_celularContactoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_celularContactoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_celularContactoClienteBusqueda.setText("U");
		this.jButtontelefono_celularContactoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_celularContactoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_celularContactoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefono_celularContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefono_celularContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_celularContactoClienteBusqueda"));

		if(this.contactoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_celularContactoClienteBusqueda.setVisible(false);		}


					
		this.jLabelemailContactoCliente = new JLabelMe();
		this.jLabelemailContactoCliente.setText(""+ContactoClienteConstantesFunciones.LABEL_EMAIL+" :");
		this.jLabelemailContactoCliente.setToolTipText("Email");
		this.jLabelemailContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelemailContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelemailContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelemailContactoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelemailContactoCliente.setToolTipText(ContactoClienteConstantesFunciones.LABEL_EMAIL);
		this.gridaBagLayoutContactoCliente = new GridBagLayout();
		this.jPanelemailContactoCliente.setLayout(this.gridaBagLayoutContactoCliente);


		jTextFieldemailContactoCliente= new JTextFieldMe();

		jTextFieldemailContactoCliente.setEnabled(false);
		jTextFieldemailContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldemailContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldemailContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldemailContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonemailContactoClienteBusqueda= new JButtonMe();
		this.jButtonemailContactoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailContactoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonemailContactoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonemailContactoClienteBusqueda.setText("U");
		this.jButtonemailContactoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonemailContactoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonemailContactoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldemailContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldemailContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"emailContactoClienteBusqueda"));

		if(this.contactoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonemailContactoClienteBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionContactoCliente = new JLabelMe();
		this.jLabeldescripcionContactoCliente.setText(""+ContactoClienteConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionContactoCliente.setToolTipText("Descripcion");
		this.jLabeldescripcionContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionContactoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionContactoCliente.setToolTipText(ContactoClienteConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutContactoCliente = new GridBagLayout();
		this.jPaneldescripcionContactoCliente.setLayout(this.gridaBagLayoutContactoCliente);


		jTextAreadescripcionContactoCliente= new JTextAreaMe();
		jTextAreadescripcionContactoCliente.setEnabled(false);
		jTextAreadescripcionContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionContactoCliente.setLineWrap(true);
		jTextAreadescripcionContactoCliente.setWrapStyleWord(true);
		jTextAreadescripcionContactoCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionContactoCliente.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionContactoCliente = new JScrollPane(jTextAreadescripcionContactoCliente);
		jscrollPanedescripcionContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionContactoClienteBusqueda= new JButtonMe();
		this.jButtondescripcionContactoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionContactoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionContactoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionContactoClienteBusqueda.setText("U");
		this.jButtondescripcionContactoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionContactoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionContactoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionContactoClienteBusqueda"));

		if(this.contactoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionContactoClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysContactoCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaContactoCliente = new JLabelMe();
		this.jLabelid_empresaContactoCliente.setText(""+ContactoClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaContactoCliente.setToolTipText("Empresa");
		this.jLabelid_empresaContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaContactoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaContactoCliente.setToolTipText(ContactoClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutContactoCliente = new GridBagLayout();
		this.jPanelid_empresaContactoCliente.setLayout(this.gridaBagLayoutContactoCliente);


		jComboBoxid_empresaContactoCliente= new JComboBoxMe();
		jComboBoxid_empresaContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaContactoCliente.setEnabled(false);

		this.jButtonid_empresaContactoCliente= new JButtonMe();
		this.jButtonid_empresaContactoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaContactoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaContactoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaContactoCliente.setText("Buscar");
		this.jButtonid_empresaContactoCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaContactoCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaContactoCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaContactoCliente"));

		this.jButtonid_empresaContactoClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaContactoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaContactoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaContactoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaContactoClienteBusqueda.setText("U");
		this.jButtonid_empresaContactoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaContactoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaContactoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaContactoClienteBusqueda"));

		if(this.contactoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaContactoClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaContactoClienteUpdate= new JButtonMe();
		this.jButtonid_empresaContactoClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaContactoClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaContactoClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaContactoClienteUpdate.setText("U");
		this.jButtonid_empresaContactoClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaContactoClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaContactoClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaContactoClienteUpdate"));



					
		this.jLabelid_sucursalContactoCliente = new JLabelMe();
		this.jLabelid_sucursalContactoCliente.setText(""+ContactoClienteConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalContactoCliente.setToolTipText("Sucursal");
		this.jLabelid_sucursalContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalContactoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalContactoCliente.setToolTipText(ContactoClienteConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutContactoCliente = new GridBagLayout();
		this.jPanelid_sucursalContactoCliente.setLayout(this.gridaBagLayoutContactoCliente);


		jComboBoxid_sucursalContactoCliente= new JComboBoxMe();
		jComboBoxid_sucursalContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalContactoCliente.setEnabled(false);

		this.jButtonid_sucursalContactoCliente= new JButtonMe();
		this.jButtonid_sucursalContactoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalContactoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalContactoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalContactoCliente.setText("Buscar");
		this.jButtonid_sucursalContactoCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalContactoCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalContactoCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalContactoCliente"));

		this.jButtonid_sucursalContactoClienteBusqueda= new JButtonMe();
		this.jButtonid_sucursalContactoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalContactoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalContactoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalContactoClienteBusqueda.setText("U");
		this.jButtonid_sucursalContactoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalContactoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalContactoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalContactoClienteBusqueda"));

		if(this.contactoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalContactoClienteBusqueda.setVisible(false);		}

		this.jButtonid_sucursalContactoClienteUpdate= new JButtonMe();
		this.jButtonid_sucursalContactoClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalContactoClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalContactoClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalContactoClienteUpdate.setText("U");
		this.jButtonid_sucursalContactoClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalContactoClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalContactoClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalContactoClienteUpdate"));



					
		this.jLabelid_clienteContactoCliente = new JLabelMe();
		this.jLabelid_clienteContactoCliente.setText(""+ContactoClienteConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteContactoCliente.setToolTipText("Cliente");
		this.jLabelid_clienteContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteContactoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteContactoCliente.setToolTipText(ContactoClienteConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutContactoCliente = new GridBagLayout();
		this.jPanelid_clienteContactoCliente.setLayout(this.gridaBagLayoutContactoCliente);


		jComboBoxid_clienteContactoCliente= new JComboBoxMe();
		jComboBoxid_clienteContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteContactoCliente= new JButtonMe();
		this.jButtonid_clienteContactoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteContactoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteContactoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteContactoCliente.setText("Buscar");
		this.jButtonid_clienteContactoCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteContactoCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteContactoCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteContactoCliente"));

		this.jButtonid_clienteContactoClienteBusqueda= new JButtonMe();
		this.jButtonid_clienteContactoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteContactoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteContactoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteContactoClienteBusqueda.setText("U");
		this.jButtonid_clienteContactoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteContactoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteContactoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteContactoClienteBusqueda"));

		if(this.contactoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteContactoClienteBusqueda.setVisible(false);		}

		this.jButtonid_clienteContactoClienteUpdate= new JButtonMe();
		this.jButtonid_clienteContactoClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteContactoClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteContactoClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteContactoClienteUpdate.setText("U");
		this.jButtonid_clienteContactoClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteContactoClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteContactoClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteContactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteContactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteContactoClienteUpdate"));



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
		//this.jInternalFrameDetalleContactoCliente = new ContactoClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Contacto Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutContactoCliente= new GridBagLayout();
		

		
		String sToolTipContactoCliente="";
		sToolTipContactoCliente=ContactoClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipContactoCliente+="(Cartera.ContactoCliente)";
		}
		
		if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipContactoCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoContactoCliente = new JButtonMe();
		this.jButtonModificarContactoCliente = new JButtonMe();
        this.jButtonActualizarContactoCliente = new JButtonMe();
        this.jButtonEliminarContactoCliente = new JButtonMe();
        this.jButtonCancelarContactoCliente = new JButtonMe();
        this.jButtonGuardarCambiosContactoCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaContactoCliente = new JButtonMe();
		this.jButtonCerrarContactoCliente = new JButtonMe();
		
		this.jScrollPanelDatosContactoCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionContactoCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralContactoCliente = new JScrollPane();
				
		
		
		this.jPanelCamposContactoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosContactoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesContactoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioContactoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Contacto Cliente";
		
		if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contacto Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosContactoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposContactoCliente.setName("jPanelCamposContactoCliente"); 

		this.jPanelCamposOcultosContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosContactoCliente.setName("jPanelCamposOcultosContactoCliente"); 

        this.jPanelAccionesContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesContactoCliente.setToolTipText("Acciones");
        this.jPanelAccionesContactoCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioContactoCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioContactoCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionContactoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralContactoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosContactoCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposContactoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosContactoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioContactoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoContactoCliente.setText("Nuevo");
		this.jButtonModificarContactoCliente.setText("Editar");
        this.jButtonActualizarContactoCliente.setText("Actualizar");
        this.jButtonEliminarContactoCliente.setText("Eliminar");
        this.jButtonCancelarContactoCliente.setText("Cancelar");
        this.jButtonGuardarCambiosContactoCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaContactoCliente.setText("Guardar");
		this.jButtonCerrarContactoCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoContactoCliente,"nuevo_button","Nuevo",this.contactoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarContactoCliente,"modificar_button","Editar",this.contactoclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarContactoCliente,"actualizar_button","Actualizar",this.contactoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarContactoCliente,"eliminar_button","Eliminar",this.contactoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarContactoCliente,"cancelar_button","Cancelar",this.contactoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosContactoCliente,"guardarcambios_button","Guardar",this.contactoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaContactoCliente,"guardarcambiostabla_button","Guardar",this.contactoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarContactoCliente,"cerrar_button","Salir",this.contactoclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarContactoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarContactoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarContactoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoContactoCliente.setToolTipText("Nuevo"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarContactoCliente.setToolTipText("Editar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarContactoCliente.setToolTipText("Actualizar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarContactoCliente.setToolTipText("Eliminar)"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarContactoCliente.setToolTipText("Cancelar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosContactoCliente.setToolTipText("Guardar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaContactoCliente.setToolTipText("Guardar"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarContactoCliente.setToolTipText("Salir"+" "+ContactoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoContactoCliente";
		inputMap = this.jButtonNuevoContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoContactoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoContactoCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarContactoCliente";
		inputMap = this.jButtonActualizarContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarContactoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarContactoCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarContactoCliente";
		inputMap = this.jButtonEliminarContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarContactoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarContactoCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarContactoCliente";
		inputMap = this.jButtonCancelarContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarContactoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarContactoCliente"));
		
		//CERRAR		
		sMapKey = "CerrarContactoCliente";
		inputMap = this.jButtonCerrarContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarContactoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarContactoCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaContactoCliente";
		inputMap = this.jButtonGuardarCambiosTablaContactoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaContactoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaContactoCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoContactoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoContactoCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoContactoCliente.setToolTipText("Nuevo ContactoCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoContactoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarContactoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarContactoCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarContactoCliente.setToolTipText("Sin Cerrar Ventana ContactoCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarContactoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeContactoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeContactoCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeContactoCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeContactoCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesContactoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesContactoCliente.setText("Accion");
		this.jComboBoxTiposAccionesContactoCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioContactoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioContactoCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioContactoCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesContactoCliente = new JLabelMe();
		
		this.jLabelAccionesContactoCliente.setText("Acciones");		
		this.jLabelAccionesContactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesContactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesContactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposContactoCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysContactoCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesContactoCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesContactoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesContactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesContactoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesContactoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesContactoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesContactoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioContactoCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioContactoCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioContactoCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioContactoCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposContactoCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosContactoCliente = new GridBagLayout();
		
		this.jPanelCamposContactoCliente.setLayout(gridaBagLayoutCamposContactoCliente);
		this.jPanelCamposOcultosContactoCliente.setLayout(gridaBagLayoutCamposOcultosContactoCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 0;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidContactoCliente.add(jLabelIdContactoCliente, this.gridBagConstraintsContactoCliente);



	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 1;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidContactoCliente.add(jLabelidContactoCliente, this.gridBagConstraintsContactoCliente);


	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 0;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaContactoCliente.add(jLabelid_empresaContactoCliente, this.gridBagConstraintsContactoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		//this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = 0;
		this.gridBagConstraintsContactoCliente.gridx = 2;
		this.gridBagConstraintsContactoCliente.ipadx = 0;
		this.gridBagConstraintsContactoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaContactoCliente.add(jButtonid_empresaContactoClienteBusqueda, this.gridBagConstraintsContactoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		//this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = 0;
		this.gridBagConstraintsContactoCliente.gridx = 3;
		this.gridBagConstraintsContactoCliente.ipadx = 0;
		this.gridBagConstraintsContactoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaContactoCliente.add(jButtonid_empresaContactoClienteUpdate, this.gridBagConstraintsContactoCliente);
	}

	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 1;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaContactoCliente.add(jComboBoxid_empresaContactoCliente, this.gridBagConstraintsContactoCliente);


	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 0;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalContactoCliente.add(jLabelid_sucursalContactoCliente, this.gridBagConstraintsContactoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		//this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = 0;
		this.gridBagConstraintsContactoCliente.gridx = 2;
		this.gridBagConstraintsContactoCliente.ipadx = 0;
		this.gridBagConstraintsContactoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalContactoCliente.add(jButtonid_sucursalContactoClienteBusqueda, this.gridBagConstraintsContactoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		//this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = 0;
		this.gridBagConstraintsContactoCliente.gridx = 3;
		this.gridBagConstraintsContactoCliente.ipadx = 0;
		this.gridBagConstraintsContactoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalContactoCliente.add(jButtonid_sucursalContactoClienteUpdate, this.gridBagConstraintsContactoCliente);
	}

	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 1;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalContactoCliente.add(jComboBoxid_sucursalContactoCliente, this.gridBagConstraintsContactoCliente);


	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 0;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteContactoCliente.add(jLabelid_clienteContactoCliente, this.gridBagConstraintsContactoCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	//this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 2;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteContactoCliente.add(jButtonid_clienteContactoCliente, this.gridBagConstraintsContactoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		//this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = 0;
		this.gridBagConstraintsContactoCliente.gridx = 3;
		this.gridBagConstraintsContactoCliente.ipadx = 0;
		this.gridBagConstraintsContactoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteContactoCliente.add(jButtonid_clienteContactoClienteBusqueda, this.gridBagConstraintsContactoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		//this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = 0;
		this.gridBagConstraintsContactoCliente.gridx = 4;
		this.gridBagConstraintsContactoCliente.ipadx = 0;
		this.gridBagConstraintsContactoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteContactoCliente.add(jButtonid_clienteContactoClienteUpdate, this.gridBagConstraintsContactoCliente);
	}

	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 1;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteContactoCliente.add(jComboBoxid_clienteContactoCliente, this.gridBagConstraintsContactoCliente);


	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 0;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoContactoCliente.add(jLabelnombre_completoContactoCliente, this.gridBagConstraintsContactoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		//this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = 0;
		this.gridBagConstraintsContactoCliente.gridx = 2;
		this.gridBagConstraintsContactoCliente.ipadx = 0;
		this.gridBagConstraintsContactoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoContactoCliente.add(jButtonnombre_completoContactoClienteBusqueda, this.gridBagConstraintsContactoCliente);
	}

	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 1;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoContactoCliente.add(jscrollPanenombre_completoContactoCliente, this.gridBagConstraintsContactoCliente);


	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 0;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucContactoCliente.add(jLabelrucContactoCliente, this.gridBagConstraintsContactoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		//this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = 0;
		this.gridBagConstraintsContactoCliente.gridx = 2;
		this.gridBagConstraintsContactoCliente.ipadx = 0;
		this.gridBagConstraintsContactoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucContactoCliente.add(jButtonrucContactoClienteBusqueda, this.gridBagConstraintsContactoCliente);
	}

	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 1;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucContactoCliente.add(jTextFieldrucContactoCliente, this.gridBagConstraintsContactoCliente);


	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 0;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionContactoCliente.add(jLabeldireccionContactoCliente, this.gridBagConstraintsContactoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		//this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = 0;
		this.gridBagConstraintsContactoCliente.gridx = 2;
		this.gridBagConstraintsContactoCliente.ipadx = 0;
		this.gridBagConstraintsContactoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionContactoCliente.add(jButtondireccionContactoClienteBusqueda, this.gridBagConstraintsContactoCliente);
	}

	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 1;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionContactoCliente.add(jscrollPanedireccionContactoCliente, this.gridBagConstraintsContactoCliente);


	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 0;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoContactoCliente.add(jLabeltelefonoContactoCliente, this.gridBagConstraintsContactoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		//this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = 0;
		this.gridBagConstraintsContactoCliente.gridx = 2;
		this.gridBagConstraintsContactoCliente.ipadx = 0;
		this.gridBagConstraintsContactoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoContactoCliente.add(jButtontelefonoContactoClienteBusqueda, this.gridBagConstraintsContactoCliente);
	}

	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 1;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoContactoCliente.add(jTextFieldtelefonoContactoCliente, this.gridBagConstraintsContactoCliente);


	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 0;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefono_celularContactoCliente.add(jLabeltelefono_celularContactoCliente, this.gridBagConstraintsContactoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		//this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = 0;
		this.gridBagConstraintsContactoCliente.gridx = 2;
		this.gridBagConstraintsContactoCliente.ipadx = 0;
		this.gridBagConstraintsContactoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_celularContactoCliente.add(jButtontelefono_celularContactoClienteBusqueda, this.gridBagConstraintsContactoCliente);
	}

	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 1;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefono_celularContactoCliente.add(jTextFieldtelefono_celularContactoCliente, this.gridBagConstraintsContactoCliente);


	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 0;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelemailContactoCliente.add(jLabelemailContactoCliente, this.gridBagConstraintsContactoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		//this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = 0;
		this.gridBagConstraintsContactoCliente.gridx = 2;
		this.gridBagConstraintsContactoCliente.ipadx = 0;
		this.gridBagConstraintsContactoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelemailContactoCliente.add(jButtonemailContactoClienteBusqueda, this.gridBagConstraintsContactoCliente);
	}

	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 1;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelemailContactoCliente.add(jTextFieldemailContactoCliente, this.gridBagConstraintsContactoCliente);


	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 0;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionContactoCliente.add(jLabeldescripcionContactoCliente, this.gridBagConstraintsContactoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		//this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContactoCliente.gridy = 0;
		this.gridBagConstraintsContactoCliente.gridx = 2;
		this.gridBagConstraintsContactoCliente.ipadx = 0;
		this.gridBagConstraintsContactoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionContactoCliente.add(jButtondescripcionContactoClienteBusqueda, this.gridBagConstraintsContactoCliente);
	}

	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContactoCliente.gridy = 0;
	this.gridBagConstraintsContactoCliente.gridx = 1;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionContactoCliente.add(jscrollPanedescripcionContactoCliente, this.gridBagConstraintsContactoCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContactoCliente.gridy = iYPanelCamposContactoCliente;
	this.gridBagConstraintsContactoCliente.gridx = iXPanelCamposContactoCliente++;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContactoCliente.add(this.jPanelidContactoCliente, this.gridBagConstraintsContactoCliente);



	if(iXPanelCamposContactoCliente % 1==0) {
		iXPanelCamposContactoCliente=0;
		iYPanelCamposContactoCliente++;
	}
	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContactoCliente.gridy = iYPanelCamposContactoCliente;
	this.gridBagConstraintsContactoCliente.gridx = iXPanelCamposContactoCliente++;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContactoCliente.add(this.jPanelid_clienteContactoCliente, this.gridBagConstraintsContactoCliente);



	if(iXPanelCamposContactoCliente % 1==0) {
		iXPanelCamposContactoCliente=0;
		iYPanelCamposContactoCliente++;
	}
	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContactoCliente.gridy = iYPanelCamposContactoCliente;
	this.gridBagConstraintsContactoCliente.gridx = iXPanelCamposContactoCliente++;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContactoCliente.add(this.jPanelnombre_completoContactoCliente, this.gridBagConstraintsContactoCliente);



	if(iXPanelCamposContactoCliente % 1==0) {
		iXPanelCamposContactoCliente=0;
		iYPanelCamposContactoCliente++;
	}
	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContactoCliente.gridy = iYPanelCamposContactoCliente;
	this.gridBagConstraintsContactoCliente.gridx = iXPanelCamposContactoCliente++;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContactoCliente.add(this.jPanelrucContactoCliente, this.gridBagConstraintsContactoCliente);



	if(iXPanelCamposContactoCliente % 1==0) {
		iXPanelCamposContactoCliente=0;
		iYPanelCamposContactoCliente++;
	}
	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContactoCliente.gridy = iYPanelCamposContactoCliente;
	this.gridBagConstraintsContactoCliente.gridx = iXPanelCamposContactoCliente++;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContactoCliente.add(this.jPaneldireccionContactoCliente, this.gridBagConstraintsContactoCliente);



	if(iXPanelCamposContactoCliente % 1==0) {
		iXPanelCamposContactoCliente=0;
		iYPanelCamposContactoCliente++;
	}
	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContactoCliente.gridy = iYPanelCamposContactoCliente;
	this.gridBagConstraintsContactoCliente.gridx = iXPanelCamposContactoCliente++;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContactoCliente.add(this.jPaneltelefonoContactoCliente, this.gridBagConstraintsContactoCliente);



	if(iXPanelCamposContactoCliente % 1==0) {
		iXPanelCamposContactoCliente=0;
		iYPanelCamposContactoCliente++;
	}
	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContactoCliente.gridy = iYPanelCamposContactoCliente;
	this.gridBagConstraintsContactoCliente.gridx = iXPanelCamposContactoCliente++;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContactoCliente.add(this.jPaneltelefono_celularContactoCliente, this.gridBagConstraintsContactoCliente);



	if(iXPanelCamposContactoCliente % 1==0) {
		iXPanelCamposContactoCliente=0;
		iYPanelCamposContactoCliente++;
	}
	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContactoCliente.gridy = iYPanelCamposContactoCliente;
	this.gridBagConstraintsContactoCliente.gridx = iXPanelCamposContactoCliente++;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContactoCliente.add(this.jPanelemailContactoCliente, this.gridBagConstraintsContactoCliente);



	if(iXPanelCamposContactoCliente % 1==0) {
		iXPanelCamposContactoCliente=0;
		iYPanelCamposContactoCliente++;
	}
	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContactoCliente.gridy = iYPanelCamposContactoCliente;
	this.gridBagConstraintsContactoCliente.gridx = iXPanelCamposContactoCliente++;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContactoCliente.add(this.jPaneldescripcionContactoCliente, this.gridBagConstraintsContactoCliente);



	if(iXPanelCamposContactoCliente % 1==0) {
		iXPanelCamposContactoCliente=0;
		iYPanelCamposContactoCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContactoCliente.gridy = iYPanelCamposOcultosContactoCliente;
	this.gridBagConstraintsContactoCliente.gridx = iXPanelCamposOcultosContactoCliente++;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosContactoCliente.add(this.jPanelid_empresaContactoCliente, this.gridBagConstraintsContactoCliente);



	if(iXPanelCamposOcultosContactoCliente % 1==0) {
		iXPanelCamposOcultosContactoCliente=0;
		iYPanelCamposOcultosContactoCliente++;
	}
	this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContactoCliente.gridy = iYPanelCamposOcultosContactoCliente;
	this.gridBagConstraintsContactoCliente.gridx = iXPanelCamposOcultosContactoCliente++;
	this.gridBagConstraintsContactoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContactoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosContactoCliente.add(this.jPanelid_sucursalContactoCliente, this.gridBagConstraintsContactoCliente);



	if(iXPanelCamposOcultosContactoCliente % 1==0) {
		iXPanelCamposOcultosContactoCliente=0;
		iYPanelCamposOcultosContactoCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesContactoCliente= new GridBagLayout();
		this.jPanelAccionesContactoCliente.setLayout(gridaBagLayoutAccionesContactoCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioContactoCliente= new GridBagLayout();
		this.jPanelAccionesFormularioContactoCliente.setLayout(gridaBagLayoutAccionesFormularioContactoCliente);
		
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsContactoCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioContactoCliente.add(this.jComboBoxTiposAccionesFormularioContactoCliente, this.gridBagConstraintsContactoCliente);

		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsContactoCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioContactoCliente.add(this.jCheckBoxPostAccionNuevoContactoCliente, this.gridBagConstraintsContactoCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.contactoclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsContactoCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioContactoCliente.add(this.jCheckBoxPostAccionSinCerrarContactoCliente, this.gridBagConstraintsContactoCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.contactoclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.contactoclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsContactoCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioContactoCliente.add(this.jCheckBoxPostAccionSinMensajeContactoCliente, this.gridBagConstraintsContactoCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContactoCliente.gridy = 0;
		this.gridBagConstraintsContactoCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesContactoCliente.add(this.jButtonModificarContactoCliente, this.gridBagConstraintsContactoCliente);							

		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContactoCliente.gridy = 0;
		this.gridBagConstraintsContactoCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesContactoCliente.add(this.jButtonEliminarContactoCliente, this.gridBagConstraintsContactoCliente);
		
			
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy = 0;		
		this.gridBagConstraintsContactoCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesContactoCliente.add(this.jButtonActualizarContactoCliente, this.gridBagConstraintsContactoCliente);


		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy = 0;		
		this.gridBagConstraintsContactoCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesContactoCliente.add(this.jButtonGuardarCambiosContactoCliente, this.gridBagConstraintsContactoCliente);	
		
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy = 0;		
		this.gridBagConstraintsContactoCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesContactoCliente.add(this.jButtonCancelarContactoCliente, this.gridBagConstraintsContactoCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutContactoCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutContactoCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.contactoclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();						
			this.gridBagConstraintsContactoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsContactoCliente.gridx = 0;		
			//this.gridBagConstraintsContactoCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsContactoCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsContactoCliente.gridx =0;
		this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsContactoCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosContactoCliente, this.gridBagConstraintsContactoCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ContactoClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleContactoCliente = new ContactoClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Contacto Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Contacto Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Contacto Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ContactoClienteModel contactoclienteModel=new ContactoClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//ContactoClienteModel.ContactoClienteFocusTraversalPolicy contactoclienteFocusTraversalPolicy = contactoclienteModel.new ContactoClienteFocusTraversalPolicy(this);
			
			//contactoclienteFocusTraversalPolicy.setcontactoclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(contactoclienteModel);
			
			
			this.jContentPaneDetalleContactoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleContactoCliente = new GridBagLayout();	
			this.jContentPaneDetalleContactoCliente.setLayout(gridaBagLayoutDetalleContactoCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosContactoCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsContactoCliente = new GridBagConstraints();
				this.gridBagConstraintsContactoCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsContactoCliente.gridx = 0;
					
				
				this.jContentPaneDetalleContactoCliente.add(jTtoolBarDetalleContactoCliente, gridBagConstraintsContactoCliente);								
				
}
			
			this.jScrollPanelDatosEdicionContactoCliente=   new JScrollPane(jContentPaneDetalleContactoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionContactoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionContactoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionContactoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralContactoCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralContactoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralContactoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralContactoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsContactoCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsContactoCliente.gridx = 0;
	        
			this.jContentPaneDetalleContactoCliente.add(jPanelCamposContactoCliente, gridBagConstraintsContactoCliente);
			
			
			
			
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
						&& contactoclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.contactoclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsContactoCliente= new GridBagConstraints();
						this.gridBagConstraintsContactoCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsContactoCliente.gridx = 0;
						this.jContentPaneDetalleContactoCliente.add(this.jTabbedPaneRelacionesContactoCliente, this.gridBagConstraintsContactoCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesContactoCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosContactoCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsContactoCliente = new GridBagConstraints();
					this.gridBagConstraintsContactoCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsContactoCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsContactoCliente.gridx = 0;
					
				
					this.jContentPaneDetalleContactoCliente.add(jPanelCamposOcultosContactoCliente, gridBagConstraintsContactoCliente);
				
					this.jPanelCamposOcultosContactoCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsContactoCliente.gridx = 0;
	        this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleContactoCliente.add(this.jPanelAccionesFormularioContactoCliente, this.gridBagConstraintsContactoCliente);							
			
			
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
	        this.gridBagConstraintsContactoCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsContactoCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleContactoCliente.add(this.jPanelAccionesContactoCliente, this.gridBagConstraintsContactoCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionContactoCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionContactoCliente=   new JScrollPane(this.jPanelCamposContactoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionContactoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionContactoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionContactoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsContactoCliente.gridx = 0;
			this.gridBagConstraintsContactoCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsContactoCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsContactoCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionContactoCliente, this.gridBagConstraintsContactoCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsContactoCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioContactoCliente, this.gridBagConstraintsContactoCliente);			
			
			this.gridBagConstraintsContactoCliente = new GridBagConstraints();
			this.gridBagConstraintsContactoCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsContactoCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesContactoCliente, this.gridBagConstraintsContactoCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContactoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposContactoCliente, this.gridBagConstraintsContactoCliente);
			
			
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContactoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosContactoCliente, this.gridBagConstraintsContactoCliente);
		
			
		this.gridBagConstraintsContactoCliente = new GridBagConstraints();
		this.gridBagConstraintsContactoCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsContactoCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesContactoCliente, this.gridBagConstraintsContactoCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralContactoCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionContactoCliente;
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
